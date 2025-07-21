package defpackage;

import com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallData;
import com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallUrgencyMessageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class iq5 {
    public static final hq5 a(PaywallData paywallData) {
        PaywallUrgencyMessageData paywallUrgencyMessageData;
        Object obj;
        zq3.h(paywallData, "<this>");
        List d = paywallData.d();
        oh3 oh3Var = null;
        if (d != null) {
            Iterator it2 = d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (za7.b((PaywallUrgencyMessageData) obj, 0L, 1, null)) {
                    break;
                }
            }
            paywallUrgencyMessageData = (PaywallUrgencyMessageData) obj;
        } else {
            paywallUrgencyMessageData = null;
        }
        String e = paywallData.e();
        String b = paywallData.b();
        String a = paywallData.a();
        if (paywallUrgencyMessageData != null) {
            String c = paywallUrgencyMessageData.c();
            if (c != null && !h.d0(c)) {
                e = paywallUrgencyMessageData.c();
            }
            if (!h.d0(paywallUrgencyMessageData.b())) {
                b = paywallUrgencyMessageData.b();
            }
            String a2 = paywallUrgencyMessageData.a();
            if (a2 != null && !h.d0(a2)) {
                a = paywallUrgencyMessageData.a();
            }
        }
        List c2 = paywallData.c();
        if (c2 != null && !c2.isEmpty()) {
            List<String> c3 = paywallData.c();
            ArrayList arrayList = new ArrayList();
            for (String str : c3) {
                Integer num = (Integer) me3.a().get(str);
                he3 he3Var = num != null ? new he3(str, num.intValue()) : null;
                if (he3Var != null) {
                    arrayList.add(he3Var);
                }
            }
            oh3Var = new oh3(arrayList);
        }
        return new hq5(e, oh3Var, b, a);
    }
}
