package com.nytimes.android.features.notifications.push;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s55;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.notifications.push.SettingsNotificationsViewModel$trackPage$1", f = "SettingsNotificationsViewModel.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SettingsNotificationsViewModel$trackPage$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsNotificationsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsNotificationsViewModel$trackPage$1(SettingsNotificationsViewModel settingsNotificationsViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = settingsNotificationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SettingsNotificationsViewModel$trackPage$1 settingsNotificationsViewModel$trackPage$1 = new SettingsNotificationsViewModel$trackPage$1(this.this$0, by0Var);
        settingsNotificationsViewModel$trackPage$1.L$0 = obj;
        return settingsNotificationsViewModel$trackPage$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2SimpleScope eT2SimpleScope;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            eT2SimpleScope = this.this$0.m;
            s55.g gVar = s55.g.c;
            this.label = 1;
            if (ET2SimpleScope.i(eT2SimpleScope, gVar, null, null, null, null, null, null, null, coroutineScope, this, 254, null) == h) {
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
        return ((SettingsNotificationsViewModel$trackPage$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
