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
 * CommentAnalyzeRequest
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
    "comment",
    "requestedAttributes",
    "languages",
    "context",
    "doNotStore",
    "spanAnnotations",
    "communityId",
    "clientToken"
})
@JsonTypeName("CommentAnalyzeRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommentAnalyzeRequest {

    @JsonProperty("comment")
    protected Comment comment;

    /**
     * A map from attribute name to a configuration object. If no configuration options are specified, defaults are used, so the empty object {} is a valid (and common) choice. You can specify multiple attribute names here to get scores from multiple attributes in a single request.
     */
    @JsonProperty("requestedAttributes")
    protected Map<AttributeType, Object> requestedAttributes;

    /**
     * A list of ISO 631-1 two-letter language codes specifying the language(s) that comment is in (for example, "en", "es", "fr", "de", etc). If unspecified, the API will auto-detect the comment language. If language detection fails, the API returns an error. Note: See currently supported languages on the ‘Attributes and Languages’ page. There is no simple way to use the API across languages with production support and languages with experimental support only.
     */
    @JsonProperty("languages")
    protected List<String> languages;

    @JsonProperty("context")
    protected Context context;

    /**
     * Whether the API is permitted to store comment and context from this request. Stored comments will be used for future research and community attribute building purposes to improve the API over time. Defaults to false (request data may be stored). Warning: This should be set to true if data being submitted is private (i.e. not publicly accessible), or if the data submitted contains content written by someone under 13 years old (or the relevant age determined by applicable law in my jurisdiction).
     */
    @JsonProperty("doNotStore")
    protected Boolean doNotStore;

    /**
     * A boolean value that indicates if the request should return spans that describe the scores for each part of the text (currently done at per-sentence level).
     */
    @JsonProperty("spanAnnotations")
    protected Boolean spanAnnotations;

    /**
     * An opaque identifier associating this comment with a particular community within your platform. If set, this field allows us to differentiate comments from different communities, as each community may have different norms.
     */
    @JsonProperty("communityId")
    protected String communityId;

    /**
     * An opaque token that is echoed back in the response. This token can be used to track requests associated with a given project.
     */
    @JsonProperty("clientToken")
    protected String clientToken;

    /**
     * Constructs a validated instance of {@link CommentAnalyzeRequest}.
     *
     * @param spec the specification to process
     */
    public CommentAnalyzeRequest(Consumer<CommentAnalyzeRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CommentAnalyzeRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CommentAnalyzeRequest(Consumer)} instead.
     * @param comment comment
     * @param requestedAttributes A map from attribute name to a configuration object. If no configuration options are specified, defaults are used, so the empty object {} is a valid (and common) choice. You can specify multiple attribute names here to get scores from multiple attributes in a single request.
     * @param languages A list of ISO 631-1 two-letter language codes specifying the language(s) that comment is in (for example, "en", "es", "fr", "de", etc). If unspecified, the API will auto-detect the comment language. If language detection fails, the API returns an error. Note: See currently supported languages on the ‘Attributes and Languages’ page. There is no simple way to use the API across languages with production support and languages with experimental support only.
     * @param context context
     * @param doNotStore Whether the API is permitted to store comment and context from this request. Stored comments will be used for future research and community attribute building purposes to improve the API over time. Defaults to false (request data may be stored). Warning: This should be set to true if data being submitted is private (i.e. not publicly accessible), or if the data submitted contains content written by someone under 13 years old (or the relevant age determined by applicable law in my jurisdiction).
     * @param spanAnnotations A boolean value that indicates if the request should return spans that describe the scores for each part of the text (currently done at per-sentence level).
     * @param communityId An opaque identifier associating this comment with a particular community within your platform. If set, this field allows us to differentiate comments from different communities, as each community may have different norms.
     * @param clientToken An opaque token that is echoed back in the response. This token can be used to track requests associated with a given project.
     */
    @ApiStatus.Internal
    public CommentAnalyzeRequest(Comment comment, Map<AttributeType, Object> requestedAttributes, List<String> languages, Context context, Boolean doNotStore, Boolean spanAnnotations, String communityId, String clientToken) {
        this.comment = comment;
        this.requestedAttributes = requestedAttributes;
        this.languages = languages;
        this.context = context;
        this.doNotStore = doNotStore;
        this.spanAnnotations = spanAnnotations;
        this.communityId = communityId;
        this.clientToken = clientToken;
    }

}
