import java.util.ArrayList;
import java.util.Scanner;

class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n📝 To-Do List Menu:\n1️⃣ Add Task\n2️⃣ View Tasks\n3️⃣ Remove Task\n4️⃣ Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("📝 Enter task: ");
                tasks.add(sc.nextLine());
            } else if (choice == 2) {
                System.out.println("📋 Tasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            } else if (choice == 3) {
                System.out.print("❌ Enter task number to remove: ");
                int index = sc.nextInt();
                if (index > 0 && index <= tasks.size()) {
                    tasks.remove(index - 1);
                    System.out.println("✅ Task removed.");
                } else {
                    System.out.println("❌ Invalid task number.");
                }
            } else if (choice == 4) {
                System.out.println("👋 Exiting...");
                break;
            } else {
                System.out.println("❌ Invalid option!");
            }
        }

        sc.close();
    }
}
