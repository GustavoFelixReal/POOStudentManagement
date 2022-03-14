package Exercicio09.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
  private int index = 0;
  private Student[] students = new Student[50];

  private Scanner scanner = new Scanner(System.in);

  private String inputName() {
    System.out.println("Student name:");

    return scanner.nextLine();
  }

  private String inputBirth() {
    System.out.println("Student birth:");

    return scanner.nextLine();
  }

  private String inputAR() {
    System.out.println("Student AR:");

    return scanner.nextLine();
  }

  private ArrayList<Student> findStudents(String ar) {
    ArrayList<Student> foundStudents = new ArrayList<Student>();

    for (Student student : students) {
      if (student != null) {
        if (student.getAr().equals(ar)) {
          foundStudents.add(student);
        }
      }
    }

    return foundStudents;
  }

  private void create() {
    String name = inputName();
    String birth = inputBirth();
    String ar = inputAR();

    Student student = new Student();

    student.setName(name);
    student.setBirth(birth);
    student.setAr(ar);
    student.setId(index);

    students[index] = student;

    index++;
  }

  private void update() {
    String ar = inputAR();

    ArrayList<Student> foundStudents = findStudents(ar);

    Student student = foundStudents.get(0);

    String name = inputName();
    String birth = inputBirth();

    students[(int) student.getId()].setName(name);
    students[(int) student.getId()].setBirth(birth);

    students[(int) student.getId()].toString();
  }

  private void delete() {
    String ar = inputAR();

    ArrayList<Student> foundStudents = new ArrayList<Student>();

    for (int i = 0; i < students.length; i++) {

      if (students[i] != null) {
        if (students[i].getAr().equals(ar)) {
          foundStudents.add(students[i]);
          students[i] = null;
        }
      }
    }

    for (Student foundStudent : foundStudents) {
      System.out.println(foundStudent.getName() + " foi deletado com sucesso.");
    }
  }

  private void list() {
    String ar = inputAR();

    ArrayList<Student> foundStudents = findStudents(ar);

    for (Student foundStudent : foundStudents) {
      System.out.println(foundStudent.toString());
    }
  }

  public void menu() {
    boolean controller = true;

    while (controller) {
      System.out.println(
          "Choose an option:\n" +
              "- (C)riar \n" +
              "- (E)xibir \n" +
              "- (R)emover \n" +
              "- (A)tualizar \n" +
              "- (S)air \n");

      String cappitalizedLetter = scanner.nextLine().toUpperCase();
      char letter = cappitalizedLetter.charAt(0);

      switch (letter) {
        case 'C':
          create();
          break;
        case 'E':
          list();
          break;
        case 'R':
          delete();
          break;
        case 'A':
          update();
          break;
        case 'S':
          controller = false;
          break;
        default:
          System.out.println("Invalid option.");
      }
    }
  }
}
