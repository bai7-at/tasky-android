package com.nytimes.android.comments.writenewcomment.data.db;

import androidx.room.RoomDatabase;
import androidx.room.a;
import androidx.room.d;
import androidx.room.g;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel;
import defpackage.c00;
import defpackage.mf8;
import defpackage.p51;
import defpackage.sc8;
import defpackage.tc8;
import defpackage.wt4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class DraftCommentDatabase_Impl extends DraftCommentDatabase {
    private volatile DraftCommentDao _draftCommentDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        sc8 o = super.getOpenHelper().o();
        try {
            super.beginTransaction();
            o.B("DELETE FROM `draft_comment`");
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
        return new d(this, new HashMap(0), new HashMap(0), "draft_comment");
    }

    @Override // androidx.room.RoomDatabase
    protected tc8 createOpenHelper(a aVar) {
        return aVar.c.a(tc8.b.a(aVar.a).d(aVar.b).c(new g(aVar, new g.b(1) { // from class: com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDatabase_Impl.1
            @Override // androidx.room.g.b
            public void createAllTables(sc8 sc8Var) {
                sc8Var.B("CREATE TABLE IF NOT EXISTS `draft_comment` (`articleUrl` TEXT NOT NULL, `parentCommentId` INTEGER NOT NULL, `content` TEXT NOT NULL, PRIMARY KEY(`articleUrl`, `parentCommentId`))");
                sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                sc8Var.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '66b68b4e90d4765624fff6d17603b2a7')");
            }

            @Override // androidx.room.g.b
            public void dropAllTables(sc8 sc8Var) {
                sc8Var.B("DROP TABLE IF EXISTS `draft_comment`");
                List list = ((RoomDatabase) DraftCommentDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((RoomDatabase.b) it2.next()).b(sc8Var);
                    }
                }
            }

            @Override // androidx.room.g.b
            public void onCreate(sc8 sc8Var) {
                List list = ((RoomDatabase) DraftCommentDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((RoomDatabase.b) it2.next()).a(sc8Var);
                    }
                }
            }

            @Override // androidx.room.g.b
            public void onOpen(sc8 sc8Var) {
                ((RoomDatabase) DraftCommentDatabase_Impl.this).mDatabase = sc8Var;
                DraftCommentDatabase_Impl.this.internalInitInvalidationTracker(sc8Var);
                List list = ((RoomDatabase) DraftCommentDatabase_Impl.this).mCallbacks;
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
                HashMap hashMap = new HashMap(3);
                hashMap.put("articleUrl", new mf8.a("articleUrl", "TEXT", true, 1, null, 1));
                hashMap.put(WriteNewCommentViewModel.WRITE_NEW_COMMENT_PARENT_COMMENT_ID, new mf8.a(WriteNewCommentViewModel.WRITE_NEW_COMMENT_PARENT_COMMENT_ID, "INTEGER", true, 2, null, 1));
                hashMap.put("content", new mf8.a("content", "TEXT", true, 0, null, 1));
                mf8 mf8Var = new mf8("draft_comment", hashMap, new HashSet(0), new HashSet(0));
                mf8 a = mf8.a(sc8Var, "draft_comment");
                if (mf8Var.equals(a)) {
                    return new g.c(true, null);
                }
                return new g.c(false, "draft_comment(com.nytimes.android.comments.writenewcomment.data.db.DraftCommentEntity).\n Expected:\n" + mf8Var + "\n Found:\n" + a);
            }
        }, "66b68b4e90d4765624fff6d17603b2a7", "b33160056f712e76ef74dfe3dd2eba7c")).b());
    }

    @Override // com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDatabase
    public DraftCommentDao draftCommentDao() {
        DraftCommentDao draftCommentDao;
        if (this._draftCommentDao != null) {
            return this._draftCommentDao;
        }
        synchronized (this) {
            try {
                if (this._draftCommentDao == null) {
                    this._draftCommentDao = new DraftCommentDao_Impl(this);
                }
                draftCommentDao = this._draftCommentDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return draftCommentDao;
    }

    @Override // androidx.room.RoomDatabase
    public List<wt4> getAutoMigrations(Map<Class<? extends c00>, c00> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends c00>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(DraftCommentDao.class, DraftCommentDao_Impl.getRequiredConverters());
        return hashMap;
    }
}
