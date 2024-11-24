package com.app.login.controller;

import com.app.login.modal.UserModal;
import com.app.login.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserRepository us;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/userRegister")
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/userRegister", method = RequestMethod.POST)
    public String userRegister(@Valid UserModal UserRepository, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/userRegister";
        }

        us.save(UserRepository);

        return"redirect:/login";
    }
}
