package com.nytimes.android.eventtracker.buffer.db;

import androidx.room.RoomDatabase;
import androidx.room.d;
import androidx.room.g;
import defpackage.mf8;
import defpackage.nd0;
import defpackage.od0;
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
public final class BufferedEventDatabase_Impl extends BufferedEventDatabase {
    private volatile nd0 a;

    class a extends g.b {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.g.b
        public void createAllTables(sc8 sc8Var) {
            sc8Var.B("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `created` INTEGER NOT NULL, `updated` INTEGER NOT NULL, `validatedStatus` TEXT NOT NULL, `uploadStatus` TEXT NOT NULL, `archive` INTEGER NOT NULL, `event` TEXT NOT NULL)");
            sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '89d7e0bfbbe6ce171c942e85cd1aeafb')");
        }

        @Override // androidx.room.g.b
        public void dropAllTables(sc8 sc8Var) {
            sc8Var.B("DROP TABLE IF EXISTS `events`");
            List list = ((RoomDatabase) BufferedEventDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).b(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onCreate(sc8 sc8Var) {
            List list = ((RoomDatabase) BufferedEventDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).a(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onOpen(sc8 sc8Var) {
            ((RoomDatabase) BufferedEventDatabase_Impl.this).mDatabase = sc8Var;
            BufferedEventDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
            List list = ((RoomDatabase) BufferedEventDatabase_Impl.this).mCallbacks;
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
            hashMap.put("id", new mf8.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("created", new mf8.a("created", "INTEGER", true, 0, null, 1));
            hashMap.put("updated", new mf8.a("updated", "INTEGER", true, 0, null, 1));
            hashMap.put("validatedStatus", new mf8.a("validatedStatus", "TEXT", true, 0, null, 1));
            hashMap.put("uploadStatus", new mf8.a("uploadStatus", "TEXT", true, 0, null, 1));
            hashMap.put("archive", new mf8.a("archive", "INTEGER", true, 0, null, 1));
            hashMap.put("event", new mf8.a("event", "TEXT", true, 0, null, 1));
            mf8 mf8Var = new mf8("events", hashMap, new HashSet(0), new HashSet(0));
            mf8 a = mf8.a(sc8Var, "events");
            if (mf8Var.equals(a)) {
                return new g.c(true, null);
            }
            return new g.c(false, "events(com.nytimes.android.eventtracker.buffer.db.BufferedEvent).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("DELETE FROM `events`");
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
        return new d(this, new HashMap(0), new HashMap(0), "events");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(androidx.room.a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new g(aVar, new a(1), "89d7e0bfbbe6ce171c942e85cd1aeafb", "ec2f34546b650f77afa96105b3ed9f8a")).b());
    }

    @Override // com.nytimes.android.eventtracker.buffer.db.BufferedEventDatabase
    public nd0 d() {
        nd0 nd0Var;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new od0(this);
                }
                nd0Var = this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nd0Var;
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
        hashMap.put(nd0.class, od0.q());
        return hashMap;
    }
}
