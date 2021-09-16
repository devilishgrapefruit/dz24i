package com.dz;
import java.util.Arrays;
import java.util.Scanner;
class Dog_kennels  {
    private int number;
    private final Dog [] arrayDogs ;

    public Dog_kennels() {
        number = 0;
        arrayDogs = new Dog[100];
    }

    public void addDog(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of dogs to add: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Input the name and the age of the dog: ");
            Scanner a = new Scanner(System.in);
            arrayDogs[i] = new Dog(a.nextLine(), a.nextInt());
            number ++;
        }
    }

    public int getNumber() {
        return number;
    }

    public void print() {
        System.out.println("Number of the dogs " + number);
        for (int i = 0; i < number; i++) {
            System.out.println("Name and age dog №" + i + ": " +  arrayDogs[i].getName() + " " + arrayDogs[i].getAge());
        }
    }
}
