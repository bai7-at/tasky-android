package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import com.nytimes.android.api.cms.AssetConstants;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class m5g {
    private final Spatializer a;
    private final boolean b;
    private Handler c;
    private Spatializer$OnSpatializerStateChangedListener d;

    private m5g(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.a = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.b = immersiveAudioLevel != 0;
    }

    public static m5g a(Context context) {
        Spatializer spatializer;
        AudioManager audioManager = (AudioManager) context.getSystemService(AssetConstants.AUDIO_TYPE);
        if (audioManager == null) {
            return null;
        }
        spatializer = audioManager.getSpatializer();
        return new m5g(spatializer);
    }

    public final void b(k6g k6gVar, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new k5g(this, k6gVar);
            final Handler handler = new Handler(looper);
            this.c = handler;
            Spatializer spatializer = this.a;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: i5g
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.d);
        }
    }

    public final void c() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.d;
        if (spatializer$OnSpatializerStateChangedListener == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        Handler handler = this.c;
        int i = khe.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }

    public final boolean d(waf wafVar, l6a l6aVar) {
        boolean canBeSpatialized;
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(khe.v(("audio/eac3-joc".equals(l6aVar.l) && l6aVar.y == 16) ? 12 : l6aVar.y));
        int i = l6aVar.z;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        canBeSpatialized = this.a.canBeSpatialized(wafVar.a().a, channelMask.build());
        return canBeSpatialized;
    }

    public final boolean e() {
        boolean isAvailable;
        isAvailable = this.a.isAvailable();
        return isAvailable;
    }

    public final boolean f() {
        boolean isEnabled;
        isEnabled = this.a.isEnabled();
        return isEnabled;
    }

    public final boolean g() {
        return this.b;
    }
}
