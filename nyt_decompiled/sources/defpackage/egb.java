package defpackage;

import android.util.JsonWriter;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class egb {
    private static boolean c;
    private static boolean d;
    public static final /* synthetic */ int g = 0;
    private final List a;
    private static final Object b = new Object();
    private static final Clock e = DefaultClock.getInstance();
    private static final Set f = new HashSet(Arrays.asList(new String[0]));

    public egb(String str) {
        this.a = !k() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        r(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void b(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        r(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void i() {
        synchronized (b) {
            c = false;
            d = false;
            fgb.g("Ad debug logging enablement is out of date.");
        }
    }

    public static void j(boolean z) {
        synchronized (b) {
            c = true;
            d = z;
        }
    }

    public static boolean k() {
        boolean z;
        synchronized (b) {
            try {
                z = false;
                if (c && d) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public static boolean l() {
        boolean z;
        synchronized (b) {
            z = c;
        }
        return z;
    }

    private static synchronized void m(String str) {
        synchronized (egb.class) {
            try {
                fgb.f("GMA Debug BEGIN");
                int i = 0;
                while (i < str.length()) {
                    int i2 = i + 4000;
                    fgb.f("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                    i = i2;
                }
                fgb.f("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void n(String str, dgb dgbVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(e.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                jsonWriter.value((String) it2.next());
            }
            jsonWriter.endArray();
            dgbVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            fgb.e("unable to log", e2);
        }
        m(stringWriter.toString());
    }

    private final void o(final String str) {
        n("onNetworkRequestError", new dgb() { // from class: wfb
            @Override // defpackage.dgb
            public final void a(JsonWriter jsonWriter) {
                int i = egb.g;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void p(final String str, final String str2, final Map map, final byte[] bArr) {
        n("onNetworkRequest", new dgb() { // from class: ufb
            @Override // defpackage.dgb
            public final void a(JsonWriter jsonWriter) {
                egb.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void q(final Map map, final int i) {
        n("onNetworkResponse", new dgb() { // from class: xfb
            @Override // defpackage.dgb
            public final void a(JsonWriter jsonWriter) {
                egb.b(i, map, jsonWriter);
            }
        });
    }

    private static void r(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            if (!f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        fgb.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(AuthenticationTokenClaims.JSON_KEY_NAME).value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(AuthenticationTokenClaims.JSON_KEY_NAME).value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (k()) {
            p(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void d(String str, String str2, Map map, byte[] bArr) {
        if (k()) {
            p(str, "GET", map, bArr);
        }
    }

    public final void e(HttpURLConnection httpURLConnection, int i) {
        if (k()) {
            String str = null;
            q(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    fgb.g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
                }
                o(str);
            }
        }
    }

    public final void f(Map map, int i) {
        if (k()) {
            q(map, i);
            if (i < 200 || i >= 300) {
                o(null);
            }
        }
    }

    public final void g(String str) {
        if (k() && str != null) {
            h(str.getBytes());
        }
    }

    public final void h(final byte[] bArr) {
        n("onNetworkResponseBody", new dgb() { // from class: vfb
            @Override // defpackage.dgb
            public final void a(JsonWriter jsonWriter) {
                int i = egb.g;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(encode);
                } else {
                    String g2 = tfb.g(encode);
                    if (g2 != null) {
                        jsonWriter.name("bodydigest").value(g2);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
