package com.ohgiraffers.section01.xmlconfig;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class MenuController {

    private final PrintResult printResult;
    private final ItemService itemService;

    public MenuController(){
        printResult = new PrintResult();
        itemService = new ItemService();
    }

    public void allItem() {

        List<ItemDTO> itemList = itemService.selectAllItem();

        if (itemList != null) {
            printResult.printAllItem(itemList);
        }else {
            printResult.printErrorMessage("selectAllItem");
        }

    }

    public void selectItemByCode(int id) {
        ItemDTO item = itemService.selectItemById(id);
        
        if (item != null){
            System.out.println("상품 상세 조회 결과입니다.");
            printResult.printOneItem(item);
        }else {
            printResult.printErrorMessage("selectOneItem");
        }
    }

    public void insertItem(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int itemAmount = Integer.parseInt(parameter.get("amount"));
        String dateString = parameter.get("date");

        LocalDate itemDate = LocalDate.parse(dateString);

        ItemDTO item = new ItemDTO();

        item.setItemId(id);
        item.setItemName(name);
        item.setPrice(price);
        item.setItemDate(itemDate);
        item.setItemAmount(itemAmount);

        if (itemService.insertItem(item)){

            printResult.printSuccessMessage("insert");

        }else {

            printResult.printErrorMessage("insert");

        }

    }

    public void updateItem(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int itemAmount = Integer.parseInt(parameter.get("amount"));

        ItemDTO item = new ItemDTO();

        item.setItemId(id);
        item.setItemName(name);
        item.setPrice(price);
        item.setItemAmount(itemAmount);

        if (itemService.updateItem(item)) {

            printResult.printSuccessMessage("update");

        } else {

            printResult.printErrorMessage("update");
        }
    }

    public void deleteItem(int id) {

        if (itemService.deleteItem(id)){
            printResult.printSuccessMessage("delete");
        }else {
            printResult.printSuccessMessage("delete");
        }
    }
}
