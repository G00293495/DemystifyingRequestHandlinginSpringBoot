package ie.atu.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @GetMapping("/calculate")
    public int Calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
       switch (operation) {
           case ("add"):
               return num1 + num2;

           case ("divide"):
               return num1 / num2;

           case ("subtract"):
               return num1 - num2;

           case ("multiply"):
               return num1 * num2;
       }
        return 0;
    }
}
