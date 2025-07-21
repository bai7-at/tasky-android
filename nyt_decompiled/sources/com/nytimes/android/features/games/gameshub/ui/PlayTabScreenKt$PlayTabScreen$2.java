package com.nytimes.android.features.games.gameshub.ui;

import com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$PlayTabScreen$2", f = "PlayTabScreen.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayTabScreenKt$PlayTabScreen$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ PlayTabViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayTabScreenKt$PlayTabScreen$2(PlayTabViewModel playTabViewModel, by0 by0Var) {
        super(1, by0Var);
        this.$viewModel = playTabViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new PlayTabScreenKt$PlayTabScreen$2(this.$viewModel, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((PlayTabScreenKt$PlayTabScreen$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            PlayTabViewModel playTabViewModel = this.$viewModel;
            this.label = 1;
            if (playTabViewModel.s(this) == h) {
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
}
