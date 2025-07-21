package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class me8 implements le8 {
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
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, ke8 ke8Var) {
            wc8Var.v0(1, ke8Var.a);
            wc8Var.L0(2, ke8Var.a());
            wc8Var.L0(3, ke8Var.c);
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public me8(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
    }

    public static List h() {
        return Collections.emptyList();
    }

    @Override // defpackage.le8
    public ke8 b(String str, int i) {
        p27 d = p27.d("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        d.v0(1, str);
        d.L0(2, i);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d, false, null);
        try {
            return c2.moveToFirst() ? new ke8(c2.getString(q41.d(c2, "work_spec_id")), c2.getInt(q41.d(c2, "generation")), c2.getInt(q41.d(c2, "system_id"))) : null;
        } finally {
            c2.close();
            d.release();
        }
    }

    @Override // defpackage.le8
    public List c() {
        p27 d = p27.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor c2 = p51.c(this.a, d, false, null);
        try {
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                arrayList.add(c2.getString(0));
            }
            return arrayList;
        } finally {
            c2.close();
            d.release();
        }
    }

    @Override // defpackage.le8
    public void e(ke8 ke8Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(ke8Var);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.le8
    public void f(String str, int i) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.c.acquire();
        acquire.v0(1, str);
        acquire.L0(2, i);
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.c.release(acquire);
        }
    }

    @Override // defpackage.le8
    public void g(String str) {
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
}
