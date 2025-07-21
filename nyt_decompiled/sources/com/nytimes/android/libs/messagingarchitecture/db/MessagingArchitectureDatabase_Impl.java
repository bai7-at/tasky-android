package com.nytimes.android.libs.messagingarchitecture.db;

import androidx.room.RoomDatabase;
import androidx.room.d;
import androidx.room.g;
import defpackage.b34;
import defpackage.b4;
import defpackage.c34;
import defpackage.c4;
import defpackage.cr4;
import defpackage.dr4;
import defpackage.gr4;
import defpackage.hr4;
import defpackage.mf8;
import defpackage.p51;
import defpackage.qg0;
import defpackage.rg0;
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
public final class MessagingArchitectureDatabase_Impl extends MessagingArchitectureDatabase {
    private volatile cr4 a;
    private volatile gr4 b;
    private volatile b34 c;
    private volatile qg0 d;
    private volatile b4 e;

    class a extends g.b {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.g.b
        public void createAllTables(sc8 sc8Var) {
            sc8Var.B("CREATE TABLE IF NOT EXISTS `oma_message_detail` (`id` TEXT NOT NULL, `message_id` TEXT NOT NULL, `history_id` TEXT NOT NULL, `weight` INTEGER NOT NULL, `unit` TEXT NOT NULL, `placement` TEXT, `presentation_rule` TEXT, `cadence` INTEGER NOT NULL, `action` TEXT, `cancelable` INTEGER NOT NULL, `body` TEXT NOT NULL, `kicker` TEXT, `media_resource` TEXT, `analytics_module_name` TEXT NOT NULL, `analytics_label` TEXT NOT NULL, PRIMARY KEY(`id`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `message_detail` (`id` TEXT NOT NULL, `message_id` TEXT NOT NULL, `history_id` TEXT NOT NULL, `order_id` INTEGER NOT NULL, `context` TEXT NOT NULL, `presentation_rule` TEXT, `message_cadence` INTEGER NOT NULL, `message_placement` TEXT, `message_action` TEXT, `cancelable` INTEGER NOT NULL, `message_body` TEXT NOT NULL, `kicker` TEXT, `media_resource` TEXT, `subscription_required` INTEGER NOT NULL, `ab_test_name` TEXT, `ab_test_variant` TEXT, `analytics_module_name` TEXT NOT NULL, `analytics_label` TEXT NOT NULL, `targeting` TEXT, PRIMARY KEY(`id`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `message_history` (`id` TEXT NOT NULL, `message_id` TEXT NOT NULL, `history_id` TEXT NOT NULL, `action` TEXT, `timestamp` TEXT NOT NULL, PRIMARY KEY(`id`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `local_message_history` (`id` TEXT NOT NULL, `message_id` TEXT NOT NULL, `history_id` TEXT NOT NULL, `unit` TEXT NOT NULL, `last_seen_on` TEXT NOT NULL, `view_count` INTEGER NOT NULL, `dismissed` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `action_history` (`action` TEXT NOT NULL, `timestamp` TEXT NOT NULL, PRIMARY KEY(`action`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fa19ad2ebc80790abf9e6356e8452cda')");
        }

