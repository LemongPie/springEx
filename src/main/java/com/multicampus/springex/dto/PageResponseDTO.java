package com.multicampus.springex.dto;

import lombok.Builder;

import java.util.List;

public class PageResponseDTO<E> {
    private int page;
    private int size;
    private int total;
    
    //시작페이지 번호
    private int start;
    //끝 페이지 번호
    private int end;

    //이전 페이지 존재의 여부
    private boolean preview;
    //다음 페이지 존재의 여부
    private boolean next;

    private List<E> dtoList;

    @Builder(builderMethodName = "withAll")
    public PageResponseDTO(PageRequestDTO pageRequestDTO, List<E> dtoList, int total){
        this.page= pageRequestDTO.getPage();
        this.size= pageRequestDTO.getSize();
        this.total= total;
        this.dtoList= dtoList;

    }
    //페이지 번호의 계산
//     this.end = (int)(Math.ceil(this.page/10.0))*10;
//        this.start = this.end-9;

}
