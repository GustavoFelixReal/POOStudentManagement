package Exercicio09.controller;

public class Student {
  private long id;
  private String birth;
  private String ar;
  private String name;

  public String toString() {
    return "ID: " + this.id + "\n" +
        "Name: " + this.name + "\n" +
        "Birth: " + this.birth + "\n" +
        "AR: " + this.ar;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBirth() {
    return this.birth;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

  public String getAr() {
    return this.ar;
  }

  public void setAr(String ar) {
    this.ar = ar;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