        @Override // androidx.room.g.b
        public void dropAllTables(sc8 sc8Var) {
            sc8Var.B("DROP TABLE IF EXISTS `oma_message_detail`");
            sc8Var.B("DROP TABLE IF EXISTS `message_detail`");
            sc8Var.B("DROP TABLE IF EXISTS `message_history`");
            sc8Var.B("DROP TABLE IF EXISTS `local_message_history`");
            sc8Var.B("DROP TABLE IF EXISTS `action_history`");
            List list = ((RoomDatabase) MessagingArchitectureDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).b(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onCreate(sc8 sc8Var) {
            List list = ((RoomDatabase) MessagingArchitectureDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).a(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onOpen(sc8 sc8Var) {
            ((RoomDatabase) MessagingArchitectureDatabase_Impl.this).mDatabase = sc8Var;
            MessagingArchitectureDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
            List list = ((RoomDatabase) MessagingArchitectureDatabase_Impl.this).mCallbacks;
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
            HashMap hashMap = new HashMap(15);
            hashMap.put("id", new mf8.a("id", "TEXT", true, 1, null, 1));
            hashMap.put("message_id", new mf8.a("message_id", "TEXT", true, 0, null, 1));
            hashMap.put("history_id", new mf8.a("history_id", "TEXT", true, 0, null, 1));
            hashMap.put("weight", new mf8.a("weight", "INTEGER", true, 0, null, 1));
            hashMap.put("unit", new mf8.a("unit", "TEXT", true, 0, null, 1));
            hashMap.put("placement", new mf8.a("placement", "TEXT", false, 0, null, 1));
            hashMap.put("presentation_rule", new mf8.a("presentation_rule", "TEXT", false, 0, null, 1));
            hashMap.put("cadence", new mf8.a("cadence", "INTEGER", true, 0, null, 1));
            hashMap.put("action", new mf8.a("action", "TEXT", false, 0, null, 1));
            hashMap.put("cancelable", new mf8.a("cancelable", "INTEGER", true, 0, null, 1));
            hashMap.put("body", new mf8.a("body", "TEXT", true, 0, null, 1));
            hashMap.put("kicker", new mf8.a("kicker", "TEXT", false, 0, null, 1));
            hashMap.put("media_resource", new mf8.a("media_resource", "TEXT", false, 0, null, 1));
            hashMap.put("analytics_module_name", new mf8.a("analytics_module_name", "TEXT", true, 0, null, 1));
            hashMap.put("analytics_label", new mf8.a("analytics_label", "TEXT", true, 0, null, 1));
            mf8 mf8Var = new mf8("oma_message_detail", hashMap, new HashSet(0), new HashSet(0));
            mf8 a = mf8.a(sc8Var, "oma_message_detail");
            if (!mf8Var.equals(a)) {
                return new g.c(false, "oma_message_detail(com.nytimes.android.libs.messagingarchitecture.model.Message).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(19);
            hashMap2.put("id", new mf8.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("message_id", new mf8.a("message_id", "TEXT", true, 0, null, 1));
            hashMap2.put("history_id", new mf8.a("history_id", "TEXT", true, 0, null, 1));
            hashMap2.put("order_id", new mf8.a("order_id", "INTEGER", true, 0, null, 1));
            hashMap2.put("context", new mf8.a("context", "TEXT", true, 0, null, 1));
            hashMap2.put("presentation_rule", new mf8.a("presentation_rule", "TEXT", false, 0, null, 1));
            hashMap2.put("message_cadence", new mf8.a("message_cadence", "INTEGER", true, 0, null, 1));
            hashMap2.put("message_placement", new mf8.a("message_placement", "TEXT", false, 0, null, 1));
            hashMap2.put("message_action", new mf8.a("message_action", "TEXT", false, 0, null, 1));
            hashMap2.put("cancelable", new mf8.a("cancelable", "INTEGER", true, 0, null, 1));
            hashMap2.put("message_body", new mf8.a("message_body", "TEXT", true, 0, null, 1));
            hashMap2.put("kicker", new mf8.a("kicker", "TEXT", false, 0, null, 1));
            hashMap2.put("media_resource", new mf8.a("media_resource", "TEXT", false, 0, null, 1));
            hashMap2.put("subscription_required", new mf8.a("subscription_required", "INTEGER", true, 0, null, 1));
            hashMap2.put("ab_test_name", new mf8.a("ab_test_name", "TEXT", false, 0, null, 1));
            hashMap2.put("ab_test_variant", new mf8.a("ab_test_variant", "TEXT", false, 0, null, 1));
            hashMap2.put("analytics_module_name", new mf8.a("analytics_module_name", "TEXT", true, 0, null, 1));
            hashMap2.put("analytics_label", new mf8.a("analytics_label", "TEXT", true, 0, null, 1));
            hashMap2.put("targeting", new mf8.a("targeting", "TEXT", false, 0, null, 1));
            mf8 mf8Var2 = new mf8("message_detail", hashMap2, new HashSet(0), new HashSet(0));
            mf8 a2 = mf8.a(sc8Var, "message_detail");
            if (!mf8Var2.equals(a2)) {
                return new g.c(false, "message_detail(com.nytimes.android.libs.messagingarchitecture.model.LegacyMessage).\n Expected:\n" + mf8Var2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(5);
            hashMap3.put("id", new mf8.a("id", "TEXT", true, 1, null, 1));
            hashMap3.put("message_id", new mf8.a("message_id", "TEXT", true, 0, null, 1));
            hashMap3.put("history_id", new mf8.a("history_id", "TEXT", true, 0, null, 1));
            hashMap3.put("action", new mf8.a("action", "TEXT", false, 0, null, 1));
            hashMap3.put("timestamp", new mf8.a("timestamp", "TEXT", true, 0, null, 1));
            mf8 mf8Var3 = new mf8("message_history", hashMap3, new HashSet(0), new HashSet(0));
            mf8 a3 = mf8.a(sc8Var, "message_history");
            if (!mf8Var3.equals(a3)) {
                return new g.c(false, "message_history(com.nytimes.android.libs.messagingarchitecture.model.MessageHistory).\n Expected:\n" + mf8Var3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(7);
            hashMap4.put("id", new mf8.a("id", "TEXT", true, 1, null, 1));
            hashMap4.put("message_id", new mf8.a("message_id", "TEXT", true, 0, null, 1));
            hashMap4.put("history_id", new mf8.a("history_id", "TEXT", true, 0, null, 1));
            hashMap4.put("unit", new mf8.a("unit", "TEXT", true, 0, null, 1));
            hashMap4.put("last_seen_on", new mf8.a("last_seen_on", "TEXT", true, 0, null, 1));
            hashMap4.put("view_count", new mf8.a("view_count", "INTEGER", true, 0, null, 1));
            hashMap4.put("dismissed", new mf8.a("dismissed", "INTEGER", true, 0, null, 1));
            mf8 mf8Var4 = new mf8("local_message_history", hashMap4, new HashSet(0), new HashSet(0));
            mf8 a4 = mf8.a(sc8Var, "local_message_history");
            if (!mf8Var4.equals(a4)) {
                return new g.c(false, "local_message_history(com.nytimes.android.libs.messagingarchitecture.model.CachedMessageHistory).\n Expected:\n" + mf8Var4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("action", new mf8.a("action", "TEXT", true, 1, null, 1));
            hashMap5.put("timestamp", new mf8.a("timestamp", "TEXT", true, 0, null, 1));
            mf8 mf8Var5 = new mf8("action_history", hashMap5, new HashSet(0), new HashSet(0));
            mf8 a5 = mf8.a(sc8Var, "action_history");
            if (mf8Var5.equals(a5)) {
                return new g.c(true, null);
            }
            return new g.c(false, "action_history(com.nytimes.android.libs.messagingarchitecture.model.ActionHistory).\n Expected:\n" + mf8Var5 + "\n Found:\n" + a5);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("DELETE FROM `oma_message_detail`");
            o.B("DELETE FROM `message_detail`");
            o.B("DELETE FROM `message_history`");
            o.B("DELETE FROM `local_message_history`");
            o.B("DELETE FROM `action_history`");
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
        return new d(this, new HashMap(0), new HashMap(0), "oma_message_detail", "message_detail", "message_history", "local_message_history", "action_history");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(androidx.room.a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new g(aVar, new a(11), "fa19ad2ebc80790abf9e6356e8452cda", "58bdc7868db92e6240b62e8bdbf1d880")).b());
    }

    @Override // com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase
    public b4 d() {
        b4 b4Var;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = new c4(this);
                }
                b4Var = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b4Var;
    }

    @Override // com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase
    public qg0 e() {
        qg0 qg0Var;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new rg0(this);
                }
                qg0Var = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qg0Var;
    }

    @Override // com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase
    public b34 f() {
        b34 b34Var;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new c34(this);
                }
                b34Var = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b34Var;
    }

    @Override // com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase
    public gr4 g() {
        gr4 gr4Var;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new hr4(this);
                }
                gr4Var = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gr4Var;
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
        hashMap.put(cr4.class, dr4.l());
        hashMap.put(gr4.class, hr4.h());
        hashMap.put(b34.class, c34.i());
        hashMap.put(qg0.class, rg0.h());
        hashMap.put(b4.class, c4.h());
        return hashMap;
    }

    @Override // com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase
    public cr4 h() {
        cr4 cr4Var;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new dr4(this);
                }
                cr4Var = this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cr4Var;
    }
}
