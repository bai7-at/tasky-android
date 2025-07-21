package kotlinx.coroutines.stream;

import java.util.stream.Stream;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class StreamKt {
    public static final <T> Flow<T> consumeAsFlow(Stream<T> stream) {
        return new StreamFlow(stream);
    }
}
