package com.todo.Controller;

/**
 * Created by sudheerds on 15/12/17.
 */

import org.springframework.web.bind.annotation.RestController;
        import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Todo App!";
    }

}