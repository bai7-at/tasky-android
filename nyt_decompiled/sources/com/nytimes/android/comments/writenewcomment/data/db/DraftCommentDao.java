package com.nytimes.android.comments.writenewcomment.data.db;

import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface DraftCommentDao {
    void delete(String str, long j);

    void deleteAll();

    Flow<DraftCommentEntity> get(String str, long j);

    long insert(DraftCommentEntity draftCommentEntity);
}
