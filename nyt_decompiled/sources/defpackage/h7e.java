package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public final class h7e implements f7e {
    private final Context a;
    private final int o;
    private long b = 0;
    private long c = -1;
    private boolean d = false;
    private int p = 2;
    private int q = 2;
    private int e = 0;
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private String k = "";
    private String l = "";
    private boolean m = false;
    private boolean n = false;

    h7e(Context context, int i) {
        this.a = context;
        this.o = i;
    }

    public final synchronized h7e A(Throwable th) {
        if (((Boolean) pla.c().a(mpa.I8)).booleanValue()) {
            this.k = k8b.g(th);
            this.j = (String) dhe.c(dge.b('\n')).d(k8b.f(th)).iterator().next();
        }
        return this;
    }

    public final synchronized h7e B() {
        Configuration configuration;
        this.e = dyf.s().k(this.a);
        Resources resources = this.a.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.q = i;
        this.b = dyf.b().elapsedRealtime();
        this.n = true;
        return this;
    }

    public final synchronized h7e C() {
        this.c = dyf.b().elapsedRealtime();
        return this;
    }

    @Override // defpackage.f7e
    public final /* bridge */ /* synthetic */ f7e I(String str) {
        x(str);
        return this;
    }

    @Override // defpackage.f7e
    public final /* bridge */ /* synthetic */ f7e S(boolean z) {
        z(z);
        return this;
    }

    @Override // defpackage.f7e
    public final /* bridge */ /* synthetic */ f7e a(f1e f1eVar) {
        v(f1eVar);
        return this;
    }

    @Override // defpackage.f7e
    public final /* bridge */ /* synthetic */ f7e b(String str) {
        y(str);
        return this;
    }

    @Override // defpackage.f7e
    public final /* bridge */ /* synthetic */ f7e c(int i) {
        m(i);
        return this;
    }

    @Override // defpackage.f7e
    public final /* bridge */ /* synthetic */ f7e d(Throwable th) {
        A(th);
        return this;
    }

    @Override // defpackage.f7e
    public final /* bridge */ /* synthetic */ f7e k(zze zzeVar) {
        u(zzeVar);
        return this;
    }

    public final synchronized h7e m(int i) {
        this.p = i;
        return this;
    }

    @Override // defpackage.f7e
    public final /* bridge */ /* synthetic */ f7e s(String str) {
        w(str);
        return this;
    }

    public final synchronized h7e u(zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.zze;
            if (iBinder != null) {
                p6c p6cVar = (p6c) iBinder;
                String zzk = p6cVar.zzk();
                if (!TextUtils.isEmpty(zzk)) {
                    this.f = zzk;
                }
                String zzi = p6cVar.zzi();
                if (!TextUtils.isEmpty(zzi)) {
                    this.g = zzi;
                }
            }
        } finally {
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r2.g = r0.c0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.h7e v(defpackage.f1e r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            y0e r0 = r3.b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L12
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            y0e r0 = r3.b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L12
            r2.f = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L34
        L14:
            java.util.List r3 = r3.a     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L12
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L12
            v0e r0 = (defpackage.v0e) r0     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r0.c0     // Catch: java.lang.Throwable -> L12
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1a
            java.lang.String r3 = r0.c0     // Catch: java.lang.Throwable -> L12
            r2.g = r3     // Catch: java.lang.Throwable -> L12
        L32:
            monitor-exit(r2)
            return r2
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7e.v(f1e):h7e");
    }

    public final synchronized h7e w(String str) {
        if (((Boolean) pla.c().a(mpa.I8)).booleanValue()) {
            this.l = str;
        }
        return this;
    }

    public final synchronized h7e x(String str) {
        this.h = str;
        return this;
    }

    public final synchronized h7e y(String str) {
        this.i = str;
        return this;
    }

    public final synchronized h7e z(boolean z) {
        this.d = z;
        return this;
    }

    @Override // defpackage.f7e
    public final /* bridge */ /* synthetic */ f7e zzh() {
        B();
        return this;
    }

    @Override // defpackage.f7e
    public final /* bridge */ /* synthetic */ f7e zzi() {
        C();
        return this;
    }

    @Override // defpackage.f7e
    public final synchronized boolean zzj() {
        return this.n;
    }

    @Override // defpackage.f7e
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.h);
    }

    @Override // defpackage.f7e
    public final synchronized j7e zzl() {
        try {
            i7e i7eVar = null;
            if (this.m) {
                return null;
            }
            this.m = true;
            if (!this.n) {
                B();
            }
            if (this.c < 0) {
                C();
            }
            return new j7e(this, i7eVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
