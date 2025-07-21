package com.nytimes.android.utils.composeutils;

import defpackage.bo3;
import defpackage.by0;
import defpackage.dy4;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.tl2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.utils.composeutils.AutoFocusKt$AutoFocus$2$1", f = "AutoFocus.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AutoFocusKt$AutoFocus$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ dy4 $interactionSource;
    final /* synthetic */ qs2 $onUnfocus;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ qs2 a;

        a(qs2 qs2Var) {
            this.a = qs2Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(bo3 bo3Var, by0 by0Var) {
            if (bo3Var instanceof tl2) {
                this.a.mo865invoke();
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoFocusKt$AutoFocus$2$1(dy4 dy4Var, qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.$interactionSource = dy4Var;
        this.$onUnfocus = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AutoFocusKt$AutoFocus$2$1(this.$interactionSource, this.$onUnfocus, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Flow b = this.$interactionSource.b();
            a aVar = new a(this.$onUnfocus);
            this.label = 1;
            if (b.collect(aVar, this) == h) {
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
        return ((AutoFocusKt$AutoFocus$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
