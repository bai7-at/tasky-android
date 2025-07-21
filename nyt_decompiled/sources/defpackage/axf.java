package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* loaded from: classes3.dex */
public final class axf implements lxf {
    private final fhe b;
    private final fhe c;
    private boolean d;

    public axf(int i) {
        ywf ywfVar = new ywf(i);
        zwf zwfVar = new zwf(i);
        this.b = ywfVar;
        this.c = zwfVar;
        this.d = true;
    }

    static /* synthetic */ HandlerThread a(int i) {
        String j;
        j = cxf.j(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(j);
    }

    static /* synthetic */ HandlerThread b(int i) {
        String j;
        j = cxf.j(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [bxf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cxf] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final cxf c(kxf kxfVar) {
        MediaCodec mediaCodec;
        nxf gxfVar;
        int i;
        cxf cxfVar;
        String str = kxfVar.a.a;
        ?? r1 = 0;
        r1 = 0;
        try {
            int i2 = khe.a;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            if (this.d) {
                l6a l6aVar = kxfVar.c;
                if (khe.a >= 34 && qcb.h(l6aVar.l)) {
                    gxfVar = new lyf(mediaCodec);
                    i = 4;
                    cxfVar = new cxf(mediaCodec, a(((ywf) this.b).a), gxfVar, r1);
                    Trace.endSection();
                    cxf.i(cxfVar, kxfVar.b, kxfVar.d, null, i);
                    return cxfVar;
                }
            }
            Trace.endSection();
            cxf.i(cxfVar, kxfVar.b, kxfVar.d, null, i);
            return cxfVar;
        } catch (Exception e3) {
            e = e3;
            r1 = cxfVar;
            if (r1 != 0) {
                r1.zzl();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
        gxfVar = new gxf(mediaCodec, b(((zwf) this.c).a));
        i = 0;
        cxfVar = new cxf(mediaCodec, a(((ywf) this.b).a), gxfVar, r1);
    }

    public final void d(boolean z) {
        this.d = true;
    }
}
