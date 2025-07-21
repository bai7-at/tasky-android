package androidx.paging;

import defpackage.kt2;
import defpackage.zq3;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public final class UnbatchedFlowCombiner {
    private final kt2 a;
    private final CompletableDeferred b;
    private final Mutex c;
    private final CompletableDeferred[] d;
    private final Object[] e;

    public UnbatchedFlowCombiner(kt2 kt2Var) {
        Object obj;
        zq3.h(kt2Var, "send");
        this.a = kt2Var;
        this.b = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.c = MutexKt.Mutex$default(false, 1, null);
        CompletableDeferred[] completableDeferredArr = new CompletableDeferred[2];
        for (int i = 0; i < 2; i++) {
            completableDeferredArr[i] = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        }
        this.d = completableDeferredArr;
        Object[] objArr = new Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            obj = FlowExtKt.a;
            objArr[i2] = obj;
        }
        this.e = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:27:0x009d, B:29:0x00a4, B:34:0x00b6, B:36:0x00be, B:38:0x00c8, B:43:0x00cc, B:44:0x00d6, B:50:0x00d1, B:51:0x00d4, B:31:0x00ae), top: B:26:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:27:0x009d, B:29:0x00a4, B:34:0x00b6, B:36:0x00be, B:38:0x00c8, B:43:0x00cc, B:44:0x00d6, B:50:0x00d1, B:51:0x00d4, B:31:0x00ae), top: B:26:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:27:0x009d, B:29:0x00a4, B:34:0x00b6, B:36:0x00be, B:38:0x00c8, B:43:0x00cc, B:44:0x00d6, B:50:0x00d1, B:51:0x00d4, B:31:0x00ae), top: B:26:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r13, java.lang.Object r14, defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.UnbatchedFlowCombiner.a(int, java.lang.Object, by0):java.lang.Object");
    }
}
