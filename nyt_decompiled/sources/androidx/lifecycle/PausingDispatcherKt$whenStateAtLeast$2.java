package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fq5;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@fc1(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, by0Var);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            Job job = (Job) ((CoroutineScope) this.L$0).getCoroutineContext().get(Job.Key);
            if (job == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            fq5 fq5Var = new fq5();
            e eVar2 = new e(this.$this_whenStateAtLeast, this.$minState, fq5Var.a, job);
            try {
                gt2 gt2Var = this.$block;
                this.L$0 = eVar2;
                this.label = 1;
                obj = BuildersKt.withContext(fq5Var, gt2Var, this);
                if (obj == h) {
                    return h;
                }
                eVar = eVar2;
            } catch (Throwable th) {
                th = th;
                eVar = eVar2;
                eVar.b();
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (e) this.L$0;
            try {
                kotlin.f.b(obj);
            } catch (Throwable th2) {
                th = th2;
                eVar.b();
                throw th;
            }
        }
        eVar.b();
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
