package in.com.cg.lambda;

//main function

public class LambdaShape {

	public static void main(String[] args) {
		// String name="Circle";

				Shape circle = (argument, argument2) -> {

					System.out.println("Printing a " + argument + " and " + argument2);//display arguements through lambda function
				};

				// Draw function is called...its defined by this lambda function
				circle.draw("Circle", "Rectangle");

				Add newAdd = (a, b, c) -> {
					System.out.println("The sum is " + (a + b + c)); //this portion defines the abstract method of the interface
				};
				newAdd.display(10, 20, 30);

	}

}
