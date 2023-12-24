/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roulette;

/**
 *
 * @author imbuh
 */
public class Roulette {
private int bankRoll;
private int spinCount;

public Roulette(int bankRoll){
    this.bankRoll = bankRoll;
    this.spinCount = 0;
}
public void turn(int bet, String[] selectedNumber){
    int betWinnings = getPayout(bet, selectedNumber.length);
    if(this.bankRoll >= bet) {
        this.bankRoll -= bet;
        int spinNumber = spin();
        System.out.println(toString());
        if(isInList(spinNumber, selectedNumber)){
            System.out.println("You picked the winning number " + spinNumber + " and win $" + betWinnings);
        }
        else{
            System.out.println("You did not pick the winning number");
        }
        
        }
        else{ 
            System.out.println("You do not have enough money to make this bet.");
        }
    }

    private boolean isInList(int winningNum, String[] list){
        boolean inList = false;
        for(int i=0; i < list.length; i++){
            if(winningNum == Integer.parseInt(list[i]) || (winningNum == 37 && list[i] == "00")){
                inList = true;
            }

            }
            return inList;
        }
    

    private int getPayout(int bet, int numbersBet){
        switch(numbersBet){
            case 1: return bet * 36;
            case 2: return bet * 18;
            case 3: return bet * 12;
            case 4: return bet * 9;
            case 6: return bet * 6;
            case 12: return bet * 3;
            case 18: return bet * 2;
            default: return -1;
        }

    } 
    
    private int spin(){
        this.spinCount++;
        return (int) (Math.floor(Math.random()*100)%38);
    }
    public String toString(){
        return ("\nRoulette Game:\n" + "Bank Roll = $" + this.bankRoll + "\n" + "Spin Count: " + this.spinCount);
    }
    public static void main(String[] args) {
        Roulette rg1 = new Roulette(10);
        rg1.turn(1, new String[] {"10"});
        rg1.turn(1, new String[] {"10" , "11"});
        rg1.turn(1, new String[] {"1", "2", "3"});
        rg1.turn(1, new String[] { "22","23","25","26"});
        rg1.turn(1, new String[] {"10"});
        rg1.turn(1, new String[] {"10"});
    }
}

