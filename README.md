# JDBC
The following steps are required to create a new Database using JDBC application −

Import the packages: Requires that you include the packages containing the JDBC classes needed for database programming. Most often, using import java.sql.* will suffice.

Register the JDBC driver: Requires that you initialize a driver so you can open a communications channel with the database.

Open a connection: Requires using the DriverManager.getConnection() method to create a Connection object, which represents a physical connection with a database server.

Execute a query: Requires using an object of type Statement for building and submitting an SQL statement to insert records into a table.

Clean up the environment: Requires explicitly closing all database resources versus relying on the JVM's garbage collection.
