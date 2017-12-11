public class Intersect {
	public static void main(String[] args) {
		System.out.println("Enter two equations that you want to find the intersection of");
		System.out.println("You will be entering the first equation in the form of y = dx^2 + fx + g");
		System.out.println("You will be entering the second equation in the form of y = mx + b");
		System.out.println("Enter the constant d: ");
		double d = IO.readInt();
		System.out.println("Enter the constant f: ");
		double f = IO.readInt();
		System.out.println("Enter the constant g: ");
		double g = IO.readInt();
		System.out.println("Enter the constant m: ");
		double m = IO.readInt();
		System.out.println("Enter the constant b: ");
		double r = IO.readInt();
		double b = (f - m);
		double c = (g - r);
		double x1 = (-b + Math.sqrt((b * b - 4 * d * c))) / (2 * d);
		double x2 = (-b - Math.sqrt((b * b - 4 * d * c))) / (2 * d);
		double y1 = (m * x1) + r;
		double y2 = (m * x2) + r;
		if (d == 0) {
			System.out.println("ERROR: d cannot equal 0!");
			return;
		}
		if ((4 * d * c) > (b * b)) {
			System.out.println("ERROR: area under square root is negative!");
			return;
		}
		if (x1 == x2 && y1 == y2) {
			System.out.println("The intersection is: (" + x1 + "," + y1 + ")");
			return;
		}
		System.out.println("The intersections are: (" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")");

	}
}
