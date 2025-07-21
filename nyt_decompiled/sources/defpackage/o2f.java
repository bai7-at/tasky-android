package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o2f implements r4f {
    private static final Map g = new so();
    public static final String[] h = {TransferTable.COLUMN_KEY, "value"};
    private final ContentResolver a;
    private final Uri b;
    private final ContentObserver c;
    private final Object d;
    private volatile Map e;
    private final List f;

    private o2f(ContentResolver contentResolver, Uri uri) {
        i2f i2fVar = new i2f(this, null);
        this.c = i2fVar;
        this.d = new Object();
        this.f = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, i2fVar);
    }

    public static o2f a(ContentResolver contentResolver, Uri uri) {
        o2f o2fVar;
        synchronized (o2f.class) {
            Map map = g;
            o2fVar = (o2f) map.get(uri);
            if (o2fVar == null) {
                try {
                    o2f o2fVar2 = new o2f(contentResolver, uri);
                    try {
                        map.put(uri, o2fVar2);
                    } catch (SecurityException unused) {
                    }
                    o2fVar = o2fVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return o2fVar;
    }

    static synchronized void d() {
        synchronized (o2f.class) {
            try {
                for (o2f o2fVar : g.values()) {
                    o2fVar.a.unregisterContentObserver(o2fVar.c);
                }
                g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map b() {
        Map map;
        Map map2;
        Map map3 = this.e;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.d) {
                Map map5 = this.e;
                map = map5;
                if (map5 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map2 = (Map) o3f.a(new o4f() { // from class: c2f
                                @Override // defpackage.o4f
                                public final Object zza() {
                                    return o2f.this.c();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map2 = null;
                        }
                        this.e = map2;
                        allowThreadDiskReads = map2;
                        map = allowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
            map4 = map;
        }
        return map4 != null ? map4 : Collections.emptyMap();
    }

    final /* synthetic */ Map c() {
        Cursor query = this.a.query(this.b, h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map soVar = count <= 256 ? new so(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                soVar.put(query.getString(0), query.getString(1));
            }
            return soVar;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.d) {
            this.e = null;
            d6f.d();
        }
        synchronized (this) {
            try {
                Iterator it2 = this.f.iterator();
                if (it2.hasNext()) {
                    lh4.a(it2.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r4f
    public final /* bridge */ /* synthetic */ Object f(String str) {
        return (String) b().get(str);
    }
}
