package lv.ctco.student;

public class Student {
    private String name;
    private String surname;
    private String university;

    public Student(String name, String surname, String university) {
        this.name = name;
        this.surname = surname;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + university;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
        if (university != null ? !university.equals(student.university) : student.university != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (university != null ? university.hashCode() : 0);
        return result;
    }
}