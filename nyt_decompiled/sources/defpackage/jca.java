package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class jca extends ThreadLocal {
    jca(kca kcaVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
