package oasis;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;


    public int getnoOfGuesses(){
        return noOfGuesses;
    }
    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

     Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number :");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.println("Yes you guessed right \nYou guess in "+noOfGuesses+" attempts number is "+ number);
            return true;
        }

        else if(inputNumber<number){
            System.out.println(inputNumber+" Too Less...");
        }
        else if(inputNumber>number){
            System.out.println(+inputNumber+" Too High...");
        }
        return false;
}
}


 public class Guess_the_number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        while(!b){
        g.takeUserInput();
         g.isCorrectNumber();
        }
    } 
}
