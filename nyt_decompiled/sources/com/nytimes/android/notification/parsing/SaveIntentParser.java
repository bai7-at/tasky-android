package com.nytimes.android.notification.parsing;

import android.app.Application;
import android.widget.Toast;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.assetretriever.e;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.notification.parsing.SaveIntentParser;
import com.nytimes.android.saved.SavedManager;
import defpackage.cm6;
import defpackage.rn3;
import defpackage.ss2;
import defpackage.st;
import defpackage.td4;
import defpackage.w87;
import defpackage.ww8;
import defpackage.zn3;
import defpackage.zq3;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlinx.coroutines.rx2.RxCompletableKt;

/* loaded from: classes4.dex */
public final class SaveIntentParser extends zn3 {
    private final Application b;
    private final AssetRetriever c;
    private final SavedManager d;
    private final a e;
    private final w87 f;
    private final td4 g;

    public SaveIntentParser(Application application, AssetRetriever assetRetriever, SavedManager savedManager, a aVar, w87 w87Var, td4 td4Var) {
        zq3.h(application, "context");
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(savedManager, "savedManager");
        zq3.h(aVar, "ecommClient");
        zq3.h(w87Var, "eT2Reporter");
        zq3.h(td4Var, "mainActivityNavigator");
        this.b = application;
        this.c = assetRetriever;
        this.d = savedManager;
        this.e = aVar;
        this.f = w87Var;
        this.g = td4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Completable l(Asset asset) {
        return RxCompletableKt.rxCompletable$default(null, new SaveIntentParser$onSaveAsset$1(this, asset, null), 1, null);
    }

    private final void m(String str) {
        NYTLogger.d("Asset " + str + " saved correctly", new Object[0]);
        Toast.makeText(this.b, cm6.save_success, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Throwable th) {
        NYTLogger.h(th);
    }

    private final void o(String str, final String str2) {
        if (!this.e.q()) {
            rn3.a(this.b, this.g, str2, str);
            return;
        }
        Single p = this.c.p(e.Companion.c(str, str2), null, new st[0]);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.notification.parsing.SaveIntentParser$saveAsset$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CompletableSource invoke(Asset asset) {
                Completable l;
                zq3.h(asset, "it");
                l = SaveIntentParser.this.l(asset);
                return l;
            }
        };
        Completable observeOn = p.flatMapCompletable(new Function() { // from class: m87
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CompletableSource q;
                q = SaveIntentParser.q(ss2.this, obj);
                return q;
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Action action = new Action() { // from class: n87
            @Override // io.reactivex.functions.Action
            public final void run() {
                SaveIntentParser.r(SaveIntentParser.this, str2);
            }
        };
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.notification.parsing.SaveIntentParser$saveAsset$3
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                SaveIntentParser saveIntentParser = SaveIntentParser.this;
                zq3.e(th);
                saveIntentParser.n(th);
            }
        };
        Disposable subscribe = observeOn.subscribe(action, new Consumer() { // from class: o87
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SaveIntentParser.s(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        a(subscribe);
    }

    static /* synthetic */ void p(SaveIntentParser saveIntentParser, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        saveIntentParser.o(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompletableSource q(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (CompletableSource) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SaveIntentParser saveIntentParser, String str) {
        zq3.h(saveIntentParser, "this$0");
        saveIntentParser.d.syncCache();
        saveIntentParser.m(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    @Override // defpackage.zn3
    public void c(String str, String str2) {
        zq3.h(str, "title");
        zq3.h(str2, "uri");
        p(this, str2, null, 2, null);
    }

    @Override // defpackage.zn3
    public void d(String str, String str2) {
        zq3.h(str, "title");
        zq3.h(str2, "url");
        p(this, null, str2, 1, null);
    }
}
