package io.github.primelib.perspective4j.spec;

import io.github.primelib.perspective4j.model.AttributeType;
import io.github.primelib.perspective4j.model.Context;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.processing.Generated;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

/**
 * AnalyzeCommentV1Alpha1Spec
 * <p>
 * Specification for the AnalyzeCommentV1Alpha1 operation.
 * <p>
 * Analyze the comment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyzeCommentV1Alpha1OperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    @NotNull
    private String text;

    /**
     * A list of ISO 631-1 two-letter language codes specifying the language(s) that comment is in (for example, "en", "es", "fr", "de", etc). If unspecified, the API will auto-detect the comment language. If language detection fails, the API returns an error. Note: See currently supported languages on the ‘Attributes and Languages’ page. There is no simple way to use the API across languages with production support and languages with experimental support only.
     */
    @Nullable
    private Set<String> languages;

    /**
     * A set of requested attributes. If no attribute is specified, the API returns all attributes.
     */
    @NotNull
    private Set<AttributeType> requestedAttributes;

    @Nullable
    private Context context;

    /**
     * Whether the API is permitted to store comment and context from this request. Stored comments will be used for future research and community attribute building purposes to improve the API over time. Defaults to false (request data may be stored). Warning: This should be set to true if data being submitted is private (i.e. not publicly accessible), or if the data submitted contains content written by someone under 13 years old (or the relevant age determined by applicable law in my jurisdiction).
     */
    @Nullable
    protected Boolean doNotStore;

    /**
     * A boolean value that indicates if the request should return spans that describe the scores for each part of the text (currently done at per-sentence level).
     */
    @Nullable
    protected Boolean spanAnnotations;

    /**
     * An opaque identifier associating this comment with a particular community within your platform. If set, this field allows us to differentiate comments from different communities, as each community may have different norms.
     */
    @Nullable
    protected String communityId;

    /**
     * An opaque token that is echoed back in the response. This token can be used to track requests associated with a given project.
     */
    @Nullable
    protected String clientToken;

    /**
     * Constructs a validated instance of {@link AnalyzeCommentV1Alpha1OperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AnalyzeCommentV1Alpha1OperationSpec(Consumer<AnalyzeCommentV1Alpha1OperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AnalyzeCommentV1Alpha1OperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param text
     * @param languages
     * @param requestedAttributes
     * @param context
     * @param doNotStore
     * @param spanAnnotations
     * @param communityId
     * @param clientToken
     */
    @ApiStatus.Internal
    public AnalyzeCommentV1Alpha1OperationSpec(String text, Set<String> languages, Set<AttributeType> requestedAttributes, Context context, Boolean doNotStore, Boolean spanAnnotations, String communityId, String clientToken) {
        this.text = text;
        this.languages = languages;
        this.requestedAttributes = requestedAttributes;
        this.context = context;
        this.doNotStore = doNotStore;
        this.spanAnnotations = spanAnnotations;
        this.communityId = communityId;
        this.clientToken = clientToken;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(text, "text is a required parameter!");
        Objects.requireNonNull(requestedAttributes, "requestedAttributes is a required parameter!");
    }
}
