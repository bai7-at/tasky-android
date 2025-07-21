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
public final class hr4 implements gr4 {
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
            return "INSERT OR REPLACE INTO `message_history` (`id`,`message_id`,`history_id`,`action`,`timestamp`) VALUES (?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, fr4 fr4Var) {
            if (fr4Var.b() == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, fr4Var.b());
            }
            if (fr4Var.d() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, fr4Var.d());
            }
            if (fr4Var.c() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, fr4Var.c());
            }
            if (fr4Var.a() == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, fr4Var.a());
            }
            String a = hr4.this.c.a(fr4Var.e());
            if (a == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, a);
            }
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM message_history";
        }
    }

    class c implements Callable {
        final /* synthetic */ fr4 a;

        c(fr4 fr4Var) {
            this.a = fr4Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            hr4.this.a.beginTransaction();
            try {
                hr4.this.b.insert(this.a);
                hr4.this.a.setTransactionSuccessful();
                return ww8.a;
            } finally {
                hr4.this.a.endTransaction();
            }
        }
    }

    class d implements Callable {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = hr4.this.d.acquire();
            try {
                hr4.this.a.beginTransaction();
                try {
                    acquire.E();
                    hr4.this.a.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    hr4.this.a.endTransaction();
                }
            } finally {
                hr4.this.d.release(acquire);
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
            Cursor c = p51.c(hr4.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "message_id");
                int d3 = q41.d(c, "history_id");
                int d4 = q41.d(c, "action");
                int d5 = q41.d(c, "timestamp");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new fr4(c.isNull(d) ? null : c.getString(d), c.isNull(d2) ? null : c.getString(d2), c.isNull(d3) ? null : c.getString(d3), c.isNull(d4) ? null : c.getString(d4), hr4.this.c.e(c.isNull(d5) ? null : c.getString(d5))));
                }
                return arrayList;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    public hr4(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.d = new b(roomDatabase);
    }

    public static List h() {
        return Collections.emptyList();
    }

    @Override // defpackage.gr4
    public Object a(by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM message_history", 0);
        return CoroutinesRoom.b(this.a, false, p51.a(), new e(d2), by0Var);
    }

    @Override // defpackage.gr4
    public Object b(by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new d(), by0Var);
    }

    @Override // defpackage.gr4
    public Object c(fr4 fr4Var, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new c(fr4Var), by0Var);
    }
}
