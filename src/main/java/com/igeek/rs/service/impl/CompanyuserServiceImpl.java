package com.igeek.rs.service.impl;

import com.igeek.rs.entity.Companyuser;
import com.igeek.rs.dao.CompanyuserDao;
import com.igeek.rs.service.CompanyuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.security.auth.login.Configuration;
import java.util.List;

/**
 * (Companyuser)表服务实现类
 *
 * @author makejava
 * @since 2020-07-15 14:54:12
 */
@Service("companyuserService")
public class CompanyuserServiceImpl implements CompanyuserService {
    @Resource
    private CompanyuserDao companyuserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Companyuser queryById(Integer id) {
        return this.companyuserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    public List<Companyuser> queryAllByLimit(int offset, int limit) {
        return this.companyuserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param companyuser 实例对象
     * @return 实例对象
     */
    public Companyuser insert(Companyuser companyuser) {
        this.companyuserDao.insert(companyuser);
        return companyuser;
    }

    /**
     * 修改数据
     *
     * @param companyuser 实例对象
     * @return 实例对象
     */
    public Companyuser update(Companyuser companyuser) {
        this.companyuserDao.update(companyuser);
        return this.queryById(companyuser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer id) {
        return this.companyuserDao.deleteById(id) > 0;
    }

    public Companyuser login(Companyuser user) {
        Companyuser c = companyuserDao.findNameAndPwd(user);
        return c;
    }
}