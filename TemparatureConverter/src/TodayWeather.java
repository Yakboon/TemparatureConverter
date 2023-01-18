import java.util.Scanner;

public class TodayWeather {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Float i, choose;
		System.out.println("Enter the value you want to convert");
		i = sc.nextFloat();
		System.out.println("Which one do you want?");
		System.out.println("1= celsius to fahrneheit\n2= fahrneheit to celsius");
		System.out.println("Your choise:");
		choose = sc.nextFloat();
		if (choose == 1) {
			i = (i * 9 / 5) + 32;
			System.out.println("The fahrneheit value is= " + i);
		} else if (choose == 2) {
			i = (i - 32) * 5 / 9;
			System.out.println("The celsius value is= " + i);
		}
	}

}
