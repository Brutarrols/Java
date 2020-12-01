import java.beans.*;
public class Calculator implements java.io.Serializable{
	
	private double num1, num2;
	private String operator;
	
	public void setOperandOne(double num)
	{
		this.num1 = num;
	}
	
	public void setOperation(String operator)
	{
		this.operator = operator;
	}
	
	public void setOperandTwo(double num)
	{
		this.num2 = num;
	}
	
	public double performOperation()
	{
		
		/*String operation = this.num1 + this.operator+ this.num2;
		return Double.parseDouble(operation);*/
		
		
		switch(this.operator)
		{
			case "+":  return this.num1 + this.num2; 
			
			case "-":  return this.num1 + this.num2; 
			
			case "*":  return this.num1 + this.num2; 
			
			case "/":  return this.num1 + this.num2; 
			
			default: return 0; 
		}
		
		
	}
	public double getResult()
	{
		
		return performOperation();
	}
	
	
}
