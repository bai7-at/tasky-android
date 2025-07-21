package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.File;

/* loaded from: classes3.dex */
public final class xbe {
    private final File a;
    final File b;
    private final SharedPreferences c;
    private final int d;

    public xbe(Context context, int i) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        ybe.a(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        ybe.a(dir2, true);
        this.b = dir2;
        this.d = i;
    }

    private final File d() {
        File file = new File(this.a, Integer.toString(this.d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(this.d - 1);
        return sb.toString();
    }

    private final String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(this.d - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.google.android.gms.internal.ads.d2 r8, defpackage.zbe r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbe.a(com.google.android.gms.internal.ads.d2, zbe):boolean");
    }

    final g2 b(int i) {
        String string = i == 1 ? this.c.getString(f(), null) : this.c.getString(e(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgyl zzgylVar = zzgyl.a;
            g2 R = g2.R(zzgyl.D(stringToBytes, 0, stringToBytes.length));
            String U = R.U();
            File b = ybe.b(U, "pcam.jar", d());
            if (!b.exists()) {
                b = ybe.b(U, "pcam", d());
            }
            File b2 = ybe.b(U, "pcbc", d());
            if (b.exists()) {
                if (b2.exists()) {
                    return R;
                }
            }
        } catch (zzhag unused) {
        }
        return null;
    }

    public final wbe c(int i) {
        g2 b = b(1);
        if (b == null) {
            return null;
        }
        String U = b.U();
        File b2 = ybe.b(U, "pcam.jar", d());
        if (!b2.exists()) {
            b2 = ybe.b(U, "pcam", d());
        }
        return new wbe(b, b2, ybe.b(U, "pcbc", d()), ybe.b(U, "pcopt", d()));
    }
}
