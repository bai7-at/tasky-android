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
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.RealStore$diskNetworkCombined$$inlined$transform$1", f = "RealStore.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RealStore$diskNetworkCombined$$inlined$transform$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ CompletableDeferred $diskLock$inlined;
    final /* synthetic */ CompletableDeferred $networkLock$inlined;
    final /* synthetic */ a38 $request$inlined;
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.dropbox.android.external.store4.impl.RealStore$diskNetworkCombined$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 implements FlowCollector {
        final /* synthetic */ FlowCollector a;
        final /* synthetic */ CompletableDeferred b;
        final /* synthetic */ a38 c;
        final /* synthetic */ CompletableDeferred d;

        @fc1(c = "com.dropbox.android.external.store4.impl.RealStore$diskNetworkCombined$$inlined$transform$1$1", f = "RealStore.kt", l = {149, 158, 168}, m = "emit")
        /* renamed from: com.dropbox.android.external.store4.impl.RealStore$diskNetworkCombined$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01621 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C01621(by0 by0Var) {
                super(by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= RecyclerView.UNDEFINED_DURATION;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, CompletableDeferred completableDeferred, a38 a38Var, CompletableDeferred completableDeferred2) {
            this.b = completableDeferred;
            this.c = a38Var;
            this.d = completableDeferred2;
            this.a = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(java.lang.Object r8, defpackage.by0 r9) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.impl.RealStore$diskNetworkCombined$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, by0):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealStore$diskNetworkCombined$$inlined$transform$1(Flow flow, by0 by0Var, CompletableDeferred completableDeferred, a38 a38Var, CompletableDeferred completableDeferred2) {
        super(2, by0Var);
        this.$this_transform = flow;
        this.$diskLock$inlined = completableDeferred;
        this.$request$inlined = a38Var;
        this.$networkLock$inlined = completableDeferred2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        RealStore$diskNetworkCombined$$inlined$transform$1 realStore$diskNetworkCombined$$inlined$transform$1 = new RealStore$diskNetworkCombined$$inlined$transform$1(this.$this_transform, by0Var, this.$diskLock$inlined, this.$request$inlined, this.$networkLock$inlined);
        realStore$diskNetworkCombined$$inlined$transform$1.L$0 = obj;
        return realStore$diskNetworkCombined$$inlined$transform$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.$diskLock$inlined, this.$request$inlined, this.$networkLock$inlined);
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
        return ((RealStore$diskNetworkCombined$$inlined$transform$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
