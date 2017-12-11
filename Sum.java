public class Sum {
	public static void main(String args[]) {
		System.out.println("Enter the first number that you want to be summed: ");
		int num1 = IO.readInt();
		System.out.println("Enter the second number that you want to be summed: ");
		int num2 = IO.readInt();
		int sum = num1 + num2;
		IO.outputIntAnswer(sum);
	}
}
