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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttributeScore
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
    "spanScores",
    "summaryScore"
})
@JsonTypeName("AttributeScore")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttributeScore {

    @JsonProperty("spanScores")
    protected List<SpanScore> spanScores;

    @JsonProperty("summaryScore")
    protected Score summaryScore;

    /**
     * Constructs a validated instance of {@link AttributeScore}.
     *
     * @param spec the specification to process
     */
    public AttributeScore(Consumer<AttributeScore> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttributeScore}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttributeScore(Consumer)} instead.
     * @param spanScores spanScores
     * @param summaryScore summaryScore
     */
    @ApiStatus.Internal
    public AttributeScore(List<SpanScore> spanScores, Score summaryScore) {
        this.spanScores = spanScores;
        this.summaryScore = summaryScore;
    }

}
