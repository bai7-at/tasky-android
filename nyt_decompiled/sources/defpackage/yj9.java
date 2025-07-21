package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.work.Data;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class yj9 implements xj9 {
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
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, wj9 wj9Var) {
            wc8Var.v0(1, wj9Var.b());
            wc8Var.Q0(2, Data.j(wj9Var.a()));
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public yj9(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // defpackage.xj9
    public void a(String str) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.c.acquire();
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
            this.c.release(acquire);
        }
    }

    @Override // defpackage.xj9
    public void b(wj9 wj9Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(wj9Var);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.xj9
    public void deleteAll() {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.d.acquire();
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
