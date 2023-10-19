package net.study.basic.lesson3;

import java.util.Objects;

public class Order{
    String shopName;
    String shopLocation;
    String productsType;
    Boolean isOnlinePurchasePossible;
    Integer averageDeliveryDays;

    public Order() {
    }

    public Order(String shopName, String shopLocation, String productsType, Boolean isOnlinePurchasePossible,Integer averageDeliveryDays) {
        this.shopName = shopName;
        this.shopLocation = shopLocation;
        this.productsType = productsType;
        this.isOnlinePurchasePossible = isOnlinePurchasePossible;
        this.averageDeliveryDays = averageDeliveryDays;
    }

    @Override
    public String toString() {
        return "Order{" +
                "shopName='" + shopName + '\'' +
                ", shopLocation='" + shopLocation + '\'' +
                ", productsType='" + productsType + '\'' +
                ", isOnlinePurchasePossible=" + isOnlinePurchasePossible +
                ", averageDeliveryDays=" + averageDeliveryDays +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(shopName, order.shopName) && Objects.equals(shopLocation, order.shopLocation) && Objects.equals(productsType, order.productsType) && Objects.equals(isOnlinePurchasePossible, order.isOnlinePurchasePossible) && Objects.equals(averageDeliveryDays, order.averageDeliveryDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopName, shopLocation, productsType, isOnlinePurchasePossible, averageDeliveryDays);
    }
}

