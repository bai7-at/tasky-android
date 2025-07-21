package com.nytimes.android.features.settings;

import android.app.Activity;
import com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.settings.SettingsFragment$handleLoginClick$1$1", f = "SettingsFragment.kt", l = {489}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SettingsFragment$handleLoginClick$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ SettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsFragment$handleLoginClick$1$1(SettingsFragment settingsFragment, Activity activity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = settingsFragment;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SettingsFragment$handleLoginClick$1$1(this.this$0, this.$activity, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            PostLoginRegiOfferManager postLoginRegiManager = this.this$0.getPostLoginRegiManager();
            Activity activity = this.$activity;
            RegiInterface regiInterface = RegiInterface.RegiSettings;
            this.label = 1;
            if (postLoginRegiManager.c(activity, regiInterface, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SettingsFragment$handleLoginClick$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
