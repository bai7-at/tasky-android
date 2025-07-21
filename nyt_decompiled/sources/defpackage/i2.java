package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.t0;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class i2 {
    private static final int[] a = {1, 2, 3, 6};
    private static final int[] b = {48000, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, ContentType.LONG_FORM_ON_DEMAND, 128, 160, 192, 224, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        private b(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = str;
            this.b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
        }
    }

    private static int a(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((z19.J(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    private static int c(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static t0 d(yo5 yo5Var, String str, String str2, DrmInitData drmInitData) {
        xo5 xo5Var = new xo5();
        xo5Var.m(yo5Var);
        int i = b[xo5Var.h(2)];
        xo5Var.r(8);
        int i2 = d[xo5Var.h(3)];
        if (xo5Var.h(1) != 0) {
            i2++;
        }
        int i3 = e[xo5Var.h(5)] * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        xo5Var.c();
        yo5Var.U(xo5Var.d());
        return new t0.b().U(str).g0("audio/ac3").J(i2).h0(i).O(drmInitData).X(str2).I(i3).b0(i3).G();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        return 1536;
    }

    public static b f(xo5 xo5Var) {
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
        int i12;
        int e2 = xo5Var.e();
        xo5Var.r(40);
        boolean z = xo5Var.h(5) > 10;
        xo5Var.p(e2);
        int i13 = -1;
        if (z) {
            xo5Var.r(16);
            int h = xo5Var.h(2);
            if (h == 0) {
                i13 = 0;
            } else if (h == 1) {
                i13 = 1;
            } else if (h == 2) {
                i13 = 2;
            }
            xo5Var.r(3);
            int h2 = (xo5Var.h(11) + 1) * 2;
            int h3 = xo5Var.h(2);
            if (h3 == 3) {
                i8 = c[xo5Var.h(2)];
                i7 = 3;
                i9 = 6;
            } else {
                int h4 = xo5Var.h(2);
                int i14 = a[h4];
                i7 = h4;
                i8 = b[h3];
                i9 = i14;
            }
            int i15 = i9 * JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            int a2 = a(h2, i8, i9);
            int h5 = xo5Var.h(3);
            boolean g = xo5Var.g();
            i = d[h5] + (g ? 1 : 0);
            xo5Var.r(10);
            if (xo5Var.g()) {
                xo5Var.r(8);
            }
            if (h5 == 0) {
                xo5Var.r(5);
                if (xo5Var.g()) {
                    xo5Var.r(8);
                }
            }
            if (i13 == 1 && xo5Var.g()) {
                xo5Var.r(16);
            }
            if (xo5Var.g()) {
                if (h5 > 2) {
                    xo5Var.r(2);
                }
                if ((h5 & 1) == 0 || h5 <= 2) {
                    i11 = 6;
                } else {
                    i11 = 6;
                    xo5Var.r(6);
                }
                if ((h5 & 4) != 0) {
                    xo5Var.r(i11);
                }
                if (g && xo5Var.g()) {
                    xo5Var.r(5);
                }
                if (i13 == 0) {
                    if (xo5Var.g()) {
                        i12 = 6;
                        xo5Var.r(6);
                    } else {
                        i12 = 6;
                    }
                    if (h5 == 0 && xo5Var.g()) {
                        xo5Var.r(i12);
                    }
                    if (xo5Var.g()) {
                        xo5Var.r(i12);
                    }
                    int h6 = xo5Var.h(2);
                    if (h6 == 1) {
                        xo5Var.r(5);
                    } else if (h6 == 2) {
                        xo5Var.r(12);
                    } else if (h6 == 3) {
                        int h7 = xo5Var.h(5);
                        if (xo5Var.g()) {
                            xo5Var.r(5);
                            if (xo5Var.g()) {
                                xo5Var.r(4);
                            }
                            if (xo5Var.g()) {
                                xo5Var.r(4);
                            }
                            if (xo5Var.g()) {
                                xo5Var.r(4);
                            }
                            if (xo5Var.g()) {
                                xo5Var.r(4);
                            }
                            if (xo5Var.g()) {
                                xo5Var.r(4);
                            }
                            if (xo5Var.g()) {
                                xo5Var.r(4);
                            }
                            if (xo5Var.g()) {
                                xo5Var.r(4);
                            }
                            if (xo5Var.g()) {
                                if (xo5Var.g()) {
                                    xo5Var.r(4);
                                }
                                if (xo5Var.g()) {
                                    xo5Var.r(4);
                                }
                            }
                        }
                        if (xo5Var.g()) {
                            xo5Var.r(5);
                            if (xo5Var.g()) {
                                xo5Var.r(7);
                                if (xo5Var.g()) {
                                    xo5Var.r(8);
                                }
                            }
                        }
                        xo5Var.r((h7 + 2) * 8);
                        xo5Var.c();
                    }
                    if (h5 < 2) {
                        if (xo5Var.g()) {
                            xo5Var.r(14);
                        }
                        if (h5 == 0 && xo5Var.g()) {
                            xo5Var.r(14);
                        }
                    }
                    if (xo5Var.g()) {
                        if (i7 == 0) {
                            xo5Var.r(5);
                        } else {
                            for (int i16 = 0; i16 < i9; i16++) {
                                if (xo5Var.g()) {
                                    xo5Var.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xo5Var.g()) {
                xo5Var.r(5);
                if (h5 == 2) {
                    xo5Var.r(4);
                }
                if (h5 >= 6) {
                    xo5Var.r(2);
                }
                if (xo5Var.g()) {
                    xo5Var.r(8);
                }
                if (h5 == 0 && xo5Var.g()) {
                    xo5Var.r(8);
                }
                if (h3 < 3) {
                    xo5Var.q();
                }
            }
            if (i13 == 0 && i7 != 3) {
                xo5Var.q();
            }
            if (i13 == 2 && (i7 == 3 || xo5Var.g())) {
                i10 = 6;
                xo5Var.r(6);
            } else {
                i10 = 6;
            }
            str = (xo5Var.g() && xo5Var.h(i10) == 1 && xo5Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i13;
            i3 = i15;
            i5 = h2;
            i6 = i8;
            i4 = a2;
        } else {
            xo5Var.r(32);
            int h8 = xo5Var.h(2);
            String str2 = h8 == 3 ? null : "audio/ac3";
            int h9 = xo5Var.h(6);
            int i17 = e[h9 / 2] * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
            int c2 = c(h8, h9);
            xo5Var.r(8);
            int h10 = xo5Var.h(3);
            if ((h10 & 1) != 0 && h10 != 1) {
                xo5Var.r(2);
            }
            if ((h10 & 4) != 0) {
                xo5Var.r(2);
            }
            if (h10 == 2) {
                xo5Var.r(2);
            }
            int[] iArr = b;
            int i18 = h8 < iArr.length ? iArr[h8] : -1;
            i = d[h10] + (xo5Var.g() ? 1 : 0);
            i2 = -1;
            str = str2;
            i3 = 1536;
            i4 = i17;
            i5 = c2;
            i6 = i18;
        }
        return new b(str, i2, i, i6, i5, i3, i4);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return c((b2 & 192) >> 6, b2 & 63);
    }

    public static t0 h(yo5 yo5Var, String str, String str2, DrmInitData drmInitData) {
        String str3;
        xo5 xo5Var = new xo5();
        xo5Var.m(yo5Var);
        int h = xo5Var.h(13) * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        xo5Var.r(3);
        int i = b[xo5Var.h(2)];
        xo5Var.r(10);
        int i2 = d[xo5Var.h(3)];
        if (xo5Var.h(1) != 0) {
            i2++;
        }
        xo5Var.r(3);
        int h2 = xo5Var.h(4);
        xo5Var.r(1);
        if (h2 > 0) {
            xo5Var.r(6);
            if (xo5Var.h(1) != 0) {
                i2 += 2;
            }
            xo5Var.r(1);
        }
        if (xo5Var.b() > 7) {
            xo5Var.r(7);
            if (xo5Var.h(1) != 0) {
                str3 = "audio/eac3-joc";
                xo5Var.c();
                yo5Var.U(xo5Var.d());
                return new t0.b().U(str).g0(str3).J(i2).h0(i).O(drmInitData).X(str2).b0(h).G();
            }
        }
        str3 = "audio/eac3";
        xo5Var.c();
        yo5Var.U(xo5Var.d());
        return new t0.b().U(str).g0(str3).J(i2).h0(i).O(drmInitData).X(str2).b0(h).G();
    }

    public static int i(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
