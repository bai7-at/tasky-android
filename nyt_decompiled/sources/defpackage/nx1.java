package defpackage;

import defpackage.r42;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class nx1 implements r42.c {
    private final MutableSharedFlow a;
    private final SharedFlow b;

    public nx1() {
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(100, 0, null, 6, null);
        this.a = MutableSharedFlow$default;
        this.b = MutableSharedFlow$default;
    }

    @Override // r42.c
    public void a(r42.b bVar) {
        zq3.h(bVar, "milestone");
        this.a.tryEmit(bVar);
    }

    public final SharedFlow b() {
        return this.b;
    }
}
