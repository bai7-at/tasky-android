package defpackage;

import com.google.android.gms.internal.ads.zzds;

/* loaded from: classes3.dex */
public final class uvc extends lsc {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e7->B:43:0x00e9, LOOP_START, PHI: r0
      0x00e7: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003d, B:43:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.grc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvc.a(java.nio.ByteBuffer):void");
    }

    @Override // defpackage.lsc
    public final cpc c(cpc cpcVar) {
        int i = cpcVar.c;
        if (i != 3) {
            if (i == 2) {
                return cpc.e;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new zzds("Unhandled input format:", cpcVar);
            }
        }
        return new cpc(cpcVar.a, cpcVar.b, 2);
    }
}
