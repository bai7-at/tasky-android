package com.nytimes.android.hybrid.bridge;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.hybrid.bridge.NativeBridge$enqueue$1$1", f = "NativeBridge.kt", l = {139, 165}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NativeBridge$enqueue$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ JavascriptEventParameter $json;
    int I$0;
    int label;
    final /* synthetic */ NativeBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeBridge$enqueue$1$1(NativeBridge nativeBridge, JavascriptEventParameter javascriptEventParameter, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = nativeBridge;
        this.$json = javascriptEventParameter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NativeBridge$enqueue$1$1(this.this$0, this.$json, by0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (r10 == null) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.f.b(r10)
            goto Lc9
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L1b:
            int r1 = r9.I$0
            kotlin.f.b(r10)     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            goto L80
        L21:
            r10 = move-exception
            goto L91
        L23:
            r10 = move-exception
            goto Lb0
        L26:
            kotlin.f.b(r10)
            com.nytimes.android.hybrid.bridge.NativeBridge r10 = r9.this$0
            java.util.List r10 = com.nytimes.android.hybrid.bridge.NativeBridge.a(r10)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            com.nytimes.android.hybrid.bridge.JavascriptEventParameter r1 = r9.$json
            java.util.Iterator r10 = r10.iterator()
        L37:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L53
            java.lang.Object r4 = r10.next()
            r5 = r4
            mc0 r5 = (defpackage.mc0) r5
            java.lang.String r5 = r5.a()
            java.lang.String r6 = r1.d()
            boolean r5 = defpackage.zq3.c(r5, r6)
            if (r5 == 0) goto L37
            goto L54
        L53:
            r4 = 0
        L54:
            mc0 r4 = (defpackage.mc0) r4
            com.nytimes.android.hybrid.bridge.JavascriptEventParameter r10 = r9.$json
            int r1 = r10.b()
            if (r4 == 0) goto L84
            com.nytimes.android.hybrid.bridge.NativeBridge r10 = r9.this$0     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            android.webkit.WebView r10 = com.nytimes.android.hybrid.bridge.NativeBridge.b(r10)     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            nc0 r5 = new nc0     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            com.nytimes.android.hybrid.bridge.JavascriptEventParameter r6 = r9.$json     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            java.util.Map r6 = r6.c()     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            if (r6 != 0) goto L72
            java.util.Map r6 = kotlin.collections.t.i()     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
        L72:
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            r9.I$0 = r1     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            r9.label = r3     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            java.lang.Object r10 = r4.b(r10, r1, r5, r9)     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            if (r10 != r0) goto L80
            return r0
        L80:
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r10 = (com.nytimes.android.hybrid.bridge.BridgeCommandResult) r10     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            if (r10 != 0) goto Lbe
        L84:
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r3 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            java.lang.String r5 = "Command is not supported in this context"
            r7 = 4
            r8 = 0
            r6 = 0
            r4 = r1
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r10 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.a.b(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L21 com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException -> L23
            goto Lbe
        L91:
            boolean r3 = r10 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto Laf
            ul8$b r3 = defpackage.ul8.a
            java.lang.String r4 = "HYBRID"
            ul8$c r3 = r3.z(r4)
            r4 = 8
            r3.q(r4, r10)
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r3 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion
            java.lang.String r4 = "Error executing command"
            java.lang.String r10 = r10.getMessage()
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r10 = r3.a(r1, r4, r10)
            goto Lbe
        Laf:
            throw r10
        Lb0:
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r3 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion
            java.lang.String r4 = r10.getMessage()
            java.lang.String r10 = r10.a()
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r10 = r3.a(r1, r4, r10)
        Lbe:
            com.nytimes.android.hybrid.bridge.NativeBridge r1 = r9.this$0
            r9.label = r2
            java.lang.Object r9 = com.nytimes.android.hybrid.bridge.NativeBridge.c(r1, r10, r9)
            if (r9 != r0) goto Lc9
            return r0
        Lc9:
            ww8 r9 = defpackage.ww8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.hybrid.bridge.NativeBridge$enqueue$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NativeBridge$enqueue$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
