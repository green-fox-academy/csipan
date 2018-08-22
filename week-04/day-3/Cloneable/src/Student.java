public class Student extends Person implements Cloneable{

  String previousOrganization;
  int skippedDays;

  public void getGoal() {
    System.out.println( "Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I am " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public Student clone() {
    Student name = new Student(this.name, this.age, this.gender, this.previousOrganization);
    return name;
  }
}
