package com.codeup.codeupspringblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class PostController {

    @PostMapping("/posts/create")
    @ResponseBody
    public String add(@PathVariable String num1, @PathVariable String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int total = n1+n2;
        return  n1+" + " + n2 +" = " + total;
    }


}
