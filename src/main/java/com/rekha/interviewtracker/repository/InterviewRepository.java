package com.rekha.interviewtracker.repository;
import com.rekha.interviewtracker.enums.InterviewStatus;
import java.util.List;
import com.rekha.interviewtracker.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Long> {
    long count();
    long countByStatus(InterviewStatus status);
    List<Interview> findByStatus(InterviewStatus status);
}