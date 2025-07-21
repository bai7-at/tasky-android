package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.GraphRequest;
import com.nytimes.android.saved.SavedAssetIndex;
import defpackage.g29;
import defpackage.k23;
import defpackage.k94;
import defpackage.l23;
import defpackage.m23;
import defpackage.p96;
import defpackage.qy6;
import defpackage.sq3;
import defpackage.t2;
import defpackage.u46;
import defpackage.v29;
import defpackage.w92;
import defpackage.yj0;
import defpackage.yk7;
import defpackage.z38;
import defpackage.zq3;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class GraphRequest {
    public static final c n = new c(null);
    public static final String o;
    private static final String p;
    private static String q;
    private static final Pattern r;
    private static volatile String s;
    private AccessToken a;
    private String b;
    private JSONObject c;
    private String d;
    private String e;
    private boolean f;
    private Bundle g;
    private Object h;
    private String i;
    private b j;
    private HttpMethod k;
    private boolean l;
    private String m;

    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        private final String mimeType;
        private final RESOURCE resource;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                zq3.h(parcel, "source");
                return new ParcelableResourceWithMimeType(parcel, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public final String a() {
            return this.mimeType;
        }

        public final Parcelable b() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            zq3.h(parcel, "out");
            parcel.writeString(this.mimeType);
            parcel.writeParcelable(this.resource, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ParcelableResourceWithMimeType(Parcelable parcelable, String str) {
            this.mimeType = str;
            this.resource = parcelable;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(w92.l().getClassLoader());
        }
    }

    private static final class a {
        private final GraphRequest a;
        private final Object b;

        public a(GraphRequest graphRequest, Object obj) {
            zq3.h(graphRequest, "request");
            this.a = graphRequest;
            this.b = obj;
        }

        public final GraphRequest a() {
            return this.a;
        }

        public final Object b() {
            return this.b;
        }
    }

    public interface b {
        void a(m23 m23Var);
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String format = new SimpleDateFormat(SavedAssetIndex.DATE_FMT, Locale.US).format((Date) obj);
            zq3.g(format, "iso8601DateFormat.format(value)");
            return format;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void D(org.json.JSONObject r10, java.lang.String r11, com.facebook.GraphRequest.e r12) {
            /*
                r9 = this;
                boolean r0 = r9.u(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L23
                r7 = 6
                r8 = 0
                java.lang.String r4 = ":"
                r5 = 0
                r6 = 0
                r3 = r11
                int r0 = kotlin.text.h.b0(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = kotlin.text.h.b0(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L23
                r3 = -1
                if (r11 == r3) goto L21
                if (r0 >= r11) goto L23
            L21:
                r11 = r1
                goto L24
            L23:
                r11 = r2
            L24:
                java.util.Iterator r0 = r10.keys()
            L28:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L53
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L44
                java.lang.String r5 = "image"
                boolean r5 = kotlin.text.h.w(r3, r5, r1)
                if (r5 == 0) goto L44
                r5 = r1
                goto L45
            L44:
                r5 = r2
            L45:
                java.lang.String r6 = "key"
                defpackage.zq3.g(r3, r6)
                java.lang.String r6 = "value"
                defpackage.zq3.g(r4, r6)
                r9.E(r3, r4, r12, r5)
                goto L28
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.c.D(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$e):void");
        }

        private final void E(String str, Object obj, e eVar, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        z38 z38Var = z38.a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        zq3.g(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        zq3.g(opt, "jsonObject.opt(propertyName)");
                        E(format, opt, eVar, z);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    zq3.g(optString, "jsonObject.optString(\"id\")");
                    E(str, optString, eVar, z);
                    return;
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    zq3.g(optString2, "jsonObject.optString(\"url\")");
                    E(str, optString2, eVar, z);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String jSONObject2 = jSONObject.toString();
                        zq3.g(jSONObject2, "jsonObject.toString()");
                        E(str, jSONObject2, eVar, z);
                        return;
                    }
                    return;
                }
            }
            if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    eVar.a(str, obj.toString());
                    return;
                }
                if (Date.class.isAssignableFrom(cls)) {
                    String format2 = new SimpleDateFormat(SavedAssetIndex.DATE_FMT, Locale.US).format((Date) obj);
                    zq3.g(format2, "iso8601DateFormat.format(date)");
                    eVar.a(str, format2);
                    return;
                }
                g29 g29Var = g29.a;
                g29.f0(GraphRequest.o, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                return;
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                z38 z38Var2 = z38.a;
                String format3 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                zq3.g(format3, "java.lang.String.format(locale, format, *args)");
                Object opt2 = jSONArray.opt(i);
                zq3.g(opt2, "jsonArray.opt(i)");
                E(format3, opt2, eVar, z);
                if (i2 >= length) {
                    return;
                } else {
                    i = i2;
                }
            }
        }

        private final void F(l23 l23Var, k94 k94Var, int i, URL url, OutputStream outputStream, boolean z) {
            f fVar = new f(outputStream, k94Var, z);
            if (i != 1) {
                String p = p(l23Var);
                if (p.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                fVar.a("batch_app_id", p);
                HashMap hashMap = new HashMap();
                K(fVar, l23Var, hashMap);
                if (k94Var != null) {
                    k94Var.b("  Attachments:\n");
                }
                I(hashMap, fVar);
                return;
            }
            GraphRequest graphRequest = l23Var.get(0);
            HashMap hashMap2 = new HashMap();
            for (String str : graphRequest.u().keySet()) {
                Object obj = graphRequest.u().get(str);
                if (v(obj)) {
                    zq3.g(str, TransferTable.COLUMN_KEY);
                    hashMap2.put(str, new a(graphRequest, obj));
                }
            }
            if (k94Var != null) {
                k94Var.b("  Parameters:\n");
            }
            J(graphRequest.u(), fVar, graphRequest);
            if (k94Var != null) {
                k94Var.b("  Attachments:\n");
            }
            I(hashMap2, fVar);
            JSONObject q = graphRequest.q();
            if (q != null) {
                String path = url.getPath();
                zq3.g(path, "url.path");
                D(q, path, fVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void H(ArrayList arrayList, l23 l23Var) {
            zq3.h(arrayList, "$callbacks");
            zq3.h(l23Var, "$requests");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                b bVar = (b) pair.first;
                Object obj = pair.second;
                zq3.g(obj, "pair.second");
                bVar.a((m23) obj);
            }
            Iterator it3 = l23Var.t().iterator();
            while (it3.hasNext()) {
                ((l23.a) it3.next()).a(l23Var);
            }
        }

        private final void I(Map map, f fVar) {
            for (Map.Entry entry : map.entrySet()) {
                if (GraphRequest.n.v(((a) entry.getValue()).b())) {
                    fVar.j((String) entry.getKey(), ((a) entry.getValue()).b(), ((a) entry.getValue()).a());
                }
            }
        }

        private final void J(Bundle bundle, f fVar, GraphRequest graphRequest) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (w(obj)) {
                    zq3.g(str, TransferTable.COLUMN_KEY);
                    fVar.j(str, obj, graphRequest);
                }
            }
        }

        private final void K(f fVar, Collection collection, Map map) {
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                ((GraphRequest) it2.next()).C(jSONArray, map);
            }
            fVar.l("batch", jSONArray, collection);
        }

        private final void M(HttpURLConnection httpURLConnection, boolean z) {
            if (!z) {
                httpURLConnection.setRequestProperty("Content-Type", q());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP);
            }
        }

        private final HttpURLConnection g(URL url) {
            URLConnection openConnection = url.openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", r());
            httpURLConnection.setRequestProperty(Constants.ACCEPT_LANGUAGE, Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String p(l23 l23Var) {
            String p = l23Var.p();
            if (p != null && !l23Var.isEmpty()) {
                return p;
            }
            Iterator<E> it2 = l23Var.iterator();
            while (it2.hasNext()) {
                AccessToken m = ((GraphRequest) it2.next()).m();
                if (m != null) {
                    return m.c();
                }
            }
            String str = GraphRequest.q;
            return (str == null || str.length() <= 0) ? w92.m() : str;
        }

        private final String q() {
            z38 z38Var = z38.a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.p}, 1));
            zq3.g(format, "java.lang.String.format(format, *args)");
            return format;
        }

        private final String r() {
            if (GraphRequest.s == null) {
                z38 z38Var = z38.a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "14.1.1"}, 2));
                zq3.g(format, "java.lang.String.format(format, *args)");
                GraphRequest.s = format;
                String a = sq3.a();
                if (!g29.Y(a)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.s, a}, 2));
                    zq3.g(format2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.s = format2;
                }
            }
            return GraphRequest.s;
        }

        private final boolean s(l23 l23Var) {
            for (l23.a aVar : l23Var.t()) {
            }
            Iterator<E> it2 = l23Var.iterator();
            while (it2.hasNext()) {
                ((GraphRequest) it2.next()).o();
            }
            return false;
        }

        private final boolean t(l23 l23Var) {
            Iterator<E> it2 = l23Var.iterator();
            while (it2.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it2.next();
                Iterator<String> it3 = graphRequest.u().keySet().iterator();
                while (it3.hasNext()) {
                    if (v(graphRequest.u().get(it3.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean u(String str) {
            Matcher matcher = GraphRequest.r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                zq3.g(str, "matcher.group(1)");
            }
            return h.K(str, "me/", false, 2, null) || h.K(str, "/me/", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean v(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean w(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(d dVar, m23 m23Var) {
            zq3.h(m23Var, "response");
            if (dVar == null) {
                return;
            }
            dVar.a(m23Var.c(), m23Var);
        }

        public final GraphRequest A(AccessToken accessToken, String str, JSONObject jSONObject, b bVar) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, HttpMethod.POST, bVar, null, 32, null);
            graphRequest.F(jSONObject);
            return graphRequest;
        }

        public final GraphRequest B(AccessToken accessToken, String str, Bundle bundle, b bVar) {
            return new GraphRequest(accessToken, str, bundle, HttpMethod.POST, bVar, null, 32, null);
        }

        public final void G(final l23 l23Var, List list) {
            zq3.h(l23Var, "requests");
            zq3.h(list, "responses");
            int size = l23Var.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    GraphRequest graphRequest = l23Var.get(i);
                    if (graphRequest.o() != null) {
                        arrayList.add(new Pair(graphRequest.o(), list.get(i)));
                    }
                    if (i2 >= size) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: j23
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.c.H(arrayList, l23Var);
                    }
                };
                Handler q = l23Var.q();
                if ((q == null ? null : Boolean.valueOf(q.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void L(defpackage.l23 r14, java.net.HttpURLConnection r15) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.c.L(l23, java.net.HttpURLConnection):void");
        }

        public final HttpURLConnection N(l23 l23Var) {
            zq3.h(l23Var, "requests");
            O(l23Var);
            try {
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = g(l23Var.size() == 1 ? new URL(l23Var.get(0).x()) : new URL(yk7.g()));
                    L(l23Var, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    g29.q(httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    g29.q(httpURLConnection);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        public final void O(l23 l23Var) {
            zq3.h(l23Var, "requests");
            Iterator<E> it2 = l23Var.iterator();
            while (it2.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it2.next();
                if (HttpMethod.GET == graphRequest.t()) {
                    g29 g29Var = g29.a;
                    if (g29.Y(graphRequest.u().getString("fields"))) {
                        k94.a aVar = k94.e;
                        LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                        StringBuilder sb = new StringBuilder();
                        sb.append("GET requests for /");
                        String r = graphRequest.r();
                        if (r == null) {
                            r = "";
                        }
                        sb.append(r);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        aVar.a(loggingBehavior, 5, "Request", sb.toString());
                    }
                }
            }
        }

        public final m23 h(GraphRequest graphRequest) {
            zq3.h(graphRequest, "request");
            List k = k(graphRequest);
            if (k.size() == 1) {
                return (m23) k.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        public final List i(l23 l23Var) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List list;
            zq3.h(l23Var, "requests");
            v29.l(l23Var, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = N(l23Var);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                g29.q(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = o(httpURLConnection, l23Var);
                } else {
                    List a = m23.i.a(l23Var.v(), null, new FacebookException(exc));
                    G(l23Var, a);
                    list = a;
                }
                g29.q(httpURLConnection);
                return list;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                g29.q(httpURLConnection2);
                throw th;
            }
        }

        public final List j(Collection collection) {
            zq3.h(collection, "requests");
            return i(new l23(collection));
        }

        public final List k(GraphRequest... graphRequestArr) {
            zq3.h(graphRequestArr, "requests");
            return j(kotlin.collections.d.C0(graphRequestArr));
        }

        public final k23 l(l23 l23Var) {
            zq3.h(l23Var, "requests");
            v29.l(l23Var, "requests");
            k23 k23Var = new k23(l23Var);
            k23Var.executeOnExecutor(w92.t(), new Void[0]);
            return k23Var;
        }

        public final k23 m(Collection collection) {
            zq3.h(collection, "requests");
            return l(new l23(collection));
        }

        public final k23 n(GraphRequest... graphRequestArr) {
            zq3.h(graphRequestArr, "requests");
            return m(kotlin.collections.d.C0(graphRequestArr));
        }

        public final List o(HttpURLConnection httpURLConnection, l23 l23Var) {
            zq3.h(httpURLConnection, "connection");
            zq3.h(l23Var, "requests");
            List f = m23.i.f(httpURLConnection, l23Var);
            g29.q(httpURLConnection);
            int size = l23Var.size();
            if (size == f.size()) {
                G(l23Var, f);
                t2.f.e().h();
                return f;
            }
            z38 z38Var = z38.a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(f.size()), Integer.valueOf(size)}, 2));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }

        public final GraphRequest x(AccessToken accessToken, String str, b bVar) {
            return new GraphRequest(accessToken, str, null, null, bVar, null, 32, null);
        }

        public final GraphRequest y(AccessToken accessToken, final d dVar) {
            return new GraphRequest(accessToken, "me", null, null, new b(dVar) { // from class: i23
                @Override // com.facebook.GraphRequest.b
                public final void a(m23 m23Var) {
                    GraphRequest.c.z(null, m23Var);
                }
            }, null, 32, null);
        }

        private c() {
        }
    }

    public interface d {
        void a(JSONObject jSONObject, m23 m23Var);
    }

    private interface e {
        void a(String str, String str2);
    }

    private static final class f implements e {
        private final OutputStream a;
        private final k94 b;
        private boolean c;
        private final boolean d;

        public f(OutputStream outputStream, k94 k94Var, boolean z) {
            zq3.h(outputStream, "outputStream");
            this.a = outputStream;
            this.b = k94Var;
            this.c = true;
            this.d = z;
        }

        private final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // com.facebook.GraphRequest.e
        public void a(String str, String str2) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(str2, "value");
            f(str, null, null);
            i("%s", str2);
            k();
            k94 k94Var = this.b;
            if (k94Var == null) {
                return;
            }
            k94Var.d(zq3.q("    ", str), str2);
        }

        public final void c(String str, Object... objArr) {
            zq3.h(str, "format");
            zq3.h(objArr, "args");
            if (this.d) {
                OutputStream outputStream = this.a;
                z38 z38Var = z38.a;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
                zq3.g(format, "java.lang.String.format(locale, format, *args)");
                String encode = URLEncoder.encode(format, com.amazonaws.services.s3.internal.Constants.DEFAULT_ENCODING);
                zq3.g(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = encode.getBytes(yj0.b);
                zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.c) {
                OutputStream outputStream2 = this.a;
                Charset charset = yj0.b;
                byte[] bytes2 = "--".getBytes(charset);
                zq3.g(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.a;
                String str2 = GraphRequest.p;
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str2.getBytes(charset);
                zq3.g(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                zq3.g(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.c = false;
            }
            OutputStream outputStream5 = this.a;
            z38 z38Var2 = z38.a;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format2 = String.format(str, Arrays.copyOf(copyOf2, copyOf2.length));
            zq3.g(format2, "java.lang.String.format(format, *args)");
            byte[] bytes5 = format2.getBytes(yj0.b);
            zq3.g(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String str, Bitmap bitmap) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(bitmap, "bitmap");
            f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.a);
            i("", new Object[0]);
            k();
            k94 k94Var = this.b;
            if (k94Var == null) {
                return;
            }
            k94Var.d(zq3.q("    ", str), "<Image>");
        }

        public final void e(String str, byte[] bArr) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(bArr, "bytes");
            f(str, str, "content/unknown");
            this.a.write(bArr);
            i("", new Object[0]);
            k();
            k94 k94Var = this.b;
            if (k94Var == null) {
                return;
            }
            String q = zq3.q("    ", str);
            z38 z38Var = z38.a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            k94Var.d(q, format);
        }

        public final void f(String str, String str2, String str3) {
            if (this.d) {
                OutputStream outputStream = this.a;
                z38 z38Var = z38.a;
                String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
                zq3.g(format, "java.lang.String.format(format, *args)");
                byte[] bytes = format.getBytes(yj0.b);
                zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            c("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                c("; filename=\"%s\"", str2);
            }
            i("", new Object[0]);
            if (str3 != null) {
                i("%s: %s", "Content-Type", str3);
            }
            i("", new Object[0]);
        }

        public final void g(String str, Uri uri, String str2) {
            int p;
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            if (this.a instanceof u46) {
                ((u46) this.a).b(g29.x(uri));
                p = 0;
            } else {
                InputStream openInputStream = w92.l().getContentResolver().openInputStream(uri);
                g29 g29Var = g29.a;
                p = g29.p(openInputStream, this.a);
            }
            i("", new Object[0]);
            k();
            k94 k94Var = this.b;
            if (k94Var == null) {
                return;
            }
            String q = zq3.q("    ", str);
            z38 z38Var = z38.a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(p)}, 1));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            k94Var.d(q, format);
        }

        public final void h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int p;
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            OutputStream outputStream = this.a;
            if (outputStream instanceof u46) {
                ((u46) outputStream).b(parcelFileDescriptor.getStatSize());
                p = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                g29 g29Var = g29.a;
                p = g29.p(autoCloseInputStream, this.a);
            }
            i("", new Object[0]);
            k();
            k94 k94Var = this.b;
            if (k94Var == null) {
                return;
            }
            String q = zq3.q("    ", str);
            z38 z38Var = z38.a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(p)}, 1));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            k94Var.d(q, format);
        }

        public final void i(String str, Object... objArr) {
            zq3.h(str, "format");
            zq3.h(objArr, "args");
            c(str, Arrays.copyOf(objArr, objArr.length));
            if (this.d) {
                return;
            }
            c("\r\n", new Object[0]);
        }

        public final void j(String str, Object obj, GraphRequest graphRequest) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            Closeable closeable = this.a;
            if (closeable instanceof qy6) {
                ((qy6) closeable).a(graphRequest);
            }
            c cVar = GraphRequest.n;
            if (cVar.w(obj)) {
                a(str, cVar.C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                d(str, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                e(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                g(str, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw b();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable b = parcelableResourceWithMimeType.b();
            String a = parcelableResourceWithMimeType.a();
            if (b instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) b, a);
            } else {
                if (!(b instanceof Uri)) {
                    throw b();
                }
                g(str, (Uri) b, a);
            }
        }

        public final void k() {
            if (!this.d) {
                i("--%s", GraphRequest.p);
                return;
            }
            OutputStream outputStream = this.a;
            byte[] bytes = "&".getBytes(yj0.b);
            zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String str, JSONArray jSONArray, Collection collection) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(jSONArray, "requestJsonArray");
            zq3.h(collection, "requests");
            Closeable closeable = this.a;
            if (!(closeable instanceof qy6)) {
                String jSONArray2 = jSONArray.toString();
                zq3.g(jSONArray2, "requestJsonArray.toString()");
                a(str, jSONArray2);
                return;
            }
            qy6 qy6Var = (qy6) closeable;
            f(str, null, null);
            c("[", new Object[0]);
            Iterator it2 = collection.iterator();
            int i = 0;
            while (it2.hasNext()) {
                int i2 = i + 1;
                GraphRequest graphRequest = (GraphRequest) it2.next();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                qy6Var.a(graphRequest);
                if (i > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i = i2;
            }
            c("]", new Object[0]);
            k94 k94Var = this.b;
            if (k94Var == null) {
                return;
            }
            String q = zq3.q("    ", str);
            String jSONArray3 = jSONArray.toString();
            zq3.g(jSONArray3, "requestJsonArray.toString()");
            k94Var.d(q, jSONArray3);
        }
    }

    public static final class g implements e {
        final /* synthetic */ ArrayList a;

        g(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.GraphRequest.e
        public void a(String str, String str2) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(str2, "value");
            ArrayList arrayList = this.a;
            z38 z38Var = z38.a;
            String format = String.format(Locale.US, p96.COOKIE_FMT, Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, com.amazonaws.services.s3.internal.Constants.DEFAULT_ENCODING)}, 2));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        String simpleName = GraphRequest.class.getSimpleName();
        zq3.g(simpleName, "GraphRequest::class.java.simpleName");
        o = simpleName;
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        zq3.g(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i = 0;
            do {
                i++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i < nextInt);
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "buffer.toString()");
        p = sb2;
        r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, b bVar, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : httpMethod, (i & 16) != 0 ? null : bVar, (i & 32) != 0 ? null : str2);
    }

    private final boolean A() {
        if (zq3.c(w92.w(), "instagram.com")) {
            return !z();
        }
        return true;
    }

    public static final GraphRequest B(AccessToken accessToken, String str, JSONObject jSONObject, b bVar) {
        return n.A(accessToken, str, jSONObject, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(JSONArray jSONArray, Map map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.d;
        if (str != null) {
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            jSONObject.put("omit_response_on_success", this.f);
        }
        String str2 = this.e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String v = v();
        jSONObject.put("relative_url", v);
        jSONObject.put("method", this.k);
        AccessToken accessToken = this.a;
        if (accessToken != null) {
            k94.e.d(accessToken.m());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = this.g.keySet().iterator();
        while (it2.hasNext()) {
            Object obj = this.g.get(it2.next());
            if (n.v(obj)) {
                z38 z38Var = z38.a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{TransferTable.COLUMN_FILE, Integer.valueOf(map.size())}, 2));
                zq3.g(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            n.D(jSONObject2, v, new g(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private final boolean J() {
        String n2 = n();
        boolean P = n2 == null ? false : h.P(n2, "|", false, 2, null);
        if (n2 == null || !h.K(n2, "IG", false, 2, null) || P || !z()) {
            return (A() || P) ? false : true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(b bVar, m23 m23Var) {
        int length;
        zq3.h(m23Var, "response");
        JSONObject c2 = m23Var.c();
        JSONObject optJSONObject = c2 == null ? null : c2.optJSONObject("__debug__");
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray("messages");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                String optString = optJSONObject2 == null ? null : optJSONObject2.optString("message");
                String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString(TransferTable.COLUMN_TYPE);
                String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString("link");
                if (optString != null && optString2 != null) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                    if (zq3.c(optString2, "warning")) {
                        loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!g29.Y(optString3)) {
                        optString = ((Object) optString) + " Link: " + ((Object) optString3);
                    }
                    k94.e.b(loggingBehavior, o, optString);
                }
                if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (bVar == null) {
            return;
        }
        bVar.a(m23Var);
    }

    private final void i() {
        Bundle bundle = this.g;
        if (J()) {
            bundle.putString(AccessToken.ACCESS_TOKEN_KEY, p());
        } else {
            String n2 = n();
            if (n2 != null) {
                bundle.putString(AccessToken.ACCESS_TOKEN_KEY, n2);
            }
        }
        if (!bundle.containsKey(AccessToken.ACCESS_TOKEN_KEY)) {
            g29 g29Var = g29.a;
            if (g29.Y(w92.r())) {
                Log.w(o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        w92 w92Var = w92.a;
        if (w92.G(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (w92.G(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    private final String j(String str, boolean z) {
        if (!z && this.k == HttpMethod.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.g.keySet()) {
            Object obj = this.g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = n;
            if (cVar.w(obj)) {
                buildUpon.appendQueryParameter(str2, cVar.C(obj).toString());
            } else if (this.k != HttpMethod.GET) {
                z38 z38Var = z38.a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                zq3.g(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        zq3.g(builder, "uriBuilder.toString()");
        return builder;
    }

    private final String n() {
        AccessToken accessToken = this.a;
        if (accessToken != null) {
            if (!this.g.containsKey(AccessToken.ACCESS_TOKEN_KEY)) {
                String m = accessToken.m();
                k94.e.d(m);
                return m;
            }
        } else if (!this.g.containsKey(AccessToken.ACCESS_TOKEN_KEY)) {
            return p();
        }
        return this.g.getString(AccessToken.ACCESS_TOKEN_KEY);
    }

    private final String p() {
        String m = w92.m();
        String r2 = w92.r();
        if (m.length() <= 0 || r2.length() <= 0) {
            g29 g29Var = g29.a;
            g29.f0(o, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return m + '|' + r2;
    }

    private final String s() {
        if (r.matcher(this.b).matches()) {
            return this.b;
        }
        z38 z38Var = z38.a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.i, this.b}, 2));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String y(String str) {
        if (!A()) {
            str = yk7.f();
        }
        z38 z38Var = z38.a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, s()}, 2));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean z() {
        if (this.b == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        sb.append(w92.m());
        sb.append("/?.*");
        return this.l || Pattern.matches(sb.toString(), this.b) || Pattern.matches("^/?app/?.*", this.b);
    }

    public final void D(final b bVar) {
        w92 w92Var = w92.a;
        if (w92.G(LoggingBehavior.GRAPH_API_DEBUG_INFO) || w92.G(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.j = new b() { // from class: h23
                @Override // com.facebook.GraphRequest.b
                public final void a(m23 m23Var) {
                    GraphRequest.b(GraphRequest.b.this, m23Var);
                }
            };
        } else {
            this.j = bVar;
        }
    }

    public final void E(boolean z) {
        this.l = z;
    }

    public final void F(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public final void G(HttpMethod httpMethod) {
        if (this.m != null && httpMethod != HttpMethod.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.k = httpMethod;
    }

    public final void H(Bundle bundle) {
        zq3.h(bundle, "<set-?>");
        this.g = bundle;
    }

    public final void I(Object obj) {
        this.h = obj;
    }

    public final m23 k() {
        return n.h(this);
    }

    public final k23 l() {
        return n.n(this);
    }

    public final AccessToken m() {
        return this.a;
    }

    public final b o() {
        return this.j;
    }

    public final JSONObject q() {
        return this.c;
    }

    public final String r() {
        return this.b;
    }

    public final HttpMethod t() {
        return this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = com.amazonaws.services.s3.internal.Constants.NULL_VERSION_ID;
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.k);
        sb.append(", parameters: ");
        sb.append(this.g);
        sb.append("}");
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    public final Bundle u() {
        return this.g;
    }

    public final String v() {
        if (this.m != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String y = y(yk7.g());
        i();
        Uri parse = Uri.parse(j(y, true));
        z38 z38Var = z38.a;
        String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final Object w() {
        return this.h;
    }

    public final String x() {
        String h;
        String str = this.m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.b;
        if (this.k == HttpMethod.POST && str2 != null && h.v(str2, "/videos", false, 2, null)) {
            h = yk7.i();
        } else {
            yk7 yk7Var = yk7.a;
            h = yk7.h(w92.w());
        }
        String y = y(h);
        i();
        return j(y, false);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, b bVar, String str2) {
        this.f = true;
        this.a = accessToken;
        this.b = str;
        this.i = str2;
        D(bVar);
        G(httpMethod);
        if (bundle != null) {
            this.g = new Bundle(bundle);
        } else {
            this.g = new Bundle();
        }
        if (this.i == null) {
            this.i = w92.v();
        }
    }
}
