package com.springTest.LabWorkSpring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String main(@RequestParam(name="login",required = false,defaultValue = "user@gmail.com") String login,
                       @RequestParam(name = "password",required = false,defaultValue = "user123") String password,
                       Model model)
    {
        model.addAttribute("login",login);
        model.addAttribute("password",password);

        return "main";
    }
    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }
    @GetMapping("/contacts")
    public String contacts(Model model)
    {
        return "contacts";
    }


}
