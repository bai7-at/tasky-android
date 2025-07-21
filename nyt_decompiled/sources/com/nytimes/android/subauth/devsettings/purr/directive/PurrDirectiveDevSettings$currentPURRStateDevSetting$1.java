package com.nytimes.android.subauth.devsettings.purr.directive;

import android.content.Context;
import android.widget.Toast;
import com.nytimes.android.subauth.core.purr.a;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.devsettings.purr.directive.PurrDirectiveDevSettings$currentPURRStateDevSetting$1", f = "PurrDirectiveDevSettings.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrDirectiveDevSettings$currentPURRStateDevSetting$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ PurrDirectiveOverrider $directiveOverrider;
    final /* synthetic */ a $purrManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrDirectiveDevSettings$currentPURRStateDevSetting$1(a aVar, PurrDirectiveOverrider purrDirectiveOverrider, Context context, by0 by0Var) {
        super(1, by0Var);
        this.$purrManager = aVar;
        this.$directiveOverrider = purrDirectiveOverrider;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new PurrDirectiveDevSettings$currentPURRStateDevSetting$1(this.$purrManager, this.$directiveOverrider, this.$context, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((PurrDirectiveDevSettings$currentPURRStateDevSetting$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.text.a f;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            a aVar = this.$purrManager;
            this.label = 1;
            obj = aVar.a(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        f = PurrDirectiveDevSettings.a.f(this.$purrManager, ((PrivacyConfiguration) obj).getDirectives(), this.$directiveOverrider, this.$purrManager.s(), this.$context);
        Toast.makeText(this.$context, "Refreshed from current PURR state!", 0).show();
        return f;
    }
}
