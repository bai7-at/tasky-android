package com.nytimes.android.assetretriever;

import androidx.room.RoomDatabase;
import androidx.room.g;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.appsflyer.AppsFlyerProperties;
import defpackage.ha9;
import defpackage.mf8;
import defpackage.p51;
import defpackage.sc8;
import defpackage.tc8;
import defpackage.tt;
import defpackage.ut;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class AssetRetrieverDatabase_Impl extends AssetRetrieverDatabase {
    private volatile com.nytimes.android.assetretriever.a a;
    private volatile tt b;
    private volatile i c;

    class a extends g.b {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.g.b
        public void createAllTables(sc8 sc8Var) {
            sc8Var.B("CREATE TABLE IF NOT EXISTS `assets` (`uri` TEXT NOT NULL, `assetType` TEXT, `lastModified` TEXT NOT NULL, `url` TEXT, `downloadDate` TEXT NOT NULL, `jsonData` TEXT NOT NULL, PRIMARY KEY(`uri`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `requests` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestedUri` TEXT, `requestedUrl` TEXT, `requestedLastModified` TEXT, `insertDate` TEXT NOT NULL, `attempts` INTEGER NOT NULL, `nextAttempt` TEXT NOT NULL, `isRunning` INTEGER NOT NULL, `downloadedUri` TEXT, FOREIGN KEY(`downloadedUri`) REFERENCES `assets`(`uri`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_requests_requestedUri` ON `requests` (`requestedUri`)");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_requests_requestedUrl` ON `requests` (`requestedUrl`)");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_requests_downloadedUri` ON `requests` (`downloadedUri`)");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `sources` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestId` INTEGER NOT NULL, `type` TEXT NOT NULL, `insertDate` TEXT NOT NULL, `expirationDate` TEXT, `externalId` INTEGER, `additionalData` TEXT, `userEmail` TEXT, FOREIGN KEY(`requestId`) REFERENCES `requests`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_sources_requestId` ON `sources` (`requestId`)");
            sc8Var.B("CREATE VIEW `OpenRequest` AS select requestedUri, requestedUrl, nextAttempt\n            from requests r\n        left outer join assets a on r.downloadedUri = a.uri\n        where \n            (r.downloadedUri is null or requestedLastModified > a.lastModified) and\n            isRunning = 0");
            sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8c544169d9e1d60db8aa242a4ad3cff2')");
        }

        @Override // androidx.room.g.b
        public void dropAllTables(sc8 sc8Var) {
            sc8Var.B("DROP TABLE IF EXISTS `assets`");
            sc8Var.B("DROP TABLE IF EXISTS `requests`");
            sc8Var.B("DROP TABLE IF EXISTS `sources`");
            sc8Var.B("DROP VIEW IF EXISTS `OpenRequest`");
            List list = ((RoomDatabase) AssetRetrieverDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).b(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onCreate(sc8 sc8Var) {
            List list = ((RoomDatabase) AssetRetrieverDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).a(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onOpen(sc8 sc8Var) {
            ((RoomDatabase) AssetRetrieverDatabase_Impl.this).mDatabase = sc8Var;
            sc8Var.B("PRAGMA foreign_keys = ON");
            AssetRetrieverDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
            List list = ((RoomDatabase) AssetRetrieverDatabase_Impl.this).mCallbacks;
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
            hashMap.put("uri", new mf8.a("uri", "TEXT", true, 1, null, 1));
            hashMap.put("assetType", new mf8.a("assetType", "TEXT", false, 0, null, 1));
            hashMap.put("lastModified", new mf8.a("lastModified", "TEXT", true, 0, null, 1));
            hashMap.put("url", new mf8.a("url", "TEXT", false, 0, null, 1));
            hashMap.put("downloadDate", new mf8.a("downloadDate", "TEXT", true, 0, null, 1));
            hashMap.put("jsonData", new mf8.a("jsonData", "TEXT", true, 0, null, 1));
            mf8 mf8Var = new mf8("assets", hashMap, new HashSet(0), new HashSet(0));
            mf8 a = mf8.a(sc8Var, "assets");
            if (!mf8Var.equals(a)) {
                return new g.c(false, "assets(com.nytimes.android.assetretriever.AssetEntity).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(9);
            hashMap2.put("id", new mf8.a("id", "INTEGER", true, 1, null, 1));
            hashMap2.put("requestedUri", new mf8.a("requestedUri", "TEXT", false, 0, null, 1));
            hashMap2.put("requestedUrl", new mf8.a("requestedUrl", "TEXT", false, 0, null, 1));
            hashMap2.put("requestedLastModified", new mf8.a("requestedLastModified", "TEXT", false, 0, null, 1));
            hashMap2.put("insertDate", new mf8.a("insertDate", "TEXT", true, 0, null, 1));
            hashMap2.put("attempts", new mf8.a("attempts", "INTEGER", true, 0, null, 1));
            hashMap2.put("nextAttempt", new mf8.a("nextAttempt", "TEXT", true, 0, null, 1));
            hashMap2.put("isRunning", new mf8.a("isRunning", "INTEGER", true, 0, null, 1));
            hashMap2.put("downloadedUri", new mf8.a("downloadedUri", "TEXT", false, 0, null, 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new mf8.c("assets", "CASCADE", "NO ACTION", Arrays.asList("downloadedUri"), Arrays.asList("uri")));
            HashSet hashSet2 = new HashSet(3);
            hashSet2.add(new mf8.e("index_requests_requestedUri", false, Arrays.asList("requestedUri"), Arrays.asList("ASC")));
            hashSet2.add(new mf8.e("index_requests_requestedUrl", false, Arrays.asList("requestedUrl"), Arrays.asList("ASC")));
            hashSet2.add(new mf8.e("index_requests_downloadedUri", false, Arrays.asList("downloadedUri"), Arrays.asList("ASC")));
            mf8 mf8Var2 = new mf8("requests", hashMap2, hashSet, hashSet2);
            mf8 a2 = mf8.a(sc8Var, "requests");
            if (!mf8Var2.equals(a2)) {
                return new g.c(false, "requests(com.nytimes.android.assetretriever.AssetRequestEntity).\n Expected:\n" + mf8Var2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(8);
            hashMap3.put("id", new mf8.a("id", "INTEGER", true, 1, null, 1));
            hashMap3.put("requestId", new mf8.a("requestId", "INTEGER", true, 0, null, 1));
            hashMap3.put(TransferTable.COLUMN_TYPE, new mf8.a(TransferTable.COLUMN_TYPE, "TEXT", true, 0, null, 1));
            hashMap3.put("insertDate", new mf8.a("insertDate", "TEXT", true, 0, null, 1));
            hashMap3.put("expirationDate", new mf8.a("expirationDate", "TEXT", false, 0, null, 1));
            hashMap3.put("externalId", new mf8.a("externalId", "INTEGER", false, 0, null, 1));
            hashMap3.put("additionalData", new mf8.a("additionalData", "TEXT", false, 0, null, 1));
            hashMap3.put(AppsFlyerProperties.USER_EMAIL, new mf8.a(AppsFlyerProperties.USER_EMAIL, "TEXT", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new mf8.c("requests", "CASCADE", "NO ACTION", Arrays.asList("requestId"), Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new mf8.e("index_sources_requestId", false, Arrays.asList("requestId"), Arrays.asList("ASC")));
            mf8 mf8Var3 = new mf8("sources", hashMap3, hashSet3, hashSet4);
            mf8 a3 = mf8.a(sc8Var, "sources");
            if (!mf8Var3.equals(a3)) {
                return new g.c(false, "sources(com.nytimes.android.assetretriever.AssetSourceEntity).\n Expected:\n" + mf8Var3 + "\n Found:\n" + a3);
            }
            ha9 ha9Var = new ha9("OpenRequest", "CREATE VIEW `OpenRequest` AS select requestedUri, requestedUrl, nextAttempt\n            from requests r\n        left outer join assets a on r.downloadedUri = a.uri\n        where \n            (r.downloadedUri is null or requestedLastModified > a.lastModified) and\n            isRunning = 0");
            ha9 a4 = ha9.a(sc8Var, "OpenRequest");
            if (ha9Var.equals(a4)) {
                return new g.c(true, null);
            }
            return new g.c(false, "OpenRequest(com.nytimes.android.assetretriever.OpenRequest).\n Expected:\n" + ha9Var + "\n Found:\n" + a4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("PRAGMA defer_foreign_keys = TRUE");
            o.B("DELETE FROM `assets`");
            o.B("DELETE FROM `requests`");
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
    protected androidx.room.d createInvalidationTracker() {
        HashMap hashMap = new HashMap(0);
        HashMap hashMap2 = new HashMap(1);
        HashSet hashSet = new HashSet(2);
        hashSet.add("requests");
        hashSet.add("assets");
        hashMap2.put("openrequest", hashSet);
        return new androidx.room.d(this, hashMap, hashMap2, "assets", "requests", "sources");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(androidx.room.a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new androidx.room.g(aVar, new a(5), "8c544169d9e1d60db8aa242a4ad3cff2", "1026ca444bdd0a50e11ed1a8335e9173")).b());
    }

    @Override // com.nytimes.android.assetretriever.AssetRetrieverDatabase
    public com.nytimes.android.assetretriever.a d() {
        com.nytimes.android.assetretriever.a aVar;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new c(this);
                }
                aVar = this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // com.nytimes.android.assetretriever.AssetRetrieverDatabase
    public i e() {
        i iVar;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new j(this);
                }
                iVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // com.nytimes.android.assetretriever.AssetRetrieverDatabase
    public tt f() {
        tt ttVar;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new ut(this);
                }
                ttVar = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ttVar;
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
        hashMap.put(com.nytimes.android.assetretriever.a.class, c.n());
        hashMap.put(tt.class, ut.j());
        hashMap.put(i.class, j.v());
        return hashMap;
    }
}
