package defpackage;

import com.nytimes.android.subauth.core.purchase.network.response.LinkResponseJsonAdapter;
import defpackage.l54;
import retrofit2.HttpException;

/* loaded from: classes4.dex */
public abstract class m54 {
    public static final l54 a(Exception exc, LinkResponseJsonAdapter linkResponseJsonAdapter) {
        zq3.h(exc, "exception");
        zq3.h(linkResponseJsonAdapter, "adapter");
        return exc instanceof HttpException ? b((HttpException) exc, linkResponseJsonAdapter) : new l54.h("Unknown linking exception", exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        defpackage.zq3.e(r4);
        r8 = new l54.g(r4, r9, 0, 4, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:11:0x002b, B:13:0x0033, B:15:0x0039, B:20:0x004c, B:22:0x0052, B:34:0x00ea, B:35:0x00f9, B:37:0x00cf, B:39:0x00d7, B:40:0x00b3, B:42:0x00bb, B:43:0x0097, B:45:0x009f, B:46:0x007b, B:48:0x0083, B:49:0x005d, B:51:0x0065, B:52:0x0045), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:11:0x002b, B:13:0x0033, B:15:0x0039, B:20:0x004c, B:22:0x0052, B:34:0x00ea, B:35:0x00f9, B:37:0x00cf, B:39:0x00d7, B:40:0x00b3, B:42:0x00bb, B:43:0x0097, B:45:0x009f, B:46:0x007b, B:48:0x0083, B:49:0x005d, B:51:0x0065, B:52:0x0045), top: B:10:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.l54 b(retrofit2.HttpException r9, com.nytimes.android.subauth.core.purchase.network.response.LinkResponseJsonAdapter r10) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m54.b(retrofit2.HttpException, com.nytimes.android.subauth.core.purchase.network.response.LinkResponseJsonAdapter):l54");
    }
}
