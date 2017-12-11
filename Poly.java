public class Poly {
	public static void main(String args[]) {
		System.out.println("Enter your first root:");
		int root1 = IO.readInt();
		root1 = (root1) * -1;
		System.out.println("Enter your second root:");
		int root2 = IO.readInt();
		root2 = (root2) * -1;
		System.out.println("Enter your third root:");
		int root3 = IO.readInt();
		root3 = (root3) * -1;
		int firstCoe = (root1 + root2) + root3;
		int secondCoe = ((root1 * root2) + ((root1 + root2) * root3));
		int thirdCoe = (root1 * root2) * root3;
		System.out.println(
				"Your polynomial is: x^3 " + "+ " + firstCoe + "x^2 " + "+ " + secondCoe + "x " + "+ " + thirdCoe);
	}
}
