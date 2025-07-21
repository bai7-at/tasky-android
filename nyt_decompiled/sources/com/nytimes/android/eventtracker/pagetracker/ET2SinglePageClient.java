package com.nytimes.android.eventtracker.pagetracker;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import com.nytimes.android.eventtracker.AppLifecycleObserver;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import defpackage.d44;
import defpackage.ei1;
import defpackage.ix1;
import defpackage.q52;
import defpackage.tx1;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class ET2SinglePageClient implements ei1 {
    private final AppLifecycleObserver a;
    private final q52 b;
    private final MutableStateFlow c;
    private final ET2PageScope d;

    public ET2SinglePageClient(AppLifecycleObserver appLifecycleObserver, q52 q52Var) {
        zq3.h(appLifecycleObserver, "appLifecycle");
        zq3.h(q52Var, "eventTrackerUserGenerator");
        this.a = appLifecycleObserver;
        this.b = q52Var;
        this.c = StateFlowKt.MutableStateFlow(i.l());
        this.d = new ix1(this);
        Lifecycle lifecycle = l.i.a().getLifecycle();
        lifecycle.a(appLifecycleObserver);
        lifecycle.a(this);
    }

    public final ET2PageScope c() {
        return this.d;
    }

    public final MutableStateFlow d() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.e32 r19, java.lang.String r20, java.lang.String r21, defpackage.wt6 r22, defpackage.na2 r23, defpackage.qs2 r24, defpackage.ss2 r25, defpackage.ss2 r26, kotlinx.coroutines.CoroutineScope r27, defpackage.by0 r28) {
        /*
            r18 = this;
            r0 = r28
            boolean r1 = r0 instanceof com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$1
            if (r1 == 0) goto L17
            r1 = r0
            com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$1 r1 = (com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            r3 = r18
            goto L1e
        L17:
            com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$1 r1 = new com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$1
            r3 = r18
            r1.<init>(r3, r0)
        L1e:
            java.lang.Object r0 = r1.result
            java.lang.Object r14 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r1.label
            r15 = 1
            if (r2 == 0) goto L3d
            if (r2 == r15) goto L33
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            java.lang.Object r1 = r1.L$0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            kotlin.f.b(r0)     // Catch: java.util.concurrent.CancellationException -> L3b
            goto L8e
        L3b:
            r0 = move-exception
            goto L96
        L3d:
            kotlin.f.b(r0)
            com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$pageEnterWaiter$1 r7 = new com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$pageEnterWaiter$1
            r0 = 0
            r7.<init>(r0)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            r4 = r27
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt.async$default(r4, r5, r6, r7, r8, r9)
            kotlinx.coroutines.CoroutineDispatcher r16 = kotlinx.coroutines.Dispatchers.getUnconfined()
            com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$job$1 r17 = new com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$job$1
            r13 = 0
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r0
            r12 = r26
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = 2
            r3 = 0
            r4 = 0
            r18 = r27
            r19 = r16
            r20 = r4
            r21 = r17
            r22 = r2
            r23 = r3
            kotlinx.coroutines.Job r2 = kotlinx.coroutines.BuildersKt.launch$default(r18, r19, r20, r21, r22, r23)
            r1.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L94
            r1.label = r15     // Catch: java.util.concurrent.CancellationException -> L94
            java.lang.Object r0 = r0.await(r1)     // Catch: java.util.concurrent.CancellationException -> L94
            if (r0 != r14) goto L8d
            return r14
        L8d:
            r1 = r2
        L8e:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.util.concurrent.CancellationException -> L3b
            r0.<init>()     // Catch: java.util.concurrent.CancellationException -> L3b
            throw r0     // Catch: java.util.concurrent.CancellationException -> L3b
        L94:
            r0 = move-exception
            r1 = r2
        L96:
            ul8$b r2 = defpackage.ul8.a
            java.lang.String r3 = "ET2"
            ul8$c r2 = r2.z(r3)
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "PageEnter completed"
            r2.c(r0, r4, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient.e(e32, java.lang.String, java.lang.String, wt6, na2, qs2, ss2, ss2, kotlinx.coroutines.CoroutineScope, by0):java.lang.Object");
    }

    @Override // defpackage.ei1
    public void onStart(d44 d44Var) {
        zq3.h(d44Var, "owner");
        tx1 tx1Var = (tx1) i.y0((List) this.c.getValue());
        if (tx1Var == null || tx1Var.l()) {
            return;
        }
        tx1Var.m(true);
    }

    @Override // defpackage.ei1
    public void onStop(d44 d44Var) {
        zq3.h(d44Var, "owner");
        tx1 tx1Var = (tx1) i.y0((List) this.c.getValue());
        if (tx1Var == null || !tx1Var.l()) {
            return;
        }
        tx1Var.o();
    }
}
