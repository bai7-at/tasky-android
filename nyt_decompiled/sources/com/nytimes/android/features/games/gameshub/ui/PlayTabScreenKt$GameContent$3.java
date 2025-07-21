package com.nytimes.android.features.games.gameshub.ui;

import defpackage.by0;
import defpackage.fc1;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.jv5;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$3", f = "PlayTabScreen.kt", l = {217}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayTabScreenKt$GameContent$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ fe4 $mainTabState;
    final /* synthetic */ jv5 $playTabState;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ jv5 a;

        a(jv5 jv5Var) {
            this.a = jv5Var;
        }

        public final Object a(int i, by0 by0Var) {
            Object a = this.a.a(i, by0Var);
            return a == kotlin.coroutines.intrinsics.a.h() ? a : ww8.a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var) {
            return a(((Number) obj).intValue(), by0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayTabScreenKt$GameContent$3(fe4 fe4Var, jv5 jv5Var, by0 by0Var) {
        super(2, by0Var);
        this.$mainTabState = fe4Var;
        this.$playTabState = jv5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PlayTabScreenKt$GameContent$3(this.$mainTabState, this.$playTabState, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Flow c = this.$mainTabState.c();
            a aVar = new a(this.$playTabState);
            this.label = 1;
            if (c.collect(aVar, this) == h) {
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
        return ((PlayTabScreenKt$GameContent$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
