package com.jim.test.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by jim on 2018/12/26.
 */
/*@Builder
@Data*/
@Table( name="sxbl_wqxy_pzgd" )
@Entity
public class SxblWqxyPzgd {
    @Id
    private String wjid;
    @Column
    private String djxh ;
    @Column
    private String nsrsbh ;
    @Column
    private String nsrmc ;
    @Column
    private String sfxysh ;
    @Column
    private String gljgdm;
    @Column
    private Date lrrq;
    @Column
    private Date xgrq ;

    public String getWjid() {
        return wjid;
    }

    public void setWjid(String wjid) {
        this.wjid = wjid;
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getSfxysh() {
        return sfxysh;
    }

    public void setSfxysh(String sfxysh) {
        this.sfxysh = sfxysh;
    }

    public String getGljgdm() {
        return gljgdm;
    }

    public void setGljgdm(String gljgdm) {
        this.gljgdm = gljgdm;
    }

    public Date getLrrq() {
        return lrrq;
    }

    public void setLrrq(Date lrrq) {
        this.lrrq = lrrq;
    }

    public Date getXgrq() {
        return xgrq;
    }

    public void setXgrq(Date xgrq) {
        this.xgrq = xgrq;
    }

    @Override
    public String toString() {
        return "SxblWqxyPzgd{" +
                "wjid='" + wjid + '\'' +
                ", djxh='" + djxh + '\'' +
                ", nsrsbh='" + nsrsbh + '\'' +
                ", nsrmc='" + nsrmc + '\'' +
                ", sfxysh='" + sfxysh + '\'' +
                ", gljgdm='" + gljgdm + '\'' +
                ", lrrq=" + lrrq +
                ", xgrq=" + xgrq +
                '}';
    }
}
