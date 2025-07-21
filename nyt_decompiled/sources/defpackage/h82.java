package defpackage;

/* loaded from: classes4.dex */
public final class h82 implements f82 {
    private final r82 a;
    private final o82 b;

    public h82(r82 r82Var, o82 o82Var) {
        zq3.h(r82Var, "fcmTokenProvider");
        zq3.h(o82Var, "fcmPushMessageProvider");
        this.a = r82Var;
        this.b = o82Var;
    }

    @Override // defpackage.f82
    public r82 a() {
        return this.a;
    }

    @Override // defpackage.f82
    public o82 b() {
        return this.b;
    }
}
