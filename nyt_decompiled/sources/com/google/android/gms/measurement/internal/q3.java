package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class q3 extends w3 {
    private final p3 c;
    private boolean d;

    q3(a5 a5Var) {
        super(a5Var);
        Context zzau = this.a.zzau();
        this.a.y();
        this.c = new p3(this, zzau, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean w(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q3.w(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.w3
    protected final boolean j() {
        return false;
    }

    final SQLiteDatabase k() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List l(int r23) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q3.l(int):java.util.List");
    }

    public final void m() {
        int delete;
        c();
        try {
            SQLiteDatabase k = k();
            if (k == null || (delete = k.delete("messages", null, null)) <= 0) {
                return;
            }
            this.a.o().u().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            this.a.o().n().b("Error resetting local analytics data. error", e);
        }
    }

    public final boolean n() {
        return w(3, new byte[0]);
    }

    final boolean r() {
        Context zzau = this.a.zzau();
        this.a.y();
        return zzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean s() {
        int i;
        c();
        if (!this.d && r()) {
            int i2 = 5;
            for (0; i < 5; i + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase k = k();
                            if (k == null) {
                                this.d = true;
                                return false;
                            }
                            k.beginTransaction();
                            k.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            k.setTransactionSuccessful();
                            k.endTransaction();
                            k.close();
                            return true;
                        } catch (SQLiteException e) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.a.o().n().b("Error deleting app launch break from local database", e);
                            this.d = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i2);
                        i2 += 20;
                        i = 0 == 0 ? i + 1 : 0;
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e2) {
                    this.a.o().n().b("Error deleting app launch break from local database", e2);
                    this.d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            this.a.o().v().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean t(zzac zzacVar) {
        byte[] b0 = this.a.M().b0(zzacVar);
        if (b0.length <= 131072) {
            return w(2, b0);
        }
        this.a.o().s().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean u(zzaw zzawVar) {
        Parcel obtain = Parcel.obtain();
        t.a(zzawVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return w(0, marshall);
        }
        this.a.o().s().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean v(zzlo zzloVar) {
        Parcel obtain = Parcel.obtain();
        u9.a(zzloVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return w(1, marshall);
        }
        this.a.o().s().a("User property too long for local database. Sending directly to service");
        return false;
    }
}
