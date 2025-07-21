package androidx.compose.animation.core;

import defpackage.by0;
import defpackage.ci;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

@fc1(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {419}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnimateAsStateKt$animateValueAsState$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ x08 $animSpec$delegate;
    final /* synthetic */ Animatable $animatable;
    final /* synthetic */ Channel<Object> $channel;
    final /* synthetic */ x08 $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @fc1(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {428}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ x08 $animSpec$delegate;
        final /* synthetic */ Animatable $animatable;
        final /* synthetic */ x08 $listener$delegate;
        final /* synthetic */ Object $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj, Animatable animatable, x08 x08Var, x08 x08Var2, by0 by0Var) {
            super(2, by0Var);
            this.$newTarget = obj;
            this.$animatable = animatable;
            this.$animSpec$delegate = x08Var;
            this.$listener$delegate = x08Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ci g;
            ss2 f;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                if (!zq3.c(this.$newTarget, this.$animatable.k())) {
                    Animatable animatable = this.$animatable;
                    Object obj2 = this.$newTarget;
                    g = AnimateAsStateKt.g(this.$animSpec$delegate);
                    this.label = 1;
                    if (Animatable.f(animatable, obj2, g, null, null, this, 12, null) == h) {
                        return h;
                    }
                }
                return ww8.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            f = AnimateAsStateKt.f(this.$listener$delegate);
            if (f != null) {
                f.invoke(this.$animatable.m());
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimateAsStateKt$animateValueAsState$3(Channel channel, Animatable animatable, x08 x08Var, x08 x08Var2, by0 by0Var) {
        super(2, by0Var);
        this.$channel = channel;
        this.$animatable = animatable;
        this.$animSpec$delegate = x08Var;
        this.$listener$delegate = x08Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, by0Var);
        animateAsStateKt$animateValueAsState$3.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003a -> B:5:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r14.label
            r3 = 1
            if (r2 == 0) goto L20
            if (r2 != r3) goto L18
            java.lang.Object r2 = r14.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r14.L$0
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.f.b(r15)
            r5 = r15
            goto L3d
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L20:
            kotlin.f.b(r15)
            java.lang.Object r2 = r14.L$0
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlinx.coroutines.channels.Channel<java.lang.Object> r4 = r14.$channel
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            r13 = r4
            r4 = r2
            r2 = r13
        L30:
            r14.L$0 = r4
            r14.L$1 = r2
            r14.label = r3
            java.lang.Object r5 = r2.hasNext(r14)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r2.next()
            kotlinx.coroutines.channels.Channel<java.lang.Object> r6 = r14.$channel
            java.lang.Object r6 = r6.mo887tryReceivePtdJZtk()
            java.lang.Object r6 = kotlinx.coroutines.channels.ChannelResult.m897getOrNullimpl(r6)
            if (r6 != 0) goto L57
            r8 = r5
            goto L58
        L57:
            r8 = r6
        L58:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r5 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            androidx.compose.animation.core.Animatable r9 = r14.$animatable
            x08 r10 = r14.$animSpec$delegate
            x08 r11 = r14.$listener$delegate
            r12 = 0
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            r6 = r4
            r9 = r5
            kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
            goto L30
        L6f:
            ww8 r0 = defpackage.ww8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
