package com.nytimes.android.comments.menu.item;

import com.nytimes.android.comments.menu.view.MenuCommentsView;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.ba2;
import defpackage.jk;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class Comments_Factory implements ba2 {
    private final p76 activityProvider;
    private final p76 commentsHandlerProvider;
    private final p76 menuCommentsViewProvider;
    private final p76 networkStatusProvider;

    public Comments_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.activityProvider = p76Var;
        this.networkStatusProvider = p76Var2;
        this.menuCommentsViewProvider = p76Var3;
        this.commentsHandlerProvider = p76Var4;
    }

    public static Comments_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new Comments_Factory(p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static Comments newInstance(jk jkVar, NetworkStatus networkStatus, MenuCommentsView menuCommentsView, CommentHandler commentHandler) {
        return new Comments(jkVar, networkStatus, menuCommentsView, commentHandler);
    }

    @Override // defpackage.p76
    public Comments get() {
        return newInstance((jk) this.activityProvider.get(), (NetworkStatus) this.networkStatusProvider.get(), (MenuCommentsView) this.menuCommentsViewProvider.get(), (CommentHandler) this.commentsHandlerProvider.get());
    }
}
