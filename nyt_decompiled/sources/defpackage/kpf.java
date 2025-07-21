package defpackage;

import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgad;

/* loaded from: classes3.dex */
abstract class kpf {
    public static int a(int i, int i2, waf wafVar) {
        for (int i3 = 10; i3 > 0; i3--) {
            int v = khe.v(i3);
            if (v != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(v).build(), wafVar.a().a)) {
                return i3;
            }
        }
        return 0;
    }

    public static zzgaa<Integer> b(waf wafVar) {
        zzgad zzgadVar;
        h9 h9Var = new h9();
        zzgadVar = npf.e;
        yie g = zzgadVar.keySet().g();
        while (g.hasNext()) {
            Integer num = (Integer) g.next();
            int intValue = num.intValue();
            if (khe.a >= khe.u(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), wafVar.a().a)) {
                h9Var.g(num);
            }
        }
        h9Var.g(2);
        return h9Var.j();
    }
}
