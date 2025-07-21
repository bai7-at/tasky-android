package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class h0c implements r8c, via {
    private final v0e a;
    private final r7c b;
    private final a9c c;
    private final AtomicBoolean d = new AtomicBoolean();
    private final AtomicBoolean e = new AtomicBoolean();

    public h0c(v0e v0eVar, r7c r7cVar, a9c a9cVar) {
        this.a = v0eVar;
        this.b = r7cVar;
        this.c = a9cVar;
    }

    private final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.b.zza();
        }
    }

    @Override // defpackage.via
    public final void R(uia uiaVar) {
        if (this.a.f == 1 && uiaVar.j) {
            a();
        }
        if (uiaVar.j && this.e.compareAndSet(false, true)) {
            this.c.zza();
        }
    }

    @Override // defpackage.r8c
    public final synchronized void zzr() {
        if (this.a.f != 1) {
            a();
        }
    }
}
