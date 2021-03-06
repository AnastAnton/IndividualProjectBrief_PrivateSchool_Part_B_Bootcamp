package models;

public class StudentsPerCourse {

    private int studentId;
    private int courseId;

    public StudentsPerCourse(int studentId, int courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "StudentsPerCourse{" + "studentId=" + studentId + ", courseId=" + courseId + '}';
    }

}
