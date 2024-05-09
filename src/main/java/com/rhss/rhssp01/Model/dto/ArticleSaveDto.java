package com.rhss.rhssp01.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleSaveDto implements Serializable {
    private Integer id;

    private String title;

    private String content;

    private String author;
}