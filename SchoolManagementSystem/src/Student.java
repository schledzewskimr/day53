public class Student {
    
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create new student by initializing
     * fees for every student is 30000
     * fees paid initially is 0
     * @param id id for the student
     * @param name name of the student
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade) {
        feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * Used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void updateFeesPaid(int fees) {
        
    }
}
