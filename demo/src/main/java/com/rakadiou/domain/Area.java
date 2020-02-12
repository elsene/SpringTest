package com.rakadiou.domain;

import lombok.*;

import java.io.Serializable;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Area implements Serializable {
    private Integer id;
    private String name;

}
