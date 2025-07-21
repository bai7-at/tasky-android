package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
final class m6d implements gke {
    final /* synthetic */ f5e a;

    m6d(n6d n6dVar, f5e f5eVar) {
        this.a = f5eVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        fgb.d("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            fgb.d("Error executing function on offline signal database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
