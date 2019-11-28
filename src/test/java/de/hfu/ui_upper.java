
import java.util.Scanner;

public class ui_upper {

		public static void main(String[] args) {
			System.out.println("Bitte geben sie den zu übersetzenden String ein");
			Scanner Input = new Scanner(System.in);
			String s=Input.nextLine();
			s=s.toUpperCase();
			System.out.println(s);
		}
}
