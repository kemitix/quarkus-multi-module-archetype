# Quarkus Multi-module Archetype

This project provides a Maven Archetype for creating a multi-module project with Quarkus.

The modules that are created in the project are:

## parent

This is a common Maven Parent module that is used by all the other modules.

### Dependency Management

We define a `dependencyManagement` section that lists all the other modules in the project. It also includes the JUnit BoM and AssertJ.

### Compiler Plugin

We configure the `maven-compiler-plugin`, with linting for unchecked casts and to show deprecation warnings.

The default Java version is 11.

Source and Report Encoding is set to `UTF-8`.

## service

This is an example module that has only a dependency upon `jakarta.jakartaee-api` (not including `test` scope dependencies).

This module would be for your main business logic. It should not use JAX-RS, however, see the `api` module, next for that.

## api

This is an example module that has only a dependency upon `jakarta.jakartaee-api` (not including `test` scope dependencies).

This module would be for all your REST Resource definitions via JAX-RS.

It has a dependency upon the `service` module, where it should should delegate to once unpacking incoming requests.

## q-runner

This is the Quarkus main module that will produce the executable artiface.

It has a dependency upon `api`.

There should be no code in this module. It exists to provide the Quarkus Runtime dependencies that implement the APIs defined in `jakarta.jakartaee-api`.

## q-tests

This is a Quarkus module that contains Integration tests using the `@QuarkusTest` annotation to test against a bootstrapped copy of the application.

It has a dependency upon `q-runner`.
