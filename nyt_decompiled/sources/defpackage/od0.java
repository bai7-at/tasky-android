package defpackage;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.nytimes.android.eventtracker.buffer.UploadStatus;
import com.nytimes.android.eventtracker.buffer.ValidationStatus;
import defpackage.nd0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class od0 implements nd0 {
    private final RoomDatabase a;
    private final y12 b;
    private final y29 c = new y29();
    private final dy8 d = new dy8();
    private final v52 e = new v52();
    private final x12 f;
    private final SharedSQLiteStatement g;
    private final SharedSQLiteStatement h;

    class a implements Callable {
        final /* synthetic */ p27 a;

        a(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c = p51.c(od0.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "created");
                int d3 = q41.d(c, "updated");
                int d4 = q41.d(c, "validatedStatus");
                int d5 = q41.d(c, "uploadStatus");
                int d6 = q41.d(c, "archive");
                int d7 = q41.d(c, "event");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new md0(c.getLong(d), c.getLong(d2), c.getLong(d3), od0.this.c.b(c.isNull(d4) ? null : c.getString(d4)), od0.this.d.b(c.isNull(d5) ? null : c.getString(d5)), c.getInt(d6) != 0, od0.this.e.b(c.isNull(d7) ? null : c.getString(d7))));
                }
                return arrayList;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    class b implements Callable {
        final /* synthetic */ p27 a;

        b(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Integer num = null;
            Cursor c = p51.c(od0.this.a, this.a, false, null);
            try {
                if (c.moveToFirst() && !c.isNull(0)) {
                    num = Integer.valueOf(c.getInt(0));
                }
                return num;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    class c extends y12 {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `events` (`id`,`created`,`updated`,`validatedStatus`,`uploadStatus`,`archive`,`event`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, md0 md0Var) {
            wc8Var.L0(1, md0Var.f());
            wc8Var.L0(2, md0Var.d());
            wc8Var.L0(3, md0Var.g());
            String a = od0.this.c.a(md0Var.i());
            if (a == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, a);
            }
            String a2 = od0.this.d.a(md0Var.h());
            if (a2 == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, a2);
            }
            wc8Var.L0(6, md0Var.c() ? 1L : 0L);
            String a3 = od0.this.e.a(md0Var.e());
            if (a3 == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, a3);
            }
        }
    }

    class d extends x12 {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "UPDATE OR REPLACE `events` SET `id` = ?,`created` = ?,`updated` = ?,`validatedStatus` = ?,`uploadStatus` = ?,`archive` = ?,`event` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.x12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, md0 md0Var) {
            wc8Var.L0(1, md0Var.f());
            wc8Var.L0(2, md0Var.d());
            wc8Var.L0(3, md0Var.g());
            String a = od0.this.c.a(md0Var.i());
            if (a == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, a);
            }
            String a2 = od0.this.d.a(md0Var.h());
            if (a2 == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, a2);
            }
            wc8Var.L0(6, md0Var.c() ? 1L : 0L);
            String a3 = od0.this.e.a(md0Var.e());
            if (a3 == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, a3);
            }
            wc8Var.L0(8, md0Var.f());
        }
    }

    class e extends SharedSQLiteStatement {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM events";
        }
    }

    class f extends SharedSQLiteStatement {
        f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM events WHERE archive = 1 AND updated <= ?";
        }
    }

    class g implements Callable {
        final /* synthetic */ md0 a;

        g(md0 md0Var) {
            this.a = md0Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() {
            od0.this.a.beginTransaction();
            try {
                Long valueOf = Long.valueOf(od0.this.b.insertAndReturnId(this.a));
                od0.this.a.setTransactionSuccessful();
                return valueOf;
            } finally {
                od0.this.a.endTransaction();
            }
        }
    }

    class h implements Callable {
        final /* synthetic */ md0 a;

        h(md0 md0Var) {
            this.a = md0Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            od0.this.a.beginTransaction();
            try {
                int handle = od0.this.f.handle(this.a);
                od0.this.a.setTransactionSuccessful();
                return Integer.valueOf(handle);
            } finally {
                od0.this.a.endTransaction();
            }
        }
    }

    class i implements Callable {
        i() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            wc8 acquire = od0.this.g.acquire();
            try {
                od0.this.a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.E());
                    od0.this.a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    od0.this.a.endTransaction();
                }
            } finally {
                od0.this.g.release(acquire);
            }
        }
    }

    class j implements Callable {
        final /* synthetic */ long a;

        j(long j) {
            this.a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            wc8 acquire = od0.this.h.acquire();
            acquire.L0(1, this.a);
            try {
                od0.this.a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.E());
                    od0.this.a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    od0.this.a.endTransaction();
                }
            } finally {
                od0.this.h.release(acquire);
            }
        }
    }

    class k implements Callable {
        final /* synthetic */ p27 a;

        k(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c = p51.c(od0.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "created");
                int d3 = q41.d(c, "updated");
                int d4 = q41.d(c, "validatedStatus");
                int d5 = q41.d(c, "uploadStatus");
                int d6 = q41.d(c, "archive");
                int d7 = q41.d(c, "event");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new md0(c.getLong(d), c.getLong(d2), c.getLong(d3), od0.this.c.b(c.isNull(d4) ? null : c.getString(d4)), od0.this.d.b(c.isNull(d5) ? null : c.getString(d5)), c.getInt(d6) != 0, od0.this.e.b(c.isNull(d7) ? null : c.getString(d7))));
                }
                return arrayList;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    public od0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new c(roomDatabase);
        this.f = new d(roomDatabase);
        this.g = new e(roomDatabase);
        this.h = new f(roomDatabase);
    }

    public static List q() {
        return Collections.emptyList();
    }

    @Override // defpackage.nd0
    public Object a(by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new i(), by0Var);
    }

    @Override // defpackage.nd0
    public Object b(by0 by0Var) {
        return nd0.b.b(this, by0Var);
    }

    @Override // defpackage.nd0
    public Object c(md0 md0Var, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new h(md0Var), by0Var);
    }

    @Override // defpackage.nd0
    public Object d(String str, by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM events WHERE event LIKE '%'+?+'%'", 1);
        if (str == null) {
            d2.c1(1);
        } else {
            d2.v0(1, str);
        }
        return CoroutinesRoom.b(this.a, false, p51.a(), new k(d2), by0Var);
    }

    @Override // defpackage.nd0
    public Object e(md0 md0Var, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new g(md0Var), by0Var);
    }

    @Override // defpackage.nd0
    public Object f(long j2, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new j(j2), by0Var);
    }

    @Override // defpackage.nd0
    public Object g(UploadStatus uploadStatus, ValidationStatus validationStatus, by0 by0Var) {
        p27 d2 = p27.d("SELECT COUNT(*) from events where uploadStatus = ? and validatedStatus != ?", 2);
        String a2 = this.d.a(uploadStatus);
        if (a2 == null) {
            d2.c1(1);
        } else {
            d2.v0(1, a2);
        }
        String a3 = this.c.a(validationStatus);
        if (a3 == null) {
            d2.c1(2);
        } else {
            d2.v0(2, a3);
        }
        return CoroutinesRoom.b(this.a, false, p51.a(), new b(d2), by0Var);
    }

    @Override // defpackage.nd0
    public Object h(UploadStatus uploadStatus, ValidationStatus validationStatus, by0 by0Var) {
        p27 d2 = p27.d("SELECT * from events where uploadStatus = ? and validatedStatus != ?", 2);
        String a2 = this.d.a(uploadStatus);
        if (a2 == null) {
            d2.c1(1);
        } else {
            d2.v0(1, a2);
        }
        String a3 = this.c.a(validationStatus);
        if (a3 == null) {
            d2.c1(2);
        } else {
            d2.v0(2, a3);
        }
        return CoroutinesRoom.b(this.a, false, p51.a(), new a(d2), by0Var);
    }
}
