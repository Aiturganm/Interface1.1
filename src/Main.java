import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Aiturgan", "Maksatbek kyzy", "Female", LocalDate.of(2022, 9, 1), new University("KSTU", "Kyrgyzstan", LocalDate.now(), 1970)),
                new Student("Alya", "Kubatova", "Female", LocalDate.of(2022, 9, 1), new University("KGUSTA", "Kyrgystan", LocalDate.now(), 1967)),
                new Student("Canjar", "Kubatova", "Female", LocalDate.of(2020, 9, 1), new College("BGU", "Kyrgystan", LocalDate.now(), 1952)),
                new Student("Dastan", "Kubatova", "Female", LocalDate.of(2021, 9, 1), new University("AUCA", "Kyrgystan", LocalDate.now(), 1969)),
                new Student("Cholponay", "Kubatova", "Female", LocalDate.of(2019, 9, 1), new University("Ala-Too", "Kyrgystan", LocalDate.now(), 1971)),
                new Student("Asel", "Kubatova", "Female", LocalDate.of(2016, 9, 1), new University("KGMA", "Kyrgystan", LocalDate.now(), 1989)),
                new Student("Birlik", "Kubatova", "Female", LocalDate.of(2017, 9, 1), new College("Manas", "Kyrgystan", LocalDate.now(), 1999)),
                new Student("Aigerim", "Kubatova", "Female", LocalDate.of(2018, 9, 1), new University("MUK", "Kyrgystan", LocalDate.now(), 1996)),
                new Student("Erjan", "Kubatova", "Female", LocalDate.of(2019, 9, 1), new University("KNU", "Kyrgystan", LocalDate.now(), 1987)),
                new Student("Ulukbek", "Kubatova", "Female", LocalDate.of(2020, 9, 1), new College("KMA", "Kyrgystan", LocalDate.now(), 1983))
        };

        for (int i = 0; i < students.length; i++) {
            students[i].getStudentsEducationCenter();
        }
        for (int i = 0; i < students.length; i++) {
            students[i].getStudentsStudyingYear();
        }

        getInfo(students);
    }

    public static void getInfo(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println( i+1 + "-student: " + students[i] + "\n");
        }
    }

}