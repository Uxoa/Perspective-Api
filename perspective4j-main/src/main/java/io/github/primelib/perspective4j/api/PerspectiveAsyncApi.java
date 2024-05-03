package io.github.primelib.perspective4j.api;

import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.perspective4j.model.CommentAnalyzeRequest;
import io.github.primelib.perspective4j.model.CommentAnalyzeResult;
import java.util.concurrent.CompletableFuture;
import feign.RequestLine;
import feign.Headers;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface PerspectiveAsyncApi {

    /**
     * Analyze the comment
     *
     * @param commentAnalyzeRequest  (required)
     */
    @RequestLine("POST /v1alpha1/comments:analyze")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<CommentAnalyzeResult> analyzeCommentV1Alpha1(@NotNull CommentAnalyzeRequest commentAnalyzeRequest);

}
