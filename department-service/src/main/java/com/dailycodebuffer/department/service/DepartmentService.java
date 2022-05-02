package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
       System.out.println("Inside saveDepartment of DepartmentService" + " " + department);
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        System.out.println("Inside findDepartmentById of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }

	public List<Department> findAllDepartments() {
		System.out.println("Inside findAllDepartments of DepartmentService");
		return departmentRepository.findAll();
	}
}