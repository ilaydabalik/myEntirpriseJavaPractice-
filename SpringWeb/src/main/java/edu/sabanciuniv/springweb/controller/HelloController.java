package edu.sabanciuniv.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    // Uygulamamızın dışarıya açılan servislerini, arayüzlerini controller'a yazıyoruz.
    // İlk servisimi yazıyorum


    //Services & End-point & API
    @RequestMapping("/hello")
    public String sayHello(){
        return "İlayda";
    }

    //Return içerisindeki Stringi request istediğini içerisindeki bir parametre ile gönderme
    //http://localhost:8080/hello2?name=Ilayda
    @RequestMapping("/hello2")
    public String sayHello2(@RequestParam String name){
        return "Hello " + name;

    }

    //Birden fazla parametre göndermek istersek
    //http://localhost:8080/hello2?name=Ilayda&age=29
    @RequestMapping("/hello3")
    public String sayHello3(@RequestParam String name,@RequestParam int age ){
        return "Hello " + name +  ", your age : " + age;
    }


}
