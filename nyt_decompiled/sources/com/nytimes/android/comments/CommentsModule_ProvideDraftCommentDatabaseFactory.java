package com.nytimes.android.comments;

import android.app.Application;
import com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDatabase;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class CommentsModule_ProvideDraftCommentDatabaseFactory implements ba2 {
    private final p76 applicationProvider;

    public CommentsModule_ProvideDraftCommentDatabaseFactory(p76 p76Var) {
        this.applicationProvider = p76Var;
    }

    public static CommentsModule_ProvideDraftCommentDatabaseFactory create(p76 p76Var) {
        return new CommentsModule_ProvideDraftCommentDatabaseFactory(p76Var);
    }

    public static DraftCommentDatabase provideDraftCommentDatabase(Application application) {
        return (DraftCommentDatabase) g16.e(CommentsModule.INSTANCE.provideDraftCommentDatabase(application));
    }

    @Override // defpackage.p76
    public DraftCommentDatabase get() {
        return provideDraftCommentDatabase((Application) this.applicationProvider.get());
    }
}
