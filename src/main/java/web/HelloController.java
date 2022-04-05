package web;   //컨트롤러와 관련되 클래스 담은 패키지

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     //JSON 반환 컨트롤러
public class HelloController {

    @GetMapping("/hello")    //Get api
    public String hello() {

        return "hello";
    }
}

