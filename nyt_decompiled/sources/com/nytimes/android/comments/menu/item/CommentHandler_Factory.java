package com.nytimes.android.comments.menu.item;

import android.app.Activity;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ba2;
import defpackage.p76;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class CommentHandler_Factory implements ba2 {
    private final p76 activityProvider;
    private final p76 eCommClientProvider;
    private final p76 ioDispatcherProvider;
    private final p76 mainDispatcherProvider;
    private final p76 networkStatusProvider;
    private final p76 snackbarUtilProvider;

    public CommentHandler_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6) {
        this.activityProvider = p76Var;
        this.networkStatusProvider = p76Var2;
        this.snackbarUtilProvider = p76Var3;
        this.eCommClientProvider = p76Var4;
        this.ioDispatcherProvider = p76Var5;
        this.mainDispatcherProvider = p76Var6;
    }

    public static CommentHandler_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6) {
        return new CommentHandler_Factory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6);
    }

    public static CommentHandler newInstance(Activity activity, NetworkStatus networkStatus, SnackbarUtil snackbarUtil, com.nytimes.android.entitlements.a aVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        return new CommentHandler(activity, networkStatus, snackbarUtil, aVar, coroutineDispatcher, coroutineDispatcher2);
    }

    @Override // defpackage.p76
    public CommentHandler get() {
        return newInstance((Activity) this.activityProvider.get(), (NetworkStatus) this.networkStatusProvider.get(), (SnackbarUtil) this.snackbarUtilProvider.get(), (com.nytimes.android.entitlements.a) this.eCommClientProvider.get(), (CoroutineDispatcher) this.ioDispatcherProvider.get(), (CoroutineDispatcher) this.mainDispatcherProvider.get());
    }
}
