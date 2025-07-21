package defpackage;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.AbraVariant;
import com.nytimes.android.libs.messagingarchitecture.model.LegacyMessage;
import com.nytimes.android.libs.messagingarchitecture.model.MessageEntitlement;
import com.nytimes.android.libs.messagingarchitecture.model.Relationship;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class mr4 {
    public static final List a(LegacyMessage legacyMessage, Map map, Set set, AbraManager abraManager, js4 js4Var) {
        zq3.h(legacyMessage, "<this>");
        zq3.h(map, "historyIds");
        zq3.h(set, "actionsCompleted");
        zq3.h(abraManager, "abraManager");
        zq3.h(js4Var, "userState");
        List c = i.c();
        if (legacyMessage.i() && legacyMessage.d() != null && set.contains(legacyMessage.d())) {
            c.add(new ob6(legacyMessage.d()));
        }
        AbraVariant a = ts7.a(abraManager, legacyMessage.b());
        String variantName = a != null ? a.getVariantName() : null;
        if (legacyMessage.c() != null && !zq3.c(variantName, legacyMessage.c())) {
            c.add(new qb6(variantName, legacyMessage.c()));
        }
        if (legacyMessage.s() && js4Var.a("MM")) {
            c.add(new rb6("is not subscribed (Subscription Required)"));
        }
        if (legacyMessage.t() != null) {
            List b = legacyMessage.t().b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : b) {
                MessageEntitlement messageEntitlement = (MessageEntitlement) obj;
                if (messageEntitlement.b() == js4Var.a(messageEntitlement.a())) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list = (List) pair.a();
            List list2 = (List) pair.b();
            if (legacyMessage.t().c() == Relationship.AND && !list2.isEmpty()) {
                c.add(new rb6(b(legacyMessage.t().c(), list2)));
            } else if (legacyMessage.t().c() == Relationship.OR && list.isEmpty()) {
                c.add(new rb6(b(legacyMessage.t().c(), list2)));
            }
        }
        Integer num = (Integer) map.get(legacyMessage.k());
        int intValue = num != null ? num.intValue() : 0;
        if (c.isEmpty() && intValue > 0) {
            map.put(legacyMessage.k(), Integer.valueOf(intValue - 1));
            c.add(new pb6(legacyMessage.k(), intValue));
        }
        return i.a(c);
    }

    private static final String b(Relationship relationship, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("does not meet entitlement requirement Relationship: " + relationship + " (");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MessageEntitlement messageEntitlement = (MessageEntitlement) it2.next();
            sb.append(messageEntitlement.a() + ": subscribed: " + messageEntitlement.b() + "; ");
        }
        sb.append(")");
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
