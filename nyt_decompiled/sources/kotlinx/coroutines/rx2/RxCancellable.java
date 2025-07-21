package kotlinx.coroutines.rx2;

import io.reactivex.functions.Cancellable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* loaded from: classes5.dex */
public final class RxCancellable implements Cancellable {
    private final Job job;

    public RxCancellable(Job job) {
        this.job = job;
    }

    @Override // io.reactivex.functions.Cancellable
    public void cancel() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }
}
