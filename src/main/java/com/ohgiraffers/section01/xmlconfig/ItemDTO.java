package com.ohgiraffers.section01.xmlconfig;

import java.time.LocalDate;
import java.util.Date;

public class ItemDTO {

    private int itemId;
    private String itemName;
    private int price;
    private LocalDate itemDate;
    private int itemAmount;

    public ItemDTO(){}

    public ItemDTO(int itemId, String itemName, int price, LocalDate itemDate, int itemAmount) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.itemDate = itemDate;
        this.itemAmount = itemAmount;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getItemDate() {
        return itemDate;
    }

    public void setItemDate(LocalDate itemDate) {
        this.itemDate = itemDate;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", itemDate=" + itemDate +
                ", itemAmount=" + itemAmount +
                '}';
    }
}
