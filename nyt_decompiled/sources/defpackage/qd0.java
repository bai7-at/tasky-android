package defpackage;

import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* loaded from: classes5.dex */
public interface qd0 extends yt7, WritableByteChannel {
    qd0 D0(int i);

    qd0 F(int i);

    long I0(px7 px7Var);

    qd0 O();

    qd0 V(String str);

    qd0 Z0(long j);

    qd0 b0(String str, int i, int i2);

    qd0 e();

    @Override // defpackage.yt7, java.io.Flushable
    void flush();

    ad0 g();

    qd0 j0(byte[] bArr);

    qd0 m1(ByteString byteString);

    qd0 p(byte[] bArr, int i, int i2);

    qd0 p0(long j);

    qd0 x0(int i);
}
