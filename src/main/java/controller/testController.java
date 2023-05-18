package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/test1")
    public String test1(HttpServletRequest req) {
        String d1 = req.getParameter("data1");
        String d2 = req.getParameter("data2");

        System.out.println("data1: " + d1);
        System.out.println("data2: " + d2);
        return "index";
    }
}
