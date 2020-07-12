package com.pypay.sofa.aid.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 映射Sql，定义接口
 *
 * @author PyPay
 */
public interface DataMapper {

    /**
     * 查询。@Param对应参数属性注解，There is no getter for property named 'xx' in 'class java.lang.Integer
     * @param empNo 雇员号
     * @return list
     */
    List<Employee> testQuery(@Param("empNo") Integer empNo);

    /**
     * 插入
     * @param employee 雇员
     *
     */
    void testInsert(Employee employee);

    /**
     * 更新
     *
     * @param empNo 雇员号
     * @param comm  奖金
     */
    void testUpdate(@Param("empNo") Integer empNo, @Param("comm") double comm);

    /**
     * 删除
     *
     * @param empNo 雇员编号
     */
    void testDelete(Integer empNo);

    /**
     * 批量插入
     *
     * @param results 雇员集合
     */
    void testMultiInsert(List<Employee> results);

    /**
     * 批量查询
     *
     * @param deptNoArr 雇员集合
     * @return list
     */
    List<Employee> testMultiQuery(int[] deptNoArr);

    /**
     * 批量删除
     *
     * @param empNoList 雇员编号集合
     */
    void testMultiDelete(List<Integer> empNoList);
}
