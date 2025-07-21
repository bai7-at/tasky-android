package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.datadog.legacy.trace.api.Config;
import com.datadog.opentracing.StringCachingBigInteger;
import defpackage.d30;
import defpackage.e30;
import defpackage.pc9;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class qa3 {

    public static class a implements c {
        private final List a;

        public a(List list) {
            this.a = list;
        }

        @Override // qa3.c
        public wx7 a(dj8 dj8Var) {
            Iterator it2 = this.a.iterator();
            wx7 wx7Var = null;
            while (it2.hasNext() && ((wx7Var = ((c) it2.next()).a(dj8Var)) == null || !(wx7Var instanceof x72))) {
            }
            return wx7Var;
        }
    }

    public static class b implements d {
        private final List a;

        public b(List list) {
            this.a = list;
        }

        @Override // qa3.d
        public void a(z51 z51Var, fj8 fj8Var) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).a(z51Var, fj8Var);
            }
        }
    }

    public interface c {
        wx7 a(dj8 dj8Var);
    }

    public interface d {
        void a(z51 z51Var, fj8 fj8Var);
    }

    public static c a(Config config, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Config.PropagationStyle propagationStyle : config.s()) {
            if (propagationStyle == Config.PropagationStyle.DATADOG) {
                arrayList.add(new za1(map));
            } else if (propagationStyle == Config.PropagationStyle.B3) {
                arrayList.add(new d30.a(map));
            } else if (propagationStyle == Config.PropagationStyle.B3MULTI) {
                arrayList.add(new e30.a(map));
            } else if (propagationStyle == Config.PropagationStyle.TRACECONTEXT) {
                arrayList.add(new pc9.a(map));
            } else if (propagationStyle == Config.PropagationStyle.HAYSTACK) {
                arrayList.add(new l73(map));
            }
        }
        return new a(arrayList);
    }

    public static d b(Config config) {
        ArrayList arrayList = new ArrayList();
        for (Config.PropagationStyle propagationStyle : config.t()) {
            if (propagationStyle == Config.PropagationStyle.DATADOG) {
                arrayList.add(new ab1());
            } else if (propagationStyle == Config.PropagationStyle.B3) {
                arrayList.add(new d30.b());
            } else if (propagationStyle == Config.PropagationStyle.B3MULTI) {
                arrayList.add(new e30.b());
            } else if (propagationStyle == Config.PropagationStyle.TRACECONTEXT) {
                arrayList.add(new pc9.b());
            } else if (propagationStyle == Config.PropagationStyle.HAYSTACK) {
                arrayList.add(new m73());
            }
        }
        return new b(arrayList);
    }

    static String c(String str) {
        try {
            return URLDecoder.decode(str, Constants.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    static String d(String str) {
        try {
            return URLEncoder.encode(str, Constants.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    static BigInteger e(String str, int i) {
        StringCachingBigInteger stringCachingBigInteger = new StringCachingBigInteger(str, i);
        if (stringCachingBigInteger.compareTo(com.datadog.opentracing.b.u) >= 0 && stringCachingBigInteger.compareTo(com.datadog.opentracing.b.s) <= 0) {
            return stringCachingBigInteger;
        }
        throw new IllegalArgumentException("ID out of range, must be between 0 and 2^128-1, got: " + str);
    }

    static BigInteger f(String str, int i) {
        StringCachingBigInteger stringCachingBigInteger = new StringCachingBigInteger(str, i);
        if (stringCachingBigInteger.compareTo(com.datadog.opentracing.b.u) >= 0 && stringCachingBigInteger.compareTo(com.datadog.opentracing.b.t) <= 0) {
            return stringCachingBigInteger;
        }
        throw new IllegalArgumentException("ID out of range, must be between 0 and 2^64-1, got: " + str);
    }
}
