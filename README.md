
---

# Hibernate TP Project

This project demonstrates a basic setup of Hibernate ORM with MySQL database, along with JUnit tests for entity operations. You can set this up in IntelliJ IDEA, Eclipse, or Visual Studio Code and run the tests to ensure the functionality.

## Requirements

- Java JDK (version 8 or above)
- Maven (for dependency management)
- MySQL database
- Hibernate ORM
- IntelliJ IDEA, Eclipse, or Visual Studio Code

## Setup Instructions

### 1. Clone the Repository

First, clone the repository to your local machine:

```bash
git clone https://github.com/AhmedFatrah2001/tpHibernate.git
cd tpHibernate
```

### 2. Open the Project in Your IDE

#### IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Choose `File -> Open` and navigate to the folder where you cloned the project.
3. IntelliJ will automatically detect the Maven project. Wait for Maven to finish downloading the dependencies.

#### Eclipse

1. Open Eclipse.
2. Go to `File -> Import -> Existing Maven Projects`.
3. Browse to the folder where you cloned the project and select it.
4. Click `Finish`. Eclipse will download the Maven dependencies.

#### Visual Studio Code

1. Open Visual Studio Code.
2. Install the `Java Extension Pack` from the Extensions tab if you don't have it installed.
3. Go to `File -> Open Folder` and select the project folder.
4. VS Code will detect the Maven project and download the dependencies.

### 3. Database Setup

1. Ensure MySQL is installed on your machine.
2. Create a new database:

   ```sql
   CREATE DATABASE java;
   ```

3. Modify the `hibernate.cfg.xml` file (located in `src/main/resources`):

   ```xml
   <property name="hibernate.connection.url">
       jdbc:mysql://localhost:3306/java?zeroDateTimeBehavior=convertToNull
   </property>
   <property name="hibernate.connection.username">YOUR_USERNAME</property>
   <property name="hibernate.connection.password">YOUR_PASSWORD</property>
   ```

   Replace `YOUR_USERNAME` and `YOUR_PASSWORD` with your actual MySQL credentials.

### 4. Run the Application

To run the application, ensure that you have a proper database connection, and the necessary tables will be generated by Hibernate based on the entities.

### 5. Running the Tests

#### IntelliJ IDEA

1. Right-click the `test` folder in the project view.
2. Choose `Run 'All Tests'` to run all the JUnit tests.

#### Eclipse

1. Right-click the `test` folder in the Project Explorer.
2. Choose `Run As -> JUnit Test` to run all tests.

#### Visual Studio Code

1. Open the Test Explorer (`Java: Show Test Explorer` from the Command Palette).
2. Run the tests from the test explorer window.

### 6. Troubleshooting

- If you encounter a `Table not found` error, ensure that your database is properly set up and that Hibernate is configured correctly to create the tables.
- Ensure that the MySQL service is running on your machine.

---