package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzcc;

/* loaded from: classes3.dex */
abstract class x9a {
    public static Pair a(ov9 ov9Var) {
        ov9Var.zzj();
        w9a d = d(1684108385, ov9Var, new b9e(8));
        ((bv9) ov9Var).l(8, false);
        return Pair.create(Long.valueOf(ov9Var.zzf()), Long.valueOf(d.b));
    }

    public static v9a b(ov9 ov9Var) {
        byte[] bArr;
        b9e b9eVar = new b9e(16);
        w9a d = d(1718449184, ov9Var, b9eVar);
        wad.f(d.b >= 16);
        bv9 bv9Var = (bv9) ov9Var;
        bv9Var.d(b9eVar.m(), 0, 16, false);
        b9eVar.k(0);
        int z = b9eVar.z();
        int z2 = b9eVar.z();
        int y = b9eVar.y();
        int y2 = b9eVar.y();
        int z3 = b9eVar.z();
        int z4 = b9eVar.z();
        int i = ((int) d.b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            bv9Var.d(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = khe.f;
        }
        ((bv9) ov9Var).l((int) (ov9Var.zze() - ov9Var.zzf()), false);
        return new v9a(z, z2, y, y2, z3, z4, bArr);
    }

    public static boolean c(ov9 ov9Var) {
        b9e b9eVar = new b9e(8);
        int i = w9a.a(ov9Var, b9eVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((bv9) ov9Var).d(b9eVar.m(), 0, 4, false);
        b9eVar.k(0);
        int v = b9eVar.v();
        if (v == 1463899717) {
            return true;
        }
        ezd.c("WavHeaderReader", "Unsupported form type: " + v);
        return false;
    }

    private static w9a d(int i, ov9 ov9Var, b9e b9eVar) {
        w9a a = w9a.a(ov9Var, b9eVar);
        while (true) {
            int i2 = a.a;
            if (i2 == i) {
                return a;
            }
            ezd.f("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = a.b + 8;
            if (j > 2147483647L) {
                throw zzcc.c("Chunk is too large (~2GB+) to skip; id: " + a.a);
            }
            ((bv9) ov9Var).l((int) j, false);
            a = w9a.a(ov9Var, b9eVar);
        }
    }
}
