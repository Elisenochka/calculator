/**
 * Created by Romych on 06.02.2016.


public class Test {
    static int version;

    public static void main(String args[]) throws IOException {
        ArrayList<String> indexes = new ArrayList<String>();
        System.out.println("Welcome to the world of Java");
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        String enter[];
        int result =0;
        int i =0;
        do {
            System.out.println("Enter expression enter 'enter' for quit) current result " + result);
            enter = line.readLine().split(' ');
            for (i,i<=enter.length,i++){

            if (enter[i].equals("+")){
                System.out.println("Enter a number ");
                enter = line.readLine();
                result = plus(result,Integer.parseInt(enter));
            }
            else if (enter.equals("-")){
                System.out.println("Enter a number ");
                enter = line.readLine();
                result = minus(result, Integer.parseInt(enter));
            }
            else if (enter.equals("/")){
                System.out.println("Enter a number ");
                enter = line.readLine();
                result = devide(result,Integer.parseInt(enter));
            }
            else if (enter.equals("*")){
                System.out.println("Enter a number ");
                enter = line.readLine();
                result = multiply(result,Integer.parseInt(enter));
            }
            else if(enter.matches("[-+]?\\d+")) {
                result = Integer.parseInt(enter);
            }
            else if(enter.equals("enter")){
                System.out.println("result is " + result);
            }
        }while (!enter.equals("enter"));

    }

    public static int plus(int first, int second){
        return first + second;
    }
    public static int num(String mmm[]){
        int resultnum = 0;
        for (int i =0;i<=mmm.length-1;i++){
            resultnum =plus(resultnum,Integer.parseInt(mmm[i]));
        }
        return resultnum;
    }
    public static int minus(int first, int second){
        return first - second;
    }
    public static int devide(int first, int second){
        return first/second;
    }
    public static int multiply(int first, int second){
        return first*second;
    }
}*/
