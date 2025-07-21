package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes3.dex */
abstract class jtf {
    public static wpf a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return wpf.d;
        }
        qpf qpfVar = new qpf();
        boolean z2 = false;
        if (khe.a > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        }
        qpfVar.a(true);
        qpfVar.b(z2);
        qpfVar.c(z);
        return qpfVar.d();
    }
}
