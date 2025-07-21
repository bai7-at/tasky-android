package com.nytimes.android.subauth.core.database;

import androidx.room.RoomDatabase;
import androidx.room.g;
import com.facebook.AuthenticationTokenClaims;
import defpackage.hy0;
import defpackage.iy0;
import defpackage.mf8;
import defpackage.nu7;
import defpackage.oz8;
import defpackage.p51;
import defpackage.pu7;
import defpackage.pz8;
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
public final class SubauthDatabase_Impl extends SubauthDatabase {
    private volatile hy0 _cookieDao;
    private volatile nu7 _skuPurchaseDao;
    private volatile oz8 _userDataDao;

    class a extends g.b {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.g.b
        public void createAllTables(sc8 sc8Var) {
            sc8Var.B("CREATE TABLE IF NOT EXISTS `Cookie` (`id` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`id`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `SkuPurchase` (`sku` TEXT NOT NULL, `receipt` TEXT, `packageName` TEXT, `campaignCode` TEXT, `orderId` TEXT, `purchaseTime` INTEGER, `isAutoRenewing` INTEGER, `originalJson` TEXT, PRIMARY KEY(`sku`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `UserData` (`userId` INTEGER NOT NULL, `subscriptions` TEXT NOT NULL, `regiId` TEXT, `email` TEXT, `displayName` TEXT, `name` TEXT, `givenName` TEXT, `familyName` TEXT, `username` TEXT, `gamesUsername` TEXT, `gamesAvatarIcon` TEXT, `entitlements` TEXT NOT NULL, `provisionalExpirationDate` INTEGER, PRIMARY KEY(`userId`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `Entitlement` (`entitlementKey` TEXT NOT NULL, `clientKey` TEXT NOT NULL, PRIMARY KEY(`entitlementKey`, `clientKey`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `User` (`regiId` TEXT NOT NULL, `email` TEXT NOT NULL, PRIMARY KEY(`regiId`))");
            sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6cda6d8bd8b54ad0fb8fba09e36d7f8f')");
        }

        @Override // androidx.room.g.b
        public void dropAllTables(sc8 sc8Var) {
            sc8Var.B("DROP TABLE IF EXISTS `Cookie`");
            sc8Var.B("DROP TABLE IF EXISTS `SkuPurchase`");
            sc8Var.B("DROP TABLE IF EXISTS `UserData`");
            sc8Var.B("DROP TABLE IF EXISTS `Entitlement`");
            sc8Var.B("DROP TABLE IF EXISTS `User`");
            List list = ((RoomDatabase) SubauthDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).b(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onCreate(sc8 sc8Var) {
            List list = ((RoomDatabase) SubauthDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.b) it2.next()).a(sc8Var);
                }
            }
        }

