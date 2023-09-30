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
            default:
                throw new IllegalArgumentException("Invalid operation");

        }
        CalculatorObj object = new CalculatorObj(num1, num2, result, operation);
        return object;

    }

    public class CalculatorObj{
        private int num1;
        private int num2;

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

        private int result;

        public int getNum1() {
            return num1;
        }

        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public int getNum2() {
            return num2;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        private String operation;
        public CalculatorObj(int num1, int num2, int result, String operation){
            this.num1=num1;
            this.num2=num2;
            this.result=result;
            this.operation=operation;
        }

    }
}


