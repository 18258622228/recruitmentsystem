package com.igeek.rs.dao;

import com.igeek.rs.entity.Personinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Personinfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-15 14:55:55
 */
public interface PersoninfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Personinfo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Personinfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param personinfo 实例对象
     * @return 对象列表
     */
    List<Personinfo> queryAll(Personinfo personinfo);

    /**
     * 新增数据
     *
     * @param personinfo 实例对象
     * @return 影响行数
     */
    int insert(Personinfo personinfo);

    /**
     * 修改数据
     *
     * @param personinfo 实例对象
     * @return 影响行数
     */
    int update(Personinfo personinfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}