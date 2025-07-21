package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import defpackage.a30;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.android.kt", l = {320}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AndroidEdgeEffectOverscrollEffect$effectModifier$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    @fc1(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.android.kt", l = {321, 325}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements gt2 {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = androidEdgeEffectOverscrollEffect;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a30 a30Var, by0 by0Var) {
            return ((AnonymousClass1) create(a30Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x007e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0064 -> B:6:0x0067). Please report as a decompilation issue!!! */
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
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r12.L$0
                a30 r1 = (defpackage.a30) r1
                kotlin.f.b(r13)
                goto L67
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L1f:
                java.lang.Object r1 = r12.L$0
                a30 r1 = (defpackage.a30) r1
                kotlin.f.b(r13)
                goto L40
            L27:
                kotlin.f.b(r13)
                java.lang.Object r13 = r12.L$0
                r1 = r13
                a30 r1 = (defpackage.a30) r1
                r12.L$0 = r1
                r12.label = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r1
                r8 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.e(r5, r6, r7, r8, r9, r10)
                if (r13 != r0) goto L40
                return r0
            L40:
                vx5 r13 = (defpackage.vx5) r13
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r12.this$0
                long r6 = r13.g()
                tx5 r6 = defpackage.tx5.a(r6)
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.r(r5, r6)
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r12.this$0
                long r6 = r13.i()
                fd5 r13 = defpackage.fd5.d(r6)
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.s(r5, r13)
            L5c:
                r12.L$0 = r1
                r12.label = r2
                java.lang.Object r13 = defpackage.a30.d0(r1, r3, r12, r4, r3)
                if (r13 != r0) goto L67
                return r0
            L67:
                androidx.compose.ui.input.pointer.c r13 = (androidx.compose.ui.input.pointer.c) r13
                java.util.List r13 = r13.c()
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = r13.size()
                r5.<init>(r6)
                int r6 = r13.size()
                r7 = 0
                r8 = r7
            L7c:
                if (r8 >= r6) goto L91
                java.lang.Object r9 = r13.get(r8)
                r10 = r9
                vx5 r10 = (defpackage.vx5) r10
                boolean r10 = r10.j()
                if (r10 == 0) goto L8e
                r5.add(r9)
            L8e:
                int r8 = r8 + 1
                goto L7c
            L91:
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r13 = r12.this$0
                int r6 = r5.size()
            L97:
                if (r7 >= r6) goto Lb2
                java.lang.Object r8 = r5.get(r7)
                r9 = r8
                vx5 r9 = (defpackage.vx5) r9
                long r9 = r9.g()
                tx5 r11 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.k(r13)
                boolean r9 = defpackage.tx5.c(r9, r11)
                if (r9 == 0) goto Laf
                goto Lb3
            Laf:
                int r7 = r7 + 1
                goto L97
            Lb2:
                r8 = r3
            Lb3:
                vx5 r8 = (defpackage.vx5) r8
                if (r8 != 0) goto Lbe
                java.lang.Object r13 = kotlin.collections.i.m0(r5)
                r8 = r13
                vx5 r8 = (defpackage.vx5) r8
            Lbe:
                if (r8 == 0) goto Lda
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r13 = r12.this$0
                long r6 = r8.g()
                tx5 r6 = defpackage.tx5.a(r6)
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.r(r13, r6)
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r13 = r12.this$0
                long r6 = r8.i()
                fd5 r6 = defpackage.fd5.d(r6)
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.s(r13, r6)
            Lda:
                boolean r13 = r5.isEmpty()
                if (r13 == 0) goto L5c
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r12 = r12.this$0
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.r(r12, r3)
                ww8 r12 = defpackage.ww8.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$effectModifier$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fy5 fy5Var, by0 by0Var) {
        return ((AndroidEdgeEffectOverscrollEffect$effectModifier$1) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this.this$0, by0Var);
        androidEdgeEffectOverscrollEffect$effectModifier$1.L$0 = obj;
        return androidEdgeEffectOverscrollEffect$effectModifier$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            fy5 fy5Var = (fy5) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (ForEachGestureKt.c(fy5Var, anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
