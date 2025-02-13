package com.tie.김영한의실전자바_기본편.class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); // x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // Student 클래스를 기반으로 student1, student2 인스턴스를 생성한다.
        // 그리고 필요한 값을 채운다.

        // 배열에 참조값 대입
        // Student 를 담을 수 있는 배열을 생성하고, 해당 배열에 student1, student2 인스턴스를 보관
        Student[] students = new Student[2];
        // 배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없다는 null 로초기화

        // Student 타입의 변수는 Student 인스턴스의 참조값을 보관
        // Student 배열의 각 항목도 Student 타입의 변수 일 뿐..
        students[0] = student1;
        students[1] = student2;
        // students[0] = x001;
        // students[1] = x002;

        // 주의 !
        // 변수에는 인스턴스 자체가 들어있는 것이 아니라, 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다.
        // 따라서 대입(=) 시에 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.

        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
    }

}