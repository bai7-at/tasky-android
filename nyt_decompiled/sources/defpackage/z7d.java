package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
final class z7d implements gke {
    final /* synthetic */ f5e a;

    z7d(a8d a8dVar, f5e f5eVar) {
        this.a = f5eVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        fgb.d("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            fgb.d("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
