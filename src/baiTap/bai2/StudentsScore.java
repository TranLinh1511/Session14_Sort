package baiTap.bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentsScore {
    public static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        addStudent();
        insertionSort(students);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    private static void addStudent() {
        int studentNumber = 5;

        for (int i = 0; i < studentNumber; i++) {
            Student student = new Student();
            student.setId(i);
            student.setName("Hoa");
            student.setScore(Math.random() * 10);
            students.add(student);
        }
    }

    private static void pubbleSort(List<Student> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j).getScore() > arr.get(j + 1).getScore()) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void selectionSort(List<Student> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int minValue = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j).getScore() > arr.get(minValue).getScore()) {
                    minValue = j;
                }
            }
            if (minValue != i) {
                swap(arr, i, minValue);
            }
        }

    }

    private static void insertionSort(List<Student> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            double key = arr.get(i).getScore();
            int j = i - 1;
            while (j >= 0 && arr.get(j).getScore() < key) {
                swap(arr, j, j + 1);
                j = j - 1;
            }
        }
    }

    private static void swap(List<Student> arr, int i, int j) {
        Student temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

}
