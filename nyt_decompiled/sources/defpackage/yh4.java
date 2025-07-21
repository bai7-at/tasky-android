package defpackage;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes4.dex */
public final class yh4 implements xh4 {
    private final RoomDatabase a;
    private final y12 b;
    private final x12 c;
    private final SharedSQLiteStatement d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR ABORT INTO `audio_positions` (`id`,`audio_name`,`seek_position`,`last_updated`,`asset_state`) VALUES (?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, d28 d28Var) {
            wc8Var.L0(1, d28Var.a());
            if (d28Var.c() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, d28Var.c());
            }
            wc8Var.L0(3, d28Var.d());
            r27 r27Var = r27.a;
            String a = r27.a(d28Var.b());
            if (a == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, a);
            }
            String d = r27.d(d28Var.e());
            if (d == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, d);
            }
        }
    }

    class b extends x12 {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "UPDATE OR REPLACE `audio_positions` SET `id` = ?,`audio_name` = ?,`seek_position` = ?,`last_updated` = ?,`asset_state` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.x12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, d28 d28Var) {
            wc8Var.L0(1, d28Var.a());
            if (d28Var.c() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, d28Var.c());
            }
            wc8Var.L0(3, d28Var.d());
            r27 r27Var = r27.a;
            String a = r27.a(d28Var.b());
            if (a == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, a);
            }
            String d = r27.d(d28Var.e());
            if (d == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, d);
            }
            wc8Var.L0(6, d28Var.a());
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM audio_positions WHERE id = ?";
        }
    }

    class d extends SharedSQLiteStatement {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM audio_positions WHERE audio_name = ?";
        }
    }

    class e extends SharedSQLiteStatement {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM audio_positions";
        }
    }

    class f implements Callable {
        final /* synthetic */ p27 a;

        f(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d28 call() {
            d28 d28Var = null;
            String string = null;
            Cursor c = p51.c(yh4.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "audio_name");
                int d3 = q41.d(c, "seek_position");
                int d4 = q41.d(c, "last_updated");
                int d5 = q41.d(c, "asset_state");
                if (c.moveToFirst()) {
                    long j = c.getLong(d);
                    String string2 = c.isNull(d2) ? null : c.getString(d2);
                    long j2 = c.getLong(d3);
                    OffsetDateTime c2 = r27.c(c.isNull(d4) ? null : c.getString(d4));
                    if (!c.isNull(d5)) {
                        string = c.getString(d5);
                    }
                    d28Var = new d28(j, string2, j2, c2, r27.b(string));
                }
                if (d28Var != null) {
                    return d28Var;
                }
                throw new EmptyResultSetException("Query returned empty result set: " + this.a.a());
            } finally {
                c.close();
            }
        }

        protected void finalize() {
            this.a.release();
        }
    }

    class g implements Callable {
        final /* synthetic */ p27 a;

        g(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d28 call() {
            d28 d28Var = null;
            String string = null;
            Cursor c = p51.c(yh4.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "audio_name");
                int d3 = q41.d(c, "seek_position");
                int d4 = q41.d(c, "last_updated");
                int d5 = q41.d(c, "asset_state");
                if (c.moveToFirst()) {
                    long j = c.getLong(d);
                    String string2 = c.isNull(d2) ? null : c.getString(d2);
                    long j2 = c.getLong(d3);
                    OffsetDateTime c2 = r27.c(c.isNull(d4) ? null : c.getString(d4));
                    if (!c.isNull(d5)) {
                        string = c.getString(d5);
                    }
                    d28Var = new d28(j, string2, j2, c2, r27.b(string));
                }
                if (d28Var != null) {
                    return d28Var;
                }
                throw new EmptyResultSetException("Query returned empty result set: " + this.a.a());
            } finally {
                c.close();
            }
        }

        protected void finalize() {
            this.a.release();
        }
    }

    class h implements Callable {
        final /* synthetic */ p27 a;

        h(p27 p27Var) {
            this.a = p27Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        
            return r3;
         */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Long call() {
            /*
                r4 = this;
                yh4 r0 = defpackage.yh4.this
                androidx.room.RoomDatabase r0 = defpackage.yh4.g(r0)
                p27 r1 = r4.a
                r2 = 0
                r3 = 0
                android.database.Cursor r0 = defpackage.p51.c(r0, r1, r2, r3)
                boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L24
                if (r1 == 0) goto L26
                boolean r1 = r0.isNull(r2)     // Catch: java.lang.Throwable -> L24
                if (r1 == 0) goto L1b
                goto L26
            L1b:
                long r1 = r0.getLong(r2)     // Catch: java.lang.Throwable -> L24
                java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L24
                goto L26
            L24:
                r4 = move-exception
                goto L49
            L26:
                if (r3 == 0) goto L2c
                r0.close()
                return r3
            L2c:
                androidx.room.EmptyResultSetException r1 = new androidx.room.EmptyResultSetException     // Catch: java.lang.Throwable -> L24
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
                r2.<init>()     // Catch: java.lang.Throwable -> L24
                java.lang.String r3 = "Query returned empty result set: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L24
                p27 r4 = r4.a     // Catch: java.lang.Throwable -> L24
                java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L24
                r2.append(r4)     // Catch: java.lang.Throwable -> L24
                java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L24
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L24
                throw r1     // Catch: java.lang.Throwable -> L24
            L49:
                r0.close()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: yh4.h.call():java.lang.Long");
        }

        protected void finalize() {
            this.a.release();
        }
    }

    public yh4(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
        this.e = new d(roomDatabase);
        this.f = new e(roomDatabase);
    }

    public static List h() {
        return Collections.emptyList();
    }

    @Override // defpackage.xh4
    public Single a(long j) {
        p27 d2 = p27.d("SELECT * FROM audio_positions WHERE id = ?", 1);
        d2.L0(1, j);
        return z47.a(new f(d2));
    }

    @Override // defpackage.xh4
    public Single b(String str) {
        p27 d2 = p27.d("SELECT seek_position FROM audio_positions WHERE audio_name = ?", 1);
        if (str == null) {
            d2.c1(1);
        } else {
            d2.v0(1, str);
        }
        return z47.a(new h(d2));
    }

    @Override // defpackage.xh4
    public void c(d28 d28Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(d28Var);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.xh4
    public Single d(String str) {
        p27 d2 = p27.d("SELECT * FROM audio_positions WHERE audio_name = ?", 1);
        if (str == null) {
            d2.c1(1);
        } else {
            d2.v0(1, str);
        }
        return z47.a(new g(d2));
    }

    @Override // defpackage.xh4
    public void e(String str) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.e.acquire();
        if (str == null) {
            acquire.c1(1);
        } else {
            acquire.v0(1, str);
        }
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.e.release(acquire);
        }
    }

    @Override // defpackage.xh4
    public void f(d28 d28Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handle(d28Var);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
