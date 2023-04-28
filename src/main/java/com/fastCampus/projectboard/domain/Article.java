package com.fastCampus.projectboard.domain;


import java.time.LocalDateTime;

public class Article {
    private long id;
    private String title; //제목
    private String content; //본문
    private String hashtag; //해쉬태그
    
    private LocalDateTime createAt; //생성일시
    private String createBy; //생성자
    private LocalDateTime modifiedAt; //수정일시
    private String modifiedBy; //수정자


}
