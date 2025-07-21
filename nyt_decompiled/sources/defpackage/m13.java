package defpackage;

import com.android.billingclient.api.e;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class m13 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(e eVar, String str) {
        Object obj;
        List f = eVar.f();
        String str2 = null;
        if (f != null) {
            Iterator it2 = f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((e.d) obj).b(), str)) {
                    break;
                }
            }
            e.d dVar = (e.d) obj;
            if (dVar != null) {
                str2 = dVar.d();
            }
        }
        return str2 == null ? "" : str2;
    }
}
