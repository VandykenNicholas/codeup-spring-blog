package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String add(@PathVariable String num1,@PathVariable String num2) {

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int total = n1+n2;
        return  n1+" + " + n2 +" = " + total;
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public String subtract(@PathVariable String num1,@PathVariable String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int total = n1-n2;
        return  n1+" - " + n2 +" = " + total;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String multiply(@PathVariable String num1,@PathVariable String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int total = n1-n2;
        return  n1+" * " + n2 +" = " + total;
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public String divide(@PathVariable String num1,@PathVariable String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int total = n1/n2;
        return  n1+" / " + n2 +" = " + total;
    }




}
