package kotlinx.coroutines.test;

import defpackage.ss2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
final class StandardTestDispatcherImpl extends TestDispatcher {
    private final String name;
    private final TestCoroutineScheduler scheduler;

    /* JADX WARN: Multi-variable type inference failed */
    public StandardTestDispatcherImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo937dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        getScheduler().registerEvent$kotlinx_coroutines_test(this, 0L, runnable, coroutineContext, new ss2() { // from class: kotlinx.coroutines.test.StandardTestDispatcherImpl$dispatch$1
            @Override // defpackage.ss2
            public final Boolean invoke(Runnable runnable2) {
                return Boolean.FALSE;
            }
        });
    }

    @Override // kotlinx.coroutines.test.TestDispatcher
    public TestCoroutineScheduler getScheduler() {
        return this.scheduler;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.name;
        if (str == null) {
            str = "StandardTestDispatcher";
        }
        sb.append(str);
        sb.append("[scheduler=");
        sb.append(getScheduler());
        sb.append(']');
        return sb.toString();
    }

    public /* synthetic */ StandardTestDispatcherImpl(TestCoroutineScheduler testCoroutineScheduler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TestCoroutineScheduler() : testCoroutineScheduler, (i & 2) != 0 ? null : str);
    }

    public StandardTestDispatcherImpl(TestCoroutineScheduler testCoroutineScheduler, String str) {
        this.scheduler = testCoroutineScheduler;
        this.name = str;
    }
}
