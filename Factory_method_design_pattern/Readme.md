# Factory Method Design Pattern in Java

## 📘 Overview

This is a simple implementation of the **Factory Method Design Pattern** in Java using a **Notification System**. It demonstrates how to delegate object creation to a factory method, enabling flexibility, extensibility, and loose coupling.

---

## 📦 Project Structure

```
FactoryMethodDemo/
├── Main.java
├── Notification.java
├── EmailNotification.java
├── SMSNotification.java
├── PushNotification.java
└── NotificationFactory.java
```


---

## 🧠 What is the Factory Method Pattern?

The **Factory Method** pattern defines an interface for creating an object but lets subclasses alter the type of objects that will be created.

> Instead of instantiating classes directly, a factory method is used to return an instance of a class based on input parameters.

---

## 🚀 How It Works in This Project

- `Notification` is the **interface** (product).
- `EmailNotification`, `SMSNotification`, and `PushNotification` are **concrete implementations**.
- `NotificationFactory` contains the **factory method** that creates the desired notification type.
- `Main` is the **client** that uses the factory to get the object and calls its `notifyUser()` method.

---

## 🧾 Output

When you run the program:

```.java
Sending an Email Notification
Sending an SMS Notification
Sending a Push Notification
```

---

## 📋 How to Run

### 1. Prerequisites

- Java JDK 8 or above
- Visual Studio Code or any Java IDE

### 2. Compile

```bash
javac *.java

java Main
```

## 🔧 Design Pattern Benefits
✅ Loose Coupling.</br>
✅ Extensibility – Add new notification types without changing client code.</br>
✅ Adheres to Open-Closed Principle.

## 📐 Class Diagram (UML)
```
+---------------------+
|   <<interface>>     |
|    Notification     |
+---------------------+
| + notifyUser()      |
+---------------------+
         ▲
         |
  +------+---------+-----------+
  |                |           |
  |                |           |
+-----------+ +-------------+ +----------------+
| EmailNoti | | SMSNoti     | | PushNoti       |
+-----------+ +-------------+ +----------------+
| +notifyUser() | +notifyUser() | +notifyUser() |
+-----------+ +-------------+ +----------------+

              +------------------------+
              |  NotificationFactory   |
              +------------------------+
              | +createNotification()  |
              +------------------------+

                         ▲
                         |
                   +-------------+
                   |    Main     |
                   +-------------+
                   |  main()     |
                   +-------------+

```

![alt text](<Screenshot 2025-06-22 at 4.46.02 PM.png>)