package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.t0;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class sh1 implements c93 {
    private static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    private final int b;
    private final boolean c;

    public sh1() {
        this(0, true);
    }

    private static void b(int i, List list) {
        if (Ints.h(d, i) == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    private y72 d(int i, t0 t0Var, List list, qm8 qm8Var) {
        if (i == 0) {
            return new g2();
        }
        if (i == 1) {
            return new k2();
        }
        if (i == 2) {
            return new l9();
        }
        if (i == 7) {
            return new ow4(0, 0L);
        }
        if (i == 8) {
            return e(qm8Var, t0Var, list);
        }
        if (i == 11) {
            return f(this.b, this.c, t0Var, list, qm8Var);
        }
        if (i != 13) {
            return null;
        }
        return new yf9(t0Var.c, qm8Var);
    }

    private static oq2 e(qm8 qm8Var, t0 t0Var, List list) {
        int i = g(t0Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new oq2(i, qm8Var, null, list);
    }

    private static rt8 f(int i, boolean z, t0 t0Var, List list, qm8 qm8Var) {
        int i2 = i | 16;
        if (list != null) {
            i2 = i | 48;
        } else {
            list = z ? Collections.singletonList(new t0.b().g0("application/cea-608").G()) : Collections.emptyList();
        }
        String str = t0Var.i;
        if (!TextUtils.isEmpty(str)) {
            if (!ku4.b(str, "audio/mp4a-latm")) {
                i2 |= 2;
            }
            if (!ku4.b(str, "video/avc")) {
                i2 |= 4;
            }
        }
        return new rt8(2, qm8Var, new vk1(i2, list));
    }

    private static boolean g(t0 t0Var) {
        Metadata metadata = t0Var.j;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.e(); i++) {
            if (metadata.d(i) instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) r2).variantInfos.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(y72 y72Var, z72 z72Var) {
        try {
            boolean e = y72Var.e(z72Var);
            z72Var.g();
            return e;
        } catch (EOFException unused) {
            z72Var.g();
            return false;
        } catch (Throwable th) {
            z72Var.g();
            throw th;
        }
    }

    @Override // defpackage.c93
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public te0 a(Uri uri, t0 t0Var, List list, qm8 qm8Var, Map map, z72 z72Var, sv5 sv5Var) {
        int a = gf2.a(t0Var.l);
        int b = gf2.b(map);
        int c = gf2.c(uri);
        int[] iArr = d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a, arrayList);
        b(b, arrayList);
        b(c, arrayList);
        for (int i : iArr) {
            b(i, arrayList);
        }
        z72Var.g();
        y72 y72Var = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            y72 y72Var2 = (y72) ur.e(d(intValue, t0Var, list, qm8Var));
            if (h(y72Var2, z72Var)) {
                return new te0(y72Var2, t0Var, qm8Var);
            }
            if (y72Var == null && (intValue == a || intValue == b || intValue == c || intValue == 11)) {
                y72Var = y72Var2;
            }
        }
        return new te0((y72) ur.e(y72Var), t0Var, qm8Var);
    }

    public sh1(int i, boolean z) {
        this.b = i;
        this.c = z;
    }
}
