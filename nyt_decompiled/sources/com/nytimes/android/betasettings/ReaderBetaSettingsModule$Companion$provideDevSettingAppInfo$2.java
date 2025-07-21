package com.nytimes.android.betasettings;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.betasettings.ReaderBetaSettingsModule$Companion$provideDevSettingAppInfo$2", f = "ReaderBetaSettingsModule.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ReaderBetaSettingsModule$Companion$provideDevSettingAppInfo$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ Flow<String> $firebaseIdTokenFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReaderBetaSettingsModule$Companion$provideDevSettingAppInfo$2(Flow flow, by0 by0Var) {
        super(1, by0Var);
        this.$firebaseIdTokenFlow = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new ReaderBetaSettingsModule$Companion$provideDevSettingAppInfo$2(this.$firebaseIdTokenFlow, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((ReaderBetaSettingsModule$Companion$provideDevSettingAppInfo$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Flow<String> flow = this.$firebaseIdTokenFlow;
            this.label = 1;
            obj = FlowKt.first(flow, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }
}
