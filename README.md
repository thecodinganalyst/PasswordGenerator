
## Build the jar
From the password-generator folder:
```
mvn clean package
```
Maven will create a “fat” jar with dependencies at:
```
target/PasswordGenerator-1.0.0-jar-with-dependencies.jar
```

## Run and generate hashes

Example:
```
java -jar target/PasswordGenerator-1.0.0-jar-with-dependencies.jar "ThisIsMyPassword123!"
```

Output will look like:
```
Raw    : ThisIsMyPassword123!
Encoded: {bcrypt}$2a$10$xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

```
