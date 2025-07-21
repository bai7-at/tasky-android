package defpackage;

import android.content.res.Resources;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.gateway.GatewayPresenterImpl;
import com.nytimes.android.link.share.LinkShareDAOImpl;
import com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager;
import com.nytimes.android.meter.MeterServiceApi;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.utils.NetworkStatus;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public interface uq {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final e54 a(ApolloClient apolloClient, f54 f54Var) {
            zq3.h(apolloClient, "apolloClient");
            zq3.h(f54Var, "linkShareParser");
            return new LinkShareDAOImpl(apolloClient, f54Var);
        }

        public final MeterServiceApi b(Retrofit.Builder builder, Resources resources) {
            zq3.h(builder, "retrofitBuilder");
            zq3.h(resources, "res");
            Object create = builder.baseUrl(resources.getString(ql6.nytimes_base_url)).build().create(MeterServiceApi.class);
            zq3.g(create, "create(...)");
            return (MeterServiceApi) create;
        }

        public final sw2 c(gt4 gt4Var, RecentlyViewedManager recentlyViewedManager, jc jcVar, com.nytimes.android.entitlements.a aVar, uy3 uy3Var, Scheduler scheduler, Scheduler scheduler2, NetworkStatus networkStatus, PostLoginRegiOfferManager postLoginRegiOfferManager) {
            zq3.h(gt4Var, "meterServiceDAO");
            zq3.h(recentlyViewedManager, "recentlyViewedManager");
            zq3.h(jcVar, "analyticsClient");
            zq3.h(aVar, "eCommClient");
            zq3.h(uy3Var, "launchProductLandingHelper");
            zq3.h(scheduler, "ioScheduler");
            zq3.h(scheduler2, "mainScheduler");
            zq3.h(networkStatus, "networkStatus");
            zq3.h(postLoginRegiOfferManager, "postLoginRegiOfferManager");
            return new GatewayPresenterImpl(gt4Var, recentlyViewedManager, new CompositeDisposable(), jcVar, aVar, uy3Var, scheduler, scheduler2, networkStatus, postLoginRegiOfferManager);
        }
    }
}
