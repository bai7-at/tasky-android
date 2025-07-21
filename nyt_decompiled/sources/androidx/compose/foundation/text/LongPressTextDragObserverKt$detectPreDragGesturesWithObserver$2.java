package androidx.compose.foundation.text;

import defpackage.a30;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.xh8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@fc1(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {99, 103}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements gt2 {
    final /* synthetic */ xh8 $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(xh8 xh8Var, by0 by0Var) {
        super(2, by0Var);
        this.$observer = xh8Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(a30 a30Var, by0 by0Var) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(a30Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, by0Var);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:6:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r12.L$1
            vx5 r1 = (defpackage.vx5) r1
            java.lang.Object r4 = r12.L$0
            a30 r4 = (defpackage.a30) r4
            kotlin.f.b(r13)
            goto L5e
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L22:
            java.lang.Object r1 = r12.L$0
            a30 r1 = (defpackage.a30) r1
            kotlin.f.b(r13)
            goto L43
        L2a:
            kotlin.f.b(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            a30 r1 = (defpackage.a30) r1
            r12.L$0 = r1
            r12.label = r3
            r5 = 0
            r6 = 0
            r8 = 2
            r9 = 0
            r4 = r1
            r7 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.e(r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L43
            return r0
        L43:
            vx5 r13 = (defpackage.vx5) r13
            xh8 r4 = r12.$observer
            long r5 = r13.i()
            r4.c(r5)
            r4 = r1
            r1 = r13
        L50:
            r12.L$0 = r4
            r12.L$1 = r1
            r12.label = r2
            r13 = 0
            java.lang.Object r13 = defpackage.a30.d0(r4, r13, r12, r3, r13)
            if (r13 != r0) goto L5e
            return r0
        L5e:
            androidx.compose.ui.input.pointer.c r13 = (androidx.compose.ui.input.pointer.c) r13
            java.util.List r13 = r13.c()
            int r5 = r13.size()
            r6 = 0
        L69:
            if (r6 >= r5) goto L89
            java.lang.Object r7 = r13.get(r6)
            vx5 r7 = (defpackage.vx5) r7
            long r8 = r7.g()
            long r10 = r1.g()
            boolean r8 = defpackage.tx5.d(r8, r10)
            if (r8 == 0) goto L86
            boolean r7 = r7.j()
            if (r7 == 0) goto L86
            goto L50
        L86:
            int r6 = r6 + 1
            goto L69
        L89:
            xh8 r12 = r12.$observer
            r12.e()
            ww8 r12 = defpackage.ww8.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
