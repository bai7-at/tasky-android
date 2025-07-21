package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.b4;
import com.google.android.gms.internal.ads.c4;
import com.google.android.gms.internal.ads.zzflg;

/* loaded from: classes3.dex */
public final class f7d implements d6e {
    private final t6d a;
    private final x6d b;

    f7d(t6d t6dVar, x6d x6dVar) {
        this.a = t6dVar;
        this.b = x6dVar;
    }

    @Override // defpackage.d6e
    public final void I(zzflg zzflgVar, String str) {
    }

    @Override // defpackage.d6e
    public final void a(zzflg zzflgVar, String str) {
        if (((Boolean) pla.c().a(mpa.j6)).booleanValue()) {
            if (zzflg.RENDERER == zzflgVar) {
                this.a.g(dyf.b().elapsedRealtime());
                return;
            }
            if (zzflg.PRELOADED_LOADER == zzflgVar || zzflg.SERVER_TRANSACTION == zzflgVar) {
                this.a.h(dyf.b().elapsedRealtime());
                final x6d x6dVar = this.b;
                final long d = this.a.d();
                x6dVar.b.a(new f5e() { // from class: w6d
                    @Override // defpackage.f5e
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (x6d.this.a()) {
                            return null;
                        }
                        long j = d;
                        b4 T = c4.T();
                        T.u(j);
                        byte[] i = ((c4) T.i()).i();
                        e7d.g(sQLiteDatabase, false, false);
                        e7d.d(sQLiteDatabase, j, i);
                        return null;
                    }
                });
            }
        }
    }

    @Override // defpackage.d6e
    public final void k(zzflg zzflgVar, String str) {
        if (((Boolean) pla.c().a(mpa.j6)).booleanValue() && zzflg.RENDERER == zzflgVar && this.a.c() != 0) {
            this.a.f(dyf.b().elapsedRealtime() - this.a.c());
        }
    }

    @Override // defpackage.d6e
    public final void s(zzflg zzflgVar, String str, Throwable th) {
        if (((Boolean) pla.c().a(mpa.j6)).booleanValue() && zzflg.RENDERER == zzflgVar && this.a.c() != 0) {
            this.a.f(dyf.b().elapsedRealtime() - this.a.c());
        }
    }
}
