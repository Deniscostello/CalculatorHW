package ie.atu.calculatorhomework;

public class CalculatorObj {
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    private int result;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    private String operation;
    public CalculatorObj(int result, String operation){
        this.result=result;
        this.operation=operation;
    }
}
