# HomeOffice assignment

  - Created using Java Serenity BDD framework for UI and Serenity Restassured for API tasks
  - Lean Page Object Model with action classes is implemented enabling good framework maintainabiity and execution performance.
  - This framework will log both the API requests and responses in the report which makes easy to analyse test failures.
  - Soft assertions are implemented using assertJ library, which enables readability and collects all assertion errors instead of terminating execution at the first one.
  - Local selenium grid Docker is configured with Chrome and Firefox and can be extended to other supported browsers. 

## Prerequisites and limitations

 - Maven version 3 or above and and JDK version 8 or above are already installed on the host machine.
 - Tests currently are supported on Windows/Mac environments with browser support currently limited to latest versions of Chrome, IE and Firefox, but can easily be extended to Opera and other supported browsers.
 
### Environment-specific configurations and other default config
 Application's environments are configured in `test/resources/serenity.conf` file, so that the tests can be run in different environments.

## Executing the tests

Ensure you are in the project root directory and run the following command from the command line.

To execute both API and UI tests
```
$ mvn clean verify
```

To execute only API tests
```
$ mvn clean verify -Dcucumber.filter.tags="@apitests"
```

To execute only UI tests
```
$ mvn clean verify -Dcucumber.filter.tags="@uitests"
```

By default, the tests will run using Chrome. You can run them in Firefox by overriding the `driver` system property, e.g.
```
$  mvn clean verify -Dwebdriver.driver=firefox
```

Screenshots are by default enabled only for test failures to improve execution speed, to enable screenshots for each step during the tests, the following command line parameter need to be passed.
```
$ mvn clean verify -Dserenity.take.screenshots=FOR_EACH_ACTION
```

Once executed the test results will be stored in this path `target/site/serenity/index.html` 

Run the following command from project root directory to view the results after execution.
```
$ open target/site/serenity/index.html
```

Selenium grid is configured with Docker. To execute the tests on docker remotely, following commands need to be executed (Docker should be installed on the host machine).

```
$ docker-compose up -d
$ docker-compose scale chrome=3
$ mvn clean verify -Dwebdriver.remote.url=http://localhost:4444/wd/hub -Dwebdriver.remote.driver=chrome
```

Once tests are executed in Docker container, shutdown the Selenium grid with the following command,
```
$ docker-compose down
```