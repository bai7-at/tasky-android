package com.nytimes.android.assetretriever;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.nytimes.android.assetretriever.e;
import defpackage.am3;
import defpackage.p27;
import defpackage.p51;
import defpackage.q41;
import defpackage.wc8;
import defpackage.x12;
import defpackage.y12;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class j extends i {
    private final RoomDatabase a;
    private final y12 b;
    private final com.nytimes.android.assetretriever.f c = new com.nytimes.android.assetretriever.f();
    private final com.nytimes.android.assetretriever.g d = new com.nytimes.android.assetretriever.g();
    private final x12 e;
    private final x12 f;
    private final SharedSQLiteStatement g;
    private final SharedSQLiteStatement h;
    private final SharedSQLiteStatement i;
    private final SharedSQLiteStatement j;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR ABORT INTO `requests` (`id`,`requestedUri`,`requestedUrl`,`requestedLastModified`,`insertDate`,`attempts`,`nextAttempt`,`isRunning`,`downloadedUri`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, k kVar) {
            wc8Var.L0(1, kVar.e());
            String b = j.this.c.b(kVar.i());
            if (b == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, b);
            }
            String b2 = j.this.d.b(kVar.j());
            if (b2 == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, b2);
            }
            am3 am3Var = am3.a;
            String a = am3.a(kVar.h());
            if (a == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, a);
            }
            String a2 = am3.a(kVar.f());
            if (a2 == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, a2);
            }
            wc8Var.L0(6, kVar.c());
            String a3 = am3.a(kVar.g());
            if (a3 == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, a3);
            }
            wc8Var.L0(8, kVar.k() ? 1L : 0L);
            String b3 = j.this.c.b(kVar.d());
            if (b3 == null) {
                wc8Var.c1(9);
            } else {
                wc8Var.v0(9, b3);
            }
        }
    }

    class b extends x12 {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "DELETE FROM `requests` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.x12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, k kVar) {
            wc8Var.L0(1, kVar.e());
        }
    }

    class c extends x12 {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "UPDATE OR ABORT `requests` SET `id` = ?,`requestedUri` = ?,`requestedUrl` = ?,`requestedLastModified` = ?,`insertDate` = ?,`attempts` = ?,`nextAttempt` = ?,`isRunning` = ?,`downloadedUri` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.x12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, k kVar) {
            wc8Var.L0(1, kVar.e());
            String b = j.this.c.b(kVar.i());
            if (b == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, b);
            }
            String b2 = j.this.d.b(kVar.j());
            if (b2 == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, b2);
            }
            am3 am3Var = am3.a;
            String a = am3.a(kVar.h());
            if (a == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, a);
            }
            String a2 = am3.a(kVar.f());
            if (a2 == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, a2);
            }
            wc8Var.L0(6, kVar.c());
            String a3 = am3.a(kVar.g());
            if (a3 == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, a3);
            }
            wc8Var.L0(8, kVar.k() ? 1L : 0L);
            String b3 = j.this.c.b(kVar.d());
            if (b3 == null) {
                wc8Var.c1(9);
            } else {
                wc8Var.v0(9, b3);
            }
            wc8Var.L0(10, kVar.e());
        }
    }

    class d extends SharedSQLiteStatement {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "\n        update requests\n        set \n            requestedLastModified = ?, \n            nextAttempt = ?\n        where id = ?\n        ";
        }
    }

    class e extends SharedSQLiteStatement {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "update requests set isRunning = ? where requestedUri = ?";
        }
    }

    class f extends SharedSQLiteStatement {
        f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "update requests set isRunning = ? where requestedUrl = ?";
        }
    }

    class g extends SharedSQLiteStatement {
        g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "update requests set isRunning = 0";
        }
    }

    public j(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.e = new b(roomDatabase);
        this.f = new c(roomDatabase);
        this.g = new d(roomDatabase);
        this.h = new e(roomDatabase);
        this.i = new f(roomDatabase);
        this.j = new g(roomDatabase);
    }

    public static List v() {
        return Collections.emptyList();
    }

    @Override // com.nytimes.android.assetretriever.i
    protected void b(k kVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.e.handle(kVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.nytimes.android.assetretriever.i
    public long e(k kVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long insertAndReturnId = this.b.insertAndReturnId(kVar);
            this.a.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.nytimes.android.assetretriever.i
    protected void i(e.b bVar, boolean z) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.h.acquire();
        acquire.L0(1, z ? 1L : 0L);
        String b2 = this.c.b(bVar);
        if (b2 == null) {
            acquire.c1(2);
        } else {
            acquire.v0(2, b2);
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
            this.h.release(acquire);
        }
    }

    @Override // com.nytimes.android.assetretriever.i
    protected void j(e.c cVar, boolean z) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.i.acquire();
        acquire.L0(1, z ? 1L : 0L);
        String b2 = this.d.b(cVar);
        if (b2 == null) {
            acquire.c1(2);
        } else {
            acquire.v0(2, b2);
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
            this.i.release(acquire);
        }
    }

    @Override // com.nytimes.android.assetretriever.i
    public void k() {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.j.acquire();
        try {
            this.a.beginTransaction();
            try {
                acquire.E();
                this.a.setTransactionSuccessful();
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.j.release(acquire);
        }
    }

    @Override // com.nytimes.android.assetretriever.i
    public n n(Instant instant) {
        p27 d2 = p27.d("\n        SELECT *\n        FROM OpenRequest\n        where nextAttempt < ?\n        order by nextAttempt\n        limit 1\n    ", 1);
        String a2 = am3.a(instant);
        if (a2 == null) {
            d2.c1(1);
        } else {
            d2.v0(1, a2);
        }
        this.a.assertNotSuspendingTransaction();
        n nVar = null;
        String string = null;
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            int d3 = q41.d(c2, "requestedUri");
            int d4 = q41.d(c2, "requestedUrl");
            int d5 = q41.d(c2, "nextAttempt");
            if (c2.moveToFirst()) {
                e.b a3 = this.c.a(c2.isNull(d3) ? null : c2.getString(d3));
                e.c a4 = this.d.a(c2.isNull(d4) ? null : c2.getString(d4));
                if (!c2.isNull(d5)) {
                    string = c2.getString(d5);
                }
                nVar = new n(a3, a4, am3.b(string));
            }
            return nVar;
        } finally {
            c2.close();
            d2.release();
        }
    }

    @Override // com.nytimes.android.assetretriever.i
    protected k p(e.b bVar) {
        p27 d2 = p27.d("SELECT * FROM requests where requestedUri = ?", 1);
        String b2 = this.c.b(bVar);
        if (b2 == null) {
            d2.c1(1);
        } else {
            d2.v0(1, b2);
        }
        this.a.assertNotSuspendingTransaction();
        k kVar = null;
        String string = null;
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            int d3 = q41.d(c2, "id");
            int d4 = q41.d(c2, "requestedUri");
            int d5 = q41.d(c2, "requestedUrl");
            int d6 = q41.d(c2, "requestedLastModified");
            int d7 = q41.d(c2, "insertDate");
            int d8 = q41.d(c2, "attempts");
            int d9 = q41.d(c2, "nextAttempt");
            int d10 = q41.d(c2, "isRunning");
            int d11 = q41.d(c2, "downloadedUri");
            if (c2.moveToFirst()) {
                long j = c2.getLong(d3);
                e.b a2 = this.c.a(c2.isNull(d4) ? null : c2.getString(d4));
                e.c a3 = this.d.a(c2.isNull(d5) ? null : c2.getString(d5));
                Instant b3 = am3.b(c2.isNull(d6) ? null : c2.getString(d6));
                Instant b4 = am3.b(c2.isNull(d7) ? null : c2.getString(d7));
                int i = c2.getInt(d8);
                Instant b5 = am3.b(c2.isNull(d9) ? null : c2.getString(d9));
                boolean z = c2.getInt(d10) != 0;
                if (!c2.isNull(d11)) {
                    string = c2.getString(d11);
                }
                kVar = new k(j, a2, a3, b3, b4, i, b5, z, this.c.a(string));
            }
            return kVar;
        } finally {
            c2.close();
            d2.release();
        }
    }

    @Override // com.nytimes.android.assetretriever.i
    protected k q(e.c cVar) {
        p27 d2 = p27.d("SELECT * FROM requests where requestedUrl = ?", 1);
        String b2 = this.d.b(cVar);
        if (b2 == null) {
            d2.c1(1);
        } else {
            d2.v0(1, b2);
        }
        this.a.assertNotSuspendingTransaction();
        k kVar = null;
        String string = null;
        Cursor c2 = p51.c(this.a, d2, false, null);
        try {
            int d3 = q41.d(c2, "id");
            int d4 = q41.d(c2, "requestedUri");
            int d5 = q41.d(c2, "requestedUrl");
            int d6 = q41.d(c2, "requestedLastModified");
            int d7 = q41.d(c2, "insertDate");
            int d8 = q41.d(c2, "attempts");
            int d9 = q41.d(c2, "nextAttempt");
            int d10 = q41.d(c2, "isRunning");
            int d11 = q41.d(c2, "downloadedUri");
            if (c2.moveToFirst()) {
                long j = c2.getLong(d3);
                e.b a2 = this.c.a(c2.isNull(d4) ? null : c2.getString(d4));
                e.c a3 = this.d.a(c2.isNull(d5) ? null : c2.getString(d5));
                Instant b3 = am3.b(c2.isNull(d6) ? null : c2.getString(d6));
                Instant b4 = am3.b(c2.isNull(d7) ? null : c2.getString(d7));
                int i = c2.getInt(d8);
                Instant b5 = am3.b(c2.isNull(d9) ? null : c2.getString(d9));
                boolean z = c2.getInt(d10) != 0;
                if (!c2.isNull(d11)) {
                    string = c2.getString(d11);
                }
                kVar = new k(j, a2, a3, b3, b4, i, b5, z, this.c.a(string));
            }
            return kVar;
        } finally {
            c2.close();
            d2.release();
        }
    }

    @Override // com.nytimes.android.assetretriever.i
    protected int r(k kVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int handle = this.f.handle(kVar);
            this.a.setTransactionSuccessful();
            return handle;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.nytimes.android.assetretriever.i
    protected int s(long j, Instant instant, Instant instant2) {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.g.acquire();
        String a2 = am3.a(instant);
        if (a2 == null) {
            acquire.c1(1);
        } else {
            acquire.v0(1, a2);
        }
        String a3 = am3.a(instant2);
        if (a3 == null) {
            acquire.c1(2);
        } else {
            acquire.v0(2, a3);
        }
        acquire.L0(3, j);
        try {
            this.a.beginTransaction();
            try {
                int E = acquire.E();
                this.a.setTransactionSuccessful();
                return E;
            } finally {
                this.a.endTransaction();
            }
        } finally {
            this.g.release(acquire);
        }
    }
}
