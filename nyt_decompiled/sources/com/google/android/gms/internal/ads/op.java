package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes3.dex */
final class op implements mp {
    private final int a;
    private MediaCodecInfo[] b;

    public op(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.a = i;
    }

    private final void c() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final int zza() {
        c();
        return this.b.length;
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final MediaCodecInfo zzb(int i) {
        c();
        return this.b[i];
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final boolean zze() {
        return true;
    }
}
