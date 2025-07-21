package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.nytimes.android.api.cms.AssetConstants;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class hld implements gqd {
    private final kke a;
    private final Context b;

    public hld(kke kkeVar, Context context) {
        this.a = kkeVar;
        this.b = context;
    }

    final /* synthetic */ ild a() {
        int i;
        int i2;
        AudioManager audioManager = (AudioManager) this.b.getSystemService(AssetConstants.AUDIO_TYPE);
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) pla.c().a(mpa.va)).booleanValue()) {
            i = dyf.s().i(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
            i2 = -1;
        }
        return new ild(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), dyf.t().a(), dyf.t().e());
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 13;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: gld
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hld.this.a();
            }
        });
    }
}
