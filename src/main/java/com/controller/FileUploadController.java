package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


@Controller
public class FileUploadController {
    @RequestMapping("/fileupload")
    public String fileForm(){
        return "FileUpload";
    }
    @RequestMapping(value = "/uploadFile" ,method = RequestMethod.POST )
    public String fileUpload(@RequestParam("profile") CommonsMultipartFile file){
       System.out.println("file uploaded handler");
       System.out.println(file.getOriginalFilename());
        return "FileSuccess";
    }
}
