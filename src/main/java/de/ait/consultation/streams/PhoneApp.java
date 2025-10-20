package de.ait.consultation.streams;

import java.util.ArrayList;
import java.util.List;

public class PhoneApp {
    public static void main(String[] args) {
        Phone phoneOne = new Phone("Iphone 17 Pro Max", "Appel", 2000);
        Phone phoneTwo = new Phone("Galaxy S22", "Samsung", 1700);
        Phone phoneThree = new Phone("S3110", "Nokia", 20);
        Phone phoneFour = new Phone("17 Pro Max", "Huawei", 700);
        Phone phoneFive = new Phone("17 Pro Max", "Huawei", 700);

        List<Phone> phones = new ArrayList<>();
        phones.add(phoneOne);
        phones.add(phoneTwo);
        phones.add(phoneThree);
        phones.add(phoneFour);
        phones.add(phoneFive);

        List<Phone> resultDistinct = phones.stream()
                .distinct()
                .filter(phone -> phone.getPrice() >= 1700)
                .toList();

        System.out.println("Distinct phone numbers: " + resultDistinct);
    }
}
