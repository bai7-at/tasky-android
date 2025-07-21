package kotlinx.coroutines;

/* loaded from: classes5.dex */
final class SupervisorJobImpl extends JobImpl {
    public SupervisorJobImpl(Job job) {
        super(job);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th) {
        return false;
    }
}
