package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes2.dex */
public final class iu9 {
    private boolean a = false;
    private float b = 1.0f;

    public static float b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(AssetConstants.AUDIO_TYPE);
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    private final synchronized boolean f() {
        return this.b >= 0.0f;
    }

    public final synchronized float a() {
        if (!f()) {
            return 1.0f;
        }
        return this.b;
    }

    public final synchronized void c(boolean z) {
        this.a = z;
    }

    public final synchronized void d(float f) {
        this.b = f;
    }

    public final synchronized boolean e() {
        return this.a;
    }
}
