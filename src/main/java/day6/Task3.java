package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.FIO = "Иванова Мария Ивановна";
        teacher.object = "Математика";
        Student student = new Student();
        String FIOStud = student.FIOstudent;
        student.setFIOstudent("Дураков Дурак Иванович");
        teacher.evaluate(3, student.getFIOstudent());
    }

    public static class Teacher {
        String FIO;
        String object;
        String result;

        public void evaluate(int point, String FIOStudent) {
            if (2 <= point && point <= 5) {
                if (point == 2) {
                    result = "неудовлетворительно";
                }
                if (point == 3) {
                    result = "удовлетворительно";
                }
                if (point == 4) {
                    result = "хорошо";
                }
                if (point == 5) {
                    result = "отлично";
                }
                System.out.println("Преподаватель " + FIO + " оценил студента с именем " + FIOStudent + " по предмету " + object + " на оценку " + result + ".");
            } else
                System.out.println("Неправильная оценка");

        }
    }


    public static class Student {
        String FIOstudent;

        public void setFIOstudent(String FIOstudent) {
            this.FIOstudent = FIOstudent;
        }

        public String getFIOstudent() {
            return FIOstudent;
        }


    }
}

