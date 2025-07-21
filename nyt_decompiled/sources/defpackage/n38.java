package defpackage;

import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;

/* loaded from: classes2.dex */
final class n38 implements w20 {
    public final t0 a;

    public n38(t0 t0Var) {
        this.a = t0Var;
    }

    private static String a(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i) {
        if (i == 1) {
            return "audio/raw";
        }
        if (i == 85) {
            return "audio/mpeg";
        }
        if (i == 255) {
            return "audio/mp4a-latm";
        }
        if (i == 8192) {
            return "audio/ac3";
        }
        if (i != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static w20 c(yo5 yo5Var) {
        yo5Var.V(4);
        int u = yo5Var.u();
        int u2 = yo5Var.u();
        yo5Var.V(4);
        int u3 = yo5Var.u();
        String a = a(u3);
        if (a != null) {
            t0.b bVar = new t0.b();
            bVar.n0(u).S(u2).g0(a);
            return new n38(bVar.G());
        }
        a84.j("StreamFormatChunk", "Ignoring track with unsupported compression " + u3);
        return null;
    }

    public static w20 d(int i, yo5 yo5Var) {
        if (i == 2) {
            return c(yo5Var);
        }
        if (i == 1) {
            return e(yo5Var);
        }
        a84.j("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + z19.n0(i));
        return null;
    }

    private static w20 e(yo5 yo5Var) {
        int z = yo5Var.z();
        String b = b(z);
        if (b == null) {
            a84.j("StreamFormatChunk", "Ignoring track with unsupported format tag " + z);
            return null;
        }
        int z2 = yo5Var.z();
        int u = yo5Var.u();
        yo5Var.V(6);
        int e0 = z19.e0(yo5Var.N());
        int z3 = yo5Var.z();
        byte[] bArr = new byte[z3];
        yo5Var.l(bArr, 0, z3);
        t0.b bVar = new t0.b();
        bVar.g0(b).J(z2).h0(u);
        if ("audio/raw".equals(b) && e0 != 0) {
            bVar.a0(e0);
        }
        if ("audio/mp4a-latm".equals(b) && z3 > 0) {
            bVar.V(ImmutableList.y(bArr));
        }
        return new n38(bVar.G());
    }

    @Override // defpackage.w20
    public int getType() {
        return 1718776947;
    }
}
