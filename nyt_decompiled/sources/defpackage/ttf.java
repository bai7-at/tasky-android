package defpackage;

import android.media.AudioTrack;

/* loaded from: classes3.dex */
abstract class ttf {
    public static void a(AudioTrack audioTrack, xtf xtfVar) {
        audioTrack.setPreferredDevice(xtfVar == null ? null : xtfVar.a);
    }
}
