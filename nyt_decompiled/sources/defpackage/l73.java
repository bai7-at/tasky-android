package defpackage;

import defpackage.qa3;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class l73 implements qa3.c {
    private final Map a = new HashMap();

    public l73(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.a.put(((String) entry.getKey()).trim().toLowerCase(Locale.US), (String) entry.getValue());
        }
    }

    @Override // qa3.c
    public wx7 a(dj8 dj8Var) {
        try {
            Map emptyMap = Collections.emptyMap();
            Map emptyMap2 = Collections.emptyMap();
            BigInteger bigInteger = BigInteger.ZERO;
            Iterator it2 = dj8Var.iterator();
            Map map = emptyMap;
            Map map2 = emptyMap2;
            BigInteger bigInteger2 = bigInteger;
            BigInteger bigInteger3 = bigInteger2;
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str = (String) entry.getKey();
                Locale locale = Locale.US;
                String lowerCase = str.toLowerCase(locale);
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    if ("Trace-ID".equalsIgnoreCase(lowerCase)) {
                        bigInteger2 = qa3.e(str2, 10);
                    } else if ("Span-ID".equalsIgnoreCase(lowerCase)) {
                        bigInteger3 = qa3.f(str2, 10);
                    } else if (lowerCase.startsWith("Baggage-".toLowerCase(locale))) {
                        if (map.isEmpty()) {
                            map = new HashMap();
                        }
                        map.put(lowerCase.replace("Baggage-".toLowerCase(locale), ""), qa3.c(str2));
                    }
                    if (this.a.containsKey(lowerCase)) {
                        if (map2.isEmpty()) {
                            map2 = new HashMap();
                        }
                        map2.put((String) this.a.get(lowerCase), qa3.c(str2));
                    }
                }
            }
            if (BigInteger.ZERO.equals(bigInteger2)) {
                if (map2.isEmpty()) {
                    return null;
                }
                return new uf8(null, map2);
            }
            x72 x72Var = new x72(bigInteger2, bigInteger3, 1, null, map, map2);
            x72Var.h();
            return x72Var;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
