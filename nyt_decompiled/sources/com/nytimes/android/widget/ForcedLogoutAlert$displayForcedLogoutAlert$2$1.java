package com.nytimes.android.widget;

import com.nytimes.android.entitlements.a;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jk;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.widget.ForcedLogoutAlert$displayForcedLogoutAlert$2$1", f = "ForcedLogoutAlert.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ForcedLogoutAlert$displayForcedLogoutAlert$2$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ ForcedLogoutAlert this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ForcedLogoutAlert$displayForcedLogoutAlert$2$1(ForcedLogoutAlert forcedLogoutAlert, by0<? super ForcedLogoutAlert$displayForcedLogoutAlert$2$1> by0Var) {
        super(2, by0Var);
        this.this$0 = forcedLogoutAlert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new ForcedLogoutAlert$displayForcedLogoutAlert$2$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        jk jkVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            aVar = this.this$0.eCommClient;
            jkVar = this.this$0.activity;
            RegiInterface regiInterface = RegiInterface.RegiForcedLogout;
            this.label = 1;
            if (aVar.s(jkVar, regiInterface, "Forced Logout", this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((ForcedLogoutAlert$displayForcedLogoutAlert$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
