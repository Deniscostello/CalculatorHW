package ie.atu.calculatorhomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public CalculatorResponse calculate(@RequestParam int num1, int num2, String operation){
        int result;
        String operator;

        switch (operation){
            case "add":
                result=num1+num2;
                operator="+";
        }
    }

}
