package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.google.android.gms.internal.ads.zzae;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class bu9 {
    private static final int[] a = {1, 2, 3, 6};
    private static final int[] b = {48000, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, ContentType.LONG_FORM_ON_DEMAND, 128, 160, 192, 224, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final /* synthetic */ int g = 0;

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        return 1536;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b2 = bArr[4];
            return f((b2 & 192) >> 6, b2 & 63);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static l6a c(b9e b9eVar, String str, String str2, zzae zzaeVar) {
        g8e g8eVar = new g8e();
        g8eVar.i(b9eVar);
        int i = b[g8eVar.d(2)];
        g8eVar.m(8);
        int i2 = d[g8eVar.d(3)];
        if (g8eVar.d(1) != 0) {
            i2++;
        }
        int i3 = e[g8eVar.d(5)] * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        g8eVar.e();
        b9eVar.k(g8eVar.b());
        x3a x3aVar = new x3a();
        x3aVar.k(str);
        x3aVar.w("audio/ac3");
        x3aVar.k0(i2);
        x3aVar.x(i);
        x3aVar.e(zzaeVar);
        x3aVar.n(str2);
        x3aVar.j0(i3);
        x3aVar.r(i3);
        return x3aVar.D();
    }

    public static l6a d(b9e b9eVar, String str, String str2, zzae zzaeVar) {
        String str3;
        g8e g8eVar = new g8e();
        g8eVar.i(b9eVar);
        int d2 = g8eVar.d(13) * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        g8eVar.m(3);
        int i = b[g8eVar.d(2)];
        g8eVar.m(10);
        int i2 = d[g8eVar.d(3)];
        if (g8eVar.d(1) != 0) {
            i2++;
        }
        g8eVar.m(3);
        int d3 = g8eVar.d(4);
        g8eVar.m(1);
        if (d3 > 0) {
            g8eVar.m(6);
            if (g8eVar.d(1) != 0) {
                i2 += 2;
            }
            g8eVar.m(1);
        }
        if (g8eVar.a() > 7) {
            g8eVar.m(7);
            if (g8eVar.d(1) != 0) {
                str3 = "audio/eac3-joc";
                g8eVar.e();
                b9eVar.k(g8eVar.b());
                x3a x3aVar = new x3a();
                x3aVar.k(str);
                x3aVar.w(str3);
                x3aVar.k0(i2);
                x3aVar.x(i);
                x3aVar.e(zzaeVar);
                x3aVar.n(str2);
                x3aVar.r(d2);
                return x3aVar.D();
            }
        }
        str3 = "audio/eac3";
        g8eVar.e();
        b9eVar.k(g8eVar.b());
        x3a x3aVar2 = new x3a();
        x3aVar2.k(str);
        x3aVar2.w(str3);
        x3aVar2.k0(i2);
        x3aVar2.x(i);
        x3aVar2.e(zzaeVar);
        x3aVar2.n(str2);
        x3aVar2.r(d2);
        return x3aVar2.D();
    }

    public static au9 e(g8e g8eVar) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int c2 = g8eVar.c();
        g8eVar.m(40);
        int d2 = g8eVar.d(5);
        g8eVar.k(c2);
        int i12 = -1;
        if (d2 > 10) {
            g8eVar.m(16);
            int d3 = g8eVar.d(2);
            if (d3 == 0) {
                i12 = 0;
            } else if (d3 == 1) {
                i12 = 1;
            } else if (d3 == 2) {
                i12 = 2;
            }
            g8eVar.m(3);
            int d4 = g8eVar.d(11) + 1;
            int d5 = g8eVar.d(2);
            if (d5 == 3) {
                i8 = c[g8eVar.d(2)];
                i9 = 6;
                i7 = 3;
            } else {
                int d6 = g8eVar.d(2);
                int i13 = a[d6];
                i7 = d6;
                i8 = b[d5];
                i9 = i13;
            }
            int i14 = d4 + d4;
            int i15 = (i14 * i8) / (i9 * 32);
            int d7 = g8eVar.d(3);
            boolean o = g8eVar.o();
            i = d[d7] + (o ? 1 : 0);
            g8eVar.m(10);
            if (g8eVar.o()) {
                g8eVar.m(8);
            }
            if (d7 == 0) {
                g8eVar.m(5);
                if (g8eVar.o()) {
                    g8eVar.m(8);
                }
                i10 = 0;
                d7 = 0;
            } else {
                i10 = d7;
            }
            if (i12 == 1) {
                if (g8eVar.o()) {
                    g8eVar.m(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (g8eVar.o()) {
                if (i10 > 2) {
                    g8eVar.m(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    g8eVar.m(6);
                }
                if ((i10 & 4) != 0) {
                    g8eVar.m(6);
                }
                if (o && g8eVar.o()) {
                    g8eVar.m(5);
                }
                if (i11 == 0) {
                    if (g8eVar.o()) {
                        g8eVar.m(6);
                    }
                    if (i10 == 0 && g8eVar.o()) {
                        g8eVar.m(6);
                    }
                    if (g8eVar.o()) {
                        g8eVar.m(6);
                    }
                    int d8 = g8eVar.d(2);
                    if (d8 == 1) {
                        g8eVar.m(5);
                    } else if (d8 == 2) {
                        g8eVar.m(12);
                    } else if (d8 == 3) {
                        int d9 = g8eVar.d(5);
                        if (g8eVar.o()) {
                            g8eVar.m(5);
                            if (g8eVar.o()) {
                                g8eVar.m(4);
                            }
                            if (g8eVar.o()) {
                                g8eVar.m(4);
                            }
                            if (g8eVar.o()) {
                                g8eVar.m(4);
                            }
                            if (g8eVar.o()) {
                                g8eVar.m(4);
                            }
                            if (g8eVar.o()) {
                                g8eVar.m(4);
                            }
                            if (g8eVar.o()) {
                                g8eVar.m(4);
                            }
                            if (g8eVar.o()) {
                                g8eVar.m(4);
                            }
                            if (g8eVar.o()) {
                                if (g8eVar.o()) {
                                    g8eVar.m(4);
                                }
                                if (g8eVar.o()) {
                                    g8eVar.m(4);
                                }
                            }
                        }
                        if (g8eVar.o()) {
                            g8eVar.m(5);
                            if (g8eVar.o()) {
                                g8eVar.m(7);
                                if (g8eVar.o()) {
                                    g8eVar.m(8);
                                }
                            }
                        }
                        g8eVar.m((d9 + 2) * 8);
                        g8eVar.e();
                    }
                    if (i10 < 2) {
                        if (g8eVar.o()) {
                            g8eVar.m(14);
                        }
                        if (d7 == 0 && g8eVar.o()) {
                            g8eVar.m(14);
                        }
                    }
                    if (g8eVar.o()) {
                        if (i7 == 0) {
                            g8eVar.m(5);
                            i11 = 0;
                            i7 = 0;
                        } else {
                            for (int i16 = 0; i16 < i9; i16++) {
                                if (g8eVar.o()) {
                                    g8eVar.m(5);
                                }
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            if (g8eVar.o()) {
                g8eVar.m(5);
                if (i10 == 2) {
                    g8eVar.m(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    g8eVar.m(2);
                }
                if (g8eVar.o()) {
                    g8eVar.m(8);
                }
                if (i10 == 0 && g8eVar.o()) {
                    g8eVar.m(8);
                }
                if (d5 < 3) {
                    g8eVar.l();
                }
            }
            if (i11 == 0 && i7 != 3) {
                g8eVar.l();
            }
            if (i11 == 2 && (i7 == 3 || g8eVar.o())) {
                g8eVar.m(6);
            }
            str = (g8eVar.o() && g8eVar.d(6) == 1 && g8eVar.d(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i12;
            i4 = i14;
            i5 = i8;
            i6 = i9 * JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            i3 = i15;
        } else {
            g8eVar.m(32);
            int d10 = g8eVar.d(2);
            String str2 = d10 == 3 ? null : "audio/ac3";
            int d11 = g8eVar.d(6);
            int i17 = e[d11 / 2] * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
            int f2 = f(d10, d11);
            g8eVar.m(8);
            int d12 = g8eVar.d(3);
            if ((d12 & 1) != 0 && d12 != 1) {
                g8eVar.m(2);
            }
            if ((d12 & 4) != 0) {
                g8eVar.m(2);
            }
            if (d12 == 2) {
                g8eVar.m(2);
            }
            int i18 = d10 < 3 ? b[d10] : -1;
            i = d[d12] + (g8eVar.o() ? 1 : 0);
            i2 = -1;
            str = str2;
            i3 = i17;
            i4 = f2;
            i5 = i18;
            i6 = 1536;
        }
        return new au9(str, i2, i, i5, i4, i6, i3, null);
    }

    private static int f(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            int i5 = f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
