package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.qa3;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.text.h;

/* loaded from: classes2.dex */
abstract class pc9 {
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

        private Map c(String str) {
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            for (String str2 : split) {
                if (str2.startsWith("dd=")) {
                    for (String str3 : str2.substring(3).split(";")) {
                        String[] split2 = str3.split(":");
                        if (split2.length == 2) {
                            hashMap.put(split2[0], split2[1]);
                        }
                    }
                }
            }
            return hashMap;
        }

        @Override // qa3.c
        public wx7 a(dj8 dj8Var) {
            String str;
            Map map;
            BigInteger bigInteger;
            BigInteger bigInteger2;
            int i;
            try {
                Map emptyMap = Collections.emptyMap();
                BigInteger bigInteger3 = BigInteger.ZERO;
                Iterator it2 = dj8Var.iterator();
                str = null;
                map = emptyMap;
                bigInteger = bigInteger3;
                bigInteger2 = bigInteger;
                i = Integer.MIN_VALUE;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.US);
                    String str2 = (String) entry.getValue();
                    if (str2 != null) {
                        if ("traceparent".equalsIgnoreCase(lowerCase)) {
                            String[] split = str2.split("-");
                            if (split.length == 4 && !"ff".equalsIgnoreCase(split[0])) {
                                int length = split[1].length();
                                if (length > 32) {
                                    bigInteger = BigInteger.ZERO;
                                } else {
                                    BigInteger e = qa3.e(length > 16 ? split[1].substring(length - 16) : split[1], 16);
                                    BigInteger f = qa3.f(split[2], 16);
                                    i = b(split[3]);
                                    bigInteger2 = f;
                                    bigInteger = e;
                                }
                            }
                        } else if ("tracestate".equalsIgnoreCase(lowerCase)) {
                            str = (String) c(str2).get(QueryKeys.DOCUMENT_WIDTH);
                        }
                        if (this.a.containsKey(lowerCase)) {
                            if (map.isEmpty()) {
                                map = new HashMap();
                            }
                            map.put((String) this.a.get(lowerCase), qa3.c(str2));
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
            if (BigInteger.ZERO.equals(bigInteger)) {
                if (!map.isEmpty()) {
                    return new uf8(str, map);
                }
                return null;
            }
            x72 x72Var = new x72(bigInteger, bigInteger2, i, str, Collections.emptyMap(), map);
            x72Var.h();
            return x72Var;
        }
    }

    public static class b implements qa3.d {
        private String b(int i) {
            return i > 0 ? pc9.a : pc9.b;
        }

        private String c(String str, String str2, String str3) {
            StringBuilder sb = new StringBuilder("dd=");
            sb.append("s");
            sb.append(":");
            sb.append(str);
            sb.append(";");
            sb.append("p");
            sb.append(":");
            sb.append(str3);
            if (str2 != null) {
                sb.append(";");
                sb.append(QueryKeys.DOCUMENT_WIDTH);
                sb.append(":");
                sb.append(str2.toLowerCase(Locale.US));
            }
            return sb.toString();
        }

        @Override // qa3.d
        public void a(z51 z51Var, fj8 fj8Var) {
            try {
                String bigInteger = z51Var.o().toString(16);
                Locale locale = Locale.US;
                String lowerCase = bigInteger.toLowerCase(locale);
                String lowerCase2 = z51Var.l().toString(16).toLowerCase(locale);
                String b = b(z51Var.j());
                String g = z51Var.g();
                fj8Var.put("traceparent", String.format("00-%s-%s-0%s", h.p0(lowerCase, 32, '0'), h.p0(lowerCase2, 16, '0'), b));
                fj8Var.put("tracestate", c(b, g, lowerCase2));
            } catch (NumberFormatException unused) {
            }
        }
    }
}
