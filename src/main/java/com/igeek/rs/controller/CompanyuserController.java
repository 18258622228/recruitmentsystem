package com.igeek.rs.controller;

import com.igeek.rs.entity.Companyuser;
import com.igeek.rs.service.CompanyuserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Companyuser)表控制层
 *
 * @author makejava
 * @since 2020-07-15 14:54:12
 */
@RestController
@RequestMapping("companyuser")
public class CompanyuserController {
    /**
     * 服务对象
     */
    @Resource
    private CompanyuserService companyuserService;

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

}