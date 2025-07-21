package com.nytimes.android.interests.db;

import androidx.room.RoomDatabase;
import androidx.room.d;
import androidx.room.g;
import com.amazonaws.services.s3.internal.Constants;
import com.facebook.AuthenticationTokenClaims;
import defpackage.gp3;
import defpackage.hp3;
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
public final class InterestsDatabase_Impl extends InterestsDatabase {
    private volatile gp3 a;

    class a extends g.b {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.g.b
        public void createAllTables(sc8 sc8Var) {
            sc8Var.B("CREATE TABLE IF NOT EXISTS `interests_data` (`id` INTEGER NOT NULL, `interest_type` TEXT NOT NULL, `interest_sub_type` TEXT NOT NULL, `name` TEXT NOT NULL, `updatedAt` INTEGER NOT NULL DEFAULT 0, `description` TEXT NOT NULL, `promo_image_url` TEXT NOT NULL, `interest_content` TEXT NOT NULL, `is_opinion` INTEGER NOT NULL DEFAULT false, `is_editors_pick` INTEGER NOT NULL DEFAULT false, `auto_added_timestamp` INTEGER DEFAULT null, PRIMARY KEY(`id`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '50f5c6c3173e40f82f44c76788bf6c0f')");
        }

        @Override // androidx.room.g.b
        public void dropAllTables(sc8 sc8Var) {
            sc8Var.B("DROP TABLE IF EXISTS `interests_data`");
            List list = ((RoomDatabase) InterestsDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).b(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onCreate(sc8 sc8Var) {
            List list = ((RoomDatabase) InterestsDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).a(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onOpen(sc8 sc8Var) {
            ((RoomDatabase) InterestsDatabase_Impl.this).mDatabase = sc8Var;
            InterestsDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
            List list = ((RoomDatabase) InterestsDatabase_Impl.this).mCallbacks;
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
            HashMap hashMap = new HashMap(11);
            hashMap.put("id", new mf8.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("interest_type", new mf8.a("interest_type", "TEXT", true, 0, null, 1));
            hashMap.put("interest_sub_type", new mf8.a("interest_sub_type", "TEXT", true, 0, null, 1));
            hashMap.put(AuthenticationTokenClaims.JSON_KEY_NAME, new mf8.a(AuthenticationTokenClaims.JSON_KEY_NAME, "TEXT", true, 0, null, 1));
            hashMap.put("updatedAt", new mf8.a("updatedAt", "INTEGER", true, 0, "0", 1));
            hashMap.put("description", new mf8.a("description", "TEXT", true, 0, null, 1));
            hashMap.put("promo_image_url", new mf8.a("promo_image_url", "TEXT", true, 0, null, 1));
            hashMap.put("interest_content", new mf8.a("interest_content", "TEXT", true, 0, null, 1));
            hashMap.put("is_opinion", new mf8.a("is_opinion", "INTEGER", true, 0, "false", 1));
            hashMap.put("is_editors_pick", new mf8.a("is_editors_pick", "INTEGER", true, 0, "false", 1));
            hashMap.put("auto_added_timestamp", new mf8.a("auto_added_timestamp", "INTEGER", false, 0, Constants.NULL_VERSION_ID, 1));
            mf8 mf8Var = new mf8("interests_data", hashMap, new HashSet(0), new HashSet(0));
            mf8 a = mf8.a(sc8Var, "interests_data");
            if (mf8Var.equals(a)) {
                return new g.c(true, null);
            }
            return new g.c(false, "interests_data(com.nytimes.android.interests.db.InterestData).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("DELETE FROM `interests_data`");
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
        return new d(this, new HashMap(0), new HashMap(0), "interests_data");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(androidx.room.a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new g(aVar, new a(4), "50f5c6c3173e40f82f44c76788bf6c0f", "d5fa26595bdc59941168a6ce8eb3ae9d")).b());
    }

    @Override // com.nytimes.android.interests.db.InterestsDatabase
    public gp3 d() {
        gp3 gp3Var;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new hp3(this);
                }
                gp3Var = this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gp3Var;
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
        hashMap.put(gp3.class, hp3.i());
        return hashMap;
    }
}
