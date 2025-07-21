package defpackage;

import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.recentlyviewed.RecentlyViewedModule;
import com.nytimes.android.recentlyviewed.RecentlyViewedParams;
import com.nytimes.android.recentlyviewed.room.AssetDatabase;

/* loaded from: classes4.dex */
public abstract class qs6 implements ba2 {
    public static RecentlyViewedManager a(AssetDatabase assetDatabase, RecentlyViewedParams recentlyViewedParams) {
        return (RecentlyViewedManager) g16.e(RecentlyViewedModule.a.b(assetDatabase, recentlyViewedParams));
    }
}
