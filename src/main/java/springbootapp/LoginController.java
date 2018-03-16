package springbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
  @RequestMapping(name = "/")
  public String helloWorld() {
    return "Hello world";
  }
}