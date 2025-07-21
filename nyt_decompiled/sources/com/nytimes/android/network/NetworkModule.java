package com.nytimes.android.network;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.gson.Gson;
import com.nytimes.android.dimodules.OkHttpClientFactory;
import com.nytimes.android.internal.auth.SamizdatSigning$Builder;
import com.nytimes.android.internal.cms.CmsEnvironment;
import com.nytimes.android.internal.cms.SamizdatCms$Builder;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.network.NetworkModule;
import com.nytimes.android.network.urlexpander.UrlExpander;
import com.nytimes.android.network.urlexpander.UrlExpanderApi;
import com.nytimes.android.secrets.Secrets;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.at3;
import defpackage.b04;
import defpackage.c05;
import defpackage.ds7;
import defpackage.ej6;
import defpackage.oe9;
import defpackage.ql6;
import defpackage.qs2;
import defpackage.qx3;
import defpackage.s77;
import defpackage.so1;
import defpackage.ud0;
import defpackage.um5;
import defpackage.xc6;
import defpackage.xm8;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Session;
import java.util.Locale;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import zendesk.core.Constants;

/* loaded from: classes4.dex */
public final class NetworkModule {
    public static final NetworkModule a = new NetworkModule();

    private NetworkModule() {
    }

    private final long c(Context context) {
        try {
            return um5.a(context.getPackageManager().getPackageInfo("com.google.android.gms", 0));
        } catch (Exception e) {
            NYTLogger.C(e, "Error Getting Google Play Services Version", new Object[0]);
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Call g(b04 b04Var, Request request) {
        zq3.h(b04Var, "$client");
        zq3.h(request, "request");
        return ((OkHttpClient) b04Var.get()).newCall(request);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Call k(b04 b04Var, Request request) {
        zq3.h(b04Var, "$client");
        zq3.h(request, "request");
        return ((OkHttpClient) b04Var.get()).newCall(request);
    }

    public final CmsEnvironment d(Resources resources, SharedPreferences sharedPreferences) {
        zq3.h(resources, "resources");
        zq3.h(sharedPreferences, "sharedPreferences");
        String string = resources.getString(ql6.com_nytimes_android_phoenix_beta_CONTENT_ENV);
        zq3.g(string, "getString(...)");
        String string2 = sharedPreferences.getString(string, null);
        if (string2 != null) {
            for (CmsEnvironment cmsEnvironment : CmsEnvironment.values()) {
                if (zq3.c(cmsEnvironment.getUrl(resources), string2)) {
                    return cmsEnvironment;
                }
            }
        }
        return CmsEnvironment.PRODUCTION;
    }

    public final so1 e(boolean z, Application application, SharedPreferences sharedPreferences) {
        String str;
        zq3.h(application, "context");
        zq3.h(sharedPreferences, "sharedPreferences");
        Resources resources = application.getResources();
        String j = z ? DeviceUtils.j(application, sharedPreferences) : null;
        PackageInfo d = oe9.d(application);
        if (d != null) {
            str = d.packageName + "/" + d.versionName;
        } else {
            str = null;
        }
        long c = c(application);
        so1.a aVar = new so1.a();
        String string = resources.getString(ql6.samizdat_app_type);
        zq3.g(string, "getString(...)");
        so1.a b = aVar.b(string);
        String string2 = resources.getString(ql6.samizdat_agent_id);
        zq3.g(string2, "getString(...)");
        so1.a a2 = b.a(string2);
        String string3 = resources.getString(ql6.samizdat_nyt_header);
        zq3.g(string3, "getString(...)");
        so1.a k = a2.k(string3);
        String string4 = resources.getString(ql6.samizdat_device_type);
        zq3.g(string4, "getString(...)");
        return k.i(string4).c(DeviceUtils.u(application, false, false, 3, null)).l(DeviceUtils.l()).h(DeviceUtils.g()).e(DeviceUtils.d(application)).g(j).f(resources.getString(ql6.samizdat_client_id)).n(str).j(c).m(Integer.valueOf((int) DeviceUtils.H(DeviceUtils.p(application)))).d();
    }

    public final Retrofit.Builder f(final b04 b04Var, c05 c05Var, Resources resources) {
        at3 at3Var;
        zq3.h(b04Var, "client");
        zq3.h(c05Var, "nytCookieProvider");
        zq3.h(resources, "resources");
        Retrofit.Builder addConverterFactory = new Retrofit.Builder().callFactory(new Call.Factory() { // from class: z35
            @Override // okhttp3.Call.Factory
            public final Call newCall(Request request) {
                Call g;
                g = NetworkModule.g(b04.this, request);
                return g;
            }
        }).client(((OkHttpClient) b04Var.get()).newBuilder().addInterceptor(c05Var.p()).build()).addConverterFactory(new ud0()).addConverterFactory(new xm8());
        at3Var = NetworkModuleKt.a;
        Retrofit.Builder validateEagerly = addConverterFactory.addConverterFactory(qx3.a(at3Var, MediaType.Companion.get(Constants.APPLICATION_JSON))).validateEagerly(resources.getBoolean(xc6.logNetworkErrs));
        zq3.g(validateEagerly, "validateEagerly(...)");
        return validateEagerly;
    }

    public final OkHttpClient h(OkHttpClientFactory okHttpClientFactory) {
        zq3.h(okHttpClientFactory, "factory");
        return okHttpClientFactory.c();
    }

    public final Resources i(Application application) {
        zq3.h(application, "application");
        Configuration configuration = new Configuration(application.getResources().getConfiguration());
        configuration.setLocale(new Locale(Session.MESSAGE_TYPE_END));
        Resources resources = application.getApplicationContext().createConfigurationContext(configuration).getResources();
        zq3.g(resources, "getResources(...)");
        return resources;
    }

    public final Retrofit.Builder j(final b04 b04Var, Resources resources, Gson gson) {
        zq3.h(b04Var, "client");
        zq3.h(resources, "resources");
        zq3.h(gson, "gson");
        Retrofit.Builder validateEagerly = new Retrofit.Builder().callFactory(new Call.Factory() { // from class: a45
            @Override // okhttp3.Call.Factory
            public final Call newCall(Request request) {
                Call k;
                k = NetworkModule.k(b04.this, request);
                return k;
            }
        }).addConverterFactory(new xm8()).addConverterFactory(new ud0()).addConverterFactory(GsonConverterFactory.create(gson)).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).validateEagerly(resources.getBoolean(xc6.logNetworkErrs));
        zq3.g(validateEagerly, "validateEagerly(...)");
        return validateEagerly;
    }

    public final s77 l(Application application, Retrofit.Builder builder, b04 b04Var, final CmsEnvironment cmsEnvironment, so1 so1Var) {
        zq3.h(application, "application");
        zq3.h(builder, "retrofitBuilder");
        zq3.h(b04Var, "client");
        zq3.h(cmsEnvironment, "cmsEnvironment");
        zq3.h(so1Var, "deviceConfig");
        SamizdatCms$Builder h = new SamizdatCms$Builder(null, null, null, null, null, null, null, 127, null).e(new qs2() { // from class: com.nytimes.android.network.NetworkModule$provideSamizdatCMSClient$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CmsEnvironment mo865invoke() {
                return CmsEnvironment.this;
            }
        }).b(application).h(builder);
        Object obj = b04Var.get();
        zq3.g(obj, "get(...)");
        return h.g((OkHttpClient) obj).d(so1Var.c()).f(Session.MESSAGE_TYPE_END).a(Secrets.AKAMAI_SALT_1.decode() + Secrets.AKAMAI_SALT_2.decode()).c();
    }

    public final ds7 m(Application application) {
        zq3.h(application, "application");
        SamizdatSigning$Builder d = new SamizdatSigning$Builder(null, null, null, null, null, null, null, null, false, 511, null).d(application);
        String string = application.getResources().getString(ql6.samizdat_nyt_header);
        zq3.g(string, "getString(...)");
        return d.i(string).c(DeviceUtils.u(application, false, false, 3, null)).h(ej6.keystore).b(Secrets.ALPHA_PART.decode()).e(Secrets.BETA_PART.decode()).g(Secrets.GAMMA_PART.decode()).f();
    }

    public final UrlExpander n(UrlExpanderApi urlExpanderApi) {
        zq3.h(urlExpanderApi, "urlExpanderApi");
        return new UrlExpander(urlExpanderApi);
    }

    public final UrlExpanderApi o(Retrofit.Builder builder, Resources resources) {
        zq3.h(builder, "retrofitBuilder");
        zq3.h(resources, "resources");
        String string = resources.getString(ql6.content_api);
        zq3.g(string, "getString(...)");
        Object create = builder.baseUrl(string).build().create(UrlExpanderApi.class);
        zq3.g(create, "create(...)");
        return (UrlExpanderApi) create;
    }
}
