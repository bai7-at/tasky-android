package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.vkf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class k extends g9 {
    private static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    private static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final j d;
    private final c9 e;

    k(r9 r9Var) {
        super(r9Var);
        this.e = new c9(this.a.p());
        this.a.y();
        this.d = new j(this, this.a.zzau(), "google_app_measurement.db");
    }

    static final void G(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long H(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = O().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                this.a.o().n().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long J(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = O().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j2;
                }
                long j3 = cursor.getLong(0);
                cursor.close();
                return j3;
            } catch (SQLiteException e) {
                this.a.o().n().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0079: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:101:0x0079 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void F(String str, long j2, long j3, p9 p9Var) {
        ?? r4;
        Cursor cursor;
        SQLiteDatabase O;
        Cursor rawQuery;
        String string;
        String str2;
        Cursor query;
        String str3;
        String[] strArr;
        Preconditions.checkNotNull(p9Var);
        c();
        d();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str4 = null;
        try {
            try {
                O = O();
                r4 = TextUtils.isEmpty(null);
                try {
                    if (r4 != 0) {
                        rawQuery = O.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j3 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            str4 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        rawQuery = O.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j3 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j3 != -1 ? new String[]{null, String.valueOf(j3)} : new String[]{null});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    str2 = string;
                    try {
                        query = O.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, str2}, null, null, "rowid", "2");
                    } catch (SQLiteException e) {
                        e = e;
                        r4 = cursor3;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
            }
            try {
                if (!query.moveToFirst()) {
                    this.a.o().n().b("Raw event metadata record is missing. appId", x3.y(str4));
                    query.close();
                    return;
                }
                try {
                    com.google.android.gms.internal.measurement.t0 t0Var = (com.google.android.gms.internal.measurement.t0) ((com.google.android.gms.internal.measurement.s0) t9.B(com.google.android.gms.internal.measurement.t0.O1(), query.getBlob(0))).i();
                    if (query.moveToNext()) {
                        this.a.o().v().b("Get multiple raw event metadata records, expected one. appId", x3.y(str4));
                    }
                    query.close();
                    Preconditions.checkNotNull(t0Var);
                    p9Var.a = t0Var;
                    if (j3 != -1) {
                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr = new String[]{str4, str2, String.valueOf(j3)};
                    } else {
                        str3 = "app_id = ? and metadata_fingerprint = ?";
                        strArr = new String[]{str4, str2};
                    }
                    Cursor query2 = O.query("raw_events", new String[]{"rowid", AuthenticationTokenClaims.JSON_KEY_NAME, "timestamp", "data"}, str3, strArr, null, null, "rowid", null);
                    if (!query2.moveToFirst()) {
                        this.a.o().v().b("Raw event data disappeared while in transaction. appId", x3.y(str4));
                        query2.close();
                        return;
                    }
                    do {
                        long j4 = query2.getLong(0);
                        try {
                            com.google.android.gms.internal.measurement.i0 i0Var = (com.google.android.gms.internal.measurement.i0) t9.B(com.google.android.gms.internal.measurement.j0.v(), query2.getBlob(3));
                            i0Var.u(query2.getString(1));
                            i0Var.y(query2.getLong(2));
                            if (!p9Var.a(j4, (com.google.android.gms.internal.measurement.j0) i0Var.i())) {
                                query2.close();
                                return;
                            }
                        } catch (IOException e3) {
                            this.a.o().n().c("Data loss. Failed to merge raw event. appId", x3.y(str4), e3);
                        }
                    } while (query2.moveToNext());
                    query2.close();
                } catch (IOException e4) {
                    this.a.o().n().c("Data loss. Failed to merge raw event metadata. appId", x3.y(str4), e4);
                    query.close();
                }
            } catch (SQLiteException e5) {
                e = e5;
                r4 = query;
                this.a.o().n().c("Data loss. Error selecting raw event. appId", x3.y(str4), e);
                if (r4 != 0) {
                    r4.close();
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e6) {
            e = e6;
            r4 = 0;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final int I(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        c();
        d();
        try {
            return O().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.a.o().n().d("Error deleting conditional property", x3.y(str), this.a.C().f(str2), e);
            return 0;
        }
    }

    protected final long K(String str, String str2) {
        SQLiteException e;
        long j2;
        ContentValues contentValues;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        c();
        d();
        SQLiteDatabase O = O();
        O.beginTransaction();
        try {
            try {
                j2 = J("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j2 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (O.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.a.o().n().c("Failed to insert column (got -1). appId", x3.y(str), "first_open_count");
                        return -1L;
                    }
                    j2 = 0;
                }
            } catch (SQLiteException e2) {
                e = e2;
                j2 = 0;
            }
            try {
                contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Long.valueOf(1 + j2));
            } catch (SQLiteException e3) {
                e = e3;
                this.a.o().n().d("Error inserting column. appId", x3.y(str), "first_open_count", e);
                return j2;
            }
            if (O.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.a.o().n().c("Failed to update column (got 0). appId", x3.y(str), "first_open_count");
                return -1L;
            }
            O.setTransactionSuccessful();
            return j2;
        } finally {
            O.endTransaction();
        }
    }

    public final long L() {
        return J("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long M() {
        return J("select max(timestamp) from raw_events", null, 0L);
    }

    public final long N(String str) {
        Preconditions.checkNotEmpty(str);
        return J("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    final SQLiteDatabase O() {
        c();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.a.o().v().b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:58:0x00bf */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle P(java.lang.String r8) {
        /*
            r7 = this;
            r7.c()
            r7.d()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.O()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String[] r2 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r3 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r2 != 0) goto L34
            com.google.android.gms.measurement.internal.a5 r8 = r7.a     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.x3 r8 = r8.o()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.u3 r8 = r8.u()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r1.close()
            return r0
        L2e:
            r7 = move-exception
            goto Lbf
        L31:
            r8 = move-exception
            goto Lc5
        L34:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.measurement.i0 r3 = com.google.android.gms.internal.measurement.j0.v()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            zdf r2 = com.google.android.gms.measurement.internal.t9.B(r3, r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.i0 r2 = (com.google.android.gms.internal.measurement.i0) r2     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.j2 r2 = r2.i()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.j0 r2 = (com.google.android.gms.internal.measurement.j0) r2     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.measurement.internal.r9 r8 = r7.b     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r8.e0()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.util.List r8 = r2.z()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
        L5b:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r3 == 0) goto La3
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.measurement.n0 r3 = (com.google.android.gms.internal.measurement.n0) r3     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r4 = r3.x()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            boolean r5 = r3.K()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L79
            double r5 = r3.r()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putDouble(r4, r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L79:
            boolean r5 = r3.M()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L87
            float r3 = r3.s()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putFloat(r4, r3)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L87:
            boolean r5 = r3.T()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L95
            java.lang.String r3 = r3.y()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putString(r4, r3)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L95:
            boolean r5 = r3.N()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L5b
            long r5 = r3.u()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putLong(r4, r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        La3:
            r1.close()
            return r2
        La7:
            r2 = move-exception
            com.google.android.gms.measurement.internal.a5 r3 = r7.a     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.x3 r3 = r3.o()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.u3 r3 = r3.n()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.x3.y(r8)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r3.c(r4, r8, r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r1.close()
            return r0
        Lbf:
            r0 = r1
            goto Lda
        Lc1:
            r7 = move-exception
            goto Lda
        Lc3:
            r8 = move-exception
            r1 = r0
        Lc5:
            com.google.android.gms.measurement.internal.a5 r7 = r7.a     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.x3 r7 = r7.o()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.u3 r7 = r7.n()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Error selecting default event parameters"
            r7.b(r2, r8)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Ld9
            r1.close()
        Ld9:
            return r0
        Lda:
            if (r0 == 0) goto Ldf
            r0.close()
        Ldf:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.P(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x01f3: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:63:0x01f3 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.q5 Q(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.Q(java.lang.String):com.google.android.gms.measurement.internal.q5");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzac R(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.R(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    public final i S(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return T(j2, str, 1L, false, false, z3, false, z5);
    }

    public final i T(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        c();
        d();
        String[] strArr = {str};
        i iVar = new i();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase O = O();
                Cursor query = O.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.a.o().v().b("Not updating daily counts, app is not known. appId", x3.y(str));
                    query.close();
                    return iVar;
                }
                if (query.getLong(0) == j2) {
                    iVar.b = query.getLong(1);
                    iVar.a = query.getLong(2);
                    iVar.c = query.getLong(3);
                    iVar.d = query.getLong(4);
                    iVar.e = query.getLong(5);
                }
                if (z) {
                    iVar.b += j3;
                }
                if (z2) {
                    iVar.a += j3;
                }
                if (z3) {
                    iVar.c += j3;
                }
                if (z4) {
                    iVar.d += j3;
                }
                if (z5) {
                    iVar.e += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(iVar.a));
                contentValues.put("daily_events_count", Long.valueOf(iVar.b));
                contentValues.put("daily_conversions_count", Long.valueOf(iVar.c));
                contentValues.put("daily_error_events_count", Long.valueOf(iVar.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(iVar.e));
                O.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return iVar;
            } catch (SQLiteException e) {
                this.a.o().n().c("Error updating daily counts. appId", x3.y(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return iVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.q U(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.U(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.q");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0073: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x0073 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.v9 W(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r10.c()
            r10.d()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.O()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r2 = "set_timestamp"
            java.lang.String r3 = "value"
            java.lang.String r4 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r2 = "user_attributes"
            java.lang.String r4 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r2 = 1
            java.lang.Object r9 = r10.X(r1, r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            com.google.android.gms.measurement.internal.v9 r2 = new com.google.android.gms.measurement.internal.v9     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r3 == 0) goto L6f
            com.google.android.gms.measurement.internal.a5 r3 = r10.a     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            com.google.android.gms.measurement.internal.x3 r3 = r3.o()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            com.google.android.gms.measurement.internal.u3 r3 = r3.n()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.x3.y(r11)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            goto L6f
        L6b:
            r10 = move-exception
            goto L73
        L6d:
            r2 = move-exception
            goto L7a
        L6f:
            r1.close()
            return r2
        L73:
            r0 = r1
            goto L9d
        L75:
            r10 = move-exception
            goto L9d
        L77:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L7a:
            com.google.android.gms.measurement.internal.a5 r3 = r10.a     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.x3 r3 = r3.o()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.u3 r3 = r3.n()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.x3.y(r11)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.a5 r10 = r10.a     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.r3 r10 = r10.C()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r10 = r10.f(r12)     // Catch: java.lang.Throwable -> L6b
            r3.d(r4, r11, r10, r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L9c
            r1.close()
        L9c:
            return r0
        L9d:
            if (r0 == 0) goto La2
            r0.close()
        La2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.W(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.v9");
    }

    final Object X(Cursor cursor, int i2) {
        int type2 = cursor.getType(i2);
        if (type2 == 0) {
            this.a.o().n().a("Loaded invalid null value from database");
            return null;
        }
        if (type2 == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type2 == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type2 == 3) {
            return cursor.getString(i2);
        }
        if (type2 != 4) {
            this.a.o().n().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type2));
            return null;
        }
        this.a.o().n().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Y() {
        /*
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.O()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L26
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r4 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r4
        L1a:
            r4 = move-exception
            goto L22
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r1 = r0
            goto L3e
        L24:
            r4 = move-exception
            goto L3e
        L26:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.a5 r4 = r4.a     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.x3 r4 = r4.o()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.u3 r4 = r4.n()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "Database error getting next bundle app id"
            r4.b(r3, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.Y():java.lang.String");
    }

    public final List Z(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        c();
        d();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return a0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r2 = r27.a.o().n();
        r27.a.y();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", java.lang.Integer.valueOf(io.embrace.android.embracesdk.config.behavior.NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a0(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.a0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List b0(String str) {
        Preconditions.checkNotEmpty(str);
        c();
        d();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.a.y();
                cursor = O().query("user_attributes", new String[]{AuthenticationTokenClaims.JSON_KEY_NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j2 = cursor.getLong(2);
                    Object X = X(cursor, 3);
                    if (X == null) {
                        this.a.o().n().b("Read invalid user property value, ignoring it. appId", x3.y(str));
                    } else {
                        arrayList.add(new v9(str, str2, string, j2, X));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.a.o().n().c("Error querying user properties. appId", x3.y(str), e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        r0 = r17.a.o().n();
        r17.a.y();
        r0.b("Read more than the max allowed user properties, ignoring excess", java.lang.Integer.valueOf(io.embrace.android.embracesdk.config.behavior.NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT));
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.c0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void d0() {
        d();
        O().beginTransaction();
    }

    public final void e0() {
        d();
        O().endTransaction();
    }

    final void f0(List list) {
        c();
        d();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (t()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (H("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.a.o().v().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                O().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.a.o().n().b("Error incrementing retry count. error", e);
            }
        }
    }

    final void g0() {
        c();
        d();
        if (t()) {
            long a = this.b.c0().h.a();
            long elapsedRealtime = this.a.p().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a);
            this.a.y();
            if (abs > ((Long) m3.z.a(null)).longValue()) {
                this.b.c0().h.b(elapsedRealtime);
                c();
                d();
                if (t()) {
                    SQLiteDatabase O = O();
                    String valueOf = String.valueOf(this.a.p().currentTimeMillis());
                    this.a.y();
                    int delete = O.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(g.d())});
                    if (delete > 0) {
                        this.a.o().u().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.g9
    protected final boolean h() {
        return false;
    }

    public final void i(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        c();
        d();
        try {
            O().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.a.o().n().d("Error deleting user property. appId", x3.y(str), this.a.C().f(str2), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0254, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e2, code lost:
    
        r0 = r23.a.o().v();
        r10 = com.google.android.gms.measurement.internal.x3.y(r24);
        r12 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r11.F() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
    
        r16 = java.lang.Integer.valueOf(r11.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r10, r12, java.lang.String.valueOf(r16));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0207, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x029a, code lost:
    
        r21 = r7;
        r0 = r0.y().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a8, code lost:
    
        if (r0.hasNext() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02aa, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.l) r0.next();
        d();
        c();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c4, code lost:
    
        if (r3.v().isEmpty() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f6, code lost:
    
        r7 = r3.e();
        r10 = new android.content.ContentValues();
        r10.put("app_id", r24);
        r10.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030d, code lost:
    
        if (r3.A() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030f, code lost:
    
        r11 = java.lang.Integer.valueOf(r3.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0319, code lost:
    
        r10.put("filter_id", r11);
        r22 = r0;
        r10.put("property_name", r3.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032b, code lost:
    
        if (r3.B() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x032d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.z());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0337, code lost:
    
        r10.put("session_scoped", r0);
        r10.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x034b, code lost:
    
        if (O().insertWithOnConflict("property_filters", null, r10, 5) != (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0363, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x034d, code lost:
    
        r23.a.o().n().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.x3.y(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0367, code lost:
    
        r23.a.o().n().c("Error storing property filter. appId", com.google.android.gms.measurement.internal.x3.y(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0336, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0318, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c6, code lost:
    
        r0 = r23.a.o().v();
        r8 = com.google.android.gms.measurement.internal.x3.y(r24);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02de, code lost:
    
        if (r3.A() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e0, code lost:
    
        r16 = java.lang.Integer.valueOf(r3.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ed, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02eb, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r10 = r0.y().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0187, code lost:
    
        if (r10.hasNext() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
    
        if (((com.google.android.gms.internal.measurement.l) r10.next()).A() != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0195, code lost:
    
        r23.a.o().v().c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.x3.y(r24), java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ae, code lost:
    
        r10 = r0.x().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c4, code lost:
    
        if (r10.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c6, code lost:
    
        r11 = (com.google.android.gms.internal.measurement.e) r10.next();
        d();
        c();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e0, code lost:
    
        if (r11.x().isEmpty() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0214, code lost:
    
        r3 = r11.e();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022d, code lost:
    
        if (r11.F() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022f, code lost:
    
        r8 = java.lang.Integer.valueOf(r11.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:
    
        r7.put("filter_id", r8);
        r7.put("event_name", r11.x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0249, code lost:
    
        if (r11.G() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024b, code lost:
    
        r8 = java.lang.Boolean.valueOf(r11.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0255, code lost:
    
        r7.put("session_scoped", r8);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0269, code lost:
    
        if (O().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026b, code lost:
    
        r23.a.o().n().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.x3.y(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027e, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0284, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0285, code lost:
    
        r23.a.o().n().c("Error storing event filter. appId", com.google.android.gms.measurement.internal.x3.y(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x037a, code lost:
    
        d();
        c();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = O();
        r7 = r18;
        r0.delete("property_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r0.delete("event_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a3, code lost:
    
        r7 = r21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void j(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.j(java.lang.String, java.util.List):void");
    }

    public final void k() {
        d();
        O().setTransactionSuccessful();
    }

    public final void l(q5 q5Var) {
        Preconditions.checkNotNull(q5Var);
        c();
        d();
        String e0 = q5Var.e0();
        Preconditions.checkNotNull(e0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e0);
        contentValues.put("app_instance_id", q5Var.f0());
        contentValues.put("gmp_app_id", q5Var.j0());
        contentValues.put("resettable_device_id_hash", q5Var.a());
        contentValues.put("last_bundle_index", Long.valueOf(q5Var.Z()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(q5Var.a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(q5Var.Y()));
        contentValues.put("app_version", q5Var.h0());
        contentValues.put("app_store", q5Var.g0());
        contentValues.put("gmp_version", Long.valueOf(q5Var.X()));
        contentValues.put("dev_cert_hash", Long.valueOf(q5Var.U()));
        contentValues.put("measurement_enabled", Boolean.valueOf(q5Var.K()));
        contentValues.put("day", Long.valueOf(q5Var.T()));
        contentValues.put("daily_public_events_count", Long.valueOf(q5Var.R()));
        contentValues.put("daily_events_count", Long.valueOf(q5Var.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(q5Var.O()));
        contentValues.put("config_fetched_time", Long.valueOf(q5Var.N()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(q5Var.W()));
        contentValues.put("app_version_int", Long.valueOf(q5Var.M()));
        contentValues.put("firebase_instance_id", q5Var.i0());
        contentValues.put("daily_error_events_count", Long.valueOf(q5Var.P()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(q5Var.S()));
        contentValues.put("health_monitor_sample", q5Var.k0());
        contentValues.put("android_id", Long.valueOf(q5Var.A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(q5Var.J()));
        contentValues.put("admob_app_id", q5Var.c0());
        contentValues.put("dynamite_version", Long.valueOf(q5Var.V()));
        contentValues.put("session_stitching_token", q5Var.b());
        List c = q5Var.c();
        if (c != null) {
            if (c.isEmpty()) {
                this.a.o().v().b("Safelisted events should not be an empty list. appId", e0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c));
            }
        }
        vkf.b();
        if (this.a.y().A(null, m3.A0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase O = O();
            if (O.update("apps", contentValues, "app_id = ?", new String[]{e0}) == 0 && O.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.a.o().n().b("Failed to insert/update app (got -1). appId", x3.y(e0));
            }
        } catch (SQLiteException e) {
            this.a.o().n().c("Error storing app. appId", x3.y(e0), e);
        }
    }

    public final void m(q qVar) {
        Preconditions.checkNotNull(qVar);
        c();
        d();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", qVar.a);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, qVar.b);
        contentValues.put("lifetime_count", Long.valueOf(qVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(qVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(qVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(qVar.g));
        contentValues.put("last_bundled_day", qVar.h);
        contentValues.put("last_sampled_complex_event_id", qVar.i);
        contentValues.put("last_sampling_rate", qVar.j);
        contentValues.put("current_session_count", Long.valueOf(qVar.e));
        Boolean bool = qVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (O().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.a.o().n().b("Failed to insert/update event aggregates (got -1). appId", x3.y(qVar.a));
            }
        } catch (SQLiteException e) {
            this.a.o().n().c("Error storing event aggregates. appId", x3.y(qVar.a), e);
        }
    }

    public final boolean n() {
        return H("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean r() {
        return H("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean s() {
        return H("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    protected final boolean t() {
        Context zzau = this.a.zzau();
        this.a.y();
        return zzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean u(String str, Long l2, long j2, com.google.android.gms.internal.measurement.j0 j0Var) {
        c();
        d();
        Preconditions.checkNotNull(j0Var);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l2);
        byte[] e = j0Var.e();
        this.a.o().u().c("Saving complex main event, appId, data size", this.a.C().d(str), Integer.valueOf(e.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", e);
        try {
            if (O().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.a.o().n().b("Failed to insert complex main event (got -1). appId", x3.y(str));
            return false;
        } catch (SQLiteException e2) {
            this.a.o().n().c("Error storing complex main event. appId", x3.y(str), e2);
            return false;
        }
    }

    public final boolean v(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        c();
        d();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (W(str, zzacVar.zzc.zzb) == null) {
            long H = H("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.a.y();
            if (H >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, zzacVar.zzc.zzb);
        G(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.t0()));
        contentValues.put("active", Boolean.valueOf(zzacVar.zze));
        contentValues.put("trigger_event_name", zzacVar.zzf);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.a.M().b0(zzacVar.zzg));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.a.M().b0(zzacVar.zzi));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.a.M().b0(zzacVar.zzk));
        try {
            if (O().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.a.o().n().b("Failed to insert/update conditional user property (got -1)", x3.y(str));
            return true;
        } catch (SQLiteException e) {
            this.a.o().n().c("Error storing conditional user property", x3.y(str), e);
            return true;
        }
    }

    public final boolean w(v9 v9Var) {
        Preconditions.checkNotNull(v9Var);
        c();
        d();
        if (W(v9Var.a, v9Var.c) == null) {
            if (x9.W(v9Var.c)) {
                if (H("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{v9Var.a}) >= this.a.y().l(v9Var.a, m3.H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(v9Var.c)) {
                long H = H("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{v9Var.a, v9Var.b});
                this.a.y();
                if (H >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", v9Var.a);
        contentValues.put("origin", v9Var.b);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, v9Var.c);
        contentValues.put("set_timestamp", Long.valueOf(v9Var.d));
        G(contentValues, "value", v9Var.e);
        try {
            if (O().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.a.o().n().b("Failed to insert/update user property (got -1). appId", x3.y(v9Var.a));
            return true;
        } catch (SQLiteException e) {
            this.a.o().n().c("Error storing user property. appId", x3.y(v9Var.a), e);
            return true;
        }
    }
}
