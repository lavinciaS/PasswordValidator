# 🔐 Java Password Validator Lab

### 🧠 Objective
Create a Java program that validates passwords based on common cybersecurity standards to promote secure password hygiene. This project focuses on control flow, character classification, and secure coding techniques in Java.

---

### 📌 Password Criteria
The password must meet the following requirements:
- ✅ 8–10 characters in length  
- ✅ At least 1 uppercase letter  
- ✅ At least 1 lowercase letter  
- ✅ At least 2 special characters (non-alphanumeric)  
- ✅ May contain any number of digits

---

### 🛠️ Tools Used
- Java (JDK 17 or later recommended)
- BlueJ IDE (or any Java editor of choice)
- Git & GitHub (for version control and showcasing the project)

---

### 🧪 Lab Steps

#### ✅ Step 1: Prompt the User
- Use the `Scanner` class to ask the user for password input.
- Store the input using `nextLine()`.

#### ✅ Step 2: Validate Password Length
- Use `.length()` to determine if the password has 8–10 characters.
- Provide feedback if the length is invalid.

#### ✅ Step 3: Loop Through Each Character
- Use a `for` loop to examine each character of the password.
- Use the `Character` class to check if it's:
  - Uppercase
  - Lowercase
  - Digit
  - Special character (anything else)

#### ✅ Step 4: Combine the Checks
- Validate all password requirements in one `if` condition.
- If valid: display success.
- If invalid: show detailed feedback (what's missing).

#### 🔁 Bonus: Loop Until Valid
- Optionally, wrap the entire process in a `while` loop to prompt users again until a valid password is entered.

---

### 🧠 Concepts Covered
- Java Control Flow (if/else, loops)
- String and Character Handling
- Secure Input Validation
- Cybersecurity Principles (Password Strength, Authentication Hygiene)

---

### 📷 Demo (Optional)
_Add a screenshot or short clip of your working program here._

---

### 📂 File Structure

