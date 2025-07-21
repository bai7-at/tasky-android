package com.nytimes.android.push;

import com.nytimes.android.logging.NYTLogger;
import defpackage.ai4;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.push.BreakingNewsAlertManager$obtainResizedImage$2", f = "BreakingNewsAlertManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BreakingNewsAlertManager$obtainResizedImage$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ BreakingNewsAlertManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BreakingNewsAlertManager$obtainResizedImage$2(String str, BreakingNewsAlertManager breakingNewsAlertManager, by0 by0Var) {
        super(2, by0Var);
        this.$imageUrl = str;
        this.this$0 = breakingNewsAlertManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BreakingNewsAlertManager$obtainResizedImage$2(this.$imageUrl, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ai4 ai4Var;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        try {
            String str = this.$imageUrl;
            ai4Var = this.this$0.mediaFetcher;
            return ai4Var.b(str);
        } catch (Exception e) {
            NYTLogger.h(e);
            return null;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BreakingNewsAlertManager$obtainResizedImage$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
