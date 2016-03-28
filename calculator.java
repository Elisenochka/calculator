/*
    * Created by Romych on 08.02.2016.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculator {
    public static void main(String args[]) throws IOException{
    int result = 0;
    int temp;
        /*BufferedReader line = new BufferedReader(new InputStreamReader(System.in));*/
        for (int b=0;b<=args.length-1;) {
 /*for(int i =0;i<=args.length-1;i++){
 System.out.println("Args" +i + args[i]);
 String argument = args[i];*/
            /*if  (!args[b].matches("[-+]?\\d+")) {
                System.out.println("There is a mistake in element"+b);
            }*/
            if(args[b].equals("+")){
                if(args[b+2].equals("x")||args[b+2].equals("/")) {
                    b= b + 2;
                    temp = Integer.parseInt(args[b-1]);
                    do {
                        if (args[b].equals("x")) {
                            temp = multiply(temp, Integer.parseInt(args[b + 1]));
                            b = b + 2;
                        }
                        if (args[b].equals("/")) {
                            temp = divide(temp, Integer.parseInt(args[b + 1]));
                            b = b + 2;
                        }
                    } while (!args[b].equals("x") | !args[b].equals("/"));
                    result=plus(result,temp);
                    System.out.println(result + " " + b);
                }
                else {
                    result = plus(result, Integer.parseInt(args[b + 1]));
                    b= b + 2;
                    System.out.println(result + " " + b);
                }
            }
            else if(args[b].equals("-")){
                if(args[b+2].equals("x")||args[b+2].equals("/")) {
                    b= b + 2;
                    temp=Integer.parseInt(args[b-1]);
                    do {
                        if (args[b].equals("x")) {
                            temp = multiply(temp, Integer.parseInt(args[b + 1]));
                            b = b + 2;
                        }
                        if (args[b].equals("/")) {
                            temp = divide(temp, Integer.parseInt(args[b + 1]));
                            b = b + 2;
                        }
                    } while (!args[b].equals("x") | !args[b].equals("/"));
                    result= minus(result,temp);
                }
                else {
                    result= minus(result,Integer.parseInt(args[b+1]));
                    b= b + 2;
                }
            }
            else if (args[b].equals("x")){
                if(args[b+2].equals("x")||args[b+2].equals("/")) {
                    b= b + 2;
                    temp = multiply(result, Integer.parseInt(args[b - 1]));
                    do {
                        if (args[b].equals("x")) {
                            temp = multiply(temp, Integer.parseInt(args[b + 1]));
                            b = b + 2;
                        }
                        if (args[b].equals("/")) {
                            temp = divide(temp, Integer.parseInt(args[b + 1]));
                            b = b + 2;
                        }
                    } while (!args[b].equals("x") | !args[b].equals("/"));
                }
                else {
                    result = multiply(result, Integer.parseInt(args[b + 1]));
                    b = b + 2;
                }

            }
            else if (args[b].equals("/")){
                if(args[b+2].equals('x')||args[b+2].equals('/')){
                    b=b+2;
                    temp=divide(result, Integer.parseInt(args[b - 1]));
                    do {
                        if(args[b].equals('x')){
                            temp = multiply(temp, Integer.parseInt(args[b + 1]));
                            b= b + 2;
                        }
                        if(args[b].equals('/')){
                            temp = divide(temp, Integer.parseInt(args[b + 1]));
                            b= b + 2;
                        }
                    }while (!args[b].equals('x')|!args[b].equals('/'));
                }
                else {
                    result = divide(result, Integer.parseInt(args[b + 1]));
                    b = b + 2;
                }
            }
            else {
                result=Integer.parseInt(args[b]);
                b = b + 1;
            }

            System.out.println(result + " " + b);
            /*String s = line.readLine();*/

        }

        System.out.print(result);
    }
    public static int plus(int first, int second){
        return first + second;
    }
    public static int minus(int first, int second){
        return first - second;
    }
    public static int divide(int first, int second){
        return first/second;
    }
    public static int multiply(int first, int second){
        return first*second;
    }
}