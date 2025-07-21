package defpackage;

import android.app.Application;
import com.nytimes.android.recentlyviewed.RecentlyViewedModule;
import com.nytimes.android.recentlyviewed.room.AssetDatabase;

/* loaded from: classes4.dex */
public abstract class rs6 implements ba2 {
    public static AssetDatabase a(Application application) {
        return (AssetDatabase) g16.e(RecentlyViewedModule.a.c(application));
    }
}
