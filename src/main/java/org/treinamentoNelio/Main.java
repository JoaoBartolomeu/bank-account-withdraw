package org.treinamentoNelio;

import org.treinamentoNelio.entities.Account;
import org.treinamentoNelio.exceptions.BusinessException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Titular: ");
        String titular = sc.nextLine();

        System.out.print("Saldo Inicial: ");
        double saldoInicial = sc.nextDouble();

        System.out.print("Limite do Saque: ");
        double limiteSaque = sc.nextDouble();

        Account acc = new Account(numero, titular, saldoInicial, limiteSaque);

        System.out.print("Informe uma quantia para sacar: ");
        try {
            acc.withdraw(sc.nextDouble());
            System.out.print("Novo Saldo: " + acc.getBalance());
        }catch (BusinessException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}