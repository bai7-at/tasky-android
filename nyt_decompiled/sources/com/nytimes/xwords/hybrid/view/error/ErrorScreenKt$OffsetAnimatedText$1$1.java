package com.nytimes.xwords.hybrid.view.error;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import defpackage.bu1;
import defpackage.by0;
import defpackage.di;
import defpackage.ei;
import defpackage.eu8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hu8;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$OffsetAnimatedText$1$1", f = "ErrorScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ErrorScreenKt$OffsetAnimatedText$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $alpha$delegate;
    final /* synthetic */ sy4 $offsetY$delegate;
    final /* synthetic */ ei $textAlphaAnimationSpec;
    final /* synthetic */ ei $textOffsetAnimationSpec;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$OffsetAnimatedText$1$1$1", f = "ErrorScreen.kt", l = {192}, m = "invokeSuspend")
    /* renamed from: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$OffsetAnimatedText$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ sy4 $offsetY$delegate;
        final /* synthetic */ ei $textOffsetAnimationSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ei eiVar, sy4 sy4Var, by0 by0Var) {
            super(2, by0Var);
            this.$textOffsetAnimationSpec = eiVar;
            this.$offsetY$delegate = sy4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$textOffsetAnimationSpec, this.$offsetY$delegate, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                hu8 b = VectorConvertersKt.b(bu1.b);
                bu1 d2 = bu1.d(bu1.g(40));
                bu1 d3 = bu1.d(bu1.g(0));
                eu8 j = di.j(this.$textOffsetAnimationSpec.b(), this.$textOffsetAnimationSpec.a(), this.$textOffsetAnimationSpec.c());
                final sy4 sy4Var = this.$offsetY$delegate;
                gt2 gt2Var = new gt2() { // from class: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt.OffsetAnimatedText.1.1.1.1
                    {
                        super(2);
                    }

                    public final void b(float f, float f2) {
                        ErrorScreenKt.i(sy4.this, f);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        b(((bu1) obj2).n(), ((bu1) obj3).n());
                        return ww8.a;
                    }
                };
                this.label = 1;
                d = SuspendAnimationKt.d(b, d2, d3, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? di.i(0.0f, 0.0f, null, 7, null) : j, gt2Var, this);
                if (d == h) {
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
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$OffsetAnimatedText$1$1$2", f = "ErrorScreen.kt", l = {206}, m = "invokeSuspend")
    /* renamed from: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$OffsetAnimatedText$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ sy4 $alpha$delegate;
        final /* synthetic */ ei $textAlphaAnimationSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ei eiVar, sy4 sy4Var, by0 by0Var) {
            super(2, by0Var);
            this.$textAlphaAnimationSpec = eiVar;
            this.$alpha$delegate = sy4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(this.$textAlphaAnimationSpec, this.$alpha$delegate, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                eu8 j = di.j(this.$textAlphaAnimationSpec.b(), this.$textAlphaAnimationSpec.a(), this.$textAlphaAnimationSpec.c());
                final sy4 sy4Var = this.$alpha$delegate;
                gt2 gt2Var = new gt2() { // from class: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt.OffsetAnimatedText.1.1.2.1
                    {
                        super(2);
                    }

                    public final void b(float f, float f2) {
                        ErrorScreenKt.g(sy4.this, f);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        b(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                        return ww8.a;
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.e(0.0f, 1.0f, 0.0f, j, gt2Var, this, 4, null) == h) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorScreenKt$OffsetAnimatedText$1$1(ei eiVar, sy4 sy4Var, ei eiVar2, sy4 sy4Var2, by0 by0Var) {
        super(2, by0Var);
        this.$textOffsetAnimationSpec = eiVar;
        this.$offsetY$delegate = sy4Var;
        this.$textAlphaAnimationSpec = eiVar2;
        this.$alpha$delegate = sy4Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ErrorScreenKt$OffsetAnimatedText$1$1 errorScreenKt$OffsetAnimatedText$1$1 = new ErrorScreenKt$OffsetAnimatedText$1$1(this.$textOffsetAnimationSpec, this.$offsetY$delegate, this.$textAlphaAnimationSpec, this.$alpha$delegate, by0Var);
        errorScreenKt$OffsetAnimatedText$1$1.L$0 = obj;
        return errorScreenKt$OffsetAnimatedText$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$textOffsetAnimationSpec, this.$offsetY$delegate, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$textAlphaAnimationSpec, this.$alpha$delegate, null), 3, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ErrorScreenKt$OffsetAnimatedText$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
