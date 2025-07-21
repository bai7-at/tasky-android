package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class nm1 implements mm1 {
    private final RoomDatabase a;
    private final y12 b;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, jm1 jm1Var) {
            wc8Var.v0(1, jm1Var.b());
            wc8Var.v0(2, jm1Var.a());
        }
    }

    public nm1(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
    }

    public static List e() {
        return Collections.emptyList();
    }

    @Override // defpackage.mm1
    public List a(String str) {
        p27 d = p27.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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

    @Override // defpackage.mm1
    public boolean b(String str) {
        p27 d = p27.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        d.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor c = p51.c(this.a, d, false, null);
        try {
            if (c.moveToFirst()) {
                z = c.getInt(0) != 0;
            }
            return z;
        } finally {
            c.close();
            d.release();
        }
    }

    @Override // defpackage.mm1
    public void c(jm1 jm1Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(jm1Var);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.mm1
    public boolean d(String str) {
        p27 d = p27.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        d.v0(1, str);
        this.a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor c = p51.c(this.a, d, false, null);
        try {
            if (c.moveToFirst()) {
                z = c.getInt(0) != 0;
            }
            return z;
        } finally {
            c.close();
            d.release();
        }
    }
}
