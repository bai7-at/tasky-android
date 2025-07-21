package defpackage;

import android.content.Context;
import android.net.Uri;
import com.nytimes.android.logging.NYTLogger;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class ey3 extends id1 {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final ms b;
    private final com.nytimes.android.entitlements.a c;
    private final Set d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey3(ms msVar, com.nytimes.android.entitlements.a aVar, Set set) {
        super("/lp/");
        zq3.h(msVar, "wrapper");
        zq3.h(aVar, "eCommClient");
        zq3.h(set, "nytHostSet");
        this.b = msVar;
        this.c = aVar;
        this.d = set;
    }

    private final boolean d(String str) {
        return zq3.c(str, "subscribe") || h.P(str, "sku", false, 2, null);
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        NYTLogger.l("Deeplinking to landing page - path: %s", uri);
        boolean a2 = this.c.a();
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        String v0 = h.v0(path, c());
        String str2 = (a2 && d(v0)) ? "" : v0;
        if (a2) {
            str = "Deep Link";
        }
        return this.b.b(context, str2, str);
    }

    @Override // defpackage.id1, defpackage.dd1
    public boolean b(Uri uri) {
        List<String> pathSegments;
        zq3.h(uri, "uri");
        return super.b(uri) || (i.c0(this.d, uri.getHost()) && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() == 0);
    }
}
