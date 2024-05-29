package com.bbanggood.springbbangupdate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Data // getter, setter, requiredArgsContructor, toString, equals, hashCode 메서드 자동 생성
@NoArgsConstructor // 파라미터 없는 기본 생성자 생성. JPA는 엔터티를 프록시로 사용하기 위해 기본 생성자 꼭 필요
@AllArgsConstructor // 필드 값을 초기화하는 생성자 자동 사용 가능
@Embeddable
public class BBangVodId implements Serializable {
    @Column(name = "SETBX_ID", nullable = false)
    private Integer setbxId;

    @Column(name = "VOD_ID", nullable = false)
    private Integer vodId;

}