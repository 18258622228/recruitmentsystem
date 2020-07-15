package com.igeek.rs.controller;

import com.igeek.rs.entity.Personinfo;
import com.igeek.rs.service.PersoninfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Personinfo)表控制层
 *
 * @author makejava
 * @since 2020-07-15 14:55:55
 */
@RestController
@RequestMapping("personinfo")
public class PersoninfoController {
    /**
     * 服务对象
     */
    @Resource
    private PersoninfoService personinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Personinfo selectOne(Integer id) {
        return this.personinfoService.queryById(id);
    }

}