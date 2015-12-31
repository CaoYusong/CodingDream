package cn.com.cys.schema;

import java.math.BigDecimal;
import java.util.Date;

public class CysUser {
    private BigDecimal id;

    private String userCode;

    private String userName;

    private String password;

    private Date passwdexpiredate;

    private Date passwdsetdate;

    private Date insertTimeForHis;

    private Date operateTimeForHis;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getPasswdexpiredate() {
        return passwdexpiredate;
    }

    public void setPasswdexpiredate(Date passwdexpiredate) {
        this.passwdexpiredate = passwdexpiredate;
    }

    public Date getPasswdsetdate() {
        return passwdsetdate;
    }

    public void setPasswdsetdate(Date passwdsetdate) {
        this.passwdsetdate = passwdsetdate;
    }

    public Date getInsertTimeForHis() {
        return insertTimeForHis;
    }

    public void setInsertTimeForHis(Date insertTimeForHis) {
        this.insertTimeForHis = insertTimeForHis;
    }

    public Date getOperateTimeForHis() {
        return operateTimeForHis;
    }

    public void setOperateTimeForHis(Date operateTimeForHis) {
        this.operateTimeForHis = operateTimeForHis;
    }
}