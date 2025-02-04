public class Nestedif {
    public static void main(String[] args){
        int a=60;

        boolean hastickit =true;
        if(hastickit==true)
        {
            if(a>=60){
                System.out.println("Eligible for test");
            }
            else{
                System.out.println("pay fine then go for test");
            }

        }
        else{
            System.out.println("Not eligible for test");
        }


    }
    
}
