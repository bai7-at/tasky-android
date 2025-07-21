package defpackage;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class kxf {
    public final pxf a;
    public final MediaFormat b;
    public final l6a c;
    public final Surface d;
    public final MediaCrypto e = null;

    private kxf(pxf pxfVar, MediaFormat mediaFormat, l6a l6aVar, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.a = pxfVar;
        this.b = mediaFormat;
        this.c = l6aVar;
        this.d = surface;
    }

    public static kxf a(pxf pxfVar, MediaFormat mediaFormat, l6a l6aVar, MediaCrypto mediaCrypto) {
        return new kxf(pxfVar, mediaFormat, l6aVar, null, null, 0);
    }

    public static kxf b(pxf pxfVar, MediaFormat mediaFormat, l6a l6aVar, Surface surface, MediaCrypto mediaCrypto) {
        return new kxf(pxfVar, mediaFormat, l6aVar, surface, null, 0);
    }
}
