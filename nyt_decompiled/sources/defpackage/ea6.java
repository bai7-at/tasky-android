package defpackage;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.SharedSQLiteStatement;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDao;
import com.nytimes.android.internal.pushmessaging.model.Subscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class ea6 extends PushMessagingDao {
    private final RoomDatabase a;
    private final y12 b;
    private final m48 c = new m48();
    private final y12 d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;

    class a implements Callable {
        final /* synthetic */ p27 a;

        a(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Subscription call() {
            Subscription subscription = null;
            Cursor c = p51.c(ea6.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "token");
                int d2 = q41.d(c, "tags");
                int d3 = q41.d(c, "regiId");
                int d4 = q41.d(c, "appVersion");
                int d5 = q41.d(c, "isReady");
                int d6 = q41.d(c, "environment");
                int d7 = q41.d(c, "id");
                if (c.moveToFirst()) {
                    subscription = new Subscription(c.isNull(d) ? null : c.getString(d), ea6.this.c.b(c.isNull(d2) ? null : c.getString(d2)), c.getInt(d3), c.isNull(d4) ? null : c.getString(d4), c.getInt(d5) != 0, c.isNull(d6) ? null : c.getString(d6), c.getInt(d7));
                }
                return subscription;
            } finally {
                c.close();
            }
        }

        protected void finalize() {
            this.a.release();
        }
    }

    class b implements Callable {
        final /* synthetic */ p27 a;

        b(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c = p51.c(ea6.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "tag");
                int d2 = q41.d(c, "title");
                int d3 = q41.d(c, "tagDescription");
                int d4 = q41.d(c, "isDefault");
                int d5 = q41.d(c, "isPushkinTag");
                int d6 = q41.d(c, "tagGroupTitle");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new tf8(c.isNull(d) ? null : c.getString(d), c.isNull(d2) ? null : c.getString(d2), c.isNull(d3) ? null : c.getString(d3), c.getInt(d4) != 0, c.getInt(d5) != 0, c.isNull(d6) ? null : c.getString(d6)));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        protected void finalize() {
            this.a.release();
        }
    }

    class c implements Callable {
        final /* synthetic */ p27 a;

        c(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Integer num = null;
            Cursor c = p51.c(ea6.this.a, this.a, false, null);
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

    class d extends y12 {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `Subscription` (`token`,`tags`,`regiId`,`appVersion`,`isReady`,`environment`,`id`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, Subscription subscription) {
            if (subscription.h() == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, subscription.h());
            }
            String a = ea6.this.c.a(subscription.g());
            if (a == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, a);
            }
            wc8Var.L0(3, subscription.f());
            if (subscription.c() == null) {
                wc8Var.c1(4);
            } else {
                wc8Var.v0(4, subscription.c());
            }
            wc8Var.L0(5, subscription.i() ? 1L : 0L);
            if (subscription.d() == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.v0(6, subscription.d());
            }
            wc8Var.L0(7, subscription.e());
        }
    }

    class e extends y12 {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `Tag` (`tag`,`title`,`tagDescription`,`isDefault`,`isPushkinTag`,`tagGroupTitle`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, tf8 tf8Var) {
            if (tf8Var.a() == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, tf8Var.a());
            }
            if (tf8Var.d() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, tf8Var.d());
            }
            if (tf8Var.b() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, tf8Var.b());
            }
            wc8Var.L0(4, tf8Var.e() ? 1L : 0L);
            wc8Var.L0(5, tf8Var.f() ? 1L : 0L);
            if (tf8Var.c() == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.v0(6, tf8Var.c());
            }
        }
    }

    class f extends SharedSQLiteStatement {
        f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM Subscription";
        }
    }

    class g extends SharedSQLiteStatement {
        g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM Tag";
        }
    }

    class h implements Callable {
        final /* synthetic */ Subscription a;

        h(Subscription subscription) {
            this.a = subscription;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            ea6.this.a.beginTransaction();
            try {
                ea6.this.b.insert(this.a);
                ea6.this.a.setTransactionSuccessful();
                return ww8.a;
            } finally {
                ea6.this.a.endTransaction();
            }
        }
    }

    class i implements Callable {
        final /* synthetic */ List a;

        i(List list) {
            this.a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            ea6.this.a.beginTransaction();
            try {
                ea6.this.d.insert((Iterable<Object>) this.a);
                ea6.this.a.setTransactionSuccessful();
                return ww8.a;
            } finally {
                ea6.this.a.endTransaction();
            }
        }
    }

    class j implements Callable {
        j() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = ea6.this.f.acquire();
            try {
                ea6.this.a.beginTransaction();
                try {
                    acquire.E();
                    ea6.this.a.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    ea6.this.a.endTransaction();
                }
            } finally {
                ea6.this.f.release(acquire);
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
        public Subscription call() {
            Subscription subscription = null;
            Cursor c = p51.c(ea6.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "token");
                int d2 = q41.d(c, "tags");
                int d3 = q41.d(c, "regiId");
                int d4 = q41.d(c, "appVersion");
                int d5 = q41.d(c, "isReady");
                int d6 = q41.d(c, "environment");
                int d7 = q41.d(c, "id");
                if (c.moveToFirst()) {
                    subscription = new Subscription(c.isNull(d) ? null : c.getString(d), ea6.this.c.b(c.isNull(d2) ? null : c.getString(d2)), c.getInt(d3), c.isNull(d4) ? null : c.getString(d4), c.getInt(d5) != 0, c.isNull(d6) ? null : c.getString(d6), c.getInt(d7));
                }
                return subscription;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    public ea6(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new d(roomDatabase);
        this.d = new e(roomDatabase);
        this.e = new f(roomDatabase);
        this.f = new g(roomDatabase);
    }

    public static List q() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(List list, by0 by0Var) {
        return super.g(list, by0Var);
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    public Object a(by0 by0Var) {
        p27 d2 = p27.d("SELECT COUNT(tag) FROM Tag", 0);
        return CoroutinesRoom.b(this.a, false, p51.a(), new c(d2), by0Var);
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    public Object b(by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new j(), by0Var);
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    public Object c(by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM Subscription LIMIT 1", 0);
        return CoroutinesRoom.b(this.a, false, p51.a(), new k(d2), by0Var);
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    public Flow d() {
        return CoroutinesRoom.a(this.a, false, new String[]{"Subscription"}, new a(p27.d("SELECT * FROM Subscription LIMIT 1", 0)));
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    public Flow e() {
        return CoroutinesRoom.a(this.a, false, new String[]{"Tag"}, new b(p27.d("SELECT * FROM Tag", 0)));
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    public Object f(List list, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new i(list), by0Var);
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    public Object g(final List list, by0 by0Var) {
        return RoomDatabaseKt.d(this.a, new ss2() { // from class: da6
            @Override // defpackage.ss2
            public final Object invoke(Object obj) {
                Object r;
                r = ea6.this.r(list, (by0) obj);
                return r;
            }
        }, by0Var);
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    public Object i(Subscription subscription, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new h(subscription), by0Var);
    }
}
