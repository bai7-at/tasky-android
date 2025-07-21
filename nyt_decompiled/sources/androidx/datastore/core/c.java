package androidx.datastore.core;

import defpackage.zq3;

/* loaded from: classes.dex */
final class c extends d {
    private final Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Throwable th) {
        super(null);
        zq3.h(th, "readException");
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }
}
