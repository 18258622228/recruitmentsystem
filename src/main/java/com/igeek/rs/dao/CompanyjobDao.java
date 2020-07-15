package com.igeek.rs.dao;

import com.igeek.rs.entity.Companyjob;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Companyjob)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-15 14:54:56
 */
public interface CompanyjobDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Companyjob queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Companyjob> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param companyjob 实例对象
     * @return 对象列表
     */
    List<Companyjob> queryAll(Companyjob companyjob);

    /**
     * 新增数据
     *
     * @param companyjob 实例对象
     * @return 影响行数
     */
    int insert(Companyjob companyjob);

    /**
     * 修改数据
     *
     * @param companyjob 实例对象
     * @return 影响行数
     */
    int update(Companyjob companyjob);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}