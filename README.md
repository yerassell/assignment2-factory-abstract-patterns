# Assignment 2 Factory Method and Abstract Factory

## Commit


## Project purpose
A logistics application that supports road and sea delivery and can use Windows or macOS UI components.

## Package structure
- gui/ - Abstract Factory (Button.java, Checkbox.java, GUIFactory.java, MacOSButton.java, MacOSCheckbox.java, MacOSFactory.java, WindowsButton.java, WindowsCheckbox.java, WindowsFactory.java)
- transport/ - Factory Method (Logistics.java, RoadLogistics.java, SeaLogistics.java, Ship.java, Transport.java, Truck.java)
- DeliveryApplication.java - Client
- Main.java - Startup selection

## Prerequisites
- JDK 17

## Build and run instruction
1. Clone the repository
2. Open in Intellij IDEA or another Java IDE.
3. Run Main.java

## Supported input values
- Delivery mode (ROAD or SEA): ROAD or SEA
- UI platform (WINDOWS or MACOS): WINDOWS or MACOS

## Sample run
Delivery mode (ROAD or SEA): ROAD
UI platform (WINDOWS or MACOS): WINDOWS
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse
