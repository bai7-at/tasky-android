package com.nytimes.android.utils;

import android.content.SharedPreferences;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProducerScope;

@fc1(c = "com.nytimes.android.utils.AppPreferences$getLongFlowForKey$1", f = "AppPreferences.kt", l = {135, 137}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AppPreferences$getLongFlowForKey$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $keyForLong;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AppPreferences this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppPreferences$getLongFlowForKey$1(AppPreferences appPreferences, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = appPreferences;
        this.$keyForLong = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, ProducerScope producerScope, AppPreferences appPreferences, SharedPreferences sharedPreferences, String str2) {
        if (zq3.c(str, str2)) {
            producerScope.mo129trySendJP2dKIU(Long.valueOf(appPreferences.k(str2, 0L)));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AppPreferences$getLongFlowForKey$1 appPreferences$getLongFlowForKey$1 = new AppPreferences$getLongFlowForKey$1(this.this$0, this.$keyForLong, by0Var);
        appPreferences$getLongFlowForKey$1.L$0 = obj;
        return appPreferences$getLongFlowForKey$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r9)
            goto L7d
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1a:
            java.lang.Object r1 = r8.L$1
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r1 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r1
            java.lang.Object r3 = r8.L$0
            kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
            kotlin.f.b(r9)
            goto L66
        L26:
            kotlin.f.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            java.lang.String r1 = r8.$keyForLong
            com.nytimes.android.utils.AppPreferences r4 = r8.this$0
            com.nytimes.android.utils.a r5 = new com.nytimes.android.utils.a
            r5.<init>()
            com.nytimes.android.utils.AppPreferences r1 = r8.this$0
            android.content.SharedPreferences r1 = com.nytimes.android.utils.AppPreferences.a(r1)
            r1.registerOnSharedPreferenceChangeListener(r5)
            com.nytimes.android.utils.AppPreferences r1 = r8.this$0
            java.lang.String r4 = r8.$keyForLong
            boolean r1 = r1.h(r4)
            if (r1 == 0) goto L68
            com.nytimes.android.utils.AppPreferences r1 = r8.this$0
            java.lang.String r4 = r8.$keyForLong
            r6 = 0
            long r6 = r1.k(r4, r6)
            java.lang.Long r1 = defpackage.cc0.d(r6)
            r8.L$0 = r9
            r8.L$1 = r5
            r8.label = r3
            java.lang.Object r1 = r9.send(r1, r8)
            if (r1 != r0) goto L64
            return r0
        L64:
            r3 = r9
            r1 = r5
        L66:
            r5 = r1
            r9 = r3
        L68:
            com.nytimes.android.utils.AppPreferences$getLongFlowForKey$1$1 r1 = new com.nytimes.android.utils.AppPreferences$getLongFlowForKey$1$1
            com.nytimes.android.utils.AppPreferences r3 = r8.this$0
            r1.<init>()
            r3 = 0
            r8.L$0 = r3
            r8.L$1 = r3
            r8.label = r2
            java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r9, r1, r8)
            if (r8 != r0) goto L7d
            return r0
        L7d:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.utils.AppPreferences$getLongFlowForKey$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(ProducerScope producerScope, by0 by0Var) {
        return ((AppPreferences$getLongFlowForKey$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}
