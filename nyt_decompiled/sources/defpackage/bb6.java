package defpackage;

import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class bb6 implements ab6 {
    private final r82 a;

    public bb6(r82 r82Var) {
        zq3.h(r82Var, "fcmTokenProvider");
        this.a = r82Var;
    }

    @Override // defpackage.ab6
    public Object a(by0 by0Var) {
        return FlowKt.first(this.a.a(), by0Var);
    }
}
