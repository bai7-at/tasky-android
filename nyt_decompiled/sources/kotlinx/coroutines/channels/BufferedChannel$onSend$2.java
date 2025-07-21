package kotlinx.coroutines.channels;

import defpackage.it2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class BufferedChannel$onSend$2 extends FunctionReferenceImpl implements it2 {
    public static final BufferedChannel$onSend$2 INSTANCE = new BufferedChannel$onSend$2();

    BufferedChannel$onSend$2() {
        super(3, BufferedChannel.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.it2
    public final Object invoke(BufferedChannel<?> bufferedChannel, Object obj, Object obj2) {
        Object processResultSelectSend;
        processResultSelectSend = bufferedChannel.processResultSelectSend(obj, obj2);
        return processResultSelectSend;
    }
}
