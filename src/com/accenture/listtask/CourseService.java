package com.accenture.listtask;
/*
    printAllCoursesSorted() method
    which helps to sort the courses based on
    course fee and prints course names and fees
*/
import java.util.Comparator;
import java.util.List;

public class CourseService {

    public static void printAllCoursesSorted(List<Course> courses) {
        // List<Course> course= List.of();
        courses.sort(Comparator.comparingInt(Course::getCourseFee));
        
        for (Course course : courses) {
            System.out.println(
                    "Course Name: " + course.getCourseName() +
                    ", Fee: " + course.getCourseFee());
        }
    }
}
