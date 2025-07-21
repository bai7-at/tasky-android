package com.nytimes.android;

import com.nytimes.android.readerhybrid.HybridConfigManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$hybridConfig$1", f = "HybridWebViewLayout.kt", l = {471}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$hybridConfig$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ HybridConfigManager $hybridConfigManager;
    final /* synthetic */ String $pageViewId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$hybridConfig$1(HybridConfigManager hybridConfigManager, String str, by0 by0Var) {
        super(2, by0Var);
        this.$hybridConfigManager = hybridConfigManager;
        this.$pageViewId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$hybridConfig$1(this.$hybridConfigManager, this.$pageViewId, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            HybridConfigManager hybridConfigManager = this.$hybridConfigManager;
            String str = this.$pageViewId;
            if (str == null) {
                str = "";
            }
            this.label = 1;
            obj = hybridConfigManager.e(null, str, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$hybridConfig$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
