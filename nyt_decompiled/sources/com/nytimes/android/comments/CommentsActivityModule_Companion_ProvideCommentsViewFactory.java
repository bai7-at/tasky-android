package com.nytimes.android.comments;

import android.app.Activity;
import com.nytimes.android.comments.comments.data.store.CommentsStore;
import com.nytimes.android.comments.menu.view.MenuCommentsView;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class CommentsActivityModule_Companion_ProvideCommentsViewFactory implements ba2 {
    private final p76 activityProvider;
    private final p76 commentsStoreProvider;

    public CommentsActivityModule_Companion_ProvideCommentsViewFactory(p76 p76Var, p76 p76Var2) {
        this.activityProvider = p76Var;
        this.commentsStoreProvider = p76Var2;
    }

    public static CommentsActivityModule_Companion_ProvideCommentsViewFactory create(p76 p76Var, p76 p76Var2) {
        return new CommentsActivityModule_Companion_ProvideCommentsViewFactory(p76Var, p76Var2);
    }

    public static MenuCommentsView provideCommentsView(Activity activity, CommentsStore commentsStore) {
        return (MenuCommentsView) g16.e(CommentsActivityModule.Companion.provideCommentsView(activity, commentsStore));
    }

    @Override // defpackage.p76
    public MenuCommentsView get() {
        return provideCommentsView((Activity) this.activityProvider.get(), (CommentsStore) this.commentsStoreProvider.get());
    }
}
