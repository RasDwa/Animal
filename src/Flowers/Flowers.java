package Flowers;

public class Flowers {
    String country;
    int srok;
    int price;

    public Flowers(String country, int srok, int price) {
        this.country = country;
        this.srok = srok;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSrok() {
        return srok;
    }

    public void setSrok(int srok) {
        this.srok = srok;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
