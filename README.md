# Quarkus Multi-module Archetype

![Sonatype Nexus (Release)](https://img.shields.io/nexus/r/https/oss.sonatype.org/net.kemitix/quarkus-multi-module-archetype.svg?style=for-the-badge)
![Maven Central](https://img.shields.io/maven-central/v/net.kemitix/quarkus-multi-module-archetype.svg?style=for-the-badge)

This project provides a Maven Archetype for creating a multi-module project with Quarkus.

## Usage:

Replace `${RELEASE}` with the latest version as shown above.

```bash
mvn archetype:generate
  -DarchetypeGroupId=net.kemitix
  -DarchetypeArtifactId=quarkus-multi-module-archetype
  -DarchetypeVersion=${RELEASE}
```

See the generated project's [README](./src/main/resources/archetype-resources/README.md) for details.

## Structure/Dependencies

The generated project has the following structure and dependencies.

![Dependency Graph](./reactor-graph.png)
