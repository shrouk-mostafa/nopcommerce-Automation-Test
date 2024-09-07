# nopcommerce Automation Test

## Overview

The project involves automating and generating a detailed report for a test plan designed to cover all possible test scenarios for an e-commerce application. The goal is to automate testing of the application's major functionalities and ensure comprehensive coverage of test cases. The e-commerce platform includes a login page with a username and password, requiring no additional authentication beyond email and password. All key features of the application will be tested to ensure functionality.


## Table of Contents

- [Requirements](#Requirements)
- [Project Structure](#project-structure)
- [Scenarios covered](Scenarios-covered)
- [Setup and Installation](#setup-and-installation)
- [Running the Tests](#running-the-tests)
- [Reporting](#reporting)
- [Contributing](#contributing)


## Requirements

Before setting up the project, ensure that you have the following installed on your machine:

- **Java JDK 8 or higher**: [Download here](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Apache Maven 3.6.0 or higher**: [Download here](https://maven.apache.org/download.cgi)
- **Google Chrome** (latest version) for running tests in the Chrome browser
- **IntelliJ IDEA** or **Eclipse IDE** (Optional but recommended)
- **Selenium WebDriver**
- **TestNG**
- **cucumber**.

## Project Structure

The project follows a standard Maven structure:

- **src/test/java**: Contains test step definitions, runners, and page classes.
- **src/test/resources**: Contains Cucumber feature files and configuration files.
- **pom.xml**: The Maven Project Object Model file for managing dependencies and plugins.
- **testng.xml**: TestNG suite configuration (optional, if using TestNG with Cucumber).

 ## Scenarios covered
- Guest users could register with valid data successfully
- The user could log in with valid email and password
- The user could log in with an invalid email and password
- User can select Euro currency and verify product prices displaying the Euro symbol
- User could search using product name
- Users could search for products using SKU
- User hovers over a main category and selects a sub-category
- The First slider is clickable on the home page
- The Second slider is clickable on the home page
- The User opens the Facebook link
- The User opens the Twitter link
- The User opens the RSS link
- The User opens the YouTube link
- Add HTC One M8 Android L 5.0 Lollipop to wishlist
- Verify quantity in the wishlist

## Setup and Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
2. **Import the project:**

Open your preferred IDE (IntelliJ IDEA/Eclipse).
Import the project as a Maven project.
3.**Install dependencies:**

Maven will automatically install all required dependencies specified in the pom.xml file.
mvn clean install

### Running the Tests
Using Maven
To run the tests, execute the following command in the terminal:
mvn test

### Using Cucumber
You can also run specific Cucumber scenarios directly from the IDE using the CucumberTestRunner class or by specifying tags:
mvn test -Dcucumber.options="--tags @YourTag"

### Reporting
The framework is configured to generate Cucumber reports. After running the tests, the reports will be available in the target/cucumber-reports directory.

To view the report, open the cucumber-html-reports file located in the target/cucumber-reports directory in your web browser.

### Contributing
Contributions are welcome! Please follow the standard Git workflow:

Fork the repository.
Create a new branch (git checkout -b feature/your-feature-name).
Commit your changes (git commit -m 'Add some feature').
Push to the branch (git push origin feature/your-feature-name).
Open a pull request.


### Explanation:

- **Overview**: A brief description of the project and its purpose.
- **Requirements**: Lists the necessary software to be installed before setting up the project.
- **Project Structure**: Describes the layout of the project directory.
- **Scenarios covered**: Describe all the Scenarios covered in this project.
- **Setup and Installation**: Instructions on how to clone the repository, import the project into an IDE and install dependencies.
- **Running the Tests**: Different ways to run the tests using Maven, TestNG, and Cucumber.
- **Reporting**: Details on where to find test reports and how to view them.
- **Contributing**: Guidelines for contributing to the project.

This `README.md` provides a comprehensive guide for anyone who wants to set up, run, and contribute to the automation project.
