package defpackage;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class ftf extends lsc {
    private int[] i;
    private int[] j;

    ftf() {
    }

    @Override // defpackage.grc
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer d = d(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                d.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        d.flip();
    }

    @Override // defpackage.lsc
    public final cpc c(cpc cpcVar) {
        int[] iArr = this.i;
        if (iArr == null) {
            return cpc.e;
        }
        if (cpcVar.c != 2) {
            throw new zzds("Unhandled input format:", cpcVar);
        }
        boolean z = cpcVar.b != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new cpc(cpcVar.a, length, 2) : cpc.e;
            }
            int i2 = iArr[i];
            if (i2 >= cpcVar.b) {
                throw new zzds("Unhandled input format:", cpcVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // defpackage.lsc
    protected final void e() {
        this.j = this.i;
    }

    @Override // defpackage.lsc
    protected final void g() {
        this.j = null;
        this.i = null;
    }

    public final void i(int[] iArr) {
        this.i = iArr;
    }
}
