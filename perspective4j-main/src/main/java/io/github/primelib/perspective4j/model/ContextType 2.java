package io.github.primelib.perspective4j.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ContextType
 * 
 *
 */
@JsonTypeName("ContextType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum ContextType {
    PLAIN_TEXT("PLAIN TEXT"),
    HTML("HTML");

    private final String value;
}
