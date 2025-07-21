package defpackage;

import defpackage.tx3;

/* loaded from: classes3.dex */
public final class ux3 implements tx3 {
    private final cx7 a;
    private final xl0 b;

    public ux3(cx7 cx7Var, xl0 xl0Var) {
        zq3.h(cx7Var, "ntpService");
        zq3.h(xl0Var, "fallbackClock");
        this.a = cx7Var;
        this.b = xl0Var;
    }

    @Override // defpackage.tx3
    public void a() {
        this.a.a();
    }

    @Override // defpackage.xl0
    public long b() {
        return tx3.a.a(this);
    }

    @Override // defpackage.xl0
    public long c() {
        return this.b.c();
    }

    @Override // defpackage.tx3
    public vx3 getCurrentTime() {
        vx3 b = this.a.b();
        return b != null ? b : new vx3(this.b.b(), null);
    }

    @Override // defpackage.tx3
    public void shutdown() {
        this.a.shutdown();
    }
}
