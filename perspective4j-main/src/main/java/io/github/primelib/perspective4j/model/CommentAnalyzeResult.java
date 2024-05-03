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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CommentAnalyzeResult
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
    "attributeScores",
    "languages"
})
@JsonTypeName("CommentAnalyzeResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommentAnalyzeResult {

    @JsonProperty("attributeScores")
    protected Map<String, AttributeScore> attributeScores;

    /**
     * Mirrors the request's languages. If no languages were specified, the API returns the auto-detected language. 
     */
    @JsonProperty("languages")
    protected List<String> languages;

    /**
     * Constructs a validated instance of {@link CommentAnalyzeResult}.
     *
     * @param spec the specification to process
     */
    public CommentAnalyzeResult(Consumer<CommentAnalyzeResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CommentAnalyzeResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CommentAnalyzeResult(Consumer)} instead.
     * @param attributeScores attributeScores
     * @param languages Mirrors the request's languages. If no languages were specified, the API returns the auto-detected language. 
     */
    @ApiStatus.Internal
    public CommentAnalyzeResult(Map<String, AttributeScore> attributeScores, List<String> languages) {
        this.attributeScores = attributeScores;
        this.languages = languages;
    }

}
