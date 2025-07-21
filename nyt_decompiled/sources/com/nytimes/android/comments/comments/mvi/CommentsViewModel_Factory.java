package com.nytimes.android.comments.comments.mvi;

import android.app.Application;
import androidx.lifecycle.n;
import com.nytimes.android.comments.comments.data.repository.CommentsRepository;
import com.nytimes.android.comments.common.CommentsAnalytics;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class CommentsViewModel_Factory implements ba2 {
    private final p76 applicationProvider;
    private final p76 commentsAnalyticsProvider;
    private final p76 commentsRepositoryProvider;
    private final p76 networkStatusProvider;
    private final p76 savedStateHandleProvider;

    public CommentsViewModel_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        this.commentsRepositoryProvider = p76Var;
        this.commentsAnalyticsProvider = p76Var2;
        this.networkStatusProvider = p76Var3;
        this.savedStateHandleProvider = p76Var4;
        this.applicationProvider = p76Var5;
    }

    public static CommentsViewModel_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        return new CommentsViewModel_Factory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5);
    }

    public static CommentsViewModel newInstance(CommentsRepository commentsRepository, CommentsAnalytics commentsAnalytics, NetworkStatus networkStatus, n nVar, Application application) {
        return new CommentsViewModel(commentsRepository, commentsAnalytics, networkStatus, nVar, application);
    }

    @Override // defpackage.p76
    public CommentsViewModel get() {
        return newInstance((CommentsRepository) this.commentsRepositoryProvider.get(), (CommentsAnalytics) this.commentsAnalyticsProvider.get(), (NetworkStatus) this.networkStatusProvider.get(), (n) this.savedStateHandleProvider.get(), (Application) this.applicationProvider.get());
    }
}
