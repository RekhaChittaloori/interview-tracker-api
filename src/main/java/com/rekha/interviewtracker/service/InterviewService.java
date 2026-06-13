package com.rekha.interviewtracker.service;
import com.rekha.interviewtracker.enums.InterviewStatus;
import com.rekha.interviewtracker.entity.Interview;
import com.rekha.interviewtracker.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rekha.interviewtracker.dto.DashboardDTO;
import com.rekha.interviewtracker.enums.InterviewStatus;

import java.util.List;

@Service
public class InterviewService {

    @Autowired
    private InterviewRepository interviewRepository;

    public long getTotalApplications() {
        return interviewRepository.count();
    }

    public Interview saveInterview(Interview interview) {
        return interviewRepository.save(interview);
    }

    public List<Interview> getAllInterviews() {
        return interviewRepository.findAll();
    }
    public List<Interview> getInterviewsByStatus(InterviewStatus status) {
        return interviewRepository.findByStatus(status);
    }

    public DashboardDTO getDashboard() {

        long total = interviewRepository.count();

        long applied =
                interviewRepository.countByStatus(InterviewStatus.APPLIED);

        long selected =
                interviewRepository.countByStatus(InterviewStatus.SELECTED);

        long rejected =
                interviewRepository.countByStatus(InterviewStatus.REJECTED);

        return new DashboardDTO(
                total,
                applied,
                selected,
                rejected
        );
    }
}