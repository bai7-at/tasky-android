package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.logging.NYTLogger;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ks extends id1 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final ms b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(ms msVar) {
        super("/id/");
        zq3.h(msVar, "wrapper");
        this.b = msVar;
    }

    private final Intent d(Context context, Uri uri, String str, boolean z, long j, boolean z2) {
        if (z2) {
            return this.b.h(context, j, null, str, z);
        }
        ms msVar = this.b;
        String uri2 = uri.toString();
        zq3.g(uri2, "toString(...)");
        return ns.a(msVar, context, uri2, str, z);
    }

    private final boolean e(Uri uri, String str) {
        if (uri.getPathSegments().size() < 3) {
            return false;
        }
        return zq3.c(str, uri.getPathSegments().get(2));
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        long f = f(uri);
        if (f != -1) {
            return d(context, uri, str, z, f, e(uri, AssetConstants.AUDIO_TYPE));
        }
        ms msVar = this.b;
        String uri2 = uri.toString();
        zq3.g(uri2, "toString(...)");
        return ns.a(msVar, context, uri2, str, z);
    }

    public final long f(Uri uri) {
        zq3.h(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        zq3.e(pathSegments);
        if (!(!pathSegments.isEmpty()) || !zq3.c(pathSegments.get(0), "id")) {
            return -1L;
        }
        try {
            String str = pathSegments.get(1);
            zq3.g(str, "get(...)");
            return Long.parseLong(str);
        } catch (Exception unused) {
            NYTLogger.g("URI " + uri + " did not contain ID_PATH_SEGMENT", new Object[0]);
            return -1L;
        }
    }
}
