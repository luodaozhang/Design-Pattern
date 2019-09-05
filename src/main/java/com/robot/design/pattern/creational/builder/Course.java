package com.robot.design.pattern.creational.builder;

public class Course {

    private String courseName;
    private String courseArticle;
    private String courseTeacher;
    private String coursePPT;
    private String courseQA;

    public Course(CourseBuilder courseBuilder){
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQA = courseBuilder.courseQA;
        this.courseTeacher = courseBuilder.courseTeacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseTeacher='" + courseTeacher + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuilder{

        private String courseName;
        private String courseArticle;
        private String courseTeacher;
        private String coursePPT;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCourseTeacher(String courseTeacher) {
            this.courseTeacher = courseTeacher;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }

}
