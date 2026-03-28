package com.sistemas.service.implement;

import com.sistemas.domain.Assessment;
import com.sistemas.repository.AssessmentRepository;
import com.sistemas.service.AssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AssessmentServiceImpl implements AssessmentService {

    private final AssessmentRepository assessmentRepository;

    @Override
    public Assessment create(Assessment assessment) {
        return assessmentRepository.save(assessment);
    }

    @Override
    public List<Assessment> listAll() {
        return assessmentRepository.findAll();
    }

    @Override
    public Assessment search(Long id) {
        Assessment assessment = null;
        Optional<Assessment> assessmentWanted = assessmentRepository.findById(id);
        if (assessmentWanted.isPresent()) {
            assessment = assessmentWanted.get();
        }
        return assessment;
    }

    @Override
    public Assessment update(Assessment assessment) {
        return assessmentRepository.save(assessment);
    }

    @Override
    public void delete(Long id) {
        assessmentRepository.deleteById(id);
    }
}
