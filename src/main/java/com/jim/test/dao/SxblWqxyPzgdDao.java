package com.jim.test.dao;

import com.jim.test.domain.SxblWqxyPzgd;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by jim on 2018/12/26.
 */
public interface SxblWqxyPzgdDao {
    @Insert("insert into sxbl_wqxy_pzgd(wjid,djxh,nsrsbh,nsrmc,sfxysh,gljgdm,lrrq,xgrq) values(#{wjid},#{djxh},#{nsrsbh},#{nsrmc},#{sfxysh},#{gljgdm},#{lrrq,jdbcType=TIMESTAMP},#{xgrq,jdbcType=TIMESTAMP})")
    public int insertpzgd(SxblWqxyPzgd sxblWqxyPzgd);
    @Select("select wjid,djxh,nsrsbh,nsrmc,sfxysh,gljgdm,lrrq,xgrq  from sxbl_wqxy_pzgd where sfxysh=#{sfxysh}")
    public List<SxblWqxyPzgd> querypzgd(String sfxysh);
}
