package com.igeek.rs.controller;

import com.igeek.rs.entity.Companyjob;
import com.igeek.rs.service.CompanyjobService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * (Companyjob)表控制层
 *
 * @author makejava
 * @since 2020-07-15 14:54:56
 */
@Controller
@RequestMapping("companyjob")
public class CompanyjobController {
    /**
     * 服务对象
     */
    @Resource
    private CompanyjobService companyjobService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Companyjob selectOne(Integer id) {
        return this.companyjobService.queryById(id);
    }


    //查看该用户所有的申请
    @GetMapping("/show")
    @ResponseBody
    public  List<Companyjob> showApplication(Integer uid){
        if(uid ==null){
            return null;
        }
        List<Companyjob> list = companyjobService.showApplication(uid);
        return  list;
    }


    //点击查询所有
    @GetMapping("/searchAll")
    @ResponseBody
    public List<Companyjob> searchAll(String query){
        List<Companyjob> searchAll = companyjobService.searchAll(query);
        for (Companyjob companyjob : searchAll) {
            System.out.println(companyjob);
        }
        return searchAll;
    }

}