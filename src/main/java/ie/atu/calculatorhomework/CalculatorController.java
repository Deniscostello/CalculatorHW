package ie.atu.calculatorhomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public CalculatorObj Calculator(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        int result;

        switch (operation){
            case "add":
                result = num1+num2;
                break;
            case "subtract":
                result = num1-num2;
                break;
            case "divide":
                if(num2==0){
                    throw new IllegalArgumentException("Error: Cannot divide by 0");
                }
                result=num1/num2;
                break;
            case "multiply":
                result=num1*num2;
                break;
            default:
                throw new IllegalArgumentException("Error: Invalid operation");

        }
        CalculatorObj object = new CalculatorObj(result, operation);
        return object;
    }
}


