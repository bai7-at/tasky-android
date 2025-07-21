package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.Iterator;
import java.util.List;
import kotlin.text.h;

/* loaded from: classes2.dex */
public abstract class wa3 {
    public static final String a(List list, String str) {
        Object obj;
        zq3.h(list, "<this>");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (h.w(((va3) obj).a(), str, true)) {
                break;
            }
        }
        va3 va3Var = (va3) obj;
        if (va3Var != null) {
            return va3Var.b();
        }
        return null;
    }
}
