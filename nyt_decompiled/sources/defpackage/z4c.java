package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class z4c {
    public static final z4c e = new z4c(null, new jbb[0], 0, -9223372036854775807L, 0);
    private static final jbb f = new jbb(0).b(0);
    private static final String g = Integer.toString(1, 36);
    private static final String h = Integer.toString(2, 36);
    private static final String i = Integer.toString(3, 36);
    private static final String j = Integer.toString(4, 36);
    public static final zhf k = new zhf() { // from class: pp9
    };
    private final jbb[] d;
    public final long b = 0;
    public final int a = 0;
    public final int c = 0;

    private z4c(Object obj, jbb[] jbbVarArr, long j2, long j3, int i2) {
        this.d = jbbVarArr;
    }

    public final jbb a(int i2) {
        return i2 < 0 ? f : this.d[i2];
    }

    public final boolean b(int i2) {
        a(-1);
        zhf zhfVar = jbb.r;
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z4c.class == obj.getClass()) {
            z4c z4cVar = (z4c) obj;
            if (khe.f(null, null) && Arrays.equals(this.d, z4cVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
