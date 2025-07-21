package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.amazonaws.event.ProgressEvent;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q8a implements nv9 {
    public static final fw9 l = new fw9() { // from class: o8a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new q8a()};
        }
    };
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private m8a i;
    private sv9 j;
    private boolean k;
    private final pfe a = new pfe(0);
    private final b9e c = new b9e(ProgressEvent.PART_FAILED_EVENT_CODE);
    private final SparseArray b = new SparseArray();
    private final n8a d = new n8a();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    @Override // defpackage.nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(long r5, long r7) {
        /*
            r4 = this;
            pfe r5 = r4.a
            long r0 = r5.f()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.d()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.i(r7)
        L24:
            m8a r5 = r4.i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.d(r7)
        L2c:
            android.util.SparseArray r5 = r4.b
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.b
            java.lang.Object r5 = r5.valueAt(r6)
            p8a r5 = (defpackage.p8a) r5
            r5.b()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8a.k(long, long):void");
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        byte[] bArr = new byte[14];
        bv9 bv9Var = (bv9) ov9Var;
        bv9Var.d(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bv9Var.k(bArr[13] & 7, false);
        bv9Var.d(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.j = sv9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    @Override // defpackage.nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(defpackage.ov9 r17, defpackage.cx9 r18) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8a.n(ov9, cx9):int");
    }
}
