package androidx.compose.foundation.gestures;

import com.comscore.streaming.AdvertisementType;
import defpackage.a30;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ss2;
import defpackage.vx5;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ it2 $onPress;
    final /* synthetic */ ss2 $onTap;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    final /* synthetic */ fy5 $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements gt2 {
        final /* synthetic */ CoroutineScope $$this$coroutineScope;
        final /* synthetic */ it2 $onPress;
        final /* synthetic */ ss2 $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        @fc1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {AdvertisementType.BRANDED_AS_CONTENT}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00231 extends SuspendLambda implements gt2 {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00231(PressGestureScopeImpl pressGestureScopeImpl, by0 by0Var) {
                super(2, by0Var);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new C00231(this.$pressScope, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object h = kotlin.coroutines.intrinsics.a.h();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    this.label = 1;
                    if (pressGestureScopeImpl.f(this) == h) {
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
            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                return ((C00231) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        @fc1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements gt2 {
            final /* synthetic */ vx5 $down;
            final /* synthetic */ it2 $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(it2 it2Var, PressGestureScopeImpl pressGestureScopeImpl, vx5 vx5Var, by0 by0Var) {
                super(2, by0Var);
                this.$onPress = it2Var;
                this.$pressScope = pressGestureScopeImpl;
                this.$down = vx5Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new AnonymousClass2(this.$onPress, this.$pressScope, this.$down, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object h = kotlin.coroutines.intrinsics.a.h();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    it2 it2Var = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    fd5 d = fd5.d(this.$down.i());
                    this.label = 1;
                    if (it2Var.invoke(pressGestureScopeImpl, d, this) == h) {
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
            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        @fc1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements gt2 {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, by0 by0Var) {
                super(2, by0Var);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new AnonymousClass3(this.$pressScope, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                this.$pressScope.d();
                return ww8.a;
            }

            @Override // defpackage.gt2
            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                return ((AnonymousClass3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        @fc1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements gt2 {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, by0 by0Var) {
                super(2, by0Var);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new AnonymousClass4(this.$pressScope, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                this.$pressScope.e();
                return ww8.a;
            }

            @Override // defpackage.gt2
            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                return ((AnonymousClass4) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CoroutineScope coroutineScope, it2 it2Var, ss2 ss2Var, PressGestureScopeImpl pressGestureScopeImpl, by0 by0Var) {
            super(2, by0Var);
            this.$$this$coroutineScope = coroutineScope;
            this.$onPress = it2Var;
            this.$onTap = ss2Var;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a30 a30Var, by0 by0Var) {
            return ((AnonymousClass1) create(a30Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r6 = r18
                java.lang.Object r7 = kotlin.coroutines.intrinsics.a.h()
                int r0 = r6.label
                r8 = 2
                r9 = 1
                r10 = 0
                if (r0 == 0) goto L2a
                if (r0 == r9) goto L1f
                if (r0 != r8) goto L17
                kotlin.f.b(r19)
                r0 = r19
                goto L7d
            L17:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1f:
                java.lang.Object r0 = r6.L$0
                a30 r0 = (defpackage.a30) r0
                kotlin.f.b(r19)
                r11 = r0
                r0 = r19
                goto L51
            L2a:
                kotlin.f.b(r19)
                java.lang.Object r0 = r6.L$0
                r11 = r0
                a30 r11 = (defpackage.a30) r11
                kotlinx.coroutines.CoroutineScope r0 = r6.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r6.$pressScope
                r3.<init>(r1, r10)
                r4 = 3
                r5 = 0
                r1 = 0
                r2 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                r6.L$0 = r11
                r6.label = r9
                r1 = 0
                r0 = r11
                r3 = r18
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.e(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L51
                return r7
            L51:
                vx5 r0 = (defpackage.vx5) r0
                r0.a()
                it2 r1 = r6.$onPress
                it2 r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c()
                if (r1 == r2) goto L72
                kotlinx.coroutines.CoroutineScope r12 = r6.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r15 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                it2 r1 = r6.$onPress
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r6.$pressScope
                r15.<init>(r1, r2, r0, r10)
                r16 = 3
                r17 = 0
                r13 = 0
                r14 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r12, r13, r14, r15, r16, r17)
            L72:
                r6.L$0 = r10
                r6.label = r8
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.l(r11, r10, r6, r9, r10)
                if (r0 != r7) goto L7d
                return r7
            L7d:
                vx5 r0 = (defpackage.vx5) r0
                if (r0 != 0) goto L92
                kotlinx.coroutines.CoroutineScope r1 = r6.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r4 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r6.$pressScope
                r4.<init>(r0, r10)
                r5 = 3
                r6 = 0
                r2 = 0
                r3 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
                goto Lb5
            L92:
                r0.a()
                kotlinx.coroutines.CoroutineScope r7 = r6.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r6.$pressScope
                r1.<init>(r2, r10)
                r11 = 3
                r12 = 0
                r8 = 0
                r9 = 0
                r10 = r1
                kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
                ss2 r1 = r6.$onTap
                if (r1 == 0) goto Lb5
                long r2 = r0.i()
                fd5 r0 = defpackage.fd5.d(r2)
                r1.invoke(r0)
            Lb5:
                ww8 r0 = defpackage.ww8.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$detectTapAndPress$2(fy5 fy5Var, it2 it2Var, ss2 ss2Var, PressGestureScopeImpl pressGestureScopeImpl, by0 by0Var) {
        super(2, by0Var);
        this.$this_detectTapAndPress = fy5Var;
        this.$onPress = it2Var;
        this.$onTap = ss2Var;
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, by0Var);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            fy5 fy5Var = this.$this_detectTapAndPress;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            if (ForEachGestureKt.c(fy5Var, anonymousClass1, this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
