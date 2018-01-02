package org.kotliner.demo.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@RestController
public class HelloJavaController {

    @RequestMapping("/java/hello")
    public String hello(@RequestParam(name = "name", required = false) String name) {
        return name != null ? "Hello " + name : "Hello Java";
    }
}
