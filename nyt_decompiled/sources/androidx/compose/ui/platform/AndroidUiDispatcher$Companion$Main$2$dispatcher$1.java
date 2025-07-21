package androidx.compose.ui.platform;

import android.view.Choreographer;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends SuspendLambda implements gt2 {
    int label;

    AndroidUiDispatcher$Companion$Main$2$dispatcher$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        return Choreographer.getInstance();
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
