package com.usaa.api;

import com.usaa.Challenge;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

@RestController
@RequestMapping("/interviews")
public class InterviewController {

    @GetMapping(path="/{interviewId}", produces=APPLICATION_JSON_VALUE)
    public List<Challenge> getInterview(final @NonNull @PathVariable String interviewId) {
        // call InterviewService method to get the data
        return null;
    }
}
