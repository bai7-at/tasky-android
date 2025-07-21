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

@fc1(c = "com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$PrimaryAnimatedButton$1$1", f = "ErrorScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ErrorScreenKt$PrimaryAnimatedButton$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $buttonAlpha$delegate;
    final /* synthetic */ ei $buttonAlphaAnimationSpec;
    final /* synthetic */ ei $buttonSizeAnimationSpec;
    final /* synthetic */ ei $buttonTextAlphaAnimationSpec;
    final /* synthetic */ sy4 $buttonWidth$delegate;
    final /* synthetic */ sy4 $testAlpha$delegate;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$PrimaryAnimatedButton$1$1$1", f = "ErrorScreen.kt", l = {250}, m = "invokeSuspend")
    /* renamed from: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$PrimaryAnimatedButton$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ ei $buttonSizeAnimationSpec;
        final /* synthetic */ sy4 $buttonWidth$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ei eiVar, sy4 sy4Var, by0 by0Var) {
            super(2, by0Var);
            this.$buttonSizeAnimationSpec = eiVar;
            this.$buttonWidth$delegate = sy4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$buttonSizeAnimationSpec, this.$buttonWidth$delegate, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                hu8 b = VectorConvertersKt.b(bu1.b);
                bu1 d2 = bu1.d(bu1.g(55));
                bu1 d3 = bu1.d(bu1.g(150));
                eu8 j = di.j(this.$buttonSizeAnimationSpec.b(), this.$buttonSizeAnimationSpec.a(), this.$buttonSizeAnimationSpec.c());
                final sy4 sy4Var = this.$buttonWidth$delegate;
                gt2 gt2Var = new gt2() { // from class: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt.PrimaryAnimatedButton.1.1.1.1
                    {
                        super(2);
                    }

                    public final void b(float f, float f2) {
                        ErrorScreenKt.m(sy4.this, f);
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

    @fc1(c = "com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$PrimaryAnimatedButton$1$1$2", f = "ErrorScreen.kt", l = {265}, m = "invokeSuspend")
    /* renamed from: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$PrimaryAnimatedButton$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ sy4 $buttonAlpha$delegate;
        final /* synthetic */ ei $buttonAlphaAnimationSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ei eiVar, sy4 sy4Var, by0 by0Var) {
            super(2, by0Var);
            this.$buttonAlphaAnimationSpec = eiVar;
            this.$buttonAlpha$delegate = sy4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(this.$buttonAlphaAnimationSpec, this.$buttonAlpha$delegate, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                eu8 j = di.j(this.$buttonAlphaAnimationSpec.b(), this.$buttonAlphaAnimationSpec.a(), this.$buttonAlphaAnimationSpec.c());
                final sy4 sy4Var = this.$buttonAlpha$delegate;
                gt2 gt2Var = new gt2() { // from class: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt.PrimaryAnimatedButton.1.1.2.1
                    {
                        super(2);
                    }

                    public final void b(float f, float f2) {
                        ErrorScreenKt.o(sy4.this, f);
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

    @fc1(c = "com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$PrimaryAnimatedButton$1$1$3", f = "ErrorScreen.kt", l = {279}, m = "invokeSuspend")
    /* renamed from: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$PrimaryAnimatedButton$1$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements gt2 {
        final /* synthetic */ ei $buttonTextAlphaAnimationSpec;
        final /* synthetic */ sy4 $testAlpha$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ei eiVar, sy4 sy4Var, by0 by0Var) {
            super(2, by0Var);
            this.$buttonTextAlphaAnimationSpec = eiVar;
            this.$testAlpha$delegate = sy4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass3(this.$buttonTextAlphaAnimationSpec, this.$testAlpha$delegate, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                eu8 j = di.j(this.$buttonTextAlphaAnimationSpec.b(), this.$buttonTextAlphaAnimationSpec.a(), this.$buttonTextAlphaAnimationSpec.c());
                final sy4 sy4Var = this.$testAlpha$delegate;
                gt2 gt2Var = new gt2() { // from class: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt.PrimaryAnimatedButton.1.1.3.1
                    {
                        super(2);
                    }

                    public final void b(float f, float f2) {
                        ErrorScreenKt.q(sy4.this, f);
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
            return ((AnonymousClass3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorScreenKt$PrimaryAnimatedButton$1$1(ei eiVar, sy4 sy4Var, ei eiVar2, sy4 sy4Var2, ei eiVar3, sy4 sy4Var3, by0 by0Var) {
        super(2, by0Var);
        this.$buttonSizeAnimationSpec = eiVar;
        this.$buttonWidth$delegate = sy4Var;
        this.$buttonAlphaAnimationSpec = eiVar2;
        this.$buttonAlpha$delegate = sy4Var2;
        this.$buttonTextAlphaAnimationSpec = eiVar3;
        this.$testAlpha$delegate = sy4Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ErrorScreenKt$PrimaryAnimatedButton$1$1 errorScreenKt$PrimaryAnimatedButton$1$1 = new ErrorScreenKt$PrimaryAnimatedButton$1$1(this.$buttonSizeAnimationSpec, this.$buttonWidth$delegate, this.$buttonAlphaAnimationSpec, this.$buttonAlpha$delegate, this.$buttonTextAlphaAnimationSpec, this.$testAlpha$delegate, by0Var);
        errorScreenKt$PrimaryAnimatedButton$1$1.L$0 = obj;
        return errorScreenKt$PrimaryAnimatedButton$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$buttonSizeAnimationSpec, this.$buttonWidth$delegate, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$buttonAlphaAnimationSpec, this.$buttonAlpha$delegate, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.$buttonTextAlphaAnimationSpec, this.$testAlpha$delegate, null), 3, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ErrorScreenKt$PrimaryAnimatedButton$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
