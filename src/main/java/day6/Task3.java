package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setFIO("Иванова Мария Ивановна");
        teacher.setObject("Математика");
        Student student = new Student();
        String FIOStud = student.getFIOstudent();
        student.setFIOstudent("Дураков Дурак Иванович");
        teacher.evaluate(3, student.getFIOstudent());
    }
}
    class Teacher {
        public String getFIO() {
            return FIO;
        }

        public void setFIO(String FIO) {
            this.FIO = FIO;
        }

        public String getObject() {
            return object;
        }

        public void setObject(String object) {
            this.object = object;
        }

        private String FIO;
        private String object;
        private String result;

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


    class Student {
        private String FIOstudent;

        public void setFIOstudent(String FIOstudent) {
            this.FIOstudent = FIOstudent;
        }

        public String getFIOstudent() {
            return FIOstudent;
        }


    }


