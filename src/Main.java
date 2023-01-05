
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double month_rent,original_price;
        System.out.println("Enter monthly rent: ");
        month_rent=sc.nextDouble();
        System.out.println("Enter original price of property:  ");
        original_price=sc.nextDouble();
        double rental_yield= ((month_rent*12)/original_price)*100;
        System.out.println("RENTAL YIELD IS : " + rental_yield);


    }
}