package collectionsBasics;

public class Student {

    private Integer mathMarks;
    private Integer physicsMarks;


    public Student(Integer mathMarks, Integer physicsMarks) {
        this.mathMarks = mathMarks;
        this.physicsMarks = physicsMarks;
    }
    
    public Integer getPhysicsMarks() {
        return physicsMarks;
    }
    public void setPhysicsMarks(Integer physicsMarks) {
        this.physicsMarks = physicsMarks;
    }
    public Integer getMathMarks() {
        return mathMarks;
    }
    public void setMathMarks(Integer mathMarks) {
        this.mathMarks = mathMarks;
    }

    @Override
    public String toString() {
        return "Student [mathMarks=" + mathMarks + ", physicsMarks=" + physicsMarks + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mathMarks == null) ? 0 : mathMarks.hashCode());
        result = prime * result + ((physicsMarks == null) ? 0 : physicsMarks.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (mathMarks == null) {
            if (other.mathMarks != null)
                return false;
        } else if (!mathMarks.equals(other.mathMarks))
            return false;
        if (physicsMarks == null) {
            if (other.physicsMarks != null)
                return false;
        } else if (!physicsMarks.equals(other.physicsMarks))
            return false;
        return true;
    }
    
}
