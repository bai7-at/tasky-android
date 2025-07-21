package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class a8d extends SQLiteOpenHelper {
    private final Context a;
    private final kke b;

    public a8d(Context context, kke kkeVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) pla.c().a(mpa.k8)).intValue());
        this.a = context;
        this.b = kkeVar;
    }

    static /* synthetic */ Void b(jgb jgbVar, SQLiteDatabase sQLiteDatabase) {
        s(sQLiteDatabase, jgbVar);
        return null;
    }

    static /* synthetic */ void j(SQLiteDatabase sQLiteDatabase, String str, jgb jgbVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        s(sQLiteDatabase, jgbVar);
    }

    static final void r(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void s(SQLiteDatabase sQLiteDatabase, jgb jgbVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                jgbVar.a(strArr[i2]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    final /* synthetic */ Void a(c8d c8dVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(c8dVar.a));
        contentValues.put("gws_query_id", c8dVar.b);
        contentValues.put("url", c8dVar.c);
        contentValues.put("event_state", Integer.valueOf(c8dVar.d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        dyf.r();
        n3b a0 = wxf.a0(this.a);
        if (a0 != null) {
            try {
                a0.zze(fc5.l3(this.a));
            } catch (RemoteException e) {
                pzc.l("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void d(final String str) {
        i(new f5e() { // from class: y7d
            @Override // defpackage.f5e
            public final Object zza(Object obj) {
                a8d.r((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void h(final c8d c8dVar) {
        i(new f5e() { // from class: u7d
            @Override // defpackage.f5e
            public final Object zza(Object obj) {
                a8d.this.a(c8dVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void i(f5e f5eVar) {
        zb.r(this.b.j(new Callable() { // from class: w7d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return a8d.this.getWritableDatabase();
            }
        }), new z7d(this, f5eVar), this.b);
    }

    final void l(final SQLiteDatabase sQLiteDatabase, final jgb jgbVar, final String str) {
        this.b.execute(new Runnable() { // from class: x7d
            @Override // java.lang.Runnable
            public final void run() {
                a8d.j(sQLiteDatabase, str, jgbVar);
            }
        });
    }

    public final void m(final jgb jgbVar, final String str) {
        i(new f5e() { // from class: v7d
            @Override // defpackage.f5e
            public final Object zza(Object obj) {
                a8d.this.l((SQLiteDatabase) obj, jgbVar, str);
                return null;
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
