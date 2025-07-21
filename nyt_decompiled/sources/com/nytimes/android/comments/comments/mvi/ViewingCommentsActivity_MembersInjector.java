package com.nytimes.android.comments.comments.mvi;

import defpackage.at7;
import defpackage.op4;
import defpackage.p76;
import defpackage.uq7;

/* loaded from: classes4.dex */
public final class ViewingCommentsActivity_MembersInjector implements op4 {
    private final p76 sharingManagerProvider;
    private final p76 singleArticleActivityNavigatorProvider;

    public ViewingCommentsActivity_MembersInjector(p76 p76Var, p76 p76Var2) {
        this.sharingManagerProvider = p76Var;
        this.singleArticleActivityNavigatorProvider = p76Var2;
    }

    public static op4 create(p76 p76Var, p76 p76Var2) {
        return new ViewingCommentsActivity_MembersInjector(p76Var, p76Var2);
    }

    public static void injectSharingManager(ViewingCommentsActivity viewingCommentsActivity, uq7 uq7Var) {
        viewingCommentsActivity.sharingManager = uq7Var;
    }

    public static void injectSingleArticleActivityNavigator(ViewingCommentsActivity viewingCommentsActivity, at7 at7Var) {
        viewingCommentsActivity.singleArticleActivityNavigator = at7Var;
    }

    public void injectMembers(ViewingCommentsActivity viewingCommentsActivity) {
        injectSharingManager(viewingCommentsActivity, (uq7) this.sharingManagerProvider.get());
        injectSingleArticleActivityNavigator(viewingCommentsActivity, (at7) this.singleArticleActivityNavigatorProvider.get());
    }
}
