package io.github.primelib.perspective4j.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AttributeType
 * 
 *
 */
@JsonTypeName("AttributeType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum AttributeType {
    TOXICITY("TOXICITY"),
    SEVERE_TOXICITY("SEVERE_TOXICITY"),
    IDENTITY_ATTACK("IDENTITY_ATTACK"),
    INSULT("INSULT"),
    PROFANITY("PROFANITY"),
    THREAT("THREAT"),
    TOXICITY_EXPERIMENTAL("TOXICITY_EXPERIMENTAL"),
    SEVERE_TOXICITY_EXPERIMENTAL("SEVERE_TOXICITY_EXPERIMENTAL"),
    IDENTITY_ATTACK_EXPERIMENTAL("IDENTITY_ATTACK_EXPERIMENTAL"),
    INSULT_EXPERIMENTAL("INSULT_EXPERIMENTAL"),
    PROFANITY_EXPERIMENTAL("PROFANITY_EXPERIMENTAL"),
    THREAT_EXPERIMENTAL("THREAT_EXPERIMENTAL"),
    SEXUALLY_EXPLICIT("SEXUALLY_EXPLICIT"),
    FLIRTATION("FLIRTATION");

    private final String value;
}
