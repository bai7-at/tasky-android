package defpackage;

import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class j6 implements e6 {
    private final Flow a;
    private final Flow b;

    public j6(Flow flow, Flow flow2) {
        zq3.h(flow, "adEventFlow");
        zq3.h(flow2, "alsEventFlow");
        this.a = flow;
        this.b = flow2;
    }

    @Override // defpackage.e6
    public Flow a() {
        return this.b;
    }

    @Override // defpackage.e6
    public Flow b() {
        return this.a;
    }
}
