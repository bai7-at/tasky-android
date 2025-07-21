package com.nytimes.android.comments.common;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class CommentsAnalytics_Factory implements ba2 {
    private final p76 et2ScopeProvider;

    public CommentsAnalytics_Factory(p76 p76Var) {
        this.et2ScopeProvider = p76Var;
    }

    public static CommentsAnalytics_Factory create(p76 p76Var) {
        return new CommentsAnalytics_Factory(p76Var);
    }

    public static CommentsAnalytics newInstance(ET2Scope eT2Scope) {
        return new CommentsAnalytics(eT2Scope);
    }

    @Override // defpackage.p76
    public CommentsAnalytics get() {
        return newInstance((ET2Scope) this.et2ScopeProvider.get());
    }
}
