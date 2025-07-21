package kotlinx.coroutines.channels;

import defpackage.it2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class BufferedChannel$onReceive$2 extends FunctionReferenceImpl implements it2 {
    public static final BufferedChannel$onReceive$2 INSTANCE = new BufferedChannel$onReceive$2();

    BufferedChannel$onReceive$2() {
        super(3, BufferedChannel.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.it2
    public final Object invoke(BufferedChannel<?> bufferedChannel, Object obj, Object obj2) {
        Object processResultSelectReceive;
        processResultSelectReceive = bufferedChannel.processResultSelectReceive(obj, obj2);
        return processResultSelectReceive;
    }
}
