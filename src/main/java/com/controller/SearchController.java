package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
    @RequestMapping("/search")
    public String search(){
        return "SearchView";
    }

    @RequestMapping(value = "/redirect",method = RequestMethod.POST)
    public RedirectView redirect(@RequestParam("queryBox") String query){
        RedirectView redirectView=new RedirectView();
        String url="https://www.google.com/search?q="; //using query parameter
        redirectView.setUrl(url+query);
        return redirectView;
    }
}
