package com.nytimes.android.features.home.data;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.nh5;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.home.data.HomeRepository$fetchFromServer$2", f = "HomeRepository.kt", l = {39, 42, 47}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomeRepository$fetchFromServer$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $oneWebViewGraphQLId;
    final /* synthetic */ nh5 $serverData;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ HomeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeRepository$fetchFromServer$2(HomeRepository homeRepository, nh5 nh5Var, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = homeRepository;
        this.$serverData = nh5Var;
        this.$oneWebViewGraphQLId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HomeRepository$fetchFromServer$2(this.this$0, this.$serverData, this.$oneWebViewGraphQLId, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.home.data.HomeRepository$fetchFromServer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HomeRepository$fetchFromServer$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
