package com.multicampus.springex.controller;

import com.multicampus.springex.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {
    @GetMapping("/hello") //get방식으로 들어오는 요청(Request)를 처리하기 위한 애너테이션
    public void hello(){
        log.info("hello~");
    }

    @GetMapping("/ex1")
    public void ex1(String name, int age){
        log.info("ex1.....");
        log.info("name : "+ name);
        log.info("age : "+ age);
    }

    @GetMapping("/ex2")
    public void ex2(@RequestParam(name="name", defaultValue = "CCC") String name,
                    @RequestParam(name = "age", defaultValue="20")int age){
        log.info("ex2.....");
        log.info("name : "+ name);
        log.info("age : "+ age);
    }

    @GetMapping("/ex3")
    public void  ex3(LocalDate dueDate){
        log.info("ex3.....");
        log.info(dueDate);
    }

}
