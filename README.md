# Assignment 2 Factory Method and Abstract Factory
Commit: 579812b418b102fb1df2ada263d44b6c73a07f7b

## Project purpose
A logistics application that supports road and sea delivery and can use Windows or macOS UI components.

## Package structure
- `gui/` - Abstract Factory (Button.java, Checkbox.java, GUIFactory.java, MacOSButton.java, MacOSCheckbox.java, MacOSFactory.java, WindowsButton.java, WindowsCheckbox.java, WindowsFactory.java)
- `transport/` - Factory Method (Logistics.java, RoadLogistics.java, SeaLogistics.java, Ship.java, Transport.java, Truck.java)
- `uml/` - UML files
- `DeliveryApplication.java` - Client
- `Main.java` - Startup selection

## Prerequisites
- JDK 17
- Intellij IDEA or another Java IDE

## Build and run instruction
- Run on Intellij IDEA
1. Click green button `Code` and click `Download ZIP`
2. Extract the ZIP 
3. Open in Intellij IDEA or another Java IDE.
4. Run Main.java
- Run on terminal
1. Click green button `Code` and click `Download ZIP`
2. Extract the ZIP to any folder on your device
3. Open a terminal
   ```bash
   cd path/to/extracted/folder
   javac *.java
   java Main.java
   ```
      
## Supported input values
- Delivery mode: `ROAD` or `SEA`
- UI platform: `WINDOWS` or `MACOS`
- Missing or unsupported input values stop the program with clear message.

## Sample run
```
Delivery mode (ROAD or SEA): ROAD
UI platform (WINDOWS or MACOS): WINDOWS
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse
```
