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
 * SpanScore
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
    "begin",
    "end",
    "score"
})
@JsonTypeName("SpanScore")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpanScore {

    /**
     * The beginning of the span (inclusive). Note: This information is only available if the request has spanAnnotations set to true.
     */
    @JsonProperty("begin")
    protected Integer begin;

    /**
     * The end of the span (exclusive). Note: This information is only available if the request has spanAnnotations set to true.
     */
    @JsonProperty("end")
    protected Integer end;

    @JsonProperty("score")
    protected Score score;

    /**
     * Constructs a validated instance of {@link SpanScore}.
     *
     * @param spec the specification to process
     */
    public SpanScore(Consumer<SpanScore> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpanScore}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpanScore(Consumer)} instead.
     * @param begin The beginning of the span (inclusive). Note: This information is only available if the request has spanAnnotations set to true.
     * @param end The end of the span (exclusive). Note: This information is only available if the request has spanAnnotations set to true.
     * @param score score
     */
    @ApiStatus.Internal
    public SpanScore(Integer begin, Integer end, Score score) {
        this.begin = begin;
        this.end = end;
        this.score = score;
    }

}
