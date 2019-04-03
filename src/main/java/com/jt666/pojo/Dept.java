package com.jt666.pojo;

/**
 * 创建人：陈烙
 * 类描述：测试
 * 时间：2019/4/3  11:17
 **/
public class Dept {
    private Long deptno;
    private String dname;
    public Long getDeptno() {
        return deptno;
    }
    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }
    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                '}';
    }
}

