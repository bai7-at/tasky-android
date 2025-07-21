package defpackage;

import android.media.MediaCodec;

/* loaded from: classes3.dex */
final class h7f {
    private final MediaCodec.CryptoInfo a;
    private final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    static /* bridge */ /* synthetic */ void a(h7f h7fVar, int i, int i2) {
        h7fVar.b.set(i, i2);
        h7fVar.a.setPattern(h7fVar.b);
    }
}
