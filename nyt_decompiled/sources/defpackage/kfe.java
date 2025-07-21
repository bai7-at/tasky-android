package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class kfe extends hfe {
    final /* synthetic */ qg8 b;
    final /* synthetic */ hfe c;
    final /* synthetic */ ufe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kfe(ufe ufeVar, qg8 qg8Var, qg8 qg8Var2, hfe hfeVar) {
        super(qg8Var);
        this.b = qg8Var2;
        this.c = hfeVar;
        this.d = ufeVar;
    }

    @Override // defpackage.hfe
    public final void a() {
        Object obj;
        AtomicInteger atomicInteger;
        gfe gfeVar;
        obj = this.d.f;
        synchronized (obj) {
            try {
                ufe.n(this.d, this.b);
                atomicInteger = this.d.k;
                if (atomicInteger.getAndIncrement() > 0) {
                    gfeVar = this.d.b;
                    gfeVar.c("Already connected to the service.", new Object[0]);
                }
                ufe.p(this.d, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
