package defpackage;

import android.app.Application;
import com.nytimes.android.analytics.api.Channel;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes2.dex */
public abstract class hj0 implements Comparable {
    private final CoroutineDispatcher a;
    private final CoroutineScope b;
    private final boolean c;

    public hj0(CoroutineDispatcher coroutineDispatcher) {
        CompletableJob Job$default;
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.a = coroutineDispatcher;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.b = CoroutineScopeKt.CoroutineScope(Job$default.plus(coroutineDispatcher));
    }

    protected final CoroutineScope a() {
        return this.b;
    }

    public abstract Channel b();

    public boolean c() {
        return this.c;
    }

    public abstract void d(uc ucVar);

    public void e(Application application) {
        zq3.h(application, "application");
    }
}
