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
public final class c4 implements b4 {
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
            return "INSERT OR REPLACE INTO `action_history` (`action`,`timestamp`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, a4 a4Var) {
            String b = c4.this.c.b(a4Var.a());
            if (b == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, b);
            }
            String a = c4.this.c.a(a4Var.b());
            if (a == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, a);
            }
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM action_history";
        }
    }

    class c implements Callable {
        final /* synthetic */ a4 a;

        c(a4 a4Var) {
            this.a = a4Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            c4.this.a.beginTransaction();
            try {
                c4.this.b.insert(this.a);
                c4.this.a.setTransactionSuccessful();
                return ww8.a;
            } finally {
                c4.this.a.endTransaction();
            }
        }
    }

    class d implements Callable {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = c4.this.d.acquire();
            try {
                c4.this.a.beginTransaction();
                try {
                    acquire.E();
                    c4.this.a.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    c4.this.a.endTransaction();
                }
            } finally {
                c4.this.d.release(acquire);
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
            Cursor c = p51.c(c4.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "action");
                int d2 = q41.d(c, "timestamp");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new a4(c4.this.c.f(c.isNull(d) ? null : c.getString(d)), c4.this.c.e(c.isNull(d2) ? null : c.getString(d2))));
                }
                return arrayList;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    public c4(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.d = new b(roomDatabase);
    }

    public static List h() {
        return Collections.emptyList();
    }

    @Override // defpackage.b4
    public Object a(by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM action_history", 0);
        return CoroutinesRoom.b(this.a, false, p51.a(), new e(d2), by0Var);
    }

    @Override // defpackage.b4
    public Object b(by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new d(), by0Var);
    }

    @Override // defpackage.b4
    public Object c(a4 a4Var, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new c(a4Var), by0Var);
    }
}
