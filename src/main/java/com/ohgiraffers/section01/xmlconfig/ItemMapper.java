package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public interface ItemMapper {
    List<ItemDTO> selectAllItem();

    ItemDTO selectItemById(int id);

    int insertItem(ItemDTO item);

    int updateItem(ItemDTO item);

    int deleteItem(int id);
}
