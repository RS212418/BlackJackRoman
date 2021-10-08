package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int hiddennumber1;
        int hiddennumber2;
        int usernumber1;
        int usernumber2;
        hiddennumber1 = (random.nextInt(12));
        hiddennumber2 = (random.nextInt(12));
        usernumber1 = (random.nextInt(12));
        usernumber2 = (random.nextInt(12));
        int computertotal = hiddennumber1 + hiddennumber2;
        int usertotal = usernumber1 + usernumber2;

        if(computertotal < 21){
            computertotal = computertotal + (random.nextInt(12));
        }
        else if (computertotal == 21){
            System.out.println("BlackJack!");
        }
        else{
            System.out.println("You have lost as your number is greater than 21");
        }

        if(usertotal < 21){
            usertotal = usertotal + (random.nextInt(12));
        }
        else if(usertotal == 21){
            System.out.println("BlackJack!");
        }
        else{
            System.out.println("You have lost as your number is greater than 21");
        }
        if(usertotal < 21 && computertotal < 21){
            if(usertotal > computertotal);
            System.out.println("Congratulations, you have won because you had the highest number less than 22");
        }
        else{
            System.out.println("Tough luck, I won because i had the largest number less than 22");
        }
    }
}
