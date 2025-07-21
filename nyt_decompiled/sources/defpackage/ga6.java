package defpackage;

import android.app.Application;
import androidx.work.ExistingWorkPolicy;
import com.nytimes.android.internal.pushmessaging.PushMessaging;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDao;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDatabase;
import com.nytimes.android.internal.pushmessaging.subscription.PushSubscriptionAPI;
import com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal;
import com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote;
import com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.File;
import java.util.TimeZone;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes4.dex */
public final class ga6 {

    public static final class a implements Interceptor {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            zq3.h(chain, "chain");
            return chain.proceed(chain.request().newBuilder().addHeader("nyt-app-version", this.a).build());
        }
    }

    public static final class b implements Call.Factory {
        final /* synthetic */ b04 a;

        b(b04 b04Var) {
            this.a = b04Var;
        }

        @Override // okhttp3.Call.Factory
        public Call newCall(Request request) {
            zq3.h(request, "request");
            return ((OkHttpClient) this.a.get()).newCall(request);
        }
    }

    public static final class c implements qj9 {
        final /* synthetic */ mj9 a;

        c(mj9 mj9Var) {
            this.a = mj9Var;
        }

        @Override // defpackage.qj9
        public hi5 a(String str, ExistingWorkPolicy existingWorkPolicy, androidx.work.c cVar) {
            zq3.h(str, "uniqueWorkName");
            zq3.h(existingWorkPolicy, "existingWorkPolicy");
            zq3.h(cVar, "work");
            return this.a.e(str, existingWorkPolicy, cVar);
        }
    }

    public final PushMessagingDatabase a(Application application) {
        zq3.h(application, "application");
        return PushMessagingDatabase.Companion.b(application);
    }

    public final mj9 b(Application application) {
        zq3.h(application, "app");
        return mj9.a.a(application);
    }

    public final com.nytimes.android.internal.pushmessaging.model.a c(PushMessaging.c cVar) {
        zq3.h(cVar, "settings");
        return cVar.b();
    }

    public final String d() {
        String id = TimeZone.getDefault().getID();
        zq3.g(id, "getID(...)");
        return id;
    }

    public final OkHttpClient e(Application application, PushMessaging.c cVar, String str) {
        zq3.h(application, "application");
        zq3.h(cVar, "settings");
        zq3.h(str, "appVersion");
        OkHttpClient.Builder addNetworkInterceptor = new OkHttpClient().newBuilder().addNetworkInterceptor(new a(str));
        File cacheDir = application.getCacheDir();
        zq3.g(cacheDir, "getCacheDir(...)");
        return addNetworkInterceptor.cache(new Cache(cacheDir, cVar.d())).build();
    }

    public final PushSubscriptionAPI f(Retrofit.Builder builder, com.nytimes.android.internal.pushmessaging.model.a aVar) {
        zq3.h(builder, "builder");
        zq3.h(aVar, "environment");
        builder.baseUrl(aVar.b());
        Object create = builder.build().create(PushSubscriptionAPI.class);
        zq3.g(create, "create(...)");
        return (PushSubscriptionAPI) create;
    }

    public final Retrofit.Builder g(b04 b04Var) {
        zq3.h(b04Var, "client");
        Retrofit.Builder addConverterFactory = new Retrofit.Builder().callFactory(new b(b04Var)).addConverterFactory(MoshiConverterFactory.create());
        zq3.g(addConverterFactory, "addConverterFactory(...)");
        return addConverterFactory;
    }

    public final PushMessagingDao h(Application application) {
        zq3.h(application, "application");
        return new PushMessagingDaoWrapper(a(application).f());
    }

    public final vf8 i(TagMetadataAPI tagMetadataAPI, PushMessaging.c cVar, PushMessagingDao pushMessagingDao) {
        zq3.h(tagMetadataAPI, "tagMetadataAPI");
        zq3.h(cVar, "settings");
        zq3.h(pushMessagingDao, "pushMessagingDao");
        return cVar.e() == null ? new TagManagerRemote(tagMetadataAPI, cVar, pushMessagingDao) : new TagManagerLocal(cVar, pushMessagingDao);
    }

    public final TagMetadataAPI j(Retrofit.Builder builder, com.nytimes.android.internal.pushmessaging.model.a aVar) {
        zq3.h(builder, "builder");
        zq3.h(aVar, "environment");
        builder.baseUrl(aVar.a());
        Object create = builder.build().create(TagMetadataAPI.class);
        zq3.g(create, "create(...)");
        return (TagMetadataAPI) create;
    }

    public final String k() {
        return String.valueOf(TimeZone.getDefault().getRawOffset() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
    }

    public final qj9 l(Application application) {
        zq3.h(application, "application");
        return new c(b(application));
    }
}
