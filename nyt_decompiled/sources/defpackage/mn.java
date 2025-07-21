package defpackage;

import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.libs.analytics.appsflyerclient.AppsFlyerClient;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class mn extends gc {
    private final AppsFlyerClient f;
    private final String g;
    private final Channel h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(AppsFlyerClient appsFlyerClient, CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        zq3.h(appsFlyerClient, "appsFlyerClient");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.f = appsFlyerClient;
        this.g = "appsflyer handler";
        this.h = Channel.AppsFlyer;
    }

    @Override // defpackage.hj0
    public Channel b() {
        return this.h;
    }

    @Override // defpackage.hj0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void d(on onVar) {
        zq3.h(onVar, "event");
        if (this.f.g()) {
            this.f.h(onVar.c(Channel.AppsFlyer), k(onVar));
        }
    }
}
