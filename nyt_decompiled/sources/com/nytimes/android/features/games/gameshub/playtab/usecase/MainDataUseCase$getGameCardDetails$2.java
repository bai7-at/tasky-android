package com.nytimes.android.features.games.gameshub.playtab.usecase;

import com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider;
import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.it2;
import defpackage.u14;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$2", f = "MainDataUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainDataUseCase$getGameCardDetails$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MainDataUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainDataUseCase$getGameCardDetails$2(MainDataUseCase mainDataUseCase, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = mainDataUseCase;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(GamesConfigurationProvider.b bVar, u14 u14Var, by0 by0Var) {
        MainDataUseCase$getGameCardDetails$2 mainDataUseCase$getGameCardDetails$2 = new MainDataUseCase$getGameCardDetails$2(this.this$0, by0Var);
        mainDataUseCase$getGameCardDetails$2.L$0 = bVar;
        mainDataUseCase$getGameCardDetails$2.L$1 = u14Var;
        return mainDataUseCase$getGameCardDetails$2.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List g;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        GamesConfigurationProvider.b bVar = (GamesConfigurationProvider.b) this.L$0;
        g = this.this$0.g(bVar, (u14) this.L$1);
        return du8.a(bVar, g);
    }
}
