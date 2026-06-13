package com.rekha.interviewtracker.controller;
import com.rekha.interviewtracker.dto.InterviewDTO;
import com.rekha.interviewtracker.entity.Interview;
import com.rekha.interviewtracker.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import com.rekha.interviewtracker.enums.InterviewStatus;
import com.rekha.interviewtracker.dto.DashboardDTO;
@RestController
@RequestMapping("/interviews")
public class InterviewController {

    @Autowired
    private InterviewService interviewService;

    @PostMapping
    public Interview createInterview(@Valid @RequestBody InterviewDTO dto) {

        Interview interview = new Interview();

        interview.setCompanyName(dto.getCompanyName());
        interview.setRole(dto.getRole());
        interview.setStatus(dto.getStatus());
        interview.setInterviewDate(dto.getInterviewDate());
        interview.setNotes(dto.getNotes());

        return interviewService.saveInterview(interview);
    }

    @GetMapping
    public List<Interview> getAllInterviews() {
        return interviewService.getAllInterviews();
    }
    @GetMapping("/status/{status}")
    public List<Interview> getInterviewsByStatus(
            @PathVariable InterviewStatus status) {

        return interviewService.getInterviewsByStatus(status);
    }
    @GetMapping("/count")
    public long getTotalApplications() {
        return interviewService.getTotalApplications();
    }

    @GetMapping("/dashboard")
    public DashboardDTO getDashboard() {
        return interviewService.getDashboard();
    }
}