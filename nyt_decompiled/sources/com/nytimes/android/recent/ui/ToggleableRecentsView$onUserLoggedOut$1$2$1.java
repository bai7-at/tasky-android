package com.nytimes.android.recent.ui;

import com.nytimes.android.entitlements.b;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jk;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zendesk.core.BuildConfig;

@fc1(c = "com.nytimes.android.recent.ui.ToggleableRecentsView$onUserLoggedOut$1$2$1", f = "ToggleableRecentsView.kt", l = {BuildConfig.VERSION_CODE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ToggleableRecentsView$onUserLoggedOut$1$2$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ ToggleableRecentsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToggleableRecentsView$onUserLoggedOut$1$2$1(ToggleableRecentsView toggleableRecentsView, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = toggleableRecentsView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ToggleableRecentsView$onUserLoggedOut$1$2$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        jk jkVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            bVar = this.this$0.d;
            jkVar = this.this$0.c;
            this.label = 1;
            if (b.a.a(bVar, jkVar, null, null, this, 6, null) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ToggleableRecentsView$onUserLoggedOut$1$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
