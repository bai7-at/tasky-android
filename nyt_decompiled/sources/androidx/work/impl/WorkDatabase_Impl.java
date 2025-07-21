package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.room.g;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.dp6;
import defpackage.ek9;
import defpackage.ep6;
import defpackage.hk9;
import defpackage.kk9;
import defpackage.l16;
import defpackage.le8;
import defpackage.lk9;
import defpackage.m16;
import defpackage.me8;
import defpackage.mf8;
import defpackage.mm1;
import defpackage.nm1;
import defpackage.p51;
import defpackage.sc8;
import defpackage.tc8;
import defpackage.uj9;
import defpackage.vj9;
import defpackage.xj9;
import defpackage.yj9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile ek9 b;
    private volatile mm1 c;
    private volatile kk9 d;
    private volatile le8 e;
    private volatile uj9 f;
    private volatile xj9 g;
    private volatile l16 h;

    class a extends g.b {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.g.b
        public void createAllTables(sc8 sc8Var) {
            sc8Var.B("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        @Override // androidx.room.g.b
        public void dropAllTables(sc8 sc8Var) {
            sc8Var.B("DROP TABLE IF EXISTS `Dependency`");
            sc8Var.B("DROP TABLE IF EXISTS `WorkSpec`");
            sc8Var.B("DROP TABLE IF EXISTS `WorkTag`");
            sc8Var.B("DROP TABLE IF EXISTS `SystemIdInfo`");
            sc8Var.B("DROP TABLE IF EXISTS `WorkName`");
            sc8Var.B("DROP TABLE IF EXISTS `WorkProgress`");
            sc8Var.B("DROP TABLE IF EXISTS `Preference`");
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).b(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onCreate(sc8 sc8Var) {
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).a(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onOpen(sc8 sc8Var) {
            ((RoomDatabase) WorkDatabase_Impl.this).mDatabase = sc8Var;
            sc8Var.B("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
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
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new mf8.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new mf8.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new mf8.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new mf8.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new mf8.e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new mf8.e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            mf8 mf8Var = new mf8("Dependency", hashMap, hashSet, hashSet2);
            mf8 a = mf8.a(sc8Var, "Dependency");
            if (!mf8Var.equals(a)) {
                return new g.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(32);
            hashMap2.put("id", new mf8.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put(TransferTable.COLUMN_STATE, new mf8.a(TransferTable.COLUMN_STATE, "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new mf8.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new mf8.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input", new mf8.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new mf8.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new mf8.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new mf8.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new mf8.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new mf8.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new mf8.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new mf8.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("last_enqueue_time", new mf8.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            hashMap2.put("minimum_retention_duration", new mf8.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new mf8.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new mf8.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new mf8.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_count", new mf8.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new mf8.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("next_schedule_time_override", new mf8.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            hashMap2.put("next_schedule_time_override_generation", new mf8.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("stop_reason", new mf8.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            hashMap2.put("trace_tag", new mf8.a("trace_tag", "TEXT", false, 0, null, 1));
            hashMap2.put("required_network_type", new mf8.a("required_network_type", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_request", new mf8.a("required_network_request", "BLOB", true, 0, "x''", 1));
            hashMap2.put("requires_charging", new mf8.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new mf8.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new mf8.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new mf8.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new mf8.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new mf8.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new mf8.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new mf8.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new mf8.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            mf8 mf8Var2 = new mf8("WorkSpec", hashMap2, hashSet3, hashSet4);
            mf8 a2 = mf8.a(sc8Var, "WorkSpec");
            if (!mf8Var2.equals(a2)) {
                return new g.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + mf8Var2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new mf8.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new mf8.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new mf8.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new mf8.e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            mf8 mf8Var3 = new mf8("WorkTag", hashMap3, hashSet5, hashSet6);
            mf8 a3 = mf8.a(sc8Var, "WorkTag");
            if (!mf8Var3.equals(a3)) {
                return new g.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + mf8Var3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new mf8.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("generation", new mf8.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new mf8.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new mf8.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            mf8 mf8Var4 = new mf8("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            mf8 a4 = mf8.a(sc8Var, "SystemIdInfo");
            if (!mf8Var4.equals(a4)) {
                return new g.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + mf8Var4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(AuthenticationTokenClaims.JSON_KEY_NAME, new mf8.a(AuthenticationTokenClaims.JSON_KEY_NAME, "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new mf8.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new mf8.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new mf8.e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            mf8 mf8Var5 = new mf8("WorkName", hashMap5, hashSet8, hashSet9);
            mf8 a5 = mf8.a(sc8Var, "WorkName");
            if (!mf8Var5.equals(a5)) {
                return new g.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + mf8Var5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new mf8.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new mf8.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new mf8.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            mf8 mf8Var6 = new mf8("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            mf8 a6 = mf8.a(sc8Var, "WorkProgress");
            if (!mf8Var6.equals(a6)) {
                return new g.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + mf8Var6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(TransferTable.COLUMN_KEY, new mf8.a(TransferTable.COLUMN_KEY, "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new mf8.a("long_value", "INTEGER", false, 0, null, 1));
            mf8 mf8Var7 = new mf8("Preference", hashMap7, new HashSet(0), new HashSet(0));
            mf8 a7 = mf8.a(sc8Var, "Preference");
            if (mf8Var7.equals(a7)) {
                return new g.c(true, null);
            }
            return new g.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + mf8Var7 + "\n Found:\n" + a7);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("PRAGMA defer_foreign_keys = TRUE");
            o.B("DELETE FROM `Dependency`");
            o.B("DELETE FROM `WorkSpec`");
            o.B("DELETE FROM `WorkTag`");
            o.B("DELETE FROM `SystemIdInfo`");
            o.B("DELETE FROM `WorkName`");
            o.B("DELETE FROM `WorkProgress`");
            o.B("DELETE FROM `Preference`");
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
    protected androidx.room.d createInvalidationTracker() {
        return new androidx.room.d(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(androidx.room.a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new androidx.room.g(aVar, new a(23), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0")).b());
    }

    @Override // androidx.work.impl.WorkDatabase
    public mm1 d() {
        mm1 mm1Var;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new nm1(this);
                }
                mm1Var = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mm1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public l16 e() {
        l16 l16Var;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            try {
                if (this.h == null) {
                    this.h = new m16(this);
                }
                l16Var = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l16Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public le8 f() {
        le8 le8Var;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = new me8(this);
                }
                le8Var = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return le8Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public uj9 g() {
        uj9 uj9Var;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new vj9(this);
                }
                uj9Var = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uj9Var;
    }

    @Override // androidx.room.RoomDatabase
    public List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new f());
        arrayList.add(new g());
        arrayList.add(new h());
        arrayList.add(new i());
        arrayList.add(new j());
        arrayList.add(new k());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(ek9.class, hk9.H());
        hashMap.put(mm1.class, nm1.e());
        hashMap.put(kk9.class, lk9.d());
        hashMap.put(le8.class, me8.h());
        hashMap.put(uj9.class, vj9.c());
        hashMap.put(xj9.class, yj9.c());
        hashMap.put(l16.class, m16.c());
        hashMap.put(dp6.class, ep6.a());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public xj9 h() {
        xj9 xj9Var;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            try {
                if (this.g == null) {
                    this.g = new yj9(this);
                }
                xj9Var = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xj9Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public ek9 i() {
        ek9 ek9Var;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new hk9(this);
                }
                ek9Var = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ek9Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public kk9 j() {
        kk9 kk9Var;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new lk9(this);
                }
                kk9Var = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kk9Var;
    }
}
