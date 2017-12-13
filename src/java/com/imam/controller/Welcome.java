/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imam.controller;

import com.imam.model.RegisterFormBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/Welcome")
public class Welcome {
    
    @RequestMapping("")
    public String myPage(Model model){
        model.addAttribute("message", "Now without xml config");
        
        return "page";
    }
    
    @RequestMapping("/register") 
    public String registerForm(Model model) {
        RegisterFormBean registerBean = new RegisterFormBean();
        registerBean.setLastName("Smith");
        model.addAttribute("registerBean", registerBean);
        return "registration";
    }
    
    @RequestMapping(value="/save") 
    public String saveRegistration(@ModelAttribute("registerBean") RegisterFormBean registerBean, 
            Model model) {
        System.out.println("User Firtname: " + registerBean.getFirstName());
        model.addAttribute("data", registerBean);
        return "successregistration";
    }   
}
