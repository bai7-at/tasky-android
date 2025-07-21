package com.nytimes.android.recentlyviewed.room;

import androidx.room.RoomDatabase;
import androidx.room.d;
import androidx.room.g;
import defpackage.hs;
import defpackage.is;
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
public final class AssetDatabase_Impl extends AssetDatabase {
    private volatile hs a;

    class a extends g.b {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.g.b
        public void createAllTables(sc8 sc8Var) {
            sc8Var.B("CREATE TABLE IF NOT EXISTS `assets` (`id` INTEGER NOT NULL, `headline` TEXT NOT NULL, `image_url` TEXT, `summary` TEXT NOT NULL, `asset_type` TEXT NOT NULL, `section_name` TEXT NOT NULL, `kicker` TEXT, `last_updated` TEXT NOT NULL, `last_accessed` TEXT NOT NULL, `comment_count` INTEGER NOT NULL, `url` TEXT, `uri` TEXT, `read_before_but_updated` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '107746f1404bdfcef17cb6dcb4e24e97')");
        }

        @Override // androidx.room.g.b
        public void dropAllTables(sc8 sc8Var) {
            sc8Var.B("DROP TABLE IF EXISTS `assets`");
            List list = ((RoomDatabase) AssetDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).b(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onCreate(sc8 sc8Var) {
            List list = ((RoomDatabase) AssetDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).a(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onOpen(sc8 sc8Var) {
            ((RoomDatabase) AssetDatabase_Impl.this).mDatabase = sc8Var;
            AssetDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
            List list = ((RoomDatabase) AssetDatabase_Impl.this).mCallbacks;
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
            HashMap hashMap = new HashMap(13);
            hashMap.put("id", new mf8.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("headline", new mf8.a("headline", "TEXT", true, 0, null, 1));
            hashMap.put("image_url", new mf8.a("image_url", "TEXT", false, 0, null, 1));
            hashMap.put("summary", new mf8.a("summary", "TEXT", true, 0, null, 1));
            hashMap.put("asset_type", new mf8.a("asset_type", "TEXT", true, 0, null, 1));
            hashMap.put("section_name", new mf8.a("section_name", "TEXT", true, 0, null, 1));
            hashMap.put("kicker", new mf8.a("kicker", "TEXT", false, 0, null, 1));
            hashMap.put("last_updated", new mf8.a("last_updated", "TEXT", true, 0, null, 1));
            hashMap.put("last_accessed", new mf8.a("last_accessed", "TEXT", true, 0, null, 1));
            hashMap.put("comment_count", new mf8.a("comment_count", "INTEGER", true, 0, null, 1));
            hashMap.put("url", new mf8.a("url", "TEXT", false, 0, null, 1));
            hashMap.put("uri", new mf8.a("uri", "TEXT", false, 0, null, 1));
            hashMap.put("read_before_but_updated", new mf8.a("read_before_but_updated", "INTEGER", true, 0, null, 1));
            mf8 mf8Var = new mf8("assets", hashMap, new HashSet(0), new HashSet(0));
            mf8 a = mf8.a(sc8Var, "assets");
            if (mf8Var.equals(a)) {
                return new g.c(true, null);
            }
            return new g.c(false, "assets(com.nytimes.android.recentlyviewed.room.StorableAsset).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("DELETE FROM `assets`");
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
        return new d(this, new HashMap(0), new HashMap(0), "assets");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(androidx.room.a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new g(aVar, new a(8), "107746f1404bdfcef17cb6dcb4e24e97", "9051aad5b0024e5a35702cada37b27f2")).b());
    }

    @Override // com.nytimes.android.recentlyviewed.room.AssetDatabase
    public hs d() {
        hs hsVar;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new is(this);
                }
                hsVar = this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hsVar;
    }

    @Override // androidx.room.RoomDatabase
    public List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.nytimes.android.recentlyviewed.room.a());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(hs.class, is.j());
        return hashMap;
    }
}
