package com.nytimes.android.resourcedownloader.data;

import androidx.room.RoomDatabase;
import androidx.room.a;
import androidx.room.d;
import androidx.room.g;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.c00;
import defpackage.mf8;
import defpackage.p51;
import defpackage.sc8;
import defpackage.tc8;
import defpackage.wt4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ResourceDatabase_Impl extends ResourceDatabase {
    private volatile ResourceDao _resourceDao;
    private volatile SourceDao _sourceDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("DELETE FROM `resources`");
            o.B("DELETE FROM `sources`");
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
        return new d(this, new HashMap(0), new HashMap(0), "resources", "sources");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new g(aVar, new g.b(2) { // from class: com.nytimes.android.resourcedownloader.data.ResourceDatabase_Impl.1
            @Override // androidx.room.g.b
            public void createAllTables(sc8 sc8Var) {
                sc8Var.B("CREATE TABLE IF NOT EXISTS `resources` (`url` TEXT NOT NULL, `date` TEXT, `expires` TEXT, `max-age` INTEGER, `etag` TEXT, `fileName` TEXT NOT NULL, PRIMARY KEY(`url`))");
                sc8Var.B("CREATE TABLE IF NOT EXISTS `sources` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT NOT NULL, `source` TEXT NOT NULL)");
                sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '54e2bd0baa897a728fe05fa3afaa0437')");
            }

            @Override // androidx.room.g.b
            public void dropAllTables(sc8 sc8Var) {
                sc8Var.B("DROP TABLE IF EXISTS `resources`");
                sc8Var.B("DROP TABLE IF EXISTS `sources`");
                List list = ((RoomDatabase) ResourceDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((RoomDatabase.b) it2.next()).b(sc8Var);
                    }
                }
            }

            @Override // androidx.room.g.b
            public void onCreate(sc8 sc8Var) {
                List list = ((RoomDatabase) ResourceDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((RoomDatabase.b) it2.next()).a(sc8Var);
                    }
                }
            }

            @Override // androidx.room.g.b
            public void onOpen(sc8 sc8Var) {
                ((RoomDatabase) ResourceDatabase_Impl.this).mDatabase = sc8Var;
                ResourceDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
                List list = ((RoomDatabase) ResourceDatabase_Impl.this).mCallbacks;
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
                HashMap hashMap = new HashMap(6);
                hashMap.put("url", new mf8.a("url", "TEXT", true, 1, null, 1));
                hashMap.put("date", new mf8.a("date", "TEXT", false, 0, null, 1));
                hashMap.put("expires", new mf8.a("expires", "TEXT", false, 0, null, 1));
                hashMap.put("max-age", new mf8.a("max-age", "INTEGER", false, 0, null, 1));
                hashMap.put(TransferTable.COLUMN_ETAG, new mf8.a(TransferTable.COLUMN_ETAG, "TEXT", false, 0, null, 1));
                hashMap.put("fileName", new mf8.a("fileName", "TEXT", true, 0, null, 1));
                mf8 mf8Var = new mf8("resources", hashMap, new HashSet(0), new HashSet(0));
                mf8 a = mf8.a(sc8Var, "resources");
                if (!mf8Var.equals(a)) {
                    return new g.c(false, "resources(com.nytimes.android.resourcedownloader.data.ResourceEntity).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
                }
                HashMap hashMap2 = new HashMap(3);
                hashMap2.put("id", new mf8.a("id", "INTEGER", true, 1, null, 1));
                hashMap2.put("url", new mf8.a("url", "TEXT", true, 0, null, 1));
                hashMap2.put("source", new mf8.a("source", "TEXT", true, 0, null, 1));
                mf8 mf8Var2 = new mf8("sources", hashMap2, new HashSet(0), new HashSet(0));
                mf8 a2 = mf8.a(sc8Var, "sources");
                if (mf8Var2.equals(a2)) {
                    return new g.c(true, null);
                }
                return new g.c(false, "sources(com.nytimes.android.resourcedownloader.data.ResourceSourceEntity).\n Expected:\n" + mf8Var2 + "\n Found:\n" + a2);
            }
        }, "54e2bd0baa897a728fe05fa3afaa0437", "02cde36b655b03e1e159cbc83d1fe722")).b());
    }

    @Override // androidx.room.RoomDatabase
    public List<wt4> getAutoMigrations(Map<Class<? extends c00>, c00> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends c00>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(ResourceDao.class, ResourceDao_Impl.getRequiredConverters());
        hashMap.put(SourceDao.class, SourceDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.nytimes.android.resourcedownloader.data.ResourceDatabase
    public ResourceDao resourceDao() {
        ResourceDao resourceDao;
        if (this._resourceDao != null) {
            return this._resourceDao;
        }
        synchronized (this) {
            try {
                if (this._resourceDao == null) {
                    this._resourceDao = new ResourceDao_Impl(this);
                }
                resourceDao = this._resourceDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return resourceDao;
    }

    @Override // com.nytimes.android.resourcedownloader.data.ResourceDatabase
    public SourceDao sourceDao() {
        SourceDao sourceDao;
        if (this._sourceDao != null) {
            return this._sourceDao;
        }
        synchronized (this) {
            try {
                if (this._sourceDao == null) {
                    this._sourceDao = new SourceDao_Impl(this);
                }
                sourceDao = this._sourceDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sourceDao;
    }
}
