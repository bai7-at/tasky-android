package defpackage;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EmptyResultSetException;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class is implements hs {
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
            return "INSERT OR ABORT INTO `assets` (`id`,`headline`,`image_url`,`summary`,`asset_type`,`section_name`,`kicker`,`last_updated`,`last_accessed`,`comment_count`,`url`,`uri`,`read_before_but_updated`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, z18 z18Var) {
            wc8Var.L0(1, z18Var.e());
            if (z18Var.m() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, z18Var.m());
            }
            if (z18Var.f() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, z18Var.f());
            }
            if (z18Var.l() == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, z18Var.l());
            }
            if (z18Var.c() == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, z18Var.c());
            }
            if (z18Var.k() == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.v0(6, z18Var.k());
            }
            if (z18Var.g() == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, z18Var.g());
            }
            s27 s27Var = s27.a;
            String a = s27.a(z18Var.i());
            if (a == null) {
                wc8Var.c1(8);
            } else {
                wc8Var.v0(8, a);
            }
            String a2 = s27.a(z18Var.h());
            if (a2 == null) {
                wc8Var.c1(9);
            } else {
                wc8Var.v0(9, a2);
            }
            wc8Var.L0(10, z18Var.d());
            if (z18Var.o() == null) {
                wc8Var.c1(11);
            } else {
                wc8Var.v0(11, z18Var.o());
            }
            if (z18Var.n() == null) {
                wc8Var.c1(12);
            } else {
                wc8Var.v0(12, z18Var.n());
            }
            wc8Var.L0(13, z18Var.j());
        }
    }

    class b extends x12 {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "UPDATE OR REPLACE `assets` SET `id` = ?,`headline` = ?,`image_url` = ?,`summary` = ?,`asset_type` = ?,`section_name` = ?,`kicker` = ?,`last_updated` = ?,`last_accessed` = ?,`comment_count` = ?,`url` = ?,`uri` = ?,`read_before_but_updated` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.x12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, z18 z18Var) {
            wc8Var.L0(1, z18Var.e());
            if (z18Var.m() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, z18Var.m());
            }
            if (z18Var.f() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, z18Var.f());
            }
            if (z18Var.l() == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, z18Var.l());
            }
            if (z18Var.c() == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, z18Var.c());
            }
            if (z18Var.k() == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.v0(6, z18Var.k());
            }
            if (z18Var.g() == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, z18Var.g());
            }
            s27 s27Var = s27.a;
            String a = s27.a(z18Var.i());
            if (a == null) {
                wc8Var.c1(8);
            } else {
                wc8Var.v0(8, a);
            }
            String a2 = s27.a(z18Var.h());
            if (a2 == null) {
                wc8Var.c1(9);
            } else {
                wc8Var.v0(9, a2);
            }
            wc8Var.L0(10, z18Var.d());
            if (z18Var.o() == null) {
                wc8Var.c1(11);
            } else {
                wc8Var.v0(11, z18Var.o());
            }
            if (z18Var.n() == null) {
                wc8Var.c1(12);
            } else {
                wc8Var.v0(12, z18Var.n());
            }
            wc8Var.L0(13, z18Var.j());
            wc8Var.L0(14, z18Var.e());
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM assets WHERE id NOT IN (SELECT id FROM assets ORDER BY datetime(last_accessed) DESC LIMIT ?)";
        }
    }

    class d extends SharedSQLiteStatement {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE assets SET comment_count = ? WHERE id = ?";
        }
    }

    class e extends SharedSQLiteStatement {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM assets";
        }
    }

    class f extends DataSource.Factory {
        final /* synthetic */ p27 a;

        class a extends p44 {
            a(RoomDatabase roomDatabase, p27 p27Var, boolean z, boolean z2, String... strArr) {
                super(roomDatabase, p27Var, z, z2, strArr);
            }

            @Override // defpackage.p44
            protected List o(Cursor cursor) {
                int d = q41.d(cursor, "id");
                int d2 = q41.d(cursor, "headline");
                int d3 = q41.d(cursor, "image_url");
                int d4 = q41.d(cursor, "summary");
                int d5 = q41.d(cursor, "asset_type");
                int d6 = q41.d(cursor, "section_name");
                int d7 = q41.d(cursor, "kicker");
                int d8 = q41.d(cursor, "last_updated");
                int d9 = q41.d(cursor, "last_accessed");
                int d10 = q41.d(cursor, "comment_count");
                int d11 = q41.d(cursor, "url");
                int d12 = q41.d(cursor, "uri");
                int d13 = q41.d(cursor, "read_before_but_updated");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    arrayList.add(new z18(cursor.getLong(d), cursor.isNull(d2) ? null : cursor.getString(d2), cursor.isNull(d3) ? null : cursor.getString(d3), cursor.isNull(d4) ? null : cursor.getString(d4), cursor.isNull(d5) ? null : cursor.getString(d5), cursor.isNull(d6) ? null : cursor.getString(d6), cursor.isNull(d7) ? null : cursor.getString(d7), s27.b(cursor.isNull(d8) ? null : cursor.getString(d8)), s27.b(cursor.isNull(d9) ? null : cursor.getString(d9)), cursor.getInt(d10), cursor.isNull(d11) ? null : cursor.getString(d11), cursor.isNull(d12) ? null : cursor.getString(d12), cursor.getInt(d13)));
                }
                return arrayList;
            }
        }

        f(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // androidx.paging.DataSource.Factory
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p44 b() {
            return new a(is.this.a, this.a, false, true, "assets");
        }
    }

    class g implements Callable {
        final /* synthetic */ p27 a;

        g(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            int d;
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
            g gVar = this;
            Cursor c = p51.c(is.this.a, gVar.a, false, null);
            try {
                d = q41.d(c, "id");
                d2 = q41.d(c, "headline");
                d3 = q41.d(c, "image_url");
                d4 = q41.d(c, "summary");
                d5 = q41.d(c, "asset_type");
                d6 = q41.d(c, "section_name");
                d7 = q41.d(c, "kicker");
                d8 = q41.d(c, "last_updated");
                d9 = q41.d(c, "last_accessed");
                d10 = q41.d(c, "comment_count");
                d11 = q41.d(c, "url");
                d12 = q41.d(c, "uri");
                d13 = q41.d(c, "read_before_but_updated");
            } catch (Throwable th) {
                th = th;
            }
            try {
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new z18(c.getLong(d), c.isNull(d2) ? null : c.getString(d2), c.isNull(d3) ? null : c.getString(d3), c.isNull(d4) ? null : c.getString(d4), c.isNull(d5) ? null : c.getString(d5), c.isNull(d6) ? null : c.getString(d6), c.isNull(d7) ? null : c.getString(d7), s27.b(c.isNull(d8) ? null : c.getString(d8)), s27.b(c.isNull(d9) ? null : c.getString(d9)), c.getInt(d10), c.isNull(d11) ? null : c.getString(d11), c.isNull(d12) ? null : c.getString(d12), c.getInt(d13)));
                }
                c.close();
                this.a.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                gVar = this;
                c.close();
                gVar.a.release();
                throw th;
            }
        }
    }

    class h implements Callable {
        final /* synthetic */ p27 a;

        h(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c = p51.c(is.this.a, this.a, false, null);
            try {
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new b28(c.getLong(0), c.isNull(1) ? null : c.getString(1)));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        protected void finalize() {
            this.a.release();
        }
    }

    class i implements Callable {
        final /* synthetic */ p27 a;

        i(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z18 call() {
            z18 z18Var = null;
            Cursor c = p51.c(is.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "headline");
                int d3 = q41.d(c, "image_url");
                int d4 = q41.d(c, "summary");
                int d5 = q41.d(c, "asset_type");
                int d6 = q41.d(c, "section_name");
                int d7 = q41.d(c, "kicker");
                int d8 = q41.d(c, "last_updated");
                int d9 = q41.d(c, "last_accessed");
                int d10 = q41.d(c, "comment_count");
                int d11 = q41.d(c, "url");
                int d12 = q41.d(c, "uri");
                int d13 = q41.d(c, "read_before_but_updated");
                if (c.moveToFirst()) {
                    z18Var = new z18(c.getLong(d), c.isNull(d2) ? null : c.getString(d2), c.isNull(d3) ? null : c.getString(d3), c.isNull(d4) ? null : c.getString(d4), c.isNull(d5) ? null : c.getString(d5), c.isNull(d6) ? null : c.getString(d6), c.isNull(d7) ? null : c.getString(d7), s27.b(c.isNull(d8) ? null : c.getString(d8)), s27.b(c.isNull(d9) ? null : c.getString(d9)), c.getInt(d10), c.isNull(d11) ? null : c.getString(d11), c.isNull(d12) ? null : c.getString(d12), c.getInt(d13));
                }
                if (z18Var != null) {
                    return z18Var;
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

    public is(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
        this.e = new d(roomDatabase);
        this.f = new e(roomDatabase);
    }

    public static List j() {
        return Collections.emptyList();
    }

    @Override // defpackage.hs
    public Single a() {
        return z47.a(new h(p27.d("SELECT id, uri FROM assets WHERE read_before_but_updated = 0", 0)));
    }

    @Override // defpackage.hs
    public void b(z18 z18Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(z18Var);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.hs
    public Single c(long j) {
        p27 d2 = p27.d("SELECT * FROM assets WHERE id = ?", 1);
        d2.L0(1, j);
        return z47.a(new i(d2));
    }

    @Override // defpackage.hs
    public int d(int i2) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.d.acquire();
        acquire.L0(1, i2);
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
            this.d.release(acquire);
        }
    }

    @Override // defpackage.hs
    public void e(z18 z18Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handle(z18Var);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.hs
    public DataSource.Factory f() {
        return new f(p27.d("SELECT * FROM assets ORDER BY datetime(last_accessed) DESC", 0));
    }

    @Override // defpackage.hs
    public Object g(int i2, by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM assets ORDER BY datetime(last_accessed) DESC LIMIT ?", 1);
        d2.L0(1, i2);
        return CoroutinesRoom.b(this.a, false, p51.a(), new g(d2), by0Var);
    }

    @Override // defpackage.hs
    public int h() {
        p27 d2 = p27.d("SELECT COUNT(*) FROM assets", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            return c2.moveToFirst() ? c2.getInt(0) : 0;
        } finally {
            c2.close();
            d2.release();
        }
    }
}
