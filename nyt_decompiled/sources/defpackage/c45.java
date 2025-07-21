package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.nytimes.android.network.NetworkModule;

/* loaded from: classes4.dex */
public abstract class c45 implements ba2 {
    public static so1 a(boolean z, Application application, SharedPreferences sharedPreferences) {
        return (so1) g16.e(NetworkModule.a.e(z, application, sharedPreferences));
    }
}
