import java.util.concurrent.scanner;
public class calculatedays {
    public static void main(String[] args) {
        
        scanner sc=new Scanner(System.in);
        int days=0;
        System.out.println("Enter the month");
        int month=sc.nextint();
        switch (month)) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:days=31;
                 break;
        
            default:System.out.println("invalid month");
                break;
        }
    }
    
}
