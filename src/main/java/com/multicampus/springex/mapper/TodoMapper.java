package com.multicampus.springex.mapper;

import com.multicampus.springex.domain.TodoVO;

import java.util.List;

public interface TodoMapper {

    String getTime();
    //TodoVO를 파라미터로 입력받는 insert() 정의
    void insert(TodoVO todoVO);

    List<TodoVO> selectAll();
}
