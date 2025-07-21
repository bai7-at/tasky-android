package defpackage;

import com.datadog.legacy.trace.api.Config;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class s51 {
    public static List a() {
        ArrayList arrayList = new ArrayList();
        for (d1 d1Var : Arrays.asList(new oo2(), new po2(), new vq5(), new dl7(), new dl7("service", false))) {
            if (Config.b().J(d1Var.getClass().getSimpleName())) {
                arrayList.add(d1Var);
            }
        }
        Iterator it2 = Config.b().G().iterator();
        while (it2.hasNext()) {
            arrayList.add(new dl7((String) it2.next(), true));
        }
        return arrayList;
    }
}
