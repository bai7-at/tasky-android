package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class o73 implements Interceptor {
    public static final a Companion = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final qs2 i;
    private final qs2 j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o73(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, qs2 qs2Var, qs2 qs2Var2) {
        zq3.h(str, "appType");
        zq3.h(str2, "appVersion");
        zq3.h(str3, "osVersion");
        zq3.h(str4, "deviceType");
        zq3.h(str5, "deviceModel");
        zq3.h(str6, "userAgent");
        zq3.h(str8, "buildType");
        zq3.h(qs2Var, "buildTypeOverride");
        zq3.h(qs2Var2, "deviceWidth");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = qs2Var;
        this.j = qs2Var2;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        zq3.h(chain, "chain");
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        newBuilder.addHeader("NYT-App-Type", this.a);
        newBuilder.addHeader("NYT-App-Version", this.b);
        newBuilder.addHeader("NYT-OS-Version", this.c);
        newBuilder.addHeader("NYT-Device-Type", this.d);
        newBuilder.addHeader("NYT-Device-Model", this.e);
        String str = (String) this.i.mo865invoke();
        if (str == null) {
            str = this.h;
        }
        newBuilder.addHeader("NYT-Build-Type", str);
        newBuilder.addHeader("User-Agent", this.f);
        String str2 = this.g;
        if (str2 != null && str2.length() > 0) {
            newBuilder.addHeader("client_id", this.g);
        }
        Integer num = (Integer) this.j.mo865invoke();
        if (num != null) {
            newBuilder.addHeader("x-nyt-device-width", String.valueOf(num.intValue()));
        }
        newBuilder.addHeader("x-nyt-graphql-endpoint", request.url().toString());
        try {
            return chain.proceed(newBuilder.build());
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
