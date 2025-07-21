package defpackage;

import android.media.AudioTrack;

/* loaded from: classes3.dex */
final class fvf extends AudioTrack.StreamEventCallback {
    final /* synthetic */ lvf a;
    final /* synthetic */ hvf b;

    fvf(hvf hvfVar, lvf lvfVar) {
        this.a = lvfVar;
        this.b = hvfVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        wrf wrfVar;
        boolean z;
        wrf wrfVar2;
        audioTrack2 = this.b.c.q;
        if (audioTrack.equals(audioTrack2)) {
            lvf lvfVar = this.b.c;
            wrfVar = lvfVar.m;
            if (wrfVar != null) {
                z = lvfVar.L;
                if (z) {
                    wrfVar2 = lvfVar.m;
                    wrfVar2.zzb();
                }
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        wrf wrfVar;
        boolean z;
        wrf wrfVar2;
        audioTrack2 = this.b.c.q;
        if (audioTrack.equals(audioTrack2)) {
            lvf lvfVar = this.b.c;
            wrfVar = lvfVar.m;
            if (wrfVar != null) {
                z = lvfVar.L;
                if (z) {
                    wrfVar2 = lvfVar.m;
                    wrfVar2.zzb();
                }
            }
        }
    }
}
