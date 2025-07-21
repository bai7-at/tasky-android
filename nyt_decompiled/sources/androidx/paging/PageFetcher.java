package androidx.paging;

import defpackage.hw8;
import defpackage.ss2;
import defpackage.w83;
import defpackage.xn5;
import defpackage.zq3;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class PageFetcher {
    private final ss2 a;
    private final Object b;
    private final xn5 c;
    private final ConflatedEventBus d;
    private final ConflatedEventBus e;
    private final Flow f;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final PageFetcherSnapshot a;
        private final m b;
        private final Job c;

        public a(PageFetcherSnapshot pageFetcherSnapshot, m mVar, Job job) {
            zq3.h(pageFetcherSnapshot, "snapshot");
            zq3.h(job, "job");
            this.a = pageFetcherSnapshot;
            this.b = mVar;
            this.c = job;
        }

        public final Job a() {
            return this.c;
        }

        public final PageFetcherSnapshot b() {
            return this.a;
        }

        public final m c() {
            return this.b;
        }
    }

    public final class b implements w83 {
        private final PageFetcherSnapshot a;
        final /* synthetic */ PageFetcher b;

        public b(PageFetcher pageFetcher, PageFetcherSnapshot pageFetcherSnapshot) {
            zq3.h(pageFetcherSnapshot, "pageFetcherSnapshot");
            this.b = pageFetcher;
            this.a = pageFetcherSnapshot;
        }

        @Override // defpackage.w83
        public void a(s sVar) {
            zq3.h(sVar, "viewportHint");
            this.a.o(sVar);
        }
    }

    public final class c implements hw8 {
        private final ConflatedEventBus a;
        final /* synthetic */ PageFetcher b;

        public c(PageFetcher pageFetcher, ConflatedEventBus conflatedEventBus) {
            zq3.h(conflatedEventBus, "retryEventBus");
            this.b = pageFetcher;
            this.a = conflatedEventBus;
        }
    }

    public PageFetcher(ss2 ss2Var, Object obj, xn5 xn5Var, RemoteMediator remoteMediator) {
        zq3.h(ss2Var, "pagingSourceFactory");
        zq3.h(xn5Var, "config");
        this.a = ss2Var;
        this.b = obj;
        this.c = xn5Var;
        this.d = new ConflatedEventBus(null, 1, null);
        this.e = new ConflatedEventBus(null, 1, null);
        this.f = SimpleChannelFlowKt.a(new PageFetcher$flow$1(remoteMediator, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(androidx.paging.PagingSource r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcher$generateNewPagingSource$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = (androidx.paging.PageFetcher$generateNewPagingSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = new androidx.paging.PageFetcher$generateNewPagingSource$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            androidx.paging.PagingSource r5 = (androidx.paging.PagingSource) r5
            java.lang.Object r4 = r0.L$0
            androidx.paging.PageFetcher r4 = (androidx.paging.PageFetcher) r4
            kotlin.f.b(r6)
            goto L4c
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.f.b(r6)
            ss2 r6 = r4.a
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            androidx.paging.PagingSource r6 = (androidx.paging.PagingSource) r6
            boolean r0 = r6 instanceof defpackage.yp0
            if (r0 == 0) goto L5c
            r0 = r6
            yp0 r0 = (defpackage.yp0) r0
            xn5 r1 = r4.c
            int r1 = r1.a
            r0.a(r1)
        L5c:
            if (r6 == r5) goto L94
            androidx.paging.PageFetcher$generateNewPagingSource$3 r0 = new androidx.paging.PageFetcher$generateNewPagingSource$3
            r0.<init>(r4)
            r6.registerInvalidatedCallback(r0)
            if (r5 == 0) goto L70
            androidx.paging.PageFetcher$generateNewPagingSource$4 r0 = new androidx.paging.PageFetcher$generateNewPagingSource$4
            r0.<init>(r4)
            r5.unregisterInvalidatedCallback(r0)
        L70:
            if (r5 == 0) goto L75
            r5.invalidate()
        L75:
            yn5 r4 = defpackage.yn5.a
            r5 = 3
            boolean r0 = r4.a(r5)
            if (r0 == 0) goto L93
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Generated new PagingSource "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r4.b(r5, r0, r1)
        L93:
            return r6
        L94:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher.h(androidx.paging.PagingSource, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow j(PageFetcherSnapshot pageFetcherSnapshot, Job job, p pVar) {
        return pVar == null ? pageFetcherSnapshot.u() : CancelableChannelFlowKt.a(job, new PageFetcher$injectRemoteEvents$1(pVar, pageFetcherSnapshot, new f(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.d.b(Boolean.FALSE);
    }

    public final Flow i() {
        return this.f;
    }

    public final void l() {
        this.d.b(Boolean.TRUE);
    }
}
