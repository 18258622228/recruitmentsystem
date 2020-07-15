package com.igeek.rs.dao;

import com.igeek.rs.entity.Companyuser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Companyuser)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-15 14:54:12
 */
public interface CompanyuserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Companyuser queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Companyuser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param companyuser 实例对象
     * @return 对象列表
     */
    List<Companyuser> queryAll(Companyuser companyuser);

    /**
     * 新增数据
     *
     * @param companyuser 实例对象
     * @return 影响行数
     */
    int insert(Companyuser companyuser);

    /**
     * 修改数据
     *
     * @param companyuser 实例对象
     * @return 影响行数
     */
    int update(Companyuser companyuser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}