package defpackage;

import android.media.MediaPlayer;

/* loaded from: classes3.dex */
final class nhb implements Runnable {
    final /* synthetic */ MediaPlayer a;
    final /* synthetic */ vhb b;

    nhb(vhb vhbVar, MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
        this.b = vhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        whb whbVar;
        whb whbVar2;
        vhb.K(this.b, this.a);
        vhb vhbVar = this.b;
        whbVar = vhbVar.s;
        if (whbVar != null) {
            whbVar2 = vhbVar.s;
            whbVar2.zzf();
        }
    }
}
