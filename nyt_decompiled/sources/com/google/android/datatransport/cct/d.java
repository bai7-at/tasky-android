package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.amazonaws.http.HttpHeader;
import com.comscore.streaming.WindowState;
import com.comscore.util.log.LogLevel;
import com.google.android.datatransport.cct.d;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.cct.internal.i;
import com.google.android.datatransport.cct.internal.j;
import com.google.android.datatransport.cct.internal.k;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.firebase.encoders.EncodingException;
import defpackage.a17;
import defpackage.c42;
import defpackage.ca4;
import defpackage.ct2;
import defpackage.f12;
import defpackage.f17;
import defpackage.i91;
import defpackage.p30;
import defpackage.ul0;
import defpackage.x02;
import defpackage.z84;
import defpackage.zr8;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
final class d implements zr8 {
    private final i91 a;
    private final ConnectivityManager b;
    private final Context c;
    final URL d;
    private final ul0 e;
    private final ul0 f;
    private final int g;

    static final class a {
        final URL a;
        final i b;
        final String c;

        a(URL url, i iVar, String str) {
            this.a = url;
            this.b = iVar;
            this.c = str;
        }

        a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    static final class b {
        final int a;
        final URL b;
        final long c;

        b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    d(Context context, ul0 ul0Var, ul0 ul0Var2, int i) {
        this.a = i.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = n(com.google.android.datatransport.cct.a.c);
        this.e = ul0Var2;
        this.f = ul0Var;
        this.g = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) {
        ca4.e("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(LogLevel.NONE);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP);
        httpURLConnection.setRequestProperty("Content-Type", Constants.APPLICATION_JSON);
        httpURLConnection.setRequestProperty("Accept-Encoding", EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP);
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    ca4.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    ca4.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    ca4.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField(HttpHeader.LOCATION)), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, z84.b(new BufferedReader(new InputStreamReader(m))).c());
                            if (m != null) {
                                m.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException | IOException e) {
            ca4.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(WindowState.NORMAL, null, 0L);
        } catch (ConnectException | UnknownHostException e2) {
            ca4.c("CctTransportBackend", "Couldn't open connection, returning with 500", e2);
            return new b(500, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
        }
        if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.getValue() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            ca4.c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    private i i(p30 p30Var) {
        j.a j;
        HashMap hashMap = new HashMap();
        for (c42 c42Var : p30Var.b()) {
            String j2 = c42Var.j();
            if (hashMap.containsKey(j2)) {
                ((List) hashMap.get(j2)).add(c42Var);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c42Var);
                hashMap.put(j2, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            c42 c42Var2 = (c42) ((List) entry.getValue()).get(0);
            k.a b2 = k.a().f(QosTier.DEFAULT).g(this.f.a()).h(this.e.a()).b(ClientInfo.a().c(ClientInfo.ClientType.ANDROID_FIREBASE).b(com.google.android.datatransport.cct.internal.a.a().m(Integer.valueOf(c42Var2.g("sdk-version"))).j(c42Var2.b("model")).f(c42Var2.b("hardware")).d(c42Var2.b("device")).l(c42Var2.b("product")).k(c42Var2.b("os-uild")).h(c42Var2.b("manufacturer")).e(c42Var2.b("fingerprint")).c(c42Var2.b("country")).g(c42Var2.b("locale")).i(c42Var2.b("mcc_mnc")).b(c42Var2.b("application_build")).a()).a());
            try {
                b2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (c42 c42Var3 : (List) entry.getValue()) {
                x02 e = c42Var3.e();
                f12 b3 = e.b();
                if (b3.equals(f12.b("proto"))) {
                    j = j.j(e.a());
                } else if (b3.equals(f12.b("json"))) {
                    j = j.i(new String(e.a(), Charset.forName(com.amazonaws.services.s3.internal.Constants.DEFAULT_ENCODING)));
                } else {
                    ca4.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b3);
                }
                j.c(c42Var3.f()).d(c42Var3.k()).h(c42Var3.h("tz-offset")).e(NetworkConnectionInfo.a().c(NetworkConnectionInfo.NetworkType.forNumber(c42Var3.g("net-type"))).b(NetworkConnectionInfo.MobileSubtype.forNumber(c42Var3.g("mobile-subtype"))).a());
                if (c42Var3.d() != null) {
                    j.b(c42Var3.d());
                }
                arrayList3.add(j.a());
            }
            b2.c(arrayList3);
            arrayList2.add(b2.a());
        }
        return i.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        ca4.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    private static InputStream m(InputStream inputStream, String str) {
        return EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP.equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // defpackage.zr8
    public c42 a(c42 c42Var) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return c42Var.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.c).getSimOperator()).c("application_build", Integer.toString(h(this.c))).d();
    }

    @Override // defpackage.zr8
    public BackendResponse b(p30 p30Var) {
        i i = i(p30Var);
        URL url = this.d;
        if (p30Var.c() != null) {
            try {
                com.google.android.datatransport.cct.a c = com.google.android.datatransport.cct.a.c(p30Var.c());
                r3 = c.d() != null ? c.d() : null;
                if (c.e() != null) {
                    url = n(c.e());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.a();
            }
        }
        try {
            b bVar = (b) a17.a(5, new a(url, i, r3), new ct2() { // from class: com.google.android.datatransport.cct.b
                @Override // defpackage.ct2
                public final Object apply(Object obj) {
                    d.b e;
                    e = d.this.e((d.a) obj);
                    return e;
                }
            }, new f17() { // from class: com.google.android.datatransport.cct.c
                @Override // defpackage.f17
                public final Object a(Object obj, Object obj2) {
                    d.a l;
                    l = d.l((d.a) obj, (d.b) obj2);
                    return l;
                }
            });
            int i2 = bVar.a;
            if (i2 == 200) {
                return BackendResponse.e(bVar.c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? BackendResponse.d() : BackendResponse.a();
            }
            return BackendResponse.f();
        } catch (IOException e) {
            ca4.c("CctTransportBackend", "Could not make request to the backend", e);
            return BackendResponse.f();
        }
    }

    d(Context context, ul0 ul0Var, ul0 ul0Var2) {
        this(context, ul0Var, ul0Var2, 130000);
    }
}
