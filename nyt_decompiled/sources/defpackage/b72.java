package defpackage;

import coil.decode.ExifOrientationPolicy;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;

/* loaded from: classes.dex */
public abstract class b72 {
    private static final Set a = b0.j("image/jpeg", "image/webp", "image/heic", "image/heif");

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            iArr[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
            iArr[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
            iArr[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
            a = iArr;
        }
    }

    public static final boolean a(u62 u62Var) {
        return u62Var.a() > 0;
    }

    public static final boolean b(u62 u62Var) {
        return u62Var.a() == 90 || u62Var.a() == 270;
    }

    public static final boolean c(ExifOrientationPolicy exifOrientationPolicy, String str) {
        int i = a.a[exifOrientationPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !a.contains(str)) {
            return false;
        }
        return true;
    }
}
