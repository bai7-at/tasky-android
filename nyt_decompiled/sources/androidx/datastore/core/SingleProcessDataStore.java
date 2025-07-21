package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import defpackage.ba1;
import defpackage.by0;
import defpackage.c04;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.rk7;
import defpackage.ss2;
import defpackage.w01;
import defpackage.ww8;
import defpackage.zq3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.i;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes.dex */
public final class SingleProcessDataStore implements ba1 {
    public static final a k = new a(null);
    private static final Set l = new LinkedHashSet();
    private static final Object m = new Object();
    private final qs2 a;
    private final rk7 b;
    private final w01 c;
    private final CoroutineScope d;
    private final Flow e;
    private final String f;
    private final c04 g;
    private final MutableStateFlow h;
    private List i;
    private final SimpleActor j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return SingleProcessDataStore.l;
        }

        public final Object b() {
            return SingleProcessDataStore.m;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class b {

        public static final class a extends b {
            private final d a;

            public a(d dVar) {
                super(null);
                this.a = dVar;
            }

            public d a() {
                return this.a;
            }
        }

        /* renamed from: androidx.datastore.core.SingleProcessDataStore$b$b, reason: collision with other inner class name */
        public static final class C0075b extends b {
            private final gt2 a;
            private final CompletableDeferred b;
            private final d c;
            private final CoroutineContext d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0075b(gt2 gt2Var, CompletableDeferred completableDeferred, d dVar, CoroutineContext coroutineContext) {
                super(null);
                zq3.h(gt2Var, "transform");
                zq3.h(completableDeferred, "ack");
                zq3.h(coroutineContext, "callerContext");
                this.a = gt2Var;
                this.b = completableDeferred;
                this.c = dVar;
                this.d = coroutineContext;
            }

            public final CompletableDeferred a() {
                return this.b;
            }

            public final CoroutineContext b() {
                return this.d;
            }

            public d c() {
                return this.c;
            }

            public final gt2 d() {
                return this.a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c extends OutputStream {
        private final FileOutputStream a;

        public c(FileOutputStream fileOutputStream) {
            zq3.h(fileOutputStream, "fileOutputStream");
            this.a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.a.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            zq3.h(bArr, "b");
            this.a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            zq3.h(bArr, "bytes");
            this.a.write(bArr, i, i2);
        }
    }

    public SingleProcessDataStore(qs2 qs2Var, rk7 rk7Var, List list, w01 w01Var, CoroutineScope coroutineScope) {
        zq3.h(qs2Var, "produceFile");
        zq3.h(rk7Var, "serializer");
        zq3.h(list, "initTasksList");
        zq3.h(w01Var, "corruptionHandler");
        zq3.h(coroutineScope, "scope");
        this.a = qs2Var;
        this.b = rk7Var;
        this.c = w01Var;
        this.d = coroutineScope;
        this.e = FlowKt.flow(new SingleProcessDataStore$data$1(this, null));
        this.f = ".tmp";
        this.g = kotlin.c.a(new qs2() { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final File mo865invoke() {
                qs2 qs2Var2;
                qs2Var2 = SingleProcessDataStore.this.a;
                File file = (File) qs2Var2.mo865invoke();
                String absolutePath = file.getAbsolutePath();
                SingleProcessDataStore.a aVar = SingleProcessDataStore.k;
                synchronized (aVar.b()) {
                    if (aVar.a().contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set a2 = aVar.a();
                    zq3.g(absolutePath, "it");
                    a2.add(absolutePath);
                }
                return file;
            }
        });
        this.h = StateFlowKt.MutableStateFlow(e.a);
        this.i = i.X0(list);
        this.j = new SimpleActor(coroutineScope, new ss2() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                File q;
                MutableStateFlow mutableStateFlow;
                if (th != null) {
                    mutableStateFlow = SingleProcessDataStore.this.h;
                    mutableStateFlow.setValue(new b(th));
                }
                SingleProcessDataStore.a aVar = SingleProcessDataStore.k;
                Object b2 = aVar.b();
                SingleProcessDataStore singleProcessDataStore = SingleProcessDataStore.this;
                synchronized (b2) {
                    Set a2 = aVar.a();
                    q = singleProcessDataStore.q();
                    a2.remove(q.getAbsolutePath());
                    ww8 ww8Var = ww8.a;
                }
            }
        }, new gt2() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            public final void b(SingleProcessDataStore.b bVar, Throwable th) {
                zq3.h(bVar, "msg");
                if (bVar instanceof SingleProcessDataStore.b.C0075b) {
                    CompletableDeferred a2 = ((SingleProcessDataStore.b.C0075b) bVar).a();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    a2.completeExceptionally(th);
                }
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((SingleProcessDataStore.b) obj, (Throwable) obj2);
                return ww8.a;
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(zq3.q("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File q() {
        return (File) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(b.a aVar, by0 by0Var) {
        d dVar = (d) this.h.getValue();
        if (!(dVar instanceof androidx.datastore.core.a)) {
            if (dVar instanceof androidx.datastore.core.c) {
                if (dVar == aVar.a()) {
                    Object v = v(by0Var);
                    return v == kotlin.coroutines.intrinsics.a.h() ? v : ww8.a;
                }
            } else {
                if (zq3.c(dVar, e.a)) {
                    Object v2 = v(by0Var);
                    return v2 == kotlin.coroutines.intrinsics.a.h() ? v2 : ww8.a;
                }
                if (dVar instanceof androidx.datastore.core.b) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:53)|(2:40|(2:42|(1:44))(2:45|46))(2:47|(2:49|50)(2:51|52))))|24|(1:27)|26|14|15|16))|58|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0034, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(androidx.datastore.core.SingleProcessDataStore.b.C0075b r9, defpackage.by0 r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.s(androidx.datastore.core.SingleProcessDataStore$b$b, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.t(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, ww8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            kotlin.f.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L48
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = r4.t(r0)     // Catch: java.lang.Throwable -> L2d
            if (r4 != r1) goto L45
            return r1
        L45:
            ww8 r4 = defpackage.ww8.a
            return r4
        L48:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r4.h
            androidx.datastore.core.c r0 = new androidx.datastore.core.c
            r0.<init>(r5)
            r4.setValue(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.u(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        r4.h.setValue(new androidx.datastore.core.c(r5));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            kotlin.f.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L45
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = r4.t(r0)     // Catch: java.lang.Throwable -> L2d
            if (r4 != r1) goto L4f
            return r1
        L45:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r4.h
            androidx.datastore.core.c r0 = new androidx.datastore.core.c
            r0.<init>(r5)
            r4.setValue(r0)
        L4f:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.v(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, by0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [rk7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.SingleProcessDataStore$readData$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readData$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.L$2
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r1 = r0.L$1
            java.io.Closeable r1 = (java.io.Closeable) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L35
            goto L61
        L35:
            r6 = move-exception
            goto L6c
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.f.b(r7)
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L72
            java.io.File r2 = r6.q()     // Catch: java.io.FileNotFoundException -> L72
            r7.<init>(r2)     // Catch: java.io.FileNotFoundException -> L72
            rk7 r2 = r6.b     // Catch: java.lang.Throwable -> L67
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L67
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L67
            r4 = 0
            r0.L$2 = r4     // Catch: java.lang.Throwable -> L67
            r0.label = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r2.a(r7, r0)     // Catch: java.lang.Throwable -> L67
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r1 = r7
            r7 = r0
            r0 = r6
            r6 = r4
        L61:
            defpackage.gm0.a(r1, r6)     // Catch: java.io.FileNotFoundException -> L65
            return r7
        L65:
            r6 = move-exception
            goto L75
        L67:
            r0 = move-exception
            r1 = r7
            r5 = r0
            r0 = r6
            r6 = r5
        L6c:
            throw r6     // Catch: java.lang.Throwable -> L6d
        L6d:
            r7 = move-exception
            defpackage.gm0.a(r1, r6)     // Catch: java.io.FileNotFoundException -> L65
            throw r7     // Catch: java.io.FileNotFoundException -> L65
        L72:
            r7 = move-exception
            r0 = r6
            r6 = r7
        L75:
            java.io.File r7 = r0.q()
            boolean r7 = r7.exists()
            if (r7 != 0) goto L86
            rk7 r6 = r0.b
            java.lang.Object r6 = r6.b()
            return r6
        L86:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.w(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(4:12|13|14|16)(2:21|22))(4:23|24|25|(1:27)(2:28|29)))(2:33|34))(3:38|39|(1:41))|35|36))|47|6|7|(0)(0)|35|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0053, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0064, code lost:
    
        r2 = r7.c;
        r0.L$0 = r7;
        r0.L$1 = r8;
        r0.label = 2;
        r2 = r2.a(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0070, code lost:
    
        if (r2 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0073, code lost:
    
        r2 = r7;
        r7 = r8;
        r8 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            kotlin.f.b(r8)     // Catch: java.io.IOException -> L35
            goto L85
        L35:
            r7 = move-exception
            goto L89
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.L$1
            androidx.datastore.core.CorruptionException r7 = (androidx.datastore.core.CorruptionException) r7
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            kotlin.f.b(r8)
            goto L77
        L4b:
            java.lang.Object r7 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r7 = (androidx.datastore.core.SingleProcessDataStore) r7
            kotlin.f.b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L64
        L55:
            kotlin.f.b(r8)
            r0.L$0 = r7     // Catch: androidx.datastore.core.CorruptionException -> L53
            r0.label = r5     // Catch: androidx.datastore.core.CorruptionException -> L53
            java.lang.Object r8 = r7.w(r0)     // Catch: androidx.datastore.core.CorruptionException -> L53
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            w01 r2 = r7.c
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r2.a(r8, r0)
            if (r2 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L77:
            r0.L$0 = r7     // Catch: java.io.IOException -> L86
            r0.L$1 = r8     // Catch: java.io.IOException -> L86
            r0.label = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r7 = r2.z(r8, r0)     // Catch: java.io.IOException -> L86
            if (r7 != r1) goto L84
            return r1
        L84:
            r7 = r8
        L85:
            return r7
        L86:
            r8 = move-exception
            r0 = r7
            r7 = r8
        L89:
            defpackage.g62.a(r0, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.x(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.gt2 r9, kotlin.coroutines.CoroutineContext r10, defpackage.by0 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = (androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.L$1
            java.lang.Object r9 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r9 = (androidx.datastore.core.SingleProcessDataStore) r9
            kotlin.f.b(r11)
            goto L8f
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.L$2
            java.lang.Object r9 = r0.L$1
            androidx.datastore.core.a r9 = (androidx.datastore.core.a) r9
            java.lang.Object r10 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            kotlin.f.b(r11)
            goto L74
        L49:
            kotlin.f.b(r11)
            kotlinx.coroutines.flow.MutableStateFlow r11 = r8.h
            java.lang.Object r11 = r11.getValue()
            androidx.datastore.core.a r11 = (androidx.datastore.core.a) r11
            r11.a()
            java.lang.Object r2 = r11.b()
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1 r6 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1
            r6.<init>(r9, r2, r3)
            r0.L$0 = r8
            r0.L$1 = r11
            r0.L$2 = r2
            r0.label = r5
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r10, r6, r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r10 = r8
            r8 = r2
            r7 = r11
            r11 = r9
            r9 = r7
        L74:
            r9.a()
            boolean r9 = defpackage.zq3.c(r8, r11)
            if (r9 == 0) goto L7e
            goto La1
        L7e:
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r3
            r0.label = r4
            java.lang.Object r8 = r10.z(r11, r0)
            if (r8 != r1) goto L8d
            return r1
        L8d:
            r9 = r10
            r8 = r11
        L8f:
            kotlinx.coroutines.flow.MutableStateFlow r9 = r9.h
            androidx.datastore.core.a r10 = new androidx.datastore.core.a
            if (r8 == 0) goto L9a
            int r11 = r8.hashCode()
            goto L9b
        L9a:
            r11 = 0
        L9b:
            r10.<init>(r8, r11)
            r9.setValue(r10)
        La1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.y(gt2, kotlin.coroutines.CoroutineContext, by0):java.lang.Object");
    }

    @Override // defpackage.ba1
    public Object a(gt2 gt2Var, by0 by0Var) {
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.j.e(new b.C0075b(gt2Var, CompletableDeferred$default, (d) this.h.getValue(), by0Var.getContext()));
        return CompletableDeferred$default.await(by0Var);
    }

    @Override // defpackage.ba1
    public Flow getData() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #2 {IOException -> 0x00be, blocks: (B:13:0x0092, B:18:0x00a2, B:19:0x00bd, B:26:0x00c4, B:27:0x00c7, B:37:0x0065, B:23:0x00c2), top: B:36:0x0065, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.Object r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessDataStore$writeData$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$writeData$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r7 = r0.L$4
            java.io.FileOutputStream r7 = (java.io.FileOutputStream) r7
            java.lang.Object r8 = r0.L$3
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r1 = r0.L$2
            java.io.Closeable r1 = (java.io.Closeable) r1
            java.lang.Object r2 = r0.L$1
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r7 = move-exception
            goto Lc2
        L40:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L48:
            kotlin.f.b(r9)
            java.io.File r9 = r7.q()
            r7.p(r9)
            java.io.File r2 = new java.io.File
            java.io.File r9 = r7.q()
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.String r4 = r7.f
            java.lang.String r9 = defpackage.zq3.q(r9, r4)
            r2.<init>(r9)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lbe
            r9.<init>(r2)     // Catch: java.io.IOException -> Lbe
            rk7 r4 = r7.b     // Catch: java.lang.Throwable -> Lc0
            androidx.datastore.core.SingleProcessDataStore$c r5 = new androidx.datastore.core.SingleProcessDataStore$c     // Catch: java.lang.Throwable -> Lc0
            r5.<init>(r9)     // Catch: java.lang.Throwable -> Lc0
            r0.L$0 = r7     // Catch: java.lang.Throwable -> Lc0
            r0.L$1 = r2     // Catch: java.lang.Throwable -> Lc0
            r0.L$2 = r9     // Catch: java.lang.Throwable -> Lc0
            r6 = 0
            r0.L$3 = r6     // Catch: java.lang.Throwable -> Lc0
            r0.L$4 = r9     // Catch: java.lang.Throwable -> Lc0
            r0.label = r3     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r8 = r4.c(r8, r5, r0)     // Catch: java.lang.Throwable -> Lc0
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r7 = r9
            r1 = r7
            r8 = r6
        L89:
            java.io.FileDescriptor r7 = r7.getFD()     // Catch: java.lang.Throwable -> L3d
            r7.sync()     // Catch: java.lang.Throwable -> L3d
            ww8 r7 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L3d
            defpackage.gm0.a(r1, r8)     // Catch: java.io.IOException -> Lbe
            java.io.File r7 = r0.q()     // Catch: java.io.IOException -> Lbe
            boolean r7 = r2.renameTo(r7)     // Catch: java.io.IOException -> Lbe
            if (r7 == 0) goto La2
            ww8 r7 = defpackage.ww8.a
            return r7
        La2:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbe
            r8.<init>()     // Catch: java.io.IOException -> Lbe
            java.lang.String r9 = "Unable to rename "
            r8.append(r9)     // Catch: java.io.IOException -> Lbe
            r8.append(r2)     // Catch: java.io.IOException -> Lbe
            java.lang.String r9 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r8.append(r9)     // Catch: java.io.IOException -> Lbe
            java.lang.String r8 = r8.toString()     // Catch: java.io.IOException -> Lbe
            r7.<init>(r8)     // Catch: java.io.IOException -> Lbe
            throw r7     // Catch: java.io.IOException -> Lbe
        Lbe:
            r7 = move-exception
            goto Lc8
        Lc0:
            r7 = move-exception
            r1 = r9
        Lc2:
            throw r7     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r8 = move-exception
            defpackage.gm0.a(r1, r7)     // Catch: java.io.IOException -> Lbe
            throw r8     // Catch: java.io.IOException -> Lbe
        Lc8:
            boolean r8 = r2.exists()
            if (r8 == 0) goto Ld1
            r2.delete()
        Ld1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.z(java.lang.Object, by0):java.lang.Object");
    }
}
