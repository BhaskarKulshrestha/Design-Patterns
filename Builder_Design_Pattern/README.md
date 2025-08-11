# Builder Design Pattern

Alright — let’s make your **Builder Design Pattern** example professional.
I’ll give you:

1. A **detailed README** (in Markdown so you can paste into GitHub or keep in your project).
2. A **full explanation** of how it works.
3. A **class diagram** for visual clarity.

---

## 📄 README.md

```markdown
# 🍔 Builder Design Pattern in Java

## 📌 Overview
The **Builder Design Pattern** is a **creational design pattern** that allows you to create complex objects step-by-step, without having to pass many parameters into a constructor.  
This makes object creation more **readable**, **flexible**, and **maintainable**.

In this example, we use the Builder Pattern to create a **Burger** object with various optional ingredients.

---

## 🚀 Features of Builder Pattern
- **Readable object creation** using chained methods.
- **Avoids telescoping constructors problem** (too many parameters in constructors).
- Allows **optional parameters** to be set only when needed.
- Creates **immutable objects** if designed properly.

---

## 📂 Project Structure


builder-demo/
│
├── BuilderPatternDemo.java   # Main file containing both Burger and demo class
└── README.md                 # Documentation

````

---

## 🧱 How It Works

### 1. **Product (`Burger`)**
The `Burger` class is the object we want to create.  
It has **required** and **optional** parameters:
- Required: `size`
- Optional: `cheese`, `lettuce`, `tomato`, `drink`

Its constructor is **private**, so it cannot be directly instantiated from outside.

---

### 2. **Builder (Nested Static Class)**
The `Builder` class:
- Accepts required parameters in its constructor.
- Provides **chainable methods** for optional parameters.
- Has a `build()` method that creates the actual `Burger` object.

---

### 3. **Client (`BuilderPatternDemo`)**
The client code uses the builder to **create a burger step-by-step**:
```java
Burger myBurger = new Burger.Builder("Large")
                        .cheese(true)
                        .lettuce(false)
                        .tomato(true)
                        .drink("Coke")
                        .build();
````

This is far easier to read and understand than a constructor with 5+ parameters.

---

## 📊 UML Class Diagram

```plaintext
+------------------+
|     Burger       |
+------------------+
| - size: String   |
| - cheese: bool   |
| - lettuce: bool  |
| - tomato: bool   |
| - drink: String  |
+------------------+
| + toString()     |
| - Burger(Builder)|
+------------------+
        ▲
        |
        | contains
        |
+----------------------+
| Burger.Builder       |
+----------------------+
| - size: String       |
| - cheese: bool       |
| - lettuce: bool      |
| - tomato: bool       |
| - drink: String      |
+----------------------+
| + Builder(String)    |
| + cheese(boolean)    |
| + lettuce(boolean)   |
| + tomato(boolean)    |
| + drink(String)      |
| + build(): Burger    |
+----------------------+

+----------------------+
| BuilderPatternDemo   |
+----------------------+
| + main(String[])     |
+----------------------+
```

---

## 🔄 Flow of Execution

1. **Client** creates a `Burger.Builder` object with **required parameter** (`size`).
2. **Optional parameters** are set using chainable methods (`cheese()`, `lettuce()`, etc.).
3. `.build()` is called, which:

   * Passes the `Builder` object to `Burger`'s private constructor.
   * Creates a **Burger** object with the set parameters.
4. The burger object is **ready to use**.

---

## 💻 Example Output

```text
Burger [Size=Large, Cheese=true, Lettuce=false, Tomato=true, Drink=Coke]
```

---

## 📌 Advantages

* **Readable**: Methods clearly describe what each parameter does.
* **Flexible**: You can skip optional parameters.
* **Maintainable**: Adding new parameters doesn’t break existing code.

---

## ⚠️ Disadvantages

* More code compared to simple constructors.
* May be overkill for objects with very few parameters.

---

## 📜 License

This project is for learning purposes. You can freely use or modify it.

````

---

## 🔍 How It’s Working (Detailed Explanation)
Let’s walk step-by-step for this line:

```java
Burger myBurger = new Burger.Builder("Large")
                        .cheese(true)
                        .lettuce(false)
                        .tomato(true)
                        .drink("Coke")
                        .build();
````

1. **`new Burger.Builder("Large")`**
   Creates a `Builder` object with `"Large"` as the required size.

2. **`.cheese(true)`**
   Sets the `cheese` field in the `Builder` to `true`.
   Returns the **same builder object** (this allows chaining).

3. **`.lettuce(false)`**
   Sets `lettuce` in the builder to `false`.

4. **`.tomato(true)`**
   Sets `tomato` in the builder to `true`.

5. **`.drink("Coke")`**
   Sets `drink` to `"Coke"`.

6. **`.build()`**
   Calls the private `Burger` constructor with the builder as an argument.
   Copies all builder values into the new `Burger` instance.
   Returns the final, ready-to-use `Burger` object.

---

If you want, I can make a **nice PNG class diagram** for you so you can directly put it into your project README instead of ASCII art.
Do you want me to prepare that visual diagram next?
