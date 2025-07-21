package kotlinx.coroutines.reactive;

import defpackage.g86;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: classes5.dex */
public final class ConvertKt {
    public static final /* synthetic */ g86 asPublisher(ReceiveChannel receiveChannel, CoroutineContext coroutineContext) {
        return PublishKt.publish(coroutineContext, new ConvertKt$asPublisher$1(receiveChannel, null));
    }

    public static /* synthetic */ g86 asPublisher$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return asPublisher(receiveChannel, coroutineContext);
    }
}
