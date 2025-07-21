package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* loaded from: classes2.dex */
public interface l {
    public static final l a = new l() { // from class: th4
        @Override // com.google.android.exoplayer2.mediacodec.l
        public final List a(String str, boolean z, boolean z2) {
            return MediaCodecUtil.t(str, z, z2);
        }
    };

    List a(String str, boolean z, boolean z2);
}
