using System;

class QuizGame {
    static void Main() {
        Console.WriteLine("🎓 What is the capital of France?");
        Console.WriteLine("A) Berlin");
        Console.WriteLine("B) Madrid");
        Console.WriteLine("C) Paris");
        Console.WriteLine("D) Rome");

        Console.Write("Your answer: ");
        string answer = Console.ReadLine().ToUpper();

        if (answer == "C") {
            Console.WriteLine("✅ Correct!");
        } else {
            Console.WriteLine("❌ Wrong! The correct answer is C) Paris.");
        }
    }
}
