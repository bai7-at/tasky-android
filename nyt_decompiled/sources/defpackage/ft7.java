package defpackage;

import android.os.Bundle;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.utils.NetworkStatus;
import io.reactivex.observers.DisposableSingleObserver;

/* loaded from: classes3.dex */
public final class ft7 extends DisposableSingleObserver {
    private final ht7 a;
    private final Bundle b;
    private final NetworkStatus c;

    public ft7(ht7 ht7Var, Bundle bundle, NetworkStatus networkStatus) {
        zq3.h(ht7Var, "singleAssetView");
        zq3.h(bundle, "bundle");
        zq3.h(networkStatus, "networkStatus");
        this.a = ht7Var;
        this.b = bundle;
        this.c = networkStatus;
    }

    @Override // io.reactivex.SingleObserver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onSuccess(Asset asset) {
        zq3.h(asset, "asset");
        if (asset instanceof VideoAsset) {
            this.a.l(asset);
        } else if (asset instanceof AudioAsset) {
            this.a.c((AudioAsset) asset);
        } else {
            if (asset instanceof ImageAsset ? true : asset instanceof SlideshowAsset) {
                this.a.l(asset);
            } else {
                this.a.a(asset);
            }
        }
        ww8 ww8Var = ww8.a;
        this.a.d();
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        zq3.h(th, "error");
        if (this.c.g()) {
            String string = this.b.getString("com.nytimes.android.extra.ASSET_URL");
            String string2 = this.b.getString("com.nytimes.android.extra.ASSET_URI");
            if (string == null || string.length() == 0) {
                this.a.h(nk6.fail_load_retry);
            } else {
                this.a.b(string, string2);
            }
        } else {
            this.a.h(em6.no_network_message);
        }
        this.a.d();
    }
}
