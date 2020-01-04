# SpringBoot Webflux

```bash
# postgres db schema migration
./gradlew -Dflyway.configFiles=src/main/resources/application.properties flywayMigrate

# build
./gradlew build

# run and watch
./gradlew bootRun -t
```