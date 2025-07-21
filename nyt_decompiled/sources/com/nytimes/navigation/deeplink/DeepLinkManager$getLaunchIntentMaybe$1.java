package com.nytimes.navigation.deeplink;

import android.content.Context;
import android.content.Intent;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntentMaybe$1", f = "DeepLinkManager.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DeepLinkManager$getLaunchIntentMaybe$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $emailAddress;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $isMagicLinkLoginSuccess;
    int label;
    final /* synthetic */ DeepLinkManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkManager$getLaunchIntentMaybe$1(DeepLinkManager deepLinkManager, Context context, Intent intent, String str, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = deepLinkManager;
        this.$context = context;
        this.$intent = intent;
        this.$emailAddress = str;
        this.$isMagicLinkLoginSuccess = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DeepLinkManager$getLaunchIntentMaybe$1(this.this$0, this.$context, this.$intent, this.$emailAddress, this.$isMagicLinkLoginSuccess, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            DeepLinkManager deepLinkManager = this.this$0;
            Context context = this.$context;
            Intent intent = this.$intent;
            String str = this.$emailAddress;
            boolean z = this.$isMagicLinkLoginSuccess;
            this.label = 1;
            obj = deepLinkManager.c(context, intent, (r16 & 4) != 0 ? false : false, (r16 & 8) != 0 ? "" : str, (r16 & 16) != 0 ? false : z, this);
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DeepLinkManager$getLaunchIntentMaybe$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
