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
    
    /**
     * keep adding the fees to feesPaid Field
     * add the fees to the fees paid
     * the school is going to receive the funds.
     * 
     * @param fees that the student pays
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * 
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @return name of the student
     */
    public String name() {
        return name;
    }

    /**
     * 
     * @return grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     * 
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * 
     * @return total fees owed by the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * 
     * @return remaining fees owed.
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
    
    public String toString() {
        return "Student's name : " + name + "\nTotal fees paid so far: $" + feesPaid;
    }

}
