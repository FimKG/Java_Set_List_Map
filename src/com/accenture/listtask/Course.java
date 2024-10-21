package com.accenture.listtask;

public class Course {

    private int courseId;
    private String courseName;
    private int courseDuration;
    private int courseFee;

    public Course(
            int courseId,
            String courseName,
            int courseDuration,
            int courseFee ) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public int getCourseFee() {
        return courseFee;
    }

}
