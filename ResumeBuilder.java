import java.util.Scanner;

public class ResumeBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Resume Builder!");

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter your education: ");
        String education = scanner.nextLine();

        System.out.print("Enter your work experience: ");
        String workExperience = scanner.nextLine();

        System.out.print("Enter your skills: ");
        String skills = scanner.nextLine();

        // Generate the resume
        String resume = generateResume(fullName, email, phoneNumber, education, workExperience, skills);

        // Display the resume
        System.out.println("\n=====================");
        System.out.println("Resume");
        System.out.println("=====================");
        System.out.println(resume);
    }

    private static String generateResume(String fullName, String email, String phoneNumber, String education,
                                          String workExperience, String skills) {
        StringBuilder resumeBuilder = new StringBuilder();
        resumeBuilder.append("Name: ").append(fullName).append("\n");
        resumeBuilder.append("Email: ").append(email).append("\n");
        resumeBuilder.append("Phone: ").append(phoneNumber).append("\n\n");
        resumeBuilder.append("Education: ").append(education).append("\n\n");
        resumeBuilder.append("Work Experience: ").append(workExperience).append("\n\n");
        resumeBuilder.append("Skills: ").append(skills).append("\n");

        return resumeBuilder.toString();
    }
}
