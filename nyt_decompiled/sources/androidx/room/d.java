package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.room.d;
import com.facebook.AuthenticationTokenClaims;
import defpackage.cr3;
import defpackage.gm0;
import defpackage.l77;
import defpackage.ps7;
import defpackage.sc8;
import defpackage.wc8;
import defpackage.ww8;
import defpackage.xz;
import defpackage.zq3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class d {
    public static final a q = new a(null);
    private static final String[] r = {"UPDATE", "DELETE", "INSERT"};
    private final RoomDatabase a;
    private final Map b;
    private final Map c;
    private final Map d;
    private final String[] e;
    private xz f;
    private final AtomicBoolean g;
    private volatile boolean h;
    private volatile wc8 i;
    private final b j;
    private final cr3 k;
    private final l77 l;
    private androidx.room.e m;
    private final Object n;
    private final Object o;
    public final Runnable p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(sc8 sc8Var) {
            zq3.h(sc8Var, "database");
            if (sc8Var.o1()) {
                sc8Var.T();
            } else {
                sc8Var.t();
            }
        }

        public final String b(String str, String str2) {
            zq3.h(str, "tableName");
            zq3.h(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }

        private a() {
        }
    }

    public static final class b {
        public static final a e = new a(null);
        private final long[] a;
        private final boolean[] b;
        private final int[] c;
        private boolean d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(int i) {
            this.a = new long[i];
            this.b = new boolean[i];
            this.c = new int[i];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.d) {
                        return null;
                    }
                    long[] jArr = this.a;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        int i4 = 1;
                        boolean z = jArr[i] > 0;
                        boolean[] zArr = this.b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.c;
                            if (!z) {
                                i4 = 2;
                            }
                            iArr[i2] = i4;
                        } else {
                            this.c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2 = i3;
                    }
                    this.d = false;
                    return (int[]) this.c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... iArr) {
            boolean z;
            zq3.h(iArr, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            this.d = true;
                            z = true;
                        }
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public final boolean c(int... iArr) {
            boolean z;
            zq3.h(iArr, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            this.d = true;
                            z = true;
                        }
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.b, false);
                this.d = true;
                ww8 ww8Var = ww8.a;
            }
        }
    }

    public static abstract class c {
        private final String[] a;

        public c(String[] strArr) {
            zq3.h(strArr, "tables");
            this.a = strArr;
        }

        public final String[] a() {
            return this.a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set set);
    }

    /* renamed from: androidx.room.d$d, reason: collision with other inner class name */
    public static final class C0117d {
        private final c a;
        private final int[] b;
        private final String[] c;
        private final Set d;

        public C0117d(c cVar, int[] iArr, String[] strArr) {
            zq3.h(cVar, "observer");
            zq3.h(iArr, "tableIds");
            zq3.h(strArr, "tableNames");
            this.a = cVar;
            this.b = iArr;
            this.c = strArr;
            this.d = !(strArr.length == 0) ? b0.d(strArr[0]) : b0.e();
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.b;
        }

        public final void b(Set set) {
            Set e;
            zq3.h(set, "invalidatedTablesIds");
            int[] iArr = this.b;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set b = b0.b();
                    int[] iArr2 = this.b;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i]))) {
                            b.add(this.c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    e = b0.a(b);
                } else {
                    e = set.contains(Integer.valueOf(iArr[0])) ? this.d : b0.e();
                }
            } else {
                e = b0.e();
            }
            if (e.isEmpty()) {
                return;
            }
            this.a.c(e);
        }

        public final void c(String[] strArr) {
            Set e;
            zq3.h(strArr, "tables");
            int length = this.c.length;
            if (length == 0) {
                e = b0.e();
            } else if (length == 1) {
                int length2 = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        e = b0.e();
                        break;
                    } else {
                        if (kotlin.text.h.w(strArr[i], this.c[0], true)) {
                            e = this.d;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                Set b = b0.b();
                for (String str : strArr) {
                    for (String str2 : this.c) {
                        if (kotlin.text.h.w(str2, str, true)) {
                            b.add(str2);
                        }
                    }
                }
                e = b0.a(b);
            }
            if (e.isEmpty()) {
                return;
            }
            this.a.c(e);
        }
    }

    public static final class e extends c {
        private final d b;
        private final WeakReference c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar, c cVar) {
            super(cVar.a());
            zq3.h(dVar, "tracker");
            zq3.h(cVar, "delegate");
            this.b = dVar;
            this.c = new WeakReference(cVar);
        }

        @Override // androidx.room.d.c
        public void c(Set set) {
            zq3.h(set, "tables");
            c cVar = (c) this.c.get();
            if (cVar == null) {
                this.b.p(this);
            } else {
                cVar.c(set);
            }
        }
    }

    public static final class f implements Runnable {
        f() {
        }

        private final Set a() {
            d dVar = d.this;
            Set b = b0.b();
            Cursor query$default = RoomDatabase.query$default(dVar.g(), new ps7("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (query$default.moveToNext()) {
                try {
                    b.add(Integer.valueOf(query$default.getInt(0)));
                } finally {
                }
            }
            ww8 ww8Var = ww8.a;
            gm0.a(query$default, null);
            Set a = b0.a(b);
            if (!a.isEmpty()) {
                if (d.this.f() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                wc8 f = d.this.f();
                if (f == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                f.E();
            }
            return a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            if (r0 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            r0.e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
        
            if (r2.isEmpty() != false) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
        
            r0 = r4.a.h();
            r4 = r4.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
        
            r4 = r4.h().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
        
            if (r4.hasNext() == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
        
            ((androidx.room.d.C0117d) ((java.util.Map.Entry) r4.next()).getValue()).b(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
        
            r4 = defpackage.ww8.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
        
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
        
            r4 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
        
            throw r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f8, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00a6, code lost:
        
            if (r0 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00bd, code lost:
        
            if (r0 == null) goto L44;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.d.f.run():void");
        }
    }

    public d(RoomDatabase roomDatabase, Map map, Map map2, String... strArr) {
        String str;
        zq3.h(roomDatabase, "database");
        zq3.h(map, "shadowTablesMap");
        zq3.h(map2, "viewTables");
        zq3.h(strArr, "tableNames");
        this.a = roomDatabase;
        this.b = map;
        this.c = map2;
        this.g = new AtomicBoolean(false);
        this.j = new b(strArr.length);
        this.k = new cr3(roomDatabase);
        this.l = new l77();
        this.n = new Object();
        this.o = new Object();
        this.d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            zq3.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.b.get(strArr[i]);
            if (str3 != null) {
                zq3.g(locale, "US");
                str = str3.toLowerCase(locale);
                zq3.g(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            zq3.g(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            zq3.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.d.containsKey(lowerCase2)) {
                String str5 = (String) entry.getKey();
                zq3.g(locale2, "US");
                String lowerCase3 = str5.toLowerCase(locale2);
                zq3.g(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.d;
                map3.put(lowerCase3, t.j(map3, lowerCase2));
            }
        }
        this.p = new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        synchronized (this.o) {
            this.h = false;
            this.j.d();
            wc8 wc8Var = this.i;
            if (wc8Var != null) {
                wc8Var.close();
                ww8 ww8Var = ww8.a;
            }
        }
    }

    private final String[] q(String[] strArr) {
        Set b2 = b0.b();
        for (String str : strArr) {
            Map map = this.c;
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            zq3.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.c;
                zq3.g(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                zq3.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                zq3.e(obj);
                b2.addAll((Collection) obj);
            } else {
                b2.add(str);
            }
        }
        return (String[]) b0.a(b2).toArray(new String[0]);
    }

    private final void t(sc8 sc8Var, int i) {
        sc8Var.B("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.e[i];
        for (String str2 : r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            zq3.g(str3, "StringBuilder().apply(builderAction).toString()");
            sc8Var.B(str3);
        }
    }

    private final void v(sc8 sc8Var, int i) {
        String str = this.e[i];
        for (String str2 : r) {
            String str3 = "DROP TRIGGER IF EXISTS " + q.b(str, str2);
            zq3.g(str3, "StringBuilder().apply(builderAction).toString()");
            sc8Var.B(str3);
        }
    }

    public void c(c cVar) {
        C0117d c0117d;
        zq3.h(cVar, "observer");
        String[] q2 = q(cVar.a());
        ArrayList arrayList = new ArrayList(q2.length);
        for (String str : q2) {
            Map map = this.d;
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            zq3.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] W0 = kotlin.collections.i.W0(arrayList);
        C0117d c0117d2 = new C0117d(cVar, W0, q2);
        synchronized (this.l) {
            c0117d = (C0117d) this.l.j(cVar, c0117d2);
        }
        if (c0117d == null && this.j.b(Arrays.copyOf(W0, W0.length))) {
            w();
        }
    }

    public void d(c cVar) {
        zq3.h(cVar, "observer");
        c(new e(this, cVar));
    }

    public final boolean e() {
        if (!this.a.isOpenInternal()) {
            return false;
        }
        if (!this.h) {
            this.a.getOpenHelper().o();
        }
        if (this.h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final wc8 f() {
        return this.i;
    }

    public final RoomDatabase g() {
        return this.a;
    }

    public final l77 h() {
        return this.l;
    }

    public final AtomicBoolean i() {
        return this.g;
    }

    public final Map j() {
        return this.d;
    }

    public final void k(sc8 sc8Var) {
        zq3.h(sc8Var, "database");
        synchronized (this.o) {
            if (this.h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            sc8Var.B("PRAGMA temp_store = MEMORY;");
            sc8Var.B("PRAGMA recursive_triggers='ON';");
            sc8Var.B("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            x(sc8Var);
            this.i = sc8Var.A0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.h = true;
            ww8 ww8Var = ww8.a;
        }
    }

    public final void l(String... strArr) {
        zq3.h(strArr, "tables");
        synchronized (this.l) {
            try {
                for (Map.Entry entry : this.l) {
                    zq3.g(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    C0117d c0117d = (C0117d) entry.getValue();
                    if (!cVar.b()) {
                        c0117d.c(strArr);
                    }
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n() {
        if (this.g.compareAndSet(false, true)) {
            xz xzVar = this.f;
            if (xzVar != null) {
                xzVar.j();
            }
            this.a.getQueryExecutor().execute(this.p);
        }
    }

    public void o() {
        xz xzVar = this.f;
        if (xzVar != null) {
            xzVar.j();
        }
        w();
        this.p.run();
    }

    public void p(c cVar) {
        C0117d c0117d;
        zq3.h(cVar, "observer");
        synchronized (this.l) {
            c0117d = (C0117d) this.l.k(cVar);
        }
        if (c0117d != null) {
            b bVar = this.j;
            int[] a2 = c0117d.a();
            if (bVar.c(Arrays.copyOf(a2, a2.length))) {
                w();
            }
        }
    }

    public final void r(xz xzVar) {
        zq3.h(xzVar, "autoCloser");
        this.f = xzVar;
        xzVar.m(new Runnable() { // from class: dr3
            @Override // java.lang.Runnable
            public final void run() {
                d.this.m();
            }
        });
    }

    public final void s(Context context, String str, Intent intent) {
        zq3.h(context, "context");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(intent, "serviceIntent");
        this.m = new androidx.room.e(context, str, intent, this, this.a.getQueryExecutor());
    }

    public final void u() {
        androidx.room.e eVar = this.m;
        if (eVar != null) {
            eVar.o();
        }
        this.m = null;
    }

    public final void w() {
        if (this.a.isOpenInternal()) {
            x(this.a.getOpenHelper().o());
        }
    }

    public final void x(sc8 sc8Var) {
        zq3.h(sc8Var, "database");
        if (sc8Var.g1()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.n) {
                    int[] a2 = this.j.a();
                    if (a2 == null) {
                        return;
                    }
                    q.a(sc8Var);
                    try {
                        int length = a2.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = a2[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                t(sc8Var, i2);
                            } else if (i3 == 2) {
                                v(sc8Var, i2);
                            }
                            i++;
                            i2 = i4;
                        }
                        sc8Var.R();
                        sc8Var.Z();
                        ww8 ww8Var = ww8.a;
                    } catch (Throwable th) {
                        sc8Var.Z();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        } catch (IllegalStateException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        }
    }
}
