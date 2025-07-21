package com.nytimes.android.room.media;

import androidx.room.RoomDatabase;
import androidx.room.d;
import androidx.room.g;
import defpackage.mf8;
import defpackage.p51;
import defpackage.sc8;
import defpackage.tc8;
import defpackage.xh4;
import defpackage.yh4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class MediaDatabase_Impl extends MediaDatabase {
    private volatile xh4 a;

    class a extends g.b {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.g.b
        public void createAllTables(sc8 sc8Var) {
            sc8Var.B("CREATE TABLE IF NOT EXISTS `audio_positions` (`id` INTEGER NOT NULL, `audio_name` TEXT NOT NULL, `seek_position` INTEGER NOT NULL, `last_updated` TEXT NOT NULL, `asset_state` TEXT NOT NULL, PRIMARY KEY(`id`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5ca45775237a1e70ae62b39d73ae38a9')");
        }

        @Override // androidx.room.g.b
        public void dropAllTables(sc8 sc8Var) {
            sc8Var.B("DROP TABLE IF EXISTS `audio_positions`");
            List list = ((RoomDatabase) MediaDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).b(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onCreate(sc8 sc8Var) {
            List list = ((RoomDatabase) MediaDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).a(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onOpen(sc8 sc8Var) {
            ((RoomDatabase) MediaDatabase_Impl.this).mDatabase = sc8Var;
            MediaDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
            List list = ((RoomDatabase) MediaDatabase_Impl.this).mCallbacks;
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
            HashMap hashMap = new HashMap(5);
            hashMap.put("id", new mf8.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("audio_name", new mf8.a("audio_name", "TEXT", true, 0, null, 1));
            hashMap.put("seek_position", new mf8.a("seek_position", "INTEGER", true, 0, null, 1));
            hashMap.put("last_updated", new mf8.a("last_updated", "TEXT", true, 0, null, 1));
            hashMap.put("asset_state", new mf8.a("asset_state", "TEXT", true, 0, null, 1));
            mf8 mf8Var = new mf8("audio_positions", hashMap, new HashSet(0), new HashSet(0));
            mf8 a = mf8.a(sc8Var, "audio_positions");
            if (mf8Var.equals(a)) {
                return new g.c(true, null);
            }
            return new g.c(false, "audio_positions(com.nytimes.android.room.media.StorableMediaItem).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("DELETE FROM `audio_positions`");
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
        return new d(this, new HashMap(0), new HashMap(0), "audio_positions");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(androidx.room.a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new g(aVar, new a(2), "5ca45775237a1e70ae62b39d73ae38a9", "50133d054809060e5b5261b5b81c829f")).b());
    }

    @Override // com.nytimes.android.room.media.MediaDatabase
    public xh4 d() {
        xh4 xh4Var;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new yh4(this);
                }
                xh4Var = this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xh4Var;
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
        hashMap.put(xh4.class, yh4.h());
        return hashMap;
    }
}
