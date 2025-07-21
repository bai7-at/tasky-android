package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.appsflyer.AppsFlyerProperties;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class ut extends tt {
    private final RoomDatabase a;
    private final y12 b;
    private final x12 c;
    private final SharedSQLiteStatement d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR ABORT INTO `sources` (`id`,`requestId`,`type`,`insertDate`,`expirationDate`,`externalId`,`additionalData`,`userEmail`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, vt vtVar) {
            wc8Var.L0(1, vtVar.g());
            wc8Var.L0(2, vtVar.d());
            if (vtVar.i() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, vtVar.i());
            }
            am3 am3Var = am3.a;
            String a = am3.a(vtVar.h());
            if (a == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, a);
            }
            String a2 = am3.a(vtVar.e());
            if (a2 == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, a2);
            }
            if (vtVar.f() == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.L0(6, vtVar.f().longValue());
            }
            if (vtVar.c() == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, vtVar.c());
            }
            if (vtVar.j() == null) {
                wc8Var.c1(8);
            } else {
                wc8Var.v0(8, vtVar.j());
            }
        }
    }

    class b extends x12 {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "UPDATE OR ABORT `sources` SET `id` = ?,`requestId` = ?,`type` = ?,`insertDate` = ?,`expirationDate` = ?,`externalId` = ?,`additionalData` = ?,`userEmail` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.x12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, vt vtVar) {
            wc8Var.L0(1, vtVar.g());
            wc8Var.L0(2, vtVar.d());
            if (vtVar.i() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, vtVar.i());
            }
            am3 am3Var = am3.a;
            String a = am3.a(vtVar.h());
            if (a == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, a);
            }
            String a2 = am3.a(vtVar.e());
            if (a2 == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, a2);
            }
            if (vtVar.f() == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.L0(6, vtVar.f().longValue());
            }
            if (vtVar.c() == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, vtVar.c());
            }
            if (vtVar.j() == null) {
                wc8Var.c1(8);
            } else {
                wc8Var.v0(8, vtVar.j());
            }
            wc8Var.L0(9, vtVar.g());
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from sources where type = ? and externalId != ?";
        }
    }

    class d extends SharedSQLiteStatement {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from sources where type = ? and requestId = ?";
        }
    }

    class e extends SharedSQLiteStatement {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from sources where expirationDate is not null and expirationDate < ?";
        }
    }

    class f extends SharedSQLiteStatement {
        f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from sources where userEmail is not null";
        }
    }

    public ut(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
        this.e = new d(roomDatabase);
        this.f = new e(roomDatabase);
        this.g = new f(roomDatabase);
    }

    public static List j() {
        return Collections.emptyList();
    }

    @Override // defpackage.tt
    public void a(long j, String str) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.e.acquire();
        if (str == null) {
            acquire.c1(1);
        } else {
            acquire.v0(1, str);
        }
        acquire.L0(2, j);
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.e.release(acquire);
        }
    }

    @Override // defpackage.tt
    public void b() {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.g.acquire();
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.g.release(acquire);
        }
    }

    @Override // defpackage.tt
    public void c(String str, long j) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.d.acquire();
        if (str == null) {
            acquire.c1(1);
        } else {
            acquire.v0(1, str);
        }
        acquire.L0(2, j);
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

    @Override // defpackage.tt
    public void d(Instant instant) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.f.acquire();
        String a2 = am3.a(instant);
        if (a2 == null) {
            acquire.c1(1);
        } else {
            acquire.v0(1, a2);
        }
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.f.release(acquire);
        }
    }

    @Override // defpackage.tt
    protected List e(vt... vtVarArr) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.b.insertAndReturnIdsList(vtVarArr);
            this.a.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // defpackage.tt
    public vt g(long j, String str, Long l, String str2, String str3) {
        p27 d2 = p27.d("\n        select * from sources\n        where\n            requestId = ? and\n            type = ? and\n            externalId is ? and\n            additionalData is ? and\n            userEmail is ?\n        ", 5);
        d2.L0(1, j);
        if (str == null) {
            d2.c1(2);
        } else {
            d2.v0(2, str);
        }
        if (l == null) {
            d2.c1(3);
        } else {
            d2.L0(3, l.longValue());
        }
        if (str2 == null) {
            d2.c1(4);
        } else {
            d2.v0(4, str2);
        }
        if (str3 == null) {
            d2.c1(5);
        } else {
            d2.v0(5, str3);
        }
        this.a.assertNotSuspendingTransaction();
        vt vtVar = null;
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            int d3 = q41.d(c2, "id");
            int d4 = q41.d(c2, "requestId");
            int d5 = q41.d(c2, TransferTable.COLUMN_TYPE);
            int d6 = q41.d(c2, "insertDate");
            int d7 = q41.d(c2, "expirationDate");
            int d8 = q41.d(c2, "externalId");
            int d9 = q41.d(c2, "additionalData");
            int d10 = q41.d(c2, AppsFlyerProperties.USER_EMAIL);
            if (c2.moveToFirst()) {
                vtVar = new vt(c2.getLong(d3), c2.getLong(d4), c2.isNull(d5) ? null : c2.getString(d5), am3.b(c2.isNull(d6) ? null : c2.getString(d6)), am3.b(c2.isNull(d7) ? null : c2.getString(d7)), c2.isNull(d8) ? null : Long.valueOf(c2.getLong(d8)), c2.isNull(d9) ? null : c2.getString(d9), c2.isNull(d10) ? null : c2.getString(d10));
            }
            return vtVar;
        } finally {
            c2.close();
            d2.release();
        }
    }

    @Override // defpackage.tt
    protected void i(vt vtVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handle(vtVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
