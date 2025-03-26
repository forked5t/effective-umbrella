tasks = []

while True:
    print("\n📝 To-Do List")
    print("1️⃣ Add Task")
    print("2️⃣ View Tasks")
    print("3️⃣ Exit")
    
    choice = input("Choose an option: ")
    
    if choice == "1":
        task = input("Enter a new task: ")
        tasks.append(task)
        print("✅ Task added!")
    elif choice == "2":
        print("\n📋 Your Tasks:")
        for i, task in enumerate(tasks, 1):
            print(f"{i}. {task}")
    elif choice == "3":
        print("👋 Goodbye!")
        break
    else:
        print("❌ Invalid choice, try again.")
