package defpackage;

import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.zzgaa;

/* loaded from: classes3.dex */
final class ny9 implements fy9 {
    public final zzgaa a;
    private final int b;

    private ny9(int i, zzgaa zzgaaVar) {
        this.b = i;
        this.a = zzgaaVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ny9 b(int i, b9e b9eVar) {
        fy9 oy9Var;
        String str;
        h9 h9Var = new h9();
        int t = b9eVar.t();
        int i2 = -2;
        while (b9eVar.q() > 8) {
            int x = b9eVar.x();
            int s = b9eVar.s() + b9eVar.x();
            b9eVar.j(s);
            if (x != 1414744396) {
                oy9 oy9Var2 = null;
                switch (x) {
                    case 1718776947:
                        if (i2 == 2) {
                            b9eVar.l(4);
                            int x2 = b9eVar.x();
                            int x3 = b9eVar.x();
                            b9eVar.l(4);
                            int x4 = b9eVar.x();
                            switch (x4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                ezd.f("StreamFormatChunk", "Ignoring track with unsupported compression " + x4);
                            } else {
                                x3a x3aVar = new x3a();
                                x3aVar.C(x2);
                                x3aVar.i(x3);
                                x3aVar.w(str);
                                oy9Var2 = new oy9(x3aVar.D());
                            }
                        } else if (i2 == 1) {
                            int z = b9eVar.z();
                            String str2 = z != 1 ? z != 85 ? z != 255 ? z != 8192 ? z != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int z2 = b9eVar.z();
                                int x5 = b9eVar.x();
                                b9eVar.l(6);
                                int z3 = khe.z(b9eVar.F());
                                int z4 = b9eVar.z();
                                byte[] bArr = new byte[z4];
                                b9eVar.g(bArr, 0, z4);
                                x3a x3aVar2 = new x3a();
                                x3aVar2.w(str2);
                                x3aVar2.k0(z2);
                                x3aVar2.x(x5);
                                if ("audio/raw".equals(str2) && z3 != 0) {
                                    x3aVar2.q(z3);
                                }
                                if ("audio/mp4a-latm".equals(str2) && z4 > 0) {
                                    x3aVar2.l(zzgaa.u(bArr));
                                }
                                oy9Var = new oy9(x3aVar2.D());
                                break;
                            } else {
                                ezd.f("StreamFormatChunk", "Ignoring track with unsupported format tag " + z);
                            }
                        } else {
                            ezd.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(khe.b(i2)));
                        }
                        oy9Var = oy9Var2;
                        break;
                    case 1751742049:
                        oy9Var = ky9.a(b9eVar);
                        break;
                    case 1752331379:
                        oy9Var = ly9.a(b9eVar);
                        break;
                    case 1852994675:
                        oy9Var = py9.a(b9eVar);
                        break;
                    default:
                        oy9Var = oy9Var2;
                        break;
                }
            } else {
                oy9Var = b(b9eVar.x(), b9eVar);
            }
            if (oy9Var != null) {
                if (oy9Var.zza() == 1752331379) {
                    int i3 = ((ly9) oy9Var).a;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        ezd.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                h9Var.g(oy9Var);
            }
            b9eVar.k(s);
            b9eVar.j(t);
        }
        return new ny9(i, h9Var.j());
    }

    public final fy9 a(Class cls) {
        zzgaa zzgaaVar = this.a;
        int size = zzgaaVar.size();
        int i = 0;
        while (i < size) {
            fy9 fy9Var = (fy9) zzgaaVar.get(i);
            i++;
            if (fy9Var.getClass() == cls) {
                return fy9Var;
            }
        }
        return null;
    }

    @Override // defpackage.fy9
    public final int zza() {
        return this.b;
    }
}
