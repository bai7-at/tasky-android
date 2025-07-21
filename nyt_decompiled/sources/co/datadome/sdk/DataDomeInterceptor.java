package co.datadome.sdk;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import co.datadome.sdk.DataDomeSDK;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.ad0;
import defpackage.i63;
import defpackage.sd0;
import defpackage.wd5;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Call;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class DataDomeInterceptor implements Interceptor {
    private static DataDomeSDK.Builder b;
    private static final Charset c = Charset.forName(Constants.DEFAULT_ENCODING);
    private static CookieJar d;
    private final Context a;

    public DataDomeInterceptor(Application application, DataDomeSDK.Builder builder) {
        c(builder);
        this.a = application;
    }

    private Boolean a(Response response) {
        return Boolean.valueOf((response.code() == 403 || response.code() == 401) && !(DataDomeUtils.isNullOrEmpty(response.headers().get("X-DD-B")).booleanValue() && DataDomeUtils.isNullOrEmpty(response.headers().get("X-SF-CC-X-dd-b")).booleanValue()));
    }

    private Response b(Response response, Call call) {
        ResponseBody body = response.body();
        if (body == null) {
            return response;
        }
        Boolean a = a(response);
        Request request = response.request();
        String header = request.header("User-Agent");
        HashMap hashMap = new HashMap();
        Headers headers = response.headers();
        for (String str : headers.names()) {
            String str2 = headers.get(str);
            if (str2 != null) {
                hashMap.put(str, str2);
            }
        }
        if (b.f(response).booleanValue()) {
            CookieJar cookieJar = d;
            if (cookieJar == null) {
                Log.e("DataDome", "Implement the \"CookieJar\" interface to handle SFCC cookies, otherwise DataDome might not work correctly.\n Refer to https://docs.datadome.co/docs/sdk-android#cookiejar-interface-implementation.");
            } else {
                for (Cookie cookie : cookieJar.loadForRequest(response.request().url())) {
                    if (cookie.name().equalsIgnoreCase("dwsid")) {
                        hashMap.put(cookie.name(), cookie.value());
                    }
                }
            }
        }
        if (a.booleanValue()) {
            sd0 source = body.source();
            source.request(32767L);
            ad0 clone = source.z().clone();
            String str3 = response.headers().get("Content-Encoding");
            if (str3 != null) {
                if (str3.equalsIgnoreCase(EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP)) {
                    i63 i63Var = new i63(clone.clone());
                    try {
                        ad0 ad0Var = new ad0();
                        try {
                            ad0Var.I0(i63Var);
                            ad0 clone2 = ad0Var.clone();
                            ad0Var.close();
                            i63Var.close();
                            clone = clone2;
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            i63Var.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else if (str3.equalsIgnoreCase("br")) {
                    sd0 d2 = wd5.d(wd5.l(new org.brotli.dec.b(source.t1())));
                    String i1 = d2.i1();
                    d2.close();
                    return b.agent(header).K(request.url().toString()).process(response, hashMap, i1, call);
                }
            }
            Charset charset = c;
            MediaType contentType = body.contentType();
            Charset charset2 = contentType != null ? contentType.charset(charset) : charset;
            if (charset2 != null) {
                charset = charset2;
            }
            if (charset != null) {
                String V0 = clone.V0(charset);
                clone.close();
                return b.agent(header).K(request.url().toString()).process(response, hashMap, V0, call);
            }
            clone.close();
            response.close();
        }
        return b.agent(header).K(request.url().toString()).process(response, hashMap, "", call);
    }

    private static void c(DataDomeSDK.Builder builder) {
        b = builder;
    }

    public Context getContext() {
        return this.a;
    }

    public CookieJar getDataDomeCookieJar(CookieJar cookieJar) {
        d = cookieJar;
        return new a(cookieJar, b);
    }

    public DataDomeSDK.Builder getDataDomeSDK() {
        return b;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        String header = request.header(c.HTTP_HEADER_COOKIE);
        Request.Builder newBuilder = request.newBuilder();
        Headers.Builder builder = new Headers.Builder();
        builder.addAll(request.headers());
        builder.removeAll(c.HTTP_HEADER_COOKIE);
        String mergeCookie = DataDomeUtils.mergeCookie(c.DATADOME_COOKIE_PREFIX + b.getCookie(), header);
        if (!mergeCookie.equals(c.DATADOME_COOKIE_PREFIX)) {
            builder.addUnsafeNonAscii(c.HTTP_HEADER_COOKIE, mergeCookie);
        }
        Headers build = builder.build();
        newBuilder.headers(build);
        d.a("Request cookie: " + build.get(ChallengeActivity.ARG_COOKIE) + "\nFor request " + request.url());
        Response proceed = chain.proceed(newBuilder.build());
        if (!proceed.headers(c.HTTP_HEADER_SET_COOKIE).isEmpty()) {
            List<String> headers = proceed.headers(c.HTTP_HEADER_SET_COOKIE);
            if (!headers.isEmpty()) {
                Iterator<String> it2 = headers.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    if (DataDomeUtils.isValidCookie(next).booleanValue()) {
                        b.setCookie(next);
                        d.a("Response set-cookie: " + next + "\nFor request " + proceed.request().url());
                        break;
                    }
                }
            }
        }
        return b(proceed, chain.call().clone());
    }

    @Deprecated
    public DataDomeInterceptor(Application application, DataDomeSDKListener dataDomeSDKListener, String str, String str2) {
        if (b == null) {
            c(DataDomeSDK.with(application, str, str2).listener(dataDomeSDKListener));
        }
        this.a = application;
    }

    @Deprecated
    public DataDomeInterceptor(Application application, DataDomeSDKListener dataDomeSDKListener, String str, String str2, Boolean bool) {
        if (b == null) {
            c(DataDomeSDK.with(application, str, str2).bypassAcceptHeader(bool).listener(dataDomeSDKListener));
        }
        this.a = application;
    }
}
