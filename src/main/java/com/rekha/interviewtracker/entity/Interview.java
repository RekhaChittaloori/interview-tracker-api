package com.rekha.interviewtracker.entity;

import com.rekha.interviewtracker.enums.InterviewStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "interviews")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    private String role;

    @Enumerated(EnumType.STRING)
    private InterviewStatus status;

    private String interviewDate;

    private String notes;
}