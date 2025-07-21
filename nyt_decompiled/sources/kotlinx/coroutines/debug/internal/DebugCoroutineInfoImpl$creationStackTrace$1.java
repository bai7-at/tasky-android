package kotlinx.coroutines.debug.internal;

import defpackage.bk7;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.p01;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.f;

@fc1(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements gt2 {
    final /* synthetic */ StackTraceFrame $bottom;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DebugCoroutineInfoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugCoroutineInfoImpl$creationStackTrace$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, StackTraceFrame stackTraceFrame, by0<? super DebugCoroutineInfoImpl$creationStackTrace$1> by0Var) {
        super(2, by0Var);
        this.this$0 = debugCoroutineInfoImpl;
        this.$bottom = stackTraceFrame;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.this$0, this.$bottom, by0Var);
        debugCoroutineInfoImpl$creationStackTrace$1.L$0 = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    @Override // defpackage.gt2
    public final Object invoke(bk7 bk7Var, by0<? super ww8> by0Var) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) create(bk7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object yieldFrames;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            bk7 bk7Var = (bk7) this.L$0;
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = this.this$0;
            p01 callerFrame = this.$bottom.getCallerFrame();
            this.label = 1;
            yieldFrames = debugCoroutineInfoImpl.yieldFrames(bk7Var, callerFrame, this);
            if (yieldFrames == h) {
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
