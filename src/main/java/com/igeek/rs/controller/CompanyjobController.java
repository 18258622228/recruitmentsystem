package com.igeek.rs.controller;

import com.igeek.rs.entity.Companyjob;
import com.igeek.rs.service.CompanyjobService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Companyjob)表控制层
 *
 * @author makejava
 * @since 2020-07-15 14:54:56
 */
@RestController
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

}