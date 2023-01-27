package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        do {
            System.out.print("Sexo: ");
            bill.gender = sc.next().charAt(0);
        } while (bill.gender != 'M' && bill.gender != 'F');

        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", bill.feeding());

        if (bill.feeding() > 30.0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f\n", bill.cover());
        }

        System.out.printf("Ingresso = R$ %.2f\n\n", bill.ticket());

        System.out.printf("Valor a pagar = R$ %.2f\n", bill.total());

        sc.close();
    }
}
