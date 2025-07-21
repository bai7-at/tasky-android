package com.nytimes.android.devsettings.common;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.devsettings.common.DevSettingLazySummaryItem$Draw$1", f = "DevSettingLazySummaryItem.kt", l = {47, 48}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DevSettingLazySummaryItem$Draw$1 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ DevSettingLazySummaryItem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DevSettingLazySummaryItem$Draw$1(DevSettingLazySummaryItem devSettingLazySummaryItem, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = devSettingLazySummaryItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DevSettingLazySummaryItem$Draw$1(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r6 = r6.L$0
            kotlinx.coroutines.flow.MutableStateFlow r6 = (kotlinx.coroutines.flow.MutableStateFlow) r6
            kotlin.f.b(r7)
            goto L66
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1f:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = (kotlinx.coroutines.flow.MutableStateFlow) r1
            kotlin.f.b(r7)
            goto L43
        L27:
            kotlin.f.b(r7)
            com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r7 = r6.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = r7.o()
            com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r7 = r6.this$0
            ss2 r7 = r7.k()
            if (r7 == 0) goto L46
            r6.L$0 = r1
            r6.label = r4
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L43
            return r0
        L43:
            java.lang.String r7 = (java.lang.String) r7
            goto L47
        L46:
            r7 = r2
        L47:
            r1.setValue(r7)
            com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r7 = r6.this$0
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.n()
            com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r1 = r6.this$0
            ss2 r1 = r1.j()
            if (r1 == 0) goto L6a
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r6 = r1.invoke(r6)
            if (r6 != r0) goto L63
            return r0
        L63:
            r5 = r7
            r7 = r6
            r6 = r5
        L66:
            r2 = r7
            androidx.compose.ui.text.a r2 = (androidx.compose.ui.text.a) r2
            r7 = r6
        L6a:
            r7.setValue(r2)
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.devsettings.common.DevSettingLazySummaryItem$Draw$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DevSettingLazySummaryItem$Draw$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
