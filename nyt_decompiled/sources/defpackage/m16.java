package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m16 implements l16 {
    private final RoomDatabase a;
    private final y12 b;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, k16 k16Var) {
            wc8Var.v0(1, k16Var.a());
            if (k16Var.b() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.L0(2, k16Var.b().longValue());
            }
        }
    }

    public m16(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // defpackage.l16
    public Long a(String str) {
        p27 d = p27.d("SELECT long_value FROM Preference where `key`=?", 1);
        d.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        Long l = null;
        Cursor c = p51.c(this.a, d, false, null);
        try {
            if (c.moveToFirst() && !c.isNull(0)) {
                l = Long.valueOf(c.getLong(0));
            }
            return l;
        } finally {
            c.close();
            d.release();
        }
    }

    @Override // defpackage.l16
    public void b(k16 k16Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(k16Var);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
