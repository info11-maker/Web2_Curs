package com.example.ex_http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
public class HttpController {

    @GetMapping("m1")
    public String method1(HttpServletRequest httpServletRequest) {
        return "metoda afișeaza URL-ul aplicației relativ la adresa serverului" + httpServletRequest.getServletPath();
    }
    @GetMapping("m2")
    public String method2(HttpServletRequest httpServletRequest) {
        return "metoda afiseaza URL-ul metodei mapate relativ la adresa aplicației:" + httpServletRequest.getRequestURI();
    }
    @GetMapping("m3")
    public String method3(HttpServletRequest httpServletRequest) {
        return "metoda afișeaze URL-ul absolut al cererii HTTP:" + httpServletRequest.getRequestURL();
    }
    @GetMapping("m4")
    public String method4 (HttpServletRequest httpServletRequest) {
        return "metoda afișeaza partea adresei din cerere fără protocol și șirul de perechi nume=valoare:" + httpServletRequest.getContextPath();
    }
    @GetMapping("m5")
    public String method5(HttpServletRequest httpServletRequest) {
        return "metoda afișeaza șirul de perechi nume=valoare a cererii HTTP: " + httpServletRequest.getQueryString();
    }
}
