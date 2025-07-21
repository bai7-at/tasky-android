package com.nytimes.android.features.you.youtab.composable.interests;

import com.nytimes.android.interests.OnboardingToolTipState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$6$1$1", f = "InterestsContentHeader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsContentHeaderKt$InterestsContentHeader$1$6$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $addTooltipBalloonWindow$delegate;
    final /* synthetic */ OnboardingToolTipState $toolTipState;
    int label;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OnboardingToolTipState.values().length];
            try {
                iArr[OnboardingToolTipState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnboardingToolTipState.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnboardingToolTipState.ADD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsContentHeaderKt$InterestsContentHeader$1$6$1$1(OnboardingToolTipState onboardingToolTipState, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$toolTipState = onboardingToolTipState;
        this.$addTooltipBalloonWindow$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsContentHeaderKt$InterestsContentHeader$1$6$1$1(this.$toolTipState, this.$addTooltipBalloonWindow$delegate, by0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r2 = com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt.b(r2.$addTooltipBalloonWindow$delegate);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            kotlin.coroutines.intrinsics.a.h()
            int r0 = r2.label
            if (r0 != 0) goto L37
            kotlin.f.b(r3)
            com.nytimes.android.interests.OnboardingToolTipState r3 = r2.$toolTipState
            int[] r0 = com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$6$1$1.a.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 2
            if (r3 == r0) goto L29
            r0 = 3
            if (r3 == r0) goto L1b
            goto L34
        L1b:
            sy4 r2 = r2.$addTooltipBalloonWindow$delegate
            j40 r2 = com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt.d(r2)
            if (r2 == 0) goto L34
            r3 = 0
            r1 = 0
            j40.a.a(r2, r1, r1, r0, r3)
            goto L34
        L29:
            sy4 r2 = r2.$addTooltipBalloonWindow$delegate
            j40 r2 = com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt.d(r2)
            if (r2 == 0) goto L34
            r2.dismiss()
        L34:
            ww8 r2 = defpackage.ww8.a
            return r2
        L37:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$6$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((InterestsContentHeaderKt$InterestsContentHeader$1$6$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
