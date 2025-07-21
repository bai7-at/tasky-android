package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i9a implements nv9 {
    public static final fw9 r = new fw9() { // from class: f9a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new i9a(1, 1, r4a.a, new pfe(0L), new j7a(0), 112800)};
        }
    };
    private final List a;
    private final b9e b = new b9e(new byte[9400], 0);
    private final SparseIntArray c;
    private final l9a d;
    private final r4a e;
    private final SparseArray f;
    private final SparseBooleanArray g;
    private final SparseBooleanArray h;
    private final e9a i;
    private d9a j;
    private sv9 k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;

    public i9a(int i, int i2, r4a r4aVar, pfe pfeVar, l9a l9aVar, int i3) {
        this.d = l9aVar;
        this.e = r4aVar;
        this.a = Collections.singletonList(pfeVar);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.c = new SparseIntArray();
        this.i = new e9a(112800);
        this.k = sv9.R;
        this.q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f.put(sparseArray2.keyAt(i4), (n9a) sparseArray2.valueAt(i4));
        }
        this.f.put(0, new s8a(new g9a(this)));
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        d9a d9aVar;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            pfe pfeVar = (pfe) this.a.get(i);
            if (pfeVar.f() != -9223372036854775807L) {
                long d = pfeVar.d();
                if (d != -9223372036854775807L) {
                    if (d != 0) {
                        if (d == j2) {
                        }
                    }
                }
            }
            pfeVar.i(j2);
        }
        if (j2 != 0 && (d9aVar = this.j) != null) {
            d9aVar.d(j2);
        }
        this.b.h(0);
        this.c.clear();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((n9a) this.f.valueAt(i2)).zzc();
        }
        this.p = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r0 = r0 + 1;
     */
    @Override // defpackage.nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(defpackage.ov9 r6) {
        /*
            r5 = this;
            b9e r5 = r5.b
            byte[] r5 = r5.m()
            bv9 r6 = (defpackage.bv9) r6
            r0 = 940(0x3ac, float:1.317E-42)
            r1 = 0
            r6.d(r5, r1, r0, r1)
            r0 = r1
        Lf:
            r2 = 188(0xbc, float:2.63E-43)
            if (r0 >= r2) goto L2b
            r2 = r1
        L14:
            r3 = 5
            if (r2 >= r3) goto L26
            int r3 = r2 * 188
            int r3 = r3 + r0
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L23
            int r0 = r0 + 1
            goto Lf
        L23:
            int r2 = r2 + 1
            goto L14
        L26:
            r6.l(r0, r1)
            r5 = 1
            return r5
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i9a.l(ov9):boolean");
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.k = sv9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b3, code lost:
    
        if (r1 == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // defpackage.nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(defpackage.ov9 r19, defpackage.cx9 r20) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i9a.n(ov9, cx9):int");
    }
}
