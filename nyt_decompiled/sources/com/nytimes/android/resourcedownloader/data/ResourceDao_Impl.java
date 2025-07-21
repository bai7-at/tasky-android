package com.nytimes.android.resourcedownloader.data;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.resourcedownloader.data.ResourceDao;
import com.nytimes.android.resourcedownloader.data.ResourceDao_Impl;
import defpackage.gv6;
import defpackage.p27;
import defpackage.p48;
import defpackage.p51;
import defpackage.q41;
import defpackage.so;
import defpackage.ss2;
import defpackage.wc8;
import defpackage.ww8;
import defpackage.x12;
import defpackage.y12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ResourceDao_Impl implements ResourceDao {
    private final RoomDatabase __db;
    private final x12 __deletionAdapterOfResourceEntity;
    private final y12 __insertionAdapterOfResourceEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteResourcesWithNoSources;
    private final ResourceSourceConverter __resourceSourceConverter = new ResourceSourceConverter();

    public ResourceDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfResourceEntity = new y12(roomDatabase) { // from class: com.nytimes.android.resourcedownloader.data.ResourceDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `resources` (`url`,`date`,`expires`,`max-age`,`etag`,`fileName`) VALUES (?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // defpackage.y12
            public void bind(wc8 wc8Var, ResourceEntity resourceEntity) {
                if (resourceEntity.getUrl() == null) {
                    wc8Var.c1(1);
                } else {
                    wc8Var.v0(1, resourceEntity.getUrl());
                }
                InstantConverter instantConverter = InstantConverter.INSTANCE;
                String fromInstant = InstantConverter.fromInstant(resourceEntity.getDate());
                if (fromInstant == null) {
                    wc8Var.c1(2);
                } else {
                    wc8Var.v0(2, fromInstant);
                }
                String fromInstant2 = InstantConverter.fromInstant(resourceEntity.getExpires());
                if (fromInstant2 == null) {
                    wc8Var.c1(3);
                } else {
                    wc8Var.v0(3, fromInstant2);
                }
                if (resourceEntity.getMaxAgeSeconds() == null) {
                    wc8Var.c1(4);
                } else {
                    wc8Var.L0(4, resourceEntity.getMaxAgeSeconds().longValue());
                }
                if (resourceEntity.getEtag() == null) {
                    wc8Var.c1(5);
                } else {
                    wc8Var.v0(5, resourceEntity.getEtag());
                }
                if (resourceEntity.getFileName() == null) {
                    wc8Var.c1(6);
                } else {
                    wc8Var.v0(6, resourceEntity.getFileName());
                }
            }
        };
        this.__deletionAdapterOfResourceEntity = new x12(roomDatabase) { // from class: com.nytimes.android.resourcedownloader.data.ResourceDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `resources` WHERE `url` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // defpackage.x12
            public void bind(wc8 wc8Var, ResourceEntity resourceEntity) {
                if (resourceEntity.getUrl() == null) {
                    wc8Var.c1(1);
                } else {
                    wc8Var.v0(1, resourceEntity.getUrl());
                }
            }
        };
        this.__preparedStmtOfDeleteResourcesWithNoSources = new SharedSQLiteStatement(roomDatabase) { // from class: com.nytimes.android.resourcedownloader.data.ResourceDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "\n        delete from resources where not exists (\n            select 1 from sources where resources.url = sources.url\n        )\n    ";
            }
        };
    }

    private void __fetchRelationshipsourcesAscomNytimesAndroidResourcedownloaderDataResourceSourceEntity(so soVar) {
        ArrayList arrayList;
        Set<String> keySet = soVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (soVar.size() > 999) {
            gv6.a(soVar, true, new ss2() { // from class: hz6
                @Override // defpackage.ss2
                public final Object invoke(Object obj) {
                    ww8 lambda$__fetchRelationshipsourcesAscomNytimesAndroidResourcedownloaderDataResourceSourceEntity$0;
                    lambda$__fetchRelationshipsourcesAscomNytimesAndroidResourcedownloaderDataResourceSourceEntity$0 = ResourceDao_Impl.this.lambda$__fetchRelationshipsourcesAscomNytimesAndroidResourcedownloaderDataResourceSourceEntity$0((so) obj);
                    return lambda$__fetchRelationshipsourcesAscomNytimesAndroidResourcedownloaderDataResourceSourceEntity$0;
                }
            });
            return;
        }
        StringBuilder b = p48.b();
        b.append("SELECT `id`,`url`,`source` FROM `sources` WHERE `url` IN (");
        int size = keySet.size();
        p48.a(b, size);
        b.append(")");
        p27 d = p27.d(b.toString(), size);
        int i = 1;
        for (String str : keySet) {
            if (str == null) {
                d.c1(i);
            } else {
                d.v0(i, str);
            }
            i++;
        }
        Cursor c = p51.c(this.__db, d, false, null);
        try {
            int c2 = q41.c(c, "url");
            if (c2 == -1) {
                return;
            }
            while (c.moveToNext()) {
                String string = c.isNull(c2) ? null : c.getString(c2);
                if (string != null && (arrayList = (ArrayList) soVar.get(string)) != null) {
                    arrayList.add(new ResourceSourceEntity(c.getLong(0), c.isNull(1) ? null : c.getString(1), this.__resourceSourceConverter.fromString(c.isNull(2) ? null : c.getString(2))));
                }
            }
        } finally {
            c.close();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ww8 lambda$__fetchRelationshipsourcesAscomNytimesAndroidResourcedownloaderDataResourceSourceEntity$0(so soVar) {
        __fetchRelationshipsourcesAscomNytimesAndroidResourcedownloaderDataResourceSourceEntity(soVar);
        return ww8.a;
    }

    @Override // com.nytimes.android.resourcedownloader.data.ResourceDao
    public void delete(ResourceEntity resourceEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfResourceEntity.handle(resourceEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.nytimes.android.resourcedownloader.data.ResourceDao
    public int deleteResourcesWithNoSources() {
        this.__db.assertNotSuspendingTransaction();
        wc8 acquire = this.__preparedStmtOfDeleteResourcesWithNoSources.acquire();
        try {
            this.__db.beginTransaction();
            try {
                int E = acquire.E();
                this.__db.setTransactionSuccessful();
                return E;
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteResourcesWithNoSources.release(acquire);
        }
    }

    @Override // com.nytimes.android.resourcedownloader.data.ResourceDao
    public List<String> getAndDeleteResourcesWithNoSources() {
        this.__db.beginTransaction();
        try {
            List<String> andDeleteResourcesWithNoSources = ResourceDao.DefaultImpls.getAndDeleteResourcesWithNoSources(this);
            this.__db.setTransactionSuccessful();
            return andDeleteResourcesWithNoSources;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.nytimes.android.resourcedownloader.data.ResourceDao
    public List<ResourceWithSources> getResourceWithSources() {
        p27 d = p27.d("SELECT * FROM resources", 0);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor c = p51.c(this.__db, d, true, null);
            try {
                int d2 = q41.d(c, "url");
                int d3 = q41.d(c, "date");
                int d4 = q41.d(c, "expires");
                int d5 = q41.d(c, "max-age");
                int d6 = q41.d(c, TransferTable.COLUMN_ETAG);
                int d7 = q41.d(c, "fileName");
                so soVar = new so();
                while (c.moveToNext()) {
                    String string = c.isNull(d2) ? null : c.getString(d2);
                    if (string != null && !soVar.containsKey(string)) {
                        soVar.put(string, new ArrayList());
                    }
                }
                c.moveToPosition(-1);
                __fetchRelationshipsourcesAscomNytimesAndroidResourcedownloaderDataResourceSourceEntity(soVar);
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    ResourceEntity resourceEntity = new ResourceEntity(c.isNull(d2) ? null : c.getString(d2), InstantConverter.toInstant(c.isNull(d3) ? null : c.getString(d3)), InstantConverter.toInstant(c.isNull(d4) ? null : c.getString(d4)), c.isNull(d5) ? null : Long.valueOf(c.getLong(d5)), c.isNull(d6) ? null : c.getString(d6), c.isNull(d7) ? null : c.getString(d7));
                    String string2 = c.isNull(d2) ? null : c.getString(d2);
                    arrayList.add(new ResourceWithSources(resourceEntity, string2 != null ? (ArrayList) soVar.get(string2) : new ArrayList()));
                }
                this.__db.setTransactionSuccessful();
                c.close();
                d.release();
                return arrayList;
            } catch (Throwable th) {
                c.close();
                d.release();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.nytimes.android.resourcedownloader.data.ResourceDao
    public List<String> getUrlsWithNoSources() {
        p27 d = p27.d("\n        SELECT url FROM resources\n        WHERE NOT EXISTS (\n            SELECT 1 FROM sources WHERE resources.url = sources.url\n        )\n        ", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor c = p51.c(this.__db, d, false, null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(c.isNull(0) ? null : c.getString(0));
            }
            return arrayList;
        } finally {
            c.close();
            d.release();
        }
    }

    @Override // com.nytimes.android.resourcedownloader.data.ResourceDao
    public long insertResource(ResourceEntity resourceEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfResourceEntity.insertAndReturnId(resourceEntity);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.nytimes.android.resourcedownloader.data.ResourceDao
    public ResourceEntity selectResourceByUrl(String str) {
        p27 d = p27.d("SELECT * FROM resources WHERE url = ?", 1);
        if (str == null) {
            d.c1(1);
        } else {
            d.v0(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        ResourceEntity resourceEntity = null;
        Cursor c = p51.c(this.__db, d, false, null);
        try {
            int d2 = q41.d(c, "url");
            int d3 = q41.d(c, "date");
            int d4 = q41.d(c, "expires");
            int d5 = q41.d(c, "max-age");
            int d6 = q41.d(c, TransferTable.COLUMN_ETAG);
            int d7 = q41.d(c, "fileName");
            if (c.moveToFirst()) {
                resourceEntity = new ResourceEntity(c.isNull(d2) ? null : c.getString(d2), InstantConverter.toInstant(c.isNull(d3) ? null : c.getString(d3)), InstantConverter.toInstant(c.isNull(d4) ? null : c.getString(d4)), c.isNull(d5) ? null : Long.valueOf(c.getLong(d5)), c.isNull(d6) ? null : c.getString(d6), c.isNull(d7) ? null : c.getString(d7));
            }
            return resourceEntity;
        } finally {
            c.close();
            d.release();
        }
    }
}
