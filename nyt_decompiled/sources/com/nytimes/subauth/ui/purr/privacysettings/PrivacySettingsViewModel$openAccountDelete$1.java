package com.nytimes.subauth.ui.purr.privacysettings;

import android.content.Context;
import android.content.Intent;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.t98;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$openAccountDelete$1", f = "PrivacySettingsViewModel.kt", l = {ContentType.SHORT_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PrivacySettingsViewModel$openAccountDelete$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ PrivacySettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivacySettingsViewModel$openAccountDelete$1(PrivacySettingsViewModel privacySettingsViewModel, Context context, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = privacySettingsViewModel;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PrivacySettingsViewModel$openAccountDelete$1(this.this$0, this.$context, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t98 t98Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            t98Var = this.this$0.c;
            Context context = this.$context;
            this.label = 1;
            obj = t98.a.a(t98Var, context, null, this, 2, null);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.$context.startActivity((Intent) obj);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PrivacySettingsViewModel$openAccountDelete$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
