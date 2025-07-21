package com.nytimes.android.features.games.gameshub.progress;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository", f = "GamesProgressRepository.kt", l = {EventType.CDN}, m = "getNytPuzzleData")
/* loaded from: classes4.dex */
final class GamesProgressRepository$getNytPuzzleData$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GamesProgressRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesProgressRepository$getNytPuzzleData$1(GamesProgressRepository gamesProgressRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = gamesProgressRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, this);
    }
}
