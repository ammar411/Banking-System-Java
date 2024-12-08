/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbankacc;

/**
 *
 * @author Ammar
 */

public class TestBankAcc {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Asad", "55", 100.0);
        BankAccount a2 = new BankAccount("Ali", "56", 0.0);

        a1.INPUT();
        a1.deposit(100000);
        a1.withdraw(100.0);
        a1.transfer(a2, 300.0);
    }
}
