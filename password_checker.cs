using System;
using System.Text.RegularExpressions;

class PasswordChecker {
    static void Main() {
        Console.Write("🔑 Enter a password: ");
        string password = Console.ReadLine();

        if (password.Length < 8) Console.WriteLine("❌ Too short! Must be at least 8 characters.");
        else if (!Regex.IsMatch(password, "[A-Z]")) Console.WriteLine("❌ Must contain at least one uppercase letter.");
        else if (!Regex.IsMatch(password, "[a-z]")) Console.WriteLine("❌ Must contain at least one lowercase letter.");
        else if (!Regex.IsMatch(password, "[0-9]")) Console.WriteLine("❌ Must contain at least one number.");
        else if (!Regex.IsMatch(password, "[^a-zA-Z0-9]")) Console.WriteLine("❌ Must contain at least one special character.");
        else Console.WriteLine("✅ Strong password!");
    }
}
