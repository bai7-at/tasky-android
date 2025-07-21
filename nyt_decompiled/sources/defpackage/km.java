package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class km extends ls7 {
    private static Metadata c(xo5 xo5Var) {
        xo5Var.r(12);
        int d = (xo5Var.d() + xo5Var.h(12)) - 4;
        xo5Var.r(44);
        xo5Var.s(xo5Var.h(12));
        xo5Var.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (xo5Var.d() >= d) {
                break;
            }
            xo5Var.r(48);
            int h = xo5Var.h(8);
            xo5Var.r(4);
            int d2 = xo5Var.d() + xo5Var.h(12);
            String str2 = null;
            while (xo5Var.d() < d2) {
                int h2 = xo5Var.h(8);
                int h3 = xo5Var.h(8);
                int d3 = xo5Var.d() + h3;
                if (h2 == 2) {
                    int h4 = xo5Var.h(16);
                    xo5Var.r(8);
                    if (h4 == 3) {
                        while (xo5Var.d() < d3) {
                            str = xo5Var.l(xo5Var.h(8), zj0.a);
                            int h5 = xo5Var.h(8);
                            for (int i = 0; i < h5; i++) {
                                xo5Var.s(xo5Var.h(8));
                            }
                        }
                    }
                } else if (h2 == 21) {
                    str2 = xo5Var.l(h3, zj0.a);
                }
                xo5Var.p(d3 * 8);
            }
            xo5Var.p(d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // defpackage.ls7
    protected Metadata b(ts4 ts4Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new xo5(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
