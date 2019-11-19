# FizzBuzz Coding Kata

Initially this is in scala and using both Feature level-driven development (a.k.a. BDD) and unit level-driven development (a.k.a. TDD)

The scala version for now is using an older version of Scala (2.11.8) and Java 1.8 because that was what the client was using at the time when I was doing technical coaching with them.

To run the mavan you will need to ensure you have Java 1.8 installed and have a JAVA_HOME variable path setup that points to it. I also have scoverage and sonarqube working but you will need to setup a sonarqube server and configure it so that it will analyze the code. 

Here is the command I use to build and test based on my environment setup.

JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64 mvn clean scoverage:report sonar:sonar