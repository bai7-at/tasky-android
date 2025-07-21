package defpackage;

import android.util.Base64;
import com.google.android.gms.internal.ads.zzafw;
import com.google.android.gms.internal.ads.zzaho;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class cy9 {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzby b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = khe.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                ezd.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafw.a(new b9e(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    ezd.g("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzaho(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby(arrayList);
    }

    public static wx9 c(b9e b9eVar, boolean z, boolean z2) {
        if (z) {
            d(3, b9eVar, false);
        }
        String a = b9eVar.a((int) b9eVar.H(), ege.c);
        int length = a.length();
        long H = b9eVar.H();
        String[] strArr = new String[(int) H];
        int i = length + 15;
        for (int i2 = 0; i2 < H; i2++) {
            String a2 = b9eVar.a((int) b9eVar.H(), ege.c);
            strArr[i2] = a2;
            i = i + 4 + a2.length();
        }
        if (z2 && (b9eVar.B() & 1) == 0) {
            throw zzcc.a("framing bit expected to be set", null);
        }
        return new wx9(a, strArr, i + 1);
    }

    public static boolean d(int i, b9e b9eVar, boolean z) {
        if (b9eVar.q() < 7) {
            if (z) {
                return false;
            }
            throw zzcc.a("too short header: " + b9eVar.q(), null);
        }
        if (b9eVar.B() != i) {
            if (z) {
                return false;
            }
            throw zzcc.a("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (b9eVar.B() == 118 && b9eVar.B() == 111 && b9eVar.B() == 114 && b9eVar.B() == 98 && b9eVar.B() == 105 && b9eVar.B() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzcc.a("expected characters 'vorbis'", null);
    }
}
