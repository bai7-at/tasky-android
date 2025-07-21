package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupData;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class f33 {
    public static final y25 a() {
        return new y25("https://www.nytimes.com/spotlight/the-great-read", AssetConstants.ARTICLE_TYPE, "", "", "", false, false, null, null, NavigationSource.XPN_CTA, null, "view more great reads", "great reads panel", null, null, "view more", null, null, null, 483584, null);
    }

    public static final y25 b(GreatReadsLockupData greatReadsLockupData, int i) {
        zq3.h(greatReadsLockupData, "<this>");
        String d = greatReadsLockupData.d();
        String c = greatReadsLockupData.c();
        if (c == null) {
            c = "";
        }
        return new y25(d, AssetConstants.ARTICLE_TYPE, c, greatReadsLockupData.b(), greatReadsLockupData.b(), false, false, null, null, NavigationSource.XPN_PANEL, null, null, "great reads panel", null, null, null, greatReadsLockupData.i(), t.f(du8.a("index", 0)), t.f(du8.a("index", Integer.valueOf(i))), 57600, null);
    }
}
