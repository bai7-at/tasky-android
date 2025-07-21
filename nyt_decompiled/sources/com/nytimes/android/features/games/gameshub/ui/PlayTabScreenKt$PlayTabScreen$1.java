package com.nytimes.android.features.games.gameshub.ui;

import android.content.Context;
import com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.b65;
import defpackage.by0;
import defpackage.dv5;
import defpackage.fc1;
import defpackage.fe4;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$PlayTabScreen$1", f = "PlayTabScreen.kt", l = {80, 82}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayTabScreenKt$PlayTabScreen$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ dv5 $entryPoint;
    final /* synthetic */ fe4 $mainTabState;
    final /* synthetic */ b65 $referringSource;
    final /* synthetic */ SnackbarUtil $snackbar;
    final /* synthetic */ PlayTabViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayTabScreenKt$PlayTabScreen$1(dv5 dv5Var, fe4 fe4Var, PlayTabViewModel playTabViewModel, Context context, b65 b65Var, SnackbarUtil snackbarUtil, by0 by0Var) {
        super(1, by0Var);
        this.$entryPoint = dv5Var;
        this.$mainTabState = fe4Var;
        this.$viewModel = playTabViewModel;
        this.$context = context;
        this.$referringSource = b65Var;
        this.$snackbar = snackbarUtil;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new PlayTabScreenKt$PlayTabScreen$1(this.$entryPoint, this.$mainTabState, this.$viewModel, this.$context, this.$referringSource, this.$snackbar, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((PlayTabScreenKt$PlayTabScreen$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r11.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.f.b(r12)
            goto L62
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L1b:
            kotlin.f.b(r12)
            goto L31
        L1f:
            kotlin.f.b(r12)
            dv5 r12 = r11.$entryPoint
            com.nytimes.android.features.games.gameshub.PlayTabPreferencesStore r12 = r12.s0()
            r11.label = r4
            java.lang.Object r12 = r12.c(r2, r11)
            if (r12 != r0) goto L31
            return r0
        L31:
            dv5 r12 = r11.$entryPoint
            gv5 r12 = r12.d()
            java.lang.String r1 = "Play Tab"
            r12.l(r1)
            dv5 r12 = r11.$entryPoint
            d4 r5 = r12.h0()
            as4$a r6 = new as4$a
            fe4 r12 = r11.$mainTabState
            de4 r12 = r12.d()
            hf8 r12 = r12.f()
            java.lang.String r12 = r12.c()
            r6.<init>(r12)
            r11.label = r3
            r7 = 0
            r9 = 2
            r10 = 0
            r8 = r11
            java.lang.Object r12 = defpackage.d4.b(r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L62
            return r0
        L62:
            com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel r12 = r11.$viewModel
            android.content.Context r0 = r11.$context
            r12.o(r0)
            com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel r12 = r11.$viewModel
            b65 r0 = r11.$referringSource
            r12.v(r0)
            com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel r12 = r11.$viewModel
            r12.m()
            com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel r12 = r11.$viewModel
            r12.n()
            com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel r12 = r11.$viewModel
            kotlinx.coroutines.flow.StateFlow r12 = r12.r()
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L92
            com.nytimes.android.utils.snackbar.SnackbarUtil r11 = r11.$snackbar
            r12 = 0
            com.nytimes.android.utils.snackbar.SnackbarUtil.p(r11, r2, r4, r12)
        L92:
            ww8 r11 = defpackage.ww8.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$PlayTabScreen$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
