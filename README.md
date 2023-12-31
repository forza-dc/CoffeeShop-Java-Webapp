<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CoffeeShop Java Application</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f8f9fa;
            padding: 30px;
        }

        h1, h2 {
            color: #343a40;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
        }

        .step {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 20px;
        }

        .optional {
            color: #6c757d;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="display-4">CoffeeShop Java Application</h1>

        <p class="lead">Welcome to the CoffeeShop Java Application! This simple Java app allows users to order coffee with customizable options. Follow the steps below to set up and run the application using Visual Studio Code.</p>

        <h2 class="mt-4">Summary</h2>
        <p class="lead">The CoffeeShop app is a Java-based application with a MySQL database. It includes a frontend component for ordering coffee and backend components for processing orders and managing inventory.</p>

        <div class="step">
            <h2>Step 1: Install Required Software</h2>
            <ol>
                <li><strong>Java Development Kit (JDK):</strong> Install the latest JDK from the official Oracle website or use OpenJDK.</li>
                <li><strong>Visual Studio Code:</strong> Download and install VSCode from the official website.</li>
                <li><strong>MySQL Database:</strong> Install MySQL and create a database named "coffeeshop."</li>
            </ol>
        </div>

        <div class="step">
            <h2>Step 2: Set Up Project in VSCode</h2>
            <ol>
                <li><strong>Open VSCode:</strong> Launch VSCode.</li>
                <li><strong>Install Extensions:</strong>
                    <ul>
                        <li>Install the "Java Extension Pack" by Microsoft for Java development support.</li>
                        <li>Install "Maven for Java" extension to support Maven projects.</li>
                    </ul>
                </li>
                <li><strong>Open Project Folder:</strong>
                    <ul>
                        <li>Create a new folder for your project.</li>
                        <li>Open VSCode and go to File &gt; Open Folder, then select your project folder.</li>
                    </ul>
                </li>
                <li><strong>Create POM File:</strong>
                    <ul>
                        <li>Inside your project folder, create a file named <code>pom.xml</code> and add Maven dependencies.</li>
                    </ul>
                </li>
                <li><strong>Create Java Package:</strong>
                    <ul>
                        <li>Inside the <code>src/main/java</code> folder, create the package structure <code>com/coffeeshop</code>.</li>
                        <li>Create Java files (Coffee.java, Order.java, CoffeeDao.java, CoffeeService.java, DBUtil.java, CoffeeShopApp.java) inside the appropriate packages.</li>
                    </ul>
                </li>
                <li><strong>Create Resources Folder:</strong>
                    <ul>
                        <li>Inside your project folder, create a folder named <code>resources</code>.</li>
                        <li>Create a file named <code>application.properties</code> inside the <code>resources</code> folder.</li>
                    </ul>
                </li>
                <li><strong>Create Web Folder:</strong>
                    <ul>
                        <li>Inside your project folder, create a folder named <code>web</code>.</li>
                        <li>Create a file named <code>index.html</code> inside the <code>web</code> folder.</li>
                    </ul>
                </li>
            </ol>
        </div>

        <div class="step">
            <h2>Step 3: Configure Database Connection</h2>
            <pre><code>Configure application.properties:
Open the application.properties file in the resources folder.
Add the following properties:
<code>spring.datasource.url=jdbc:mysql://localhost:3306/coffeeshop
spring.datasource.username=your_username
spring.datasource.password=your_password</code></pre>
        </div>

        <div class="step">
            <h2>Step 4: Implement Application Logic</h2>
            <p>Implement Logic in CoffeeShopApp.java: Complete the logic for user interaction in CoffeeShopApp.java. Use Scanner for simplicity.</p>
        </div>

        <div class="step">
            <h2>Step 5: Run the Application</h2>
            <pre><code>Run the Application:
Open the terminal in VSCode.
Navigate to your
