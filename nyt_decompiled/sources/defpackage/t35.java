package defpackage;

/* loaded from: classes2.dex */
public final class t35 implements d32 {
    private final Throwable a;
    private final String b;

    public t35(Throwable th) {
        zq3.h(th, "cause");
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.d32
    public String getId() {
        return this.b;
    }
}
