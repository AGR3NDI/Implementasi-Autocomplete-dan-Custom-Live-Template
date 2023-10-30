package com.tugas3.modul3;

import java.util.Scanner;

class Calculator {
    // Atribut
    private double number1;
    private double number2;

    /**
     *
     * @param number1 angka 1
     * @param number2 angka 2
     */
    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    /**
     *
     * @return penjumlahan
     */
    public double jumlah() {
        return number1 + number2;
    }

    /**
     *
     * @return pengurangan
     */
    public double kurang() {
        return number1 - number2;
    }

    /**
     *
     * @return perkalian
     */
    public double kali() {
        return number1 * number2;
    }

    /**
     *
     * @return pembagian
     */
    public double bagi() {
        return number1/number2;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator(0,0);
        System.out.println("Masukan angka ke-1");
        double number1 = sc.nextDouble();
        System.out.println("Masukan angka ke-2");
        double number2 = sc.nextDouble();
        calc.setNumber1(number1);
        calc.setNumber2(number2);
        System.out.println("angka ke-1 " +calc.getNumber1());
        System.out.println("angka ke-2 " + calc.getNumber2());

        System.out.println("Hasil Penjumlahan: " + calc.jumlah());

        System.out.println("Hasil Pengurangan: " + calc.kurang());

        System.out.println("Hasil Perkalian: " + calc.kali());

        System.out.println("Hasil Pembagian: " + calc.bagi());

    }
}
