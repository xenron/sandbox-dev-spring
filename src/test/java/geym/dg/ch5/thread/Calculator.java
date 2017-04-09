package geym.dg.ch5.thread;

public class Calculator {
    private double number1;
    private double number2;
    private double result;
    private String operator;
    public double getNumber1() {
        return number1;
    }
    public void setNumber1(double number1) {
        this.number1 = number1;
    }
    public double getNumber2() {
        return number2;
    }
    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
	@Override
	public String toString() {
		return "Calculator [number1=" + number1 + ", number2=" + number2 + ", result=" + result + ", operator="
				+ operator + "]";
	}



}
