package com.nytimes.android.features.games.gameshub.configuration;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider", f = "GamesConfigurationProvider.kt", l = {28, BuildConfig.VERSION_CODE, 30}, m = "fetchGamesConfig")
/* loaded from: classes4.dex */
final class GamesConfigurationProvider$fetchGamesConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GamesConfigurationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesConfigurationProvider$fetchGamesConfig$1(GamesConfigurationProvider gamesConfigurationProvider, by0 by0Var) {
        super(by0Var);
        this.this$0 = gamesConfigurationProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
