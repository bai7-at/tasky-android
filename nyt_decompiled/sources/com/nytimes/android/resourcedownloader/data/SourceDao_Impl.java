package com.nytimes.android.resourcedownloader.data;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import defpackage.p27;
import defpackage.p51;
import defpackage.q41;
import defpackage.wc8;
import defpackage.y12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SourceDao_Impl implements SourceDao {
    private final RoomDatabase __db;
    private final y12 __insertionAdapterOfResourceSourceEntity;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final ResourceSourceConverter __resourceSourceConverter = new ResourceSourceConverter();

    public SourceDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfResourceSourceEntity = new y12(roomDatabase) { // from class: com.nytimes.android.resourcedownloader.data.SourceDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `sources` (`id`,`url`,`source`) VALUES (nullif(?, 0),?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // defpackage.y12
            public void bind(wc8 wc8Var, ResourceSourceEntity resourceSourceEntity) {
                wc8Var.L0(1, resourceSourceEntity.getId());
                if (resourceSourceEntity.getResourceEntityUrl() == null) {
                    wc8Var.c1(2);
                } else {
                    wc8Var.v0(2, resourceSourceEntity.getResourceEntityUrl());
                }
                String stringValue = SourceDao_Impl.this.__resourceSourceConverter.toStringValue(resourceSourceEntity.getResourceSource());
                if (stringValue == null) {
                    wc8Var.c1(3);
                } else {
                    wc8Var.v0(3, stringValue);
                }
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) { // from class: com.nytimes.android.resourcedownloader.data.SourceDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM sources WHERE id = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.nytimes.android.resourcedownloader.data.SourceDao
    public void delete(long j) {
        this.__db.assertNotSuspendingTransaction();
        wc8 acquire = this.__preparedStmtOfDelete.acquire();
        acquire.L0(1, j);
        try {
            this.__db.beginTransaction();
            try {
                acquire.E();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // com.nytimes.android.resourcedownloader.data.SourceDao
    public List<ResourceSourceEntity> getAll() {
        p27 d = p27.d("SELECT * FROM sources", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor c = p51.c(this.__db, d, false, null);
        try {
            int d2 = q41.d(c, "id");
            int d3 = q41.d(c, "url");
            int d4 = q41.d(c, "source");
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(new ResourceSourceEntity(c.getLong(d2), c.isNull(d3) ? null : c.getString(d3), this.__resourceSourceConverter.fromString(c.isNull(d4) ? null : c.getString(d4))));
            }
            return arrayList;
        } finally {
            c.close();
            d.release();
        }
    }

    @Override // com.nytimes.android.resourcedownloader.data.SourceDao
    public long insertSource(ResourceSourceEntity resourceSourceEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfResourceSourceEntity.insertAndReturnId(resourceSourceEntity);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.nytimes.android.resourcedownloader.data.SourceDao
    public List<ResourceSourceEntity> selectAllByResourceUrl(String str) {
        p27 d = p27.d("SELECT * FROM sources where url = ?", 1);
        if (str == null) {
            d.c1(1);
        } else {
            d.v0(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor c = p51.c(this.__db, d, false, null);
        try {
            int d2 = q41.d(c, "id");
            int d3 = q41.d(c, "url");
            int d4 = q41.d(c, "source");
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(new ResourceSourceEntity(c.getLong(d2), c.isNull(d3) ? null : c.getString(d3), this.__resourceSourceConverter.fromString(c.isNull(d4) ? null : c.getString(d4))));
            }
            return arrayList;
        } finally {
            c.close();
            d.release();
        }
    }
}
