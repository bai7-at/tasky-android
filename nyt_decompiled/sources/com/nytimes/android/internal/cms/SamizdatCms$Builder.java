package com.nytimes.android.internal.cms;

import android.app.Application;
import com.nytimes.android.internal.cms.config.SamizdatConfigProviderImpl;
import com.nytimes.android.internal.cms.networking.SamizdatApi;
import com.nytimes.android.internal.cms.networking.SamizdatCmsClientImpl;
import defpackage.ds7;
import defpackage.fm8;
import defpackage.is7;
import defpackage.q77;
import defpackage.qs2;
import defpackage.s77;
import defpackage.vd0;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Session;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class SamizdatCms$Builder {
    private Application a;
    private qs2 b;
    private Retrofit.Builder c;
    private String d;
    private String e;
    private String f;
    private OkHttpClient g;

    public SamizdatCms$Builder(Application application, qs2 qs2Var, Retrofit.Builder builder, String str, String str2, String str3, OkHttpClient okHttpClient) {
        zq3.h(qs2Var, "environment");
        zq3.h(str2, "headerLanguage");
        this.a = application;
        this.b = qs2Var;
        this.c = builder;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = okHttpClient;
    }

    public final SamizdatCms$Builder a(String str) {
        zq3.h(str, "akamaiSalt");
        this.f = str;
        return this;
    }

    public final SamizdatCms$Builder b(Application application) {
        zq3.h(application, "application");
        this.a = application;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final s77 c() {
        ds7 ds7Var;
        OkHttpClient okHttpClient = this.g;
        zq3.e(okHttpClient);
        Iterator it2 = okHttpClient.interceptors().iterator();
        while (true) {
            if (!it2.hasNext()) {
                ds7Var = 0;
                break;
            }
            ds7Var = it2.next();
            if (((Interceptor) ds7Var) instanceof ds7) {
                break;
            }
        }
        ds7 ds7Var2 = ds7Var instanceof ds7 ? ds7Var : null;
        if (ds7Var2 == null) {
            throw new SamizdatCmsSetupException("Missing Required SigningInterceptor for Samizdat");
        }
        fm8 a = ds7Var2.a();
        Retrofit.Builder builder = this.c;
        zq3.e(builder);
        builder.addConverterFactory(new vd0());
        Application application = this.a;
        zq3.e(application);
        q77 q77Var = new q77(application, this.b);
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        zq3.e(str3);
        SamizdatConfigProviderImpl samizdatConfigProviderImpl = new SamizdatConfigProviderImpl(str, str2, new is7(str3), q77Var);
        Retrofit.Builder builder2 = this.c;
        zq3.e(builder2);
        SamizdatApi samizdatApi = (SamizdatApi) builder2.baseUrl((String) samizdatConfigProviderImpl.a().a().mo865invoke()).build().create(SamizdatApi.class);
        zq3.e(samizdatApi);
        return new SamizdatCmsClientImpl(samizdatApi, samizdatConfigProviderImpl, a);
    }

    public final SamizdatCms$Builder d(String str) {
        zq3.h(str, "deviceId");
        this.d = str;
        return this;
    }

    public final SamizdatCms$Builder e(qs2 qs2Var) {
        zq3.h(qs2Var, "environment");
        this.b = qs2Var;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SamizdatCms$Builder)) {
            return false;
        }
        SamizdatCms$Builder samizdatCms$Builder = (SamizdatCms$Builder) obj;
        return zq3.c(this.a, samizdatCms$Builder.a) && zq3.c(this.b, samizdatCms$Builder.b) && zq3.c(this.c, samizdatCms$Builder.c) && zq3.c(this.d, samizdatCms$Builder.d) && zq3.c(this.e, samizdatCms$Builder.e) && zq3.c(this.f, samizdatCms$Builder.f) && zq3.c(this.g, samizdatCms$Builder.g);
    }

    public final SamizdatCms$Builder f(String str) {
        zq3.h(str, "headerLanguage");
        this.e = str;
        return this;
    }

    public final SamizdatCms$Builder g(OkHttpClient okHttpClient) {
        zq3.h(okHttpClient, "okHttpClient");
        this.g = okHttpClient;
        return this;
    }

    public final SamizdatCms$Builder h(Retrofit.Builder builder) {
        zq3.h(builder, "retrofitBuilder");
        this.c = builder;
        return this;
    }

    public int hashCode() {
        Application application = this.a;
        int hashCode = (((application == null ? 0 : application.hashCode()) * 31) + this.b.hashCode()) * 31;
        Retrofit.Builder builder = this.c;
        int hashCode2 = (hashCode + (builder == null ? 0 : builder.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OkHttpClient okHttpClient = this.g;
        return hashCode4 + (okHttpClient != null ? okHttpClient.hashCode() : 0);
    }

    public String toString() {
        return "Builder(application=" + this.a + ", environment=" + this.b + ", retrofitBuilder=" + this.c + ", deviceId=" + this.d + ", headerLanguage=" + this.e + ", akamaiSalt=" + this.f + ", okHttpClient=" + this.g + ")";
    }

    public /* synthetic */ SamizdatCms$Builder(Application application, qs2 qs2Var, Retrofit.Builder builder, String str, String str2, String str3, OkHttpClient okHttpClient, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : application, (i & 2) != 0 ? new qs2() { // from class: com.nytimes.android.internal.cms.SamizdatCms$Builder.1
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CmsEnvironment mo865invoke() {
                return CmsEnvironment.PRODUCTION;
            }
        } : qs2Var, (i & 4) != 0 ? null : builder, (i & 8) != 0 ? null : str, (i & 16) != 0 ? Session.MESSAGE_TYPE_END : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : okHttpClient);
    }
}
