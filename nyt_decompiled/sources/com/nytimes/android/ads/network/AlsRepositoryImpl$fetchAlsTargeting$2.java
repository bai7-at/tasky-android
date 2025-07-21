package com.nytimes.android.ads.network;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.ads.network.AlsRepositoryImpl$fetchAlsTargeting$2", f = "AlsRepository.kt", l = {39, 42, 45, 44, 56, 57}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AlsRepositoryImpl$fetchAlsTargeting$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $contentUri;
    final /* synthetic */ String $contentUrl;
    final /* synthetic */ String $pageType;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AlsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlsRepositoryImpl$fetchAlsTargeting$2(AlsRepositoryImpl alsRepositoryImpl, String str, String str2, String str3, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = alsRepositoryImpl;
        this.$pageType = str;
        this.$contentUri = str2;
        this.$contentUrl = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AlsRepositoryImpl$fetchAlsTargeting$2 alsRepositoryImpl$fetchAlsTargeting$2 = new AlsRepositoryImpl$fetchAlsTargeting$2(this.this$0, this.$pageType, this.$contentUri, this.$contentUrl, by0Var);
        alsRepositoryImpl$fetchAlsTargeting$2.L$0 = obj;
        return alsRepositoryImpl$fetchAlsTargeting$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ads.network.AlsRepositoryImpl$fetchAlsTargeting$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((AlsRepositoryImpl$fetchAlsTargeting$2) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
