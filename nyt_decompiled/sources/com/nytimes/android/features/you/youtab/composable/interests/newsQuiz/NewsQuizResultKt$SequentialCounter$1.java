package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.yx4;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$SequentialCounter$1", f = "NewsQuizResult.kt", l = {353}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NewsQuizResultKt$SequentialCounter$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Animatable $animatedFontSize;
    final /* synthetic */ yx4 $currentValue$delegate;
    final /* synthetic */ float $defaultFontSize;
    final /* synthetic */ long $intervalMillis;
    final /* synthetic */ sy4 $isBouncingAnimation$delegate;
    final /* synthetic */ float $scaleFactor;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ float $score;
    float F$0;
    int label;

    @fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$SequentialCounter$1$1", f = "NewsQuizResult.kt", l = {334, 339, 344}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$SequentialCounter$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Animatable $animatedFontSize;
        final /* synthetic */ float $defaultFontSize;
        final /* synthetic */ sy4 $isBouncingAnimation$delegate;
        final /* synthetic */ float $scaleFactor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable animatable, float f, float f2, sy4 sy4Var, by0 by0Var) {
            super(2, by0Var);
            this.$animatedFontSize = animatable;
            this.$defaultFontSize = f;
            this.$scaleFactor = f2;
            this.$isBouncingAnimation$delegate = sy4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$animatedFontSize, this.$defaultFontSize, this.$scaleFactor, this.$isBouncingAnimation$delegate, by0Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r8 = kotlin.coroutines.intrinsics.a.h()
                int r0 = r13.label
                r9 = 3
                r10 = 0
                r1 = 1
                r11 = 0
                r12 = 2
                if (r0 == 0) goto L28
                if (r0 == r1) goto L24
                if (r0 == r12) goto L20
                if (r0 != r9) goto L18
                kotlin.f.b(r14)
                goto L9e
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                kotlin.f.b(r14)
                goto L7d
            L24:
                kotlin.f.b(r14)
                goto L58
            L28:
                kotlin.f.b(r14)
                sy4 r0 = r13.$isBouncingAnimation$delegate
                com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.v(r0, r1)
                androidx.compose.animation.core.Animatable r0 = r13.$animatedFontSize
                float r2 = r13.$defaultFontSize
                float r3 = r13.$scaleFactor
                float r2 = r2 * r3
                java.lang.Float r2 = defpackage.cc0.b(r2)
                r3 = 200(0xc8, float:2.8E-43)
                vx1 r4 = defpackage.xx1.c()
                eu8 r3 = defpackage.di.k(r3, r11, r4, r12, r10)
                r13.label = r1
                r4 = 0
                r5 = 0
                r6 = 12
                r7 = 0
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r13
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.f(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r8) goto L58
                return r8
            L58:
                androidx.compose.animation.core.Animatable r0 = r13.$animatedFontSize
                float r1 = r13.$defaultFontSize
                r2 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r2
                java.lang.Float r1 = defpackage.cc0.b(r1)
                r2 = 150(0x96, float:2.1E-43)
                vx1 r3 = defpackage.xx1.c()
                eu8 r2 = defpackage.di.k(r2, r11, r3, r12, r10)
                r13.label = r12
                r3 = 0
                r4 = 0
                r6 = 12
                r7 = 0
                r5 = r13
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.f(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r8) goto L7d
                return r8
            L7d:
                androidx.compose.animation.core.Animatable r0 = r13.$animatedFontSize
                float r1 = r13.$defaultFontSize
                java.lang.Float r1 = defpackage.cc0.b(r1)
                r2 = 100
                vx1 r3 = defpackage.xx1.c()
                eu8 r2 = defpackage.di.k(r2, r11, r3, r12, r10)
                r13.label = r9
                r3 = 0
                r4 = 0
                r6 = 12
                r7 = 0
                r5 = r13
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.f(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r8) goto L9e
                return r8
            L9e:
                sy4 r0 = r13.$isBouncingAnimation$delegate
                com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.v(r0, r11)
                ww8 r0 = defpackage.ww8.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$SequentialCounter$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsQuizResultKt$SequentialCounter$1(float f, CoroutineScope coroutineScope, long j, yx4 yx4Var, Animatable animatable, float f2, float f3, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$score = f;
        this.$scope = coroutineScope;
        this.$intervalMillis = j;
        this.$currentValue$delegate = yx4Var;
        this.$animatedFontSize = animatable;
        this.$defaultFontSize = f2;
        this.$scaleFactor = f3;
        this.$isBouncingAnimation$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NewsQuizResultKt$SequentialCounter$1(this.$score, this.$scope, this.$intervalMillis, this.$currentValue$delegate, this.$animatedFontSize, this.$defaultFontSize, this.$scaleFactor, this.$isBouncingAnimation$delegate, by0Var);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0033 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            float r1 = r10.F$0
            kotlin.f.b(r11)
            goto L29
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L19:
            kotlin.f.b(r11)
            yx4 r11 = r10.$currentValue$delegate
            r1 = 0
            com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.u(r11, r1)
            float r11 = r10.$score
            r1 = 1062836634(0x3f59999a, float:0.85)
            float r11 = r11 * r1
            r1 = r11
        L29:
            yx4 r11 = r10.$currentValue$delegate
            float r11 = com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.t(r11)
            float r3 = r10.$score
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 >= 0) goto L8c
            yx4 r11 = r10.$currentValue$delegate
            float r11 = com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.t(r11)
            int r11 = (int) r11
            float r3 = r10.$score
            int r3 = (int) r3
            if (r11 != r3) goto L4e
            yx4 r11 = r10.$currentValue$delegate
            float r3 = com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.t(r11)
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.u(r11, r3)
            goto L5c
        L4e:
            yx4 r11 = r10.$currentValue$delegate
            float r11 = com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.t(r11)
            yx4 r3 = r10.$currentValue$delegate
            r4 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 + r4
            com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.u(r3, r11)
        L5c:
            yx4 r11 = r10.$currentValue$delegate
            float r11 = com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.t(r11)
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 != 0) goto L7f
            kotlinx.coroutines.CoroutineScope r3 = r10.$scope
            com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$SequentialCounter$1$1 r11 = new com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$SequentialCounter$1$1
            androidx.compose.animation.core.Animatable r5 = r10.$animatedFontSize
            float r6 = r10.$defaultFontSize
            float r7 = r10.$scaleFactor
            sy4 r8 = r10.$isBouncingAnimation$delegate
            r9 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = r11
            kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
        L7f:
            long r3 = r10.$intervalMillis
            r10.F$0 = r1
            r10.label = r2
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r3, r10)
            if (r11 != r0) goto L29
            return r0
        L8c:
            ww8 r10 = defpackage.ww8.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$SequentialCounter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NewsQuizResultKt$SequentialCounter$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
