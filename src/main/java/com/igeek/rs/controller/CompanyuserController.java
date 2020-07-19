package com.igeek.rs.controller;

import com.igeek.rs.entity.Companyuser;
import com.igeek.rs.entity.User;
import com.igeek.rs.service.CompanyuserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;

/**
 * (Companyuser)表控制层
 *
 * @author makejava
 * @since 2020-07-15 14:54:12
 */
@Controller
@RequestMapping("companyuser")
public class CompanyuserController {
    /**
     * 服务对象
     */
    @Resource
    private CompanyuserService companyuserService;

    //用户登录
    @PostMapping("/login")
    public String login(Companyuser user, HttpSession session, Model model){
        System.out.println(user);
        Companyuser c = companyuserService.login(user);
        String username=c.getCompanyname();
        if (c != null) {
            session.setAttribute("username", username);
            session.setAttribute("loginTime", System.currentTimeMillis());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(sdf.format(System.currentTimeMillis()));
            return "forward:toCompanyHome";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录");
        return "error";
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Companyuser selectOne(Integer id) {
        return this.companyuserService.queryById(id);
    }

    @RequestMapping("/toCompanyHome")
    public String toCompanyHome(){
        return "/home/companyHome";
    }
}