package com.pypay.sofa.aid.mapper;

import java.util.Date;
import java.util.List;

/**
 * 使用数据库系统自带的数据表，对应c##scott.emp表
 * @author PyPay
 */
public class Employee {
    /**
     * 员工号
     * 毫克每
     */
    private Integer empNo;
    /**
     * 员工名
     */
    private String  eName;
    /**
     * 工种
     */
    private String  job;
    /**
     * 上级
     */
    private Integer mgr;
    /**
     * 入职日期
     */
    private Date hireDate;
    /**
     * 工资
     */
    private double  sal;
    /**
     * 奖金
     */
    private double  comm;
    /**
     * 部门号
     */
    private Integer deptNo;

    @Override
    public String toString()
    {
        return String.format("empNo[%d], eName[%s], job[%s], mgr[%d], hireDate[%tF], sal[%.2f], comm[%.2f], deptNo[%d]", empNo, eName, job, mgr, hireDate, sal, comm, deptNo);
    }

    public static void Print(List<Employee> empList)
    {
        int count = empList.size();
        String format = String.format("Employee[%%%dd]: %%s", String.valueOf(count).length());
        String info = String.format("%5s, %7s, %10s, %4s, %10s, %7s, %7s, %s","empNo", "eName","job","mgr","hireDate","sal","comm","deptNo");
        System.out.println(String.format(format, count,info));

        for(int i=0;i<count;i++){
            Employee emp = empList.get(i);
            info = String.format("%5d, %7s, %10s, %4d, %tF, %7.2f, %7.2f, %d", emp.empNo, emp.eName,emp.job,emp.mgr,emp.hireDate,emp.sal,emp.comm,emp.deptNo);
            System.out.println(String.format(format, i,info));
        }
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }
}