package com.nytimes.android.comments.writenewcomment.data.repository;

import com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDatabase;
import com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore;
import com.nytimes.android.comments.writenewcomment.data.remote.getuser.GetCurrentUserRemoteDataSource;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class WriteNewCommentRepository_Factory implements ba2 {
    private final p76 draftCommentDatabaseProvider;
    private final p76 getCurrentUserDataSourceProvider;
    private final p76 writeNewCommentPreferencesDataStoreProvider;
    private final p76 writeNewCommentRemoteDataSourceProvider;

    public WriteNewCommentRepository_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.writeNewCommentPreferencesDataStoreProvider = p76Var;
        this.draftCommentDatabaseProvider = p76Var2;
        this.writeNewCommentRemoteDataSourceProvider = p76Var3;
        this.getCurrentUserDataSourceProvider = p76Var4;
    }

    public static WriteNewCommentRepository_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new WriteNewCommentRepository_Factory(p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static WriteNewCommentRepository newInstance(WriteNewCommentPreferencesDataStore writeNewCommentPreferencesDataStore, DraftCommentDatabase draftCommentDatabase, WriteNewCommentRemoteDataSource writeNewCommentRemoteDataSource, GetCurrentUserRemoteDataSource getCurrentUserRemoteDataSource) {
        return new WriteNewCommentRepository(writeNewCommentPreferencesDataStore, draftCommentDatabase, writeNewCommentRemoteDataSource, getCurrentUserRemoteDataSource);
    }

    @Override // defpackage.p76
    public WriteNewCommentRepository get() {
        return newInstance((WriteNewCommentPreferencesDataStore) this.writeNewCommentPreferencesDataStoreProvider.get(), (DraftCommentDatabase) this.draftCommentDatabaseProvider.get(), (WriteNewCommentRemoteDataSource) this.writeNewCommentRemoteDataSourceProvider.get(), (GetCurrentUserRemoteDataSource) this.getCurrentUserDataSourceProvider.get());
    }
}
