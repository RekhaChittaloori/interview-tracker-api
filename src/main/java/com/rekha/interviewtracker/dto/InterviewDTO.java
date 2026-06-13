package com.rekha.interviewtracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import com.rekha.interviewtracker.enums.InterviewStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InterviewDTO {

    @NotBlank
    private String companyName;

    @NotBlank
    private String role;

    @NotNull
    private InterviewStatus status;

    @NotBlank
    private String interviewDate;

    private String notes;
}