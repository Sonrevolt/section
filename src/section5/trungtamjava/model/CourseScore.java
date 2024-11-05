package section5.trungtamjava.model;

import java.util.Scanner;

public class CourseScore {
    private int id;
    private double score;
    private String name;

    public CourseScore(){}

    public CourseScore(int id, double score, String name){
        this.id = id;
        this.score = score;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        while (true) {
            System.out.print("Enter Score (0 - 10): ");
            score = scanner.nextDouble();
            if (score >= 0 && score <= 10) {
                break;
            } else {
                System.out.println("Score must be between 0 and 10. Please enter again.");
            }
        }
    }

    public void info() {
        System.out.println("\nCourseScore Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);

        if (score < 5) {
            System.out.println("Rating: Yếu");
        } else if (score >= 5 && score < 7) {
            System.out.println("Rating: Trung Bình");
        } else if (score >= 7 && score < 8) {
            System.out.println("Rating: Khá");
        } else if (score >= 8 && score < 9) {
            System.out.println("Rating: Giỏi");
        } else if (score >= 9) {
            System.out.println("Rating: Xuất Sắc");
        }
    }
}
