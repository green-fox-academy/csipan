public class Main {
  public static void main(String[] args) {
    Student firstStudent = new Student("John Doe", 20, "male", "BME");
    firstStudent.introduce();
    System.out.println(firstStudent);
    Student secondStudent = firstStudent.clone();
    secondStudent.introduce();
    System.out.println(secondStudent);
  }
}
