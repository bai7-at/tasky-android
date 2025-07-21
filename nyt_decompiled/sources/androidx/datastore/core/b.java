package androidx.datastore.core;

import defpackage.zq3;

/* loaded from: classes.dex */
final class b extends d {
    private final Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Throwable th) {
        super(null);
        zq3.h(th, "finalException");
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }
}
