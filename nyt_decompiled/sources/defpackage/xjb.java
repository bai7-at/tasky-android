package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class xjb {
    private long a;

    public final long a(ByteBuffer byteBuffer) {
        rca rcaVar;
        qca qcaVar;
        long j = this.a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it2 = new mca(new wjb(duplicate), zjb.c).i().iterator();
            while (true) {
                rcaVar = null;
                if (!it2.hasNext()) {
                    qcaVar = null;
                    break;
                }
                oca ocaVar = (oca) it2.next();
                if (ocaVar instanceof qca) {
                    qcaVar = (qca) ocaVar;
                    break;
                }
            }
            Iterator it3 = qcaVar.i().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                oca ocaVar2 = (oca) it3.next();
                if (ocaVar2 instanceof rca) {
                    rcaVar = (rca) ocaVar2;
                    break;
                }
            }
            long h = (rcaVar.h() * 1000) / rcaVar.i();
            this.a = h;
            return h;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
