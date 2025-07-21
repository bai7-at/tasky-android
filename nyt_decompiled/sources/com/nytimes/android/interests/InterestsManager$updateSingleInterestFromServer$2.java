package com.nytimes.android.interests;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.interests.InterestsManager$updateSingleInterestFromServer$2", f = "InterestsManager.kt", l = {146, 149, 152, 160}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsManager$updateSingleInterestFromServer$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $id;
    Object L$0;
    int label;
    final /* synthetic */ InterestsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsManager$updateSingleInterestFromServer$2(InterestsManager interestsManager, int i, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = interestsManager;
        this.$id = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsManager$updateSingleInterestFromServer$2(this.this$0, this.$id, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:18:0x0025, B:19:0x0094, B:22:0x0099, B:23:0x00c8, B:25:0x0030, B:26:0x0072, B:28:0x0034, B:29:0x004c, B:31:0x005b, B:34:0x0081, B:38:0x003b), top: B:2:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsManager$updateSingleInterestFromServer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((InterestsManager$updateSingleInterestFromServer$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
