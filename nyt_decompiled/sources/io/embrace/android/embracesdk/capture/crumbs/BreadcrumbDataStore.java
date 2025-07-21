package io.embrace.android.embracesdk.capture.crumbs;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.DataCaptureService;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class BreadcrumbDataStore<T> implements DataCaptureService<List<? extends T>> {
    private final LinkedBlockingDeque<T> breadcrumbs;
    private final qs2 limit;

    public BreadcrumbDataStore(qs2 qs2Var) {
        zq3.h(qs2Var, "limit");
        this.limit = qs2Var;
        this.breadcrumbs = new LinkedBlockingDeque<>();
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.breadcrumbs.clear();
    }

    public final T peek() {
        return this.breadcrumbs.peek();
    }

    public final void tryAddBreadcrumb(T t) {
        if (!this.breadcrumbs.isEmpty() && this.breadcrumbs.size() >= ((Number) this.limit.mo865invoke()).intValue()) {
            this.breadcrumbs.removeLast();
        }
        this.breadcrumbs.push(t);
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<T> getCapturedData() {
        return i.X0(this.breadcrumbs);
    }
}
