package com.www.hellospring.demo.controller;

import com.www.hellospring.demo.bean.Employee;
import com.www.hellospring.demo.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmpController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String getEmpList(ModelMap map) {
        // 获取员工列表
        Collection<Employee> all = employeeDao.getAll();
        // Model 是用来给请求域中放数据的 将结果放入请求域中
        map.addAttribute("emps",all);

        return "emp/list";
    }
}
