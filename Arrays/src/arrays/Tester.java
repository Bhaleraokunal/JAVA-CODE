package arrays;

abstract class Student {
    private String studentName;
    private int[] testScore;
    private String testResult;

    public Student(String studentName) {
        this.studentName = studentName;
        this.testScore = new int [4] ;
    }

    public abstract void generateResult();

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getTestScore() {
        return testScore;
    }

    public void setTestScore(int testNumber, int testScore) {
        this.testScore[testNumber] = testScore;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
}

class UndergraduateStudent extends Student {
    public UndergraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int[] testScore = getTestScore();
        int sum = 0;
        for (int i = 0; i < testScore.length; i++) {
            sum += testScore[i];
        }
        int avg = sum / testScore.length;
        if (avg >= 60)
            setTestResult("Pass");
        else
            setTestResult("Fail");
    }
}

class GraduateStudent extends Student {
    public GraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int[] testScore = getTestScore();
        int sum = 0;
        for (int i = 0; i < testScore.length; i++) {
            sum += testScore[i];
        }
        int avg = sum / testScore.length;
        if (avg >= 70)
            setTestResult("Pass");
        else
            setTestResult("Fail");
    }
}

class Tester {
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);

        undergraduateStudent.generateResult();

        System.out.println("Student name: " + undergraduateStudent.getStudentName());
        System.out.println("Result: " + undergraduateStudent.getTestResult());

        System.out.println();

        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);

        graduateStudent.generateResult();

        System.out.println("Student name: " + graduateStudent.getStudentName());
        System.out.println("Result: " + graduateStudent.getTestResult());
    }
}
