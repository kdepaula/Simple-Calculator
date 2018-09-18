/**
 * 
 * @author kdepa_t74iu3m
 *
 */
public class CalculatorM 
{
	//the line below this is the main method header
	public static void main(String[] args) 
	{
		//CalculatorS calc;
		///calc = new Calculator(); would also be the same thing as below
		//you can declare and initialize in the same line
		
		CalculatorS calc = new CalculatorS();
		System.out.print(" The difference is " + calc.subtract(7, 4));

	}

}
