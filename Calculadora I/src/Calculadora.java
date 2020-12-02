public class Calculadora {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		/*calculator.setOperandOne(10.5);
		calculator.setOperation("+");
		calculator.setOperandTwo(5.2); 
		calculator.performOperation(); 
		System.out.println(calculator.getResult());*/
		
		calculator.performOperation(10.5);
		calculator.performOperation('+');
		calculator.performOperation(5.2);
		calculator.performOperation('*');
		calculator.performOperation(10);
		calculator.performOperation('=');
		calculator.getResults();
		
		
	}

}
