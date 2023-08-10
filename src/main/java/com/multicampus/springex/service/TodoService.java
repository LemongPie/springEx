package com.multicampus.springex.service;

import com.multicampus.springex.dto.PageRequestDTO;
import com.multicampus.springex.dto.TodoDTO;

import java.util.List;

public interface TodoService {
    void register(TodoDTO todoDTO);
    List<TodoDTO> getAll();
//    PageRequestDTO<TodoDTO> getList(PageRequestDTO<T> pageRequestDTO);

    TodoDTO getOne(Long tno);

    void remove(Long tno);
    void modify(TodoDTO todoDTO);
}
