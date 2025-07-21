package com.nytimes.xwords.hybrid;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zu2;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.xwords.hybrid.GamesHybridManager$updateUserConfigs$1", f = "GamesHybridManager.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GamesHybridManager$updateUserConfigs$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ zu2 $userConfig;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesHybridManager$updateUserConfigs$1(zu2 zu2Var, by0 by0Var) {
        super(2, by0Var);
        this.$userConfig = zu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GamesHybridManager$updateUserConfigs$1(this.$userConfig, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ul8.a.a("NytsCookie = " + this.$userConfig.e() + " RegiId = " + this.$userConfig.f() + " LoggedIn = " + this.$userConfig.i() + " Email = " + this.$userConfig.b() + " Entitlements = " + this.$userConfig.c() + " ", new Object[0]);
            mutableSharedFlow = GamesHybridManager.b;
            zu2 zu2Var = this.$userConfig;
            this.label = 1;
            if (mutableSharedFlow.emit(zu2Var, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GamesHybridManager$updateUserConfigs$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
