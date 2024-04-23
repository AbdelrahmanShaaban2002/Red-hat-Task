package ejbs;

import javax.ejb.Stateless;

@Stateless
public class Calculations {
	
     int number1;
     int number2;
     String operation;
      public Calculations() {};

	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 =number1;
	}
	
}