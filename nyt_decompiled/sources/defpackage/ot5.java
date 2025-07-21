package defpackage;

/* loaded from: classes4.dex */
public final class ot5 implements yg0 {
    private final gy6 a;

    public ot5(gy6 gy6Var) {
        zq3.h(gy6Var, "requestCallback");
        this.a = gy6Var;
    }

    @Override // defpackage.yg0
    public void onError(Exception exc) {
        this.a.a(exc);
    }

    @Override // defpackage.yg0
    public void onSuccess() {
        this.a.b();
    }
}
