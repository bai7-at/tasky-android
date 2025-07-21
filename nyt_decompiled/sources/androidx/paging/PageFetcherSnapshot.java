package androidx.paging;

import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.PagingSource;
import androidx.paging.d;
import defpackage.by0;
import defpackage.dw6;
import defpackage.kx2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.xn5;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class PageFetcherSnapshot {
    private final Object a;
    private final PagingSource b;
    private final xn5 c;
    private final Flow d;
    private final dw6 e;
    private final m f;
    private final qs2 g;
    private final HintHandler h;
    private final AtomicBoolean i;
    private final Channel j;
    private final PageFetcherSnapshotState.a k;
    private final CompletableJob l;
    private final Flow m;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    static final class b implements FlowCollector {
        final /* synthetic */ LoadType b;

        b(LoadType loadType) {
            this.b = loadType;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(kx2 kx2Var, by0 by0Var) {
            Object t = PageFetcherSnapshot.this.t(this.b, kx2Var, by0Var);
            return t == kotlin.coroutines.intrinsics.a.h() ? t : ww8.a;
        }
    }

    public PageFetcherSnapshot(Object obj, PagingSource pagingSource, xn5 xn5Var, Flow flow, dw6 dw6Var, m mVar, qs2 qs2Var) {
        CompletableJob Job$default;
        zq3.h(pagingSource, "pagingSource");
        zq3.h(xn5Var, "config");
        zq3.h(flow, "retryFlow");
        zq3.h(qs2Var, "jumpCallback");
        this.a = obj;
        this.b = pagingSource;
        this.c = xn5Var;
        this.d = flow;
        this.f = mVar;
        this.g = qs2Var;
        if (xn5Var.f != Integer.MIN_VALUE && !pagingSource.getJumpingSupported()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.h = new HintHandler();
        this.i = new AtomicBoolean(false);
        this.j = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.k = new PageFetcherSnapshotState.a(xn5Var);
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.l = Job$default;
        this.m = FlowKt.onStart(CancelableChannelFlowKt.a(Job$default, new PageFetcherSnapshot$pageEventFlow$1(this, null)), new PageFetcherSnapshot$pageEventFlow$2(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(LoadType loadType, s sVar, by0 by0Var) {
        if (a.a[loadType.ordinal()] == 1) {
            Object s = s(by0Var);
            return s == kotlin.coroutines.intrinsics.a.h() ? s : ww8.a;
        }
        if (sVar == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        this.h.a(loadType, sVar);
        return ww8.a;
    }

    private final Object B(PageFetcherSnapshotState pageFetcherSnapshotState, LoadType loadType, d.a aVar, by0 by0Var) {
        if (zq3.c(pageFetcherSnapshotState.p().a(loadType), aVar)) {
            return ww8.a;
        }
        pageFetcherSnapshotState.p().c(loadType, aVar);
        Object send = this.j.send(new PageEvent.b(pageFetcherSnapshotState.p().d(), null), by0Var);
        return send == kotlin.coroutines.intrinsics.a.h() ? send : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(PageFetcherSnapshotState pageFetcherSnapshotState, LoadType loadType, by0 by0Var) {
        d a2 = pageFetcherSnapshotState.p().a(loadType);
        d.b bVar = d.b.b;
        if (zq3.c(a2, bVar)) {
            return ww8.a;
        }
        pageFetcherSnapshotState.p().c(loadType, bVar);
        Object send = this.j.send(new PageEvent.b(pageFetcherSnapshotState.p().d(), null), by0Var);
        return send == kotlin.coroutines.intrinsics.a.h() ? send : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(CoroutineScope coroutineScope) {
        if (this.c.f != Integer.MIN_VALUE) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$1(this, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$3(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(Flow flow, LoadType loadType, by0 by0Var) {
        Object collect = FlowKt.conflate(FlowExtKt.b(FlowExtKt.d(flow, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, this, loadType)), new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, null))).collect(new b(loadType), by0Var);
        return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0186 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:59:0x0162, B:61:0x0186, B:62:0x0197, B:64:0x01a0), top: B:58:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0 A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #0 {all -> 0x0194, blocks: (B:59:0x0162, B:61:0x0186, B:62:0x0197, B:64:0x01a0), top: B:58:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v38, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r14v52, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v61 */
    /* JADX WARN: Type inference failed for: r14v64 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.s(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x06c2, code lost:
    
        r0 = r8;
        r8 = r9;
        r9 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0533 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0331 A[Catch: all -> 0x0354, TRY_LEAVE, TryCatch #1 {all -> 0x0354, blocks: (B:198:0x0318, B:200:0x0331), top: B:197:0x0318 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06db A[Catch: all -> 0x026c, TRY_ENTER, TryCatch #7 {all -> 0x026c, blocks: (B:211:0x0239, B:218:0x02e6, B:223:0x024f, B:225:0x025f, B:226:0x0270, B:228:0x027a, B:230:0x0293, B:232:0x0295, B:234:0x02ad, B:237:0x02cb, B:239:0x02e4, B:241:0x06db, B:242:0x06e0), top: B:210:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x058a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05a0 A[Catch: all -> 0x05d2, TRY_LEAVE, TryCatch #0 {all -> 0x05d2, blocks: (B:76:0x0592, B:78:0x05a0, B:84:0x05d8, B:86:0x05ef, B:88:0x05fb, B:90:0x0603, B:91:0x0610, B:92:0x060a, B:93:0x0613), top: B:75:0x0592 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05ef A[Catch: all -> 0x05d2, TryCatch #0 {all -> 0x05d2, blocks: (B:76:0x0592, B:78:0x05a0, B:84:0x05d8, B:86:0x05ef, B:88:0x05fb, B:90:0x0603, B:91:0x0610, B:92:0x060a, B:93:0x0613), top: B:75:0x0592 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0603 A[Catch: all -> 0x05d2, TryCatch #0 {all -> 0x05d2, blocks: (B:76:0x0592, B:78:0x05a0, B:84:0x05d8, B:86:0x05ef, B:88:0x05fb, B:90:0x0603, B:91:0x0610, B:92:0x060a, B:93:0x0613), top: B:75:0x0592 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x060a A[Catch: all -> 0x05d2, TryCatch #0 {all -> 0x05d2, blocks: (B:76:0x0592, B:78:0x05a0, B:84:0x05d8, B:86:0x05ef, B:88:0x05fb, B:90:0x0603, B:91:0x0610, B:92:0x060a, B:93:0x0613), top: B:75:0x0592 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x063d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [T] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v25, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0699 -> B:13:0x069d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(androidx.paging.LoadType r18, defpackage.kx2 r19, defpackage.by0 r20) {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.t(androidx.paging.LoadType, kx2, by0):java.lang.Object");
    }

    private final PagingSource.a x(LoadType loadType, Object obj) {
        return PagingSource.a.c.a(loadType, obj, loadType == LoadType.REFRESH ? this.c.d : this.c.a, this.c.c);
    }

    private final String y(LoadType loadType, Object obj, PagingSource.b bVar) {
        if (bVar == null) {
            return "End " + loadType + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + obj + ". Returned " + bVar;
    }

    private final Object z(PageFetcherSnapshotState pageFetcherSnapshotState, LoadType loadType, int i, int i2) {
        if (i == pageFetcherSnapshotState.j(loadType) && !(pageFetcherSnapshotState.p().a(loadType) instanceof d.a) && i2 < this.c.b) {
            return loadType == LoadType.PREPEND ? ((PagingSource.b.C0106b) kotlin.collections.i.k0(pageFetcherSnapshotState.m())).n() : ((PagingSource.b.C0106b) kotlin.collections.i.w0(pageFetcherSnapshotState.m())).j();
        }
        return null;
    }

    public final void o(s sVar) {
        zq3.h(sVar, "viewportHint");
        this.h.d(sVar);
    }

    public final void p() {
        Job.DefaultImpls.cancel$default((Job) this.l, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$currentPagingState$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = (androidx.paging.PageFetcherSnapshot$currentPagingState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = new androidx.paging.PageFetcherSnapshot$currentPagingState$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            java.lang.Object r1 = r0.L$1
            androidx.paging.PageFetcherSnapshotState$a r1 = (androidx.paging.PageFetcherSnapshotState.a) r1
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            kotlin.f.b(r6)
            r2 = r5
            r5 = r0
            goto L59
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            kotlin.f.b(r6)
            androidx.paging.PageFetcherSnapshotState$a r6 = r5.k
            kotlinx.coroutines.sync.Mutex r2 = androidx.paging.PageFetcherSnapshotState.a.a(r6)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r0 = r2.lock(r4, r0)
            if (r0 != r1) goto L58
            return r1
        L58:
            r1 = r6
        L59:
            androidx.paging.PageFetcherSnapshotState r6 = androidx.paging.PageFetcherSnapshotState.a.b(r1)     // Catch: java.lang.Throwable -> L6b
            androidx.paging.HintHandler r5 = r5.h     // Catch: java.lang.Throwable -> L6b
            androidx.paging.s$a r5 = r5.b()     // Catch: java.lang.Throwable -> L6b
            androidx.paging.m r5 = r6.g(r5)     // Catch: java.lang.Throwable -> L6b
            r2.unlock(r4)
            return r5
        L6b:
            r5 = move-exception
            r2.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.r(by0):java.lang.Object");
    }

    public final Flow u() {
        return this.m;
    }

    public final PagingSource v() {
        return this.b;
    }

    public final dw6 w() {
        return this.e;
    }
}
