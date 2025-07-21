package com.nytimes.android.eventtracker.validator.fetcher;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import zendesk.core.BuildConfig;

@fc1(c = "com.nytimes.android.eventtracker.validator.fetcher.NetworkScriptFetcher$invoke$1", f = "NetworkScriptFetcher.kt", l = {42, 44, 52, BuildConfig.VERSION_CODE, 40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NetworkScriptFetcher$invoke$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ NetworkScriptFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkScriptFetcher$invoke$1(NetworkScriptFetcher networkScriptFetcher, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = networkScriptFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        NetworkScriptFetcher$invoke$1 networkScriptFetcher$invoke$1 = new NetworkScriptFetcher$invoke$1(this.this$0, by0Var);
        networkScriptFetcher$invoke$1.L$0 = obj;
        return networkScriptFetcher$invoke$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011b A[Catch: Exception -> 0x0038, TryCatch #3 {Exception -> 0x0038, blocks: (B:16:0x0033, B:17:0x010d, B:19:0x011b, B:21:0x0129, B:25:0x012f, B:27:0x0047, B:28:0x00f6), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.validator.fetcher.NetworkScriptFetcher$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((NetworkScriptFetcher$invoke$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
