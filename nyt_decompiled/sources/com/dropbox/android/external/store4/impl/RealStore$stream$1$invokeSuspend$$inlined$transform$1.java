package com.dropbox.android.external.store4.impl;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.a38;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1", f = "RealStore.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RealStore$stream$1$invokeSuspend$$inlined$transform$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $cachedToEmit$inlined;
    final /* synthetic */ a38 $request$inlined;
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RealStore this$0;

    /* renamed from: com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 implements FlowCollector {
        final /* synthetic */ FlowCollector a;
        final /* synthetic */ Object b;
        final /* synthetic */ RealStore c;
        final /* synthetic */ a38 d;

        @fc1(c = "com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1$1", f = "RealStore.kt", l = {136, 139}, m = "emit")
        /* renamed from: com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01631 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public C01631(by0 by0Var) {
                super(by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= RecyclerView.UNDEFINED_DURATION;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, Object obj, RealStore realStore, a38 a38Var) {
            this.b = obj;
            this.c = realStore;
            this.d = a38Var;
            this.a = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(java.lang.Object r6, defpackage.by0 r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1.AnonymousClass1.C01631
                if (r0 == 0) goto L13
                r0 = r7
                com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1$1$1 r0 = (com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1.AnonymousClass1.C01631) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1$1$1 r0 = new com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1$1$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.f.b(r7)
                goto L91
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.L$2
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                java.lang.Object r6 = r0.L$1
                b38 r6 = (defpackage.b38) r6
                java.lang.Object r2 = r0.L$0
                com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1$1 r2 = (com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1.AnonymousClass1) r2
                kotlin.f.b(r7)
                r7 = r5
                r5 = r2
                goto L5c
            L46:
                kotlin.f.b(r7)
                kotlinx.coroutines.flow.FlowCollector r7 = r5.a
                b38 r6 = (defpackage.b38) r6
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r7
                r0.label = r4
                java.lang.Object r2 = r7.emit(r6, r0)
                if (r2 != r1) goto L5c
                return r1
            L5c:
                boolean r6 = r6 instanceof b38.d
                if (r6 == 0) goto L91
                java.lang.Object r6 = r5.b
                if (r6 != 0) goto L91
                com.dropbox.android.external.store4.impl.RealStore r6 = r5.c
                dg0 r6 = com.dropbox.android.external.store4.impl.RealStore.e(r6)
                if (r6 != 0) goto L6d
                goto L91
            L6d:
                a38 r5 = r5.d
                java.lang.Object r5 = r5.b()
                java.lang.Object r5 = r6.e(r5)
                if (r5 != 0) goto L7a
                goto L91
            L7a:
                b38$a r6 = new b38$a
                com.dropbox.android.external.store4.ResponseOrigin r2 = com.dropbox.android.external.store4.ResponseOrigin.Cache
                r6.<init>(r5, r2)
                r5 = 0
                r0.L$0 = r5
                r0.L$1 = r5
                r0.L$2 = r5
                r0.label = r3
                java.lang.Object r5 = r7.emit(r6, r0)
                if (r5 != r1) goto L91
                return r1
            L91:
                ww8 r5 = defpackage.ww8.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, by0):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealStore$stream$1$invokeSuspend$$inlined$transform$1(Flow flow, by0 by0Var, Object obj, RealStore realStore, a38 a38Var) {
        super(2, by0Var);
        this.$this_transform = flow;
        this.$cachedToEmit$inlined = obj;
        this.this$0 = realStore;
        this.$request$inlined = a38Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        RealStore$stream$1$invokeSuspend$$inlined$transform$1 realStore$stream$1$invokeSuspend$$inlined$transform$1 = new RealStore$stream$1$invokeSuspend$$inlined$transform$1(this.$this_transform, by0Var, this.$cachedToEmit$inlined, this.this$0, this.$request$inlined);
        realStore$stream$1$invokeSuspend$$inlined$transform$1.L$0 = obj;
        return realStore$stream$1$invokeSuspend$$inlined$transform$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.$cachedToEmit$inlined, this.this$0, this.$request$inlined);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((RealStore$stream$1$invokeSuspend$$inlined$transform$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
