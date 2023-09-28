package com.example.eResume;

import com.example.eResume.DAO.StudentRepo;
import com.example.eResume.DTO.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Optional;

@Controller
public class AppController {
    @Autowired
    StudentRepo repo;

    @RequestMapping("signup")
    public String register(){
        return "register.jsp";
    }
    @RequestMapping("signin")
    public String signin(){
        return "login.jsp";
    }

    @RequestMapping("register")
    public ModelAndView register(Student stu, @RequestParam("cpassword") String pass){
        ModelAndView mv = new ModelAndView();
        if(pass.equals(stu.getPassword())){
            repo.save(stu);
            mv.addObject("obj",stu);
            String message = "Register Success";
            mv.addObject("m", message);
            mv.setViewName("register.jsp");
            System.out.println("user added successfully!");
            return mv;
        }
        else {
            System.out.println("paasword not matched");
            String message = "Wrong password";
            mv.addObject("m", message);
            mv.setViewName("register.jsp");
        }
        return mv;
    }
    @RequestMapping("login")
    public ModelAndView login(@RequestParam("mail") String mail, @RequestParam("pass") String pass){
        ModelAndView mv = new ModelAndView();
        Student stu = repo.findByEmail(mail);
        if(stu != null){
            if(pass.equals(stu.getPassword())){
                String message = "Login Successfull";
                System.out.println(message);
                mv.addObject("m", message);
            }
            else{
                String message =  "wrong username or password";
                System.out.println(message);
                mv.addObject("m", message);
            }
        } else{
            String message =  "User Not Found!";
            System.out.println(message);
            mv.addObject("m", message);
        }
        	mv.setViewName("login.jsp");
            return mv;
    }
}
