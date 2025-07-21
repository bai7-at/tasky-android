package com.nytimes.android.comments.writenewcomment.data.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel;
import defpackage.p27;
import defpackage.p51;
import defpackage.q41;
import defpackage.wc8;
import defpackage.y12;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class DraftCommentDao_Impl implements DraftCommentDao {
    private final RoomDatabase __db;
    private final y12 __insertionAdapterOfDraftCommentEntity;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public DraftCommentDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDraftCommentEntity = new y12(roomDatabase) { // from class: com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `draft_comment` (`articleUrl`,`parentCommentId`,`content`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // defpackage.y12
            public void bind(wc8 wc8Var, DraftCommentEntity draftCommentEntity) {
                if (draftCommentEntity.getArticleUrl() == null) {
                    wc8Var.c1(1);
                } else {
                    wc8Var.v0(1, draftCommentEntity.getArticleUrl());
                }
                wc8Var.L0(2, draftCommentEntity.getParentCommentId());
                if (draftCommentEntity.getContent() == null) {
                    wc8Var.c1(3);
                } else {
                    wc8Var.v0(3, draftCommentEntity.getContent());
                }
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) { // from class: com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM draft_comment WHERE articleUrl = ? AND parentCommentId = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(roomDatabase) { // from class: com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM draft_comment";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDao
    public void delete(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        wc8 acquire = this.__preparedStmtOfDelete.acquire();
        if (str == null) {
            acquire.c1(1);
        } else {
            acquire.v0(1, str);
        }
        acquire.L0(2, j);
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

    @Override // com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        wc8 acquire = this.__preparedStmtOfDeleteAll.acquire();
        try {
            this.__db.beginTransaction();
            try {
                acquire.E();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteAll.release(acquire);
        }
    }

    @Override // com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDao
    public Flow<DraftCommentEntity> get(String str, long j) {
        final p27 d = p27.d("SELECT * FROM draft_comment WHERE articleUrl = ? AND parentCommentId = ?", 2);
        if (str == null) {
            d.c1(1);
        } else {
            d.v0(1, str);
        }
        d.L0(2, j);
        return CoroutinesRoom.a(this.__db, false, new String[]{"draft_comment"}, new Callable<DraftCommentEntity>() { // from class: com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDao_Impl.4
            protected void finalize() {
                d.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DraftCommentEntity call() throws Exception {
                DraftCommentEntity draftCommentEntity = null;
                String string = null;
                Cursor c = p51.c(DraftCommentDao_Impl.this.__db, d, false, null);
                try {
                    int d2 = q41.d(c, "articleUrl");
                    int d3 = q41.d(c, WriteNewCommentViewModel.WRITE_NEW_COMMENT_PARENT_COMMENT_ID);
                    int d4 = q41.d(c, "content");
                    if (c.moveToFirst()) {
                        String string2 = c.isNull(d2) ? null : c.getString(d2);
                        long j2 = c.getLong(d3);
                        if (!c.isNull(d4)) {
                            string = c.getString(d4);
                        }
                        draftCommentEntity = new DraftCommentEntity(string2, j2, string);
                    }
                    return draftCommentEntity;
                } finally {
                    c.close();
                }
            }
        });
    }

    @Override // com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDao
    public long insert(DraftCommentEntity draftCommentEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfDraftCommentEntity.insertAndReturnId(draftCommentEntity);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }
}
