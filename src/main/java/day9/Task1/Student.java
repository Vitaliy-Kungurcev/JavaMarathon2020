package day9.Task1;

import com.sun.org.apache.xerces.internal.impl.xs.models.XSCMUniOp;

public class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setNameGroup(String groupName) {
        this.groupName = groupName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }

}
