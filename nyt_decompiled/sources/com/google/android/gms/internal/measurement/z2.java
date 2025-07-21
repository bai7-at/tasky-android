package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.cef;
import defpackage.kbf;
import defpackage.lh4;
import defpackage.tbf;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class z2 implements h3 {
    private static final int[] p = new int[0];
    private static final Unsafe q = s3.l();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final cef e;
    private final boolean f;
    private final boolean g;
    private final int[] h;
    private final int i;
    private final int j;
    private final p2 k;
    private final l3 l;
    private final d2 m;
    private final b3 n;
    private final u2 o;

    private z2(int[] iArr, Object[] objArr, int i, int i2, cef cefVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, b3 b3Var, p2 p2Var, l3 l3Var, d2 d2Var, u2 u2Var, byte[] bArr) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = z;
        boolean z3 = false;
        if (d2Var != null && d2Var.c(cefVar)) {
            z3 = true;
        }
        this.f = z3;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.n = b3Var;
        this.k = p2Var;
        this.l = l3Var;
        this.m = d2Var;
        this.e = cefVar;
        this.o = u2Var;
    }

    static z2 A(Class cls, w2 w2Var, b3 b3Var, p2 p2Var, l3 l3Var, d2 d2Var, u2 u2Var) {
        if (w2Var instanceof g3) {
            return B((g3) w2Var, b3Var, p2Var, l3Var, d2Var, u2Var);
        }
        lh4.a(w2Var);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.measurement.z2 B(com.google.android.gms.internal.measurement.g3 r34, com.google.android.gms.internal.measurement.b3 r35, com.google.android.gms.internal.measurement.p2 r36, com.google.android.gms.internal.measurement.l3 r37, com.google.android.gms.internal.measurement.d2 r38, com.google.android.gms.internal.measurement.u2 r39) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.z2.B(com.google.android.gms.internal.measurement.g3, com.google.android.gms.internal.measurement.b3, com.google.android.gms.internal.measurement.p2, com.google.android.gms.internal.measurement.l3, com.google.android.gms.internal.measurement.d2, com.google.android.gms.internal.measurement.u2):com.google.android.gms.internal.measurement.z2");
    }

    private static double C(Object obj, long j) {
        return ((Double) s3.k(obj, j)).doubleValue();
    }

    private static float D(Object obj, long j) {
        return ((Float) s3.k(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int E(Object obj) {
        int i;
        int a;
        int a2;
        int a3;
        int b;
        int a4;
        int z;
        int a5;
        int a6;
        int e;
        int a7;
        int i2;
        int W;
        boolean z2;
        int F;
        int K;
        int C;
        int a8;
        int i3;
        int a9;
        int a10;
        int a11;
        int b2;
        int a12;
        int e2;
        int a13;
        int i4;
        Unsafe unsafe = q;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < this.a.length) {
            int f = f(i7);
            int[] iArr = this.a;
            int i10 = iArr[i7];
            int e3 = e(f);
            if (e3 <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i5;
                i = 1 << (i11 >>> 20);
                if (i12 != i6) {
                    i9 = unsafe.getInt(obj, i12);
                    i6 = i12;
                }
            } else {
                i = 0;
            }
            long j = f & i5;
            switch (e3) {
                case 0:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a = b2.a(i10 << 3);
                        a5 = a + 8;
                        i8 += a5;
                        break;
                    }
                case 1:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a2 = b2.a(i10 << 3);
                        a5 = a2 + 4;
                        i8 += a5;
                        break;
                    }
                case 2:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        a3 = b2.a(i10 << 3);
                        b = b2.b(j2);
                        i8 += a3 + b;
                        break;
                    }
                case 3:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        a3 = b2.a(i10 << 3);
                        b = b2.b(j3);
                        i8 += a3 + b;
                        break;
                    }
                case 4:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        a4 = b2.a(i10 << 3);
                        z = b2.z(i13);
                        i2 = a4 + z;
                        i8 += i2;
                        break;
                    }
                case 5:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a = b2.a(i10 << 3);
                        a5 = a + 8;
                        i8 += a5;
                        break;
                    }
                case 6:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a2 = b2.a(i10 << 3);
                        a5 = a2 + 4;
                        i8 += a5;
                        break;
                    }
                case 7:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a5 = b2.a(i10 << 3) + 1;
                        i8 += a5;
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzjb) {
                            a6 = b2.a(i10 << 3);
                            e = ((zzjb) object).e();
                            a7 = b2.a(e);
                            i2 = a6 + a7 + e;
                            i8 += i2;
                            break;
                        } else {
                            a4 = b2.a(i10 << 3);
                            z = b2.B((String) object);
                            i2 = a4 + z;
                            i8 += i2;
                        }
                    }
                case 9:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a5 = j3.Q(i10, unsafe.getObject(obj, j), i(i7));
                        i8 += a5;
                        break;
                    }
                case 10:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j);
                        a6 = b2.a(i10 << 3);
                        e = zzjbVar.e();
                        a7 = b2.a(e);
                        i2 = a6 + a7 + e;
                        i8 += i2;
                        break;
                    }
                case 11:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        a4 = b2.a(i10 << 3);
                        z = b2.a(i14);
                        i2 = a4 + z;
                        i8 += i2;
                        break;
                    }
                case 12:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        a4 = b2.a(i10 << 3);
                        z = b2.z(i15);
                        i2 = a4 + z;
                        i8 += i2;
                        break;
                    }
                case 13:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a2 = b2.a(i10 << 3);
                        a5 = a2 + 4;
                        i8 += a5;
                        break;
                    }
                case 14:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a = b2.a(i10 << 3);
                        a5 = a + 8;
                        i8 += a5;
                        break;
                    }
                case 15:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        a4 = b2.a(i10 << 3);
                        z = b2.a((i16 >> 31) ^ (i16 + i16));
                        i2 = a4 + z;
                        i8 += i2;
                        break;
                    }
                case 16:
                    if ((i & i9) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i8 += b2.a(i10 << 3) + b2.b((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a5 = b2.y(i10, (cef) unsafe.getObject(obj, j), i(i7));
                        i8 += a5;
                        break;
                    }
                case 18:
                    a5 = j3.J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 19:
                    a5 = j3.H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 20:
                    a5 = j3.O(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 21:
                    a5 = j3.Z(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 22:
                    a5 = j3.M(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 23:
                    a5 = j3.J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 24:
                    a5 = j3.H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case EventType.SUBS /* 25 */:
                    a5 = j3.A(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case EventType.CDN /* 26 */:
                    W = j3.W(i10, (List) unsafe.getObject(obj, j));
                    i8 += W;
                    break;
                case 27:
                    W = j3.R(i10, (List) unsafe.getObject(obj, j), i(i7));
                    i8 += W;
                    break;
                case 28:
                    W = j3.E(i10, (List) unsafe.getObject(obj, j));
                    i8 += W;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    W = j3.X(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += W;
                    break;
                case 30:
                    z2 = false;
                    F = j3.F(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += F;
                    break;
                case 31:
                    z2 = false;
                    F = j3.H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += F;
                    break;
                case 32:
                    z2 = false;
                    F = j3.J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += F;
                    break;
                case 33:
                    z2 = false;
                    F = j3.S(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += F;
                    break;
                case 34:
                    z2 = false;
                    F = j3.U(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += F;
                    break;
                case 35:
                    K = j3.K((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 36:
                    K = j3.I((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 37:
                    K = j3.P((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 38:
                    K = j3.a0((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 39:
                    K = j3.N((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 40:
                    K = j3.K((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 41:
                    K = j3.I((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 42:
                    K = j3.D((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 43:
                    K = j3.Y((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 44:
                    K = j3.G((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 45:
                    K = j3.I((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 46:
                    K = j3.K((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 47:
                    K = j3.T((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 48:
                    K = j3.V((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = b2.C(i10);
                        a8 = b2.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 49:
                    W = j3.L(i10, (List) unsafe.getObject(obj, j), i(i7));
                    i8 += W;
                    break;
                case 50:
                    u2.a(i10, unsafe.getObject(obj, j), j(i7));
                    break;
                case 51:
                    if (v(obj, i10, i7)) {
                        a9 = b2.a(i10 << 3);
                        W = a9 + 8;
                        i8 += W;
                    }
                    break;
                case 52:
                    if (v(obj, i10, i7)) {
                        a10 = b2.a(i10 << 3);
                        W = a10 + 4;
                        i8 += W;
                    }
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (v(obj, i10, i7)) {
                        long g = g(obj, j);
                        a11 = b2.a(i10 << 3);
                        b2 = b2.b(g);
                        i8 += a11 + b2;
                    }
                    break;
                case 54:
                    if (v(obj, i10, i7)) {
                        long g2 = g(obj, j);
                        a11 = b2.a(i10 << 3);
                        b2 = b2.b(g2);
                        i8 += a11 + b2;
                    }
                    break;
                case 55:
                    if (v(obj, i10, i7)) {
                        int G = G(obj, j);
                        i3 = b2.a(i10 << 3);
                        K = b2.z(G);
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 56:
                    if (v(obj, i10, i7)) {
                        a9 = b2.a(i10 << 3);
                        W = a9 + 8;
                        i8 += W;
                    }
                    break;
                case 57:
                    if (v(obj, i10, i7)) {
                        a10 = b2.a(i10 << 3);
                        W = a10 + 4;
                        i8 += W;
                    }
                    break;
                case 58:
                    if (v(obj, i10, i7)) {
                        W = b2.a(i10 << 3) + 1;
                        i8 += W;
                    }
                    break;
                case 59:
                    if (v(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjb) {
                            a12 = b2.a(i10 << 3);
                            e2 = ((zzjb) object2).e();
                            a13 = b2.a(e2);
                            i4 = a12 + a13 + e2;
                            i8 += i4;
                        } else {
                            i3 = b2.a(i10 << 3);
                            K = b2.B((String) object2);
                            i4 = i3 + K;
                            i8 += i4;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (v(obj, i10, i7)) {
                        W = j3.Q(i10, unsafe.getObject(obj, j), i(i7));
                        i8 += W;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (v(obj, i10, i7)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j);
                        a12 = b2.a(i10 << 3);
                        e2 = zzjbVar2.e();
                        a13 = b2.a(e2);
                        i4 = a12 + a13 + e2;
                        i8 += i4;
                    }
                    break;
                case 62:
                    if (v(obj, i10, i7)) {
                        int G2 = G(obj, j);
                        i3 = b2.a(i10 << 3);
                        K = b2.a(G2);
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 63:
                    if (v(obj, i10, i7)) {
                        int G3 = G(obj, j);
                        i3 = b2.a(i10 << 3);
                        K = b2.z(G3);
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 64:
                    if (v(obj, i10, i7)) {
                        a10 = b2.a(i10 << 3);
                        W = a10 + 4;
                        i8 += W;
                    }
                    break;
                case 65:
                    if (v(obj, i10, i7)) {
                        a9 = b2.a(i10 << 3);
                        W = a9 + 8;
                        i8 += W;
                    }
                    break;
                case 66:
                    if (v(obj, i10, i7)) {
                        int G4 = G(obj, j);
                        i3 = b2.a(i10 << 3);
                        K = b2.a((G4 >> 31) ^ (G4 + G4));
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (v(obj, i10, i7)) {
                        long g3 = g(obj, j);
                        i8 += b2.a(i10 << 3) + b2.b((g3 >> 63) ^ (g3 + g3));
                    }
                    break;
                case 68:
                    if (v(obj, i10, i7)) {
                        W = b2.y(i10, (cef) unsafe.getObject(obj, j), i(i7));
                        i8 += W;
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        l3 l3Var = this.l;
        int a14 = i8 + l3Var.a(l3Var.c(obj));
        if (!this.f) {
            return a14;
        }
        this.m.a(obj);
        throw null;
    }

    private final int F(Object obj) {
        int a;
        int a2;
        int a3;
        int b;
        int a4;
        int z;
        int a5;
        int a6;
        int e;
        int a7;
        int Q;
        int C;
        int a8;
        int i;
        Unsafe unsafe = q;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.length; i3 += 3) {
            int f = f(i3);
            int e2 = e(f);
            int i4 = this.a[i3];
            long j = f & 1048575;
            if (e2 >= zzju.zzJ.zza() && e2 <= zzju.zzW.zza()) {
                int i5 = this.a[i3 + 2];
            }
            switch (e2) {
                case 0:
                    if (s(obj, i3)) {
                        a = b2.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(obj, i3)) {
                        a2 = b2.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (s(obj, i3)) {
                        long i6 = s3.i(obj, j);
                        a3 = b2.a(i4 << 3);
                        b = b2.b(i6);
                        i2 += a3 + b;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (s(obj, i3)) {
                        long i7 = s3.i(obj, j);
                        a3 = b2.a(i4 << 3);
                        b = b2.b(i7);
                        i2 += a3 + b;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (s(obj, i3)) {
                        int h = s3.h(obj, j);
                        a4 = b2.a(i4 << 3);
                        z = b2.z(h);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (s(obj, i3)) {
                        a = b2.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (s(obj, i3)) {
                        a2 = b2.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (s(obj, i3)) {
                        a5 = b2.a(i4 << 3);
                        Q = a5 + 1;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!s(obj, i3)) {
                        break;
                    } else {
                        Object k = s3.k(obj, j);
                        if (k instanceof zzjb) {
                            a6 = b2.a(i4 << 3);
                            e = ((zzjb) k).e();
                            a7 = b2.a(e);
                            i = a6 + a7 + e;
                            i2 += i;
                            break;
                        } else {
                            a4 = b2.a(i4 << 3);
                            z = b2.B((String) k);
                            i = a4 + z;
                            i2 += i;
                        }
                    }
                case 9:
                    if (s(obj, i3)) {
                        Q = j3.Q(i4, s3.k(obj, j), i(i3));
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (s(obj, i3)) {
                        zzjb zzjbVar = (zzjb) s3.k(obj, j);
                        a6 = b2.a(i4 << 3);
                        e = zzjbVar.e();
                        a7 = b2.a(e);
                        i = a6 + a7 + e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (s(obj, i3)) {
                        int h2 = s3.h(obj, j);
                        a4 = b2.a(i4 << 3);
                        z = b2.a(h2);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (s(obj, i3)) {
                        int h3 = s3.h(obj, j);
                        a4 = b2.a(i4 << 3);
                        z = b2.z(h3);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (s(obj, i3)) {
                        a2 = b2.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (s(obj, i3)) {
                        a = b2.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (s(obj, i3)) {
                        int h4 = s3.h(obj, j);
                        a4 = b2.a(i4 << 3);
                        z = b2.a((h4 >> 31) ^ (h4 + h4));
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (s(obj, i3)) {
                        long i8 = s3.i(obj, j);
                        a4 = b2.a(i4 << 3);
                        z = b2.b((i8 >> 63) ^ (i8 + i8));
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (s(obj, i3)) {
                        Q = b2.y(i4, (cef) s3.k(obj, j), i(i3));
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    Q = j3.J(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 19:
                    Q = j3.H(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 20:
                    Q = j3.O(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 21:
                    Q = j3.Z(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 22:
                    Q = j3.M(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 23:
                    Q = j3.J(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 24:
                    Q = j3.H(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case EventType.SUBS /* 25 */:
                    Q = j3.A(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case EventType.CDN /* 26 */:
                    Q = j3.W(i4, (List) s3.k(obj, j));
                    i2 += Q;
                    break;
                case 27:
                    Q = j3.R(i4, (List) s3.k(obj, j), i(i3));
                    i2 += Q;
                    break;
                case 28:
                    Q = j3.E(i4, (List) s3.k(obj, j));
                    i2 += Q;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    Q = j3.X(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 30:
                    Q = j3.F(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 31:
                    Q = j3.H(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 32:
                    Q = j3.J(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 33:
                    Q = j3.S(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 34:
                    Q = j3.U(i4, (List) s3.k(obj, j), false);
                    i2 += Q;
                    break;
                case 35:
                    z = j3.K((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    z = j3.I((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    z = j3.P((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    z = j3.a0((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    z = j3.N((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    z = j3.K((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    z = j3.I((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    z = j3.D((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    z = j3.Y((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    z = j3.G((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    z = j3.I((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    z = j3.K((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    z = j3.T((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    z = j3.V((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = b2.C(i4);
                        a8 = b2.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    Q = j3.L(i4, (List) s3.k(obj, j), i(i3));
                    i2 += Q;
                    break;
                case 50:
                    u2.a(i4, s3.k(obj, j), j(i3));
                    break;
                case 51:
                    if (v(obj, i4, i3)) {
                        a = b2.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(obj, i4, i3)) {
                        a2 = b2.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (v(obj, i4, i3)) {
                        long g = g(obj, j);
                        a3 = b2.a(i4 << 3);
                        b = b2.b(g);
                        i2 += a3 + b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(obj, i4, i3)) {
                        long g2 = g(obj, j);
                        a3 = b2.a(i4 << 3);
                        b = b2.b(g2);
                        i2 += a3 + b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(obj, i4, i3)) {
                        int G = G(obj, j);
                        a4 = b2.a(i4 << 3);
                        z = b2.z(G);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(obj, i4, i3)) {
                        a = b2.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(obj, i4, i3)) {
                        a2 = b2.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(obj, i4, i3)) {
                        a5 = b2.a(i4 << 3);
                        Q = a5 + 1;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!v(obj, i4, i3)) {
                        break;
                    } else {
                        Object k2 = s3.k(obj, j);
                        if (k2 instanceof zzjb) {
                            a6 = b2.a(i4 << 3);
                            e = ((zzjb) k2).e();
                            a7 = b2.a(e);
                            i = a6 + a7 + e;
                            i2 += i;
                            break;
                        } else {
                            a4 = b2.a(i4 << 3);
                            z = b2.B((String) k2);
                            i = a4 + z;
                            i2 += i;
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (v(obj, i4, i3)) {
                        Q = j3.Q(i4, s3.k(obj, j), i(i3));
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (v(obj, i4, i3)) {
                        zzjb zzjbVar2 = (zzjb) s3.k(obj, j);
                        a6 = b2.a(i4 << 3);
                        e = zzjbVar2.e();
                        a7 = b2.a(e);
                        i = a6 + a7 + e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(obj, i4, i3)) {
                        int G2 = G(obj, j);
                        a4 = b2.a(i4 << 3);
                        z = b2.a(G2);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(obj, i4, i3)) {
                        int G3 = G(obj, j);
                        a4 = b2.a(i4 << 3);
                        z = b2.z(G3);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(obj, i4, i3)) {
                        a2 = b2.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(obj, i4, i3)) {
                        a = b2.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(obj, i4, i3)) {
                        int G4 = G(obj, j);
                        a4 = b2.a(i4 << 3);
                        z = b2.a((G4 >> 31) ^ (G4 + G4));
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (v(obj, i4, i3)) {
                        long g3 = g(obj, j);
                        a4 = b2.a(i4 << 3);
                        z = b2.b((g3 >> 63) ^ (g3 + g3));
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(obj, i4, i3)) {
                        Q = b2.y(i4, (cef) s3.k(obj, j), i(i3));
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        l3 l3Var = this.l;
        return i2 + l3Var.a(l3Var.c(obj));
    }

    private static int G(Object obj, long j) {
        return ((Integer) s3.k(obj, j)).intValue();
    }

    private final int H(Object obj, byte[] bArr, int i, int i2, int i3, long j, s1 s1Var) {
        Unsafe unsafe = q;
        Object j2 = j(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzld) object).h()) {
            zzld c = zzld.a().c();
            u2.b(c, object);
            unsafe.putObject(obj, j, c);
        }
        lh4.a(j2);
        throw null;
    }

    private final int I(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, s1 s1Var) {
        Unsafe unsafe = q;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(t1.n(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(t1.b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
            case 54:
                if (i5 == 0) {
                    int m = t1.m(bArr, i, s1Var);
                    unsafe.putObject(obj, j, Long.valueOf(s1Var.b));
                    unsafe.putInt(obj, j2, i4);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int j3 = t1.j(bArr, i, s1Var);
                    unsafe.putObject(obj, j, Integer.valueOf(s1Var.a));
                    unsafe.putInt(obj, j2, i4);
                    return j3;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(t1.n(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(t1.b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m2 = t1.m(bArr, i, s1Var);
                    unsafe.putObject(obj, j, Boolean.valueOf(s1Var.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int j4 = t1.j(bArr, i, s1Var);
                    int i9 = s1Var.a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !w3.f(bArr, j4, j4 + i9)) {
                            throw zzkm.c();
                        }
                        unsafe.putObject(obj, j, new String(bArr, j4, i9, l2.b));
                        j4 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return j4;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 == 2) {
                    int d = t1.d(i(i8), bArr, i, i2, s1Var);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, s1Var.c);
                    } else {
                        unsafe.putObject(obj, j, l2.g(object, s1Var.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return d;
                }
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 == 2) {
                    int a = t1.a(bArr, i, s1Var);
                    unsafe.putObject(obj, j, s1Var.c);
                    unsafe.putInt(obj, j2, i4);
                    return a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int j5 = t1.j(bArr, i, s1Var);
                    int i10 = s1Var.a;
                    kbf h = h(i8);
                    if (h == null || h.zza(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        z(obj).h(i3, Long.valueOf(i10));
                    }
                    return j5;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int j6 = t1.j(bArr, i, s1Var);
                    unsafe.putObject(obj, j, Integer.valueOf(z1.a(s1Var.a)));
                    unsafe.putInt(obj, j2, i4);
                    return j6;
                }
                break;
            case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                if (i5 == 0) {
                    int m3 = t1.m(bArr, i, s1Var);
                    unsafe.putObject(obj, j, Long.valueOf(z1.b(s1Var.b)));
                    unsafe.putInt(obj, j2, i4);
                    return m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int c = t1.c(i(i8), bArr, i, i2, (i3 & (-8)) | 4, s1Var);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, s1Var.c);
                    } else {
                        unsafe.putObject(obj, j, l2.g(object2, s1Var.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return c;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0081. Please report as an issue. */
    private final int J(Object obj, byte[] bArr, int i, int i2, s1 s1Var) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Unsafe unsafe;
        int i8;
        int i9;
        int i10;
        int i11;
        int m;
        int d;
        int i12;
        int i13;
        int i14;
        z2 z2Var = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i15 = i2;
        s1 s1Var2 = s1Var;
        Unsafe unsafe2 = q;
        int i16 = 1048575;
        int i17 = -1;
        int i18 = i;
        int i19 = -1;
        int i20 = 1048575;
        int i21 = 0;
        int i22 = 0;
        while (i18 < i15) {
            int i23 = i18 + 1;
            byte b = bArr2[i18];
            if (b < 0) {
                i4 = t1.k(b, bArr2, i23, s1Var2);
                i3 = s1Var2.a;
            } else {
                i3 = b;
                i4 = i23;
            }
            int i24 = i3 >>> 3;
            int i25 = i3 & 7;
            int M = i24 > i19 ? z2Var.M(i24, i21 / 3) : z2Var.L(i24);
            if (M == i17) {
                i5 = i4;
                i6 = i24;
                i7 = i17;
                unsafe = unsafe2;
                i8 = 0;
            } else {
                int[] iArr = z2Var.a;
                int i26 = iArr[M + 1];
                int e = e(i26);
                long j = i26 & i16;
                if (e <= 17) {
                    int i27 = iArr[M + 2];
                    int i28 = 1 << (i27 >>> 20);
                    int i29 = i27 & 1048575;
                    if (i29 != i20) {
                        if (i20 != 1048575) {
                            unsafe2.putInt(obj2, i20, i22);
                        }
                        if (i29 != 1048575) {
                            i22 = unsafe2.getInt(obj2, i29);
                        }
                        i20 = i29;
                    }
                    switch (e) {
                        case 0:
                            s1Var2 = s1Var;
                            i9 = M;
                            i10 = i4;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 1) {
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                s3.t(obj2, j, Double.longBitsToDouble(t1.n(bArr2, i10)));
                                i18 = i10 + 8;
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 1:
                            s1Var2 = s1Var;
                            i9 = M;
                            i10 = i4;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 5) {
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                s3.u(obj2, j, Float.intBitsToFloat(t1.b(bArr2, i10)));
                                i18 = i10 + 4;
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            s1Var2 = s1Var;
                            i9 = M;
                            i10 = i4;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 0) {
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                m = t1.m(bArr2, i10, s1Var2);
                                unsafe2.putLong(obj, j, s1Var2.b);
                                i22 |= i28;
                                i18 = m;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            s1Var2 = s1Var;
                            i9 = M;
                            i10 = i4;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 0) {
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                i18 = t1.j(bArr2, i10, s1Var2);
                                unsafe2.putInt(obj2, j, s1Var2.a);
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            s1Var2 = s1Var;
                            i9 = M;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 1) {
                                i10 = i4;
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                i10 = i4;
                                unsafe2.putLong(obj, j, t1.n(bArr2, i4));
                                i18 = i10 + 8;
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            s1Var2 = s1Var;
                            i9 = M;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 5) {
                                i10 = i4;
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j, t1.b(bArr2, i4));
                                i18 = i4 + 4;
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 7:
                            s1Var2 = s1Var;
                            i9 = M;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 0) {
                                i10 = i4;
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                i18 = t1.m(bArr2, i4, s1Var2);
                                s3.r(obj2, j, s1Var2.b != 0);
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 8:
                            s1Var2 = s1Var;
                            i9 = M;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 2) {
                                i10 = i4;
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                i18 = (536870912 & i26) == 0 ? t1.g(bArr2, i4, s1Var2) : t1.h(bArr2, i4, s1Var2);
                                unsafe2.putObject(obj2, j, s1Var2.c);
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 9:
                            s1Var2 = s1Var;
                            i9 = M;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 2) {
                                i10 = i4;
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                d = t1.d(z2Var.i(i9), bArr2, i4, i15, s1Var2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, s1Var2.c);
                                } else {
                                    unsafe2.putObject(obj2, j, l2.g(object, s1Var2.c));
                                }
                                i22 |= i28;
                                i18 = d;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 10:
                            s1Var2 = s1Var;
                            i9 = M;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 2) {
                                i10 = i4;
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                d = t1.a(bArr2, i4, s1Var2);
                                unsafe2.putObject(obj2, j, s1Var2.c);
                                i22 |= i28;
                                i18 = d;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 12:
                            s1Var2 = s1Var;
                            i9 = M;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 0) {
                                i10 = i4;
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                d = t1.j(bArr2, i4, s1Var2);
                                unsafe2.putInt(obj2, j, s1Var2.a);
                                i22 |= i28;
                                i18 = d;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 15:
                            s1Var2 = s1Var;
                            i9 = M;
                            i11 = 1048575;
                            i6 = i24;
                            if (i25 != 0) {
                                i10 = i4;
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                d = t1.j(bArr2, i4, s1Var2);
                                unsafe2.putInt(obj2, j, z1.a(s1Var2.a));
                                i22 |= i28;
                                i18 = d;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 16:
                            if (i25 != 0) {
                                i6 = i24;
                                i9 = M;
                                i10 = i4;
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                s1Var2 = s1Var;
                                m = t1.m(bArr2, i4, s1Var2);
                                i9 = M;
                                i6 = i24;
                                i11 = 1048575;
                                unsafe2.putLong(obj, j, z1.b(s1Var2.b));
                                i22 |= i28;
                                i18 = m;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        default:
                            i6 = i24;
                            i9 = M;
                            i10 = i4;
                            i5 = i10;
                            unsafe = unsafe2;
                            i8 = i9;
                            i7 = -1;
                            break;
                    }
                } else {
                    s1Var2 = s1Var;
                    i9 = M;
                    int i30 = i4;
                    i11 = 1048575;
                    i6 = i24;
                    if (e == 27) {
                        if (i25 == 2) {
                            tbf tbfVar = (tbf) unsafe2.getObject(obj2, j);
                            if (!tbfVar.zzc()) {
                                int size = tbfVar.size();
                                tbfVar = tbfVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, tbfVar);
                            }
                            i18 = t1.e(z2Var.i(i9), i3, bArr, i30, i2, tbfVar, s1Var);
                            i22 = i22;
                            i21 = i9;
                            i19 = i6;
                            i16 = i11;
                            i17 = -1;
                        } else {
                            i12 = i30;
                            i13 = i22;
                            i14 = i20;
                            unsafe = unsafe2;
                            i8 = i9;
                            i7 = -1;
                        }
                    } else if (e <= 49) {
                        i13 = i22;
                        i14 = i20;
                        i7 = -1;
                        unsafe = unsafe2;
                        i8 = i9;
                        i18 = K(obj, bArr, i30, i2, i3, i6, i25, i9, i26, e, j, s1Var);
                        if (i18 != i30) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i15 = i2;
                            s1Var2 = s1Var;
                            i20 = i14;
                            i17 = i7;
                            i19 = i6;
                            i22 = i13;
                            i21 = i8;
                            unsafe2 = unsafe;
                            i16 = 1048575;
                            z2Var = this;
                        } else {
                            i5 = i18;
                            i20 = i14;
                            i22 = i13;
                        }
                    } else {
                        i12 = i30;
                        i13 = i22;
                        i14 = i20;
                        unsafe = unsafe2;
                        i8 = i9;
                        i7 = -1;
                        if (e != 50) {
                            i18 = I(obj, bArr, i12, i2, i3, i6, i25, i26, e, j, i8, s1Var);
                            if (i18 != i12) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i15 = i2;
                                s1Var2 = s1Var;
                                i20 = i14;
                                i17 = i7;
                                i19 = i6;
                                i22 = i13;
                                i21 = i8;
                                unsafe2 = unsafe;
                                i16 = 1048575;
                                z2Var = this;
                            } else {
                                i5 = i18;
                                i20 = i14;
                                i22 = i13;
                            }
                        } else if (i25 == 2) {
                            i18 = H(obj, bArr, i12, i2, i8, j, s1Var);
                            if (i18 != i12) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i15 = i2;
                                s1Var2 = s1Var;
                                i20 = i14;
                                i17 = i7;
                                i19 = i6;
                                i22 = i13;
                                i21 = i8;
                                unsafe2 = unsafe;
                                i16 = 1048575;
                                z2Var = this;
                            } else {
                                i5 = i18;
                                i20 = i14;
                                i22 = i13;
                            }
                        }
                    }
                    i5 = i12;
                    i20 = i14;
                    i22 = i13;
                }
            }
            i18 = t1.i(i3, bArr, i5, i2, z(obj), s1Var);
            z2Var = this;
            obj2 = obj;
            bArr2 = bArr;
            i15 = i2;
            s1Var2 = s1Var;
            i17 = i7;
            i19 = i6;
            i21 = i8;
            unsafe2 = unsafe;
            i16 = 1048575;
        }
        int i31 = i22;
        int i32 = i20;
        Unsafe unsafe3 = unsafe2;
        if (i32 != i16) {
            unsafe3.putInt(obj, i32, i31);
        }
        if (i18 == i2) {
            return i18;
        }
        throw zzkm.e();
    }

    private final int K(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, s1 s1Var) {
        int i8;
        int l;
        Unsafe unsafe = q;
        tbf tbfVar = (tbf) unsafe.getObject(obj, j2);
        if (!tbfVar.zzc()) {
            int size = tbfVar.size();
            tbfVar = tbfVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, tbfVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    lh4.a(tbfVar);
                    int j3 = t1.j(bArr, i, s1Var);
                    int i9 = s1Var.a + j3;
                    if (j3 < i9) {
                        Double.longBitsToDouble(t1.n(bArr, j3));
                        throw null;
                    }
                    if (j3 == i9) {
                        return j3;
                    }
                    throw zzkm.f();
                }
                if (i5 == 1) {
                    lh4.a(tbfVar);
                    Double.longBitsToDouble(t1.n(bArr, i));
                    throw null;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    lh4.a(tbfVar);
                    int j4 = t1.j(bArr, i, s1Var);
                    int i10 = s1Var.a + j4;
                    if (j4 < i10) {
                        Float.intBitsToFloat(t1.b(bArr, j4));
                        throw null;
                    }
                    if (j4 == i10) {
                        return j4;
                    }
                    throw zzkm.f();
                }
                if (i5 == 5) {
                    lh4.a(tbfVar);
                    Float.intBitsToFloat(t1.b(bArr, i));
                    throw null;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    q2 q2Var = (q2) tbfVar;
                    int j5 = t1.j(bArr, i, s1Var);
                    int i11 = s1Var.a + j5;
                    while (j5 < i11) {
                        j5 = t1.m(bArr, j5, s1Var);
                        q2Var.e(s1Var.b);
                    }
                    if (j5 == i11) {
                        return j5;
                    }
                    throw zzkm.f();
                }
                if (i5 == 0) {
                    q2 q2Var2 = (q2) tbfVar;
                    int m = t1.m(bArr, i, s1Var);
                    q2Var2.e(s1Var.b);
                    while (m < i2) {
                        int j6 = t1.j(bArr, m, s1Var);
                        if (i3 != s1Var.a) {
                            return m;
                        }
                        m = t1.m(bArr, j6, s1Var);
                        q2Var2.e(s1Var.b);
                    }
                    return m;
                }
                break;
            case 22:
            case BuildConfig.VERSION_CODE /* 29 */:
            case 39:
            case 43:
                if (i5 == 2) {
                    return t1.f(bArr, i, tbfVar, s1Var);
                }
                if (i5 == 0) {
                    return t1.l(i3, bArr, i, i2, tbfVar, s1Var);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    q2 q2Var3 = (q2) tbfVar;
                    int j7 = t1.j(bArr, i, s1Var);
                    int i12 = s1Var.a + j7;
                    while (j7 < i12) {
                        q2Var3.e(t1.n(bArr, j7));
                        j7 += 8;
                    }
                    if (j7 == i12) {
                        return j7;
                    }
                    throw zzkm.f();
                }
                if (i5 == 1) {
                    q2 q2Var4 = (q2) tbfVar;
                    q2Var4.e(t1.n(bArr, i));
                    int i13 = i + 8;
                    while (i13 < i2) {
                        int j8 = t1.j(bArr, i13, s1Var);
                        if (i3 != s1Var.a) {
                            return i13;
                        }
                        q2Var4.e(t1.n(bArr, j8));
                        i13 = j8 + 8;
                    }
                    return i13;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    k2 k2Var = (k2) tbfVar;
                    int j9 = t1.j(bArr, i, s1Var);
                    int i14 = s1Var.a + j9;
                    while (j9 < i14) {
                        k2Var.zzh(t1.b(bArr, j9));
                        j9 += 4;
                    }
                    if (j9 == i14) {
                        return j9;
                    }
                    throw zzkm.f();
                }
                if (i5 == 5) {
                    k2 k2Var2 = (k2) tbfVar;
                    k2Var2.zzh(t1.b(bArr, i));
                    int i15 = i + 4;
                    while (i15 < i2) {
                        int j10 = t1.j(bArr, i15, s1Var);
                        if (i3 != s1Var.a) {
                            return i15;
                        }
                        k2Var2.zzh(t1.b(bArr, j10));
                        i15 = j10 + 4;
                    }
                    return i15;
                }
                break;
            case EventType.SUBS /* 25 */:
            case 42:
                if (i5 == 2) {
                    lh4.a(tbfVar);
                    int j11 = t1.j(bArr, i, s1Var);
                    int i16 = s1Var.a + j11;
                    if (j11 < i16) {
                        t1.m(bArr, j11, s1Var);
                        throw null;
                    }
                    if (j11 == i16) {
                        return j11;
                    }
                    throw zzkm.f();
                }
                if (i5 == 0) {
                    lh4.a(tbfVar);
                    t1.m(bArr, i, s1Var);
                    long j12 = s1Var.b;
                    throw null;
                }
                break;
            case EventType.CDN /* 26 */:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int j13 = t1.j(bArr, i, s1Var);
                        int i17 = s1Var.a;
                        if (i17 < 0) {
                            throw zzkm.d();
                        }
                        if (i17 == 0) {
                            tbfVar.add("");
                        } else {
                            tbfVar.add(new String(bArr, j13, i17, l2.b));
                            j13 += i17;
                        }
                        while (j13 < i2) {
                            int j14 = t1.j(bArr, j13, s1Var);
                            if (i3 != s1Var.a) {
                                return j13;
                            }
                            j13 = t1.j(bArr, j14, s1Var);
                            int i18 = s1Var.a;
                            if (i18 < 0) {
                                throw zzkm.d();
                            }
                            if (i18 == 0) {
                                tbfVar.add("");
                            } else {
                                tbfVar.add(new String(bArr, j13, i18, l2.b));
                                j13 += i18;
                            }
                        }
                        return j13;
                    }
                    int j15 = t1.j(bArr, i, s1Var);
                    int i19 = s1Var.a;
                    if (i19 < 0) {
                        throw zzkm.d();
                    }
                    if (i19 == 0) {
                        tbfVar.add("");
                        i8 = j15;
                    } else {
                        i8 = j15 + i19;
                        if (!w3.f(bArr, j15, i8)) {
                            throw zzkm.c();
                        }
                        tbfVar.add(new String(bArr, j15, i19, l2.b));
                    }
                    while (i8 < i2) {
                        int j16 = t1.j(bArr, i8, s1Var);
                        if (i3 != s1Var.a) {
                            return i8;
                        }
                        i8 = t1.j(bArr, j16, s1Var);
                        int i20 = s1Var.a;
                        if (i20 < 0) {
                            throw zzkm.d();
                        }
                        if (i20 == 0) {
                            tbfVar.add("");
                        } else {
                            int i21 = i8 + i20;
                            if (!w3.f(bArr, i8, i21)) {
                                throw zzkm.c();
                            }
                            tbfVar.add(new String(bArr, i8, i20, l2.b));
                            i8 = i21;
                        }
                    }
                    return i8;
                }
                break;
            case 27:
                if (i5 == 2) {
                    return t1.e(i(i6), i3, bArr, i, i2, tbfVar, s1Var);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int j17 = t1.j(bArr, i, s1Var);
                    int i22 = s1Var.a;
                    if (i22 < 0) {
                        throw zzkm.d();
                    }
                    if (i22 > bArr.length - j17) {
                        throw zzkm.f();
                    }
                    if (i22 == 0) {
                        tbfVar.add(zzjb.a);
                    } else {
                        tbfVar.add(zzjb.q(bArr, j17, i22));
                        j17 += i22;
                    }
                    while (j17 < i2) {
                        int j18 = t1.j(bArr, j17, s1Var);
                        if (i3 != s1Var.a) {
                            return j17;
                        }
                        j17 = t1.j(bArr, j18, s1Var);
                        int i23 = s1Var.a;
                        if (i23 < 0) {
                            throw zzkm.d();
                        }
                        if (i23 > bArr.length - j17) {
                            throw zzkm.f();
                        }
                        if (i23 == 0) {
                            tbfVar.add(zzjb.a);
                        } else {
                            tbfVar.add(zzjb.q(bArr, j17, i23));
                            j17 += i23;
                        }
                    }
                    return j17;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    l = t1.f(bArr, i, tbfVar, s1Var);
                } else if (i5 == 0) {
                    l = t1.l(i3, bArr, i, i2, tbfVar, s1Var);
                }
                j2 j2Var = (j2) obj;
                m3 m3Var = j2Var.zzc;
                Object c = j3.c(i4, tbfVar, h(i6), m3Var != m3.c() ? m3Var : null, this.l);
                if (c == null) {
                    return l;
                }
                j2Var.zzc = (m3) c;
                return l;
            case 33:
            case 47:
                if (i5 == 2) {
                    k2 k2Var3 = (k2) tbfVar;
                    int j19 = t1.j(bArr, i, s1Var);
                    int i24 = s1Var.a + j19;
                    while (j19 < i24) {
                        j19 = t1.j(bArr, j19, s1Var);
                        k2Var3.zzh(z1.a(s1Var.a));
                    }
                    if (j19 == i24) {
                        return j19;
                    }
                    throw zzkm.f();
                }
                if (i5 == 0) {
                    k2 k2Var4 = (k2) tbfVar;
                    int j20 = t1.j(bArr, i, s1Var);
                    k2Var4.zzh(z1.a(s1Var.a));
                    while (j20 < i2) {
                        int j21 = t1.j(bArr, j20, s1Var);
                        if (i3 != s1Var.a) {
                            return j20;
                        }
                        j20 = t1.j(bArr, j21, s1Var);
                        k2Var4.zzh(z1.a(s1Var.a));
                    }
                    return j20;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    q2 q2Var5 = (q2) tbfVar;
                    int j22 = t1.j(bArr, i, s1Var);
                    int i25 = s1Var.a + j22;
                    while (j22 < i25) {
                        j22 = t1.m(bArr, j22, s1Var);
                        q2Var5.e(z1.b(s1Var.b));
                    }
                    if (j22 == i25) {
                        return j22;
                    }
                    throw zzkm.f();
                }
                if (i5 == 0) {
                    q2 q2Var6 = (q2) tbfVar;
                    int m2 = t1.m(bArr, i, s1Var);
                    q2Var6.e(z1.b(s1Var.b));
                    while (m2 < i2) {
                        int j23 = t1.j(bArr, m2, s1Var);
                        if (i3 != s1Var.a) {
                            return m2;
                        }
                        m2 = t1.m(bArr, j23, s1Var);
                        q2Var6.e(z1.b(s1Var.b));
                    }
                    return m2;
                }
                break;
            default:
                if (i5 == 3) {
                    h3 i26 = i(i6);
                    int i27 = (i3 & (-8)) | 4;
                    int c2 = t1.c(i26, bArr, i, i2, i27, s1Var);
                    tbfVar.add(s1Var.c);
                    while (c2 < i2) {
                        int j24 = t1.j(bArr, c2, s1Var);
                        if (i3 != s1Var.a) {
                            return c2;
                        }
                        c2 = t1.c(i26, bArr, j24, i2, i27, s1Var);
                        tbfVar.add(s1Var.c);
                    }
                    return c2;
                }
                break;
        }
        return i;
    }

    private final int L(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return O(i, 0);
    }

    private final int M(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return O(i, i2);
    }

    private final int N(int i) {
        return this.a[i + 2];
    }

    private final int O(int i, int i2) {
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

    private static int e(int i) {
        return (i >>> 20) & 255;
    }

    private final int f(int i) {
        return this.a[i + 1];
    }

    private static long g(Object obj, long j) {
        return ((Long) s3.k(obj, j)).longValue();
    }

    private final kbf h(int i) {
        int i2 = i / 3;
        return (kbf) this.b[i2 + i2 + 1];
    }

    private final h3 i(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        h3 h3Var = (h3) this.b[i3];
        if (h3Var != null) {
            return h3Var;
        }
        h3 b = e3.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b;
        return b;
    }

    private final Object j(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    private static Field k(Class cls, String str) {
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

    private final void l(Object obj, Object obj2, int i) {
        long f = f(i) & 1048575;
        if (s(obj2, i)) {
            Object k = s3.k(obj, f);
            Object k2 = s3.k(obj2, f);
            if (k != null && k2 != null) {
                s3.x(obj, f, l2.g(k, k2));
                n(obj, i);
            } else if (k2 != null) {
                s3.x(obj, f, k2);
                n(obj, i);
            }
        }
    }

    private final void m(Object obj, Object obj2, int i) {
        int f = f(i);
        int i2 = this.a[i];
        long j = f & 1048575;
        if (v(obj2, i2, i)) {
            Object k = v(obj, i2, i) ? s3.k(obj, j) : null;
            Object k2 = s3.k(obj2, j);
            if (k != null && k2 != null) {
                s3.x(obj, j, l2.g(k, k2));
                o(obj, i2, i);
            } else if (k2 != null) {
                s3.x(obj, j, k2);
                o(obj, i2, i);
            }
        }
    }

    private final void n(Object obj, int i) {
        int N = N(i);
        long j = 1048575 & N;
        if (j == 1048575) {
            return;
        }
        s3.v(obj, j, (1 << (N >>> 20)) | s3.h(obj, j));
    }

    private final void o(Object obj, int i, int i2) {
        s3.v(obj, N(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void p(Object obj, x3 x3Var) {
        int i;
        boolean z;
        if (this.f) {
            this.m.a(obj);
            throw null;
        }
        int length = this.a.length;
        Unsafe unsafe = q;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int f = f(i4);
            int[] iArr = this.a;
            int i6 = iArr[i4];
            int e = e(f);
            if (e <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = f & i2;
            switch (e) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzf(i6, s3.f(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzo(i6, s3.g(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzb(i6, s3.B(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x(i6, unsafe.getObject(obj, j), x3Var);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.c(i6, unsafe.getObject(obj, j), i(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.a(i6, (zzjb) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        x3Var.b(i6, unsafe.getObject(obj, j), i(i4));
                        break;
                    }
                case 18:
                    j3.j(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 19:
                    j3.n(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 20:
                    j3.q(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 21:
                    j3.y(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 22:
                    j3.p(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 23:
                    j3.m(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 24:
                    j3.l(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case EventType.SUBS /* 25 */:
                    j3.h(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case EventType.CDN /* 26 */:
                    j3.w(this.a[i4], (List) unsafe.getObject(obj, j), x3Var);
                    break;
                case 27:
                    j3.r(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, i(i4));
                    break;
                case 28:
                    j3.i(this.a[i4], (List) unsafe.getObject(obj, j), x3Var);
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    z = false;
                    j3.x(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 30:
                    z = false;
                    j3.k(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 31:
                    z = false;
                    j3.s(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 32:
                    z = false;
                    j3.t(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 33:
                    z = false;
                    j3.u(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 34:
                    z = false;
                    j3.v(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, false);
                    break;
                case 35:
                    j3.j(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 36:
                    j3.n(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 37:
                    j3.q(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 38:
                    j3.y(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 39:
                    j3.p(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 40:
                    j3.m(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 41:
                    j3.l(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 42:
                    j3.h(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 43:
                    j3.x(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 44:
                    j3.k(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 45:
                    j3.s(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 46:
                    j3.t(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 47:
                    j3.u(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 48:
                    j3.v(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, true);
                    break;
                case 49:
                    j3.o(this.a[i4], (List) unsafe.getObject(obj, j), x3Var, i(i4));
                    break;
                case 50:
                    q(x3Var, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (v(obj, i6, i4)) {
                        x3Var.zzf(i6, C(obj, j));
                    }
                    break;
                case 52:
                    if (v(obj, i6, i4)) {
                        x3Var.zzo(i6, D(obj, j));
                    }
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (v(obj, i6, i4)) {
                        x3Var.zzt(i6, g(obj, j));
                    }
                    break;
                case 54:
                    if (v(obj, i6, i4)) {
                        x3Var.zzJ(i6, g(obj, j));
                    }
                    break;
                case 55:
                    if (v(obj, i6, i4)) {
                        x3Var.zzr(i6, G(obj, j));
                    }
                    break;
                case 56:
                    if (v(obj, i6, i4)) {
                        x3Var.zzm(i6, g(obj, j));
                    }
                    break;
                case 57:
                    if (v(obj, i6, i4)) {
                        x3Var.zzk(i6, G(obj, j));
                    }
                    break;
                case 58:
                    if (v(obj, i6, i4)) {
                        x3Var.zzb(i6, w(obj, j));
                    }
                    break;
                case 59:
                    if (v(obj, i6, i4)) {
                        x(i6, unsafe.getObject(obj, j), x3Var);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (v(obj, i6, i4)) {
                        x3Var.c(i6, unsafe.getObject(obj, j), i(i4));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (v(obj, i6, i4)) {
                        x3Var.a(i6, (zzjb) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (v(obj, i6, i4)) {
                        x3Var.zzH(i6, G(obj, j));
                    }
                    break;
                case 63:
                    if (v(obj, i6, i4)) {
                        x3Var.zzi(i6, G(obj, j));
                    }
                    break;
                case 64:
                    if (v(obj, i6, i4)) {
                        x3Var.zzw(i6, G(obj, j));
                    }
                    break;
                case 65:
                    if (v(obj, i6, i4)) {
                        x3Var.zzy(i6, g(obj, j));
                    }
                    break;
                case 66:
                    if (v(obj, i6, i4)) {
                        x3Var.zzA(i6, G(obj, j));
                    }
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (v(obj, i6, i4)) {
                        x3Var.zzC(i6, g(obj, j));
                    }
                    break;
                case 68:
                    if (v(obj, i6, i4)) {
                        x3Var.b(i6, unsafe.getObject(obj, j), i(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        l3 l3Var = this.l;
        l3Var.i(l3Var.c(obj), x3Var);
    }

    private final void q(x3 x3Var, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        lh4.a(j(i2));
        throw null;
    }

    private final boolean r(Object obj, Object obj2, int i) {
        return s(obj, i) == s(obj2, i);
    }

    private final boolean s(Object obj, int i) {
        int N = N(i);
        long j = N & 1048575;
        if (j != 1048575) {
            return (s3.h(obj, j) & (1 << (N >>> 20))) != 0;
        }
        int f = f(i);
        long j2 = f & 1048575;
        switch (e(f)) {
            case 0:
                return Double.doubleToRawLongBits(s3.f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(s3.g(obj, j2)) != 0;
            case 2:
                return s3.i(obj, j2) != 0;
            case 3:
                return s3.i(obj, j2) != 0;
            case 4:
                return s3.h(obj, j2) != 0;
            case 5:
                return s3.i(obj, j2) != 0;
            case 6:
                return s3.h(obj, j2) != 0;
            case 7:
                return s3.B(obj, j2);
            case 8:
                Object k = s3.k(obj, j2);
                if (k instanceof String) {
                    return !((String) k).isEmpty();
                }
                if (k instanceof zzjb) {
                    return !zzjb.a.equals(k);
                }
                throw new IllegalArgumentException();
            case 9:
                return s3.k(obj, j2) != null;
            case 10:
                return !zzjb.a.equals(s3.k(obj, j2));
            case 11:
                return s3.h(obj, j2) != 0;
            case 12:
                return s3.h(obj, j2) != 0;
            case 13:
                return s3.h(obj, j2) != 0;
            case 14:
                return s3.i(obj, j2) != 0;
            case 15:
                return s3.h(obj, j2) != 0;
            case 16:
                return s3.i(obj, j2) != 0;
            case 17:
                return s3.k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean t(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? s(obj, i) : (i3 & i4) != 0;
    }

    private static boolean u(Object obj, int i, h3 h3Var) {
        return h3Var.b(s3.k(obj, i & 1048575));
    }

    private final boolean v(Object obj, int i, int i2) {
        return s3.h(obj, (long) (N(i2) & 1048575)) == i;
    }

    private static boolean w(Object obj, long j) {
        return ((Boolean) s3.k(obj, j)).booleanValue();
    }

    private static final void x(int i, Object obj, x3 x3Var) {
        if (obj instanceof String) {
            x3Var.zzF(i, (String) obj);
        } else {
            x3Var.a(i, (zzjb) obj);
        }
    }

    static m3 z(Object obj) {
        j2 j2Var = (j2) obj;
        m3 m3Var = j2Var.zzc;
        if (m3Var != m3.c()) {
            return m3Var;
        }
        m3 e = m3.e();
        j2Var.zzc = e;
        return e;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final boolean a(Object obj, Object obj2) {
        boolean z;
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int f = f(i);
            long j = f & 1048575;
            switch (e(f)) {
                case 0:
                    if (r(obj, obj2, i) && Double.doubleToLongBits(s3.f(obj, j)) == Double.doubleToLongBits(s3.f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (r(obj, obj2, i) && Float.floatToIntBits(s3.g(obj, j)) == Float.floatToIntBits(s3.g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (r(obj, obj2, i) && s3.i(obj, j) == s3.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (r(obj, obj2, i) && s3.i(obj, j) == s3.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (r(obj, obj2, i) && s3.h(obj, j) == s3.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (r(obj, obj2, i) && s3.i(obj, j) == s3.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (r(obj, obj2, i) && s3.h(obj, j) == s3.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (r(obj, obj2, i) && s3.B(obj, j) == s3.B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (r(obj, obj2, i) && j3.z(s3.k(obj, j), s3.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (r(obj, obj2, i) && j3.z(s3.k(obj, j), s3.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (r(obj, obj2, i) && j3.z(s3.k(obj, j), s3.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (r(obj, obj2, i) && s3.h(obj, j) == s3.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (r(obj, obj2, i) && s3.h(obj, j) == s3.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (r(obj, obj2, i) && s3.h(obj, j) == s3.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (r(obj, obj2, i) && s3.i(obj, j) == s3.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (r(obj, obj2, i) && s3.h(obj, j) == s3.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (r(obj, obj2, i) && s3.i(obj, j) == s3.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (r(obj, obj2, i) && j3.z(s3.k(obj, j), s3.k(obj2, j))) {
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
                    z = j3.z(s3.k(obj, j), s3.k(obj2, j));
                    break;
                case 50:
                    z = j3.z(s3.k(obj, j), s3.k(obj2, j));
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
                    long N = N(i) & 1048575;
                    if (s3.h(obj, N) == s3.h(obj2, N) && j3.z(s3.k(obj, j), s3.k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!this.l.c(obj).equals(this.l.c(obj2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.m.a(obj);
        this.m.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.i) {
            int i6 = this.h[i5];
            int i7 = this.a[i6];
            int f = f(i6);
            int i8 = this.a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = q.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & f) != 0 && !t(obj, i6, i, i2, i10)) {
                return false;
            }
            int e = e(f);
            if (e != 9 && e != 17) {
                if (e != 27) {
                    if (e == 60 || e == 68) {
                        if (v(obj, i7, i6) && !u(obj, f, i(i6))) {
                            return false;
                        }
                    } else if (e != 49) {
                        if (e == 50 && !((zzld) s3.k(obj, f & 1048575)).isEmpty()) {
                            lh4.a(j(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) s3.k(obj, f & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    h3 i11 = i(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!i11.b(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (t(obj, i6, i, i2, i10) && !u(obj, f, i(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.f) {
            return true;
        }
        this.m.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final void c(Object obj, x3 x3Var) {
        if (!this.g) {
            p(obj, x3Var);
            return;
        }
        if (this.f) {
            this.m.a(obj);
            throw null;
        }
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int f = f(i);
            int i2 = this.a[i];
            switch (e(f)) {
                case 0:
                    if (s(obj, i)) {
                        x3Var.zzf(i2, s3.f(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(obj, i)) {
                        x3Var.zzo(i2, s3.g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (s(obj, i)) {
                        x3Var.zzt(i2, s3.i(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (s(obj, i)) {
                        x3Var.zzJ(i2, s3.i(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (s(obj, i)) {
                        x3Var.zzr(i2, s3.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (s(obj, i)) {
                        x3Var.zzm(i2, s3.i(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (s(obj, i)) {
                        x3Var.zzk(i2, s3.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (s(obj, i)) {
                        x3Var.zzb(i2, s3.B(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (s(obj, i)) {
                        x(i2, s3.k(obj, f & 1048575), x3Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (s(obj, i)) {
                        x3Var.c(i2, s3.k(obj, f & 1048575), i(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (s(obj, i)) {
                        x3Var.a(i2, (zzjb) s3.k(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (s(obj, i)) {
                        x3Var.zzH(i2, s3.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (s(obj, i)) {
                        x3Var.zzi(i2, s3.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (s(obj, i)) {
                        x3Var.zzw(i2, s3.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (s(obj, i)) {
                        x3Var.zzy(i2, s3.i(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (s(obj, i)) {
                        x3Var.zzA(i2, s3.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (s(obj, i)) {
                        x3Var.zzC(i2, s3.i(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (s(obj, i)) {
                        x3Var.b(i2, s3.k(obj, f & 1048575), i(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    j3.j(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 19:
                    j3.n(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 20:
                    j3.q(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 21:
                    j3.y(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 22:
                    j3.p(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 23:
                    j3.m(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 24:
                    j3.l(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case EventType.SUBS /* 25 */:
                    j3.h(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case EventType.CDN /* 26 */:
                    j3.w(i2, (List) s3.k(obj, f & 1048575), x3Var);
                    break;
                case 27:
                    j3.r(i2, (List) s3.k(obj, f & 1048575), x3Var, i(i));
                    break;
                case 28:
                    j3.i(i2, (List) s3.k(obj, f & 1048575), x3Var);
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    j3.x(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 30:
                    j3.k(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 31:
                    j3.s(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 32:
                    j3.t(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 33:
                    j3.u(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 34:
                    j3.v(i2, (List) s3.k(obj, f & 1048575), x3Var, false);
                    break;
                case 35:
                    j3.j(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 36:
                    j3.n(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 37:
                    j3.q(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 38:
                    j3.y(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 39:
                    j3.p(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 40:
                    j3.m(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 41:
                    j3.l(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 42:
                    j3.h(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 43:
                    j3.x(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 44:
                    j3.k(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 45:
                    j3.s(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 46:
                    j3.t(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 47:
                    j3.u(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 48:
                    j3.v(i2, (List) s3.k(obj, f & 1048575), x3Var, true);
                    break;
                case 49:
                    j3.o(i2, (List) s3.k(obj, f & 1048575), x3Var, i(i));
                    break;
                case 50:
                    q(x3Var, i2, s3.k(obj, f & 1048575), i);
                    break;
                case 51:
                    if (v(obj, i2, i)) {
                        x3Var.zzf(i2, C(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(obj, i2, i)) {
                        x3Var.zzo(i2, D(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (v(obj, i2, i)) {
                        x3Var.zzt(i2, g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(obj, i2, i)) {
                        x3Var.zzJ(i2, g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(obj, i2, i)) {
                        x3Var.zzr(i2, G(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(obj, i2, i)) {
                        x3Var.zzm(i2, g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(obj, i2, i)) {
                        x3Var.zzk(i2, G(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(obj, i2, i)) {
                        x3Var.zzb(i2, w(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(obj, i2, i)) {
                        x(i2, s3.k(obj, f & 1048575), x3Var);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (v(obj, i2, i)) {
                        x3Var.c(i2, s3.k(obj, f & 1048575), i(i));
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (v(obj, i2, i)) {
                        x3Var.a(i2, (zzjb) s3.k(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(obj, i2, i)) {
                        x3Var.zzH(i2, G(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(obj, i2, i)) {
                        x3Var.zzi(i2, G(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(obj, i2, i)) {
                        x3Var.zzw(i2, G(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(obj, i2, i)) {
                        x3Var.zzy(i2, g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(obj, i2, i)) {
                        x3Var.zzA(i2, G(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (v(obj, i2, i)) {
                        x3Var.zzC(i2, g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(obj, i2, i)) {
                        x3Var.b(i2, s3.k(obj, f & 1048575), i(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        l3 l3Var = this.l;
        l3Var.i(l3Var.c(obj), x3Var);
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final void d(Object obj, byte[] bArr, int i, int i2, s1 s1Var) {
        if (this.g) {
            J(obj, bArr, i, i2, s1Var);
        } else {
            y(obj, bArr, i, i2, 0, s1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x03a9, code lost:
    
        if (r0 != r19) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03ab, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r2 = r32;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r5 = r19;
        r1 = r20;
        r3 = r21;
        r6 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03c5, code lost:
    
        r2 = r0;
        r7 = r20;
        r6 = r22;
        r0 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03ee, code lost:
    
        if (r0 != r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0414, code lost:
    
        if (r0 != r15) goto L124;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int y(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.s1 r35) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.z2.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.s1):int");
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final int zza(Object obj) {
        return this.g ? F(obj) : E(obj);
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final int zzb(Object obj) {
        int i;
        int c;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int f = f(i3);
            int i4 = this.a[i3];
            long j = 1048575 & f;
            int i5 = 37;
            switch (e(f)) {
                case 0:
                    i = i2 * 53;
                    c = l2.c(Double.doubleToLongBits(s3.f(obj, j)));
                    i2 = i + c;
                    break;
                case 1:
                    i = i2 * 53;
                    c = Float.floatToIntBits(s3.g(obj, j));
                    i2 = i + c;
                    break;
                case 2:
                    i = i2 * 53;
                    c = l2.c(s3.i(obj, j));
                    i2 = i + c;
                    break;
                case 3:
                    i = i2 * 53;
                    c = l2.c(s3.i(obj, j));
                    i2 = i + c;
                    break;
                case 4:
                    i = i2 * 53;
                    c = s3.h(obj, j);
                    i2 = i + c;
                    break;
                case 5:
                    i = i2 * 53;
                    c = l2.c(s3.i(obj, j));
                    i2 = i + c;
                    break;
                case 6:
                    i = i2 * 53;
                    c = s3.h(obj, j);
                    i2 = i + c;
                    break;
                case 7:
                    i = i2 * 53;
                    c = l2.a(s3.B(obj, j));
                    i2 = i + c;
                    break;
                case 8:
                    i = i2 * 53;
                    c = ((String) s3.k(obj, j)).hashCode();
                    i2 = i + c;
                    break;
                case 9:
                    Object k = s3.k(obj, j);
                    if (k != null) {
                        i5 = k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    c = s3.k(obj, j).hashCode();
                    i2 = i + c;
                    break;
                case 11:
                    i = i2 * 53;
                    c = s3.h(obj, j);
                    i2 = i + c;
                    break;
                case 12:
                    i = i2 * 53;
                    c = s3.h(obj, j);
                    i2 = i + c;
                    break;
                case 13:
                    i = i2 * 53;
                    c = s3.h(obj, j);
                    i2 = i + c;
                    break;
                case 14:
                    i = i2 * 53;
                    c = l2.c(s3.i(obj, j));
                    i2 = i + c;
                    break;
                case 15:
                    i = i2 * 53;
                    c = s3.h(obj, j);
                    i2 = i + c;
                    break;
                case 16:
                    i = i2 * 53;
                    c = l2.c(s3.i(obj, j));
                    i2 = i + c;
                    break;
                case 17:
                    Object k2 = s3.k(obj, j);
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
                    c = s3.k(obj, j).hashCode();
                    i2 = i + c;
                    break;
                case 50:
                    i = i2 * 53;
                    c = s3.k(obj, j).hashCode();
                    i2 = i + c;
                    break;
                case 51:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = l2.c(Double.doubleToLongBits(C(obj, j)));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = Float.floatToIntBits(D(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = l2.c(g(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = l2.c(g(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = G(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = l2.c(g(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = G(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = l2.a(w(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = ((String) s3.k(obj, j)).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = s3.k(obj, j).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = s3.k(obj, j).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = G(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = G(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = G(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = l2.c(g(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = G(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = l2.c(g(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(obj, i4, i3)) {
                        i = i2 * 53;
                        c = s3.k(obj, j).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.l.c(obj).hashCode();
        if (!this.f) {
            return hashCode;
        }
        this.m.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final Object zze() {
        return ((j2) this.e).q(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final void zzf(Object obj) {
        int i;
        int i2 = this.i;
        while (true) {
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long f = f(this.h[i2]) & 1048575;
            Object k = s3.k(obj, f);
            if (k != null) {
                ((zzld) k).d();
                s3.x(obj, f, k);
            }
            i2++;
        }
        int length = this.h.length;
        while (i < length) {
            this.k.a(obj, this.h[i]);
            i++;
        }
        this.l.g(obj);
        if (this.f) {
            this.m.b(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int f = f(i);
            long j = 1048575 & f;
            int i2 = this.a[i];
            switch (e(f)) {
                case 0:
                    if (s(obj2, i)) {
                        s3.t(obj, j, s3.f(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(obj2, i)) {
                        s3.u(obj, j, s3.g(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (s(obj2, i)) {
                        s3.w(obj, j, s3.i(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (s(obj2, i)) {
                        s3.w(obj, j, s3.i(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (s(obj2, i)) {
                        s3.v(obj, j, s3.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (s(obj2, i)) {
                        s3.w(obj, j, s3.i(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (s(obj2, i)) {
                        s3.v(obj, j, s3.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (s(obj2, i)) {
                        s3.r(obj, j, s3.B(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (s(obj2, i)) {
                        s3.x(obj, j, s3.k(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    l(obj, obj2, i);
                    break;
                case 10:
                    if (s(obj2, i)) {
                        s3.x(obj, j, s3.k(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (s(obj2, i)) {
                        s3.v(obj, j, s3.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (s(obj2, i)) {
                        s3.v(obj, j, s3.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (s(obj2, i)) {
                        s3.v(obj, j, s3.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (s(obj2, i)) {
                        s3.w(obj, j, s3.i(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (s(obj2, i)) {
                        s3.v(obj, j, s3.h(obj2, j));
                        n(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (s(obj2, i)) {
                        s3.w(obj, j, s3.i(obj2, j));
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
                    this.k.b(obj, obj2, j);
                    break;
                case 50:
                    j3.B(this.o, obj, obj2, j);
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
                    if (v(obj2, i2, i)) {
                        s3.x(obj, j, s3.k(obj2, j));
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
                    if (v(obj2, i2, i)) {
                        s3.x(obj, j, s3.k(obj2, j));
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
        j3.f(this.l, obj, obj2);
        if (this.f) {
            j3.e(this.m, obj, obj2);
        }
    }
}
