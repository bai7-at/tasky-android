package com.nytimes.android.internal.pushmessaging.database;

import androidx.room.RoomDatabase;
import androidx.room.d;
import androidx.room.g;
import defpackage.ea6;
import defpackage.mf8;
import defpackage.p51;
import defpackage.sc8;
import defpackage.tc8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class PushMessagingDatabase_Impl extends PushMessagingDatabase {
    private volatile PushMessagingDao b;

    class a extends g.b {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.g.b
        public void createAllTables(sc8 sc8Var) {
            sc8Var.B("CREATE TABLE IF NOT EXISTS `Subscription` (`token` TEXT NOT NULL, `tags` TEXT NOT NULL, `regiId` INTEGER NOT NULL, `appVersion` TEXT NOT NULL, `isReady` INTEGER NOT NULL, `environment` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `Tag` (`tag` TEXT NOT NULL, `title` TEXT, `tagDescription` TEXT, `isDefault` INTEGER NOT NULL, `isPushkinTag` INTEGER NOT NULL, `tagGroupTitle` TEXT, PRIMARY KEY(`tag`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7dcaa8790fe44bbf808aac8574c67911')");
        }

        @Override // androidx.room.g.b
        public void dropAllTables(sc8 sc8Var) {
            sc8Var.B("DROP TABLE IF EXISTS `Subscription`");
            sc8Var.B("DROP TABLE IF EXISTS `Tag`");
            List list = ((RoomDatabase) PushMessagingDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).b(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onCreate(sc8 sc8Var) {
            List list = ((RoomDatabase) PushMessagingDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).a(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onOpen(sc8 sc8Var) {
            ((RoomDatabase) PushMessagingDatabase_Impl.this).mDatabase = sc8Var;
            PushMessagingDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
            List list = ((RoomDatabase) PushMessagingDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).c(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onPostMigrate(sc8 sc8Var) {
        }

        @Override // androidx.room.g.b
        public void onPreMigrate(sc8 sc8Var) {
            p51.b(sc8Var);
        }

        @Override // androidx.room.g.b
        public g.c onValidateSchema(sc8 sc8Var) {
            HashMap hashMap = new HashMap(7);
            hashMap.put("token", new mf8.a("token", "TEXT", true, 0, null, 1));
            hashMap.put("tags", new mf8.a("tags", "TEXT", true, 0, null, 1));
            hashMap.put("regiId", new mf8.a("regiId", "INTEGER", true, 0, null, 1));
            hashMap.put("appVersion", new mf8.a("appVersion", "TEXT", true, 0, null, 1));
            hashMap.put("isReady", new mf8.a("isReady", "INTEGER", true, 0, null, 1));
            hashMap.put("environment", new mf8.a("environment", "TEXT", true, 0, null, 1));
            hashMap.put("id", new mf8.a("id", "INTEGER", true, 1, null, 1));
            mf8 mf8Var = new mf8("Subscription", hashMap, new HashSet(0), new HashSet(0));
            mf8 a = mf8.a(sc8Var, "Subscription");
            if (!mf8Var.equals(a)) {
                return new g.c(false, "Subscription(com.nytimes.android.internal.pushmessaging.model.Subscription).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(6);
            hashMap2.put("tag", new mf8.a("tag", "TEXT", true, 1, null, 1));
            hashMap2.put("title", new mf8.a("title", "TEXT", false, 0, null, 1));
            hashMap2.put("tagDescription", new mf8.a("tagDescription", "TEXT", false, 0, null, 1));
            hashMap2.put("isDefault", new mf8.a("isDefault", "INTEGER", true, 0, null, 1));
            hashMap2.put("isPushkinTag", new mf8.a("isPushkinTag", "INTEGER", true, 0, null, 1));
            hashMap2.put("tagGroupTitle", new mf8.a("tagGroupTitle", "TEXT", false, 0, null, 1));
            mf8 mf8Var2 = new mf8("Tag", hashMap2, new HashSet(0), new HashSet(0));
            mf8 a2 = mf8.a(sc8Var, "Tag");
            if (mf8Var2.equals(a2)) {
                return new g.c(true, null);
            }
            return new g.c(false, "Tag(com.nytimes.android.internal.pushmessaging.model.Tag).\n Expected:\n" + mf8Var2 + "\n Found:\n" + a2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("DELETE FROM `Subscription`");
            o.B("DELETE FROM `Tag`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            o.T0("PRAGMA wal_checkpoint(FULL)").close();
            if (!o.g1()) {
                o.B("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected d createInvalidationTracker() {
        return new d(this, new HashMap(0), new HashMap(0), "Subscription", "Tag");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(androidx.room.a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new g(aVar, new a(1), "7dcaa8790fe44bbf808aac8574c67911", "cab4821f5d76b9632411db48a9b0e717")).b());
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDatabase
    public PushMessagingDao f() {
        PushMessagingDao pushMessagingDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new ea6(this);
                }
                pushMessagingDao = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pushMessagingDao;
    }

    @Override // androidx.room.RoomDatabase
    public List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(PushMessagingDao.class, ea6.q());
        return hashMap;
    }
}
