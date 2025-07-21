package defpackage;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class kca implements lca {
    private static final Logger b = Logger.getLogger(kca.class.getName());
    final ThreadLocal a = new jca(this);

    @Override // defpackage.lca
    public final oca a(d3f d3fVar, pca pcaVar) {
        int r1;
        long zzc;
        long zzb = d3fVar.zzb();
        ((ByteBuffer) this.a.get()).rewind().limit(8);
        do {
            r1 = d3fVar.r1((ByteBuffer) this.a.get());
            if (r1 == 8) {
                ((ByteBuffer) this.a.get()).rewind();
                long e = nca.e((ByteBuffer) this.a.get());
                byte[] bArr = null;
                if (e < 8 && e > 1) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (e == 1) {
                        ((ByteBuffer) this.a.get()).limit(16);
                        d3fVar.r1((ByteBuffer) this.a.get());
                        ((ByteBuffer) this.a.get()).position(8);
                        zzc = nca.f((ByteBuffer) this.a.get()) - 16;
                    } else {
                        zzc = e == 0 ? d3fVar.zzc() - d3fVar.zzb() : e - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.a.get()).limit(((ByteBuffer) this.a.get()).limit() + 16);
                        d3fVar.r1((ByteBuffer) this.a.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.a.get()).position() - 16; position < ((ByteBuffer) this.a.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.a.get()).position() - 16)] = ((ByteBuffer) this.a.get()).get(position);
                        }
                        zzc -= 16;
                    }
                    long j = zzc;
                    oca b2 = b(str, bArr, pcaVar instanceof oca ? ((oca) pcaVar).zza() : "");
                    b2.b(pcaVar);
                    ((ByteBuffer) this.a.get()).rewind();
                    b2.d(d3fVar, (ByteBuffer) this.a.get(), j, this);
                    return b2;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } while (r1 >= 0);
        d3fVar.f(zzb);
        throw new EOFException();
    }

    public abstract oca b(String str, byte[] bArr, String str2);
}
