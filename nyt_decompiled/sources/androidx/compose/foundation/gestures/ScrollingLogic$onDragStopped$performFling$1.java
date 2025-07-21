package androidx.compose.foundation.gestures;

import com.comscore.streaming.ContentDeliveryAdvertisementCapability;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.u49;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", l = {ContentDeliveryAdvertisementCapability.LINEAR_1DAY, ContentDeliveryAdvertisementCapability.LINEAR_4DAY, ContentDeliveryAdvertisementCapability.LINEAR_7DAY}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements gt2 {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = scrollingLogic;
    }

    public final Object b(long j, by0 by0Var) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(u49.b(j), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, by0Var);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((u49) obj).o();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((u49) obj).o(), (by0) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.h()
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 == r3) goto L2d
            if (r0 == r2) goto L24
            if (r0 != r1) goto L1c
            long r0 = r13.J$1
            long r2 = r13.J$0
            kotlin.f.b(r14)
            r9 = r0
            r0 = r14
            goto L88
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L24:
            long r2 = r13.J$1
            long r7 = r13.J$0
            kotlin.f.b(r14)
            r0 = r14
            goto L67
        L2d:
            long r3 = r13.J$0
            kotlin.f.b(r14)
            r0 = r14
            goto L4b
        L34:
            kotlin.f.b(r14)
            long r7 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.b(r0)
            r13.J$0 = r7
            r13.label = r3
            java.lang.Object r0 = r0.c(r7, r13)
            if (r0 != r6) goto L4a
            return r6
        L4a:
            r3 = r7
        L4b:
            u49 r0 = (defpackage.u49) r0
            long r7 = r0.o()
            long r7 = defpackage.u49.k(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.d(r7, r13)
            if (r0 != r6) goto L64
            return r6
        L64:
            r11 = r3
            r2 = r7
            r7 = r11
        L67:
            u49 r0 = (defpackage.u49) r0
            long r9 = r0.o()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.b(r0)
            long r2 = defpackage.u49.k(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r1 = r2
            r3 = r9
            r5 = r13
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r6) goto L87
            return r6
        L87:
            r2 = r7
        L88:
            u49 r0 = (defpackage.u49) r0
            long r0 = r0.o()
            long r0 = defpackage.u49.k(r9, r0)
            long r0 = defpackage.u49.k(r2, r0)
            u49 r0 = defpackage.u49.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
