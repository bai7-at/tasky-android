package com.nytimes.android.features.settings;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fp6;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.settings.SettingsFragment$promptForReAuthAndRedirectToSettingsUrl$1$1", f = "SettingsFragment.kt", l = {664}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SettingsFragment$promptForReAuthAndRedirectToSettingsUrl$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $it;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ SettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsFragment$promptForReAuthAndRedirectToSettingsUrl$1$1(SettingsFragment settingsFragment, Context context, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = settingsFragment;
        this.$it = context;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SettingsFragment$promptForReAuthAndRedirectToSettingsUrl$1$1(this.this$0, this.$it, this.$url, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            fp6 reAuthLauncher = this.this$0.getReAuthLauncher();
            Context context = this.$it;
            zq3.g(context, "$it");
            String str = this.$url;
            this.label = 1;
            if (reAuthLauncher.a(context, str, this) == h) {
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
        return ((SettingsFragment$promptForReAuthAndRedirectToSettingsUrl$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
