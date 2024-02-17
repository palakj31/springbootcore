package com.itvedant.springbootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itvedant.student.Student;

@Controller
public class FirstController {
    
    @Autowired
    Student s;

    @Autowired
    Employee e;

    @RequestMapping("/") 
    public String home(){
        System.out.println("Home Method Called");
        System.out.println("Implementing Dependency Injection");
        s.print();
        e.getSalary();
        return "homepage.html";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("about method called");
        return "aboutus.html";
    }

    public String contactUs(){
        return null;
    }
}
