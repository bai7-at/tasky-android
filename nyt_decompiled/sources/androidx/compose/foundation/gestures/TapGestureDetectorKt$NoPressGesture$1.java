package androidx.compose.foundation.gestures;

import defpackage.by0;
import defpackage.c26;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements it2 {
    int label;

    TapGestureDetectorKt$NoPressGesture$1(by0 by0Var) {
        super(3, by0Var);
    }

    public final Object b(c26 c26Var, long j, by0 by0Var) {
        return new TapGestureDetectorKt$NoPressGesture$1(by0Var).invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((c26) obj, ((fd5) obj2).x(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return ww8.a;
    }
}
