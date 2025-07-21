package defpackage;

import android.net.Uri;

/* loaded from: classes3.dex */
public abstract class pab {
    private static final Uri a;
    public static final Uri b;
    public static final Uri c;

    static {
        Uri build = new Uri.Builder().scheme("content").appendPath("signals").build();
        a = build;
        b = build.buildUpon().authority("com.google.android.apps.tv.launcherx.ads.signals.AdsSignalsContentProvider").build();
        c = build.buildUpon().authority("com.google.android.tvrecommendations.ads.signals.AdsSignalsContentProvider").build();
    }
}
