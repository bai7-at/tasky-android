package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface mxf {
    void a(int i, int i2, int i3, long j, int i4);

    void b(Surface surface);

    void c(int i, int i2, j7f j7fVar, long j, int i3);

    void d(int i);

    void e(int i, boolean z);

    int f(MediaCodec.BufferInfo bufferInfo);

    void y(Bundle bundle);

    int zza();

    MediaFormat zzc();

    ByteBuffer zzf(int i);

    ByteBuffer zzg(int i);

    void zzi();

    void zzl();

    void zzm(int i, long j);
}
