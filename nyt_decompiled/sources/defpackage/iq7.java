package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.preference.g;
import java.io.File;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class iq7 {
    public static final iq7 a = new iq7();

    private iq7() {
    }

    public final n01 a() {
        return new yg1();
    }

    public final OkHttpClient b(Application application) {
        zq3.h(application, "context");
        OkHttpClient.Builder newBuilder = new OkHttpClient().newBuilder();
        File cacheDir = application.getCacheDir();
        zq3.g(cacheDir, "getCacheDir(...)");
        return newBuilder.cache(new Cache(cacheDir, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)).build();
    }

    public final SharedPreferences c(Application application) {
        zq3.h(application, "context");
        return g.b(application);
    }
}
