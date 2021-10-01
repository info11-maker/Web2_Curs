package com.example.ex_http;

import org.springframework.web.bind.annotation.*;
import com.example.ex_http.operation.Add;
import com.example.ex_http.operation.Concat;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "controller3")
public class OpController {
    @PostMapping("/add")
    public Integer add(@RequestBody Add num) {
        return num.x + num.y;
    }

    @PostMapping("/concat")
    public String concat(@RequestBody Concat concat) {
        return concat.x + concat.y;
    }

    @GetMapping
    public String[] concatHttp(HttpServletRequest request) {
        return request.getRequestURI().split("/");
    }
}
