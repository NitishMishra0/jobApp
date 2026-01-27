package com.nitish.JobApp.job.impl;

import com.nitish.JobApp.job.Job;
import com.nitish.JobApp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImplementation implements JobService {

    private List<Job> jobs=new ArrayList<>();

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        jobs.add(job);
    }
}
