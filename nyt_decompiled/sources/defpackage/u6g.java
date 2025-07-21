package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class u6g extends a7g {
    private s6g c;

    @Override // defpackage.a7g
    public final c7g e(zff[] zffVarArr, z2g z2gVar, zzf zzfVar, n1c n1cVar) {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        v3c[][] v3cVarArr = new v3c[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = z2gVar.a;
            v3cVarArr[i] = new v3c[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zffVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < z2gVar.a) {
            v3c b = z2gVar.b(i5);
            int i6 = b.c;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zff zffVar = zffVarArr[i8];
                int i10 = 0;
                for (int i11 = 0; i11 <= 0; i11++) {
                    i10 = Math.max(i10, zffVar.y(b.b(i11)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = i10;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[1];
            } else {
                zff zffVar2 = zffVarArr[i7];
                int[] iArr5 = new int[1];
                for (int i12 = 0; i12 <= 0; i12++) {
                    iArr5[i12] = zffVar2.y(b.b(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i7];
            v3cVarArr[i7][i13] = b;
            iArr3[i7][i13] = iArr;
            iArr2[i7] = i13 + 1;
            i5++;
            i3 = 2;
        }
        z2g[] z2gVarArr = new z2g[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            z2gVarArr[i14] = new z2g((v3c[]) khe.l(v3cVarArr[i14], i15));
            iArr3[i14] = (int[][]) khe.l(iArr3[i14], i15);
            strArr[i14] = zffVarArr[i14].f();
            iArr6[i14] = zffVarArr[i14].b();
            i14++;
            i3 = 2;
        }
        int i16 = i3;
        s6g s6gVar = new s6g(strArr, iArr6, z2gVarArr, iArr4, iArr3, new z2g((v3c[]) khe.l(v3cVarArr[i16], iArr2[i16])));
        Pair j = j(s6gVar, iArr3, iArr4, zzfVar, n1cVar);
        w6g[] w6gVarArr = (w6g[]) j.second;
        List[] listArr = new List[w6gVarArr.length];
        for (int i17 = 0; i17 < w6gVarArr.length; i17++) {
            w6g w6gVar = w6gVarArr[i17];
            listArr[i17] = w6gVar != null ? zzgaa.u(w6gVar) : zzgaa.t();
        }
        h9 h9Var = new h9();
        int i18 = 0;
        for (int i19 = 2; i18 < i19; i19 = 2) {
            z2g d = s6gVar.d(i18);
            List list = listArr[i18];
            for (int i20 = 0; i20 < d.a; i20++) {
                v3c b2 = d.b(i20);
                boolean z4 = s6gVar.a(i18, i20, false) != 0;
                int i21 = b2.a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i22 = 0; i22 <= 0; i22++) {
                    iArr7[i22] = s6gVar.b(i18, i20, i22) & 7;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= list.size()) {
                            z = false;
                            break;
                        }
                        w6g w6gVar2 = (w6g) list.get(i23);
                        if (w6gVar2.zze().equals(b2) && w6gVar2.zzb(i22) != -1) {
                            z = true;
                            break;
                        }
                        i23++;
                    }
                    zArr[i22] = z;
                }
                h9Var.g(new hgc(b2, z4, iArr7, zArr));
            }
            i18++;
        }
        z2g e = s6gVar.e();
        for (int i24 = 0; i24 < e.a; i24++) {
            v3c b3 = e.b(i24);
            int i25 = b3.a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            h9Var.g(new hgc(b3, false, iArr8, new boolean[1]));
        }
        return new c7g((bgf[]) j.first, (o6g[]) j.second, new mhc(h9Var.j()), s6gVar);
    }

    @Override // defpackage.a7g
    public final void f(Object obj) {
        this.c = (s6g) obj;
    }

    protected abstract Pair j(s6g s6gVar, int[][][] iArr, int[] iArr2, zzf zzfVar, n1c n1cVar);
}
