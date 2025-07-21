package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import defpackage.c42;
import defpackage.md8;
import defpackage.ol0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class c77 implements w42, md8, nl0 {
    private static final f12 f = f12.b("proto");
    private final wb7 a;
    private final ul0 b;
    private final ul0 c;
    private final x42 d;
    private final p76 e;

    interface b {
        Object apply(Object obj);
    }

    private static class c {
        final String a;
        final String b;

        private c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    interface d {
        Object a();
    }

    c77(ul0 ul0Var, ul0 ul0Var2, x42 x42Var, wb7 wb7Var, p76 p76Var) {
        this.a = wb7Var;
        this.b = ul0Var;
        this.c = ul0Var2;
        this.d = x42Var;
        this.e = p76Var;
    }

    private long A1() {
        return y1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long B1() {
        return y1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private km8 C1() {
        final long a2 = this.b.a();
        return (km8) E1(new b() { // from class: s67
            @Override // c77.b
            public final Object apply(Object obj) {
                km8 O1;
                O1 = c77.O1(a2, (SQLiteDatabase) obj);
                return O1;
            }
        });
    }

    private Long D1(SQLiteDatabase sQLiteDatabase, as8 as8Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(as8Var.b(), String.valueOf(x26.a(as8Var.d()))));
        if (as8Var.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(as8Var.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) o2(sQLiteDatabase.query("transport_contexts", new String[]{TransferTable.COLUMN_ID}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: n67
            @Override // c77.b
            public final Object apply(Object obj) {
                Long P1;
                P1 = c77.P1((Cursor) obj);
                return P1;
            }
        });
    }

    private boolean F1() {
        return A1() * B1() >= this.d.f();
    }

    private List G1(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            hr5 hr5Var = (hr5) listIterator.next();
            if (map.containsKey(Long.valueOf(hr5Var.c()))) {
                c42.a l = hr5Var.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(hr5Var.c()))) {
                    l.c(cVar.a, cVar.b);
                }
                listIterator.set(hr5.a(hr5Var.c(), hr5Var.d(), l.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object H1(Cursor cursor) {
        while (cursor.moveToNext()) {
            h(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer I1(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        o2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: h67
            @Override // c77.b
            public final Object apply(Object obj) {
                Object H1;
                H1 = c77.this.H1((Cursor) obj);
                return H1;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object J1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object K1(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase L1(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long M1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ km8 N1(long j, Cursor cursor) {
        cursor.moveToNext();
        return km8.c().c(cursor.getLong(0)).b(j).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ km8 O1(final long j, SQLiteDatabase sQLiteDatabase) {
        return (km8) o2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: t67
            @Override // c77.b
            public final Object apply(Object obj) {
                km8 N1;
                N1 = c77.N1(j, (Cursor) obj);
                return N1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long P1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean Q1(as8 as8Var, SQLiteDatabase sQLiteDatabase) {
        Long D1 = D1(sQLiteDatabase, as8Var);
        return D1 == null ? Boolean.FALSE : (Boolean) o2(y1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{D1.toString()}), new b() { // from class: j67
            @Override // c77.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List R1(SQLiteDatabase sQLiteDatabase) {
        return (List) o2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: z67
            @Override // c77.b
            public final Object apply(Object obj) {
                List S1;
                S1 = c77.S1((Cursor) obj);
                return S1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List S1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(as8.a().b(cursor.getString(1)).d(x26.b(cursor.getInt(2))).c(i2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List T1(as8 as8Var, SQLiteDatabase sQLiteDatabase) {
        List g2 = g2(sQLiteDatabase, as8Var, this.d.d());
        for (Priority priority : Priority.values()) {
            if (priority != as8Var.d()) {
                int d2 = this.d.d() - g2.size();
                if (d2 <= 0) {
                    break;
                }
                g2.addAll(g2(sQLiteDatabase, as8Var.f(priority), d2));
            }
        }
        return G1(g2, h2(sQLiteDatabase, g2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ol0 U1(Map map, ol0.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason u1 = u1(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.c().c(u1).b(j).a());
        }
        j2(aVar, map);
        aVar.e(C1());
        aVar.d(z1());
        aVar.c((String) this.e.get());
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ol0 V1(String str, final Map map, final ol0.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (ol0) o2(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: q67
            @Override // c77.b
            public final Object apply(Object obj) {
                ol0 U1;
                U1 = c77.this.U1(map, aVar, (Cursor) obj);
                return U1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object W1(List list, as8 as8Var, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            c42.a k = c42.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z) {
                k.h(new x02(m2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.h(new x02(m2(cursor.getString(4)), k2(j)));
            }
            if (!cursor.isNull(6)) {
                k.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(hr5.a(j, as8Var, k.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object X1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long Y1(c42 c42Var, as8 as8Var, SQLiteDatabase sQLiteDatabase) {
        if (F1()) {
            h(1L, LogEventDropped.Reason.CACHE_FULL, c42Var.j());
            return -1L;
        }
        long w1 = w1(sQLiteDatabase, as8Var);
        int e = this.d.e();
        byte[] a2 = c42Var.e().a();
        boolean z = a2.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(w1));
        contentValues.put("transport_name", c42Var.j());
        contentValues.put("timestamp_ms", Long.valueOf(c42Var.f()));
        contentValues.put("uptime_ms", Long.valueOf(c42Var.k()));
        contentValues.put("payload_encoding", c42Var.e().b().a());
        contentValues.put("code", c42Var.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(a2.length / e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i - 1) * e, Math.min(i * e, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : c42Var.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(AuthenticationTokenClaims.JSON_KEY_NAME, (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] Z1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object a2(Cursor cursor) {
        while (cursor.moveToNext()) {
            h(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object b2(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        o2(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: k67
            @Override // c77.b
            public final Object apply(Object obj) {
                Object a2;
                a2 = c77.this.a2((Cursor) obj);
                return a2;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean c2(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d2(String str, LogEventDropped.Reason reason, long j, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) o2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), new b() { // from class: o67
            @Override // c77.b
            public final Object apply(Object obj) {
                Boolean c2;
                c2 = c77.c2((Cursor) obj);
                return c2;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e2(long j, as8 as8Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{as8Var.b(), String.valueOf(x26.a(as8Var.d()))}) < 1) {
            contentValues.put("backend_name", as8Var.b());
            contentValues.put("priority", Integer.valueOf(x26.a(as8Var.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object f2(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.b.a()).execute();
        return null;
    }

    private List g2(SQLiteDatabase sQLiteDatabase, final as8 as8Var, int i) {
        final ArrayList arrayList = new ArrayList();
        Long D1 = D1(sQLiteDatabase, as8Var);
        if (D1 == null) {
            return arrayList;
        }
        o2(sQLiteDatabase.query("events", new String[]{TransferTable.COLUMN_ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{D1.toString()}, null, null, null, String.valueOf(i)), new b() { // from class: l67
            @Override // c77.b
            public final Object apply(Object obj) {
                Object W1;
                W1 = c77.this.W1(arrayList, as8Var, (Cursor) obj);
                return W1;
            }
        });
        return arrayList;
    }

    private Map h2(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((hr5) list.get(i)).c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        o2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", AuthenticationTokenClaims.JSON_KEY_NAME, "value"}, sb.toString(), null, null, null, null), new b() { // from class: p67
            @Override // c77.b
            public final Object apply(Object obj) {
                Object X1;
                X1 = c77.X1(hashMap, (Cursor) obj);
                return X1;
            }
        });
        return hashMap;
    }

    private static byte[] i2(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void j2(ol0.a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.a(a94.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] k2(long j) {
        return (byte[]) o2(y1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new b() { // from class: r67
            @Override // c77.b
            public final Object apply(Object obj) {
                byte[] Z1;
                Z1 = c77.Z1((Cursor) obj);
                return Z1;
            }
        });
    }

    private Object l2(d dVar, b bVar) {
        long a2 = this.c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.c.a() >= this.d.b() + a2) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static f12 m2(String str) {
        return str == null ? f : f12.b(str);
    }

    private static String n2(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            sb.append(((hr5) it2.next()).c());
            if (it2.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static Object o2(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private LogEventDropped.Reason u1(int i) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i == reason.getNumber()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i == reason2.getNumber()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i == reason3.getNumber()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i == reason4.getNumber()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i == reason5.getNumber()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i == reason6.getNumber()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i == reason7.getNumber()) {
            return reason7;
        }
        ca4.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return reason;
    }

    private void v1(final SQLiteDatabase sQLiteDatabase) {
        l2(new d() { // from class: b67
            @Override // c77.d
            public final Object a() {
                Object J1;
                J1 = c77.J1(sQLiteDatabase);
                return J1;
            }
        }, new b() { // from class: m67
            @Override // c77.b
            public final Object apply(Object obj) {
                Object K1;
                K1 = c77.K1((Throwable) obj);
                return K1;
            }
        });
    }

    private long w1(SQLiteDatabase sQLiteDatabase, as8 as8Var) {
        Long D1 = D1(sQLiteDatabase, as8Var);
        if (D1 != null) {
            return D1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", as8Var.b());
        contentValues.put("priority", Integer.valueOf(x26.a(as8Var.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (as8Var.c() != null) {
            contentValues.put("extras", Base64.encodeToString(as8Var.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private e13 z1() {
        return e13.b().b(h28.c().b(x1()).c(x42.a.f()).a()).a();
    }

    @Override // defpackage.w42
    public long E0(as8 as8Var) {
        return ((Long) o2(y1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{as8Var.b(), String.valueOf(x26.a(as8Var.d()))}), new b() { // from class: x67
            @Override // c77.b
            public final Object apply(Object obj) {
                Long M1;
                M1 = c77.M1((Cursor) obj);
                return M1;
            }
        })).longValue();
    }

    Object E1(b bVar) {
        SQLiteDatabase y1 = y1();
        y1.beginTransaction();
        try {
            Object apply = bVar.apply(y1);
            y1.setTransactionSuccessful();
            return apply;
        } finally {
            y1.endTransaction();
        }
    }

    @Override // defpackage.w42
    public Iterable K() {
        return (Iterable) E1(new b() { // from class: w67
            @Override // c77.b
            public final Object apply(Object obj) {
                List R1;
                R1 = c77.R1((SQLiteDatabase) obj);
                return R1;
            }
        });
    }

    @Override // defpackage.nl0
    public void a() {
        E1(new b() { // from class: f67
            @Override // c77.b
            public final Object apply(Object obj) {
                Object f2;
                f2 = c77.this.f2((SQLiteDatabase) obj);
                return f2;
            }
        });
    }

    @Override // defpackage.md8
    public Object b(md8.a aVar) {
        SQLiteDatabase y1 = y1();
        v1(y1);
        try {
            Object execute = aVar.execute();
            y1.setTransactionSuccessful();
            return execute;
        } finally {
            y1.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.nl0
    public ol0 d() {
        final ol0.a e = ol0.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (ol0) E1(new b() { // from class: i67
            @Override // c77.b
            public final Object apply(Object obj) {
                ol0 V1;
                V1 = c77.this.V1(str, hashMap, e, (SQLiteDatabase) obj);
                return V1;
            }
        });
    }

    @Override // defpackage.w42
    public hr5 d1(final as8 as8Var, final c42 c42Var) {
        ca4.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", as8Var.d(), c42Var.j(), as8Var.b());
        long longValue = ((Long) E1(new b() { // from class: c67
            @Override // c77.b
            public final Object apply(Object obj) {
                Long Y1;
                Y1 = c77.this.Y1(c42Var, as8Var, (SQLiteDatabase) obj);
                return Y1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return hr5.a(longValue, as8Var, c42Var);
    }

    @Override // defpackage.nl0
    public void h(final long j, final LogEventDropped.Reason reason, final String str) {
        E1(new b() { // from class: g67
            @Override // c77.b
            public final Object apply(Object obj) {
                Object d2;
                d2 = c77.d2(str, reason, j, (SQLiteDatabase) obj);
                return d2;
            }
        });
    }

    @Override // defpackage.w42
    public boolean h0(final as8 as8Var) {
        return ((Boolean) E1(new b() { // from class: d67
            @Override // c77.b
            public final Object apply(Object obj) {
                Boolean Q1;
                Q1 = c77.this.Q1(as8Var, (SQLiteDatabase) obj);
                return Q1;
            }
        })).booleanValue();
    }

    @Override // defpackage.w42
    public void n0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + n2(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            E1(new b() { // from class: a77
                @Override // c77.b
                public final Object apply(Object obj) {
                    Object b2;
                    b2 = c77.this.b2(str, str2, (SQLiteDatabase) obj);
                    return b2;
                }
            });
        }
    }

    @Override // defpackage.w42
    public void q1(final as8 as8Var, final long j) {
        E1(new b() { // from class: e67
            @Override // c77.b
            public final Object apply(Object obj) {
                Object e2;
                e2 = c77.e2(j, as8Var, (SQLiteDatabase) obj);
                return e2;
            }
        });
    }

    @Override // defpackage.w42
    public int u() {
        final long a2 = this.b.a() - this.d.c();
        return ((Integer) E1(new b() { // from class: y67
            @Override // c77.b
            public final Object apply(Object obj) {
                Integer I1;
                I1 = c77.this.I1(a2, (SQLiteDatabase) obj);
                return I1;
            }
        })).intValue();
    }

    @Override // defpackage.w42
    public void w(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            y1().compileStatement("DELETE FROM events WHERE _id in " + n2(iterable)).execute();
        }
    }

    long x1() {
        return A1() * B1();
    }

    @Override // defpackage.w42
    public Iterable y(final as8 as8Var) {
        return (Iterable) E1(new b() { // from class: b77
            @Override // c77.b
            public final Object apply(Object obj) {
                List T1;
                T1 = c77.this.T1(as8Var, (SQLiteDatabase) obj);
                return T1;
            }
        });
    }

    SQLiteDatabase y1() {
        final wb7 wb7Var = this.a;
        Objects.requireNonNull(wb7Var);
        return (SQLiteDatabase) l2(new d() { // from class: u67
            @Override // c77.d
            public final Object a() {
                return wb7.this.getWritableDatabase();
            }
        }, new b() { // from class: v67
            @Override // c77.b
            public final Object apply(Object obj) {
                SQLiteDatabase L1;
                L1 = c77.L1((Throwable) obj);
                return L1;
            }
        });
    }
}
