package com.igeek.rs.service;

import com.igeek.rs.entity.Companyuser;
import java.util.List;

/**
 * (Companyuser)表服务接口
 *
 * @author makejava
 * @since 2020-07-15 14:54:12
 */
public interface CompanyuserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Companyuser queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Companyuser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param companyuser 实例对象
     * @return 实例对象
     */
    Companyuser insert(Companyuser companyuser);

    /**
     * 修改数据
     *
     * @param companyuser 实例对象
     * @return 实例对象
     */
    Companyuser update(Companyuser companyuser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}