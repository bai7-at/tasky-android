package defpackage;

import defpackage.qa3;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class d30 {
    private static final String a = String.valueOf(1);
    private static final String b = String.valueOf(0);

    public static class a implements qa3.c {
        private final Map a = new HashMap();

        public a(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                this.a.put(((String) entry.getKey()).trim().toLowerCase(Locale.US), (String) entry.getValue());
            }
        }

        private int b(String str) {
            return Integer.parseInt(str) == 1 ? 1 : 0;
        }

        @Override // qa3.c
        public wx7 a(dj8 dj8Var) {
            Map map;
            BigInteger bigInteger;
            BigInteger bigInteger2;
            int i;
            try {
                Map emptyMap = Collections.emptyMap();
                BigInteger bigInteger3 = BigInteger.ZERO;
                Iterator it2 = dj8Var.iterator();
                map = emptyMap;
                bigInteger = bigInteger3;
                bigInteger2 = bigInteger;
                i = Integer.MIN_VALUE;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.US);
                    String str = (String) entry.getValue();
                    if (str != null) {
                        if ("b3".equalsIgnoreCase(lowerCase)) {
                            String[] split = str.split("-");
                            if (split.length >= 2 && split.length <= 4) {
                                int length = split[0].length();
                                if (length > 32) {
                                    bigInteger = BigInteger.ZERO;
                                } else {
                                    BigInteger e = qa3.e(length > 16 ? split[0].substring(length - 16) : split[0], 16);
                                    BigInteger f = qa3.f(split[1], 16);
                                    if (split.length >= 3) {
                                        i = b(split[2]);
                                    }
                                    bigInteger2 = f;
                                    bigInteger = e;
                                }
                            }
                        }
                        if (this.a.containsKey(lowerCase)) {
                            if (map.isEmpty()) {
                                map = new HashMap();
                            }
                            map.put((String) this.a.get(lowerCase), qa3.c(str));
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
            if (BigInteger.ZERO.equals(bigInteger)) {
                if (!map.isEmpty()) {
                    return new uf8(null, map);
                }
                return null;
            }
            x72 x72Var = new x72(bigInteger, bigInteger2, i, null, Collections.emptyMap(), map);
            x72Var.h();
            return x72Var;
        }
    }

    public static class b implements qa3.d {
        private String b(int i) {
            return i > 0 ? d30.a : d30.b;
        }

        @Override // qa3.d
        public void a(z51 z51Var, fj8 fj8Var) {
            try {
                String bigInteger = z51Var.o().toString(16);
                Locale locale = Locale.US;
                String lowerCase = bigInteger.toLowerCase(locale);
                String lowerCase2 = z51Var.l().toString(16).toLowerCase(locale);
                if (z51Var.q()) {
                    fj8Var.put("b3", String.format("%s-%s-%s", lowerCase, lowerCase2, b(z51Var.j())));
                } else {
                    fj8Var.put("b3", String.format("%s-%s", lowerCase, lowerCase2));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }
}
