package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.assetretriever.e;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.NetworkStatus;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class gt7 implements b26 {
    private final Application a;
    private final NetworkStatus b;
    private final f15 c;
    private final AssetRetriever d;
    private ht7 e;
    private final CompositeDisposable f;

    public gt7(Application application, NetworkStatus networkStatus, f15 f15Var, AssetRetriever assetRetriever) {
        zq3.h(application, "context");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(f15Var, "nytScheduler");
        zq3.h(assetRetriever, "assetRetriever");
        this.a = application;
        this.b = networkStatus;
        this.c = f15Var;
        this.d = assetRetriever;
        this.f = new CompositeDisposable();
    }

    private final boolean k(Bundle bundle) {
        return zq3.c(bundle.getString("ARTICLE_REFERRING_SOURCE"), "BNA notification");
    }

    private final boolean l(Bundle bundle) {
        return DeviceUtils.z(this.a) && zq3.c(bundle.getString("ARTICLE_REFERRING_SOURCE"), "beta_content_preview");
    }

    public void g(ht7 ht7Var) {
        zq3.h(ht7Var, "view");
        this.e = ht7Var;
    }

    public final void h(Single single, Bundle bundle) {
        zq3.h(single, "assetObservable");
        zq3.h(bundle, "bundle");
        ht7 ht7Var = this.e;
        zq3.e(ht7Var);
        ht7Var.g();
        CompositeDisposable compositeDisposable = this.f;
        Single subscribeOn = single.observeOn(this.c.b()).subscribeOn(this.c.a());
        ht7 ht7Var2 = this.e;
        zq3.e(ht7Var2);
        compositeDisposable.add((Disposable) subscribeOn.subscribeWith(new ft7(ht7Var2, bundle, this.b)));
    }

    public final void i(Bundle bundle) {
        zq3.h(bundle, "bundle");
        h(j(bundle), bundle);
    }

    public final Single j(Bundle bundle) {
        zq3.h(bundle, "bundle");
        return this.d.p(e.Companion.a(bundle), (k(bundle) || l(bundle)) ? Instant.now() : null, new st[0]);
    }
}
