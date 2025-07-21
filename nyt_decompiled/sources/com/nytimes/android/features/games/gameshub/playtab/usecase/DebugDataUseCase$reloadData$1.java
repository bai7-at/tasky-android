package com.nytimes.android.features.games.gameshub.playtab.usecase;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase", f = "DebugDataUseCase.kt", l = {71}, m = "reloadData")
/* loaded from: classes4.dex */
final class DebugDataUseCase$reloadData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DebugDataUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugDataUseCase$reloadData$1(DebugDataUseCase debugDataUseCase, by0 by0Var) {
        super(by0Var);
        this.this$0 = debugDataUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}
