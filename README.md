# WAES assignment test suite

Automation framework for WAES assignment

## Getting Started

This framework is meant to be used for testing [WAES](https://waesworks.bitbucket.io) Login application.

### Prerequisites

[Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html)

[Allure](http://allure.qatools.ru/) Reports Framework (See Allure Install)

## Allure Install - Scoop Install (Windows)

### Prerequisites

[Powershell 5](https://aka.ms/wmf5download)

### Scoop Install

From Powershell run

```
iwr -useb get.scoop.sh | iex
```

### Allure Install

Then run

```
scoop install allure
```

### Run tests

From root folder

Run mvn test for running all suite

```
mvn test
```

Run mvn test -Dtest for running a suite

```
mvn test -Dtest={name of runner}
```

The following runners are available

* LoginTests
* SignUpTests
* ExtraTests

Example:

```
mvn test -Dtest=LoginTests
```

Also the folder 'allure-results' will be created in root with xml files

### Run/Serve Reports

From Powershell run

```
allure serve /home/path/to/project/allure-results/
```