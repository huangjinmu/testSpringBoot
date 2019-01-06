package com.jim.test1.po;

/**
 * Created by jim on 2018/12/26.
 */
public class yhxx {

   private String yhid;
    private String yhm ;
    private String mm ;
    private String sjhm ;
    private String lrrq ;
    private String xgrq ;

    public String getYhid() {
        return yhid;
    }

    public void setYhid(String yhid) {
        this.yhid = yhid;
    }

    public String getYhm() {
        return yhm;
    }

    public void setYhm(String yhm) {
        this.yhm = yhm;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getLrrq() {
        return lrrq;
    }

    public void setLrrq(String lrrq) {
        this.lrrq = lrrq;
    }

    public String getXgrq() {
        return xgrq;
    }

    public void setXgrq(String xgrq) {
        this.xgrq = xgrq;
    }

    @Override
    public String toString() {
        return "yhxx{" +
                "yhid='" + yhid + '\'' +
                ", yhm='" + yhm + '\'' +
                ", mm='" + mm + '\'' +
                ", sjhm='" + sjhm + '\'' +
                ", lrrq='" + lrrq + '\'' +
                ", xgrq='" + xgrq + '\'' +
                '}';
    }
}
