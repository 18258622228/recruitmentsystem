package com.igeek.rs.service.impl;

import com.igeek.rs.entity.Companyjob;
import com.igeek.rs.dao.CompanyjobDao;
import com.igeek.rs.service.CompanyjobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Companyjob)表服务实现类
 *
 * @author makejava
 * @since 2020-07-15 14:54:56
 */
@Service
public class CompanyjobServiceImpl implements CompanyjobService {
    @Resource
    private CompanyjobDao companyjobDao;

    //通过uid查询所有申请
    @Override
    public List<Companyjob> showApplication(Integer uid) {
        return companyjobDao.showApplication(uid);
    }

    //模糊查询
    @Override
    public List<Companyjob> searchAll(String query) {
        if(query==null){
            query="";
        }
        return companyjobDao.searchAll(query);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Companyjob queryById(Integer id) {
        return this.companyjobDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Companyjob> queryAllByLimit(int offset, int limit) {
        return this.companyjobDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param companyjob 实例对象
     * @return 实例对象
     */
    @Override
    public Companyjob insert(Companyjob companyjob) {
        this.companyjobDao.insert(companyjob);
        return companyjob;
    }

    /**
     * 修改数据
     *
     * @param companyjob 实例对象
     * @return 实例对象
     */
    @Override
    public Companyjob update(Companyjob companyjob) {
        this.companyjobDao.update(companyjob);
        return this.queryById(companyjob.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.companyjobDao.deleteById(id) > 0;
    }


}