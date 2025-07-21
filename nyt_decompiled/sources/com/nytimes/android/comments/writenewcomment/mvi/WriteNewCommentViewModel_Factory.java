package com.nytimes.android.comments.writenewcomment.mvi;

import androidx.lifecycle.n;
import com.nytimes.android.comments.writenewcomment.data.repository.WriteNewCommentRepository;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class WriteNewCommentViewModel_Factory implements ba2 {
    private final p76 et2ScopeProvider;
    private final p76 savedStateHandleProvider;
    private final p76 writeNewCommentRepositoryProvider;

    public WriteNewCommentViewModel_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.writeNewCommentRepositoryProvider = p76Var;
        this.et2ScopeProvider = p76Var2;
        this.savedStateHandleProvider = p76Var3;
    }

    public static WriteNewCommentViewModel_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new WriteNewCommentViewModel_Factory(p76Var, p76Var2, p76Var3);
    }

    public static WriteNewCommentViewModel newInstance(WriteNewCommentRepository writeNewCommentRepository, ET2Scope eT2Scope, n nVar) {
        return new WriteNewCommentViewModel(writeNewCommentRepository, eT2Scope, nVar);
    }

    @Override // defpackage.p76
    public WriteNewCommentViewModel get() {
        return newInstance((WriteNewCommentRepository) this.writeNewCommentRepositoryProvider.get(), (ET2Scope) this.et2ScopeProvider.get(), (n) this.savedStateHandleProvider.get());
    }
}
