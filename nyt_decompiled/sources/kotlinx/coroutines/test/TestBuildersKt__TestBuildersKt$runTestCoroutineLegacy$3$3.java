package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.fc1;
import defpackage.g62;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.sequences.d;
import kotlin.time.b;
import kotlinx.coroutines.AbstractCoroutine;

/* JADX WARN: Incorrect field signature: TT; */
@fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3", f = "TestBuilders.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3 extends SuspendLambda implements ss2 {
    final /* synthetic */ qs2 $cleanup;
    final /* synthetic */ AbstractCoroutine $coroutine;
    final /* synthetic */ long $dispatchTimeout;
    final /* synthetic */ ss2 $tryGetCompletionCause;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;JLss2;Lqs2;Lby0<-Lkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3;>;)V */
    TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3(AbstractCoroutine abstractCoroutine, long j, ss2 ss2Var, qs2 qs2Var, by0 by0Var) {
        super(1, by0Var);
        this.$coroutine = abstractCoroutine;
        this.$dispatchTimeout = j;
        this.$tryGetCompletionCause = ss2Var;
        this.$cleanup = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(by0<?> by0Var) {
        return new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3(this.$coroutine, this.$dispatchTimeout, this.$tryGetCompletionCause, this.$cleanup, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0<? super ww8> by0Var) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List l;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        AbstractCoroutine abstractCoroutine = this.$coroutine;
        long j = this.$dispatchTimeout;
        ss2 ss2Var = this.$tryGetCompletionCause;
        try {
            l = (List) this.$cleanup.mo865invoke();
        } catch (UncompletedCoroutinesError unused) {
            l = i.l();
        }
        List w = d.w(d.j(abstractCoroutine.getChildren(), TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1.INSTANCE));
        Throwable th = abstractCoroutine.isCancelled() ? (Throwable) ss2Var.invoke(abstractCoroutine) : null;
        String str = "After waiting for " + ((Object) b.L(j));
        if (th == null) {
            str = str + ", the test coroutine is not completing";
        }
        if (!w.isEmpty()) {
            str = str + ", there were active child jobs: " + w;
        }
        if (th != null && w.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(abstractCoroutine.isCompleted() ? ", the test coroutine completed" : ", the test coroutine was not completed");
            str = sb.toString();
        }
        UncompletedCoroutinesError uncompletedCoroutinesError = new UncompletedCoroutinesError(str);
        if (th != null) {
            g62.a(uncompletedCoroutinesError, th);
        }
        Iterator it2 = l.iterator();
        while (it2.hasNext()) {
            g62.a(uncompletedCoroutinesError, (Throwable) it2.next());
        }
        throw uncompletedCoroutinesError;
    }
}
