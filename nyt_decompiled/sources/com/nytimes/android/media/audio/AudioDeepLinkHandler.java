package com.nytimes.android.media.audio;

import android.content.Intent;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.assetretriever.e;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.audio.AudioDeepLinkHandler;
import com.nytimes.android.media.common.a;
import defpackage.b04;
import defpackage.rb3;
import defpackage.ss2;
import defpackage.st;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes4.dex */
public final class AudioDeepLinkHandler {
    private final a a;
    private final b04 b;
    private final rb3 c;
    private final CompositeDisposable d;

    public AudioDeepLinkHandler(a aVar, b04 b04Var, rb3 rb3Var) {
        zq3.h(aVar, "assetMediaConverter");
        zq3.h(b04Var, "assetRetriever");
        zq3.h(rb3Var, "hybridAudioHandler");
        this.a = aVar;
        this.b = b04Var;
        this.c = rb3Var;
        this.d = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Asset asset) {
        if (asset instanceof AudioAsset) {
            this.c.c(this.a.a((AudioAsset) asset, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Throwable th) {
        zq3.e(th);
        NYTLogger.i(th, "Error getting audio asset", new Object[0]);
    }

    public final boolean e(Intent intent) {
        if (intent == null || !intent.hasExtra("com.nytimes.android.extra.IS_AUDIO")) {
            return false;
        }
        CompositeDisposable compositeDisposable = this.d;
        Single observeOn = ((AssetRetriever) this.b.get()).p(e.Companion.b(intent), null, new st[0]).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.audio.AudioDeepLinkHandler$launchAudioFromIntent$1
            {
                super(1);
            }

            public final void b(Asset asset) {
                zq3.h(asset, "asset");
                AudioDeepLinkHandler.this.d(asset);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Asset) obj);
                return ww8.a;
            }
        };
        compositeDisposable.add(observeOn.subscribe(new Consumer() { // from class: lw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioDeepLinkHandler.f(ss2.this, obj);
            }
        }, new Consumer() { // from class: mw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioDeepLinkHandler.g((Throwable) obj);
            }
        }));
        return true;
    }

    public final void h() {
        this.d.dispose();
    }
}
