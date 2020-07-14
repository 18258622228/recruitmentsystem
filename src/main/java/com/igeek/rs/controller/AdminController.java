package com.igeek.rs.controller;

import com.igeek.rs.entity.Admin;
import com.igeek.rs.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * (Admin)表控制层
 *
 * @author makejava
 * @since 2020-07-13 15:07:05
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    @PostMapping("/login")
    @ResponseBody
    public String login(Admin admin,
                        HttpSession session,
                        Model model){
        System.out.println(admin);
        String username=admin.getUsername();
        String password=admin.getPassword();
        Admin ad = adminService.login(admin);
        if (ad != null) {
            session.setAttribute("username", username);
            session.setAttribute("loginTime", System.currentTimeMillis());
            System.out.println(System.currentTimeMillis());
            return "../toHome";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录");
        return "error";
    }

    @RequestMapping("/index")
    public String show(){
        return "login";
    }
    @RequestMapping("/toAdminHome")
    public String toAdminHome(){
        return "adminHome";
    }
    @RequestMapping("/toUserHome")
    public String toUserHome(){
        return "userHome";
    }

}