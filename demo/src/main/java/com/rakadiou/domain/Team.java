package com.rakadiou.domain;

import lombok.*;

import java.io.Serializable;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Team implements Serializable {
    private int id;
    private String name;
    private Area area;
}
