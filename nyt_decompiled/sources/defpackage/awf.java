package defpackage;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class awf extends lsc {
    private static final int i = Float.floatToIntBits(Float.NaN);

    awf() {
    }

    private static void i(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.grc
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer d;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 21) {
            d = d((i2 / 3) * 4);
            while (position < limit) {
                i(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), d);
                position += 3;
            }
        } else if (i3 == 22) {
            d = d(i2);
            while (position < limit) {
                int i4 = byteBuffer.get(position) & 255;
                int i5 = (byteBuffer.get(position + 1) & 255) << 8;
                i(i4 | i5 | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), d);
                position += 4;
            }
        } else if (i3 == 1342177280) {
            d = d((i2 / 3) * 4);
            while (position < limit) {
                i(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), d);
                position += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            d = d(i2);
            while (position < limit) {
                int i6 = byteBuffer.get(position + 3) & 255;
                int i7 = (byteBuffer.get(position + 2) & 255) << 8;
                i(i6 | i7 | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), d);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        d.flip();
    }

    @Override // defpackage.lsc
    public final cpc c(cpc cpcVar) {
        int i2 = cpcVar.c;
        int i3 = khe.a;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736) {
            return new cpc(cpcVar.a, cpcVar.b, 4);
        }
        if (i2 == 4) {
            return cpc.e;
        }
        throw new zzds("Unhandled input format:", cpcVar);
    }
}
