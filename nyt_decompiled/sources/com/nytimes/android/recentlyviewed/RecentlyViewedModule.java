package com.nytimes.android.recentlyviewed;

import android.app.Application;
import android.content.Context;
import androidx.room.f;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingSimpleItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.recentlyviewed.room.AssetDatabase;
import defpackage.b04;
import defpackage.hs;
import defpackage.hu4;
import defpackage.wn1;
import defpackage.yn1;
import defpackage.zq3;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class RecentlyViewedModule {
    public static final RecentlyViewedModule a = new RecentlyViewedModule();

    private RecentlyViewedModule() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wn1 a(b04 b04Var) {
        DevSettingSwitchItem a2;
        zq3.h(b04Var, "recentlyViewedManager");
        a2 = DevSettingSwitchItemKt.a("UNFEAR", (r23 & 2) != 0 ? null : "UNFEAR Recently Viewed", (r23 & 4) != 0 ? null : "Legacy Recently Viewed", "beta_recently_viewed_unfear_enabled", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "UNFEAR" : null, (r23 & 512) != 0 ? null : null);
        String str = "Clear History";
        String str2 = "Clear list of read articles.";
        return new DevSettingGroupExpandable("Recently Viewed", i.o(a2, new DevSettingSimpleItem(str, str2, new RecentlyViewedModule$provideDevSettingItem$1(b04Var, null), null, null, null, null, false, 248, null)), null, false, yn1.c.b, 0 == true ? 1 : 0, false, false, 236, null);
    }

    public final RecentlyViewedManager b(AssetDatabase assetDatabase, RecentlyViewedParams recentlyViewedParams) {
        zq3.h(assetDatabase, "assetDatabase");
        zq3.h(recentlyViewedParams, "recentlyViewedParams");
        hs d = assetDatabase.d();
        Scheduler io2 = Schedulers.io();
        zq3.g(io2, "io(...)");
        return new RecentlyViewedManager(d, recentlyViewedParams, io2);
    }

    public final AssetDatabase c(Application application) {
        zq3.h(application, "application");
        Context applicationContext = application.getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        return (AssetDatabase) f.a(applicationContext, AssetDatabase.class, "recently-viewed").b(hu4.a, hu4.b, hu4.c, hu4.d, hu4.e, hu4.f).d();
    }
}
