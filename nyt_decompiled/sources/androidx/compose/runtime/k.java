package androidx.compose.runtime;

import defpackage.gt2;
import defpackage.ov6;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes.dex */
public final class k implements ov6 {
    private final gt2 a;
    private final CoroutineScope b;
    private Job c;

    public k(CoroutineContext coroutineContext, gt2 gt2Var) {
        this.a = gt2Var;
        this.b = CoroutineScopeKt.CoroutineScope(coroutineContext);
    }

    @Override // defpackage.ov6
    public void c() {
        Job launch$default;
        Job job = this.c;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, "Old job was still running!", null, 2, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, this.a, 3, null);
        this.c = launch$default;
    }

    @Override // defpackage.ov6
    public void d() {
        Job job = this.c;
        if (job != null) {
            job.cancel((CancellationException) new LeftCompositionCancellationException());
        }
        this.c = null;
    }

    @Override // defpackage.ov6
    public void e() {
        Job job = this.c;
        if (job != null) {
            job.cancel((CancellationException) new LeftCompositionCancellationException());
        }
        this.c = null;
    }
}
