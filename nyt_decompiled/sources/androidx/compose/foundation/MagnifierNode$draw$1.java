package androidx.compose.foundation;

import androidx.compose.runtime.m;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ru5;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.MagnifierNode$draw$1", f = "Magnifier.android.kt", l = {447}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MagnifierNode$draw$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ MagnifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MagnifierNode$draw$1(MagnifierNode magnifierNode, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = magnifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MagnifierNode$draw$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ru5 ru5Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            AnonymousClass1 anonymousClass1 = new ss2() { // from class: androidx.compose.foundation.MagnifierNode$draw$1.1
                public final void invoke(long j) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke(((Number) obj2).longValue());
                    return ww8.a;
                }
            };
            this.label = 1;
            if (m.b(anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        ru5Var = this.this$0.N;
        if (ru5Var != null) {
            ru5Var.c();
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MagnifierNode$draw$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
