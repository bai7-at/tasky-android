package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vj9 implements uj9 {
    private final RoomDatabase a;
    private final y12 b;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, tj9 tj9Var) {
            wc8Var.v0(1, tj9Var.a());
            wc8Var.v0(2, tj9Var.b());
        }
    }

    public vj9(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // defpackage.uj9
    public void a(tj9 tj9Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(tj9Var);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.uj9
    public List b(String str) {
        p27 d = p27.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        d.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        Cursor c = p51.c(this.a, d, false, null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(c.getString(0));
            }
            return arrayList;
        } finally {
            c.close();
            d.release();
        }
    }
}
