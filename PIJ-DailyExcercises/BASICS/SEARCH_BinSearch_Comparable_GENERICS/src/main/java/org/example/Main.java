package org.example;

public class Main {
    public static void main(String[] args) {

String [] arr = { "Audi", "BMW", "Chevvie"};
String  target = "BMW";
BinSearch binSearch = new BinSearch();
binSearch.binSearch(arr,target);
binSearch.printArr(arr,target);
    }
}