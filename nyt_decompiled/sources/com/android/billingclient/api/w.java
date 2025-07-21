package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.d;
import java.util.ArrayList;

/* loaded from: classes2.dex */
abstract class w {
    static v a(Bundle bundle, String str, String str2) {
        d dVar = m.j;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", String.format("%s got null owned items list", str2));
            return new v(dVar, 54);
        }
        int b = com.google.android.gms.internal.play_billing.k.b(bundle, "BillingClient");
        String e = com.google.android.gms.internal.play_billing.k.e(bundle, "BillingClient");
        d.a c = d.c();
        c.c(b);
        c.b(e);
        d a = c.a();
        if (b != 0) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(b)));
            return new v(a, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new v(dVar, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new v(dVar, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new v(dVar, 57);
        }
        if (stringArrayList3 != null) {
            return new v(m.l, 1);
        }
        com.google.android.gms.internal.play_billing.k.i("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new v(dVar, 58);
    }
}
