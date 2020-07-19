package com.igeek.rs.controller;

import com.igeek.rs.entity.Admin;
import com.igeek.rs.entity.User;
import com.igeek.rs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-07-15 14:50:26
 */
@Controller
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;


    //用户登录
    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model){
        User u = userService.login(user);
        System.out.println(u);
        if (u != null) {
            session.setAttribute("username", u.getUsername());
            session.setAttribute("userId", u.getId());
            session.setAttribute("loginTime", System.currentTimeMillis());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(sdf.format(System.currentTimeMillis()));
            //删除forward就无法访问的原因是：模板会自动拼接.html
            return "forward:toUserHome";
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
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }


    @RequestMapping("/toUserHome")
    public String toUserHome(){
        return "/home/userHome";
    }
    //查看所有招聘信息
    @RequestMapping("/toUserList")
    public String toHome1(){
        return "/list/UserList";
    }
    //查看所有申请
    @RequestMapping("/toUserShow")
    public String toHome2(){
        return "/list/UserShow";
    }
}