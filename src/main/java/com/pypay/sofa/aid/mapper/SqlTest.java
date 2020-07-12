package com.pypay.sofa.aid.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author PyPay
 */

@Component
public class SqlTest {

    @Autowired(required = false)
    DataMapper dataMapper;

    /**
     * 自动载入，程序启动时候就运行啦。。。。
     */
    @Autowired
    public void run() {
        testQuery();
//        testUpdate();
//        testQuery();
//
//        testMultiQuery();
//
//
//        testMultiQuery();
//
//        testDelete();
//        testQuery();
//
//        testMultiDelete();
//        testMultiQuery();

        //testInsert();
        //testQuery();
        //testMultiInsert();

    }

    private void testQuery() {
        System.out.println("test_query...");
        Integer empNo =7788;
        List<Employee> empList =dataMapper.testQuery(empNo);
        Employee.Print(empList);

    }

    private void testInsert() {
        System.out.println("test_insert...");
        Employee emp = new Employee();
        emp.setEmpNo(7979);
        emp.seteName("eName");
        emp.setJob("job");
        emp.setMgr(7566);
        emp.setHireDate(new Date());
        emp.setSal(8799.76);
        emp.setSal(235.65);
        emp.setDeptNo(20);
        dataMapper.testInsert(emp);
    }

    private void testUpdate() {
        System.out.println("test_update...");
        dataMapper.testUpdate(7979, 555.25);
    }

    private void testDelete() {
        System.out.println("test_delete...");
        dataMapper.testDelete(7979);
    }

    private void testMultiInsert() {
        System.out.println("test_multi_insert...");
        Employee emp1 = new Employee();
        emp1.setEmpNo(7980);
        emp1.seteName("eName1");
        emp1.setJob("job1");
        emp1.setMgr(7566);
        emp1.setHireDate(new Date());
        emp1.setSal(8799.76);
        emp1.setComm(235.65);
        emp1.setDeptNo(30);

        Employee emp2 = new Employee();
        emp2.setEmpNo(7981);
        emp2.seteName("eName2");
        emp2.setJob("job2");
        emp2.setMgr(7566);
        emp2.setHireDate(new Date());
        emp2.setSal(8799.76);
        emp2.setComm(235.65);
        emp2.setDeptNo(30);

        Employee emp3 = new Employee();
        emp3.setEmpNo(7979);
        emp3.seteName("eName");
        emp3.setJob("job2");
        emp3.setMgr(7566);
        emp3.setHireDate(new Date());
        emp3.setSal(8799.76);
        emp3.setComm(235.65);
        emp3.setDeptNo(20);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        dataMapper.testMultiInsert(empList);
    }

    private void testMultiQuery() {
        System.out.println("test_multi_query...");
        int[] deptNoArr = {20, 30};
        List<Employee> empList = dataMapper.testMultiQuery(deptNoArr);
        Employee.Print(empList);
    }

    private void testMultiDelete() {
        System.out.println("test_multi_delete...");
        List<Integer> empNoList = new ArrayList<>();
        empNoList.add(7980);
        empNoList.add(7981);
        dataMapper.testMultiDelete(empNoList);
    }

}