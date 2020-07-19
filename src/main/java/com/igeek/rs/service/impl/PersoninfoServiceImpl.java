package com.igeek.rs.service.impl;

import com.igeek.rs.entity.Companyjob;
import com.igeek.rs.entity.Personinfo;
import com.igeek.rs.dao.PersoninfoDao;
import com.igeek.rs.service.PersoninfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Personinfo)表服务实现类
 *
 * @author makejava
 * @since 2020-07-15 14:55:55
 */
@Service("personinfoService")
public class PersoninfoServiceImpl implements PersoninfoService {
    @Resource
    private PersoninfoDao personinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Personinfo queryById(Integer id) {
        return this.personinfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Personinfo> queryAllByLimit(int offset, int limit) {
        return this.personinfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param personinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(Personinfo personinfo) {
        int result = this.personinfoDao.insert(personinfo);
        return result;
    }

    /**
     * 修改数据
     *
     * @param personinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Personinfo update(Personinfo personinfo) {
        this.personinfoDao.update(personinfo);
        return this.queryById(personinfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.personinfoDao.deleteById(id) > 0;
    }

    //通过实体作为筛选条件查询
    @Override
    public List<Personinfo> queryAll(Personinfo personinfo) {
        return personinfoDao.queryAll(personinfo);
    }

}