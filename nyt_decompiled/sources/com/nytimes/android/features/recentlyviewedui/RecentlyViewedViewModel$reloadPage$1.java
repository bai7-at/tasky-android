package com.nytimes.android.features.recentlyviewedui;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel$reloadPage$1", f = "RecentlyViewedViewModel.kt", l = {54, 54, 59}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RecentlyViewedViewModel$reloadPage$1 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ RecentlyViewedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentlyViewedViewModel$reloadPage$1(RecentlyViewedViewModel recentlyViewedViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = recentlyViewedViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RecentlyViewedViewModel$reloadPage$1(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:7:0x0012, B:8:0x0072, B:14:0x0024, B:15:0x006a, B:17:0x0081, B:18:0x0092, B:20:0x0098, B:23:0x00a4, B:28:0x00a8, B:29:0x00b7, B:31:0x002c, B:32:0x0059, B:36:0x003e), top: B:2:0x000a }] */
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
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L30
            if (r1 == r4) goto L28
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L19
            r5 = r7
            j08 r5 = (defpackage.j08) r5     // Catch: java.lang.Exception -> L19
            goto L72
        L19:
            r7 = move-exception
            goto Lb8
        L1c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L24:
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L19
            goto L6a
        L28:
            java.lang.Object r1 = r6.L$0
            hs r1 = (defpackage.hs) r1
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L19
            goto L59
        L30:
            kotlin.f.b(r7)
            com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel r7 = r6.this$0
            kotlinx.coroutines.flow.MutableStateFlow r7 = com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel.f(r7)
            u14$b r1 = u14.b.b
            r7.setValue(r1)
            com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel r7 = r6.this$0     // Catch: java.lang.Exception -> L19
            com.nytimes.android.recentlyviewed.room.AssetDatabase r7 = r7.i()     // Catch: java.lang.Exception -> L19
            hs r1 = r7.d()     // Catch: java.lang.Exception -> L19
            com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel r7 = r6.this$0     // Catch: java.lang.Exception -> L19
            com.nytimes.android.recentlyviewed.RecentlyViewedParams r7 = r7.k()     // Catch: java.lang.Exception -> L19
            r6.L$0 = r1     // Catch: java.lang.Exception -> L19
            r6.label = r4     // Catch: java.lang.Exception -> L19
            java.lang.Object r7 = r7.b(r6)     // Catch: java.lang.Exception -> L19
            if (r7 != r0) goto L59
            return r0
        L59:
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Exception -> L19
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> L19
            r6.L$0 = r5     // Catch: java.lang.Exception -> L19
            r6.label = r3     // Catch: java.lang.Exception -> L19
            java.lang.Object r7 = r1.g(r7, r6)     // Catch: java.lang.Exception -> L19
            if (r7 != r0) goto L6a
            return r0
        L6a:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L19
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L81
        L72:
            com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel r7 = r6.this$0     // Catch: java.lang.Exception -> L19
            kotlinx.coroutines.flow.MutableStateFlow r7 = com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel.f(r7)     // Catch: java.lang.Exception -> L19
            u14$c r0 = new u14$c     // Catch: java.lang.Exception -> L19
            r0.<init>(r5)     // Catch: java.lang.Exception -> L19
            r7.setValue(r0)     // Catch: java.lang.Exception -> L19
            goto Lc6
        L81:
            com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel r0 = r6.this$0     // Catch: java.lang.Exception -> L19
            ca7 r0 = r0.m()     // Catch: java.lang.Exception -> L19
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Exception -> L19
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L19
            r1.<init>()     // Catch: java.lang.Exception -> L19
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L19
        L92:
            boolean r3 = r7.hasNext()     // Catch: java.lang.Exception -> L19
            if (r3 == 0) goto La8
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Exception -> L19
            z18 r3 = (defpackage.z18) r3     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = r3.o()     // Catch: java.lang.Exception -> L19
            if (r3 == 0) goto L92
            r1.add(r3)     // Catch: java.lang.Exception -> L19
            goto L92
        La8:
            r0.a(r1)     // Catch: java.lang.Exception -> L19
            com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel r7 = r6.this$0     // Catch: java.lang.Exception -> L19
            r7.l()     // Catch: java.lang.Exception -> L19
            com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel r7 = r6.this$0     // Catch: java.lang.Exception -> L19
            com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel.e(r7)     // Catch: java.lang.Exception -> L19
            r6.label = r2     // Catch: java.lang.Exception -> L19
            throw r5     // Catch: java.lang.Exception -> L19
        Lb8:
            com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel r6 = r6.this$0
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel.f(r6)
            u14$a r0 = new u14$a
            r0.<init>(r7)
            r6.setValue(r0)
        Lc6:
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel$reloadPage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((RecentlyViewedViewModel$reloadPage$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
