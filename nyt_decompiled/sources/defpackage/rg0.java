package defpackage;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class rg0 implements qg0 {
    private final RoomDatabase a;
    private final y12 b;
    private final fs4 c = new fs4();
    private final SharedSQLiteStatement d;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `local_message_history` (`id`,`message_id`,`history_id`,`unit`,`last_seen_on`,`view_count`,`dismissed`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, pg0 pg0Var) {
            if (pg0Var.c() == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, pg0Var.c());
            }
            if (pg0Var.a() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, pg0Var.a());
            }
            if (pg0Var.e() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, pg0Var.e());
            }
            if (pg0Var.f() == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, pg0Var.f());
            }
            String a = rg0.this.c.a(pg0Var.d());
            if (a == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, a);
            }
            wc8Var.L0(6, pg0Var.g());
            wc8Var.L0(7, pg0Var.b() ? 1L : 0L);
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM local_message_history";
        }
    }

    class c implements Callable {
        final /* synthetic */ pg0 a;

        c(pg0 pg0Var) {
            this.a = pg0Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            rg0.this.a.beginTransaction();
            try {
                rg0.this.b.insert(this.a);
                rg0.this.a.setTransactionSuccessful();
                return ww8.a;
            } finally {
                rg0.this.a.endTransaction();
            }
        }
    }

    class d implements Callable {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = rg0.this.d.acquire();
            try {
                rg0.this.a.beginTransaction();
                try {
                    acquire.E();
                    rg0.this.a.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    rg0.this.a.endTransaction();
                }
            } finally {
                rg0.this.d.release(acquire);
            }
        }
    }

    class e implements Callable {
        final /* synthetic */ p27 a;

        e(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c = p51.c(rg0.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "message_id");
                int d3 = q41.d(c, "history_id");
                int d4 = q41.d(c, "unit");
                int d5 = q41.d(c, "last_seen_on");
                int d6 = q41.d(c, "view_count");
                int d7 = q41.d(c, "dismissed");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new pg0(c.isNull(d) ? null : c.getString(d), c.isNull(d2) ? null : c.getString(d2), c.isNull(d3) ? null : c.getString(d3), c.isNull(d4) ? null : c.getString(d4), rg0.this.c.e(c.isNull(d5) ? null : c.getString(d5)), c.getInt(d6), c.getInt(d7) != 0));
                }
                return arrayList;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    public rg0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.d = new b(roomDatabase);
    }

    public static List h() {
        return Collections.emptyList();
    }

    @Override // defpackage.qg0
    public Object a(by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM local_message_history", 0);
        return CoroutinesRoom.b(this.a, false, p51.a(), new e(d2), by0Var);
    }

    @Override // defpackage.qg0
    public Object b(by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new d(), by0Var);
    }

    @Override // defpackage.qg0
    public Object c(pg0 pg0Var, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new c(pg0Var), by0Var);
    }
}
