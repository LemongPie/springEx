package com.multicampus.springex.dto;


import lombok.*;

import java.time.LocalDate;

@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {
    private Long tno;
    private String title;
    private String name;
    private LocalDate dueDate;
    private String writer;
    private boolean finished;
}
