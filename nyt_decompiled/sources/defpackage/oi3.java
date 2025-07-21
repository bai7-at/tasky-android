package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class oi3 {
    public static final oi3 a = new oi3();
    private static final HashMap b = new HashMap();
    private static final HashMap c = new HashMap();
    private static final String d = w92.l().getPackageName();
    private static final SharedPreferences e = w92.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences f = w92.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    private oi3() {
    }

    public static final Object a(Context context, IBinder iBinder) {
        if (c11.d(oi3.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            return a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            c11.b(th, oi3.class);
            return null;
        }
    }

    public static final void b() {
        if (c11.d(oi3.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = e;
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            } else if (currentTimeMillis - j > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th) {
            c11.b(th, oi3.class);
        }
    }

    private final ArrayList c(ArrayList arrayList) {
        if (c11.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor edit = f.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= 86400 && !zq3.c(f.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final Class d(Context context, String str) {
        if (c11.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = c;
            Class cls = (Class) hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            Class b2 = si3.b(context, str);
            if (b2 != null) {
                hashMap.put(str, b2);
            }
            return b2;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Method e(Class cls, String str) {
        Class[] clsArr;
        Method c2;
        if (c11.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = b;
            Method method = (Method) hashMap.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        Class cls2 = Integer.TYPE;
                        zq3.g(cls2, "TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class, String.class};
                        break;
                    }
                    clsArr = null;
                    break;
                case -1450694211:
                    if (!str.equals("isBillingSupported")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls3 = Integer.TYPE;
                        zq3.g(cls3, "TYPE");
                        clsArr = new Class[]{cls3, String.class, String.class};
                        break;
                    }
                case -1123215065:
                    if (!str.equals("asInterface")) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!str.equals("getPurchaseHistory")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls4 = Integer.TYPE;
                        zq3.g(cls4, "TYPE");
                        clsArr = new Class[]{cls4, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals("getSkuDetails")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls5 = Integer.TYPE;
                        zq3.g(cls5, "TYPE");
                        clsArr = new Class[]{cls5, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                c2 = si3.c(cls, str, null);
            } else {
                si3 si3Var = si3.a;
                c2 = si3.c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (c2 != null) {
                hashMap.put(str, c2);
            }
            return c2;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final ArrayList f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (c11.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (o(context, obj, str)) {
                int i = 0;
                String str2 = null;
                boolean z = false;
                do {
                    Object n = n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, d, str, str2, new Bundle()});
                    if (n != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) n;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it2 = stringArrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next = it2.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            }
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i < 30 || str2 == null) {
                                break;
                                break;
                            }
                        }
                    }
                    str2 = null;
                    if (i < 30) {
                        break;
                    }
                } while (!z);
            }
            return arrayList;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final ArrayList g(Context context, Object obj) {
        oi3 oi3Var;
        Class d2;
        if (c11.d(oi3.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            ArrayList arrayList = new ArrayList();
            return (obj == null || (d2 = (oi3Var = a).d(context, "com.android.vending.billing.IInAppBillingService")) == null || oi3Var.e(d2, "getPurchaseHistory") == null) ? arrayList : oi3Var.c(oi3Var.f(context, obj, "inapp"));
        } catch (Throwable th) {
            c11.b(th, oi3.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[EDGE_INSN: B:24:0x005a->B:28:0x005a BREAK  A[LOOP:0: B:12:0x0018->B:23:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList h(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = defpackage.c11.d(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L51
            if (r14 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.o(r13, r14, r15)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L5a
            r2 = 0
            r3 = r1
        L18:
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = defpackage.oi3.d     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r5, r15, r3}     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.n(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L53
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "RESPONSE_CODE"
            int r4 = r3.getInt(r4)     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L53
            java.lang.String r4 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r4 = r3.getStringArrayList(r4)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L5a
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L51
            int r2 = r2 + r5
            r0.addAll(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r4)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r13 = move-exception
            goto L5b
        L53:
            r3 = r1
        L54:
            r4 = 30
            if (r2 >= r4) goto L5a
            if (r3 != 0) goto L18
        L5a:
            return r0
        L5b:
            defpackage.c11.b(r13, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi3.h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public static final ArrayList i(Context context, Object obj) {
        if (c11.d(oi3.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            oi3 oi3Var = a;
            return oi3Var.c(oi3Var.h(context, obj, "inapp"));
        } catch (Throwable th) {
            c11.b(th, oi3.class);
            return null;
        }
    }

    public static final ArrayList j(Context context, Object obj) {
        if (c11.d(oi3.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            oi3 oi3Var = a;
            return oi3Var.c(oi3Var.h(context, obj, "subs"));
        } catch (Throwable th) {
            c11.b(th, oi3.class);
            return null;
        }
    }

    public static final Map k(Context context, ArrayList arrayList, Object obj, boolean z) {
        if (c11.d(oi3.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            zq3.h(arrayList, "skuList");
            Map p = a.p(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!p.containsKey(str)) {
                    arrayList2.add(str);
                }
            }
            p.putAll(a.l(context, arrayList2, obj, z));
            return p;
        } catch (Throwable th) {
            c11.b(th, oi3.class);
            return null;
        }
    }

    private final Map l(Context context, ArrayList arrayList, Object obj, boolean z) {
        int size;
        if (c11.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object n = n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, d, z ? "subs" : "inapp", bundle});
                if (n != null) {
                    Bundle bundle2 = (Bundle) n;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                Object obj2 = arrayList.get(i);
                                zq3.g(obj2, "skuList[i]");
                                String str = stringArrayList.get(i);
                                zq3.g(str, "skuDetailsList[i]");
                                linkedHashMap.put(obj2, str);
                                if (i2 > size) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        q(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e2;
        if (c11.d(this)) {
            return null;
        }
        try {
            Class d2 = d(context, str);
            if (d2 == null || (e2 = e(d2, str2)) == null) {
                return null;
            }
            si3 si3Var = si3.a;
            return si3.e(d2, e2, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final boolean o(Context context, Object obj, String str) {
        if (c11.d(this) || obj == null) {
            return false;
        }
        try {
            Object n = n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, d, str});
            if (n != null) {
                return ((Integer) n).intValue() == 0;
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    private final Map p(ArrayList arrayList) {
        if (c11.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                String string = e.getString(str, null);
                if (string != null) {
                    List F0 = h.F0(string, new String[]{";"}, false, 2, 2, null);
                    if (currentTimeMillis - Long.parseLong((String) F0.get(0)) < 43200) {
                        zq3.g(str, "sku");
                        linkedHashMap.put(str, F0.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final void q(Map map) {
        if (c11.d(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = e.edit();
            for (Map.Entry entry : map.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final boolean m(String str) {
        if (c11.d(this)) {
            return false;
        }
        try {
            zq3.h(str, "skuDetail");
            try {
                String optString = new JSONObject(str).optString("freeTrialPeriod");
                if (optString != null) {
                    return optString.length() > 0;
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }
}
