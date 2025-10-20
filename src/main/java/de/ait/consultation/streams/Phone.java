package de.ait.consultation.streams;

import java.util.Objects;

public class Phone {
    private String model;
    private String manufacturer;
    private int price;

    public Phone(String model, String manufacturer, int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price && Objects.equals(model, phone.model) && Objects.equals(manufacturer, phone.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, price);
    }
}
