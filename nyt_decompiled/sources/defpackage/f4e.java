package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class f4e {
    private final i3e a;
    private final d4e b;
    private final e3e c;
    private l4e e;
    private int f = 1;
    private final ArrayDeque d = new ArrayDeque();

    public f4e(i3e i3eVar, e3e e3eVar, d4e d4eVar) {
        this.a = i3eVar;
        this.c = e3eVar;
        this.b = d4eVar;
        e3eVar.b(new a4e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h() {
        if (((Boolean) pla.c().a(mpa.p6)).booleanValue() && !dyf.q().i().zzh().h()) {
            this.d.clear();
            return;
        }
        if (i()) {
            while (!this.d.isEmpty()) {
                e4e e4eVar = (e4e) this.d.pollFirst();
                if (e4eVar == null || (e4eVar.zza() != null && this.a.a(e4eVar.zza()))) {
                    l4e l4eVar = new l4e(this.a, this.b, e4eVar);
                    this.e = l4eVar;
                    l4eVar.d(new b4e(this, e4eVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean i() {
        return this.e == null;
    }

    public final synchronized j64 a(e4e e4eVar) {
        this.f = 2;
        if (i()) {
            return null;
        }
        return this.e.a(e4eVar);
    }

    public final synchronized void e(e4e e4eVar) {
        this.d.add(e4eVar);
    }

    final /* synthetic */ void f() {
        synchronized (this) {
            this.f = 1;
            h();
        }
    }
}
