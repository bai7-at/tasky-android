package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class wzb implements Runnable {
    public final /* synthetic */ AtomicReference a;

    public /* synthetic */ wzb(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yzb.o(this.a);
    }
}
