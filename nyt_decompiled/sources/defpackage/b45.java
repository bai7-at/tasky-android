package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.nytimes.android.internal.cms.CmsEnvironment;
import com.nytimes.android.network.NetworkModule;

/* loaded from: classes4.dex */
public abstract class b45 implements ba2 {
    public static CmsEnvironment a(Resources resources, SharedPreferences sharedPreferences) {
        return (CmsEnvironment) g16.e(NetworkModule.a.d(resources, sharedPreferences));
    }
}
