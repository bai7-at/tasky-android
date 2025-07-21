package com.nytimes.xwords.hybrid.view;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes4.dex */
public abstract class a extends c implements CoroutineScope {
    private final int f;
    private final CompletableJob g;

    public a(int i) {
        super(i);
        CompletableJob Job$default;
        this.f = i;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.g = Job$default;
    }

    public abstract CoroutineDispatcher c1();

    protected final CompletableJob d1() {
        return this.g;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.g.plus(c1());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Job.DefaultImpls.cancel$default((Job) this.g, (CancellationException) null, 1, (Object) null);
        super.onDestroy();
    }
}
