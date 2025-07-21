package defpackage;

import android.util.Log;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.google.android.material.timepicker.TimeModel;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes2.dex */
public final class m23 {
    public static final a i = new a(null);
    private static final String j = m23.class.getCanonicalName();
    private final GraphRequest a;
    private final HttpURLConnection b;
    private final String c;
    private final JSONObject d;
    private final JSONArray e;
    private final FacebookRequestError f;
    private final JSONObject g;
    private final JSONArray h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final m23 b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                FacebookRequestError a = FacebookRequestError.Companion.a(jSONObject, obj2, httpURLConnection);
                if (a != null) {
                    Log.e(m23.j, a.toString());
                    if (a.b() == 190) {
                        g29 g29Var = g29.a;
                        if (g29.U(graphRequest.m())) {
                            if (a.g() != 493) {
                                AccessToken.Companion.h(null);
                            } else {
                                AccessToken.c cVar = AccessToken.Companion;
                                AccessToken e = cVar.e();
                                if (zq3.c(e != null ? Boolean.valueOf(e.o()) : null, Boolean.FALSE)) {
                                    cVar.d();
                                }
                            }
                        }
                    }
                    return new m23(graphRequest, httpURLConnection, a);
                }
                Object K = g29.K(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (K instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) K;
                    return new m23(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (K instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) K;
                    return new m23(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                obj = JSONObject.NULL;
                zq3.g(obj, "NULL");
            }
            if (obj == JSONObject.NULL) {
                return new m23(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new FacebookException(zq3.q("Got unexpected object type in response, class: ", obj.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.util.List c(java.net.HttpURLConnection r9, java.util.List r10, java.lang.Object r11) {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L53
                java.lang.Object r2 = r10.get(r3)
                com.facebook.GraphRequest r2 = (com.facebook.GraphRequest) r2
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                r4.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                if (r9 != 0) goto L22
                r5 = 200(0xc8, float:2.8E-43)
                goto L26
            L22:
                int r5 = r9.getResponseCode()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
            L26:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                r5.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                r5.put(r4)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                goto L54
            L34:
                r4 = move-exception
                goto L38
            L36:
                r4 = move-exception
                goto L46
            L38:
                m23 r5 = new m23
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r9, r4)
                r5.<init>(r2, r9, r6)
                r1.add(r5)
                goto L53
            L46:
                m23 r5 = new m23
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r9, r4)
                r5.<init>(r2, r9, r6)
                r1.add(r5)
            L53:
                r5 = r11
            L54:
                boolean r2 = r5 instanceof org.json.JSONArray
                if (r2 == 0) goto La8
                r2 = r5
                org.json.JSONArray r2 = (org.json.JSONArray) r2
                int r4 = r2.length()
                if (r4 != r0) goto La8
                int r0 = r2.length()
                if (r0 <= 0) goto La7
            L67:
                int r2 = r3 + 1
                java.lang.Object r4 = r10.get(r3)
                com.facebook.GraphRequest r4 = (com.facebook.GraphRequest) r4
                r6 = r5
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch: com.facebook.FacebookException -> L83 org.json.JSONException -> L85
                java.lang.Object r3 = r6.get(r3)     // Catch: com.facebook.FacebookException -> L83 org.json.JSONException -> L85
                java.lang.String r6 = "obj"
                defpackage.zq3.g(r3, r6)     // Catch: com.facebook.FacebookException -> L83 org.json.JSONException -> L85
                m23 r3 = r8.b(r4, r9, r3, r11)     // Catch: com.facebook.FacebookException -> L83 org.json.JSONException -> L85
                r1.add(r3)     // Catch: com.facebook.FacebookException -> L83 org.json.JSONException -> L85
                goto La2
            L83:
                r3 = move-exception
                goto L87
            L85:
                r3 = move-exception
                goto L95
            L87:
                m23 r6 = new m23
                com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
                r7.<init>(r9, r3)
                r6.<init>(r4, r9, r7)
                r1.add(r6)
                goto La2
            L95:
                m23 r6 = new m23
                com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
                r7.<init>(r9, r3)
                r6.<init>(r4, r9, r7)
                r1.add(r6)
            La2:
                if (r2 < r0) goto La5
                goto La7
            La5:
                r3 = r2
                goto L67
            La7:
                return r1
            La8:
                com.facebook.FacebookException r8 = new com.facebook.FacebookException
                java.lang.String r9 = "Unexpected number of results"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: m23.a.c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        public final List a(List list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            zq3.h(list, "requests");
            List list2 = list;
            ArrayList arrayList = new ArrayList(i.w(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new m23((GraphRequest) it2.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
            }
            return arrayList;
        }

        public final List d(InputStream inputStream, HttpURLConnection httpURLConnection, l23 l23Var) {
            zq3.h(l23Var, "requests");
            String p0 = g29.p0(inputStream);
            k94.e.c(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(p0.length()), p0);
            return e(p0, httpURLConnection, l23Var);
        }

        public final List e(String str, HttpURLConnection httpURLConnection, l23 l23Var) {
            zq3.h(str, "responseString");
            zq3.h(l23Var, "requests");
            Object nextValue = new JSONTokener(str).nextValue();
            zq3.g(nextValue, "resultObject");
            List c = c(httpURLConnection, l23Var, nextValue);
            k94.e.c(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", l23Var.u(), Integer.valueOf(str.length()), c);
            return c;
        }

        public final List f(HttpURLConnection httpURLConnection, l23 l23Var) {
            List a;
            zq3.h(httpURLConnection, "connection");
            zq3.h(l23Var, "requests");
            InputStream inputStream = null;
            try {
                try {
                    try {
                    } catch (FacebookException e) {
                        k94.e.c(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e);
                        a = a(l23Var, httpURLConnection, e);
                    }
                } catch (Exception e2) {
                    k94.e.c(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e2);
                    a = a(l23Var, httpURLConnection, new FacebookException(e2));
                }
                if (!w92.D()) {
                    Log.e(m23.j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                inputStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                a = d(inputStream, httpURLConnection, l23Var);
                g29.j(inputStream);
                return a;
            } catch (Throwable th) {
                g29.j(null);
                throw th;
            }
        }

        private a() {
        }
    }

    public m23(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        zq3.h(graphRequest, "request");
        this.a = graphRequest;
        this.b = httpURLConnection;
        this.c = str;
        this.d = jSONObject;
        this.e = jSONArray;
        this.f = facebookRequestError;
        this.g = jSONObject;
        this.h = jSONArray;
    }

    public final FacebookRequestError b() {
        return this.f;
    }

    public final JSONObject c() {
        return this.d;
    }

    public final JSONObject d() {
        return this.g;
    }

    public String toString() {
        String str;
        try {
            z38 z38Var = z38.a;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.b;
            str = String.format(locale, TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode())}, 1));
            zq3.g(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.d + ", error: " + this.f + "}";
        zq3.g(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m23(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
        zq3.h(graphRequest, "request");
        zq3.h(str, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m23(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
        zq3.h(graphRequest, "request");
        zq3.h(str, "rawResponse");
        zq3.h(jSONArray, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m23(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
        zq3.h(graphRequest, "request");
        zq3.h(facebookRequestError, "error");
    }
}
