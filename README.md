# CoffeeShop Java Application ☕

Welcome to the CoffeeShop Java Application! 

This simple Java app allows users to order coffee with customizable options. ☕

![The Coffee Shop](<The CoffeeShop Java Webpage Demo.png>)

## Summary

The CoffeeShop app is a Java-based application with a MySQL database. It includes:

- **Frontend:** An optional HTML form for ordering coffee.
- **Backend:** Components for processing orders and managing inventory.

## Step-by-Step Instructions

### 1. Install Required Software

- **Java Development Kit (JDK):** Download the latest JDK from the [official Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html) or use OpenJDK.
- **Visual Studio Code:** Download and install VSCode from the [official website](https://code.visualstudio.com/).
- **MySQL Database:** Install MySQL and create a database named "coffeeshop."

### 2. Set Up Project in VSCode

1. **Open VSCode:** Launch VSCode.
2. **Install Extensions:**
   - Install the "Java Extension Pack" by Microsoft for Java development support.
   - Install "Maven for Java" extension to support Maven projects.
3. **Open Project Folder:**
   - Create a new folder for your project.
   - Open VSCode and go to `File > Open Folder`, then select your project folder.
4. **Create POM File:**
   - Inside your project folder, create a file named `pom.xml` and add Maven dependencies.
5. **Create Java Package:**
   - Inside the `src/main/java` folder, create the package structure `com/coffeeshop`.
   - Create Java files (`Coffee.java`, `Order.java`, `CoffeeDao.java`, `CoffeeService.java`, `DBUtil.java`, `CoffeeShopApp.java`) inside the appropriate packages.
6. **Create Resources Folder:**
   - Inside your project folder, create a folder named `resources`.
   - Create a file named `application.properties` inside the `resources` folder.
7. **Create Web Folder (Optional):**
   - Inside your project folder, create a folder named `web`.
   - Create a file named `index.html` inside the `web` folder.

### 3. Configure Database Connection

**Configure application.properties:**

- Open the `application.properties` file in the `resources` folder.
- Add the following properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/coffeeshop
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 4. Implement Application Logic


Implement Logic in CoffeeShopApp.java:

Complete the logic for user interaction in CoffeeShopApp.java. Use Scanner for simplicity.

### 5. Run the Application
Open the terminal in VSCode.
Navigate to your project folder.
Run the following command to compile and run the application:
mvn clean install
java -jar target/your_project_name.jar

### 6. Create Frontend (Optional)

1. **Open the `index.html` file in the `web` folder.**
2. **Create a simple HTML form for ordering coffee.**
3. **Use a simple web server to serve the HTML file.** For example, install the "Live Server" extension in VSCode.

### 7. Test the Application

1. **Open a web browser and go to `http://localhost:8080`** (assuming your frontend is running on this port).
2. **Test the ordering process and check if the data is stored in the database.**



=======
Use a simple web server to serve the HTML file. For example, install the "Live Server" extension in VSCode.
Step 7: Test the Application
Test the Application:
Open a web browser and go to http://localhost:8080 (assuming your frontend is running on this port).
Test the ordering process and check if the data is stored in the database.
These steps provide a basic setup for a Java application in VSCode. For a more comprehensive, production-ready application, consider using Spring Boot for backend development and a dedicated frontend framework for better user interfaces.



