package defpackage;

/* loaded from: classes4.dex */
public final class km7 {
    private final jc a;
    private cr5 b;

    public km7(jc jcVar, cr5 cr5Var) {
        zq3.h(jcVar, "analyticsClient");
        zq3.h(cr5Var, "performanceTrackerClient");
        this.a = jcVar;
        this.b = cr5Var;
    }

    public final void a(String str) {
        zq3.h(str, "message");
        this.b.c(str);
    }

    public final void b() {
        this.a.B(-1);
    }
}
