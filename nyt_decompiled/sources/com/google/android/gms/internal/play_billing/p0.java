package com.google.android.gms.internal.play_billing;

import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.bgb;
import defpackage.ehb;
import defpackage.lh4;
import defpackage.sbc;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class p0 implements w0 {
    private static final int[] p = new int[0];
    private static final Unsafe q = h1.l();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final sbc e;
    private final boolean f;
    private final int[] g;
    private final int h;
    private final int i;
    private final f0 j;
    private final a1 k;
    private final s l;
    private final int m;
    private final r0 n;
    private final k0 o;

    private p0(int[] iArr, Object[] objArr, int i, int i2, sbc sbcVar, int i3, boolean z, int[] iArr2, int i4, int i5, r0 r0Var, f0 f0Var, a1 a1Var, s sVar, k0 k0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.m = i3;
        boolean z2 = false;
        if (sVar != null && sVar.c(sbcVar)) {
            z2 = true;
        }
        this.f = z2;
        this.g = iArr2;
        this.h = i4;
        this.i = i5;
        this.n = r0Var;
        this.j = f0Var;
        this.k = a1Var;
        this.l = sVar;
        this.e = sbcVar;
        this.o = k0Var;
    }

    static b1 B(Object obj) {
        z zVar = (z) obj;
        b1 b1Var = zVar.zzc;
        if (b1Var != b1.c()) {
            return b1Var;
        }
        b1 f = b1.f();
        zVar.zzc = f;
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.play_billing.p0 C(java.lang.Class r31, com.google.android.gms.internal.play_billing.m0 r32, com.google.android.gms.internal.play_billing.r0 r33, com.google.android.gms.internal.play_billing.f0 r34, com.google.android.gms.internal.play_billing.a1 r35, com.google.android.gms.internal.play_billing.s r36, com.google.android.gms.internal.play_billing.k0 r37) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.p0.C(java.lang.Class, com.google.android.gms.internal.play_billing.m0, com.google.android.gms.internal.play_billing.r0, com.google.android.gms.internal.play_billing.f0, com.google.android.gms.internal.play_billing.a1, com.google.android.gms.internal.play_billing.s, com.google.android.gms.internal.play_billing.k0):com.google.android.gms.internal.play_billing.p0");
    }

    private static double D(Object obj, long j) {
        return ((Double) h1.k(obj, j)).doubleValue();
    }

    private static float E(Object obj, long j) {
        return ((Float) h1.k(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int F(Object obj) {
        int i;
        int y;
        int y2;
        int z;
        int y3;
        int y4;
        int y5;
        int y6;
        int P;
        boolean z2;
        int y7;
        int D;
        int y8;
        int y9;
        int i2;
        int y10;
        int y11;
        int y12;
        int y13;
        Unsafe unsafe = q;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.a.length) {
            int P2 = P(i5);
            int[] iArr = this.a;
            int i8 = iArr[i5];
            int O = O(P2);
            if (O <= 17) {
                int i9 = iArr[i5 + 2];
                int i10 = i9 & i3;
                int i11 = i9 >>> 20;
                if (i10 != i4) {
                    i7 = unsafe.getInt(obj, i10);
                    i4 = i10;
                }
                i = 1 << i11;
            } else {
                i = 0;
            }
            long j = P2 & i3;
            switch (O) {
                case 0:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        y = o.y(i8 << 3);
                        y4 = y + 8;
                        i6 += y4;
                        break;
                    }
                case 1:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        y2 = o.y(i8 << 3);
                        y4 = y2 + 4;
                        i6 += y4;
                        break;
                    }
                case 2:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        z = o.z(unsafe.getLong(obj, j));
                        y3 = o.y(i8 << 3);
                        i6 += y3 + z;
                        break;
                    }
                case 3:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        z = o.z(unsafe.getLong(obj, j));
                        y3 = o.y(i8 << 3);
                        i6 += y3 + z;
                        break;
                    }
                case 4:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        z = o.v(unsafe.getInt(obj, j));
                        y3 = o.y(i8 << 3);
                        i6 += y3 + z;
                        break;
                    }
                case 5:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        y = o.y(i8 << 3);
                        y4 = y + 8;
                        i6 += y4;
                        break;
                    }
                case 6:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        y2 = o.y(i8 << 3);
                        y4 = y2 + 4;
                        i6 += y4;
                        break;
                    }
                case 7:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        y4 = o.y(i8 << 3) + 1;
                        i6 += y4;
                        break;
                    }
                case 8:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzba)) {
                            z = o.x((String) object);
                            y3 = o.y(i8 << 3);
                            i6 += y3 + z;
                            break;
                        } else {
                            int i12 = o.d;
                            int e = ((zzba) object).e();
                            y5 = o.y(e) + e;
                            y6 = o.y(i8 << 3);
                            y4 = y6 + y5;
                            i6 += y4;
                            break;
                        }
                    }
                case 9:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        y4 = y0.J(i8, unsafe.getObject(obj, j), f(i5));
                        i6 += y4;
                        break;
                    }
                case 10:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzba zzbaVar = (zzba) unsafe.getObject(obj, j);
                        int i13 = o.d;
                        int e2 = zzbaVar.e();
                        y5 = o.y(e2) + e2;
                        y6 = o.y(i8 << 3);
                        y4 = y6 + y5;
                        i6 += y4;
                        break;
                    }
                case 11:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        z = o.y(unsafe.getInt(obj, j));
                        y3 = o.y(i8 << 3);
                        i6 += y3 + z;
                        break;
                    }
                case 12:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        z = o.v(unsafe.getInt(obj, j));
                        y3 = o.y(i8 << 3);
                        i6 += y3 + z;
                        break;
                    }
                case 13:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        y2 = o.y(i8 << 3);
                        y4 = y2 + 4;
                        i6 += y4;
                        break;
                    }
                case 14:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        y = o.y(i8 << 3);
                        y4 = y + 8;
                        i6 += y4;
                        break;
                    }
                case 15:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        y3 = o.y(i8 << 3);
                        z = o.y((i14 >> 31) ^ (i14 + i14));
                        i6 += y3 + z;
                        break;
                    }
                case 16:
                    if ((i & i7) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        i6 += o.y(i8 << 3) + o.z((j2 >> 63) ^ (j2 + j2));
                        break;
                    }
                case 17:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        y4 = o.u(i8, (sbc) unsafe.getObject(obj, j), f(i5));
                        i6 += y4;
                        break;
                    }
                case 18:
                    y4 = y0.C(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y4;
                    break;
                case 19:
                    y4 = y0.A(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y4;
                    break;
                case 20:
                    y4 = y0.H(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y4;
                    break;
                case 21:
                    y4 = y0.S(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y4;
                    break;
                case 22:
                    y4 = y0.F(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y4;
                    break;
                case 23:
                    y4 = y0.C(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y4;
                    break;
                case 24:
                    y4 = y0.A(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y4;
                    break;
                case EventType.SUBS /* 25 */:
                    y4 = y0.w(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y4;
                    break;
                case EventType.CDN /* 26 */:
                    P = y0.P(i8, (List) unsafe.getObject(obj, j));
                    i6 += P;
                    break;
                case 27:
                    P = y0.K(i8, (List) unsafe.getObject(obj, j), f(i5));
                    i6 += P;
                    break;
                case 28:
                    P = y0.x(i8, (List) unsafe.getObject(obj, j));
                    i6 += P;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    P = y0.Q(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += P;
                    break;
                case 30:
                    z2 = false;
                    y7 = y0.y(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y7;
                    break;
                case 31:
                    z2 = false;
                    y7 = y0.A(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y7;
                    break;
                case 32:
                    z2 = false;
                    y7 = y0.C(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y7;
                    break;
                case 33:
                    z2 = false;
                    y7 = y0.L(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y7;
                    break;
                case 34:
                    z2 = false;
                    y7 = y0.N(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += y7;
                    break;
                case 35:
                    D = y0.D((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 36:
                    D = y0.B((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 37:
                    D = y0.I((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 38:
                    D = y0.T((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 39:
                    D = y0.G((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 40:
                    D = y0.D((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 41:
                    D = y0.B((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i15 = y0.d;
                    D = list.size();
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 43:
                    D = y0.R((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 44:
                    D = y0.z((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 45:
                    D = y0.B((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 46:
                    D = y0.D((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 47:
                    D = y0.M((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 48:
                    D = y0.O((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        y8 = o.y(D);
                        y9 = o.y(i8 << 3);
                        i2 = y9 + y8;
                        i6 += i2 + D;
                    }
                    break;
                case 49:
                    P = y0.E(i8, (List) unsafe.getObject(obj, j), f(i5));
                    i6 += P;
                    break;
                case 50:
                    k0.a(i8, unsafe.getObject(obj, j), g(i5));
                    break;
                case 51:
                    if (x(obj, i8, i5)) {
                        y10 = o.y(i8 << 3);
                        P = y10 + 8;
                        i6 += P;
                    }
                    break;
                case 52:
                    if (x(obj, i8, i5)) {
                        y11 = o.y(i8 << 3);
                        P = y11 + 4;
                        i6 += P;
                    }
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (x(obj, i8, i5)) {
                        D = o.z(Q(obj, j));
                        i2 = o.y(i8 << 3);
                        i6 += i2 + D;
                    }
                    break;
                case 54:
                    if (x(obj, i8, i5)) {
                        D = o.z(Q(obj, j));
                        i2 = o.y(i8 << 3);
                        i6 += i2 + D;
                    }
                    break;
                case 55:
                    if (x(obj, i8, i5)) {
                        D = o.v(G(obj, j));
                        i2 = o.y(i8 << 3);
                        i6 += i2 + D;
                    }
                    break;
                case 56:
                    if (x(obj, i8, i5)) {
                        y10 = o.y(i8 << 3);
                        P = y10 + 8;
                        i6 += P;
                    }
                    break;
                case 57:
                    if (x(obj, i8, i5)) {
                        y11 = o.y(i8 << 3);
                        P = y11 + 4;
                        i6 += P;
                    }
                    break;
                case 58:
                    if (x(obj, i8, i5)) {
                        P = o.y(i8 << 3) + 1;
                        i6 += P;
                    }
                    break;
                case 59:
                    if (x(obj, i8, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzba) {
                            int i16 = o.d;
                            int e3 = ((zzba) object2).e();
                            y12 = o.y(e3) + e3;
                            y13 = o.y(i8 << 3);
                            P = y13 + y12;
                            i6 += P;
                        } else {
                            D = o.x((String) object2);
                            i2 = o.y(i8 << 3);
                            i6 += i2 + D;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (x(obj, i8, i5)) {
                        P = y0.J(i8, unsafe.getObject(obj, j), f(i5));
                        i6 += P;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (x(obj, i8, i5)) {
                        zzba zzbaVar2 = (zzba) unsafe.getObject(obj, j);
                        int i17 = o.d;
                        int e4 = zzbaVar2.e();
                        y12 = o.y(e4) + e4;
                        y13 = o.y(i8 << 3);
                        P = y13 + y12;
                        i6 += P;
                    }
                    break;
                case 62:
                    if (x(obj, i8, i5)) {
                        D = o.y(G(obj, j));
                        i2 = o.y(i8 << 3);
                        i6 += i2 + D;
                    }
                    break;
                case 63:
                    if (x(obj, i8, i5)) {
                        D = o.v(G(obj, j));
                        i2 = o.y(i8 << 3);
                        i6 += i2 + D;
                    }
                    break;
                case 64:
                    if (x(obj, i8, i5)) {
                        y11 = o.y(i8 << 3);
                        P = y11 + 4;
                        i6 += P;
                    }
                    break;
                case 65:
                    if (x(obj, i8, i5)) {
                        y10 = o.y(i8 << 3);
                        P = y10 + 8;
                        i6 += P;
                    }
                    break;
                case 66:
                    if (x(obj, i8, i5)) {
                        int G = G(obj, j);
                        i2 = o.y(i8 << 3);
                        D = o.y((G >> 31) ^ (G + G));
                        i6 += i2 + D;
                    }
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (x(obj, i8, i5)) {
                        long Q = Q(obj, j);
                        i6 += o.y(i8 << 3) + o.z((Q >> 63) ^ (Q + Q));
                    }
                    break;
                case 68:
                    if (x(obj, i8, i5)) {
                        P = o.u(i8, (sbc) unsafe.getObject(obj, j), f(i5));
                        i6 += P;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        a1 a1Var = this.k;
        int a = i6 + a1Var.a(a1Var.d(obj));
        if (!this.f) {
            return a;
        }
        this.l.a(obj);
        throw null;
    }

    private static int G(Object obj, long j) {
        return ((Integer) h1.k(obj, j)).intValue();
    }

    private final int H(Object obj, byte[] bArr, int i, int i2, int i3, long j, e eVar) {
        Unsafe unsafe = q;
        Object g = g(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzcz) object).h()) {
            zzcz c = zzcz.a().c();
            k0.b(c, object);
            unsafe.putObject(obj, j, c);
        }
        lh4.a(g);
        throw null;
    }

    private final int I(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, e eVar) {
        Unsafe unsafe = q;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(f.p(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(f.b(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
            case 54:
                if (i5 == 0) {
                    int m = f.m(bArr, i, eVar);
                    unsafe.putObject(obj, j, Long.valueOf(eVar.b));
                    unsafe.putInt(obj, j2, i4);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int j3 = f.j(bArr, i, eVar);
                    unsafe.putObject(obj, j, Integer.valueOf(eVar.a));
                    unsafe.putInt(obj, j2, i4);
                    return j3;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(f.p(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(f.b(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m2 = f.m(bArr, i, eVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(eVar.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int j4 = f.j(bArr, i, eVar);
                    int i13 = eVar.a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !l1.e(bArr, j4, j4 + i13)) {
                            throw zzci.c();
                        }
                        unsafe.putObject(obj, j, new String(bArr, j4, i13, b0.b));
                        j4 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return j4;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 == 2) {
                    Object i14 = i(obj, i4, i8);
                    int o = f.o(i14, f(i8), bArr, i, i2, eVar);
                    q(obj, i4, i8, i14);
                    return o;
                }
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 == 2) {
                    int a = f.a(bArr, i, eVar);
                    unsafe.putObject(obj, j, eVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int j5 = f.j(bArr, i, eVar);
                    int i15 = eVar.a;
                    bgb e = e(i8);
                    if (e != null && !e.zza(i15)) {
                        B(obj).j(i3, Long.valueOf(i15));
                        return j5;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return j5;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int j6 = f.j(bArr, i, eVar);
                    unsafe.putObject(obj, j, Integer.valueOf(m.a(eVar.a)));
                    unsafe.putInt(obj, j2, i4);
                    return j6;
                }
                break;
            case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                if (i5 == 0) {
                    int m3 = f.m(bArr, i, eVar);
                    unsafe.putObject(obj, j, Long.valueOf(m.b(eVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object i16 = i(obj, i4, i8);
                    int n = f.n(i16, f(i8), bArr, i, i2, (i3 & (-8)) | 4, eVar);
                    q(obj, i4, i8, i16);
                    return n;
                }
                break;
        }
        return i;
    }

    private final int J(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, e eVar) {
        int i8;
        int l;
        Unsafe unsafe = q;
        ehb ehbVar = (ehb) unsafe.getObject(obj, j2);
        if (!ehbVar.zzc()) {
            int size = ehbVar.size();
            ehbVar = ehbVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, ehbVar);
        }
        Object obj2 = null;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    lh4.a(ehbVar);
                    int j3 = f.j(bArr, i, eVar);
                    int i9 = eVar.a + j3;
                    if (j3 < i9) {
                        Double.longBitsToDouble(f.p(bArr, j3));
                        throw null;
                    }
                    if (j3 == i9) {
                        return j3;
                    }
                    throw zzci.g();
                }
                if (i5 == 1) {
                    lh4.a(ehbVar);
                    Double.longBitsToDouble(f.p(bArr, i));
                    throw null;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    lh4.a(ehbVar);
                    int j4 = f.j(bArr, i, eVar);
                    int i10 = eVar.a + j4;
                    if (j4 < i10) {
                        Float.intBitsToFloat(f.b(bArr, j4));
                        throw null;
                    }
                    if (j4 == i10) {
                        return j4;
                    }
                    throw zzci.g();
                }
                if (i5 == 5) {
                    lh4.a(ehbVar);
                    Float.intBitsToFloat(f.b(bArr, i));
                    throw null;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    lh4.a(ehbVar);
                    int j5 = f.j(bArr, i, eVar);
                    int i11 = eVar.a + j5;
                    if (j5 < i11) {
                        f.m(bArr, j5, eVar);
                        throw null;
                    }
                    if (j5 == i11) {
                        return j5;
                    }
                    throw zzci.g();
                }
                if (i5 == 0) {
                    lh4.a(ehbVar);
                    f.m(bArr, i, eVar);
                    long j6 = eVar.b;
                    throw null;
                }
                break;
            case 22:
            case BuildConfig.VERSION_CODE /* 29 */:
            case 39:
            case 43:
                if (i5 == 2) {
                    return f.f(bArr, i, ehbVar, eVar);
                }
                if (i5 == 0) {
                    return f.l(i3, bArr, i, i2, ehbVar, eVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    lh4.a(ehbVar);
                    int j7 = f.j(bArr, i, eVar);
                    int i12 = eVar.a + j7;
                    if (j7 < i12) {
                        f.p(bArr, j7);
                        throw null;
                    }
                    if (j7 == i12) {
                        return j7;
                    }
                    throw zzci.g();
                }
                if (i5 == 1) {
                    lh4.a(ehbVar);
                    f.p(bArr, i);
                    throw null;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    lh4.a(ehbVar);
                    int j8 = f.j(bArr, i, eVar);
                    int i13 = eVar.a + j8;
                    if (j8 < i13) {
                        f.b(bArr, j8);
                        throw null;
                    }
                    if (j8 == i13) {
                        return j8;
                    }
                    throw zzci.g();
                }
                if (i5 == 5) {
                    lh4.a(ehbVar);
                    f.b(bArr, i);
                    throw null;
                }
                break;
            case EventType.SUBS /* 25 */:
            case 42:
                if (i5 == 2) {
                    lh4.a(ehbVar);
                    int j9 = f.j(bArr, i, eVar);
                    int i14 = eVar.a + j9;
                    if (j9 < i14) {
                        f.m(bArr, j9, eVar);
                        throw null;
                    }
                    if (j9 == i14) {
                        return j9;
                    }
                    throw zzci.g();
                }
                if (i5 == 0) {
                    lh4.a(ehbVar);
                    f.m(bArr, i, eVar);
                    long j10 = eVar.b;
                    throw null;
                }
                break;
            case EventType.CDN /* 26 */:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int j11 = f.j(bArr, i, eVar);
                        int i15 = eVar.a;
                        if (i15 < 0) {
                            throw zzci.d();
                        }
                        if (i15 == 0) {
                            ehbVar.add("");
                        } else {
                            ehbVar.add(new String(bArr, j11, i15, b0.b));
                            j11 += i15;
                        }
                        while (j11 < i2) {
                            int j12 = f.j(bArr, j11, eVar);
                            if (i3 != eVar.a) {
                                return j11;
                            }
                            j11 = f.j(bArr, j12, eVar);
                            int i16 = eVar.a;
                            if (i16 < 0) {
                                throw zzci.d();
                            }
                            if (i16 == 0) {
                                ehbVar.add("");
                            } else {
                                ehbVar.add(new String(bArr, j11, i16, b0.b));
                                j11 += i16;
                            }
                        }
                        return j11;
                    }
                    int j13 = f.j(bArr, i, eVar);
                    int i17 = eVar.a;
                    if (i17 < 0) {
                        throw zzci.d();
                    }
                    if (i17 == 0) {
                        ehbVar.add("");
                        i8 = j13;
                    } else {
                        i8 = j13 + i17;
                        if (!l1.e(bArr, j13, i8)) {
                            throw zzci.c();
                        }
                        ehbVar.add(new String(bArr, j13, i17, b0.b));
                    }
                    while (i8 < i2) {
                        int j14 = f.j(bArr, i8, eVar);
                        if (i3 != eVar.a) {
                            return i8;
                        }
                        i8 = f.j(bArr, j14, eVar);
                        int i18 = eVar.a;
                        if (i18 < 0) {
                            throw zzci.d();
                        }
                        if (i18 == 0) {
                            ehbVar.add("");
                        } else {
                            int i19 = i8 + i18;
                            if (!l1.e(bArr, i8, i19)) {
                                throw zzci.c();
                            }
                            ehbVar.add(new String(bArr, i8, i18, b0.b));
                            i8 = i19;
                        }
                    }
                    return i8;
                }
                break;
            case 27:
                if (i5 == 2) {
                    return f.e(f(i6), i3, bArr, i, i2, ehbVar, eVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int j15 = f.j(bArr, i, eVar);
                    int i20 = eVar.a;
                    if (i20 < 0) {
                        throw zzci.d();
                    }
                    if (i20 > bArr.length - j15) {
                        throw zzci.g();
                    }
                    if (i20 == 0) {
                        ehbVar.add(zzba.a);
                    } else {
                        ehbVar.add(zzba.q(bArr, j15, i20));
                        j15 += i20;
                    }
                    while (j15 < i2) {
                        int j16 = f.j(bArr, j15, eVar);
                        if (i3 != eVar.a) {
                            return j15;
                        }
                        j15 = f.j(bArr, j16, eVar);
                        int i21 = eVar.a;
                        if (i21 < 0) {
                            throw zzci.d();
                        }
                        if (i21 > bArr.length - j15) {
                            throw zzci.g();
                        }
                        if (i21 == 0) {
                            ehbVar.add(zzba.a);
                        } else {
                            ehbVar.add(zzba.q(bArr, j15, i21));
                            j15 += i21;
                        }
                    }
                    return j15;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    l = f.f(bArr, i, ehbVar, eVar);
                } else if (i5 == 0) {
                    l = f.l(i3, bArr, i, i2, ehbVar, eVar);
                }
                bgb e = e(i6);
                a1 a1Var = this.k;
                int i22 = y0.d;
                if (e != null) {
                    if (ehbVar != null) {
                        int size2 = ehbVar.size();
                        int i23 = 0;
                        for (int i24 = 0; i24 < size2; i24++) {
                            Integer num = (Integer) ehbVar.get(i24);
                            int intValue = num.intValue();
                            if (e.zza(intValue)) {
                                if (i24 != i23) {
                                    ehbVar.set(i23, num);
                                }
                                i23++;
                            } else {
                                obj2 = y0.a(obj, i4, intValue, obj2, a1Var);
                            }
                        }
                        if (i23 != size2) {
                            ehbVar.subList(i23, size2).clear();
                            return l;
                        }
                    } else {
                        Iterator it2 = ehbVar.iterator();
                        while (it2.hasNext()) {
                            int intValue2 = ((Integer) it2.next()).intValue();
                            if (!e.zza(intValue2)) {
                                obj2 = y0.a(obj, i4, intValue2, obj2, a1Var);
                                it2.remove();
                            }
                        }
                    }
                }
                return l;
            case 33:
            case 47:
                if (i5 == 2) {
                    lh4.a(ehbVar);
                    int j17 = f.j(bArr, i, eVar);
                    int i25 = eVar.a + j17;
                    if (j17 >= i25) {
                        if (j17 == i25) {
                            return j17;
                        }
                        throw zzci.g();
                    }
                    f.j(bArr, j17, eVar);
                    m.a(eVar.a);
                    throw null;
                }
                if (i5 == 0) {
                    lh4.a(ehbVar);
                    f.j(bArr, i, eVar);
                    m.a(eVar.a);
                    throw null;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    lh4.a(ehbVar);
                    int j18 = f.j(bArr, i, eVar);
                    int i26 = eVar.a + j18;
                    if (j18 >= i26) {
                        if (j18 == i26) {
                            return j18;
                        }
                        throw zzci.g();
                    }
                    f.m(bArr, j18, eVar);
                    m.b(eVar.b);
                    throw null;
                }
                if (i5 == 0) {
                    lh4.a(ehbVar);
                    f.m(bArr, i, eVar);
                    m.b(eVar.b);
                    throw null;
                }
                break;
            default:
                if (i5 == 3) {
                    w0 f = f(i6);
                    int i27 = (i3 & (-8)) | 4;
                    int c = f.c(f, bArr, i, i2, i27, eVar);
                    ehbVar.add(eVar.c);
                    while (c < i2) {
                        int j19 = f.j(bArr, c, eVar);
                        if (i3 != eVar.a) {
                            return c;
                        }
                        c = f.c(f, bArr, j19, i2, i27, eVar);
                        ehbVar.add(eVar.c);
                    }
                    return c;
                }
                break;
        }
        return i;
    }

    private final int K(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return N(i, 0);
    }

    private final int L(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return N(i, i2);
    }

    private final int M(int i) {
        return this.a[i + 2];
    }

    private final int N(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int O(int i) {
        return (i >>> 20) & 255;
    }

    private final int P(int i) {
        return this.a[i + 1];
    }

    private static long Q(Object obj, long j) {
        return ((Long) h1.k(obj, j)).longValue();
    }

    private final bgb e(int i) {
        int i2 = i / 3;
        return (bgb) this.b[i2 + i2 + 1];
    }

    private final w0 f(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        w0 w0Var = (w0) this.b[i3];
        if (w0Var != null) {
            return w0Var;
        }
        w0 b = u0.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b;
        return b;
    }

    private final Object g(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    private final Object h(Object obj, int i) {
        w0 f = f(i);
        int P = P(i) & 1048575;
        if (!t(obj, i)) {
            return f.zze();
        }
        Object object = q.getObject(obj, P);
        if (w(object)) {
            return object;
        }
        Object zze = f.zze();
        if (object != null) {
            f.zzg(zze, object);
        }
        return zze;
    }

    private final Object i(Object obj, int i, int i2) {
        w0 f = f(i2);
        if (!x(obj, i, i2)) {
            return f.zze();
        }
        Object object = q.getObject(obj, P(i2) & 1048575);
        if (w(object)) {
            return object;
        }
        Object zze = f.zze();
        if (object != null) {
            f.zzg(zze, object);
        }
        return zze;
    }

    private static Field j(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void k(Object obj) {
        if (!w(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void l(Object obj, Object obj2, int i) {
        if (t(obj2, i)) {
            int P = P(i) & 1048575;
            Unsafe unsafe = q;
            long j = P;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            w0 f = f(i);
            if (!t(obj, i)) {
                if (w(object)) {
                    Object zze = f.zze();
                    f.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                n(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!w(object2)) {
                Object zze2 = f.zze();
                f.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            f.zzg(object2, object);
        }
    }

    private final void m(Object obj, Object obj2, int i) {
        int i2 = this.a[i];
        if (x(obj2, i2, i)) {
            int P = P(i) & 1048575;
            Unsafe unsafe = q;
            long j = P;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            w0 f = f(i);
            if (!x(obj, i2, i)) {
                if (w(object)) {
                    Object zze = f.zze();
                    f.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                o(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!w(object2)) {
                Object zze2 = f.zze();
                f.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            f.zzg(object2, object);
        }
    }

    private final void n(Object obj, int i) {
        int M = M(i);
        long j = 1048575 & M;
        if (j == 1048575) {
            return;
        }
        h1.v(obj, j, (1 << (M >>> 20)) | h1.h(obj, j));
    }

    private final void o(Object obj, int i, int i2) {
        h1.v(obj, M(i2) & 1048575, i);
    }

    private final void p(Object obj, int i, Object obj2) {
        q.putObject(obj, P(i) & 1048575, obj2);
        n(obj, i);
    }

    private final void q(Object obj, int i, int i2, Object obj2) {
        q.putObject(obj, P(i2) & 1048575, obj2);
        o(obj, i, i2);
    }

    private final void r(m1 m1Var, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        lh4.a(g(i2));
        throw null;
    }

    private final boolean s(Object obj, Object obj2, int i) {
        return t(obj, i) == t(obj2, i);
    }

    private final boolean t(Object obj, int i) {
        int M = M(i);
        long j = M & 1048575;
        if (j != 1048575) {
            return ((1 << (M >>> 20)) & h1.h(obj, j)) != 0;
        }
        int P = P(i);
        long j2 = P & 1048575;
        switch (O(P)) {
            case 0:
                return Double.doubleToRawLongBits(h1.f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(h1.g(obj, j2)) != 0;
            case 2:
                return h1.i(obj, j2) != 0;
            case 3:
                return h1.i(obj, j2) != 0;
            case 4:
                return h1.h(obj, j2) != 0;
            case 5:
                return h1.i(obj, j2) != 0;
            case 6:
                return h1.h(obj, j2) != 0;
            case 7:
                return h1.B(obj, j2);
            case 8:
                Object k = h1.k(obj, j2);
                if (k instanceof String) {
                    return !((String) k).isEmpty();
                }
                if (k instanceof zzba) {
                    return !zzba.a.equals(k);
                }
                throw new IllegalArgumentException();
            case 9:
                return h1.k(obj, j2) != null;
            case 10:
                return !zzba.a.equals(h1.k(obj, j2));
            case 11:
                return h1.h(obj, j2) != 0;
            case 12:
                return h1.h(obj, j2) != 0;
            case 13:
                return h1.h(obj, j2) != 0;
            case 14:
                return h1.i(obj, j2) != 0;
            case 15:
                return h1.h(obj, j2) != 0;
            case 16:
                return h1.i(obj, j2) != 0;
            case 17:
                return h1.k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean u(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? t(obj, i) : (i3 & i4) != 0;
    }

    private static boolean v(Object obj, int i, w0 w0Var) {
        return w0Var.b(h1.k(obj, i & 1048575));
    }

    private static boolean w(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof z) {
            return ((z) obj).p();
        }
        return true;
    }

    private final boolean x(Object obj, int i, int i2) {
        return h1.h(obj, (long) (M(i2) & 1048575)) == i;
    }

    private static boolean y(Object obj, long j) {
        return ((Boolean) h1.k(obj, j)).booleanValue();
    }

    private static final void z(int i, Object obj, m1 m1Var) {
        if (obj instanceof String) {
            m1Var.zzF(i, (String) obj);
        } else {
            m1Var.a(i, (zzba) obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0361, code lost:
    
        if (r0 != r13) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0363, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r9 = r36;
        r8 = r18;
        r5 = r19;
        r3 = r19;
        r6 = r21;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x037f, code lost:
    
        r2 = r0;
        r7 = r19;
        r6 = r21;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03b5, code lost:
    
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03da, code lost:
    
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x008c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int A(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.play_billing.e r36) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.p0.A(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.e):int");
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final boolean a(Object obj, Object obj2) {
        boolean v;
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int P = P(i);
            long j = P & 1048575;
            switch (O(P)) {
                case 0:
                    if (s(obj, obj2, i) && Double.doubleToLongBits(h1.f(obj, j)) == Double.doubleToLongBits(h1.f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (s(obj, obj2, i) && Float.floatToIntBits(h1.g(obj, j)) == Float.floatToIntBits(h1.g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (s(obj, obj2, i) && h1.i(obj, j) == h1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (s(obj, obj2, i) && h1.i(obj, j) == h1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (s(obj, obj2, i) && h1.h(obj, j) == h1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (s(obj, obj2, i) && h1.i(obj, j) == h1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (s(obj, obj2, i) && h1.h(obj, j) == h1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (s(obj, obj2, i) && h1.B(obj, j) == h1.B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (s(obj, obj2, i) && y0.v(h1.k(obj, j), h1.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (s(obj, obj2, i) && y0.v(h1.k(obj, j), h1.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (s(obj, obj2, i) && y0.v(h1.k(obj, j), h1.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (s(obj, obj2, i) && h1.h(obj, j) == h1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (s(obj, obj2, i) && h1.h(obj, j) == h1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (s(obj, obj2, i) && h1.h(obj, j) == h1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (s(obj, obj2, i) && h1.i(obj, j) == h1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (s(obj, obj2, i) && h1.h(obj, j) == h1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (s(obj, obj2, i) && h1.i(obj, j) == h1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (s(obj, obj2, i) && y0.v(h1.k(obj, j), h1.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case EventType.SUBS /* 25 */:
                case EventType.CDN /* 26 */:
                case 27:
                case 28:
                case BuildConfig.VERSION_CODE /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    v = y0.v(h1.k(obj, j), h1.k(obj2, j));
                    break;
                case 50:
                    v = y0.v(h1.k(obj, j), h1.k(obj2, j));
                    break;
                case 51:
                case 52:
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                case 68:
                    long M = M(i) & 1048575;
                    if (h1.h(obj, M) == h1.h(obj2, M) && y0.v(h1.k(obj, j), h1.k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!v) {
                return false;
            }
        }
        if (!this.k.d(obj).equals(this.k.d(obj2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.l.a(obj);
        this.l.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.h) {
            int i6 = this.g[i4];
            int i7 = this.a[i6];
            int P = P(i6);
            int i8 = this.a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = q.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & P) != 0 && !u(obj, i6, i, i2, i10)) {
                return false;
            }
            int O = O(P);
            if (O != 9 && O != 17) {
                if (O != 27) {
                    if (O == 60 || O == 68) {
                        if (x(obj, i7, i6) && !v(obj, P, f(i6))) {
                            return false;
                        }
                    } else if (O != 49) {
                        if (O == 50 && !((zzcz) h1.k(obj, P & 1048575)).isEmpty()) {
                            lh4.a(g(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) h1.k(obj, P & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    w0 f = f(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!f.b(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (u(obj, i6, i, i2, i10) && !v(obj, P, f(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (!this.f) {
            return true;
        }
        this.l.a(obj);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.w0
    public final void c(Object obj, m1 m1Var) {
        int i;
        int i2;
        int i3;
        zzew zzewVar = zzew.zza;
        int i4 = 0;
        int i5 = 1048575;
        if (this.m - 1 != 0) {
            if (this.f) {
                this.l.a(obj);
                throw null;
            }
            int length = this.a.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int P = P(i6);
                int i7 = this.a[i6];
                switch (O(P)) {
                    case 0:
                        if (t(obj, i6)) {
                            m1Var.zzf(i7, h1.f(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (t(obj, i6)) {
                            m1Var.zzo(i7, h1.g(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (t(obj, i6)) {
                            m1Var.zzt(i7, h1.i(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (t(obj, i6)) {
                            m1Var.zzJ(i7, h1.i(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (t(obj, i6)) {
                            m1Var.zzr(i7, h1.h(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (t(obj, i6)) {
                            m1Var.zzm(i7, h1.i(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (t(obj, i6)) {
                            m1Var.zzk(i7, h1.h(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (t(obj, i6)) {
                            m1Var.zzb(i7, h1.B(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (t(obj, i6)) {
                            z(i7, h1.k(obj, P & 1048575), m1Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (t(obj, i6)) {
                            m1Var.b(i7, h1.k(obj, P & 1048575), f(i6));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (t(obj, i6)) {
                            m1Var.a(i7, (zzba) h1.k(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (t(obj, i6)) {
                            m1Var.zzH(i7, h1.h(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (t(obj, i6)) {
                            m1Var.zzi(i7, h1.h(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (t(obj, i6)) {
                            m1Var.zzw(i7, h1.h(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (t(obj, i6)) {
                            m1Var.zzy(i7, h1.i(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (t(obj, i6)) {
                            m1Var.zzA(i7, h1.h(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (t(obj, i6)) {
                            m1Var.zzC(i7, h1.i(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (t(obj, i6)) {
                            m1Var.c(i7, h1.k(obj, P & 1048575), f(i6));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        y0.f(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 19:
                        y0.j(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 20:
                        y0.m(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 21:
                        y0.u(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 22:
                        y0.l(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 23:
                        y0.i(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 24:
                        y0.h(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case EventType.SUBS /* 25 */:
                        y0.d(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case EventType.CDN /* 26 */:
                        y0.s(i7, (List) h1.k(obj, P & 1048575), m1Var);
                        break;
                    case 27:
                        y0.n(i7, (List) h1.k(obj, P & 1048575), m1Var, f(i6));
                        break;
                    case 28:
                        y0.e(i7, (List) h1.k(obj, P & 1048575), m1Var);
                        break;
                    case BuildConfig.VERSION_CODE /* 29 */:
                        y0.t(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 30:
                        y0.g(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 31:
                        y0.o(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 32:
                        y0.p(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 33:
                        y0.q(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 34:
                        y0.r(i7, (List) h1.k(obj, P & 1048575), m1Var, false);
                        break;
                    case 35:
                        y0.f(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 36:
                        y0.j(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 37:
                        y0.m(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 38:
                        y0.u(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 39:
                        y0.l(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 40:
                        y0.i(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 41:
                        y0.h(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 42:
                        y0.d(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 43:
                        y0.t(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 44:
                        y0.g(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 45:
                        y0.o(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 46:
                        y0.p(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 47:
                        y0.q(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 48:
                        y0.r(i7, (List) h1.k(obj, P & 1048575), m1Var, true);
                        break;
                    case 49:
                        y0.k(i7, (List) h1.k(obj, P & 1048575), m1Var, f(i6));
                        break;
                    case 50:
                        r(m1Var, i7, h1.k(obj, P & 1048575), i6);
                        break;
                    case 51:
                        if (x(obj, i7, i6)) {
                            m1Var.zzf(i7, D(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (x(obj, i7, i6)) {
                            m1Var.zzo(i7, E(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                        if (x(obj, i7, i6)) {
                            m1Var.zzt(i7, Q(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (x(obj, i7, i6)) {
                            m1Var.zzJ(i7, Q(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (x(obj, i7, i6)) {
                            m1Var.zzr(i7, G(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (x(obj, i7, i6)) {
                            m1Var.zzm(i7, Q(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (x(obj, i7, i6)) {
                            m1Var.zzk(i7, G(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (x(obj, i7, i6)) {
                            m1Var.zzb(i7, y(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (x(obj, i7, i6)) {
                            z(i7, h1.k(obj, P & 1048575), m1Var);
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (x(obj, i7, i6)) {
                            m1Var.b(i7, h1.k(obj, P & 1048575), f(i6));
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (x(obj, i7, i6)) {
                            m1Var.a(i7, (zzba) h1.k(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (x(obj, i7, i6)) {
                            m1Var.zzH(i7, G(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (x(obj, i7, i6)) {
                            m1Var.zzi(i7, G(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (x(obj, i7, i6)) {
                            m1Var.zzw(i7, G(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (x(obj, i7, i6)) {
                            m1Var.zzy(i7, Q(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (x(obj, i7, i6)) {
                            m1Var.zzA(i7, G(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                        if (x(obj, i7, i6)) {
                            m1Var.zzC(i7, Q(obj, P & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (x(obj, i7, i6)) {
                            m1Var.c(i7, h1.k(obj, P & 1048575), f(i6));
                            break;
                        } else {
                            break;
                        }
                }
            }
            a1 a1Var = this.k;
            a1Var.i(a1Var.d(obj), m1Var);
            return;
        }
        if (this.f) {
            this.l.a(obj);
            throw null;
        }
        int length2 = this.a.length;
        Unsafe unsafe = q;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (i8 < length2) {
            int P2 = P(i8);
            int[] iArr = this.a;
            int i11 = iArr[i8];
            int O = O(P2);
            if (O <= 17) {
                int i12 = iArr[i8 + 2];
                int i13 = i12 & i5;
                if (i13 != i10) {
                    i9 = unsafe.getInt(obj, i13);
                    i10 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = i4;
            }
            long j = P2 & i5;
            switch (O) {
                case 0:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzf(i11, h1.f(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzo(i11, h1.g(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzt(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzJ(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzr(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzm(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzk(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzb(i11, h1.B(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        z(i11, unsafe.getObject(obj, j), m1Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.b(i11, unsafe.getObject(obj, j), f(i8));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.a(i11, (zzba) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzH(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzi(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzw(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzy(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzA(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.zzC(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        m1Var.c(i11, unsafe.getObject(obj, j), f(i8));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i2 = 0;
                    y0.f(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    break;
                case 19:
                    i2 = 0;
                    y0.j(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    break;
                case 20:
                    i2 = 0;
                    y0.m(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    break;
                case 21:
                    i2 = 0;
                    y0.u(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    break;
                case 22:
                    i2 = 0;
                    y0.l(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    break;
                case 23:
                    i2 = 0;
                    y0.i(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    break;
                case 24:
                    i2 = 0;
                    y0.h(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    break;
                case EventType.SUBS /* 25 */:
                    i2 = 0;
                    y0.d(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    break;
                case EventType.CDN /* 26 */:
                    y0.s(this.a[i8], (List) unsafe.getObject(obj, j), m1Var);
                    i2 = 0;
                    break;
                case 27:
                    y0.n(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, f(i8));
                    i2 = 0;
                    break;
                case 28:
                    y0.e(this.a[i8], (List) unsafe.getObject(obj, j), m1Var);
                    i2 = 0;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    i3 = 0;
                    y0.t(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    i2 = i3;
                    break;
                case 30:
                    i3 = 0;
                    y0.g(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    i2 = i3;
                    break;
                case 31:
                    i3 = 0;
                    y0.o(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    i2 = i3;
                    break;
                case 32:
                    i3 = 0;
                    y0.p(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    i2 = i3;
                    break;
                case 33:
                    i3 = 0;
                    y0.q(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    i2 = i3;
                    break;
                case 34:
                    i3 = 0;
                    y0.r(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, false);
                    i2 = i3;
                    break;
                case 35:
                    y0.f(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 36:
                    y0.j(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 37:
                    y0.m(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 38:
                    y0.u(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 39:
                    y0.l(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 40:
                    y0.i(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 41:
                    y0.h(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 42:
                    y0.d(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 43:
                    y0.t(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 44:
                    y0.g(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 45:
                    y0.o(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 46:
                    y0.p(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 47:
                    y0.q(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 48:
                    y0.r(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, true);
                    i2 = 0;
                    break;
                case 49:
                    y0.k(this.a[i8], (List) unsafe.getObject(obj, j), m1Var, f(i8));
                    i2 = 0;
                    break;
                case 50:
                    r(m1Var, i11, unsafe.getObject(obj, j), i8);
                    i2 = 0;
                    break;
                case 51:
                    if (x(obj, i11, i8)) {
                        m1Var.zzf(i11, D(obj, j));
                    }
                    i2 = 0;
                    break;
                case 52:
                    if (x(obj, i11, i8)) {
                        m1Var.zzo(i11, E(obj, j));
                    }
                    i2 = 0;
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (x(obj, i11, i8)) {
                        m1Var.zzt(i11, Q(obj, j));
                    }
                    i2 = 0;
                    break;
                case 54:
                    if (x(obj, i11, i8)) {
                        m1Var.zzJ(i11, Q(obj, j));
                    }
                    i2 = 0;
                    break;
                case 55:
                    if (x(obj, i11, i8)) {
                        m1Var.zzr(i11, G(obj, j));
                    }
                    i2 = 0;
                    break;
                case 56:
                    if (x(obj, i11, i8)) {
                        m1Var.zzm(i11, Q(obj, j));
                    }
                    i2 = 0;
                    break;
                case 57:
                    if (x(obj, i11, i8)) {
                        m1Var.zzk(i11, G(obj, j));
                    }
                    i2 = 0;
                    break;
                case 58:
                    if (x(obj, i11, i8)) {
                        m1Var.zzb(i11, y(obj, j));
                    }
                    i2 = 0;
                    break;
                case 59:
                    if (x(obj, i11, i8)) {
                        z(i11, unsafe.getObject(obj, j), m1Var);
                    }
                    i2 = 0;
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (x(obj, i11, i8)) {
                        m1Var.b(i11, unsafe.getObject(obj, j), f(i8));
                    }
                    i2 = 0;
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (x(obj, i11, i8)) {
                        m1Var.a(i11, (zzba) unsafe.getObject(obj, j));
                    }
                    i2 = 0;
                    break;
                case 62:
                    if (x(obj, i11, i8)) {
                        m1Var.zzH(i11, G(obj, j));
                    }
                    i2 = 0;
                    break;
                case 63:
                    if (x(obj, i11, i8)) {
                        m1Var.zzi(i11, G(obj, j));
                    }
                    i2 = 0;
                    break;
                case 64:
                    if (x(obj, i11, i8)) {
                        m1Var.zzw(i11, G(obj, j));
                    }
                    i2 = 0;
                    break;
                case 65:
                    if (x(obj, i11, i8)) {
                        m1Var.zzy(i11, Q(obj, j));
                    }
                    i2 = 0;
                    break;
                case 66:
                    if (x(obj, i11, i8)) {
                        m1Var.zzA(i11, G(obj, j));
                    }
                    i2 = 0;
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (x(obj, i11, i8)) {
                        m1Var.zzC(i11, Q(obj, j));
                    }
                    i2 = 0;
                    break;
                case 68:
                    if (x(obj, i11, i8)) {
                        m1Var.c(i11, unsafe.getObject(obj, j), f(i8));
                    }
                    i2 = 0;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            i8 += 3;
            i4 = i2;
            i5 = 1048575;
        }
        a1 a1Var2 = this.k;
        a1Var2.i(a1Var2.d(obj), m1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0304, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0307, code lost:
    
        r6 = r32;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0328, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x00a2. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.play_billing.e r34) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.p0.d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.play_billing.e):void");
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final int zza(Object obj) {
        int y;
        int y2;
        int z;
        int y3;
        int y4;
        int y5;
        int y6;
        int J;
        int y7;
        int z2;
        int y8;
        int y9;
        zzew zzewVar = zzew.zza;
        if (this.m - 1 == 0) {
            return F(obj);
        }
        Unsafe unsafe = q;
        int i = 0;
        for (int i2 = 0; i2 < this.a.length; i2 += 3) {
            int P = P(i2);
            int O = O(P);
            int i3 = this.a[i2];
            int i4 = P & 1048575;
            if (O >= zzbt.zzJ.zza() && O <= zzbt.zzW.zza()) {
                int i5 = this.a[i2 + 2];
            }
            long j = i4;
            switch (O) {
                case 0:
                    if (t(obj, i2)) {
                        y = o.y(i3 << 3);
                        J = y + 8;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (t(obj, i2)) {
                        y2 = o.y(i3 << 3);
                        J = y2 + 4;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (t(obj, i2)) {
                        z = o.z(h1.i(obj, j));
                        y3 = o.y(i3 << 3);
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (t(obj, i2)) {
                        z = o.z(h1.i(obj, j));
                        y3 = o.y(i3 << 3);
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (t(obj, i2)) {
                        z = o.v(h1.h(obj, j));
                        y3 = o.y(i3 << 3);
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (t(obj, i2)) {
                        y = o.y(i3 << 3);
                        J = y + 8;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (t(obj, i2)) {
                        y2 = o.y(i3 << 3);
                        J = y2 + 4;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (t(obj, i2)) {
                        y4 = o.y(i3 << 3);
                        J = y4 + 1;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (t(obj, i2)) {
                        Object k = h1.k(obj, j);
                        if (k instanceof zzba) {
                            int i6 = i3 << 3;
                            int i7 = o.d;
                            int e = ((zzba) k).e();
                            y5 = o.y(e) + e;
                            y6 = o.y(i6);
                            J = y6 + y5;
                            i += J;
                            break;
                        } else {
                            z = o.x((String) k);
                            y3 = o.y(i3 << 3);
                            i += y3 + z;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (t(obj, i2)) {
                        J = y0.J(i3, h1.k(obj, j), f(i2));
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (t(obj, i2)) {
                        zzba zzbaVar = (zzba) h1.k(obj, j);
                        int i8 = i3 << 3;
                        int i9 = o.d;
                        int e2 = zzbaVar.e();
                        y5 = o.y(e2) + e2;
                        y6 = o.y(i8);
                        J = y6 + y5;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (t(obj, i2)) {
                        z = o.y(h1.h(obj, j));
                        y3 = o.y(i3 << 3);
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (t(obj, i2)) {
                        z = o.v(h1.h(obj, j));
                        y3 = o.y(i3 << 3);
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (t(obj, i2)) {
                        y2 = o.y(i3 << 3);
                        J = y2 + 4;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (t(obj, i2)) {
                        y = o.y(i3 << 3);
                        J = y + 8;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (t(obj, i2)) {
                        int h = h1.h(obj, j);
                        y3 = o.y(i3 << 3);
                        z = o.y((h >> 31) ^ (h + h));
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (t(obj, i2)) {
                        long i10 = h1.i(obj, j);
                        y7 = o.y(i3 << 3);
                        z2 = o.z((i10 + i10) ^ (i10 >> 63));
                        J = y7 + z2;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (t(obj, i2)) {
                        J = o.u(i3, (sbc) h1.k(obj, j), f(i2));
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    J = y0.C(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 19:
                    J = y0.A(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 20:
                    J = y0.H(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 21:
                    J = y0.S(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 22:
                    J = y0.F(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 23:
                    J = y0.C(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 24:
                    J = y0.A(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case EventType.SUBS /* 25 */:
                    J = y0.w(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case EventType.CDN /* 26 */:
                    J = y0.P(i3, (List) h1.k(obj, j));
                    i += J;
                    break;
                case 27:
                    J = y0.K(i3, (List) h1.k(obj, j), f(i2));
                    i += J;
                    break;
                case 28:
                    J = y0.x(i3, (List) h1.k(obj, j));
                    i += J;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    J = y0.Q(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 30:
                    J = y0.y(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 31:
                    J = y0.A(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 32:
                    J = y0.C(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 33:
                    J = y0.L(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 34:
                    J = y0.N(i3, (List) h1.k(obj, j), false);
                    i += J;
                    break;
                case 35:
                    z = y0.D((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i11 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i11);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    z = y0.B((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i12 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i12);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    z = y0.I((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i13 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i13);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    z = y0.T((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i14 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i14);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    z = y0.G((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i15 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i15);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    z = y0.D((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i16 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i16);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    z = y0.B((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i17 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i17);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i18 = y0.d;
                    z = list.size();
                    if (z > 0) {
                        int i19 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i19);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    z = y0.R((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i20 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i20);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    z = y0.z((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i21 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i21);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    z = y0.B((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i22 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i22);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    z = y0.D((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i23 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i23);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    z = y0.M((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i24 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i24);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    z = y0.O((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        int i25 = i3 << 3;
                        y8 = o.y(z);
                        y9 = o.y(i25);
                        y3 = y9 + y8;
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    J = y0.E(i3, (List) h1.k(obj, j), f(i2));
                    i += J;
                    break;
                case 50:
                    k0.a(i3, h1.k(obj, j), g(i2));
                    break;
                case 51:
                    if (x(obj, i3, i2)) {
                        y = o.y(i3 << 3);
                        J = y + 8;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (x(obj, i3, i2)) {
                        y2 = o.y(i3 << 3);
                        J = y2 + 4;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (x(obj, i3, i2)) {
                        z = o.z(Q(obj, j));
                        y3 = o.y(i3 << 3);
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (x(obj, i3, i2)) {
                        z = o.z(Q(obj, j));
                        y3 = o.y(i3 << 3);
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (x(obj, i3, i2)) {
                        z = o.v(G(obj, j));
                        y3 = o.y(i3 << 3);
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (x(obj, i3, i2)) {
                        y = o.y(i3 << 3);
                        J = y + 8;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (x(obj, i3, i2)) {
                        y2 = o.y(i3 << 3);
                        J = y2 + 4;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (x(obj, i3, i2)) {
                        y4 = o.y(i3 << 3);
                        J = y4 + 1;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (x(obj, i3, i2)) {
                        Object k2 = h1.k(obj, j);
                        if (k2 instanceof zzba) {
                            int i26 = i3 << 3;
                            int i27 = o.d;
                            int e3 = ((zzba) k2).e();
                            y5 = o.y(e3) + e3;
                            y6 = o.y(i26);
                            J = y6 + y5;
                            i += J;
                            break;
                        } else {
                            z = o.x((String) k2);
                            y3 = o.y(i3 << 3);
                            i += y3 + z;
                            break;
                        }
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (x(obj, i3, i2)) {
                        J = y0.J(i3, h1.k(obj, j), f(i2));
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (x(obj, i3, i2)) {
                        zzba zzbaVar2 = (zzba) h1.k(obj, j);
                        int i28 = i3 << 3;
                        int i29 = o.d;
                        int e4 = zzbaVar2.e();
                        y5 = o.y(e4) + e4;
                        y6 = o.y(i28);
                        J = y6 + y5;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (x(obj, i3, i2)) {
                        z = o.y(G(obj, j));
                        y3 = o.y(i3 << 3);
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (x(obj, i3, i2)) {
                        z = o.v(G(obj, j));
                        y3 = o.y(i3 << 3);
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (x(obj, i3, i2)) {
                        y2 = o.y(i3 << 3);
                        J = y2 + 4;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (x(obj, i3, i2)) {
                        y = o.y(i3 << 3);
                        J = y + 8;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (x(obj, i3, i2)) {
                        int G = G(obj, j);
                        y3 = o.y(i3 << 3);
                        z = o.y((G >> 31) ^ (G + G));
                        i += y3 + z;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (x(obj, i3, i2)) {
                        long Q = Q(obj, j);
                        y7 = o.y(i3 << 3);
                        z2 = o.z((Q + Q) ^ (Q >> 63));
                        J = y7 + z2;
                        i += J;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (x(obj, i3, i2)) {
                        J = o.u(i3, (sbc) h1.k(obj, j), f(i2));
                        i += J;
                        break;
                    } else {
                        break;
                    }
            }
        }
        a1 a1Var = this.k;
        return i + a1Var.a(a1Var.d(obj));
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int P = P(i3);
            int i4 = this.a[i3];
            long j = 1048575 & P;
            int i5 = 37;
            switch (O(P)) {
                case 0:
                    i = i2 * 53;
                    doubleToLongBits = Double.doubleToLongBits(h1.f(obj, j));
                    byte[] bArr = b0.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = Float.floatToIntBits(h1.g(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = h1.i(obj, j);
                    byte[] bArr2 = b0.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = h1.i(obj, j);
                    byte[] bArr3 = b0.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = h1.h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = h1.i(obj, j);
                    byte[] bArr4 = b0.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = h1.h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = b0.a(h1.B(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((String) h1.k(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    Object k = h1.k(obj, j);
                    if (k != null) {
                        i5 = k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = h1.k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = h1.h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = h1.h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = h1.h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = h1.i(obj, j);
                    byte[] bArr5 = b0.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = h1.h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = h1.i(obj, j);
                    byte[] bArr6 = b0.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    Object k2 = h1.k(obj, j);
                    if (k2 != null) {
                        i5 = k2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case EventType.SUBS /* 25 */:
                case EventType.CDN /* 26 */:
                case 27:
                case 28:
                case BuildConfig.VERSION_CODE /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    floatToIntBits = h1.k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = h1.k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 51:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Double.doubleToLongBits(D(obj, j));
                        byte[] bArr7 = b0.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = Float.floatToIntBits(E(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Q(obj, j);
                        byte[] bArr8 = b0.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Q(obj, j);
                        byte[] bArr9 = b0.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = G(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Q(obj, j);
                        byte[] bArr10 = b0.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = G(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = b0.a(y(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((String) h1.k(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = h1.k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = h1.k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = G(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = G(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = G(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Q(obj, j);
                        byte[] bArr11 = b0.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = G(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Q(obj, j);
                        byte[] bArr12 = b0.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (x(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = h1.k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.k.d(obj).hashCode();
        if (!this.f) {
            return hashCode;
        }
        this.l.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final Object zze() {
        return ((z) this.e).g();
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final void zzf(Object obj) {
        if (w(obj)) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                zVar.n(Integer.MAX_VALUE);
                zVar.zza = 0;
                zVar.l();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int P = P(i);
                int i2 = 1048575 & P;
                int O = O(P);
                long j = i2;
                if (O != 9) {
                    if (O != 60 && O != 68) {
                        switch (O) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case EventType.SUBS /* 25 */:
                            case EventType.CDN /* 26 */:
                            case 27:
                            case 28:
                            case BuildConfig.VERSION_CODE /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.j.a(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = q;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzcz) object).d();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (x(obj, this.a[i], i)) {
                        f(i).zzf(q.getObject(obj, j));
                    }
                }
                if (t(obj, i)) {
                    f(i).zzf(q.getObject(obj, j));
                }
            }
            this.k.g(obj);
            if (this.f) {
                this.l.b(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final void zzg(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int P = P(i);
            int i2 = this.a[i];
            long j = 1048575 & P;
            switch (O(P)) {
                case 0:
                    if (t(obj2, i)) {
                        h1.t(obj, j, h1.f(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (t(obj2, i)) {
                        h1.u(obj, j, h1.g(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (t(obj2, i)) {
                        h1.w(obj, j, h1.i(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (t(obj2, i)) {
                        h1.w(obj, j, h1.i(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (t(obj2, i)) {
                        h1.v(obj, j, h1.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (t(obj2, i)) {
                        h1.w(obj, j, h1.i(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (t(obj2, i)) {
                        h1.v(obj, j, h1.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (t(obj2, i)) {
                        h1.r(obj, j, h1.B(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (t(obj2, i)) {
                        h1.x(obj, j, h1.k(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    l(obj, obj2, i);
                    break;
                case 10:
                    if (t(obj2, i)) {
                        h1.x(obj, j, h1.k(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (t(obj2, i)) {
                        h1.v(obj, j, h1.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (t(obj2, i)) {
                        h1.v(obj, j, h1.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (t(obj2, i)) {
                        h1.v(obj, j, h1.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (t(obj2, i)) {
                        h1.w(obj, j, h1.i(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (t(obj2, i)) {
                        h1.v(obj, j, h1.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (t(obj2, i)) {
                        h1.w(obj, j, h1.i(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    l(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case EventType.SUBS /* 25 */:
                case EventType.CDN /* 26 */:
                case 27:
                case 28:
                case BuildConfig.VERSION_CODE /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.j.b(obj, obj2, j);
                    break;
                case 50:
                    int i3 = y0.d;
                    h1.x(obj, j, k0.b(h1.k(obj, j), h1.k(obj2, j)));
                    break;
                case 51:
                case 52:
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (x(obj2, i2, i)) {
                        h1.x(obj, j, h1.k(obj2, j));
                        o(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    m(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (x(obj2, i2, i)) {
                        h1.x(obj, j, h1.k(obj2, j));
                        o(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m(obj, obj2, i);
                    break;
            }
        }
        y0.b(this.k, obj, obj2);
        if (this.f) {
            this.l.a(obj2);
            throw null;
        }
    }
}
