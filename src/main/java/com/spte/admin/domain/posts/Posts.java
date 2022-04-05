package com.spte.admin.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter             //lombok@   클래스 내의 모든 Getter 자동 생성
@NoArgsConstructor  //lombok@   기본 생성자 자동 추가 public Post(){} 와 같은 효과
@Entity             //jpa @    테이블과 매핑될 클래스 기본값으로 카멜케이스 이름을 (_)을 이욜하여 매칭 ex)saleMana.java ->sale_mana table
public class Posts {            //실제 DB의 테이블과 매칭될 테이블
    @Id //pk 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pk 생성 규칙
    private Long id;

    @Column(length = 500, nullable = false)   //칼럼 선언 및 수정
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String authour){
        this.title = title;
        this.content = content;
        this.author = authour;
    }

}
