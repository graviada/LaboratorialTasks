package ru.chalovai.lab4;

public class Flat implements Priceable {
    private String district;

    public Flat (String district) {
        this.district = district;
    }

    @Override
    public void getPrice() {
        int price = 5 + (int) Math.random()*10;

        if (district == "ЦАО") {
            price += 30;
        }
        else if (district == "ЗАО" || district == "ЮЗАО" || district == "ЮВАО") {
            price += 25;
        }
        else if (district == "СВАО" || district == "СЗАО") {
            price += 15;
        }

        System.out.printf("Стоимость квартиры в округе %s составляет %s млн руб.\n",
                district, price);
    }
}
