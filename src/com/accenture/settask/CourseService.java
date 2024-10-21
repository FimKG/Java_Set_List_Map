package com.accenture.settask;
/*
    Create a CourseService class with
    A printAllCoursesFeesSorted() method which helps to sort the courses based on course fee and prints.
    A printAllCoursesNamesSorted() method which helps to sort the courses based on course name and prints.
    A printAllCoursesDurationSorted() method which helps to sort the courses based on course duration and prints.
 */
import java.util.*;

public class CourseService {

    // Method to sort the courses based on course fee and prints
    public void printAllCoursesFeesSorted(Set<Course> courses) {
        Set<Course> sortedByFee = new TreeSet<>(Comparator.comparingInt(Course::getCourseFee));
        sortedByFee.addAll(courses);
        System.out.println("Courses sorted by fee:");
        for (Course course : sortedByFee) {
            System.out.println(course);
        }
    }

    // Method to sort the courses based on course name and prints.
    public void printAllCoursesNamesSorted(Set<Course> courses) {
        Set<Course> sortedByName = new TreeSet<>(Comparator.comparing(Course::getCourseName));
        sortedByName.addAll(courses);
        System.out.println("Courses sorted by name:");
        for (Course course : sortedByName) {
            System.out.println(course);
        }
    }

    // Method to sort the courses based on course duration and prints.
    public void printAllCoursesDurationSorted(Set<Course> courses) {
        List<Course> sortedByDuration = new ArrayList<>(courses);
        sortedByDuration.addAll(courses);
        System.out.println("Courses sorted by duration:");
        for (Course course : sortedByDuration) {
            System.out.println(course);
        }
    }

}
