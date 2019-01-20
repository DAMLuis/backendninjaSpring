package com.udemy.converter;

import com.udemy.entity.Course;
import com.udemy.model.CourseModel;

import org.springframework.stereotype.Component;

@Component("courseConverter")
public class CourseConverter{

    //transformar de una entity a un model
    public CourseModel entity2model(Course course){
        CourseModel courseModel = new CourseModel();
        courseModel.setName(course.getName());
        courseModel.setDescripcion(course.getDescription());
        courseModel.setPrice(course.getPrice());
        courseModel.setHours(course.getHours());
        return courseModel;
    }

    //trasnformar de un model a entity
    public Course model2entity(CourseModel courseModel){
        Course course = new Course();
        course.setName(courseModel.getName());
        course.setDescription(courseModel.getDescripcion());
        course.setPrice(courseModel.getPrice());
        course.setHours(courseModel.getHours());
        return course;
    }


}