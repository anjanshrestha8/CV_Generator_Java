import java.util.Scanner;

public class CVGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect personal information
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        // Collect education information
        System.out.print("Enter your highest degree: ");
        String degree = scanner.nextLine();

        System.out.print("Enter your major: ");
        String major = scanner.nextLine();

        System.out.print("Enter your university: ");
        String university = scanner.nextLine();

        System.out.print("Enter the year of graduation: ");
        int graduationYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Collect work experience information
        System.out.println("\nEnter Work Experience (Press Enter for each entry; type 'done' to finish):");
        StringBuilder workExperience = new StringBuilder();
        String entry;
        while (true) {
            entry = scanner.nextLine();
            if (entry.equalsIgnoreCase("done")) {
                break;
            }
            workExperience.append("- ").append(entry).append("\n");
        }

        // Collect skills information
        System.out.println("\nEnter Skills (Press Enter after each skill; type 'done' to finish):");
        StringBuilder skills = new StringBuilder();
        while (true) {
            entry = scanner.nextLine();
            if (entry.equalsIgnoreCase("done")) {
                break;
            }
            skills.append("- ").append(entry).append("\n");
        }

        // Generate the CV
        System.out.println("\nGenerated CV:");
        System.out.println("=====================");
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("\nEducation:");
        System.out.println(degree + " in " + major);
        System.out.println(university + ", " + graduationYear);
        System.out.println("\nWork Experience:");
        System.out.println(workExperience.toString());
        System.out.println("\nSkills:");
        System.out.println(skills.toString());
        System.out.println("=====================");

        // Close the scanner
        scanner.close();
    }
}
