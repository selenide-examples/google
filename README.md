Selenide examples: Google search
================================

This is a sample project demonstrating how to test Google search UI with Selenide (Selenium webdriver).

**You can checkout and run it locally with a few minutes.**

### How to run with Gradle

Type from command line for running tests in different browsers:

```
./gradlew chrome
./gradlew firefox
./gradlew ie
./gradlew edge
./gradlew safari
```

### How to run with Maven

Type from command line for running tests in different browsers:

```
mvn clean test -P chrome
mvn clean test -P firefox
mvn clean test -P ie
mvn clean test -P edge
mvn clean test -P safari
```

_Feel free to share your feedback!_

### Video

It's a short video demonstrating how it works:

https://vimeo.com/107647158

### Opa Page Object styles!

The project contains tests in different styles:
 * without page object (selenide_straightforward)
 * with classic _Selenium_ page object
 * with _Selenide_-style page object
