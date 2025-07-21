package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import android.widget.Toast;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$handleUserStateChange$2$result$1", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserDevSettingFactory$handleUserStateChange$2$result$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserDevSettingFactory$handleUserStateChange$2$result$1(Context context, by0 by0Var) {
        super(2, by0Var);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserDevSettingFactory$handleUserStateChange$2$result$1(this.$context, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Toast.makeText(this.$context, "Logged out", 1).show();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthUserDevSettingFactory$handleUserStateChange$2$result$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
