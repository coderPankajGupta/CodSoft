import java.io.*;
import java.util.*;

class countword {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0; // Initialize count to 0
        System.out.println("Enter 1 for entering text 2 for file path ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the choice

        switch (choice) {
            case 1:
                System.out.println("Enter the sentence : ");
                String s = sc.nextLine();
                for (int i = 0; i < s.length(); i++) {
                    if (i == 0 && s.charAt(i) != ' ') {
                        count++;
                    } else if (i > 0 && s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                        count++;
                    }
                }
                System.out.println("Count : " + count);
                break;

            case 2:
                System.out.println("Enter the path of the file : ");
                String path = sc.nextLine();
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    int i = 0;
                    String line;
                    while ((line = br.readLine()) != null) {
                        String words[] = line.split(" ");
                        i = i + words.length;
                    }
                    System.out.println("Count : " + i);
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error reading the file.");
                }
                break;
                
            default: System.exit(0);
        }
    }
}
