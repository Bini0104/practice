package com.ohgiraffers.section01.xmlconfig;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MenuController menuController = new MenuController();
        do {
            System.out.println("========== 스토어 관리 메뉴 ===========");
            System.out.println("1. 상품 전체 조회");
            System.out.println("2. 상품 상세 조회");
            System.out.println("3. 상품 추가");
            System.out.println("4. 상품 수정");
            System.out.println("5. 상품 삭제");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : menuController.allItem(); break;
                case 2 : menuController.selectItemByCode(inputSubMenu()); break;
                case 3 : menuController.insertItem(insertSubMenu()); break;
                case 4 : menuController.updateItem(updateSubmenu()); break;
                case 5 : menuController.deleteItem(inputSubMenu()); break;
            }
        }while (true);
    }

    private static int inputSubMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("상품 id를 입력하세요. : ");
        int id = sc.nextInt();

        return id;
    }
    private static Map<String, String> insertSubMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.print("추가하실 상품의 ID를 입력하세요. : ");
        String id = sc.nextLine();

        System.out.print("추가하실 상품의 이름을 입력하세요. : ");
        String name = sc.nextLine();

        System.out.print("추가하실 상품의 가격을 입력하세요. : ");
        String price = sc.nextLine();

        System.out.print("추가하실 상품의 판매수량을 입력하세요. : ");
        String amount = sc.nextLine();

        LocalDate itemDate = LocalDate.now();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("amount", amount);
        parameter.put("date", itemDate.toString());

        return parameter;
    }
    private static Map<String, String> updateSubmenu() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 상품의 ID를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("수정할 상품의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 상품의 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("판매수량을 입력하세요 : ");
        String amount = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("amount", amount);

        return parameter;
    }


}
