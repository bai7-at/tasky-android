package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u9a implements nv9 {
    public static final fw9 h = new fw9() { // from class: q9a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new u9a()};
        }
    };
    private sv9 a;
    private tx9 b;
    private s9a e;
    private int c = 0;
    private long d = -1;
    private int f = -1;
    private long g = -1;

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        s9a s9aVar = this.e;
        if (s9aVar != null) {
            s9aVar.b(j2);
        }
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        return x9a.c(ov9Var);
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.a = sv9Var;
        this.b = sv9Var.zzw(0, 1);
        sv9Var.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r2 == 32) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    @Override // defpackage.nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(defpackage.ov9 r19, defpackage.cx9 r20) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9a.n(ov9, cx9):int");
    }
}
