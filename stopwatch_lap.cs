using System;
using System.Diagnostics;

class StopwatchLap {
    static void Main() {
        Stopwatch stopwatch = new Stopwatch();
        Console.WriteLine("⏱️ Press ENTER to start, LAP, and stop.");
        Console.ReadLine();
        stopwatch.Start();

        while (true) {
            Console.ReadLine();
            if (stopwatch.IsRunning) {
                Console.WriteLine($"⏳ Lap Time: {stopwatch.Elapsed}");
            } else {
                Console.WriteLine("🚀 Stopwatch stopped.");
                break;
            }
        }
    }
}
