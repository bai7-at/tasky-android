package com.nytimes.android.subauth.devsettings.purr.tcf;

import android.content.Context;
import android.widget.Toast;
import com.nytimes.android.subauth.core.purr.a;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.devsettings.purr.tcf.PurrTCFDevSettings$showTCFInfoDevSetting$1", f = "PurrTCFDevSettings.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrTCFDevSettings$showTCFInfoDevSetting$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ a $purrManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrTCFDevSettings$showTCFInfoDevSetting$1(a aVar, Context context, by0 by0Var) {
        super(1, by0Var);
        this.$purrManager = aVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new PurrTCFDevSettings$showTCFInfoDevSetting$1(this.$purrManager, this.$context, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((PurrTCFDevSettings$showTCFInfoDevSetting$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.text.a b;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        b = PurrTCFDevSettings.a.b(this.$purrManager.v(), this.$purrManager.g(), this.$purrManager.x(), this.$purrManager.m());
        Toast.makeText(this.$context, "Refreshed from current Saved TCF state!", 0).show();
        return b;
    }
}
