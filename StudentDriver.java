package Array;
public class StudentDriver {
    public static void main(String[] args) {
        Student studentList[]= new Student[3];
        Student student1 = new Student(1,"abc",22);
        Student student2 = new Student(2,"xyz",23);
        Student student3 = new Student(3,"mno",24);
//      Adding custom object of an array
//      Added Object of Student class in Array
        studentList[0]=student1;
        studentList[1]=student2;
        studentList[2]=student3;

        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getSal());
    }
}
