package com.nytimes.android.menu;

import android.app.Activity;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.fragment.article.ArticleFragmentType;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.saved.SavedManager;
import com.nytimes.android.utils.SaveOrigin;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SaveMenuHelper {
    private final Activity a;
    private final SavedManager b;
    private final a c;
    private final SaveHandler d;

    public SaveMenuHelper(Activity activity, SavedManager savedManager, a aVar, SaveHandler saveHandler) {
        zq3.h(activity, "activity");
        zq3.h(savedManager, "savedManager");
        zq3.h(aVar, "eCommClient");
        zq3.h(saveHandler, "saveHandler");
        this.a = activity;
        this.b = savedManager;
        this.c = aVar;
        this.d = saveHandler;
    }

    private final boolean e(Asset asset) {
        return this.c.q() && this.b.isSaved(asset.getUrl());
    }

    private final boolean g(ArticleFragmentType articleFragmentType, Asset asset) {
        return asset != null && (articleFragmentType == ArticleFragmentType.HYBRID || (articleFragmentType == ArticleFragmentType.WEB && (asset instanceof InteractiveAsset)));
    }

    public final void b(Asset asset) {
        if (asset == null) {
            return;
        }
        this.d.o(asset, SaveOrigin.ARTICLE_FRONT, new ss2() { // from class: com.nytimes.android.menu.SaveMenuHelper$handleSave$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                Activity activity;
                activity = SaveMenuHelper.this.a;
                activity.invalidateOptionsMenu();
            }
        });
    }

    public final void c(Asset asset) {
        zq3.h(asset, "asset");
        if (this.b.isSavedAfterLoginAsset(asset.getSafeUri()) && this.c.q()) {
            b(asset);
        }
    }

    public final void d(Asset asset) {
        if (asset == null) {
            return;
        }
        this.d.v(asset, SaveOrigin.ARTICLE_FRONT, new ss2() { // from class: com.nytimes.android.menu.SaveMenuHelper$handleUnsave$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                Activity activity;
                activity = SaveMenuHelper.this.a;
                activity.invalidateOptionsMenu();
            }
        });
    }

    public final boolean f(ArticleFragmentType articleFragmentType, Asset asset) {
        if (g(articleFragmentType, asset)) {
            zq3.e(asset);
            if (!e(asset)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(ArticleFragmentType articleFragmentType, Asset asset) {
        if (g(articleFragmentType, asset)) {
            zq3.e(asset);
            if (e(asset)) {
                return true;
            }
        }
        return false;
    }
}
