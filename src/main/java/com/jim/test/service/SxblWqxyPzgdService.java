package com.jim.test.service;

import com.jim.test.dao.SxblWqxyPzgdDao;
import com.jim.test.domain.SxblWqxyPzgd;
import com.jim.test.jpa.SxblWqxyPzgdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by jim on 2018/12/26.
 */
@Service
public class SxblWqxyPzgdService {
    @Autowired
    private SxblWqxyPzgdDao sxblWqxyPzgdDao;
    @Autowired
    private SxblWqxyPzgdRepository sxblWqxyPzgdRepository;

    public int  insertPzgd(SxblWqxyPzgd sxblWqxyPzgd ){
        String wjid = sxblWqxyPzgd.getWjid();
        String nsrmc = sxblWqxyPzgd.getNsrmc();
        String nsrsbh = sxblWqxyPzgd.getNsrsbh();
        String djxh = sxblWqxyPzgd.getDjxh();
        String sfxysh = sxblWqxyPzgd.getSfxysh();

        return sxblWqxyPzgdDao.insertpzgd(sxblWqxyPzgd);
    }
    public List<SxblWqxyPzgd> query(String sfxysh){
        if (!StringUtils.isEmpty(sfxysh)){
           return sxblWqxyPzgdDao.querypzgd(sfxysh);
        }
        return null;
    }

    public int insertSxblWqxyPzgd(SxblWqxyPzgd sxblWqxyPzgd){
        SxblWqxyPzgd save = sxblWqxyPzgdRepository.save(sxblWqxyPzgd);
        if(save!=null){
            return 1;
        }
        return 0;

    }
}
