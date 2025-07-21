package androidx.compose.foundation.gestures;

import com.comscore.streaming.AdvertisementType;
import defpackage.a30;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@fc1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {AdvertisementType.BRANDED_AS_CONTENT, AdvertisementType.BRANDED_DURING_LIVE, 240}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends RestrictedSuspendLambda implements gt2 {
    final /* synthetic */ gt2 $onDrag;
    final /* synthetic */ qs2 $onDragCancel;
    final /* synthetic */ qs2 $onDragEnd;
    final /* synthetic */ ss2 $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(ss2 ss2Var, qs2 qs2Var, qs2 qs2Var2, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.$onDragStart = ss2Var;
        this.$onDragEnd = qs2Var;
        this.$onDragCancel = qs2Var2;
        this.$onDrag = gt2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(a30 a30Var, by0 by0Var) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(a30Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, by0Var);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008e A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:9:0x0086, B:11:0x008e, B:13:0x009d, B:15:0x00a9, B:17:0x00ac, B:20:0x00af, B:24:0x00b5, B:28:0x0028, B:29:0x005e, B:31:0x0062, B:36:0x0030, B:37:0x004d, B:41:0x003c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5 A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:9:0x0086, B:11:0x008e, B:13:0x009d, B:15:0x00a9, B:17:0x00ac, B:20:0x00af, B:24:0x00b5, B:28:0x0028, B:29:0x005e, B:31:0x0062, B:36:0x0030, B:37:0x004d, B:41:0x003c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:9:0x0086, B:11:0x008e, B:13:0x009d, B:15:0x00a9, B:17:0x00ac, B:20:0x00af, B:24:0x00b5, B:28:0x0028, B:29:0x005e, B:31:0x0062, B:36:0x0030, B:37:0x004d, B:41:0x003c), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r0 = r11.L$0
            a30 r0 = (defpackage.a30) r0
            kotlin.f.b(r12)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L86
        L19:
            r12 = move-exception
            goto Lbd
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L24:
            java.lang.Object r1 = r11.L$0
            a30 r1 = (defpackage.a30) r1
            kotlin.f.b(r12)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L5e
        L2c:
            java.lang.Object r1 = r11.L$0
            a30 r1 = (defpackage.a30) r1
            kotlin.f.b(r12)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L4d
        L34:
            kotlin.f.b(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            a30 r1 = (defpackage.a30) r1
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L19
            r11.label = r4     // Catch: java.util.concurrent.CancellationException -> L19
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r5 = r1
            r8 = r11
            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.e(r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r12 != r0) goto L4d
            return r0
        L4d:
            vx5 r12 = (defpackage.vx5) r12     // Catch: java.util.concurrent.CancellationException -> L19
            long r4 = r12.g()     // Catch: java.util.concurrent.CancellationException -> L19
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L19
            r11.label = r3     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.c(r1, r4, r11)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r12 != r0) goto L5e
            return r0
        L5e:
            vx5 r12 = (defpackage.vx5) r12     // Catch: java.util.concurrent.CancellationException -> L19
            if (r12 == 0) goto Lba
            ss2 r3 = r11.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L19
            long r4 = r12.i()     // Catch: java.util.concurrent.CancellationException -> L19
            fd5 r4 = defpackage.fd5.d(r4)     // Catch: java.util.concurrent.CancellationException -> L19
            r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L19
            long r3 = r12.g()     // Catch: java.util.concurrent.CancellationException -> L19
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1     // Catch: java.util.concurrent.CancellationException -> L19
            gt2 r5 = r11.$onDrag     // Catch: java.util.concurrent.CancellationException -> L19
            r12.<init>()     // Catch: java.util.concurrent.CancellationException -> L19
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L19
            r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.f(r1, r3, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r12 != r0) goto L85
            return r0
        L85:
            r0 = r1
        L86:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> L19
            boolean r12 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L19
            if (r12 == 0) goto Lb5
            androidx.compose.ui.input.pointer.c r12 = r0.I0()     // Catch: java.util.concurrent.CancellationException -> L19
            java.util.List r12 = r12.c()     // Catch: java.util.concurrent.CancellationException -> L19
            int r0 = r12.size()     // Catch: java.util.concurrent.CancellationException -> L19
            r1 = 0
        L9b:
            if (r1 >= r0) goto Laf
            java.lang.Object r2 = r12.get(r1)     // Catch: java.util.concurrent.CancellationException -> L19
            vx5 r2 = (defpackage.vx5) r2     // Catch: java.util.concurrent.CancellationException -> L19
            boolean r3 = defpackage.nx5.c(r2)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r3 == 0) goto Lac
            r2.a()     // Catch: java.util.concurrent.CancellationException -> L19
        Lac:
            int r1 = r1 + 1
            goto L9b
        Laf:
            qs2 r12 = r11.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L19
            r12.mo865invoke()     // Catch: java.util.concurrent.CancellationException -> L19
            goto Lba
        Lb5:
            qs2 r12 = r11.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L19
            r12.mo865invoke()     // Catch: java.util.concurrent.CancellationException -> L19
        Lba:
            ww8 r11 = defpackage.ww8.a
            return r11
        Lbd:
            qs2 r11 = r11.$onDragCancel
            r11.mo865invoke()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
