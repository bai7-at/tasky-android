package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.ma;
import com.google.android.gms.internal.ads.n9;
import com.google.android.gms.internal.ads.na;
import com.google.android.gms.internal.ads.zzgaf;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class w5a {
    private static final Pattern d = Pattern.compile("\\s+");
    private static final zzgaf e = zzgaf.x(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");
    private static final zzgaf f = zzgaf.y("dot", "sesame", "circle");
    private static final zzgaf g = zzgaf.x("filled", "open");
    private static final zzgaf h = zzgaf.y("after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    private w5a(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static w5a a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        String a = yfe.a(str.trim());
        if (a.isEmpty()) {
            return null;
        }
        zzgaf u = zzgaf.u(TextUtils.split(a, d));
        String str2 = (String) n9.a(na.b(h, u), "outside");
        int hashCode = str2.hashCode();
        int i = -1;
        int i2 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                z = false;
            }
            z = -1;
        } else {
            if (str2.equals("outside")) {
                z = true;
            }
            z = -1;
        }
        int i3 = z ? !z ? 1 : -2 : 2;
        ma b = na.b(e, u);
        if (b.isEmpty()) {
            ma b2 = na.b(g, u);
            ma b3 = na.b(f, u);
            if (!b2.isEmpty() || !b3.isEmpty()) {
                String str3 = (String) n9.a(b2, "filled");
                int i4 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) n9.a(b3, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i = 1;
                }
                if (i == 0) {
                    i = 2;
                } else if (i != 1) {
                    i2 = i4;
                    i = 1;
                } else {
                    i = 3;
                }
                i2 = i4;
            }
        } else {
            String str5 = (String) b.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i = 0;
            }
        }
        return new w5a(i, i2, i3);
    }
}
