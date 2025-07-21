package androidx.compose.ui.text.font;

import androidx.compose.runtime.b0;
import defpackage.hu5;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.uu8;
import defpackage.x08;
import java.util.List;

/* loaded from: classes.dex */
public final class AsyncFontListLoader implements x08 {
    private final List a;
    private final uu8 b;
    private final AsyncTypefaceCache c;
    private final ss2 d;
    private final hu5 e;
    private final sy4 f;
    private boolean g = true;

    public AsyncFontListLoader(List list, Object obj, uu8 uu8Var, AsyncTypefaceCache asyncTypefaceCache, ss2 ss2Var, hu5 hu5Var) {
        this.a = list;
        this.b = uu8Var;
        this.c = asyncTypefaceCache;
        this.d = ss2Var;
        this.e = hu5Var;
        this.f = b0.e(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.f.setValue(obj);
    }

    @Override // defpackage.x08
    public Object getValue() {
        return this.f.getValue();
    }

    public final boolean n() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077 A[Catch: all -> 0x00ec, TryCatch #1 {all -> 0x00ec, blocks: (B:16:0x0077, B:18:0x008e, B:24:0x00b8, B:31:0x00ee, B:51:0x006e), top: B:50:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #1 {all -> 0x00ec, blocks: (B:16:0x0077, B:18:0x008e, B:24:0x00b8, B:31:0x00ee, B:51:0x006e), top: B:50:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00ec, blocks: (B:16:0x0077, B:18:0x008e, B:24:0x00b8, B:31:0x00ee, B:51:0x006e), top: B:50:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008c -> B:14:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0101 -> B:13:0x0104). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.by0 r19) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.o(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(androidx.compose.ui.text.font.d r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$0
            r6 = r5
            androidx.compose.ui.text.font.d r6 = (androidx.compose.ui.text.font.d) r6
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L31
            goto L50
        L2f:
            r5 = move-exception
            goto L52
        L31:
            r5 = move-exception
            goto L7e
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.f.b(r7)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r7 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L31
            r7.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L31
            r0.L$0 = r6     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L31
            r0.label = r3     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L31
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r2, r7, r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L31
            if (r7 != r1) goto L50
            return r1
        L50:
            r4 = r7
            goto L88
        L52:
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            kotlinx.coroutines.CoroutineExceptionHandler$Key r1 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            kotlin.coroutines.CoroutineContext$a r7 = r7.get(r1)
            kotlinx.coroutines.CoroutineExceptionHandler r7 = (kotlinx.coroutines.CoroutineExceptionHandler) r7
            if (r7 == 0) goto L88
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to load font "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6, r5)
            r7.handleException(r0, r1)
            goto L88
        L7e:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            boolean r6 = kotlinx.coroutines.JobKt.isActive(r6)
            if (r6 == 0) goto L89
        L88:
            return r4
        L89:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.t(androidx.compose.ui.text.font.d, by0):java.lang.Object");
    }
}
