package com.nytimes.android.hybrid;

import android.content.res.Resources;
import defpackage.by0;
import defpackage.cc0;
import defpackage.hd4;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class HybridScriptInflater {
    public static final a Companion = new a(null);
    private final CoroutineDispatcher a;
    private final hd4 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public HybridScriptInflater(CoroutineDispatcher coroutineDispatcher) {
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = coroutineDispatcher;
        this.b = new hd4(10);
    }

    public final Object b(Resources resources, int i, by0 by0Var) {
        String str = (String) this.b.d(cc0.c(i));
        return str == null ? BuildersKt.withContext(this.a, new HybridScriptInflater$getScript$2(resources, i, this, null), by0Var) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.res.Resources r5, int r6, java.lang.String[] r7, defpackage.by0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.nytimes.android.hybrid.HybridScriptInflater$getScript$3
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.hybrid.HybridScriptInflater$getScript$3 r0 = (com.nytimes.android.hybrid.HybridScriptInflater$getScript$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.hybrid.HybridScriptInflater$getScript$3 r0 = new com.nytimes.android.hybrid.HybridScriptInflater$getScript$3
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r7 = r4
            java.lang.String[] r7 = (java.lang.String[]) r7
            kotlin.f.b(r8)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.f.b(r8)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r4.b(r5, r6, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            java.lang.String r8 = (java.lang.String) r8
            z38 r4 = defpackage.z38.a
            int r4 = r7.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r7, r4)
            int r5 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r4 = java.lang.String.format(r8, r4)
            java.lang.String r5 = "format(...)"
            defpackage.zq3.g(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.hybrid.HybridScriptInflater.c(android.content.res.Resources, int, java.lang.String[], by0):java.lang.Object");
    }

    public /* synthetic */ HybridScriptInflater(CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
