package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.text.h;

/* loaded from: classes.dex */
public final class l07 implements we4 {
    private final boolean b(Uri uri) {
        String authority;
        return zq3.c(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !h.d0(authority) && uri.getPathSegments().size() == 2;
    }

    @Override // defpackage.we4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri a(Uri uri, uk5 uk5Var) {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = uk5Var.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
        zq3.g(parse, "parse(this)");
        return parse;
    }
}
