import io.github.primelib.perspective4j.PerspectiveFactory;
import io.github.primelib.perspective4j.api.PerspectiveApi;
import io.github.primelib.perspective4j.api.PerspectiveConsumerApi;
import io.github.primelib.perspective4j.model.AttributeType;
import io.github.primelib.perspective4j.model.Comment;
import io.github.primelib.perspective4j.model.CommentAnalyzeRequest;
import io.github.primelib.perspective4j.model.CommentAnalyzeResult;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class PerspectiveApiTest {
    
    @Test
    public void testConsumerSpecificationApproach() {
        PerspectiveConsumerApi client = PerspectiveFactory.create(spec -> {
            spec.api(PerspectiveConsumerApi.class);
            spec.apiKeyAuth(auth -> {
                auth.apiKey("AIzaSyAoVLjhaHXz0PSffiq2G4zOuYvd2Ee2dgg");
            });
        });
        
        CommentAnalyzeResult result = client.analyzeCommentV1Alpha1(spec -> {
            spec.text("eres idiota");
            spec.languages(Collections.singleton("en"));
            spec.requestedAttributes(Collections.singleton(AttributeType.TOXICITY));
            spec.doNotStore(true);
            spec.spanAnnotations(true);
        });
        
        // Aquí puedes hacer las comprobaciones de la prueba, por ejemplo:
        // assertEquals(expectedValue, result.getSomething());
    }
    
    @Test
    public void testParameterApproach() {
        PerspectiveApi client = PerspectiveFactory.create(spec -> {
            spec.api(PerspectiveApi.class);
            spec.apiKeyAuth(auth -> {
                auth.apiKey("AIzaSyAoVLjhaHXz0PSffiq2G4zOuYvd2Ee2dgg");
            });
        });
        
        CommentAnalyzeResult result =
              client.analyzeCommentV1Alpha1(new CommentAnalyzeRequest(new Comment("me das asco"),
                    Collections.singletonMap(AttributeType.TOXICITY, null), null, null, true, null, null, null));
        
        // De nuevo, aquí puedes hacer las comprobaciones de la prueba.
    }
}