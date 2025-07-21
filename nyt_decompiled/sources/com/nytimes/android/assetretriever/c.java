package com.nytimes.android.assetretriever;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.assetretriever.e;
import defpackage.am3;
import defpackage.ds;
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
public final class c extends com.nytimes.android.assetretriever.a {
    private final RoomDatabase a;
    private final y12 b;
    private final f c = new f();
    private final g d = new g();
    private final ds e = new ds();
    private final x12 f;
    private final x12 g;
    private final SharedSQLiteStatement h;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR ABORT INTO `assets` (`uri`,`assetType`,`lastModified`,`url`,`downloadDate`,`jsonData`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, com.nytimes.android.assetretriever.d dVar) {
            String b = c.this.c.b(dVar.g());
            if (b == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, b);
            }
            if (dVar.c() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, dVar.c());
            }
            am3 am3Var = am3.a;
            String a = am3.a(dVar.f());
            if (a == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, a);
            }
            String b2 = c.this.d.b(dVar.h());
            if (b2 == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, b2);
            }
            String a2 = am3.a(dVar.d());
            if (a2 == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, a2);
            }
            String b3 = c.this.e.b(dVar.e());
            if (b3 == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.v0(6, b3);
            }
        }
    }

    class b extends x12 {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "DELETE FROM `assets` WHERE `uri` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.x12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, com.nytimes.android.assetretriever.d dVar) {
            String b = c.this.c.b(dVar.g());
            if (b == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, b);
            }
        }
    }

    /* renamed from: com.nytimes.android.assetretriever.c$c, reason: collision with other inner class name */
    class C0236c extends x12 {
        C0236c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "UPDATE OR ABORT `assets` SET `uri` = ?,`assetType` = ?,`lastModified` = ?,`url` = ?,`downloadDate` = ?,`jsonData` = ? WHERE `uri` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.x12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, com.nytimes.android.assetretriever.d dVar) {
            String b = c.this.c.b(dVar.g());
            if (b == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, b);
            }
            if (dVar.c() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, dVar.c());
            }
            am3 am3Var = am3.a;
            String a = am3.a(dVar.f());
            if (a == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, a);
            }
            String b2 = c.this.d.b(dVar.h());
            if (b2 == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, b2);
            }
            String a2 = am3.a(dVar.d());
            if (a2 == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, a2);
            }
            String b3 = c.this.e.b(dVar.e());
            if (b3 == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.v0(6, b3);
            }
            String b4 = c.this.c.b(dVar.g());
            if (b4 == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, b4);
            }
        }
    }

    class d extends SharedSQLiteStatement {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "\n        delete from assets where not exists (\n            select 1 from \n                sources s inner join requests r on s.requestId = r.id\n            where r.downloadedUri = assets.uri\n        )\n        ";
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.f = new b(roomDatabase);
        this.g = new C0236c(roomDatabase);
        this.h = new d(roomDatabase);
    }

    public static List n() {
        return Collections.emptyList();
    }

    @Override // com.nytimes.android.assetretriever.a
    public void a() {
        this.a.assertNotSuspendingTransaction();
        wc8 acquire = this.h.acquire();
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

    @Override // com.nytimes.android.assetretriever.a
    protected long b(com.nytimes.android.assetretriever.d dVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long insertAndReturnId = this.b.insertAndReturnId(dVar);
            this.a.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.nytimes.android.assetretriever.a
    public Instant e() {
        p27 d2 = p27.d("select min(nextAttempt) from OpenRequest", 0);
        this.a.assertNotSuspendingTransaction();
        Instant instant = null;
        String string = null;
        Cursor c = p51.c(this.a, d2, false, null);
        try {
            if (c.moveToFirst()) {
                if (!c.isNull(0)) {
                    string = c.getString(0);
                }
                instant = am3.b(string);
            }
            return instant;
        } finally {
            c.close();
            d2.release();
        }
    }

    @Override // com.nytimes.android.assetretriever.a
    protected Asset g(e.b bVar) {
        p27 d2 = p27.d("\n        SELECT a.jsonData FROM assets a inner join requests r on a.uri = r.downloadedUri where r.requestedUri = ?\n        ", 1);
        String b2 = this.c.b(bVar);
        if (b2 == null) {
            d2.c1(1);
        } else {
            d2.v0(1, b2);
        }
        this.a.assertNotSuspendingTransaction();
        Asset asset = null;
        String string = null;
        Cursor c = p51.c(this.a, d2, false, null);
        try {
            if (c.moveToFirst()) {
                if (!c.isNull(0)) {
                    string = c.getString(0);
                }
                asset = (Asset) this.e.a(string);
            }
            return asset;
        } finally {
            c.close();
            d2.release();
        }
    }

    @Override // com.nytimes.android.assetretriever.a
    protected Asset h(e.c cVar) {
        p27 d2 = p27.d("\n        SELECT a.jsonData FROM assets a inner join requests r on a.uri = r.downloadedUri where r.requestedUrl = ?\n        ", 1);
        String b2 = this.d.b(cVar);
        if (b2 == null) {
            d2.c1(1);
        } else {
            d2.v0(1, b2);
        }
        this.a.assertNotSuspendingTransaction();
        Asset asset = null;
        String string = null;
        Cursor c = p51.c(this.a, d2, false, null);
        try {
            if (c.moveToFirst()) {
                if (!c.isNull(0)) {
                    string = c.getString(0);
                }
                asset = (Asset) this.e.a(string);
            }
            return asset;
        } finally {
            c.close();
            d2.release();
        }
    }

    @Override // com.nytimes.android.assetretriever.a
    public com.nytimes.android.assetretriever.d i(String str) {
        p27 d2 = p27.d("SELECT * FROM assets where uri = ?", 1);
        if (str == null) {
            d2.c1(1);
        } else {
            d2.v0(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        com.nytimes.android.assetretriever.d dVar = null;
        String string = null;
        Cursor c = p51.c(this.a, d2, false, null);
        try {
            int d3 = q41.d(c, "uri");
            int d4 = q41.d(c, "assetType");
            int d5 = q41.d(c, "lastModified");
            int d6 = q41.d(c, "url");
            int d7 = q41.d(c, "downloadDate");
            int d8 = q41.d(c, "jsonData");
            if (c.moveToFirst()) {
                e.b a2 = this.c.a(c.isNull(d3) ? null : c.getString(d3));
                String string2 = c.isNull(d4) ? null : c.getString(d4);
                Instant b2 = am3.b(c.isNull(d5) ? null : c.getString(d5));
                e.c a3 = this.d.a(c.isNull(d6) ? null : c.getString(d6));
                Instant b3 = am3.b(c.isNull(d7) ? null : c.getString(d7));
                if (!c.isNull(d8)) {
                    string = c.getString(d8);
                }
                dVar = new com.nytimes.android.assetretriever.d(a2, string2, b2, a3, b3, (Asset) this.e.a(string));
            }
            return dVar;
        } finally {
            c.close();
            d2.release();
        }
    }

    @Override // com.nytimes.android.assetretriever.a
    protected int j(com.nytimes.android.assetretriever.d dVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int handle = this.g.handle(dVar);
            this.a.setTransactionSuccessful();
            return handle;
        } finally {
            this.a.endTransaction();
        }
    }
}
