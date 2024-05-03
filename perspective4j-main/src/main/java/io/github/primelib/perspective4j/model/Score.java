package io.github.primelib.perspective4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Score
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "value",
    "type"
})
@JsonTypeName("Score")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Score {

    /**
     * The attribute score.
     */
    @JsonProperty("value")
    protected Double value;

    /**
     * This mirrors the requested scoreType for this attribute.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link Score}.
     *
     * @param spec the specification to process
     */
    public Score(Consumer<Score> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Score}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Score(Consumer)} instead.
     * @param value The attribute score.
     * @param type This mirrors the requested scoreType for this attribute.
     */
    @ApiStatus.Internal
    public Score(Double value, String type) {
        this.value = value;
        this.type = type;
    }

}
