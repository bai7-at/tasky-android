package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes3.dex */
abstract class htf {
    public static wpf a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return wpf.d;
        }
        qpf qpfVar = new qpf();
        qpfVar.a(true);
        qpfVar.c(z);
        return qpfVar.d();
    }
}
