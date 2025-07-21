package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.nytimes.android.ads.a;
import com.nytimes.android.ads.network.AlsRepositoryImpl;
import com.nytimes.android.ads.network.api.AlsApi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes2.dex */
public final class ub {
    public static final ub a = new ub();

    private ub() {
    }

    public final bc a(AlsApi alsApi, a aVar, qb qbVar, MutableSharedFlow mutableSharedFlow) {
        zq3.h(alsApi, "alsApi");
        zq3.h(aVar, "adClient");
        zq3.h(qbVar, "store");
        zq3.h(mutableSharedFlow, "alsSharedFlow");
        return new AlsRepositoryImpl(alsApi, aVar, qbVar, mutableSharedFlow);
    }

    public final Retrofit b(OkHttpClient okHttpClient) {
        zq3.h(okHttpClient, "okHttpClient");
        return new Retrofit.Builder().baseUrl("https://als-svc.nytimes.com").client(okHttpClient).addConverterFactory(MoshiConverterFactory.create()).build();
    }

    public final AlsApi c(Retrofit retrofit) {
        zq3.h(retrofit, "retrofit");
        Object create = retrofit.create(AlsApi.class);
        zq3.g(create, "create(...)");
        return (AlsApi) create;
    }

    public final qb d(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "sharedPreferences");
        JsonAdapter d = new i.b().d().d(j.j(Map.class, String.class, String.class));
        zq3.g(d, "adapter(...)");
        return new rb(sharedPreferences, d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OkHttpClient e() {
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return addInterceptor.readTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).build();
    }

    public final SharedPreferences f(Context context) {
        zq3.h(context, "appContext");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.nytimes.android.ads.als", 0);
        zq3.g(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
