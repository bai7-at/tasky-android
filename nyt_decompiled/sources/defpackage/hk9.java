package defpackage;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.dk9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class hk9 implements ek9 {
    private final RoomDatabase a;
    private final y12 b;
    private final x12 c;
    private final SharedSQLiteStatement d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;
    private final SharedSQLiteStatement h;
    private final SharedSQLiteStatement i;
    private final SharedSQLiteStatement j;
    private final SharedSQLiteStatement k;
    private final SharedSQLiteStatement l;
    private final SharedSQLiteStatement m;
    private final SharedSQLiteStatement n;
    private final SharedSQLiteStatement o;
    private final SharedSQLiteStatement p;
    private final SharedSQLiteStatement q;
    private final SharedSQLiteStatement r;

    class a extends SharedSQLiteStatement {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    class d extends SharedSQLiteStatement {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class e extends SharedSQLiteStatement {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class f extends SharedSQLiteStatement {
        f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class g extends SharedSQLiteStatement {
        g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class h extends SharedSQLiteStatement {
        h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    class i extends y12 {
        i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, dk9 dk9Var) {
            wc8Var.v0(1, dk9Var.a);
            nk9 nk9Var = nk9.a;
            wc8Var.L0(2, nk9.k(dk9Var.b));
            wc8Var.v0(3, dk9Var.c);
            wc8Var.v0(4, dk9Var.d);
            wc8Var.Q0(5, Data.j(dk9Var.e));
            wc8Var.Q0(6, Data.j(dk9Var.f));
            wc8Var.L0(7, dk9Var.g);
            wc8Var.L0(8, dk9Var.h);
            wc8Var.L0(9, dk9Var.i);
            wc8Var.L0(10, dk9Var.k);
            wc8Var.L0(11, nk9.a(dk9Var.l));
            wc8Var.L0(12, dk9Var.m);
            wc8Var.L0(13, dk9Var.n);
            wc8Var.L0(14, dk9Var.o);
            wc8Var.L0(15, dk9Var.p);
            wc8Var.L0(16, dk9Var.q ? 1L : 0L);
            wc8Var.L0(17, nk9.i(dk9Var.r));
            wc8Var.L0(18, dk9Var.i());
            wc8Var.L0(19, dk9Var.f());
            wc8Var.L0(20, dk9Var.g());
            wc8Var.L0(21, dk9Var.h());
            wc8Var.L0(22, dk9Var.j());
            if (dk9Var.k() == null) {
                wc8Var.c1(23);
            } else {
                wc8Var.v0(23, dk9Var.k());
            }
            gv0 gv0Var = dk9Var.j;
            wc8Var.L0(24, nk9.h(gv0Var.f()));
            wc8Var.Q0(25, nk9.c(gv0Var.e()));
            wc8Var.L0(26, gv0Var.i() ? 1L : 0L);
            wc8Var.L0(27, gv0Var.j() ? 1L : 0L);
            wc8Var.L0(28, gv0Var.h() ? 1L : 0L);
            wc8Var.L0(29, gv0Var.k() ? 1L : 0L);
            wc8Var.L0(30, gv0Var.b());
            wc8Var.L0(31, gv0Var.a());
            wc8Var.Q0(32, nk9.j(gv0Var.c()));
        }
    }

    class j implements Callable {
        final /* synthetic */ p27 a;

        j(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Boolean bool;
            Cursor c = p51.c(hk9.this.a, this.a, false, null);
            try {
                if (c.moveToFirst()) {
                    bool = Boolean.valueOf(c.getInt(0) != 0);
                } else {
                    bool = Boolean.FALSE;
                }
                c.close();
                return bool;
            } catch (Throwable th) {
                c.close();
                throw th;
            }
        }

        protected void finalize() {
            this.a.release();
        }
    }

    class k extends x12 {
        k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.x12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, dk9 dk9Var) {
            wc8Var.v0(1, dk9Var.a);
            nk9 nk9Var = nk9.a;
            wc8Var.L0(2, nk9.k(dk9Var.b));
            wc8Var.v0(3, dk9Var.c);
            wc8Var.v0(4, dk9Var.d);
            wc8Var.Q0(5, Data.j(dk9Var.e));
            wc8Var.Q0(6, Data.j(dk9Var.f));
            wc8Var.L0(7, dk9Var.g);
            wc8Var.L0(8, dk9Var.h);
            wc8Var.L0(9, dk9Var.i);
            wc8Var.L0(10, dk9Var.k);
            wc8Var.L0(11, nk9.a(dk9Var.l));
            wc8Var.L0(12, dk9Var.m);
            wc8Var.L0(13, dk9Var.n);
            wc8Var.L0(14, dk9Var.o);
            wc8Var.L0(15, dk9Var.p);
            wc8Var.L0(16, dk9Var.q ? 1L : 0L);
            wc8Var.L0(17, nk9.i(dk9Var.r));
            wc8Var.L0(18, dk9Var.i());
            wc8Var.L0(19, dk9Var.f());
            wc8Var.L0(20, dk9Var.g());
            wc8Var.L0(21, dk9Var.h());
            wc8Var.L0(22, dk9Var.j());
            if (dk9Var.k() == null) {
                wc8Var.c1(23);
            } else {
                wc8Var.v0(23, dk9Var.k());
            }
            gv0 gv0Var = dk9Var.j;
            wc8Var.L0(24, nk9.h(gv0Var.f()));
            wc8Var.Q0(25, nk9.c(gv0Var.e()));
            wc8Var.L0(26, gv0Var.i() ? 1L : 0L);
            wc8Var.L0(27, gv0Var.j() ? 1L : 0L);
            wc8Var.L0(28, gv0Var.h() ? 1L : 0L);
            wc8Var.L0(29, gv0Var.k() ? 1L : 0L);
            wc8Var.L0(30, gv0Var.b());
            wc8Var.L0(31, gv0Var.a());
            wc8Var.Q0(32, nk9.j(gv0Var.c()));
            wc8Var.v0(33, dk9Var.a);
        }
    }

    class l extends SharedSQLiteStatement {
        l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class m extends SharedSQLiteStatement {
        m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class n extends SharedSQLiteStatement {
        n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    class o extends SharedSQLiteStatement {
        o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class p extends SharedSQLiteStatement {
        p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class q extends SharedSQLiteStatement {
        q(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    class r extends SharedSQLiteStatement {
        r(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public hk9(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new i(roomDatabase);
        this.c = new k(roomDatabase);
        this.d = new l(roomDatabase);
        this.e = new m(roomDatabase);
        this.f = new n(roomDatabase);
        this.g = new o(roomDatabase);
        this.h = new p(roomDatabase);
        this.i = new q(roomDatabase);
        this.j = new r(roomDatabase);
        this.k = new a(roomDatabase);
        this.l = new b(roomDatabase);
        this.m = new c(roomDatabase);
        this.n = new d(roomDatabase);
        this.o = new e(roomDatabase);
        this.p = new f(roomDatabase);
        this.q = new g(roomDatabase);
        this.r = new h(roomDatabase);
    }

    private void E(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            gv6.b(hashMap, true, new ss2() { // from class: gk9
                @Override // defpackage.ss2
                public final Object invoke(Object obj) {
                    ww8 I;
                    I = hk9.this.I((HashMap) obj);
                    return I;
                }
            });
            return;
        }
        StringBuilder b2 = p48.b();
        b2.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        p48.a(b2, size);
        b2.append(")");
        p27 d2 = p27.d(b2.toString(), size);
        Iterator it2 = keySet.iterator();
        int i2 = 1;
        while (it2.hasNext()) {
            d2.v0(i2, (String) it2.next());
            i2++;
        }
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            int c3 = q41.c(c2, "work_spec_id");
            if (c3 == -1) {
                return;
            }
            while (c2.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(c2.getString(c3));
                if (arrayList != null) {
                    arrayList.add(Data.b(c2.getBlob(0)));
                }
            }
        } finally {
            c2.close();
        }
    }

    private void F(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            gv6.b(hashMap, true, new ss2() { // from class: fk9
                @Override // defpackage.ss2
                public final Object invoke(Object obj) {
                    ww8 J;
                    J = hk9.this.J((HashMap) obj);
                    return J;
                }
            });
            return;
        }
        StringBuilder b2 = p48.b();
        b2.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        p48.a(b2, size);
        b2.append(")");
        p27 d2 = p27.d(b2.toString(), size);
        Iterator it2 = keySet.iterator();
        int i2 = 1;
        while (it2.hasNext()) {
            d2.v0(i2, (String) it2.next());
            i2++;
        }
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            int c3 = q41.c(c2, "work_spec_id");
            if (c3 == -1) {
                return;
            }
            while (c2.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(c2.getString(c3));
                if (arrayList != null) {
                    arrayList.add(c2.getString(0));
                }
            }
        } finally {
            c2.close();
        }
    }

    public static List H() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ww8 I(HashMap hashMap) {
        E(hashMap);
        return ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ww8 J(HashMap hashMap) {
        F(hashMap);
        return ww8.a;
    }

    @Override // defpackage.ek9
    public int A() {
        p27 d2 = p27.d("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            return c2.moveToFirst() ? c2.getInt(0) : 0;
        } finally {
            c2.close();
            d2.release();
        }
    }

    @Override // defpackage.ek9
    public void B(String str, int i2) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.m.acquire();
        acquire.v0(1, str);
        acquire.L0(2, i2);
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.m.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public void a(String str) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.d.acquire();
        acquire.v0(1, str);
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.d.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public void b(String str) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.g.acquire();
        acquire.v0(1, str);
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.g.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public List c(long j2) {
        p27 p27Var;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        int d11;
        int d12;
        int d13;
        int d14;
        int d15;
        int i2;
        boolean z;
        String string;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        p27 d16 = p27.d("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        d16.L0(1, j2);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d16, false, null);
        try {
            d2 = q41.d(c2, "id");
            d3 = q41.d(c2, TransferTable.COLUMN_STATE);
            d4 = q41.d(c2, "worker_class_name");
            d5 = q41.d(c2, "input_merger_class_name");
            d6 = q41.d(c2, "input");
            d7 = q41.d(c2, "output");
            d8 = q41.d(c2, "initial_delay");
            d9 = q41.d(c2, "interval_duration");
            d10 = q41.d(c2, "flex_duration");
            d11 = q41.d(c2, "run_attempt_count");
            d12 = q41.d(c2, "backoff_policy");
            d13 = q41.d(c2, "backoff_delay_duration");
            d14 = q41.d(c2, "last_enqueue_time");
            d15 = q41.d(c2, "minimum_retention_duration");
            p27Var = d16;
        } catch (Throwable th) {
            th = th;
            p27Var = d16;
        }
        try {
            int d17 = q41.d(c2, "schedule_requested_at");
            int d18 = q41.d(c2, "run_in_foreground");
            int d19 = q41.d(c2, "out_of_quota_policy");
            int d20 = q41.d(c2, "period_count");
            int d21 = q41.d(c2, "generation");
            int d22 = q41.d(c2, "next_schedule_time_override");
            int d23 = q41.d(c2, "next_schedule_time_override_generation");
            int d24 = q41.d(c2, "stop_reason");
            int d25 = q41.d(c2, "trace_tag");
            int d26 = q41.d(c2, "required_network_type");
            int d27 = q41.d(c2, "required_network_request");
            int d28 = q41.d(c2, "requires_charging");
            int d29 = q41.d(c2, "requires_device_idle");
            int d30 = q41.d(c2, "requires_battery_not_low");
            int d31 = q41.d(c2, "requires_storage_not_low");
            int d32 = q41.d(c2, "trigger_content_update_delay");
            int d33 = q41.d(c2, "trigger_max_content_delay");
            int d34 = q41.d(c2, "content_uri_triggers");
            int i8 = d15;
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                String string2 = c2.getString(d2);
                WorkInfo.State g2 = nk9.g(c2.getInt(d3));
                String string3 = c2.getString(d4);
                String string4 = c2.getString(d5);
                Data b2 = Data.b(c2.getBlob(d6));
                Data b3 = Data.b(c2.getBlob(d7));
                long j3 = c2.getLong(d8);
                long j4 = c2.getLong(d9);
                long j5 = c2.getLong(d10);
                int i9 = c2.getInt(d11);
                BackoffPolicy d35 = nk9.d(c2.getInt(d12));
                long j6 = c2.getLong(d13);
                long j7 = c2.getLong(d14);
                int i10 = i8;
                long j8 = c2.getLong(i10);
                int i11 = d2;
                int i12 = d17;
                long j9 = c2.getLong(i12);
                d17 = i12;
                int i13 = d18;
                if (c2.getInt(i13) != 0) {
                    d18 = i13;
                    i2 = d19;
                    z = true;
                } else {
                    d18 = i13;
                    i2 = d19;
                    z = false;
                }
                OutOfQuotaPolicy f2 = nk9.f(c2.getInt(i2));
                d19 = i2;
                int i14 = d20;
                int i15 = c2.getInt(i14);
                d20 = i14;
                int i16 = d21;
                int i17 = c2.getInt(i16);
                d21 = i16;
                int i18 = d22;
                long j10 = c2.getLong(i18);
                d22 = i18;
                int i19 = d23;
                int i20 = c2.getInt(i19);
                d23 = i19;
                int i21 = d24;
                int i22 = c2.getInt(i21);
                d24 = i21;
                int i23 = d25;
                if (c2.isNull(i23)) {
                    d25 = i23;
                    i3 = d26;
                    string = null;
                } else {
                    string = c2.getString(i23);
                    d25 = i23;
                    i3 = d26;
                }
                NetworkType e2 = nk9.e(c2.getInt(i3));
                d26 = i3;
                int i24 = d27;
                t45 l2 = nk9.l(c2.getBlob(i24));
                d27 = i24;
                int i25 = d28;
                if (c2.getInt(i25) != 0) {
                    d28 = i25;
                    i4 = d29;
                    z2 = true;
                } else {
                    d28 = i25;
                    i4 = d29;
                    z2 = false;
                }
                if (c2.getInt(i4) != 0) {
                    d29 = i4;
                    i5 = d30;
                    z3 = true;
                } else {
                    d29 = i4;
                    i5 = d30;
                    z3 = false;
                }
                if (c2.getInt(i5) != 0) {
                    d30 = i5;
                    i6 = d31;
                    z4 = true;
                } else {
                    d30 = i5;
                    i6 = d31;
                    z4 = false;
                }
                if (c2.getInt(i6) != 0) {
                    d31 = i6;
                    i7 = d32;
                    z5 = true;
                } else {
                    d31 = i6;
                    i7 = d32;
                    z5 = false;
                }
                long j11 = c2.getLong(i7);
                d32 = i7;
                int i26 = d33;
                long j12 = c2.getLong(i26);
                d33 = i26;
                int i27 = d34;
                d34 = i27;
                arrayList.add(new dk9(string2, g2, string3, string4, b2, b3, j3, j4, j5, new gv0(l2, e2, z2, z3, z4, z5, j11, j12, nk9.b(c2.getBlob(i27))), i9, d35, j6, j7, j8, j9, z, f2, i15, i17, j10, i20, i22, string));
                d2 = i11;
                i8 = i10;
            }
            c2.close();
            p27Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c2.close();
            p27Var.release();
            throw th;
        }
    }

    @Override // defpackage.ek9
    public void d(String str, int i2) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.r.acquire();
        acquire.L0(1, i2);
        acquire.v0(2, str);
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.r.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public List e() {
        p27 p27Var;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        int d11;
        int d12;
        int d13;
        int d14;
        int d15;
        int i2;
        boolean z;
        String string;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        p27 d16 = p27.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d16, false, null);
        try {
            d2 = q41.d(c2, "id");
            d3 = q41.d(c2, TransferTable.COLUMN_STATE);
            d4 = q41.d(c2, "worker_class_name");
            d5 = q41.d(c2, "input_merger_class_name");
            d6 = q41.d(c2, "input");
            d7 = q41.d(c2, "output");
            d8 = q41.d(c2, "initial_delay");
            d9 = q41.d(c2, "interval_duration");
            d10 = q41.d(c2, "flex_duration");
            d11 = q41.d(c2, "run_attempt_count");
            d12 = q41.d(c2, "backoff_policy");
            d13 = q41.d(c2, "backoff_delay_duration");
            d14 = q41.d(c2, "last_enqueue_time");
            d15 = q41.d(c2, "minimum_retention_duration");
            p27Var = d16;
        } catch (Throwable th) {
            th = th;
            p27Var = d16;
        }
        try {
            int d17 = q41.d(c2, "schedule_requested_at");
            int d18 = q41.d(c2, "run_in_foreground");
            int d19 = q41.d(c2, "out_of_quota_policy");
            int d20 = q41.d(c2, "period_count");
            int d21 = q41.d(c2, "generation");
            int d22 = q41.d(c2, "next_schedule_time_override");
            int d23 = q41.d(c2, "next_schedule_time_override_generation");
            int d24 = q41.d(c2, "stop_reason");
            int d25 = q41.d(c2, "trace_tag");
            int d26 = q41.d(c2, "required_network_type");
            int d27 = q41.d(c2, "required_network_request");
            int d28 = q41.d(c2, "requires_charging");
            int d29 = q41.d(c2, "requires_device_idle");
            int d30 = q41.d(c2, "requires_battery_not_low");
            int d31 = q41.d(c2, "requires_storage_not_low");
            int d32 = q41.d(c2, "trigger_content_update_delay");
            int d33 = q41.d(c2, "trigger_max_content_delay");
            int d34 = q41.d(c2, "content_uri_triggers");
            int i8 = d15;
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                String string2 = c2.getString(d2);
                WorkInfo.State g2 = nk9.g(c2.getInt(d3));
                String string3 = c2.getString(d4);
                String string4 = c2.getString(d5);
                Data b2 = Data.b(c2.getBlob(d6));
                Data b3 = Data.b(c2.getBlob(d7));
                long j2 = c2.getLong(d8);
                long j3 = c2.getLong(d9);
                long j4 = c2.getLong(d10);
                int i9 = c2.getInt(d11);
                BackoffPolicy d35 = nk9.d(c2.getInt(d12));
                long j5 = c2.getLong(d13);
                long j6 = c2.getLong(d14);
                int i10 = i8;
                long j7 = c2.getLong(i10);
                int i11 = d2;
                int i12 = d17;
                long j8 = c2.getLong(i12);
                d17 = i12;
                int i13 = d18;
                if (c2.getInt(i13) != 0) {
                    d18 = i13;
                    i2 = d19;
                    z = true;
                } else {
                    d18 = i13;
                    i2 = d19;
                    z = false;
                }
                OutOfQuotaPolicy f2 = nk9.f(c2.getInt(i2));
                d19 = i2;
                int i14 = d20;
                int i15 = c2.getInt(i14);
                d20 = i14;
                int i16 = d21;
                int i17 = c2.getInt(i16);
                d21 = i16;
                int i18 = d22;
                long j9 = c2.getLong(i18);
                d22 = i18;
                int i19 = d23;
                int i20 = c2.getInt(i19);
                d23 = i19;
                int i21 = d24;
                int i22 = c2.getInt(i21);
                d24 = i21;
                int i23 = d25;
                if (c2.isNull(i23)) {
                    d25 = i23;
                    i3 = d26;
                    string = null;
                } else {
                    string = c2.getString(i23);
                    d25 = i23;
                    i3 = d26;
                }
                NetworkType e2 = nk9.e(c2.getInt(i3));
                d26 = i3;
                int i24 = d27;
                t45 l2 = nk9.l(c2.getBlob(i24));
                d27 = i24;
                int i25 = d28;
                if (c2.getInt(i25) != 0) {
                    d28 = i25;
                    i4 = d29;
                    z2 = true;
                } else {
                    d28 = i25;
                    i4 = d29;
                    z2 = false;
                }
                if (c2.getInt(i4) != 0) {
                    d29 = i4;
                    i5 = d30;
                    z3 = true;
                } else {
                    d29 = i4;
                    i5 = d30;
                    z3 = false;
                }
                if (c2.getInt(i5) != 0) {
                    d30 = i5;
                    i6 = d31;
                    z4 = true;
                } else {
                    d30 = i5;
                    i6 = d31;
                    z4 = false;
                }
                if (c2.getInt(i6) != 0) {
                    d31 = i6;
                    i7 = d32;
                    z5 = true;
                } else {
                    d31 = i6;
                    i7 = d32;
                    z5 = false;
                }
                long j10 = c2.getLong(i7);
                d32 = i7;
                int i26 = d33;
                long j11 = c2.getLong(i26);
                d33 = i26;
                int i27 = d34;
                d34 = i27;
                arrayList.add(new dk9(string2, g2, string3, string4, b2, b3, j2, j3, j4, new gv0(l2, e2, z2, z3, z4, z5, j10, j11, nk9.b(c2.getBlob(i27))), i9, d35, j5, j6, j7, j8, z, f2, i15, i17, j9, i20, i22, string));
                d2 = i11;
                i8 = i10;
            }
            c2.close();
            p27Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c2.close();
            p27Var.release();
            throw th;
        }
    }

    @Override // defpackage.ek9
    public List f(String str) {
        p27 d2 = p27.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        d2.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                arrayList.add(c2.getString(0));
            }
            return arrayList;
        } finally {
            c2.close();
            d2.release();
        }
    }

    @Override // defpackage.ek9
    public WorkInfo.State g(String str) {
        p27 d2 = p27.d("SELECT state FROM workspec WHERE id=?", 1);
        d2.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        WorkInfo.State state = null;
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            if (c2.moveToFirst()) {
                Integer valueOf = c2.isNull(0) ? null : Integer.valueOf(c2.getInt(0));
                if (valueOf != null) {
                    nk9 nk9Var = nk9.a;
                    state = nk9.g(valueOf.intValue());
                }
            }
            return state;
        } finally {
            c2.close();
            d2.release();
        }
    }

    @Override // defpackage.ek9
    public dk9 h(String str) {
        p27 p27Var;
        dk9 dk9Var;
        int i2;
        boolean z;
        String string;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        p27 d2 = p27.d("SELECT * FROM workspec WHERE id=?", 1);
        d2.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            int d3 = q41.d(c2, "id");
            int d4 = q41.d(c2, TransferTable.COLUMN_STATE);
            int d5 = q41.d(c2, "worker_class_name");
            int d6 = q41.d(c2, "input_merger_class_name");
            int d7 = q41.d(c2, "input");
            int d8 = q41.d(c2, "output");
            int d9 = q41.d(c2, "initial_delay");
            int d10 = q41.d(c2, "interval_duration");
            int d11 = q41.d(c2, "flex_duration");
            int d12 = q41.d(c2, "run_attempt_count");
            int d13 = q41.d(c2, "backoff_policy");
            int d14 = q41.d(c2, "backoff_delay_duration");
            int d15 = q41.d(c2, "last_enqueue_time");
            int d16 = q41.d(c2, "minimum_retention_duration");
            p27Var = d2;
            try {
                int d17 = q41.d(c2, "schedule_requested_at");
                int d18 = q41.d(c2, "run_in_foreground");
                int d19 = q41.d(c2, "out_of_quota_policy");
                int d20 = q41.d(c2, "period_count");
                int d21 = q41.d(c2, "generation");
                int d22 = q41.d(c2, "next_schedule_time_override");
                int d23 = q41.d(c2, "next_schedule_time_override_generation");
                int d24 = q41.d(c2, "stop_reason");
                int d25 = q41.d(c2, "trace_tag");
                int d26 = q41.d(c2, "required_network_type");
                int d27 = q41.d(c2, "required_network_request");
                int d28 = q41.d(c2, "requires_charging");
                int d29 = q41.d(c2, "requires_device_idle");
                int d30 = q41.d(c2, "requires_battery_not_low");
                int d31 = q41.d(c2, "requires_storage_not_low");
                int d32 = q41.d(c2, "trigger_content_update_delay");
                int d33 = q41.d(c2, "trigger_max_content_delay");
                int d34 = q41.d(c2, "content_uri_triggers");
                if (c2.moveToFirst()) {
                    String string2 = c2.getString(d3);
                    WorkInfo.State g2 = nk9.g(c2.getInt(d4));
                    String string3 = c2.getString(d5);
                    String string4 = c2.getString(d6);
                    Data b2 = Data.b(c2.getBlob(d7));
                    Data b3 = Data.b(c2.getBlob(d8));
                    long j2 = c2.getLong(d9);
                    long j3 = c2.getLong(d10);
                    long j4 = c2.getLong(d11);
                    int i8 = c2.getInt(d12);
                    BackoffPolicy d35 = nk9.d(c2.getInt(d13));
                    long j5 = c2.getLong(d14);
                    long j6 = c2.getLong(d15);
                    long j7 = c2.getLong(d16);
                    long j8 = c2.getLong(d17);
                    if (c2.getInt(d18) != 0) {
                        i2 = d19;
                        z = true;
                    } else {
                        i2 = d19;
                        z = false;
                    }
                    OutOfQuotaPolicy f2 = nk9.f(c2.getInt(i2));
                    int i9 = c2.getInt(d20);
                    int i10 = c2.getInt(d21);
                    long j9 = c2.getLong(d22);
                    int i11 = c2.getInt(d23);
                    int i12 = c2.getInt(d24);
                    if (c2.isNull(d25)) {
                        i3 = d26;
                        string = null;
                    } else {
                        string = c2.getString(d25);
                        i3 = d26;
                    }
                    NetworkType e2 = nk9.e(c2.getInt(i3));
                    t45 l2 = nk9.l(c2.getBlob(d27));
                    if (c2.getInt(d28) != 0) {
                        i4 = d29;
                        z2 = true;
                    } else {
                        i4 = d29;
                        z2 = false;
                    }
                    if (c2.getInt(i4) != 0) {
                        i5 = d30;
                        z3 = true;
                    } else {
                        i5 = d30;
                        z3 = false;
                    }
                    if (c2.getInt(i5) != 0) {
                        i6 = d31;
                        z4 = true;
                    } else {
                        i6 = d31;
                        z4 = false;
                    }
                    if (c2.getInt(i6) != 0) {
                        i7 = d32;
                        z5 = true;
                    } else {
                        i7 = d32;
                        z5 = false;
                    }
                    dk9Var = new dk9(string2, g2, string3, string4, b2, b3, j2, j3, j4, new gv0(l2, e2, z2, z3, z4, z5, c2.getLong(i7), c2.getLong(d33), nk9.b(c2.getBlob(d34))), i8, d35, j5, j6, j7, j8, z, f2, i9, i10, j9, i11, i12, string);
                } else {
                    dk9Var = null;
                }
                c2.close();
                p27Var.release();
                return dk9Var;
            } catch (Throwable th) {
                th = th;
                c2.close();
                p27Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            p27Var = d2;
        }
    }

    @Override // defpackage.ek9
    public void i(dk9 dk9Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(dk9Var);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.ek9
    public int j(String str) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.f.acquire();
        acquire.v0(1, str);
        try {
            this.a.beginTransaction();
            try {
                int E = acquire.E();
                this.a.setTransactionSuccessful();
                return E;
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.f.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public List k(String str) {
        p27 d2 = p27.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        d2.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                arrayList.add(c2.getString(0));
            }
            return arrayList;
        } finally {
            c2.close();
            d2.release();
        }
    }

    @Override // defpackage.ek9
    public List l(String str) {
        p27 d2 = p27.d("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        d2.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                arrayList.add(Data.b(c2.getBlob(0)));
            }
            return arrayList;
        } finally {
            c2.close();
            d2.release();
        }
    }

    @Override // defpackage.ek9
    public List m(String str) {
        p27 d2 = p27.d("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        d2.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor c2 = p51.c(this.a, d2, true, null);
            try {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (c2.moveToNext()) {
                    String string = c2.getString(0);
                    if (!hashMap.containsKey(string)) {
                        hashMap.put(string, new ArrayList());
                    }
                    String string2 = c2.getString(0);
                    if (!hashMap2.containsKey(string2)) {
                        hashMap2.put(string2, new ArrayList());
                    }
                }
                c2.moveToPosition(-1);
                F(hashMap);
                E(hashMap2);
                ArrayList arrayList = new ArrayList(c2.getCount());
                while (c2.moveToNext()) {
                    String string3 = c2.getString(0);
                    WorkInfo.State g2 = nk9.g(c2.getInt(1));
                    Data b2 = Data.b(c2.getBlob(2));
                    int i2 = c2.getInt(3);
                    int i3 = c2.getInt(4);
                    arrayList.add(new dk9.c(string3, g2, b2, c2.getLong(14), c2.getLong(15), c2.getLong(16), new gv0(nk9.l(c2.getBlob(6)), nk9.e(c2.getInt(5)), c2.getInt(7) != 0, c2.getInt(8) != 0, c2.getInt(9) != 0, c2.getInt(10) != 0, c2.getLong(11), c2.getLong(12), nk9.b(c2.getBlob(13))), i2, nk9.d(c2.getInt(17)), c2.getLong(18), c2.getLong(19), c2.getInt(20), i3, c2.getLong(21), c2.getInt(22), (ArrayList) hashMap.get(c2.getString(0)), (ArrayList) hashMap2.get(c2.getString(0))));
                }
                this.a.setTransactionSuccessful();
                c2.close();
                d2.release();
                return arrayList;
            } catch (Throwable th) {
                c2.close();
                d2.release();
                throw th;
            }
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.ek9
    public List n(int i2) {
        p27 p27Var;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        int d11;
        int d12;
        int d13;
        int d14;
        int d15;
        int i3;
        boolean z;
        String string;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        p27 d16 = p27.d("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        d16.L0(1, i2);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d16, false, null);
        try {
            d2 = q41.d(c2, "id");
            d3 = q41.d(c2, TransferTable.COLUMN_STATE);
            d4 = q41.d(c2, "worker_class_name");
            d5 = q41.d(c2, "input_merger_class_name");
            d6 = q41.d(c2, "input");
            d7 = q41.d(c2, "output");
            d8 = q41.d(c2, "initial_delay");
            d9 = q41.d(c2, "interval_duration");
            d10 = q41.d(c2, "flex_duration");
            d11 = q41.d(c2, "run_attempt_count");
            d12 = q41.d(c2, "backoff_policy");
            d13 = q41.d(c2, "backoff_delay_duration");
            d14 = q41.d(c2, "last_enqueue_time");
            d15 = q41.d(c2, "minimum_retention_duration");
            p27Var = d16;
        } catch (Throwable th) {
            th = th;
            p27Var = d16;
        }
        try {
            int d17 = q41.d(c2, "schedule_requested_at");
            int d18 = q41.d(c2, "run_in_foreground");
            int d19 = q41.d(c2, "out_of_quota_policy");
            int d20 = q41.d(c2, "period_count");
            int d21 = q41.d(c2, "generation");
            int d22 = q41.d(c2, "next_schedule_time_override");
            int d23 = q41.d(c2, "next_schedule_time_override_generation");
            int d24 = q41.d(c2, "stop_reason");
            int d25 = q41.d(c2, "trace_tag");
            int d26 = q41.d(c2, "required_network_type");
            int d27 = q41.d(c2, "required_network_request");
            int d28 = q41.d(c2, "requires_charging");
            int d29 = q41.d(c2, "requires_device_idle");
            int d30 = q41.d(c2, "requires_battery_not_low");
            int d31 = q41.d(c2, "requires_storage_not_low");
            int d32 = q41.d(c2, "trigger_content_update_delay");
            int d33 = q41.d(c2, "trigger_max_content_delay");
            int d34 = q41.d(c2, "content_uri_triggers");
            int i9 = d15;
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                String string2 = c2.getString(d2);
                WorkInfo.State g2 = nk9.g(c2.getInt(d3));
                String string3 = c2.getString(d4);
                String string4 = c2.getString(d5);
                Data b2 = Data.b(c2.getBlob(d6));
                Data b3 = Data.b(c2.getBlob(d7));
                long j2 = c2.getLong(d8);
                long j3 = c2.getLong(d9);
                long j4 = c2.getLong(d10);
                int i10 = c2.getInt(d11);
                BackoffPolicy d35 = nk9.d(c2.getInt(d12));
                long j5 = c2.getLong(d13);
                long j6 = c2.getLong(d14);
                int i11 = i9;
                long j7 = c2.getLong(i11);
                int i12 = d2;
                int i13 = d17;
                long j8 = c2.getLong(i13);
                d17 = i13;
                int i14 = d18;
                if (c2.getInt(i14) != 0) {
                    d18 = i14;
                    i3 = d19;
                    z = true;
                } else {
                    d18 = i14;
                    i3 = d19;
                    z = false;
                }
                OutOfQuotaPolicy f2 = nk9.f(c2.getInt(i3));
                d19 = i3;
                int i15 = d20;
                int i16 = c2.getInt(i15);
                d20 = i15;
                int i17 = d21;
                int i18 = c2.getInt(i17);
                d21 = i17;
                int i19 = d22;
                long j9 = c2.getLong(i19);
                d22 = i19;
                int i20 = d23;
                int i21 = c2.getInt(i20);
                d23 = i20;
                int i22 = d24;
                int i23 = c2.getInt(i22);
                d24 = i22;
                int i24 = d25;
                if (c2.isNull(i24)) {
                    d25 = i24;
                    i4 = d26;
                    string = null;
                } else {
                    string = c2.getString(i24);
                    d25 = i24;
                    i4 = d26;
                }
                NetworkType e2 = nk9.e(c2.getInt(i4));
                d26 = i4;
                int i25 = d27;
                t45 l2 = nk9.l(c2.getBlob(i25));
                d27 = i25;
                int i26 = d28;
                if (c2.getInt(i26) != 0) {
                    d28 = i26;
                    i5 = d29;
                    z2 = true;
                } else {
                    d28 = i26;
                    i5 = d29;
                    z2 = false;
                }
                if (c2.getInt(i5) != 0) {
                    d29 = i5;
                    i6 = d30;
                    z3 = true;
                } else {
                    d29 = i5;
                    i6 = d30;
                    z3 = false;
                }
                if (c2.getInt(i6) != 0) {
                    d30 = i6;
                    i7 = d31;
                    z4 = true;
                } else {
                    d30 = i6;
                    i7 = d31;
                    z4 = false;
                }
                if (c2.getInt(i7) != 0) {
                    d31 = i7;
                    i8 = d32;
                    z5 = true;
                } else {
                    d31 = i7;
                    i8 = d32;
                    z5 = false;
                }
                long j10 = c2.getLong(i8);
                d32 = i8;
                int i27 = d33;
                long j11 = c2.getLong(i27);
                d33 = i27;
                int i28 = d34;
                d34 = i28;
                arrayList.add(new dk9(string2, g2, string3, string4, b2, b3, j2, j3, j4, new gv0(l2, e2, z2, z3, z4, z5, j10, j11, nk9.b(c2.getBlob(i28))), i10, d35, j5, j6, j7, j8, z, f2, i16, i18, j9, i21, i23, string));
                d2 = i12;
                i9 = i11;
            }
            c2.close();
            p27Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c2.close();
            p27Var.release();
            throw th;
        }
    }

    @Override // defpackage.ek9
    public int o() {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.o.acquire();
        try {
            this.a.beginTransaction();
            try {
                int E = acquire.E();
                this.a.setTransactionSuccessful();
                return E;
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.o.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public int p(String str, long j2) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.n.acquire();
        acquire.L0(1, j2);
        acquire.v0(2, str);
        try {
            this.a.beginTransaction();
            try {
                int E = acquire.E();
                this.a.setTransactionSuccessful();
                return E;
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.n.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public List q(String str) {
        p27 d2 = p27.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        d2.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                arrayList.add(new dk9.b(c2.getString(0), nk9.g(c2.getInt(1))));
            }
            return arrayList;
        } finally {
            c2.close();
            d2.release();
        }
    }

    @Override // defpackage.ek9
    public Flow r() {
        return CoroutinesRoom.a(this.a, false, new String[]{"workspec"}, new j(p27.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)));
    }

    @Override // defpackage.ek9
    public List s(int i2) {
        p27 p27Var;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        int d11;
        int d12;
        int d13;
        int d14;
        int d15;
        int i3;
        boolean z;
        String string;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        p27 d16 = p27.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        d16.L0(1, i2);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d16, false, null);
        try {
            d2 = q41.d(c2, "id");
            d3 = q41.d(c2, TransferTable.COLUMN_STATE);
            d4 = q41.d(c2, "worker_class_name");
            d5 = q41.d(c2, "input_merger_class_name");
            d6 = q41.d(c2, "input");
            d7 = q41.d(c2, "output");
            d8 = q41.d(c2, "initial_delay");
            d9 = q41.d(c2, "interval_duration");
            d10 = q41.d(c2, "flex_duration");
            d11 = q41.d(c2, "run_attempt_count");
            d12 = q41.d(c2, "backoff_policy");
            d13 = q41.d(c2, "backoff_delay_duration");
            d14 = q41.d(c2, "last_enqueue_time");
            d15 = q41.d(c2, "minimum_retention_duration");
            p27Var = d16;
        } catch (Throwable th) {
            th = th;
            p27Var = d16;
        }
        try {
            int d17 = q41.d(c2, "schedule_requested_at");
            int d18 = q41.d(c2, "run_in_foreground");
            int d19 = q41.d(c2, "out_of_quota_policy");
            int d20 = q41.d(c2, "period_count");
            int d21 = q41.d(c2, "generation");
            int d22 = q41.d(c2, "next_schedule_time_override");
            int d23 = q41.d(c2, "next_schedule_time_override_generation");
            int d24 = q41.d(c2, "stop_reason");
            int d25 = q41.d(c2, "trace_tag");
            int d26 = q41.d(c2, "required_network_type");
            int d27 = q41.d(c2, "required_network_request");
            int d28 = q41.d(c2, "requires_charging");
            int d29 = q41.d(c2, "requires_device_idle");
            int d30 = q41.d(c2, "requires_battery_not_low");
            int d31 = q41.d(c2, "requires_storage_not_low");
            int d32 = q41.d(c2, "trigger_content_update_delay");
            int d33 = q41.d(c2, "trigger_max_content_delay");
            int d34 = q41.d(c2, "content_uri_triggers");
            int i9 = d15;
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                String string2 = c2.getString(d2);
                WorkInfo.State g2 = nk9.g(c2.getInt(d3));
                String string3 = c2.getString(d4);
                String string4 = c2.getString(d5);
                Data b2 = Data.b(c2.getBlob(d6));
                Data b3 = Data.b(c2.getBlob(d7));
                long j2 = c2.getLong(d8);
                long j3 = c2.getLong(d9);
                long j4 = c2.getLong(d10);
                int i10 = c2.getInt(d11);
                BackoffPolicy d35 = nk9.d(c2.getInt(d12));
                long j5 = c2.getLong(d13);
                long j6 = c2.getLong(d14);
                int i11 = i9;
                long j7 = c2.getLong(i11);
                int i12 = d2;
                int i13 = d17;
                long j8 = c2.getLong(i13);
                d17 = i13;
                int i14 = d18;
                if (c2.getInt(i14) != 0) {
                    d18 = i14;
                    i3 = d19;
                    z = true;
                } else {
                    d18 = i14;
                    i3 = d19;
                    z = false;
                }
                OutOfQuotaPolicy f2 = nk9.f(c2.getInt(i3));
                d19 = i3;
                int i15 = d20;
                int i16 = c2.getInt(i15);
                d20 = i15;
                int i17 = d21;
                int i18 = c2.getInt(i17);
                d21 = i17;
                int i19 = d22;
                long j9 = c2.getLong(i19);
                d22 = i19;
                int i20 = d23;
                int i21 = c2.getInt(i20);
                d23 = i20;
                int i22 = d24;
                int i23 = c2.getInt(i22);
                d24 = i22;
                int i24 = d25;
                if (c2.isNull(i24)) {
                    d25 = i24;
                    i4 = d26;
                    string = null;
                } else {
                    string = c2.getString(i24);
                    d25 = i24;
                    i4 = d26;
                }
                NetworkType e2 = nk9.e(c2.getInt(i4));
                d26 = i4;
                int i25 = d27;
                t45 l2 = nk9.l(c2.getBlob(i25));
                d27 = i25;
                int i26 = d28;
                if (c2.getInt(i26) != 0) {
                    d28 = i26;
                    i5 = d29;
                    z2 = true;
                } else {
                    d28 = i26;
                    i5 = d29;
                    z2 = false;
                }
                if (c2.getInt(i5) != 0) {
                    d29 = i5;
                    i6 = d30;
                    z3 = true;
                } else {
                    d29 = i5;
                    i6 = d30;
                    z3 = false;
                }
                if (c2.getInt(i6) != 0) {
                    d30 = i6;
                    i7 = d31;
                    z4 = true;
                } else {
                    d30 = i6;
                    i7 = d31;
                    z4 = false;
                }
                if (c2.getInt(i7) != 0) {
                    d31 = i7;
                    i8 = d32;
                    z5 = true;
                } else {
                    d31 = i7;
                    i8 = d32;
                    z5 = false;
                }
                long j10 = c2.getLong(i8);
                d32 = i8;
                int i27 = d33;
                long j11 = c2.getLong(i27);
                d33 = i27;
                int i28 = d34;
                d34 = i28;
                arrayList.add(new dk9(string2, g2, string3, string4, b2, b3, j2, j3, j4, new gv0(l2, e2, z2, z3, z4, z5, j10, j11, nk9.b(c2.getBlob(i28))), i10, d35, j5, j6, j7, j8, z, f2, i16, i18, j9, i21, i23, string));
                d2 = i12;
                i9 = i11;
            }
            c2.close();
            p27Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c2.close();
            p27Var.release();
            throw th;
        }
    }

    @Override // defpackage.ek9
    public int t(WorkInfo.State state, String str) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.e.acquire();
        acquire.L0(1, nk9.k(state));
        acquire.v0(2, str);
        try {
            this.a.beginTransaction();
            try {
                int E = acquire.E();
                this.a.setTransactionSuccessful();
                return E;
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.e.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public void u(String str, Data data) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.h.acquire();
        acquire.Q0(1, Data.j(data));
        acquire.v0(2, str);
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.h.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public void v(String str, long j2) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.i.acquire();
        acquire.L0(1, j2);
        acquire.v0(2, str);
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.i.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public List w() {
        p27 p27Var;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        int d11;
        int d12;
        int d13;
        int d14;
        int d15;
        int i2;
        boolean z;
        String string;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        p27 d16 = p27.d("SELECT * FROM workspec WHERE state=1", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d16, false, null);
        try {
            d2 = q41.d(c2, "id");
            d3 = q41.d(c2, TransferTable.COLUMN_STATE);
            d4 = q41.d(c2, "worker_class_name");
            d5 = q41.d(c2, "input_merger_class_name");
            d6 = q41.d(c2, "input");
            d7 = q41.d(c2, "output");
            d8 = q41.d(c2, "initial_delay");
            d9 = q41.d(c2, "interval_duration");
            d10 = q41.d(c2, "flex_duration");
            d11 = q41.d(c2, "run_attempt_count");
            d12 = q41.d(c2, "backoff_policy");
            d13 = q41.d(c2, "backoff_delay_duration");
            d14 = q41.d(c2, "last_enqueue_time");
            d15 = q41.d(c2, "minimum_retention_duration");
            p27Var = d16;
        } catch (Throwable th) {
            th = th;
            p27Var = d16;
        }
        try {
            int d17 = q41.d(c2, "schedule_requested_at");
            int d18 = q41.d(c2, "run_in_foreground");
            int d19 = q41.d(c2, "out_of_quota_policy");
            int d20 = q41.d(c2, "period_count");
            int d21 = q41.d(c2, "generation");
            int d22 = q41.d(c2, "next_schedule_time_override");
            int d23 = q41.d(c2, "next_schedule_time_override_generation");
            int d24 = q41.d(c2, "stop_reason");
            int d25 = q41.d(c2, "trace_tag");
            int d26 = q41.d(c2, "required_network_type");
            int d27 = q41.d(c2, "required_network_request");
            int d28 = q41.d(c2, "requires_charging");
            int d29 = q41.d(c2, "requires_device_idle");
            int d30 = q41.d(c2, "requires_battery_not_low");
            int d31 = q41.d(c2, "requires_storage_not_low");
            int d32 = q41.d(c2, "trigger_content_update_delay");
            int d33 = q41.d(c2, "trigger_max_content_delay");
            int d34 = q41.d(c2, "content_uri_triggers");
            int i8 = d15;
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                String string2 = c2.getString(d2);
                WorkInfo.State g2 = nk9.g(c2.getInt(d3));
                String string3 = c2.getString(d4);
                String string4 = c2.getString(d5);
                Data b2 = Data.b(c2.getBlob(d6));
                Data b3 = Data.b(c2.getBlob(d7));
                long j2 = c2.getLong(d8);
                long j3 = c2.getLong(d9);
                long j4 = c2.getLong(d10);
                int i9 = c2.getInt(d11);
                BackoffPolicy d35 = nk9.d(c2.getInt(d12));
                long j5 = c2.getLong(d13);
                long j6 = c2.getLong(d14);
                int i10 = i8;
                long j7 = c2.getLong(i10);
                int i11 = d2;
                int i12 = d17;
                long j8 = c2.getLong(i12);
                d17 = i12;
                int i13 = d18;
                if (c2.getInt(i13) != 0) {
                    d18 = i13;
                    i2 = d19;
                    z = true;
                } else {
                    d18 = i13;
                    i2 = d19;
                    z = false;
                }
                OutOfQuotaPolicy f2 = nk9.f(c2.getInt(i2));
                d19 = i2;
                int i14 = d20;
                int i15 = c2.getInt(i14);
                d20 = i14;
                int i16 = d21;
                int i17 = c2.getInt(i16);
                d21 = i16;
                int i18 = d22;
                long j9 = c2.getLong(i18);
                d22 = i18;
                int i19 = d23;
                int i20 = c2.getInt(i19);
                d23 = i19;
                int i21 = d24;
                int i22 = c2.getInt(i21);
                d24 = i21;
                int i23 = d25;
                if (c2.isNull(i23)) {
                    d25 = i23;
                    i3 = d26;
                    string = null;
                } else {
                    string = c2.getString(i23);
                    d25 = i23;
                    i3 = d26;
                }
                NetworkType e2 = nk9.e(c2.getInt(i3));
                d26 = i3;
                int i24 = d27;
                t45 l2 = nk9.l(c2.getBlob(i24));
                d27 = i24;
                int i25 = d28;
                if (c2.getInt(i25) != 0) {
                    d28 = i25;
                    i4 = d29;
                    z2 = true;
                } else {
                    d28 = i25;
                    i4 = d29;
                    z2 = false;
                }
                if (c2.getInt(i4) != 0) {
                    d29 = i4;
                    i5 = d30;
                    z3 = true;
                } else {
                    d29 = i4;
                    i5 = d30;
                    z3 = false;
                }
                if (c2.getInt(i5) != 0) {
                    d30 = i5;
                    i6 = d31;
                    z4 = true;
                } else {
                    d30 = i5;
                    i6 = d31;
                    z4 = false;
                }
                if (c2.getInt(i6) != 0) {
                    d31 = i6;
                    i7 = d32;
                    z5 = true;
                } else {
                    d31 = i6;
                    i7 = d32;
                    z5 = false;
                }
                long j10 = c2.getLong(i7);
                d32 = i7;
                int i26 = d33;
                long j11 = c2.getLong(i26);
                d33 = i26;
                int i27 = d34;
                d34 = i27;
                arrayList.add(new dk9(string2, g2, string3, string4, b2, b3, j2, j3, j4, new gv0(l2, e2, z2, z3, z4, z5, j10, j11, nk9.b(c2.getBlob(i27))), i9, d35, j5, j6, j7, j8, z, f2, i15, i17, j9, i20, i22, string));
                d2 = i11;
                i8 = i10;
            }
            c2.close();
            p27Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c2.close();
            p27Var.release();
            throw th;
        }
    }

    @Override // defpackage.ek9
    public List x() {
        p27 p27Var;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        int d11;
        int d12;
        int d13;
        int d14;
        int d15;
        int i2;
        boolean z;
        String string;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        p27 d16 = p27.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d16, false, null);
        try {
            d2 = q41.d(c2, "id");
            d3 = q41.d(c2, TransferTable.COLUMN_STATE);
            d4 = q41.d(c2, "worker_class_name");
            d5 = q41.d(c2, "input_merger_class_name");
            d6 = q41.d(c2, "input");
            d7 = q41.d(c2, "output");
            d8 = q41.d(c2, "initial_delay");
            d9 = q41.d(c2, "interval_duration");
            d10 = q41.d(c2, "flex_duration");
            d11 = q41.d(c2, "run_attempt_count");
            d12 = q41.d(c2, "backoff_policy");
            d13 = q41.d(c2, "backoff_delay_duration");
            d14 = q41.d(c2, "last_enqueue_time");
            d15 = q41.d(c2, "minimum_retention_duration");
            p27Var = d16;
        } catch (Throwable th) {
            th = th;
            p27Var = d16;
        }
        try {
            int d17 = q41.d(c2, "schedule_requested_at");
            int d18 = q41.d(c2, "run_in_foreground");
            int d19 = q41.d(c2, "out_of_quota_policy");
            int d20 = q41.d(c2, "period_count");
            int d21 = q41.d(c2, "generation");
            int d22 = q41.d(c2, "next_schedule_time_override");
            int d23 = q41.d(c2, "next_schedule_time_override_generation");
            int d24 = q41.d(c2, "stop_reason");
            int d25 = q41.d(c2, "trace_tag");
            int d26 = q41.d(c2, "required_network_type");
            int d27 = q41.d(c2, "required_network_request");
            int d28 = q41.d(c2, "requires_charging");
            int d29 = q41.d(c2, "requires_device_idle");
            int d30 = q41.d(c2, "requires_battery_not_low");
            int d31 = q41.d(c2, "requires_storage_not_low");
            int d32 = q41.d(c2, "trigger_content_update_delay");
            int d33 = q41.d(c2, "trigger_max_content_delay");
            int d34 = q41.d(c2, "content_uri_triggers");
            int i8 = d15;
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                String string2 = c2.getString(d2);
                WorkInfo.State g2 = nk9.g(c2.getInt(d3));
                String string3 = c2.getString(d4);
                String string4 = c2.getString(d5);
                Data b2 = Data.b(c2.getBlob(d6));
                Data b3 = Data.b(c2.getBlob(d7));
                long j2 = c2.getLong(d8);
                long j3 = c2.getLong(d9);
                long j4 = c2.getLong(d10);
                int i9 = c2.getInt(d11);
                BackoffPolicy d35 = nk9.d(c2.getInt(d12));
                long j5 = c2.getLong(d13);
                long j6 = c2.getLong(d14);
                int i10 = i8;
                long j7 = c2.getLong(i10);
                int i11 = d2;
                int i12 = d17;
                long j8 = c2.getLong(i12);
                d17 = i12;
                int i13 = d18;
                if (c2.getInt(i13) != 0) {
                    d18 = i13;
                    i2 = d19;
                    z = true;
                } else {
                    d18 = i13;
                    i2 = d19;
                    z = false;
                }
                OutOfQuotaPolicy f2 = nk9.f(c2.getInt(i2));
                d19 = i2;
                int i14 = d20;
                int i15 = c2.getInt(i14);
                d20 = i14;
                int i16 = d21;
                int i17 = c2.getInt(i16);
                d21 = i16;
                int i18 = d22;
                long j9 = c2.getLong(i18);
                d22 = i18;
                int i19 = d23;
                int i20 = c2.getInt(i19);
                d23 = i19;
                int i21 = d24;
                int i22 = c2.getInt(i21);
                d24 = i21;
                int i23 = d25;
                if (c2.isNull(i23)) {
                    d25 = i23;
                    i3 = d26;
                    string = null;
                } else {
                    string = c2.getString(i23);
                    d25 = i23;
                    i3 = d26;
                }
                NetworkType e2 = nk9.e(c2.getInt(i3));
                d26 = i3;
                int i24 = d27;
                t45 l2 = nk9.l(c2.getBlob(i24));
                d27 = i24;
                int i25 = d28;
                if (c2.getInt(i25) != 0) {
                    d28 = i25;
                    i4 = d29;
                    z2 = true;
                } else {
                    d28 = i25;
                    i4 = d29;
                    z2 = false;
                }
                if (c2.getInt(i4) != 0) {
                    d29 = i4;
                    i5 = d30;
                    z3 = true;
                } else {
                    d29 = i4;
                    i5 = d30;
                    z3 = false;
                }
                if (c2.getInt(i5) != 0) {
                    d30 = i5;
                    i6 = d31;
                    z4 = true;
                } else {
                    d30 = i5;
                    i6 = d31;
                    z4 = false;
                }
                if (c2.getInt(i6) != 0) {
                    d31 = i6;
                    i7 = d32;
                    z5 = true;
                } else {
                    d31 = i6;
                    i7 = d32;
                    z5 = false;
                }
                long j10 = c2.getLong(i7);
                d32 = i7;
                int i26 = d33;
                long j11 = c2.getLong(i26);
                d33 = i26;
                int i27 = d34;
                d34 = i27;
                arrayList.add(new dk9(string2, g2, string3, string4, b2, b3, j2, j3, j4, new gv0(l2, e2, z2, z3, z4, z5, j10, j11, nk9.b(c2.getBlob(i27))), i9, d35, j5, j6, j7, j8, z, f2, i15, i17, j9, i20, i22, string));
                d2 = i11;
                i8 = i10;
            }
            c2.close();
            p27Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c2.close();
            p27Var.release();
            throw th;
        }
    }

    @Override // defpackage.ek9
    public int y(String str) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.k.acquire();
        acquire.v0(1, str);
        try {
            this.a.beginTransaction();
            try {
                int E = acquire.E();
                this.a.setTransactionSuccessful();
                return E;
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.k.release(acquire);
        }
    }

    @Override // defpackage.ek9
    public int z(String str) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.j.acquire();
        acquire.v0(1, str);
        try {
            this.a.beginTransaction();
            try {
                int E = acquire.E();
                this.a.setTransactionSuccessful();
                return E;
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.j.release(acquire);
        }
    }
}
