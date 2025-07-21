package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class StartedWhileSubscribed$command$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    StartedWhileSubscribed$command$2(by0<? super StartedWhileSubscribed$command$2> by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(by0Var);
        startedWhileSubscribed$command$2.L$0 = obj;
        return startedWhileSubscribed$command$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return cc0.a(((SharingCommand) this.L$0) != SharingCommand.START);
    }

    @Override // defpackage.gt2
    public final Object invoke(SharingCommand sharingCommand, by0<? super Boolean> by0Var) {
        return ((StartedWhileSubscribed$command$2) create(sharingCommand, by0Var)).invokeSuspend(ww8.a);
    }
}
