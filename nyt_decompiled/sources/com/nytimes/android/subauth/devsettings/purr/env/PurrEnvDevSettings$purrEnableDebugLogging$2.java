package com.nytimes.android.subauth.devsettings.purr.env;

import android.content.Context;
import com.nytimes.android.subauth.core.purr.a;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.devsettings.purr.env.PurrEnvDevSettings$purrEnableDebugLogging$2", f = "PurrEnvDevSettings.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrEnvDevSettings$purrEnableDebugLogging$2 extends SuspendLambda implements it2 {
    final /* synthetic */ a $purrManager;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrEnvDevSettings$purrEnableDebugLogging$2(a aVar, by0 by0Var) {
        super(3, by0Var);
        this.$purrManager = aVar;
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        PurrEnvDevSettings$purrEnableDebugLogging$2 purrEnvDevSettings$purrEnableDebugLogging$2 = new PurrEnvDevSettings$purrEnableDebugLogging$2(this.$purrManager, by0Var);
        purrEnvDevSettings$purrEnableDebugLogging$2.Z$0 = z;
        return purrEnvDevSettings$purrEnableDebugLogging$2.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((Context) obj, ((Boolean) obj2).booleanValue(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        boolean z = this.Z$0;
        this.$purrManager.z(z);
        return cc0.a(z);
    }
}
