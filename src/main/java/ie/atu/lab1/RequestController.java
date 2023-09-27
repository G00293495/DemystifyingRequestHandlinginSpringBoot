package ie.atu.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hi";
    }
    @GetMapping("/greet/{name}")
        public String greetByName(@PathVariable String name){
        return "hello" + name;
    }

    @GetMapping("/details")
    public String Details(@RequestParam String Name, @RequestParam int age)
    {return "name: " + Name + " age: " + age;}
}
