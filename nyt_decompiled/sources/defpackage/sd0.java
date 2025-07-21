package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* loaded from: classes5.dex */
public interface sd0 extends px7, ReadableByteChannel {
    byte[] B0();

    boolean C0();

    long J(ByteString byteString);

    long J0();

    long M(byte b, long j, long j2);

    long N(ByteString byteString);

    String Q(long j);

    long S0(yt7 yt7Var);

    String V0(Charset charset);

    boolean W(long j, ByteString byteString);

    ByteString a1();

    int f1();

    ad0 g();

    String g0();

    byte[] i0(long j);

    String i1();

    short k0();

    long l0();

    void o0(long j);

    sd0 peek();

    void r0(ad0 ad0Var, long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    String s0(long j);

    long s1();

    void skip(long j);

    InputStream t1();

    ByteString u0(long j);

    int y0(tk5 tk5Var);

    ad0 z();
}
