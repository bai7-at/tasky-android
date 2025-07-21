package com.nytimes.android.subauth.devsettings.purr.directive;

import android.content.Context;
import android.widget.Toast;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingSimpleItem;
import com.nytimes.android.subauth.core.purr.a;
import defpackage.gt2;
import defpackage.r41;
import defpackage.un1;
import defpackage.ww8;
import defpackage.zn1;
import defpackage.zq3;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class PurrCacheDevSettings {
    public static final PurrCacheDevSettings a = new PurrCacheDevSettings();
    private static final Long[] b = {0L, 5L, 10L, 30L, 60L, 21600L};
    public static final int c = 8;

    private PurrCacheDevSettings() {
    }

    private final zn1 d(long j) {
        return new zn1(String.valueOf(j), a(j), null, false, 12, null);
    }

    public final String a(long j) {
        if (j == 21600) {
            return "No Override (Default is 6 hours)";
        }
        if (j < 60) {
            return j + " Seconds";
        }
        if (j < 3600) {
            return (j / 60) + " Minutes";
        }
        return (j / 3600) + " Hours";
    }

    public final un1 b(a aVar, String str) {
        zq3.h(aVar, "purrManager");
        return new DevSettingSimpleItem("Clear local PURR cache", null, new PurrCacheDevSettings$purrClearCacheDevSetting$1(aVar, null), null, null, r41.a.a(), str == null ? "Clear local PURR cache" : str, false, 154, null);
    }

    public final un1 c(Context context, final a aVar, String str) {
        zq3.h(context, "context");
        zq3.h(aVar, "purrManager");
        Long[] lArr = b;
        ArrayList arrayList = new ArrayList(lArr.length);
        for (Long l : lArr) {
            arrayList.add(a.d(l.longValue()));
        }
        return new DevSettingChoiceListPreferenceItem("Purr Directive Cache Lifetime", "Purr.Directives.CacheTTL.BetaSetting", arrayList, d(21600L), new gt2() { // from class: com.nytimes.android.subauth.devsettings.purr.directive.PurrCacheDevSettings$purrOverrideCacheLifetimeDevSetting$2
            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                zq3.h(context2, "itemContext");
                zq3.h(zn1Var, "item");
                a.this.u(Integer.parseInt(zn1Var.getPrefValue()));
                Toast.makeText(context2, "Reset PURR cache lifetime to " + zn1Var.getTitle(), 1).show();
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, r41.a.a(), str == null ? "Purr Directive Cache Lifetime" : str, false, false, 384, null).j(context);
    }
}
