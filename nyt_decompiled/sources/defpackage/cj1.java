package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.e;
import com.google.android.exoplayer2.mediacodec.h;
import com.google.android.exoplayer2.mediacodec.j;
import com.google.android.exoplayer2.mediacodec.l;
import com.google.android.exoplayer2.metadata.a;
import com.google.android.exoplayer2.z1;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class cj1 implements dx6 {
    private final Context a;
    private boolean e;
    private boolean g;
    private boolean h;
    private boolean i;
    private final h b = new h();
    private int c = 0;
    private long d = BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT;
    private l f = l.a;

    public cj1(Context context) {
        this.a = context;
    }

    @Override // defpackage.dx6
    public z1[] a(Handler handler, v89 v89Var, e eVar, jj8 jj8Var, xs4 xs4Var) {
        ArrayList arrayList = new ArrayList();
        h(this.a, this.c, this.f, this.e, handler, v89Var, this.d, arrayList);
        AudioSink c = c(this.a, this.g, this.h, this.i);
        if (c != null) {
            b(this.a, this.c, this.f, this.e, c, handler, eVar, arrayList);
        }
        g(this.a, jj8Var, handler.getLooper(), this.c, arrayList);
        e(this.a, xs4Var, handler.getLooper(), this.c, arrayList);
        d(this.a, this.c, arrayList);
        f(this.a, handler, this.c, arrayList);
        return (z1[]) arrayList.toArray(new z1[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:14|15|16|17|18|19|(2:20|21)|22|23|24|25|26|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        r2 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void b(android.content.Context r17, int r18, com.google.android.exoplayer2.mediacodec.l r19, boolean r20, com.google.android.exoplayer2.audio.AudioSink r21, android.os.Handler r22, com.google.android.exoplayer2.audio.e r23, java.util.ArrayList r24) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj1.b(android.content.Context, int, com.google.android.exoplayer2.mediacodec.l, boolean, com.google.android.exoplayer2.audio.AudioSink, android.os.Handler, com.google.android.exoplayer2.audio.e, java.util.ArrayList):void");
    }

    protected AudioSink c(Context context, boolean z, boolean z2, boolean z3) {
        return new DefaultAudioSink.f(context).i(z).h(z2).j(z3 ? 1 : 0).g();
    }

    protected void d(Context context, int i, ArrayList arrayList) {
        arrayList.add(new gh0());
    }

    protected void e(Context context, xs4 xs4Var, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new a(xs4Var, looper));
    }

    protected void f(Context context, Handler handler, int i, ArrayList arrayList) {
    }

    protected void g(Context context, jj8 jj8Var, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new qj8(jj8Var, looper));
    }

    protected void h(Context context, int i, l lVar, boolean z, Handler handler, v89 v89Var, long j, ArrayList arrayList) {
        Handler handler2;
        Class cls;
        String str;
        int i2;
        arrayList.add(new uh4(context, i(), lVar, j, z, handler, v89Var, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                handler2 = handler;
                cls = Handler.class;
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (z1) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, v89.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, v89Var, 50));
                        str = "DefaultRenderersFactory";
                        try {
                            a84.g(str, "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i2;
                            i2 = size;
                            arrayList.add(i2, (z1) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, v89.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, v89Var, 50));
                            a84.g(str, "Loaded Libgav1VideoRenderer.");
                        }
                    } catch (ClassNotFoundException unused2) {
                        str = "DefaultRenderersFactory";
                    }
                } catch (ClassNotFoundException unused3) {
                    str = "DefaultRenderersFactory";
                    i2 = size;
                    arrayList.add(i2, (z1) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, v89.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, v89Var, 50));
                    a84.g(str, "Loaded Libgav1VideoRenderer.");
                }
            } catch (ClassNotFoundException unused4) {
                handler2 = handler;
                cls = Handler.class;
            }
            try {
                arrayList.add(i2, (z1) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, v89.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, v89Var, 50));
                a84.g(str, "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating AV1 extension", e);
            }
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating VP9 extension", e2);
        }
    }

    protected j.b i() {
        return this.b;
    }
}
