package defpackage;

import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.api.EventTrackerApi;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* loaded from: classes4.dex */
public final class y52 {
    public static final y52 a = new y52();

    public static final class a implements Call.Factory {
        final /* synthetic */ b04 a;

        a(b04 b04Var) {
            this.a = b04Var;
        }

        @Override // okhttp3.Call.Factory
        public Call newCall(Request request) {
            zq3.h(request, "request");
            return ((OkHttpClient) this.a.get()).newCall(request);
        }
    }

    private y52() {
    }

    public final EventTrackerApi a(b04 b04Var, EventTracker.a aVar) {
        zq3.h(b04Var, "okHttpClient");
        zq3.h(aVar, "configuration");
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.callFactory(new a(b04Var));
        builder.baseUrl(aVar.f().getBaseUrl());
        builder.addCallAdapterFactory(RxJava2CallAdapterFactory.create());
        builder.addConverterFactory(ScalarsConverterFactory.create());
        builder.addConverterFactory(MoshiConverterFactory.create());
        builder.validateEagerly(false);
        Object create = builder.build().create(EventTrackerApi.class);
        zq3.g(create, "create(...)");
        return (EventTrackerApi) create;
    }
}
