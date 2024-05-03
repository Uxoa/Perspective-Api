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
 * ContextEntry
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
    "text",
    "type"
})
@JsonTypeName("ContextEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContextEntry {

    /**
     * The text to score. This is assumed to be utf8 raw text of the text to be checked. Note: Emoji and other non-ascii characters can be included (HTML will probably result in lower performance).
     */
    @JsonProperty("text")
    protected String text;

    @JsonProperty("type")
    protected ContextType type;

    /**
     * Constructs a validated instance of {@link ContextEntry}.
     *
     * @param spec the specification to process
     */
    public ContextEntry(Consumer<ContextEntry> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContextEntry}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContextEntry(Consumer)} instead.
     * @param text The text to score. This is assumed to be utf8 raw text of the text to be checked. Note: Emoji and other non-ascii characters can be included (HTML will probably result in lower performance).
     * @param type type
     */
    @ApiStatus.Internal
    public ContextEntry(String text, ContextType type) {
        this.text = text;
        this.type = type;
    }

}
