package com.principal.repaso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.principal.repaso.models.Course;
import com.principal.repaso.respositories.CourseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CourseService extends BaseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course create(Object object) {
        return courseRepository.save((Course) object);
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public Course update(Object object) {
        return courseRepository.save((Course) object);
    }

}
