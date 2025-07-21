package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class t1c implements tof {
    private final k8c a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicBoolean c = new AtomicBoolean(false);

    public t1c(k8c k8cVar) {
        this.a = k8cVar;
    }

    private final void b() {
        if (this.c.get()) {
            return;
        }
        this.c.set(true);
        this.a.zza();
    }

    @Override // defpackage.tof
    public final void O() {
        b();
    }

    @Override // defpackage.tof
    public final void Q1(int i) {
        this.b.set(true);
        b();
    }

    @Override // defpackage.tof
    public final void Y4() {
    }

    public final boolean a() {
        return this.b.get();
    }

    @Override // defpackage.tof
    public final void h6() {
    }

    @Override // defpackage.tof
    public final void n4() {
        this.a.zzc();
    }

    @Override // defpackage.tof
    public final void s4() {
    }
}
