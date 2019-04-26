package Flowers;

public class Prodoza {
    public static void main(String[] args) {
        Rose rose = new Rose("Украина", 7, 14);
        Rose rose1 = new Rose("Голандия", 9, 20);
        Tylpan tylpan1 = new Tylpan("Украина", 5, 10);
        Tylpan tylpan2 = new Tylpan("Голандия", 3, 15);

        Flowers[] flowers = {rose, tylpan1, tylpan2};
        int count=0;
        int summa = 0;
        for (Flowers prodaza : flowers) {
            summa = rose.getPrice() + tylpan1.getPrice() + tylpan2.getPrice();
            count++;
        }
        System.out.println(summa);
        System.out.println(count);
    }
}
