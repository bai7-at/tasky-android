package com.nytimes.android.libs.messagingarchitecture.betasettings;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel$omaMessageHistory$1", f = "DebugViewModel.kt", l = {47, 55, 44}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DebugViewModel$omaMessageHistory$1 extends SuspendLambda implements gt2 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DebugViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugViewModel$omaMessageHistory$1(DebugViewModel debugViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = debugViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DebugViewModel$omaMessageHistory$1 debugViewModel$omaMessageHistory$1 = new DebugViewModel$omaMessageHistory$1(this.this$0, by0Var);
        debugViewModel$omaMessageHistory$1.L$0 = obj;
        return debugViewModel$omaMessageHistory$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel$omaMessageHistory$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((DebugViewModel$omaMessageHistory$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
