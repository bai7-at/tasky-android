package defpackage;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.SharedSQLiteStatement;
import defpackage.nu7;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class pu7 implements nu7 {
    private final RoomDatabase __db;
    private final y12 __insertionAdapterOfSkuPurchase;
    private final y12 __insertionAdapterOfSkuPurchase_1;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllPurchases;
    private final SharedSQLiteStatement __preparedStmtOfDeletePurchase;

    class a implements Callable {
        final /* synthetic */ p27 val$_statement;

        a(p27 p27Var) {
            this.val$_statement = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public mu7 call() {
            Boolean valueOf;
            mu7 mu7Var = null;
            Cursor c = p51.c(pu7.this.__db, this.val$_statement, false, null);
            try {
                int d = q41.d(c, "sku");
                int d2 = q41.d(c, "receipt");
                int d3 = q41.d(c, "packageName");
                int d4 = q41.d(c, "campaignCode");
                int d5 = q41.d(c, "orderId");
                int d6 = q41.d(c, "purchaseTime");
                int d7 = q41.d(c, "isAutoRenewing");
                int d8 = q41.d(c, "originalJson");
                if (c.moveToFirst()) {
                    String string = c.isNull(d) ? null : c.getString(d);
                    String string2 = c.isNull(d2) ? null : c.getString(d2);
                    String string3 = c.isNull(d3) ? null : c.getString(d3);
                    String string4 = c.isNull(d4) ? null : c.getString(d4);
                    String string5 = c.isNull(d5) ? null : c.getString(d5);
                    Long valueOf2 = c.isNull(d6) ? null : Long.valueOf(c.getLong(d6));
                    Integer valueOf3 = c.isNull(d7) ? null : Integer.valueOf(c.getInt(d7));
                    if (valueOf3 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf3.intValue() != 0);
                    }
                    mu7Var = new mu7(string, string2, string3, string4, string5, valueOf2, valueOf, c.isNull(d8) ? null : c.getString(d8));
                }
                return mu7Var;
            } finally {
                c.close();
                this.val$_statement.release();
            }
        }
    }

    class b extends y12 {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `SkuPurchase` (`sku`,`receipt`,`packageName`,`campaignCode`,`orderId`,`purchaseTime`,`isAutoRenewing`,`originalJson`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, mu7 mu7Var) {
            if (mu7Var.g() == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, mu7Var.g());
            }
            if (mu7Var.f() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, mu7Var.f());
            }
            if (mu7Var.d() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, mu7Var.d());
            }
            if (mu7Var.a() == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, mu7Var.a());
            }
            if (mu7Var.b() == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, mu7Var.b());
            }
            if (mu7Var.e() == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.L0(6, mu7Var.e().longValue());
            }
            if ((mu7Var.h() == null ? null : Integer.valueOf(mu7Var.h().booleanValue() ? 1 : 0)) == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.L0(7, r3.intValue());
            }
            if (mu7Var.c() == null) {
                wc8Var.c1(8);
            } else {
                wc8Var.v0(8, mu7Var.c());
            }
        }
    }

    class c extends y12 {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR IGNORE INTO `SkuPurchase` (`sku`,`receipt`,`packageName`,`campaignCode`,`orderId`,`purchaseTime`,`isAutoRenewing`,`originalJson`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, mu7 mu7Var) {
            if (mu7Var.g() == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, mu7Var.g());
            }
            if (mu7Var.f() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, mu7Var.f());
            }
            if (mu7Var.d() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, mu7Var.d());
            }
            if (mu7Var.a() == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, mu7Var.a());
            }
            if (mu7Var.b() == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, mu7Var.b());
            }
            if (mu7Var.e() == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.L0(6, mu7Var.e().longValue());
            }
            if ((mu7Var.h() == null ? null : Integer.valueOf(mu7Var.h().booleanValue() ? 1 : 0)) == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.L0(7, r3.intValue());
            }
            if (mu7Var.c() == null) {
                wc8Var.c1(8);
            } else {
                wc8Var.v0(8, mu7Var.c());
            }
        }
    }

    class d extends SharedSQLiteStatement {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE from skuPurchase WHERE sku = ?";
        }
    }

    class e extends SharedSQLiteStatement {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE from skuPurchase";
        }
    }

    class f implements Callable {
        final /* synthetic */ mu7 val$purchase;

        f(mu7 mu7Var) {
            this.val$purchase = mu7Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            pu7.this.__db.beginTransaction();
            try {
                pu7.this.__insertionAdapterOfSkuPurchase.insert(this.val$purchase);
                pu7.this.__db.setTransactionSuccessful();
                return ww8.a;
            } finally {
                pu7.this.__db.endTransaction();
            }
        }
    }

    class g implements Callable {
        final /* synthetic */ mu7 val$purchase;

        g(mu7 mu7Var) {
            this.val$purchase = mu7Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            pu7.this.__db.beginTransaction();
            try {
                pu7.this.__insertionAdapterOfSkuPurchase_1.insert(this.val$purchase);
                pu7.this.__db.setTransactionSuccessful();
                return ww8.a;
            } finally {
                pu7.this.__db.endTransaction();
            }
        }
    }

    class h implements Callable {
        final /* synthetic */ Set val$purchases;

        h(Set set) {
            this.val$purchases = set;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            pu7.this.__db.beginTransaction();
            try {
                pu7.this.__insertionAdapterOfSkuPurchase.insert((Iterable<Object>) this.val$purchases);
                pu7.this.__db.setTransactionSuccessful();
                return ww8.a;
            } finally {
                pu7.this.__db.endTransaction();
            }
        }
    }

    class i implements Callable {
        i() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = pu7.this.__preparedStmtOfDeleteAllPurchases.acquire();
            try {
                pu7.this.__db.beginTransaction();
                try {
                    acquire.E();
                    pu7.this.__db.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    pu7.this.__db.endTransaction();
                }
            } finally {
                pu7.this.__preparedStmtOfDeleteAllPurchases.release(acquire);
            }
        }
    }

    public pu7(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfSkuPurchase = new b(roomDatabase);
        this.__insertionAdapterOfSkuPurchase_1 = new c(roomDatabase);
        this.__preparedStmtOfDeletePurchase = new d(roomDatabase);
        this.__preparedStmtOfDeleteAllPurchases = new e(roomDatabase);
    }

    public static List l() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object m(mu7 mu7Var, boolean z, by0 by0Var) {
        return nu7.a.a(this, mu7Var, z, by0Var);
    }

    @Override // defpackage.nu7
    public Object a(mu7 mu7Var, by0 by0Var) {
        return CoroutinesRoom.c(this.__db, true, new f(mu7Var), by0Var);
    }

    @Override // defpackage.nu7
    public Object b(String str, by0 by0Var) {
        p27 d2 = p27.d("SELECT * from skuPurchase WHERE sku = ?", 1);
        if (str == null) {
            d2.c1(1);
        } else {
            d2.v0(1, str);
        }
        return CoroutinesRoom.b(this.__db, false, p51.a(), new a(d2), by0Var);
    }

    @Override // defpackage.nu7
    public Object c(final mu7 mu7Var, final boolean z, by0 by0Var) {
        return RoomDatabaseKt.d(this.__db, new ss2() { // from class: ou7
            @Override // defpackage.ss2
            public final Object invoke(Object obj) {
                Object m;
                m = pu7.this.m(mu7Var, z, (by0) obj);
                return m;
            }
        }, by0Var);
    }

    @Override // defpackage.nu7
    public Object d(mu7 mu7Var, by0 by0Var) {
        return CoroutinesRoom.c(this.__db, true, new g(mu7Var), by0Var);
    }

    @Override // defpackage.nu7
    public Object e(Set set, by0 by0Var) {
        return CoroutinesRoom.c(this.__db, true, new h(set), by0Var);
    }

    @Override // defpackage.nu7
    public Object f(by0 by0Var) {
        return CoroutinesRoom.c(this.__db, true, new i(), by0Var);
    }
}
