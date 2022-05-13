import java.util.List;

/**
 * Many teachers, many students.
 * implements teachers and student using an ArrayList
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;

    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * 
     * @return list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to the school.
     * @param teacher is the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * 
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }
    /**
     * adds a student to the school.
     * @param student is the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * 
     * @return total money earned
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds total money earned
     * @param MoneyEarned is the money thats to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * 
     * @return total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * subtracts the money spent by the school.
     * @param moneySpent is the money to be subtracted.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}

