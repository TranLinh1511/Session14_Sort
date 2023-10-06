package baiTap.bai4;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FootballTeamSort {
    public static List<FootballTeam> footballTeams = new ArrayList<>();

    public static void main(String[] args) {
        addTeam();
        insertionSort(footballTeams);
        for (FootballTeam footballTeam:footballTeams) {
            System.out.println(footballTeam.toString());
        }
    }

    private static void addTeam() {
        int teamNumber = 5;

        for (int i = 0; i < teamNumber; i++) {
            FootballTeam footballTeam = new FootballTeam();
            footballTeam.setId(i);
            footballTeam.setNumerOfPlayer((int) (Math.random() * 100));
            footballTeam.setName(generateRandomString(20));
            footballTeam.setScore((int) (Math.random() * 100));
            footballTeams.add(footballTeam);
        }
    }


    private static void pubbleSort(List<FootballTeam> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j).getScore() > arr.get(j + 1).getScore()) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void selectionSort(List<FootballTeam> arr) {
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

    private static void insertionSort(List<FootballTeam> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            double key = arr.get(i).getScore();
            int j = i - 1;
            while (j >= 0 && arr.get(j).getScore() > key) {
                swap(arr, j, j + 1);
                j = j - 1;
            }
        }
    }

    private static void swap(List<FootballTeam> arr, int i, int j) {
        FootballTeam temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }
}
