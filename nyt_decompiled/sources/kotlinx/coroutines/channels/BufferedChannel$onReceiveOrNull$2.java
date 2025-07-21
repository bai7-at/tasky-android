package kotlinx.coroutines.channels;

import defpackage.it2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class BufferedChannel$onReceiveOrNull$2 extends FunctionReferenceImpl implements it2 {
    public static final BufferedChannel$onReceiveOrNull$2 INSTANCE = new BufferedChannel$onReceiveOrNull$2();

    BufferedChannel$onReceiveOrNull$2() {
        super(3, BufferedChannel.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.it2
    public final Object invoke(BufferedChannel<?> bufferedChannel, Object obj, Object obj2) {
        Object processResultSelectReceiveOrNull;
        processResultSelectReceiveOrNull = bufferedChannel.processResultSelectReceiveOrNull(obj, obj2);
        return processResultSelectReceiveOrNull;
    }
}
