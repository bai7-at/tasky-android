package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class x32 {
    private static boolean b;
    public static final x32 a = new x32();
    private static final List c = new ArrayList();
    private static final Set d = new HashSet();

    public static final class a {
        private String a;
        private List b;

        public a(String str, List list) {
            zq3.h(str, "eventName");
            zq3.h(list, "deprecateParams");
            this.a = str;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final void c(List list) {
            zq3.h(list, "<set-?>");
            this.b = list;
        }
    }

    private x32() {
    }

    public static final void a() {
        if (c11.d(x32.class)) {
            return;
        }
        try {
            b = true;
            a.b();
        } catch (Throwable th) {
            c11.b(th, x32.class);
        }
    }

    private final synchronized void b() {
        rd2 n;
        if (c11.d(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.a;
            n = FetchedAppSettingsManager.n(w92.m(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            c11.b(th, this);
            return;
        }
        if (n == null) {
            return;
        }
        String h = n.h();
        if (h != null && h.length() > 0) {
            JSONObject jSONObject = new JSONObject(h);
            c.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        Set set = d;
                        zq3.g(next, TransferTable.COLUMN_KEY);
                        set.add(next);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        zq3.g(next, TransferTable.COLUMN_KEY);
                        a aVar = new a(next, new ArrayList());
                        if (optJSONArray != null) {
                            aVar.c(g29.m(optJSONArray));
                        }
                        c.add(aVar);
                    }
                }
            }
        }
    }

    public static final void c(Map map, String str) {
        if (c11.d(x32.class)) {
            return;
        }
        try {
            zq3.h(map, "parameters");
            zq3.h(str, "eventName");
            if (b) {
                ArrayList<String> arrayList = new ArrayList(map.keySet());
                for (a aVar : new ArrayList(c)) {
                    if (zq3.c(aVar.b(), str)) {
                        for (String str2 : arrayList) {
                            if (aVar.a().contains(str2)) {
                                map.remove(str2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c11.b(th, x32.class);
        }
    }

    public static final void d(List list) {
        if (c11.d(x32.class)) {
            return;
        }
        try {
            zq3.h(list, "events");
            if (b) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (d.contains(((AppEvent) it2.next()).f())) {
                        it2.remove();
                    }
                }
            }
        } catch (Throwable th) {
            c11.b(th, x32.class);
        }
    }
}
