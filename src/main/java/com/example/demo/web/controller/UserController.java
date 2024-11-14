package com.example.demo.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {


    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN') or principal.username == 'admin'")
    public String getAdminPage() {
        return "Welcome ADMIN";
    }

    @GetMapping("/employee")
    @PreAuthorize("hasRole('EMPLOYEE')")
    public String getEmployeePage() {
        return "Welcome EMPLOYEE";
    }
}
