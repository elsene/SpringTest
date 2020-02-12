package com.rakadiou.application;

import com.rakadiou.domain.Team;
import lombok.*;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ObjectApi implements Serializable {
    int count;
    LinkedHashMap filter;
    LinkedHashMap competitions;
    LinkedHashMap season;
    List<Team> teams;

}

