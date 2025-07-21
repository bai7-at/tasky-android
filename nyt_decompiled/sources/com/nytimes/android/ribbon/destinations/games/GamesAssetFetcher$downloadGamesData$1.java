package com.nytimes.android.ribbon.destinations.games;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher", f = "GamesAssetsFetcher.kt", l = {EventType.CDN}, m = "downloadGamesData")
/* loaded from: classes4.dex */
final class GamesAssetFetcher$downloadGamesData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GamesAssetFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesAssetFetcher$downloadGamesData$1(GamesAssetFetcher gamesAssetFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = gamesAssetFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
