package defpackage;

/* loaded from: classes3.dex */
public final class z5d implements yec {
    private final String c;
    private final k6e d;
    private boolean a = false;
    private boolean b = false;
    private final hie e = dyf.q().i();

    public z5d(String str, k6e k6eVar) {
        this.c = str;
        this.d = k6eVar;
    }

    private final j6e b(String str) {
        String str2 = this.e.g() ? "" : this.c;
        j6e b = j6e.b(str);
        b.a("tms", Long.toString(dyf.b().elapsedRealtime(), 10));
        b.a("tid", str2);
        return b;
    }

    @Override // defpackage.yec
    public final void I(String str) {
        j6e b = b("adapter_init_finished");
        b.a("ancn", str);
        this.d.a(b);
    }

    @Override // defpackage.yec
    public final void a(String str) {
        j6e b = b("aaia");
        b.a("aair", "MalformedJson");
        this.d.a(b);
    }

    @Override // defpackage.yec
    public final void s(String str) {
        j6e b = b("adapter_init_started");
        b.a("ancn", str);
        this.d.a(b);
    }

    @Override // defpackage.yec
    public final void zzb(String str, String str2) {
        j6e b = b("adapter_init_finished");
        b.a("ancn", str);
        b.a("rqe", str2);
        this.d.a(b);
    }

    @Override // defpackage.yec
    public final synchronized void zze() {
        if (this.b) {
            return;
        }
        this.d.a(b("init_finished"));
        this.b = true;
    }

    @Override // defpackage.yec
    public final synchronized void zzf() {
        if (this.a) {
            return;
        }
        this.d.a(b("init_started"));
        this.a = true;
    }
}
