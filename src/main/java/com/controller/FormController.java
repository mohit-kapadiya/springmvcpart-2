package com.controller;

import com.entities.UserRegistration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController {
        @RequestMapping(path = "/form")
        public String form(){
            return "Form";
        }

        @RequestMapping(path="/handle")
        public String handleForm(@ModelAttribute("userRegistration")UserRegistration userRegistration){
            System.out.println(userRegistration);
            System.out.println(userRegistration.getAddress());
            return "Success";
        }
        @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
        @ExceptionHandler(value = Exception.class)
        public String exceptionHandler(){
            return "ErrorPage";
        }

}
