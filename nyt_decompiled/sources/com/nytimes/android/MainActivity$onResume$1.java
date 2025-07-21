package com.nytimes.android;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.z58;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.MainActivity$onResume$1", f = "MainActivity.kt", l = {242}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MainActivity$onResume$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$onResume$1(MainActivity mainActivity, by0<? super MainActivity$onResume$1> by0Var) {
        super(2, by0Var);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new MainActivity$onResume$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            z58 subauthClient = this.this$0.getSubauthClient();
            MainActivity mainActivity = this.this$0;
            this.label = 1;
            if (subauthClient.K(mainActivity, this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((MainActivity$onResume$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
