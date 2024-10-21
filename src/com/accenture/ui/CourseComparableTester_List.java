package com.accenture.ui;
/*
List Assignment:

    Create CourseComparableTester class.
    Create 3 course objects.
    Add all objects into a list.
    Pass this list to printAllCoursesSorted() method of service class to print course name and fees.
 */
import com.accenture.listtask.Course;
import com.accenture.listtask.CourseService;

import java.util.ArrayList;
import java.util.List;

public class CourseComparableTester_List {

    public static void main(String[] args) {
        // Create 3 List objects
        Course c1 = new Course(
                101,
                "Java Programming",
                30,
                300
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
                40,
                400
        );

        // Add all objects into a list.
        List<Course> courseList = new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);

        // Pass the list to the service method to print sorted courses
        CourseService.printAllCoursesSorted(courseList);
    }

}
