package com.nytimes.android.features.games.gameshub.progress;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider", f = "GamesProgressProvider.kt", l = {22}, m = "getPuzzleIds")
/* loaded from: classes4.dex */
final class GamesProgressProvider$getPuzzleIds$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GamesProgressProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesProgressProvider$getPuzzleIds$1(GamesProgressProvider gamesProgressProvider, by0 by0Var) {
        super(by0Var);
        this.this$0 = gamesProgressProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}
