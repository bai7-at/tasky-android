package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.internal.ads.zzfoj;

/* loaded from: classes3.dex */
public abstract class t9e {
    private static int a = 2;

    public static void a(Context context) {
        context.registerReceiver(new s9e(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int b() {
        if (p9e.a() != zzfoj.CTV) {
            return 2;
        }
        return a;
    }
}
