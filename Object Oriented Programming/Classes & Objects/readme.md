Food Ordering Console Application
This is a simple, menu-driven Java console application that simulates a basic food ordering system. It demonstrates the use of Java classes, objects, constructors (including overloaded and copy constructors), static variables, and basic user input handling via Scanner and a switch statement.

🍽️ Features
The application provides a variety of ordering options based on predefined menu items and allows for personalized orders and order status checks.

Core Functionality
Fixed Combos: Order predefined meal sets (Pizza + Burger + Fries, Pizza + Burger, or just Burger).

Special Item: Order a special, static menu item.

Takeaway Registration: Option to register for a takeaway order.

Personalized Order: Place an order with add-ons, specific coke type, payment preference, and contact number.

Reorder: Place a previous complex order using a copy constructor.

Order Status: Check the status of a placed order.

Class Structure
Menu: The primary class for handling standard food orders. It features multiple overloaded constructors to handle different combinations of items and a copy constructor for reordering.

Menu1: A class that extends Menu to handle personalized orders, including extra details like add-ons, coke type, payment method, and phone number.

Main: Contains the application loop, menu display, and user interaction logic using a switch statement.

⚙️ How to Run
Prerequisites
Java Development Kit (JDK): Ensure you have JDK 8 or later installed on your system.

Compilation and Execution
Create the Directory Structure: The code uses a package structure. Create the directories: packages/revision/clasobj.

Place Files: Save the three Java files (Main.java, Menu.java, Menu1.java) inside the clasobj directory.

Compile: Navigate to the root directory where packages is located and compile the files:

javac packages/revision/clasobj/*.java

Run: Execute the main class:

java packages.revision.clasobj.Main

Follow the on-screen prompts to place an order!
