package okhttp3.internal.http;

import okhttp3.Interceptor;

/* loaded from: classes5.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i) {
        if (i == 100) {
            return true;
        }
        return 102 <= i && i < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:64:0x00aa, B:66:0x00b3, B:22:0x00bb, B:24:0x00e5, B:26:0x00ee, B:27:0x00f1, B:28:0x0115, B:32:0x0120, B:33:0x013f, B:35:0x014d, B:43:0x0163, B:45:0x0169, B:48:0x0176, B:50:0x0190, B:51:0x0198, B:52:0x01a2, B:61:0x0158, B:62:0x012f), top: B:63:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0169 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:64:0x00aa, B:66:0x00b3, B:22:0x00bb, B:24:0x00e5, B:26:0x00ee, B:27:0x00f1, B:28:0x0115, B:32:0x0120, B:33:0x013f, B:35:0x014d, B:43:0x0163, B:45:0x0169, B:48:0x0176, B:50:0x0190, B:51:0x0198, B:52:0x01a2, B:61:0x0158, B:62:0x012f), top: B:63:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:64:0x00aa, B:66:0x00b3, B:22:0x00bb, B:24:0x00e5, B:26:0x00ee, B:27:0x00f1, B:28:0x0115, B:32:0x0120, B:33:0x013f, B:35:0x014d, B:43:0x0163, B:45:0x0169, B:48:0x0176, B:50:0x0190, B:51:0x0198, B:52:0x01a2, B:61:0x0158, B:62:0x012f), top: B:63:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
