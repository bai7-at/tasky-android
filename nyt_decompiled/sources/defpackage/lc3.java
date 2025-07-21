package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.preference.g;
import com.nytimes.android.hybrid.HybridConfig;
import com.nytimes.xwords.hybrid.bridgecommands.reponse.GameDataResponseAdapter;
import com.nytimes.xwords.hybrid.config.Environments;
import com.nytimes.xwords.hybrid.rest.PageService;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.r42;
import java.util.Iterator;
import java.util.Set;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class lc3 {

    public static final class a {
        private final String a;

        public a(String str) {
            zq3.h(str, "appVersionNumber");
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "AppVersionName(appVersionNumber=" + this.a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response j(Interceptor.Chain chain) {
        zq3.h(chain, "chain");
        return chain.proceed(chain.request().newBuilder().addHeader("NYT-Games-Hybrid", "true").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response k(ec3 ec3Var, Application application, Interceptor.Chain chain) {
        String d;
        zq3.h(ec3Var, "$hybridDependencies");
        zq3.h(application, "$application");
        zq3.h(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        d = nc3.d(ec3Var, application);
        return chain.proceed(newBuilder.addHeader("User-Agent", d).build());
    }

    public final a c(ec3 ec3Var) {
        zq3.h(ec3Var, "hybridDependencies");
        return new a(ec3Var.a());
    }

    public final sb3 d() {
        return new sb3();
    }

    public final el e(ec3 ec3Var) {
        zq3.h(ec3Var, "hybridDependencies");
        return new el(ec3Var.b(), ec3Var.c(), ec3Var.a());
    }

    public final dz1 f() {
        return new dz1();
    }

    public final bc3 g(JsonAdapter jsonAdapter) {
        zq3.h(jsonAdapter, "jsonAdapter");
        return new bc3(jsonAdapter);
    }

    public final JsonAdapter h(i iVar) {
        zq3.h(iVar, "moshi");
        JsonAdapter c = iVar.c(HybridConfig.class);
        zq3.g(c, "adapter(...)");
        return c;
    }

    public final OkHttpClient i(OkHttpClient okHttpClient, Set set, final Application application, final ec3 ec3Var) {
        zq3.h(okHttpClient, "rootHttpClient");
        zq3.h(set, "interceptors");
        zq3.h(application, "application");
        zq3.h(ec3Var, "hybridDependencies");
        OkHttpClient.Builder addInterceptor = okHttpClient.newBuilder().addInterceptor(new Interceptor() { // from class: jc3
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response j;
                j = lc3.j(chain);
                return j;
            }
        }).addInterceptor(new Interceptor() { // from class: kc3
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response k;
                k = lc3.k(ec3.this, application, chain);
                return k;
            }
        });
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            addInterceptor.addInterceptor((Interceptor) it2.next());
        }
        return addInterceptor.build();
    }

    public final Retrofit l(OkHttpClient okHttpClient, SharedPreferences sharedPreferences) {
        Environments c;
        zq3.h(okHttpClient, "okHttpClient");
        zq3.h(sharedPreferences, "preferences");
        Retrofit.Builder client = new Retrofit.Builder().client(okHttpClient);
        c = nc3.c(sharedPreferences);
        return client.baseUrl(c.getBaseUrl()).addConverterFactory(bn5.a.a()).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Interceptor m() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        return httpLoggingInterceptor;
    }

    public final r42.c n(rx1 rx1Var) {
        zq3.h(rx1Var, "et2MilestoneListener");
        return rx1Var;
    }

    public final i o() {
        i d = new i.b().b(new GameDataResponseAdapter()).d();
        zq3.g(d, "build(...)");
        return d;
    }

    public final g55 p(Application application) {
        zq3.h(application, "application");
        return new g55(application);
    }

    public final PageService q(Retrofit retrofit) {
        zq3.h(retrofit, "restAdapter");
        return (PageService) retrofit.create(PageService.class);
    }

    public final SharedPreferences r(Application application) {
        zq3.h(application, "application");
        SharedPreferences b = g.b(application);
        zq3.g(b, "getDefaultSharedPreferences(...)");
        return b;
    }

    public final rx1 s() {
        return new rx1();
    }
}
