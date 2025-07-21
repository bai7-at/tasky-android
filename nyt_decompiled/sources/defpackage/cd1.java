package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class cd1 {
    private final Set a;
    private final ig1 b;

    public cd1(Set set, ig1 ig1Var) {
        zq3.h(set, "factories");
        zq3.h(ig1Var, "defaultFactory");
        this.a = set;
        this.b = ig1Var;
    }

    private final dd1 b(Uri uri) {
        Object obj;
        Iterator it2 = this.a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((dd1) obj).b(uri)) {
                break;
            }
        }
        return (dd1) obj;
    }

    public final dd1 a(Uri uri) {
        zq3.h(uri, "uri");
        dd1 b = b(uri);
        return b == null ? this.b : b;
    }

    public final boolean c(Uri uri) {
        zq3.h(uri, "uri");
        return b(uri) != null;
    }
}
