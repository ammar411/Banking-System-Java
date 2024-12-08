/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbankacc;
/**
 *
 * @author Ammar
 */
import java.util.Scanner;

public class BankAccount {
    private String AccTitle;
    private String AccNO;
    private double AccBal;
    private boolean AccSta;

    public BankAccount() {
        this.AccTitle = "UNKNOWN";
        this.AccNO = "N/A";
        this.AccBal = 0.0;
        this.AccSta = false;
    }

    public BankAccount(String a, String b, double c) {
        this.AccTitle = a;
        this.AccNO = b;
        this.AccBal = c;
        this.AccSta = true; // Assuming an account with initial balance is active
    }

    public BankAccount(BankAccount ref) {
        this.AccTitle = ref.AccTitle;
        this.AccNO = ref.AccNO;
        this.AccBal = ref.AccBal;
        this.AccSta = ref.AccSta;
    }

    public void setACCTITLE(String a) {
        this.AccTitle = a;
    }

    public void setACCNO(String b) {
        this.AccNO = b;
    }

    public void setACCBAL(double c) {
        this.AccBal = c;
    }

    public void setACCSTA(boolean d) {
        this.AccSta = d;
    }

    public String getACCTITLE() {
        return this.AccTitle;
    }

    public String getACCNO() {
        return this.AccNO;
    }

    public double getACCBAL() {
        return this.AccBal;
    }

    public boolean getACCSTA() {
        return this.AccSta;
    }

    public void INPUT() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Account Title:");
        this.setACCTITLE(s.nextLine());

        System.out.println("Enter the Account NO:");
        this.setACCNO(s.nextLine());

        System.out.printf("Enter Account Balance:");
        this.setACCBAL(s.nextDouble());

        System.out.printf("\nAccount Title: %s\n", this.AccTitle);
        System.out.printf("Account NO: %s\n", this.AccNO);
        System.out.printf("Account Balance: %f\n", this.AccBal);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            AccBal += amount;
            System.out.printf("\nDeposited: %f\n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= AccBal) {
            AccBal -= amount;
            System.out.printf("\nWithdrawn: %f\n", amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= AccBal) {
            AccBal -= amount;
            recipient.deposit(amount);
            System.out.printf("\nTransferred: %f to %s\n", amount, recipient.getACCTITLE());
        } else {
            System.out.println("Invalid transfer amount or insufficient balance.");
        }
    }
}




