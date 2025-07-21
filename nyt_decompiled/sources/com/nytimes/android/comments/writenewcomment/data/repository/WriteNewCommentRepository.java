package com.nytimes.android.comments.writenewcomment.data.repository;

import com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDatabase;
import com.nytimes.android.comments.writenewcomment.data.db.DraftCommentEntity;
import com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore;
import com.nytimes.android.comments.writenewcomment.data.remote.getuser.GetCurrentUserRemoteDataSource;
import com.nytimes.android.comments.writenewcomment.data.remote.getuser.User;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentBody;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource;
import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class WriteNewCommentRepository {
    public static final int $stable = 8;
    private final DraftCommentDatabase draftCommentDatabase;
    private final GetCurrentUserRemoteDataSource getCurrentUserDataSource;
    private final WriteNewCommentPreferencesDataStore writeNewCommentPreferencesDataStore;
    private final WriteNewCommentRemoteDataSource writeNewCommentRemoteDataSource;

    public WriteNewCommentRepository(WriteNewCommentPreferencesDataStore writeNewCommentPreferencesDataStore, DraftCommentDatabase draftCommentDatabase, WriteNewCommentRemoteDataSource writeNewCommentRemoteDataSource, GetCurrentUserRemoteDataSource getCurrentUserRemoteDataSource) {
        zq3.h(writeNewCommentPreferencesDataStore, "writeNewCommentPreferencesDataStore");
        zq3.h(draftCommentDatabase, "draftCommentDatabase");
        zq3.h(writeNewCommentRemoteDataSource, "writeNewCommentRemoteDataSource");
        zq3.h(getCurrentUserRemoteDataSource, "getCurrentUserDataSource");
        this.writeNewCommentPreferencesDataStore = writeNewCommentPreferencesDataStore;
        this.draftCommentDatabase = draftCommentDatabase;
        this.writeNewCommentRemoteDataSource = writeNewCommentRemoteDataSource;
        this.getCurrentUserDataSource = getCurrentUserRemoteDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getCurrentUser(by0<? super FetchResult<User>> by0Var) {
        return this.getCurrentUserDataSource.getCurrentUser(by0Var);
    }

    private final Flow<DraftCommentEntity> getDraftComment(String str, long j) {
        return this.draftCommentDatabase.draftCommentDao().get(str, j);
    }

    public final Object discardDraftComment(String str, long j, by0<? super ww8> by0Var) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new WriteNewCommentRepository$discardDraftComment$2(this, str, j, null), by0Var);
        return withContext == a.h() ? withContext : ww8.a;
    }

    public final Flow<CommenterDetails> getCommenterPreferences(String str, long j) {
        return FlowKt.combine(str != null ? getDraftComment(str, j) : FlowKt.emptyFlow(), this.writeNewCommentPreferencesDataStore.getCommenterPreferencesFlow(), new WriteNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1(this, null));
    }

    public final Object saveDraftComment(String str, long j, String str2, by0<? super Long> by0Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WriteNewCommentRepository$saveDraftComment$2(str, j, str2, this, null), by0Var);
    }

    public final Object submitNewComment(String str, String str2, String str3, String str4, boolean z, long j, by0<? super Flow<? extends SubmitNewCommentResult>> by0Var) {
        return this.writeNewCommentRemoteDataSource.submitNewComment(new WriteNewCommentBody(str2, str3, str4, str, z, j), by0Var);
    }

    public final Object updateCommenterPreferences(CommenterPreferences commenterPreferences, by0<? super ww8> by0Var) {
        Object updateCommenterPreferences = this.writeNewCommentPreferencesDataStore.updateCommenterPreferences(commenterPreferences, by0Var);
        return updateCommenterPreferences == a.h() ? updateCommenterPreferences : ww8.a;
    }
}
