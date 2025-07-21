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
public final class iy0 implements hy0 {
    private final RoomDatabase __db;
    private final y12 __insertionAdapterOfCookie;
    private final SharedSQLiteStatement __preparedStmtOfDeleteCookie;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `Cookie` (`id`,`value`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, gy0 gy0Var) {
            if (gy0Var.a() == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, gy0Var.a());
            }
            if (gy0Var.b() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, gy0Var.b());
            }
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE from cookie WHERE id = ?";
        }
    }

    class c implements Callable {
        final /* synthetic */ gy0 val$cookie;

        c(gy0 gy0Var) {
            this.val$cookie = gy0Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            iy0.this.__db.beginTransaction();
            try {
                iy0.this.__insertionAdapterOfCookie.insert(this.val$cookie);
                iy0.this.__db.setTransactionSuccessful();
                return ww8.a;
            } finally {
                iy0.this.__db.endTransaction();
            }
        }
    }

    class d implements Callable {
        final /* synthetic */ String val$id;

        d(String str) {
            this.val$id = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = iy0.this.__preparedStmtOfDeleteCookie.acquire();
            String str = this.val$id;
            if (str == null) {
                acquire.c1(1);
            } else {
                acquire.v0(1, str);
            }
            try {
                iy0.this.__db.beginTransaction();
                try {
                    acquire.E();
                    iy0.this.__db.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    iy0.this.__db.endTransaction();
                }
            } finally {
                iy0.this.__preparedStmtOfDeleteCookie.release(acquire);
            }
        }
    }

    class e implements Callable {
        final /* synthetic */ p27 val$_statement;

        e(p27 p27Var) {
            this.val$_statement = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c = p51.c(iy0.this.__db, this.val$_statement, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "value");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new gy0(c.isNull(d) ? null : c.getString(d), c.isNull(d2) ? null : c.getString(d2)));
                }
                return arrayList;
            } finally {
                c.close();
                this.val$_statement.release();
            }
        }
    }

    class f implements Callable {
        final /* synthetic */ p27 val$_statement;

        f(p27 p27Var) {
            this.val$_statement = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gy0 call() {
            gy0 gy0Var = null;
            String string = null;
            Cursor c = p51.c(iy0.this.__db, this.val$_statement, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "value");
                if (c.moveToFirst()) {
                    String string2 = c.isNull(d) ? null : c.getString(d);
                    if (!c.isNull(d2)) {
                        string = c.getString(d2);
                    }
                    gy0Var = new gy0(string2, string);
                }
                return gy0Var;
            } finally {
                c.close();
                this.val$_statement.release();
            }
        }
    }

    public iy0(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfCookie = new a(roomDatabase);
        this.__preparedStmtOfDeleteCookie = new b(roomDatabase);
    }

    public static List h() {
        return Collections.emptyList();
    }

    @Override // defpackage.hy0
    public Object a(String str, by0 by0Var) {
        p27 d2 = p27.d("SELECT * from cookie WHERE id = ?", 1);
        if (str == null) {
            d2.c1(1);
        } else {
            d2.v0(1, str);
        }
        return CoroutinesRoom.b(this.__db, false, p51.a(), new f(d2), by0Var);
    }

    @Override // defpackage.hy0
    public Object b(gy0 gy0Var, by0 by0Var) {
        return CoroutinesRoom.c(this.__db, true, new c(gy0Var), by0Var);
    }

    @Override // defpackage.hy0
    public Object c(by0 by0Var) {
        p27 d2 = p27.d("SELECT * from cookie", 0);
        return CoroutinesRoom.b(this.__db, false, p51.a(), new e(d2), by0Var);
    }

    @Override // defpackage.hy0
    public Object d(String str, by0 by0Var) {
        return CoroutinesRoom.c(this.__db, true, new d(str), by0Var);
    }
}
