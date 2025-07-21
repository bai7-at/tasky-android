package com.nytimes.android.hybrid.bridge;

import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import com.squareup.moshi.i;
import defpackage.by0;
import defpackage.ju;
import defpackage.mc0;
import defpackage.nc0;
import defpackage.zq3;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes4.dex */
public final class NativeToWebCommand extends mc0 {
    private final ju b;
    private final i c;
    private final CompletableJob d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeToWebCommand(ju juVar, i iVar) {
        super("__initialize");
        CompletableJob Job$default;
        zq3.h(juVar, "webView");
        zq3.h(iVar, "moshi");
        this.b = juVar;
        this.c = iVar;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.d = Job$default;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        this.d.complete();
        return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.nytimes.android.hybrid.bridge.JavascriptEventParameter r7, java.lang.Class r8, defpackage.by0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.nytimes.android.hybrid.bridge.NativeToWebCommand$enqueueCommand$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.hybrid.bridge.NativeToWebCommand$enqueueCommand$1 r0 = (com.nytimes.android.hybrid.bridge.NativeToWebCommand$enqueueCommand$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.hybrid.bridge.NativeToWebCommand$enqueueCommand$1 r0 = new com.nytimes.android.hybrid.bridge.NativeToWebCommand$enqueueCommand$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r6 = r0.L$1
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.hybrid.bridge.NativeToWebCommand r7 = (com.nytimes.android.hybrid.bridge.NativeToWebCommand) r7
            kotlin.f.b(r9)
            goto L92
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r6 = r0.L$2
            r8 = r6
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.Object r6 = r0.L$1
            r7 = r6
            com.nytimes.android.hybrid.bridge.JavascriptEventParameter r7 = (com.nytimes.android.hybrid.bridge.JavascriptEventParameter) r7
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.hybrid.bridge.NativeToWebCommand r6 = (com.nytimes.android.hybrid.bridge.NativeToWebCommand) r6
            kotlin.f.b(r9)
            goto L63
        L4f:
            kotlin.f.b(r9)
            kotlinx.coroutines.CompletableJob r9 = r6.d
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r5
            java.lang.Object r9 = r9.join(r0)
            if (r9 != r1) goto L63
            return r1
        L63:
            com.nytimes.android.hybrid.bridge.JavascriptEventParameter$b r9 = com.nytimes.android.hybrid.bridge.JavascriptEventParameter.Companion
            java.lang.String r7 = r9.b(r7)
            ju r9 = r6.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "return NYTG.enqueueWebCommand("
            r2.append(r5)
            r2.append(r7)
            java.lang.String r7 = ")"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.L$0 = r6
            r0.L$1 = r8
            r0.L$2 = r3
            r0.label = r4
            java.lang.Object r9 = r9.a(r7, r0)
            if (r9 != r1) goto L90
            return r1
        L90:
            r7 = r6
            r6 = r8
        L92:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L97
            return r3
        L97:
            com.squareup.moshi.i r7 = r7.c
            com.squareup.moshi.JsonAdapter r6 = r7.c(r6)
            java.lang.Object r6 = r6.fromJson(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.hybrid.bridge.NativeToWebCommand.c(com.nytimes.android.hybrid.bridge.JavascriptEventParameter, java.lang.Class, by0):java.lang.Object");
    }
}
