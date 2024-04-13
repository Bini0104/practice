package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {
    public void printAllItem(List<ItemDTO> itemList) {

        System.out.println("상품 전체 조회 목록입니다.");
        for (ItemDTO itemDTO : itemList){
            System.out.println(itemDTO);
        }
    }


    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectAllItem": errorMessage = "상품 전체 조회를 실패하였습니다.";break;
            case "selectOneItem": errorMessage = "상품 상세조회를 실패하였습니다.";break;
            case "insert" : errorMessage = "상품 추가를 실패하였습니다."; break;
            case "update" : errorMessage = "상품 정보 수정을 실패하였습니다."; break;
            case "delete" : errorMessage = "상품 삭제를 실패하였습니다"; break;
        }
        System.out.println(errorMessage);
    }

    public void printOneItem(ItemDTO item) {
        System.out.println(item);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode){
            case "insert" : successMessage = "상품이 추가되었습니다."; break;
            case "update" : successMessage = "상품 정보가 수정되었습니다."; break;
            case "delete" : successMessage = "상품이 삭제되었습니다"; break;
        }
        System.out.println(successMessage);
    }
}
