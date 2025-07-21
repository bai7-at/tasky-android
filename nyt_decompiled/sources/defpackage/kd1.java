package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class kd1 {
    public static final a b = new a(null);
    public static final int c = 8;
    private final List a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public kd1(List list) {
        zq3.h(list, "supportedHosts");
        this.a = list;
    }

    public final boolean a(Uri uri) {
        zq3.h(uri, "uri");
        return !this.a.isEmpty() && zq3.c("nytimes", uri.getScheme()) && i.c0(this.a, uri.getHost());
    }

    public final Uri b(Uri uri) {
        zq3.h(uri, "uri");
        String host = uri.getHost();
        if (host != null && host.equals("notifications")) {
            return Uri.parse("nytimes://reader/lp/notifications");
        }
        Uri build = uri.buildUpon().scheme("https").build();
        zq3.e(build);
        return build;
    }
}
