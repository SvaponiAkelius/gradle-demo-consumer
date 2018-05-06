# io.github.svaponi:gradle-demo-consumer

Java/Gradle demo application. The application uses an external library, which is retrieved from a remote Maven repository (Artifactory). 

Library available under [SvaponiAkelius/gradle-demo](https://github.com/SvaponiAkelius/gradle-demo).

### How to

Show Gradle tasks

```bash
gradle tasks --all
```

Build and test project

```bash
gradle clean build
```

If you get an error, you probably need to define some config in order to connect to Artifactory.

```bash
echo '
artifactory_baseurl=YOUR_ARTIFACTORY_URL
artifactory_username=YOUR_ACTIVE_DIRECTORY_USER
artifactory_password=********
' > ~/.gradle/gradle.properties
```
> You can also define a local file `./gradle.properties`.

> **ATTENTION**: the properties `artifactory_baseurl`, `artifactory_username` and `artifactory_password` are not standard. They are used only by our `build.gradle`.

Package

```bash
gradle clean test jar
```

Run application

```bash
java -jar build/libs/gradle-demo-consumer-1.0.jar
```

Run application with another name

```bash
java -Dname=FOOBAR -jar build/libs/gradle-demo-consumer-1.0.jar
```
