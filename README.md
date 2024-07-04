Selenide examples: Google search
================================

This is a sample project demonstrating how to test Google search UI with Selenide (Selenium webdriver).

**You can checkout and run it locally with a few minutes.**

### How to run with Gradle

Type from command line for running tests in different browsers:

```bash
./gradlew chrome
```
```bash
./gradlew firefox
```
```bash
./gradlew ie
```
```bash
./gradlew edge
```
```bash
./gradlew safari
```

### How to run with Maven

Type from command line for running tests in different browsers:

```bash
./mvnw clean test -P chrome
```
```bash
./mvnw clean test -P firefox
```
```bash
./mvnw clean test -P ie
```
```bash
./mvnw clean test -P edge
```
```bash
./mvnw clean test -P safari
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
