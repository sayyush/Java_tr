package day22staticblockconstructors;

public class StudentRunner {
    public static void main(String[] args) {

        Student std1 = new Student("Ali Can",13,7,"AC13G7","Istanbul");
Student std2 = new Student("Tom Hanks", 21, "TH21G12");
        System.out.println(std1);
        System.out.println(std2);// Student{name='Tom Hanks', age=21, grade=0, stdId='TH21G12', address='null'}

    }




}
