package com.rekha.interviewtracker.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DashboardDTO {

    private long total;
    private long applied;
    private long selected;
    private long rejected;

}