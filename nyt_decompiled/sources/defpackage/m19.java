package defpackage;

import com.nytimes.android.subauth.core.database.typeconverters.UserSubscriptionDateJsonAdapter;
import com.nytimes.android.subauth.core.database.typeconverters.UserSubscriptionEntitlementJsonAdapter;
import com.nytimes.android.subauth.core.database.typeconverters.UserSubscriptionProductJsonAdapter;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscription;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import com.nytimes.android.subauth.core.database.userdata.subscription.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class m19 {
    private final i moshi;
    private final JsonAdapter<List<String>> userStringListAdapter;
    private final JsonAdapter<List<UserSubscription>> userSubscriptionAdapter;

    public m19() {
        i d = new i.b().c(Date.class, new UserSubscriptionDateJsonAdapter()).c(UserSubscriptionProduct.class, new UserSubscriptionProductJsonAdapter()).c(UserSubscriptionEntitlement.class, new UserSubscriptionEntitlementJsonAdapter()).d();
        this.moshi = d;
        this.userStringListAdapter = d.d(j.j(List.class, String.class));
        this.userSubscriptionAdapter = d.d(j.j(List.class, UserSubscription.class));
    }

    public final String a(Set set) {
        zq3.h(set, "list");
        try {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(kotlin.collections.i.w(set2, 10));
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((UserSubscriptionEntitlement) it2.next()).getRawValue());
            }
            String json = this.userStringListAdapter.toJson(arrayList);
            zq3.e(json);
            return json;
        } catch (Exception e) {
            ul8.a.z("SUBAUTH").f(e, "Failed to parse obj: " + set, new Object[0]);
            return "[]";
        }
    }

    public final String b(List list) {
        zq3.h(list, "value");
        try {
            String json = this.userSubscriptionAdapter.toJson(list);
            zq3.e(json);
            return json;
        } catch (Exception e) {
            ul8.a.z("SUBAUTH").f(e, "Failed to parse from obj: " + list, new Object[0]);
            return "[]";
        }
    }

    public final Set c(String str) {
        List<String> list;
        zq3.h(str, "string");
        try {
            list = this.userStringListAdapter.fromJson(str);
        } catch (Exception e) {
            ul8.a.z("SUBAUTH").f(e, "Failed to parse from str: " + str, new Object[0]);
            list = null;
        }
        if (list == null) {
            list = kotlin.collections.i.l();
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.i.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(a.b((String) it2.next()));
        }
        return kotlin.collections.i.c1(arrayList);
    }

    public final List d(String str) {
        List<UserSubscription> list;
        zq3.h(str, "string");
        try {
            list = this.userSubscriptionAdapter.fromJson(str);
        } catch (Exception e) {
            ul8.a.z("SUBAUTH").f(e, "Failed to parse from str: " + str, new Object[0]);
            list = null;
        }
        return list == null ? kotlin.collections.i.l() : list;
    }
}
