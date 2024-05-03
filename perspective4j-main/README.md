# *Perspective4J*

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/perspective4j)](https://central.sonatype.com/artifact/io.github.primelib/perspective4j)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/perspective4j/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/perspective4j)

> A java library for the [PerspectiveAPI](https://www.perspectiveapi.com/).

## Installation

```gradle
implementation("io.github.primelib:perspective4j:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/perspective4j).

## Usage

*Consumer Specification Approach*

```java
PerspectiveConsumerApi client = PerspectiveFactory.create(spec -> {
    spec.api(PerspectiveConsumerApi.class);
    spec.apiKeyAuth(auth -> {
        auth.apiKey("<apiKey>");
    });
});

CommentAnalyzeResult result = client.analyzeCommentV1Alpha1(spec -> {
    spec.text("<text>");
    spec.languages(Collections.singleton("en"));
    spec.requestedAttributes(Collections.singleton(AttributeType.TOXICITY));
    // do not store for research purposes, if data being submitted is private (i.e. not publicly accessible), or if the data submitted contains content written by someone under 13 years old (or the relevant age determined by applicable law in my jurisdiction)
    spec.doNotStore(true);
    spec.spanAnnotations(true); // includes begin and end index for detected spans
});
```

*Parameter Approach*

```java
PerspectiveApi client = PerspectiveFactory.create(spec -> {
    spec.api(PerspectiveApi.class);
    spec.apiKeyAuth(auth -> {
        auth.apiKey("<apiKey>");
    });
});

CommentAnalyzeResult result = client.analyzeCommentV1Alpha1(new CommentAnalyzeRequest(new Comment("<text>"), Collections.singletonMap(AttributeType.TOXICITY, null), null, null, true, null, null, null));
```

**_NOTE:_** The  `Parameter Approach` can break if the API changes. The `Consumer Specification Approach` is more resilient to API changes.

## Links

- [Documentation](https://primelib.github.io)
- [Contribute](https://primelib.github.io/contribution/)

## License

Released under the [MIT License](./LICENSE).
