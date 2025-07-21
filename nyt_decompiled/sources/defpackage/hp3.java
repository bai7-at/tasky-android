package defpackage;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class hp3 implements gp3 {
    private final RoomDatabase a;
    private final y12 b;
    private final SharedSQLiteStatement c;
    private final SharedSQLiteStatement d;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `interests_data` (`id`,`interest_type`,`interest_sub_type`,`name`,`updatedAt`,`description`,`promo_image_url`,`interest_content`,`is_opinion`,`is_editors_pick`,`auto_added_timestamp`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, com.nytimes.android.interests.db.a aVar) {
            wc8Var.L0(1, aVar.d());
            if (aVar.f() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, aVar.f());
            }
            if (aVar.e() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, aVar.e());
            }
            if (aVar.g() == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, aVar.g());
            }
            wc8Var.L0(5, aVar.i());
            if (aVar.c() == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.v0(6, aVar.c());
            }
            if (aVar.h() == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, aVar.h());
            }
            com.nytimes.android.interests.db.b bVar = com.nytimes.android.interests.db.b.a;
            String a = com.nytimes.android.interests.db.b.a(aVar.b());
            if (a == null) {
                wc8Var.c1(8);
            } else {
                wc8Var.v0(8, a);
            }
            wc8Var.L0(9, aVar.k() ? 1L : 0L);
            wc8Var.L0(10, aVar.j() ? 1L : 0L);
            if (aVar.a() == null) {
                wc8Var.c1(11);
            } else {
                wc8Var.L0(11, aVar.a().longValue());
            }
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM interests_data WHERE id = ?";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM interests_data";
        }
    }

    class d implements Callable {
        final /* synthetic */ int a;

        d(int i) {
            this.a = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = hp3.this.c.acquire();
            acquire.L0(1, this.a);
            try {
                hp3.this.a.beginTransaction();
                try {
                    acquire.E();
                    hp3.this.a.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    hp3.this.a.endTransaction();
                }
            } finally {
                hp3.this.c.release(acquire);
            }
        }
    }

    class e implements Callable {
        e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = hp3.this.d.acquire();
            try {
                hp3.this.a.beginTransaction();
                try {
                    acquire.E();
                    hp3.this.a.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    hp3.this.a.endTransaction();
                }
            } finally {
                hp3.this.d.release(acquire);
            }
        }
    }

    class f implements Callable {
        final /* synthetic */ p27 a;

        f(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c = p51.c(hp3.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "interest_type");
                int d3 = q41.d(c, "interest_sub_type");
                int d4 = q41.d(c, AuthenticationTokenClaims.JSON_KEY_NAME);
                int d5 = q41.d(c, "updatedAt");
                int d6 = q41.d(c, "description");
                int d7 = q41.d(c, "promo_image_url");
                int d8 = q41.d(c, "interest_content");
                int d9 = q41.d(c, "is_opinion");
                int d10 = q41.d(c, "is_editors_pick");
                int d11 = q41.d(c, "auto_added_timestamp");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new com.nytimes.android.interests.db.a(c.getInt(d), c.isNull(d2) ? null : c.getString(d2), c.isNull(d3) ? null : c.getString(d3), c.isNull(d4) ? null : c.getString(d4), c.getLong(d5), c.isNull(d6) ? null : c.getString(d6), c.isNull(d7) ? null : c.getString(d7), com.nytimes.android.interests.db.b.b(c.isNull(d8) ? null : c.getString(d8)), c.getInt(d9) != 0, c.getInt(d10) != 0, c.isNull(d11) ? null : Long.valueOf(c.getLong(d11))));
                }
                return arrayList;
            } finally {
                c.close();
                this.a.release();
            }
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
            Cursor c = p51.c(hp3.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "interest_type");
                int d3 = q41.d(c, "interest_sub_type");
                int d4 = q41.d(c, AuthenticationTokenClaims.JSON_KEY_NAME);
                int d5 = q41.d(c, "updatedAt");
                int d6 = q41.d(c, "description");
                int d7 = q41.d(c, "promo_image_url");
                int d8 = q41.d(c, "interest_content");
                int d9 = q41.d(c, "is_opinion");
                int d10 = q41.d(c, "is_editors_pick");
                int d11 = q41.d(c, "auto_added_timestamp");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new com.nytimes.android.interests.db.a(c.getInt(d), c.isNull(d2) ? null : c.getString(d2), c.isNull(d3) ? null : c.getString(d3), c.isNull(d4) ? null : c.getString(d4), c.getLong(d5), c.isNull(d6) ? null : c.getString(d6), c.isNull(d7) ? null : c.getString(d7), com.nytimes.android.interests.db.b.b(c.isNull(d8) ? null : c.getString(d8)), c.getInt(d9) != 0, c.getInt(d10) != 0, c.isNull(d11) ? null : Long.valueOf(c.getLong(d11))));
                }
                return arrayList;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    public hp3(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
    }

    public static List i() {
        return Collections.emptyList();
    }

    @Override // defpackage.gp3
    public Object a(by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM interests_data", 0);
        return CoroutinesRoom.b(this.a, false, p51.a(), new f(d2), by0Var);
    }

    @Override // defpackage.gp3
    public Object b(int i, by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM interests_data WHERE id = ?", 1);
        d2.L0(1, i);
        return CoroutinesRoom.b(this.a, false, p51.a(), new g(d2), by0Var);
    }

    @Override // defpackage.gp3
    public Object c(int i, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new d(i), by0Var);
    }

    @Override // defpackage.gp3
    public void d(com.nytimes.android.interests.db.a... aVarArr) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert((Object[]) aVarArr);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.gp3
    public Object e(by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new e(), by0Var);
    }
}
