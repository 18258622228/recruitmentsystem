package com.igeek.rs.service;

import com.igeek.rs.entity.Companyjob;
import java.util.List;

/**
 * (Companyjob)表服务接口
 *
 * @author makejava
 * @since 2020-07-15 14:54:56
 */
public interface CompanyjobService {

    //通过用户id查询所有申请
    List<Companyjob>showApplication(Integer uid);
    //模糊查询
    List<Companyjob> searchAll(String query);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Companyjob queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Companyjob> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param companyjob 实例对象
     * @return 实例对象
     */
    Companyjob insert(Companyjob companyjob);

    /**
     * 修改数据
     *
     * @param companyjob 实例对象
     * @return 实例对象
     */
    Companyjob update(Companyjob companyjob);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


}