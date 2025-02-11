package com.tie.김영한의실전자바_기본편.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; // 변수 선언 // Student 타입을 받을 수 있는 변수를 선언
        student1 = new Student(); // Student 인스턴스 생성 // 설계도인 클래스를 기반으로 객체(인스턴스)를 생성
                                  // new 는 새로 생성한다를 뜻함. new Student()는 Student 클래스 정보를 기반으로 새로운 객체를 생성한다는 의미
                                  // 객체를 생성할 때 new 클래스명()을 사용, 마지막에 () 추가해야 함
                                  // Student 클래스는 name, age, grade 멤버 변수를 가지고, 이 변수를 사용하는 데 필요한 메모리 공간도 함께 확보함
        // Student student1 = x001;
        // student1 = x001;

        // 객체를 생성하면 자바는 메모리 어딘가에 이 객체에 접근할 수 있는 참조값(주소)을 반환 -> 주소 == x001
        // new 키워드를 통해 객체가 생성되고 참조값을 반환 -> 선언한 변수인 Student student1 에 생성된 객체의 참조값(x001)을 보관함
        // student1 변수는 메모리에 존재하는 실제 Student 객체(인스턴스)의 참조값을 가지고 있음

        student1.name = "학생1"; // 1. student1 객체의 name 멤버 변수에 값 대입
        // x001.name = "학생1";  // 2. 변수에 있는 참조값을 통해 실제 객체에 접근, 해당 객체의 name 멤버 변수에 값 대입

        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        // Student student2 = x002;
        // student2 = x002;

        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

        // 1. 객체 값 읽기
        // System.out.println("이름:" + student1.name);
        // 2. 변수에 있는 참조값을 통해 실제 객체에 접근하고, name 멤버 변수에 접근
        // System.out.println("이름:" + x001.name);
        // 3. 객체의 멤버 변수의 값을 읽어옴
        // System.out.println("이름:" + "학생1");
    }

    // 클래스와 사용자 정의타입
    // 1. 타입은 데이터의 종류나 형태를 나타냄
    // 2. int 라고 하면 정수타입, String 이라고 하면 문자 타입
    // 3. 학생(student)이라는 타입을 만든다?
    // 4. 클래스를 사용하면 int, String과 같은 타입을 직접 만들 수 있음
    // 5. 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요. 이 설계도가 바로 클래스
    // 6. 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 함
    // 7. 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음대로 정의할 수 있음

    // 클래스 : 설계도
    // 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스 둘 다 같은 의미로 사용
    // 학생이라는 클래스를 기반으로 학생1, 학생2 객체 또는 인스턴스가 생성됨

    // 참조값을 변수에 보관하는 이유
    // 객체를 생성하는 new Student() 코드 자체는 이름이 없음.. 이 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만듦
    // 따라서 생성한 객체에 접근할 수 있는 방법이 필요.. 이런 이유로 객체를 생성할 때 반환되는 참조값을 보관해야 함
    // 참조값을 통해 실제 메모리에 존재하는 객체에 접근할 수 있음!!

}