package com.dropbox.android.external.store4.impl;

import com.dropbox.android.external.store4.SourceOfTruth;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class SourceOfTruthWithBarrier {
    public static final b d = new b(null);
    private final SourceOfTruth a;
    private final RefCountedResource b;
    private final AtomicLong c;

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class a {
        private final long a;

        /* renamed from: com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$a$a, reason: collision with other inner class name */
        public static final class C0164a extends a {
            public C0164a(long j) {
                super(j, null);
            }
        }

        public static final class b extends a {
            public static final C0165a c = new C0165a(null);
            private static final b d = new b(-1, null, 2, null);
            private final Throwable b;

            /* renamed from: com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$a$b$a, reason: collision with other inner class name */
            public static final class C0165a {
                public /* synthetic */ C0165a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a() {
                    return b.d;
                }

                private C0165a() {
                }
            }

            public b(long j, Throwable th) {
                super(j, null);
                this.b = th;
            }

            public final Throwable c() {
                return this.b;
            }

            public /* synthetic */ b(long j, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : th);
            }
        }

        public /* synthetic */ a(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        public final long a() {
            return this.a;
        }

        private a(long j) {
            this.a = j;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public SourceOfTruthWithBarrier(SourceOfTruth sourceOfTruth) {
        zq3.h(sourceOfTruth, "delegate");
        this.a = sourceOfTruth;
        this.b = new RefCountedResource(new SourceOfTruthWithBarrier$barriers$1(null), null, 2, null);
        this.c = new AtomicLong(0L);
    }

    public final Flow d(Object obj, CompletableDeferred completableDeferred) {
        zq3.h(completableDeferred, "lock");
        return FlowKt.flow(new SourceOfTruthWithBarrier$reader$1(this, obj, completableDeferred, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|8))|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0061, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0062, code lost:
    
        r7 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00db, code lost:
    
        if ((r11 instanceof java.util.concurrent.CancellationException) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00de, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00df, code lost:
    
        r7 = r10;
        r10 = r7;
        r8 = r11;
        r11 = r7;
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0125 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004d, blocks: (B:18:0x0048, B:19:0x010a, B:24:0x0125, B:67:0x00d9, B:47:0x0074, B:27:0x005c, B:49:0x00c0), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed A[Catch: all -> 0x0126, TryCatch #1 {all -> 0x0126, blocks: (B:31:0x00e3, B:34:0x00f2, B:39:0x00ed), top: B:30:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.dropbox.android.external.store4.impl.RefCountedResource] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.dropbox.android.external.store4.impl.RefCountedResource] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlinx.coroutines.flow.MutableSharedFlow] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r9, java.lang.Object r10, defpackage.by0 r11) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier.e(java.lang.Object, java.lang.Object, by0):java.lang.Object");
    }
}
