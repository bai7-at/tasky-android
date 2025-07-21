package com.nytimes.android.recent;

import androidx.fragment.app.Fragment;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.assetretriever.e;
import com.nytimes.android.recent.SavingBridge;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.utils.SaveOrigin;
import defpackage.d87;
import defpackage.s87;
import defpackage.ss2;
import defpackage.st;
import defpackage.ww8;
import defpackage.z18;
import defpackage.zq3;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes4.dex */
public final class SavingBridge {
    private final SaveHandler a;
    private final AssetRetriever b;

    public SavingBridge(SaveHandler saveHandler, AssetRetriever assetRetriever) {
        zq3.h(saveHandler, "saveHandler");
        zq3.h(assetRetriever, "assetRetriever");
        this.a = saveHandler;
        this.b = assetRetriever;
    }

    private final Single e(z18 z18Var) {
        AssetRetriever assetRetriever = this.b;
        e.a aVar = e.Companion;
        String n = z18Var.n();
        String o = z18Var.o();
        zq3.e(o);
        Single p = assetRetriever.p(aVar.c(n, o), null, new st[0]);
        final SavingBridge$fetchSaveable$1 savingBridge$fetchSaveable$1 = new ss2() { // from class: com.nytimes.android.recent.SavingBridge$fetchSaveable$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final s87 invoke(Asset asset) {
                zq3.h(asset, "it");
                return d87.a(asset);
            }
        };
        Single map = p.map(new Function() { // from class: ia7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                s87 f;
                f = SavingBridge.f(ss2.this, obj);
                return f;
            }
        });
        zq3.g(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s87 f(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (s87) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    public final boolean g(z18 z18Var) {
        zq3.h(z18Var, "asset");
        String o = z18Var.o();
        zq3.e(o);
        return h(o);
    }

    public final boolean h(String str) {
        zq3.h(str, "url");
        return this.a.q(str);
    }

    public final Completable i(final Fragment fragment, z18 z18Var, final ss2 ss2Var) {
        zq3.h(fragment, "fragment");
        zq3.h(z18Var, "asset");
        zq3.h(ss2Var, "uiUpdater");
        Single e = e(z18Var);
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.recent.SavingBridge$requestSaveOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(s87 s87Var) {
                SaveHandler saveHandler;
                saveHandler = SavingBridge.this.a;
                Fragment fragment2 = fragment;
                zq3.e(s87Var);
                saveHandler.m(fragment2, s87Var, SaveOrigin.RECENTLY_VIEWED, ss2Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((s87) obj);
                return ww8.a;
            }
        };
        Completable ignoreElement = e.doOnSuccess(new Consumer() { // from class: ha7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavingBridge.j(ss2.this, obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).ignoreElement();
        zq3.g(ignoreElement, "ignoreElement(...)");
        return ignoreElement;
    }

    public final Completable k(final Fragment fragment, z18 z18Var, final ss2 ss2Var) {
        zq3.h(fragment, "fragment");
        zq3.h(z18Var, "asset");
        zq3.h(ss2Var, "uiUpdater");
        Single e = e(z18Var);
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.recent.SavingBridge$requestUnsaveOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(s87 s87Var) {
                SaveHandler saveHandler;
                saveHandler = SavingBridge.this.a;
                Fragment fragment2 = fragment;
                zq3.e(s87Var);
                saveHandler.t(fragment2, s87Var, SaveOrigin.RECENTLY_VIEWED, ss2Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((s87) obj);
                return ww8.a;
            }
        };
        Completable ignoreElement = e.doOnSuccess(new Consumer() { // from class: ga7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavingBridge.l(ss2.this, obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).ignoreElement();
        zq3.g(ignoreElement, "ignoreElement(...)");
        return ignoreElement;
    }
}
