package ua.kol;


import java.util.Arrays;

public class Reader {
    String Name;
    String number;
    String facultet;
    String date;
    String numberPhone;
    int count=0;

    public Reader(String name, String number, String facultet, String date, String numberPhone) {
        Name = name;
        this.number = number;
        this.facultet = facultet;
        this.date = date;
        this.numberPhone = numberPhone;
    }

    public Reader(String name) {
        Name = name;
    }

    public Reader() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void takeBook(int[]...x) {
        for(int[] book: x){
            count++;
        }
        System.out.println(this.Name+" "+" взял "+ count+" книги");

    }

    public void returnBook() {
    }
     void takeBook(String[]... name) {
         System.out.print(this.Name+" взял книги: ");
        for(String[] book: name){
            count++;
            System.out.print(Arrays.toString(book) +" ");
        }
    }

    public static void main(String[] args) {
        Reader student = new Reader("Петров П.П","123","econom","14/02/1999","+3805071789");
        String[] books = {"Приключения","Словарь","Энциклопедия"};
        student.takeBook(books);
        System.out.println();
        student.takeBook(books);

    }
}