        @Override // androidx.room.g.b
        public void onOpen(sc8 sc8Var) {
            ((RoomDatabase) SubauthDatabase_Impl.this).mDatabase = sc8Var;
            SubauthDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
            List list = ((RoomDatabase) SubauthDatabase_Impl.this).mCallbacks;
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
            hashMap.put("id", new mf8.a("id", "TEXT", true, 1, null, 1));
            hashMap.put("value", new mf8.a("value", "TEXT", true, 0, null, 1));
            mf8 mf8Var = new mf8(co.datadome.sdk.c.HTTP_HEADER_COOKIE, hashMap, new HashSet(0), new HashSet(0));
            mf8 a = mf8.a(sc8Var, co.datadome.sdk.c.HTTP_HEADER_COOKIE);
            if (!mf8Var.equals(a)) {
                return new g.c(false, "Cookie(com.nytimes.android.subauth.core.database.cookies.Cookie).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(8);
            hashMap2.put("sku", new mf8.a("sku", "TEXT", true, 1, null, 1));
            hashMap2.put("receipt", new mf8.a("receipt", "TEXT", false, 0, null, 1));
            hashMap2.put("packageName", new mf8.a("packageName", "TEXT", false, 0, null, 1));
            hashMap2.put("campaignCode", new mf8.a("campaignCode", "TEXT", false, 0, null, 1));
            hashMap2.put("orderId", new mf8.a("orderId", "TEXT", false, 0, null, 1));
            hashMap2.put("purchaseTime", new mf8.a("purchaseTime", "INTEGER", false, 0, null, 1));
            hashMap2.put("isAutoRenewing", new mf8.a("isAutoRenewing", "INTEGER", false, 0, null, 1));
            hashMap2.put("originalJson", new mf8.a("originalJson", "TEXT", false, 0, null, 1));
            mf8 mf8Var2 = new mf8("SkuPurchase", hashMap2, new HashSet(0), new HashSet(0));
            mf8 a2 = mf8.a(sc8Var, "SkuPurchase");
            if (!mf8Var2.equals(a2)) {
                return new g.c(false, "SkuPurchase(com.nytimes.android.subauth.core.database.purchase.SkuPurchase).\n Expected:\n" + mf8Var2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(13);
            hashMap3.put("userId", new mf8.a("userId", "INTEGER", true, 1, null, 1));
            hashMap3.put("subscriptions", new mf8.a("subscriptions", "TEXT", true, 0, null, 1));
            hashMap3.put("regiId", new mf8.a("regiId", "TEXT", false, 0, null, 1));
            hashMap3.put("email", new mf8.a("email", "TEXT", false, 0, null, 1));
            hashMap3.put("displayName", new mf8.a("displayName", "TEXT", false, 0, null, 1));
            hashMap3.put(AuthenticationTokenClaims.JSON_KEY_NAME, new mf8.a(AuthenticationTokenClaims.JSON_KEY_NAME, "TEXT", false, 0, null, 1));
            hashMap3.put("givenName", new mf8.a("givenName", "TEXT", false, 0, null, 1));
            hashMap3.put("familyName", new mf8.a("familyName", "TEXT", false, 0, null, 1));
            hashMap3.put("username", new mf8.a("username", "TEXT", false, 0, null, 1));
            hashMap3.put("gamesUsername", new mf8.a("gamesUsername", "TEXT", false, 0, null, 1));
            hashMap3.put("gamesAvatarIcon", new mf8.a("gamesAvatarIcon", "TEXT", false, 0, null, 1));
            hashMap3.put("entitlements", new mf8.a("entitlements", "TEXT", true, 0, null, 1));
            hashMap3.put("provisionalExpirationDate", new mf8.a("provisionalExpirationDate", "INTEGER", false, 0, null, 1));
            mf8 mf8Var3 = new mf8("UserData", hashMap3, new HashSet(0), new HashSet(0));
            mf8 a3 = mf8.a(sc8Var, "UserData");
            if (!mf8Var3.equals(a3)) {
                return new g.c(false, "UserData(com.nytimes.android.subauth.core.database.userdata.UserData).\n Expected:\n" + mf8Var3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("entitlementKey", new mf8.a("entitlementKey", "TEXT", true, 1, null, 1));
            hashMap4.put("clientKey", new mf8.a("clientKey", "TEXT", true, 2, null, 1));
            mf8 mf8Var4 = new mf8("Entitlement", hashMap4, new HashSet(0), new HashSet(0));
            mf8 a4 = mf8.a(sc8Var, "Entitlement");
            if (!mf8Var4.equals(a4)) {
                return new g.c(false, "Entitlement(com.nytimes.android.subauth.core.database.deprecated.Entitlement).\n Expected:\n" + mf8Var4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("regiId", new mf8.a("regiId", "TEXT", true, 1, null, 1));
            hashMap5.put("email", new mf8.a("email", "TEXT", true, 0, null, 1));
            mf8 mf8Var5 = new mf8("User", hashMap5, new HashSet(0), new HashSet(0));
            mf8 a5 = mf8.a(sc8Var, "User");
            if (mf8Var5.equals(a5)) {
                return new g.c(true, null);
            }
            return new g.c(false, "User(com.nytimes.android.subauth.core.database.deprecated.User).\n Expected:\n" + mf8Var5 + "\n Found:\n" + a5);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("DELETE FROM `Cookie`");
            o.B("DELETE FROM `SkuPurchase`");
            o.B("DELETE FROM `UserData`");
            o.B("DELETE FROM `Entitlement`");
            o.B("DELETE FROM `User`");
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
        return new androidx.room.d(this, new HashMap(0), new HashMap(0), co.datadome.sdk.c.HTTP_HEADER_COOKIE, "SkuPurchase", "UserData", "Entitlement", "User");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(androidx.room.a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new g(aVar, new a(6), "6cda6d8bd8b54ad0fb8fba09e36d7f8f", "2368293470fe15f3749e030ad4a493b7")).b());
    }

    @Override // com.nytimes.android.subauth.core.database.SubauthDatabase
    public hy0 d() {
        hy0 hy0Var;
        if (this._cookieDao != null) {
            return this._cookieDao;
        }
        synchronized (this) {
            try {
                if (this._cookieDao == null) {
                    this._cookieDao = new iy0(this);
                }
                hy0Var = this._cookieDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hy0Var;
    }

    @Override // com.nytimes.android.subauth.core.database.SubauthDatabase
    public nu7 e() {
        nu7 nu7Var;
        if (this._skuPurchaseDao != null) {
            return this._skuPurchaseDao;
        }
        synchronized (this) {
            try {
                if (this._skuPurchaseDao == null) {
                    this._skuPurchaseDao = new pu7(this);
                }
                nu7Var = this._skuPurchaseDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nu7Var;
    }

    @Override // com.nytimes.android.subauth.core.database.SubauthDatabase
    public oz8 f() {
        oz8 oz8Var;
        if (this._userDataDao != null) {
            return this._userDataDao;
        }
        synchronized (this) {
            try {
                if (this._userDataDao == null) {
                    this._userDataDao = new pz8(this);
                }
                oz8Var = this._userDataDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oz8Var;
    }

    @Override // androidx.room.RoomDatabase
    public List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.nytimes.android.subauth.core.database.a());
        arrayList.add(new b());
        arrayList.add(new c());
        arrayList.add(new d());
        arrayList.add(new e());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(hy0.class, iy0.h());
        hashMap.put(nu7.class, pu7.l());
        hashMap.put(oz8.class, pz8.l());
        return hashMap;
    }
}
