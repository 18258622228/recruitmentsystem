package com.igeek.rs.controller;

import com.igeek.rs.entity.Companyjob;
import com.igeek.rs.entity.Personinfo;
import com.igeek.rs.service.CompanyjobService;
import com.igeek.rs.service.PersoninfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * (Personinfo)表控制层
 *
 * @author makejava
 * @since 2020-07-15 14:55:55
 */
@Controller
@RequestMapping("personinfo")
public class PersoninfoController {
    /**
     * 服务对象
     */
    @Resource
    private PersoninfoService personinfoService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Personinfo selectOne(Integer id) {
        return this.personinfoService.queryById(id);
    }

    //添加申请招聘信息到信息表
    @PostMapping("/addPers")
    @ResponseBody
    public String addPersoninfo(Integer jid,Integer cid,Integer uid){
        Personinfo per=new Personinfo();
        per.setJobid(jid);
        per.setCompanyid(cid);
        per.setUserid(uid);
        System.out.println(per);
        Personinfo personinfo = personinfoService.queryById(jid);
        System.out.println(personinfo);
        if(personinfo == null ){

            Integer result = personinfoService.insert(per);
            if(result>0){
                return "申请成功";
            }else{
                return "申请失败";
            }
        }else{
            return "申请一次就够了";
        }
    }

    //点击删除
    @GetMapping("/deleteOne")
    @ResponseBody
    public String deleteOne(Integer jid,Integer uid){
        //通过jid和uid查询对应的申请表id
       Personinfo per=new Personinfo();
       per.setJobid(jid);
       per.setUserid(uid);
       List<Personinfo> personinfos = personinfoService.queryAll(per);
        for (int i=0;i<personinfos.size();i++) {
            System.out.println(personinfos.get(i));
            //将查询出的per表id 进行删除操作
            boolean b = personinfoService.deleteById(personinfos.get(i).getId());
            if(b){
                return "删除成功";
            }else{
                return "删除失败";
            }
        }
        return "删除错误";
    }
}