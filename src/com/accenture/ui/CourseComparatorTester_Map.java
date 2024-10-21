package com.accenture.ui;
/*
Set Assignment:
    Create CourseComparatorTester class.
    Create 3 course objects.
    Add all objects into a set.
    Pass the set to
    printAllCoursesFeesSorted() method,
    printAllCoursesNamesSorted() method and
    printAllCoursesDurationSorted() method of service class to print the details.
 */
import com.accenture.settask.Course;
import com.accenture.settask.CourseService;

import java.util.HashSet;
import java.util.Set;

public class CourseComparatorTester_Map {

    public static void main(String[] args) {
        // Create 3 List objects
        Course c1 = new Course(
                101,
                "Java Programming",
                40,
                400
        );
        Course c2 = new Course(
                102,
                "React Programming",
                35,
                350
        );
        Course c3 = new Course(
                103,
                "Web Development",
                30,
                300
        );

        // Add all objects into a list.
        Set<Course> courseList = new HashSet<>();
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);

        /*
         Pass the set to the CourseService
         method to service class to print the details.
        */
        CourseService courseService = new CourseService();

        courseService.printAllCoursesFeesSorted(courseList);
        courseService.printAllCoursesNamesSorted(courseList);
        courseService.printAllCoursesDurationSorted(courseList);
    }

}