package edu.sabanciuniv.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    //http://localhost:8080/hello3?name=Ilayda&age=29    --> Request Parameters
    @RequestMapping("/hello3")
    public String sayHello3(@RequestParam String name,@RequestParam int age ){
        return "Hello " + name +  ", your age : " + age;
    }

    //Bir variable'ı path üzerinden almak istersem
    //http://localhost:8080/hello4/30/Istanbul?name=Ilayda    --> Path Variables
    @RequestMapping("/hello4/{age}/{city}")
    public String sayHello4(@RequestParam(required = false, defaultValue = "Mustafa") String name,
                            @PathVariable int age , @PathVariable String city){
        return "Hello " + name + " you live in : " + city + ", your age : " + age;
    }

    // Request mapping'te method'ta tanımlayabiliyoruz
    @RequestMapping(value = "/hello5/{age}/{city}", method = RequestMethod.GET)
    public String sayHello5(@RequestParam(required = false, defaultValue = "Mustafa") String name,
                            @PathVariable int age , @PathVariable String city){
        return "Hello " + name + " you live in : " + city + ", your age : " + age;
    }

    //JSON olarak görüntülemek istediğimde
    //StringResponse sınıfımı oluşturdum
    //http://localhost:8080/hello6/30/Istanbul?name=Ilayda
    @RequestMapping(value = "/hello6/{age}/{city}", method = RequestMethod.GET)
    public StringResponse sayHello6(@RequestParam(required = false, defaultValue = "Mustafa") String name,
                            @PathVariable int age , @PathVariable String city){
        return new StringResponse("Hello " + name + " you live in : " + city + ", your age : " + age) ;
    }

    // http://localhost:8080/calculate/sum?num1=10&num2=20
    // output --> 10 + 20 = 30
    @RequestMapping(value = "/calculate/{operation}", method = RequestMethod.GET)
    public String calculate(@PathVariable String operation,
                            @RequestParam(required = false) int num1,
                            @RequestParam(required = false) int num2) {

        if(operation.equals("sum")) {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        } else if(operation.equals("subtract")) {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }else if(operation.equals("multiple")) {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }else if(operation.equals("divide")) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
        return "Something went wrong! ";
    }


}
