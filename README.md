# 💱 Currency Converter

A simple console-based Currency Converter application built in **Java** that converts amounts between major world currencies.

---

## 📌 Features

- Convert between **INR, USD, EUR, and GBP**
- Clean object-oriented design using separate `Currency` and `Converter` classes
- Simple command-line interface using `Scanner`
- Conversion logic based on USD as the base currency

---

## 🏗️ Project Structure

Currency_converter/
│
├── Currency.java     # Holds currency name and exchange rate
├── Converter.java    # Contains conversion logic
└── Mainclass.java    # Entry point — handles user input/output

## ⚙️ How It Works

1. Predefined exchange rates are set relative to USD
2. User enters the **source currency**, **target currency**, and **amount**
3. The amount is first converted to USD, then to the target currency
4. The converted result is displayed on the console

---

## 💻 How to Run
```bash
# Compile
javac Currency_converter/Mainclass.java

# Run
java Currency_converter.Mainclass
```

## 📊 Supported Currencies & Rates

| Currency | Code | Rate (to USD) |
|----------|------|---------------|
| Indian Rupee | INR | 83.0 |
| US Dollar | USD | 1.0 |
| Euro | EUR | 0.92 |
| British Pound | GBP | 0.78 |

---

## 🛠️ Technologies Used

- **Java** (Core)
- **OOP Concepts** — Classes, Encapsulation
- **java.util.Scanner** — for user input

---

## 🚀 Future Improvements

- Add more currencies (JPY, AUD, CAD, etc.)
- Fetch **live exchange rates** via an API
- Build a GUI using JavaFX or Swing

---

## 👨‍💻 Author

- **GitHub:** [@gouthu07](https://github.com/gouthu07)