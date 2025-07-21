package kotlinx.coroutines.channels;

import defpackage.it2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class BufferedChannel$onReceiveCatching$2 extends FunctionReferenceImpl implements it2 {
    public static final BufferedChannel$onReceiveCatching$2 INSTANCE = new BufferedChannel$onReceiveCatching$2();

    BufferedChannel$onReceiveCatching$2() {
        super(3, BufferedChannel.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.it2
    public final Object invoke(BufferedChannel<?> bufferedChannel, Object obj, Object obj2) {
        Object processResultSelectReceiveCatching;
        processResultSelectReceiveCatching = bufferedChannel.processResultSelectReceiveCatching(obj, obj2);
        return processResultSelectReceiveCatching;
    }
}
