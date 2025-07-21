package com.nytimes.android.interests;

import defpackage.by0;
import defpackage.fc1;
import defpackage.fp3;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.interests.InterestsCacheManager$saveResponse$2", f = "InterestsCacheManager.kt", l = {107, 108, 109}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsCacheManager$saveResponse$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ fp3 $content;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InterestsCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsCacheManager$saveResponse$2(InterestsCacheManager interestsCacheManager, fp3 fp3Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = interestsCacheManager;
        this.$content = fp3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsCacheManager$saveResponse$2(this.this$0, this.$content, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x019b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsCacheManager$saveResponse$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((InterestsCacheManager$saveResponse$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
