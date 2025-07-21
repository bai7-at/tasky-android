package defpackage;

import defpackage.qa3;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class za1 implements qa3.c {
    private final Map a = new HashMap();

    public za1(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.a.put(((String) entry.getKey()).trim().toLowerCase(Locale.US), (String) entry.getValue());
        }
    }

    private String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : str.split(",")) {
            String[] split = str2.split("=");
            if (split.length >= 2 && "_dd.p.tid".equals(split[0])) {
                return split[1];
            }
        }
        return null;
    }

    @Override // qa3.c
    public wx7 a(dj8 dj8Var) {
        String str;
        Map map;
        Map map2;
        BigInteger bigInteger;
        int i;
        String str2;
        String str3;
        try {
            Map emptyMap = Collections.emptyMap();
            Map emptyMap2 = Collections.emptyMap();
            BigInteger bigInteger2 = BigInteger.ZERO;
            Iterator it2 = dj8Var.iterator();
            str = null;
            map = emptyMap;
            map2 = emptyMap2;
            bigInteger = bigInteger2;
            i = Integer.MIN_VALUE;
            str2 = null;
            str3 = null;
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.US);
                String str4 = (String) entry.getValue();
                if (str4 != null) {
                    if ("x-datadog-trace-id".equalsIgnoreCase(lowerCase)) {
                        str2 = str4;
                    } else if ("x-datadog-tags".equalsIgnoreCase(lowerCase)) {
                        str3 = b(str4);
                    } else if ("x-datadog-parent-id".equalsIgnoreCase(lowerCase)) {
                        bigInteger = qa3.f(str4, 10);
                    } else if ("x-datadog-sampling-priority".equalsIgnoreCase(lowerCase)) {
                        i = Integer.parseInt(str4);
                    } else if ("x-datadog-origin".equalsIgnoreCase(lowerCase)) {
                        str = str4;
                    } else if (lowerCase.startsWith("ot-baggage-")) {
                        if (map.isEmpty()) {
                            map = new HashMap();
                        }
                        map.put(lowerCase.replace("ot-baggage-", ""), qa3.c(str4));
                    }
                    if (this.a.containsKey(lowerCase)) {
                        if (map2.isEmpty()) {
                            map2 = new HashMap();
                        }
                        map2.put((String) this.a.get(lowerCase), qa3.c(str4));
                    }
                }
            }
        } catch (RuntimeException unused) {
        }
        if (str2 != null && str3 != null) {
            BigInteger e = qa3.e(str3 + pb4.e(pb4.d(str2), 16), 16);
            if (!BigInteger.ZERO.equals(e)) {
                x72 x72Var = new x72(e, bigInteger, i, str, map, map2);
                x72Var.h();
                return x72Var;
            }
            if (str != null || !map2.isEmpty()) {
                return new uf8(str, map2);
            }
            return null;
        }
        return new uf8(str, map2);
    }
}
