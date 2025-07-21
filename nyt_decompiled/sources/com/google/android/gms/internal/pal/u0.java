package com.google.android.gms.internal.pal;

import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.ev9;
import defpackage.iw9;
import defpackage.lh4;
import defpackage.mw9;
import defpackage.zx9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class u0 implements d1 {
    private static final int[] q = new int[0];
    private static final Unsafe r = p1.l();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final zx9 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int[] i;
    private final int j;
    private final int k;
    private final j0 l;
    private final i1 m;
    private final v n;
    private final w0 o;
    private final p0 p;

    private u0(int[] iArr, Object[] objArr, int i, int i2, zx9 zx9Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, w0 w0Var, j0 j0Var, i1 i1Var, v vVar, p0 p0Var, byte[] bArr) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = zx9Var instanceof c0;
        this.h = z;
        boolean z3 = false;
        if (vVar != null && vVar.h(zx9Var)) {
            z3 = true;
        }
        this.f = z3;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.o = w0Var;
        this.l = j0Var;
        this.m = i1Var;
        this.n = vVar;
        this.e = zx9Var;
        this.p = p0Var;
    }

    private static final void A(int i, Object obj, v1 v1Var) {
        if (obj instanceof String) {
            v1Var.zzF(i, (String) obj);
        } else {
            v1Var.c(i, (zzaby) obj);
        }
    }

    static j1 C(Object obj) {
        c0 c0Var = (c0) obj;
        j1 j1Var = c0Var.zzc;
        if (j1Var != j1.c()) {
            return j1Var;
        }
        j1 e = j1.e();
        c0Var.zzc = e;
        return e;
    }

    static u0 D(Class cls, r0 r0Var, w0 w0Var, j0 j0Var, i1 i1Var, v vVar, p0 p0Var) {
        if (r0Var instanceof b1) {
            return E((b1) r0Var, w0Var, j0Var, i1Var, vVar, p0Var);
        }
        lh4.a(r0Var);
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
    static com.google.android.gms.internal.pal.u0 E(com.google.android.gms.internal.pal.b1 r34, com.google.android.gms.internal.pal.w0 r35, com.google.android.gms.internal.pal.j0 r36, com.google.android.gms.internal.pal.i1 r37, com.google.android.gms.internal.pal.v r38, com.google.android.gms.internal.pal.p0 r39) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.u0.E(com.google.android.gms.internal.pal.b1, com.google.android.gms.internal.pal.w0, com.google.android.gms.internal.pal.j0, com.google.android.gms.internal.pal.i1, com.google.android.gms.internal.pal.v, com.google.android.gms.internal.pal.p0):com.google.android.gms.internal.pal.u0");
    }

    private static double F(Object obj, long j) {
        return ((Double) p1.k(obj, j)).doubleValue();
    }

    private static float G(Object obj, long j) {
        return ((Float) p1.k(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int H(Object obj) {
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
        Unsafe unsafe = r;
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
                        a = s.a(i10 << 3);
                        a5 = a + 8;
                        i8 += a5;
                        break;
                    }
                case 1:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a2 = s.a(i10 << 3);
                        a5 = a2 + 4;
                        i8 += a5;
                        break;
                    }
                case 2:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        a3 = s.a(i10 << 3);
                        b = s.b(j2);
                        i8 += a3 + b;
                        break;
                    }
                case 3:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        a3 = s.a(i10 << 3);
                        b = s.b(j3);
                        i8 += a3 + b;
                        break;
                    }
                case 4:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        a4 = s.a(i10 << 3);
                        z = s.z(i13);
                        i2 = a4 + z;
                        i8 += i2;
                        break;
                    }
                case 5:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a = s.a(i10 << 3);
                        a5 = a + 8;
                        i8 += a5;
                        break;
                    }
                case 6:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a2 = s.a(i10 << 3);
                        a5 = a2 + 4;
                        i8 += a5;
                        break;
                    }
                case 7:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a5 = s.a(i10 << 3) + 1;
                        i8 += a5;
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzaby) {
                            a6 = s.a(i10 << 3);
                            e = ((zzaby) object).e();
                            a7 = s.a(e);
                            i2 = a6 + a7 + e;
                            i8 += i2;
                            break;
                        } else {
                            a4 = s.a(i10 << 3);
                            z = s.B((String) object);
                            i2 = a4 + z;
                            i8 += i2;
                        }
                    }
                case 9:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a5 = f1.Q(i10, unsafe.getObject(obj, j), i(i7));
                        i8 += a5;
                        break;
                    }
                case 10:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzaby zzabyVar = (zzaby) unsafe.getObject(obj, j);
                        a6 = s.a(i10 << 3);
                        e = zzabyVar.e();
                        a7 = s.a(e);
                        i2 = a6 + a7 + e;
                        i8 += i2;
                        break;
                    }
                case 11:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        a4 = s.a(i10 << 3);
                        z = s.a(i14);
                        i2 = a4 + z;
                        i8 += i2;
                        break;
                    }
                case 12:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        a4 = s.a(i10 << 3);
                        z = s.z(i15);
                        i2 = a4 + z;
                        i8 += i2;
                        break;
                    }
                case 13:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a2 = s.a(i10 << 3);
                        a5 = a2 + 4;
                        i8 += a5;
                        break;
                    }
                case 14:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a = s.a(i10 << 3);
                        a5 = a + 8;
                        i8 += a5;
                        break;
                    }
                case 15:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        a4 = s.a(i10 << 3);
                        z = s.a((i16 >> 31) ^ (i16 + i16));
                        i2 = a4 + z;
                        i8 += i2;
                        break;
                    }
                case 16:
                    if ((i & i9) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i8 += s.a(i10 << 3) + s.b((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        a5 = s.y(i10, (zx9) unsafe.getObject(obj, j), i(i7));
                        i8 += a5;
                        break;
                    }
                case 18:
                    a5 = f1.J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 19:
                    a5 = f1.H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 20:
                    a5 = f1.O(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 21:
                    a5 = f1.Z(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 22:
                    a5 = f1.M(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 23:
                    a5 = f1.J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case 24:
                    a5 = f1.H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case EventType.SUBS /* 25 */:
                    a5 = f1.A(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += a5;
                    break;
                case EventType.CDN /* 26 */:
                    W = f1.W(i10, (List) unsafe.getObject(obj, j));
                    i8 += W;
                    break;
                case 27:
                    W = f1.R(i10, (List) unsafe.getObject(obj, j), i(i7));
                    i8 += W;
                    break;
                case 28:
                    W = f1.E(i10, (List) unsafe.getObject(obj, j));
                    i8 += W;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    W = f1.X(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += W;
                    break;
                case 30:
                    z2 = false;
                    F = f1.F(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += F;
                    break;
                case 31:
                    z2 = false;
                    F = f1.H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += F;
                    break;
                case 32:
                    z2 = false;
                    F = f1.J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += F;
                    break;
                case 33:
                    z2 = false;
                    F = f1.S(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += F;
                    break;
                case 34:
                    z2 = false;
                    F = f1.U(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += F;
                    break;
                case 35:
                    K = f1.K((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 36:
                    K = f1.I((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 37:
                    K = f1.P((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 38:
                    K = f1.a0((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 39:
                    K = f1.N((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 40:
                    K = f1.K((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 41:
                    K = f1.I((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 42:
                    K = f1.D((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 43:
                    K = f1.Y((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 44:
                    K = f1.G((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 45:
                    K = f1.I((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 46:
                    K = f1.K((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 47:
                    K = f1.T((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 48:
                    K = f1.V((List) unsafe.getObject(obj, j));
                    if (K > 0) {
                        C = s.C(i10);
                        a8 = s.a(K);
                        i3 = C + a8;
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 49:
                    W = f1.L(i10, (List) unsafe.getObject(obj, j), i(i7));
                    i8 += W;
                    break;
                case 50:
                    p0.a(i10, unsafe.getObject(obj, j), k(i7));
                    break;
                case 51:
                    if (y(obj, i10, i7)) {
                        a9 = s.a(i10 << 3);
                        W = a9 + 8;
                        i8 += W;
                    }
                    break;
                case 52:
                    if (y(obj, i10, i7)) {
                        a10 = s.a(i10 << 3);
                        W = a10 + 4;
                        i8 += W;
                    }
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (y(obj, i10, i7)) {
                        long g = g(obj, j);
                        a11 = s.a(i10 << 3);
                        b2 = s.b(g);
                        i8 += a11 + b2;
                    }
                    break;
                case 54:
                    if (y(obj, i10, i7)) {
                        long g2 = g(obj, j);
                        a11 = s.a(i10 << 3);
                        b2 = s.b(g2);
                        i8 += a11 + b2;
                    }
                    break;
                case 55:
                    if (y(obj, i10, i7)) {
                        int J = J(obj, j);
                        i3 = s.a(i10 << 3);
                        K = s.z(J);
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 56:
                    if (y(obj, i10, i7)) {
                        a9 = s.a(i10 << 3);
                        W = a9 + 8;
                        i8 += W;
                    }
                    break;
                case 57:
                    if (y(obj, i10, i7)) {
                        a10 = s.a(i10 << 3);
                        W = a10 + 4;
                        i8 += W;
                    }
                    break;
                case 58:
                    if (y(obj, i10, i7)) {
                        W = s.a(i10 << 3) + 1;
                        i8 += W;
                    }
                    break;
                case 59:
                    if (y(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzaby) {
                            a12 = s.a(i10 << 3);
                            e2 = ((zzaby) object2).e();
                            a13 = s.a(e2);
                            i4 = a12 + a13 + e2;
                            i8 += i4;
                        } else {
                            i3 = s.a(i10 << 3);
                            K = s.B((String) object2);
                            i4 = i3 + K;
                            i8 += i4;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (y(obj, i10, i7)) {
                        W = f1.Q(i10, unsafe.getObject(obj, j), i(i7));
                        i8 += W;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (y(obj, i10, i7)) {
                        zzaby zzabyVar2 = (zzaby) unsafe.getObject(obj, j);
                        a12 = s.a(i10 << 3);
                        e2 = zzabyVar2.e();
                        a13 = s.a(e2);
                        i4 = a12 + a13 + e2;
                        i8 += i4;
                    }
                    break;
                case 62:
                    if (y(obj, i10, i7)) {
                        int J2 = J(obj, j);
                        i3 = s.a(i10 << 3);
                        K = s.a(J2);
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 63:
                    if (y(obj, i10, i7)) {
                        int J3 = J(obj, j);
                        i3 = s.a(i10 << 3);
                        K = s.z(J3);
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case 64:
                    if (y(obj, i10, i7)) {
                        a10 = s.a(i10 << 3);
                        W = a10 + 4;
                        i8 += W;
                    }
                    break;
                case 65:
                    if (y(obj, i10, i7)) {
                        a9 = s.a(i10 << 3);
                        W = a9 + 8;
                        i8 += W;
                    }
                    break;
                case 66:
                    if (y(obj, i10, i7)) {
                        int J4 = J(obj, j);
                        i3 = s.a(i10 << 3);
                        K = s.a((J4 >> 31) ^ (J4 + J4));
                        i4 = i3 + K;
                        i8 += i4;
                    }
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (y(obj, i10, i7)) {
                        long g3 = g(obj, j);
                        i8 += s.a(i10 << 3) + s.b((g3 >> 63) ^ (g3 + g3));
                    }
                    break;
                case 68:
                    if (y(obj, i10, i7)) {
                        W = s.y(i10, (zx9) unsafe.getObject(obj, j), i(i7));
                        i8 += W;
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        i1 i1Var = this.m;
        int a14 = i8 + i1Var.a(i1Var.d(obj));
        if (!this.f) {
            return a14;
        }
        this.n.a(obj);
        throw null;
    }

    private final int I(Object obj) {
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
        Unsafe unsafe = r;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.length; i3 += 3) {
            int f = f(i3);
            int e2 = e(f);
            int i4 = this.a[i3];
            long j = f & 1048575;
            if (e2 >= zzacs.zzJ.zza() && e2 <= zzacs.zzW.zza()) {
                int i5 = this.a[i3 + 2];
            }
            switch (e2) {
                case 0:
                    if (v(obj, i3)) {
                        a = s.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(obj, i3)) {
                        a2 = s.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(obj, i3)) {
                        long i6 = p1.i(obj, j);
                        a3 = s.a(i4 << 3);
                        b = s.b(i6);
                        i2 += a3 + b;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(obj, i3)) {
                        long i7 = p1.i(obj, j);
                        a3 = s.a(i4 << 3);
                        b = s.b(i7);
                        i2 += a3 + b;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(obj, i3)) {
                        int h = p1.h(obj, j);
                        a4 = s.a(i4 << 3);
                        z = s.z(h);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(obj, i3)) {
                        a = s.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(obj, i3)) {
                        a2 = s.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(obj, i3)) {
                        a5 = s.a(i4 << 3);
                        Q = a5 + 1;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!v(obj, i3)) {
                        break;
                    } else {
                        Object k = p1.k(obj, j);
                        if (k instanceof zzaby) {
                            a6 = s.a(i4 << 3);
                            e = ((zzaby) k).e();
                            a7 = s.a(e);
                            i = a6 + a7 + e;
                            i2 += i;
                            break;
                        } else {
                            a4 = s.a(i4 << 3);
                            z = s.B((String) k);
                            i = a4 + z;
                            i2 += i;
                        }
                    }
                case 9:
                    if (v(obj, i3)) {
                        Q = f1.Q(i4, p1.k(obj, j), i(i3));
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (v(obj, i3)) {
                        zzaby zzabyVar = (zzaby) p1.k(obj, j);
                        a6 = s.a(i4 << 3);
                        e = zzabyVar.e();
                        a7 = s.a(e);
                        i = a6 + a7 + e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(obj, i3)) {
                        int h2 = p1.h(obj, j);
                        a4 = s.a(i4 << 3);
                        z = s.a(h2);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(obj, i3)) {
                        int h3 = p1.h(obj, j);
                        a4 = s.a(i4 << 3);
                        z = s.z(h3);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(obj, i3)) {
                        a2 = s.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(obj, i3)) {
                        a = s.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(obj, i3)) {
                        int h4 = p1.h(obj, j);
                        a4 = s.a(i4 << 3);
                        z = s.a((h4 >> 31) ^ (h4 + h4));
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(obj, i3)) {
                        long i8 = p1.i(obj, j);
                        a4 = s.a(i4 << 3);
                        z = s.b((i8 >> 63) ^ (i8 + i8));
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (v(obj, i3)) {
                        Q = s.y(i4, (zx9) p1.k(obj, j), i(i3));
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    Q = f1.J(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 19:
                    Q = f1.H(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 20:
                    Q = f1.O(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 21:
                    Q = f1.Z(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 22:
                    Q = f1.M(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 23:
                    Q = f1.J(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 24:
                    Q = f1.H(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case EventType.SUBS /* 25 */:
                    Q = f1.A(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case EventType.CDN /* 26 */:
                    Q = f1.W(i4, (List) p1.k(obj, j));
                    i2 += Q;
                    break;
                case 27:
                    Q = f1.R(i4, (List) p1.k(obj, j), i(i3));
                    i2 += Q;
                    break;
                case 28:
                    Q = f1.E(i4, (List) p1.k(obj, j));
                    i2 += Q;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    Q = f1.X(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 30:
                    Q = f1.F(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 31:
                    Q = f1.H(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 32:
                    Q = f1.J(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 33:
                    Q = f1.S(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 34:
                    Q = f1.U(i4, (List) p1.k(obj, j), false);
                    i2 += Q;
                    break;
                case 35:
                    z = f1.K((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    z = f1.I((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    z = f1.P((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    z = f1.a0((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    z = f1.N((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    z = f1.K((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    z = f1.I((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    z = f1.D((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    z = f1.Y((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    z = f1.G((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    z = f1.I((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    z = f1.K((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    z = f1.T((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    z = f1.V((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        C = s.C(i4);
                        a8 = s.a(z);
                        a4 = C + a8;
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    Q = f1.L(i4, (List) p1.k(obj, j), i(i3));
                    i2 += Q;
                    break;
                case 50:
                    p0.a(i4, p1.k(obj, j), k(i3));
                    break;
                case 51:
                    if (y(obj, i4, i3)) {
                        a = s.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(obj, i4, i3)) {
                        a2 = s.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (y(obj, i4, i3)) {
                        long g = g(obj, j);
                        a3 = s.a(i4 << 3);
                        b = s.b(g);
                        i2 += a3 + b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(obj, i4, i3)) {
                        long g2 = g(obj, j);
                        a3 = s.a(i4 << 3);
                        b = s.b(g2);
                        i2 += a3 + b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(obj, i4, i3)) {
                        int J = J(obj, j);
                        a4 = s.a(i4 << 3);
                        z = s.z(J);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(obj, i4, i3)) {
                        a = s.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(obj, i4, i3)) {
                        a2 = s.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(obj, i4, i3)) {
                        a5 = s.a(i4 << 3);
                        Q = a5 + 1;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!y(obj, i4, i3)) {
                        break;
                    } else {
                        Object k2 = p1.k(obj, j);
                        if (k2 instanceof zzaby) {
                            a6 = s.a(i4 << 3);
                            e = ((zzaby) k2).e();
                            a7 = s.a(e);
                            i = a6 + a7 + e;
                            i2 += i;
                            break;
                        } else {
                            a4 = s.a(i4 << 3);
                            z = s.B((String) k2);
                            i = a4 + z;
                            i2 += i;
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (y(obj, i4, i3)) {
                        Q = f1.Q(i4, p1.k(obj, j), i(i3));
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (y(obj, i4, i3)) {
                        zzaby zzabyVar2 = (zzaby) p1.k(obj, j);
                        a6 = s.a(i4 << 3);
                        e = zzabyVar2.e();
                        a7 = s.a(e);
                        i = a6 + a7 + e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(obj, i4, i3)) {
                        int J2 = J(obj, j);
                        a4 = s.a(i4 << 3);
                        z = s.a(J2);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(obj, i4, i3)) {
                        int J3 = J(obj, j);
                        a4 = s.a(i4 << 3);
                        z = s.z(J3);
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(obj, i4, i3)) {
                        a2 = s.a(i4 << 3);
                        Q = a2 + 4;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(obj, i4, i3)) {
                        a = s.a(i4 << 3);
                        Q = a + 8;
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(obj, i4, i3)) {
                        int J4 = J(obj, j);
                        a4 = s.a(i4 << 3);
                        z = s.a((J4 >> 31) ^ (J4 + J4));
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (y(obj, i4, i3)) {
                        long g3 = g(obj, j);
                        a4 = s.a(i4 << 3);
                        z = s.b((g3 >> 63) ^ (g3 + g3));
                        i = a4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(obj, i4, i3)) {
                        Q = s.y(i4, (zx9) p1.k(obj, j), i(i3));
                        i2 += Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        i1 i1Var = this.m;
        return i2 + i1Var.a(i1Var.d(obj));
    }

    private static int J(Object obj, long j) {
        return ((Integer) p1.k(obj, j)).intValue();
    }

    private final int K(Object obj, byte[] bArr, int i, int i2, int i3, long j, g gVar) {
        Unsafe unsafe = r;
        Object k = k(i3);
        Object object = unsafe.getObject(obj, j);
        if (p0.b(object)) {
            zzadz c = zzadz.a().c();
            p0.c(c, object);
            unsafe.putObject(obj, j, c);
        }
        lh4.a(k);
        throw null;
    }

    private final int L(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, g gVar) {
        Unsafe unsafe = r;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(h.n(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(h.b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
            case 54:
                if (i5 == 0) {
                    int m = h.m(bArr, i, gVar);
                    unsafe.putObject(obj, j, Long.valueOf(gVar.b));
                    unsafe.putInt(obj, j2, i4);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int j3 = h.j(bArr, i, gVar);
                    unsafe.putObject(obj, j, Integer.valueOf(gVar.a));
                    unsafe.putInt(obj, j2, i4);
                    return j3;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(h.n(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(h.b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m2 = h.m(bArr, i, gVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(gVar.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int j4 = h.j(bArr, i, gVar);
                    int i9 = gVar.a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !t1.f(bArr, j4, j4 + i9)) {
                            throw zzadi.d();
                        }
                        unsafe.putObject(obj, j, new String(bArr, j4, i9, f0.b));
                        j4 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return j4;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 == 2) {
                    int d = h.d(i(i8), bArr, i, i2, gVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, gVar.c);
                    } else {
                        unsafe.putObject(obj, j, f0.g(object, gVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return d;
                }
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 == 2) {
                    int a = h.a(bArr, i, gVar);
                    unsafe.putObject(obj, j, gVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int j5 = h.j(bArr, i, gVar);
                    int i10 = gVar.a;
                    iw9 h = h(i8);
                    if (h == null || h.zza(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        C(obj).h(i3, Long.valueOf(i10));
                    }
                    return j5;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int j6 = h.j(bArr, i, gVar);
                    unsafe.putObject(obj, j, Integer.valueOf(p.l(gVar.a)));
                    unsafe.putInt(obj, j2, i4);
                    return j6;
                }
                break;
            case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                if (i5 == 0) {
                    int m3 = h.m(bArr, i, gVar);
                    unsafe.putObject(obj, j, Long.valueOf(p.m(gVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int c = h.c(i(i8), bArr, i, i2, (i3 & (-8)) | 4, gVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, gVar.c);
                    } else {
                        unsafe.putObject(obj, j, f0.g(object2, gVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return c;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0081. Please report as an issue. */
    private final int M(Object obj, byte[] bArr, int i, int i2, g gVar) {
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
        u0 u0Var = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i15 = i2;
        g gVar2 = gVar;
        Unsafe unsafe2 = r;
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
                i4 = h.k(b, bArr2, i23, gVar2);
                i3 = gVar2.a;
            } else {
                i3 = b;
                i4 = i23;
            }
            int i24 = i3 >>> 3;
            int i25 = i3 & 7;
            int P = i24 > i19 ? u0Var.P(i24, i21 / 3) : u0Var.O(i24);
            if (P == i17) {
                i5 = i4;
                i6 = i24;
                i7 = i17;
                unsafe = unsafe2;
                i8 = 0;
            } else {
                int[] iArr = u0Var.a;
                int i26 = iArr[P + 1];
                int e = e(i26);
                long j = i26 & i16;
                if (e <= 17) {
                    int i27 = iArr[P + 2];
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
                            gVar2 = gVar;
                            i9 = P;
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
                                p1.t(obj2, j, Double.longBitsToDouble(h.n(bArr2, i10)));
                                i18 = i10 + 8;
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 1:
                            gVar2 = gVar;
                            i9 = P;
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
                                p1.u(obj2, j, Float.intBitsToFloat(h.b(bArr2, i10)));
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
                            gVar2 = gVar;
                            i9 = P;
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
                                m = h.m(bArr2, i10, gVar2);
                                unsafe2.putLong(obj, j, gVar2.b);
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
                            gVar2 = gVar;
                            i9 = P;
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
                                i18 = h.j(bArr2, i10, gVar2);
                                unsafe2.putInt(obj2, j, gVar2.a);
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            gVar2 = gVar;
                            i9 = P;
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
                                unsafe2.putLong(obj, j, h.n(bArr2, i4));
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
                            gVar2 = gVar;
                            i9 = P;
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
                                unsafe2.putInt(obj2, j, h.b(bArr2, i4));
                                i18 = i4 + 4;
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 7:
                            gVar2 = gVar;
                            i9 = P;
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
                                i18 = h.m(bArr2, i4, gVar2);
                                p1.r(obj2, j, gVar2.b != 0);
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 8:
                            gVar2 = gVar;
                            i9 = P;
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
                                i18 = (536870912 & i26) == 0 ? h.g(bArr2, i4, gVar2) : h.h(bArr2, i4, gVar2);
                                unsafe2.putObject(obj2, j, gVar2.c);
                                i22 |= i28;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 9:
                            gVar2 = gVar;
                            i9 = P;
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
                                d = h.d(u0Var.i(i9), bArr2, i4, i15, gVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, gVar2.c);
                                } else {
                                    unsafe2.putObject(obj2, j, f0.g(object, gVar2.c));
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
                            gVar2 = gVar;
                            i9 = P;
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
                                d = h.a(bArr2, i4, gVar2);
                                unsafe2.putObject(obj2, j, gVar2.c);
                                i22 |= i28;
                                i18 = d;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 12:
                            gVar2 = gVar;
                            i9 = P;
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
                                d = h.j(bArr2, i4, gVar2);
                                unsafe2.putInt(obj2, j, gVar2.a);
                                i22 |= i28;
                                i18 = d;
                                i21 = i9;
                                i19 = i6;
                                i16 = i11;
                                i17 = -1;
                                break;
                            }
                        case 15:
                            gVar2 = gVar;
                            i9 = P;
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
                                d = h.j(bArr2, i4, gVar2);
                                unsafe2.putInt(obj2, j, p.l(gVar2.a));
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
                                i9 = P;
                                i10 = i4;
                                i5 = i10;
                                unsafe = unsafe2;
                                i8 = i9;
                                i7 = -1;
                                break;
                            } else {
                                gVar2 = gVar;
                                m = h.m(bArr2, i4, gVar2);
                                i9 = P;
                                i6 = i24;
                                i11 = 1048575;
                                unsafe2.putLong(obj, j, p.m(gVar2.b));
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
                            i9 = P;
                            i10 = i4;
                            i5 = i10;
                            unsafe = unsafe2;
                            i8 = i9;
                            i7 = -1;
                            break;
                    }
                } else {
                    gVar2 = gVar;
                    i9 = P;
                    int i30 = i4;
                    i11 = 1048575;
                    i6 = i24;
                    if (e == 27) {
                        if (i25 == 2) {
                            mw9 mw9Var = (mw9) unsafe2.getObject(obj2, j);
                            if (!mw9Var.zzc()) {
                                int size = mw9Var.size();
                                mw9Var = mw9Var.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, mw9Var);
                            }
                            i18 = h.e(u0Var.i(i9), i3, bArr, i30, i2, mw9Var, gVar);
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
                        i18 = N(obj, bArr, i30, i2, i3, i6, i25, i9, i26, e, j, gVar);
                        if (i18 != i30) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i15 = i2;
                            gVar2 = gVar;
                            i20 = i14;
                            i17 = i7;
                            i19 = i6;
                            i22 = i13;
                            i21 = i8;
                            unsafe2 = unsafe;
                            i16 = 1048575;
                            u0Var = this;
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
                            i18 = L(obj, bArr, i12, i2, i3, i6, i25, i26, e, j, i8, gVar);
                            if (i18 != i12) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i15 = i2;
                                gVar2 = gVar;
                                i20 = i14;
                                i17 = i7;
                                i19 = i6;
                                i22 = i13;
                                i21 = i8;
                                unsafe2 = unsafe;
                                i16 = 1048575;
                                u0Var = this;
                            } else {
                                i5 = i18;
                                i20 = i14;
                                i22 = i13;
                            }
                        } else if (i25 == 2) {
                            i18 = K(obj, bArr, i12, i2, i8, j, gVar);
                            if (i18 != i12) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i15 = i2;
                                gVar2 = gVar;
                                i20 = i14;
                                i17 = i7;
                                i19 = i6;
                                i22 = i13;
                                i21 = i8;
                                unsafe2 = unsafe;
                                i16 = 1048575;
                                u0Var = this;
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
            i18 = h.i(i3, bArr, i5, i2, C(obj), gVar);
            u0Var = this;
            obj2 = obj;
            bArr2 = bArr;
            i15 = i2;
            gVar2 = gVar;
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
        throw zzadi.g();
    }

    private final int N(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, g gVar) {
        int i8;
        int l;
        Unsafe unsafe = r;
        mw9 mw9Var = (mw9) unsafe.getObject(obj, j2);
        if (!mw9Var.zzc()) {
            int size = mw9Var.size();
            mw9Var = mw9Var.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, mw9Var);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    lh4.a(mw9Var);
                    int j3 = h.j(bArr, i, gVar);
                    int i9 = gVar.a + j3;
                    if (j3 < i9) {
                        Double.longBitsToDouble(h.n(bArr, j3));
                        throw null;
                    }
                    if (j3 == i9) {
                        return j3;
                    }
                    throw zzadi.i();
                }
                if (i5 == 1) {
                    lh4.a(mw9Var);
                    Double.longBitsToDouble(h.n(bArr, i));
                    throw null;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    lh4.a(mw9Var);
                    int j4 = h.j(bArr, i, gVar);
                    int i10 = gVar.a + j4;
                    if (j4 < i10) {
                        Float.intBitsToFloat(h.b(bArr, j4));
                        throw null;
                    }
                    if (j4 == i10) {
                        return j4;
                    }
                    throw zzadi.i();
                }
                if (i5 == 5) {
                    lh4.a(mw9Var);
                    Float.intBitsToFloat(h.b(bArr, i));
                    throw null;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    lh4.a(mw9Var);
                    int j5 = h.j(bArr, i, gVar);
                    int i11 = gVar.a + j5;
                    if (j5 < i11) {
                        h.m(bArr, j5, gVar);
                        throw null;
                    }
                    if (j5 == i11) {
                        return j5;
                    }
                    throw zzadi.i();
                }
                if (i5 == 0) {
                    lh4.a(mw9Var);
                    h.m(bArr, i, gVar);
                    long j6 = gVar.b;
                    throw null;
                }
                break;
            case 22:
            case BuildConfig.VERSION_CODE /* 29 */:
            case 39:
            case 43:
                if (i5 == 2) {
                    return h.f(bArr, i, mw9Var, gVar);
                }
                if (i5 == 0) {
                    return h.l(i3, bArr, i, i2, mw9Var, gVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    lh4.a(mw9Var);
                    int j7 = h.j(bArr, i, gVar);
                    int i12 = gVar.a + j7;
                    if (j7 < i12) {
                        h.n(bArr, j7);
                        throw null;
                    }
                    if (j7 == i12) {
                        return j7;
                    }
                    throw zzadi.i();
                }
                if (i5 == 1) {
                    lh4.a(mw9Var);
                    h.n(bArr, i);
                    throw null;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    e0 e0Var = (e0) mw9Var;
                    int j8 = h.j(bArr, i, gVar);
                    int i13 = gVar.a + j8;
                    while (j8 < i13) {
                        e0Var.f(h.b(bArr, j8));
                        j8 += 4;
                    }
                    if (j8 == i13) {
                        return j8;
                    }
                    throw zzadi.i();
                }
                if (i5 == 5) {
                    e0 e0Var2 = (e0) mw9Var;
                    e0Var2.f(h.b(bArr, i));
                    int i14 = i + 4;
                    while (i14 < i2) {
                        int j9 = h.j(bArr, i14, gVar);
                        if (i3 != gVar.a) {
                            return i14;
                        }
                        e0Var2.f(h.b(bArr, j9));
                        i14 = j9 + 4;
                    }
                    return i14;
                }
                break;
            case EventType.SUBS /* 25 */:
            case 42:
                if (i5 == 2) {
                    lh4.a(mw9Var);
                    int j10 = h.j(bArr, i, gVar);
                    int i15 = gVar.a + j10;
                    if (j10 < i15) {
                        h.m(bArr, j10, gVar);
                        throw null;
                    }
                    if (j10 == i15) {
                        return j10;
                    }
                    throw zzadi.i();
                }
                if (i5 == 0) {
                    lh4.a(mw9Var);
                    h.m(bArr, i, gVar);
                    long j11 = gVar.b;
                    throw null;
                }
                break;
            case EventType.CDN /* 26 */:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int j12 = h.j(bArr, i, gVar);
                        int i16 = gVar.a;
                        if (i16 < 0) {
                            throw zzadi.f();
                        }
                        if (i16 == 0) {
                            mw9Var.add("");
                        } else {
                            mw9Var.add(new String(bArr, j12, i16, f0.b));
                            j12 += i16;
                        }
                        while (j12 < i2) {
                            int j13 = h.j(bArr, j12, gVar);
                            if (i3 != gVar.a) {
                                return j12;
                            }
                            j12 = h.j(bArr, j13, gVar);
                            int i17 = gVar.a;
                            if (i17 < 0) {
                                throw zzadi.f();
                            }
                            if (i17 == 0) {
                                mw9Var.add("");
                            } else {
                                mw9Var.add(new String(bArr, j12, i17, f0.b));
                                j12 += i17;
                            }
                        }
                        return j12;
                    }
                    int j14 = h.j(bArr, i, gVar);
                    int i18 = gVar.a;
                    if (i18 < 0) {
                        throw zzadi.f();
                    }
                    if (i18 == 0) {
                        mw9Var.add("");
                        i8 = j14;
                    } else {
                        i8 = j14 + i18;
                        if (!t1.f(bArr, j14, i8)) {
                            throw zzadi.d();
                        }
                        mw9Var.add(new String(bArr, j14, i18, f0.b));
                    }
                    while (i8 < i2) {
                        int j15 = h.j(bArr, i8, gVar);
                        if (i3 != gVar.a) {
                            return i8;
                        }
                        i8 = h.j(bArr, j15, gVar);
                        int i19 = gVar.a;
                        if (i19 < 0) {
                            throw zzadi.f();
                        }
                        if (i19 == 0) {
                            mw9Var.add("");
                        } else {
                            int i20 = i8 + i19;
                            if (!t1.f(bArr, i8, i20)) {
                                throw zzadi.d();
                            }
                            mw9Var.add(new String(bArr, i8, i19, f0.b));
                            i8 = i20;
                        }
                    }
                    return i8;
                }
                break;
            case 27:
                if (i5 == 2) {
                    return h.e(i(i6), i3, bArr, i, i2, mw9Var, gVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int j16 = h.j(bArr, i, gVar);
                    int i21 = gVar.a;
                    if (i21 < 0) {
                        throw zzadi.f();
                    }
                    if (i21 > bArr.length - j16) {
                        throw zzadi.i();
                    }
                    if (i21 == 0) {
                        mw9Var.add(zzaby.a);
                    } else {
                        mw9Var.add(zzaby.v(bArr, j16, i21));
                        j16 += i21;
                    }
                    while (j16 < i2) {
                        int j17 = h.j(bArr, j16, gVar);
                        if (i3 != gVar.a) {
                            return j16;
                        }
                        j16 = h.j(bArr, j17, gVar);
                        int i22 = gVar.a;
                        if (i22 < 0) {
                            throw zzadi.f();
                        }
                        if (i22 > bArr.length - j16) {
                            throw zzadi.i();
                        }
                        if (i22 == 0) {
                            mw9Var.add(zzaby.a);
                        } else {
                            mw9Var.add(zzaby.v(bArr, j16, i22));
                            j16 += i22;
                        }
                    }
                    return j16;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    l = h.f(bArr, i, mw9Var, gVar);
                } else if (i5 == 0) {
                    l = h.l(i3, bArr, i, i2, mw9Var, gVar);
                }
                c0 c0Var = (c0) obj;
                j1 j1Var = c0Var.zzc;
                Object c = f1.c(i4, mw9Var, h(i6), j1Var != j1.c() ? j1Var : null, this.m);
                if (c == null) {
                    return l;
                }
                c0Var.zzc = (j1) c;
                return l;
            case 33:
            case 47:
                if (i5 == 2) {
                    e0 e0Var3 = (e0) mw9Var;
                    int j18 = h.j(bArr, i, gVar);
                    int i23 = gVar.a + j18;
                    while (j18 < i23) {
                        j18 = h.j(bArr, j18, gVar);
                        e0Var3.f(p.l(gVar.a));
                    }
                    if (j18 == i23) {
                        return j18;
                    }
                    throw zzadi.i();
                }
                if (i5 == 0) {
                    e0 e0Var4 = (e0) mw9Var;
                    int j19 = h.j(bArr, i, gVar);
                    e0Var4.f(p.l(gVar.a));
                    while (j19 < i2) {
                        int j20 = h.j(bArr, j19, gVar);
                        if (i3 != gVar.a) {
                            return j19;
                        }
                        j19 = h.j(bArr, j20, gVar);
                        e0Var4.f(p.l(gVar.a));
                    }
                    return j19;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    lh4.a(mw9Var);
                    int j21 = h.j(bArr, i, gVar);
                    int i24 = gVar.a + j21;
                    if (j21 >= i24) {
                        if (j21 == i24) {
                            return j21;
                        }
                        throw zzadi.i();
                    }
                    h.m(bArr, j21, gVar);
                    p.m(gVar.b);
                    throw null;
                }
                if (i5 == 0) {
                    lh4.a(mw9Var);
                    h.m(bArr, i, gVar);
                    p.m(gVar.b);
                    throw null;
                }
                break;
            default:
                if (i5 == 3) {
                    d1 i25 = i(i6);
                    int i26 = (i3 & (-8)) | 4;
                    int c2 = h.c(i25, bArr, i, i2, i26, gVar);
                    mw9Var.add(gVar.c);
                    while (c2 < i2) {
                        int j22 = h.j(bArr, c2, gVar);
                        if (i3 != gVar.a) {
                            return c2;
                        }
                        c2 = h.c(i25, bArr, j22, i2, i26, gVar);
                        mw9Var.add(gVar.c);
                    }
                    return c2;
                }
                break;
        }
        return i;
    }

    private final int O(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return d(i, 0);
    }

    private final int P(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return d(i, i2);
    }

    private final int Q(int i) {
        return this.a[i + 2];
    }

    private final int d(int i, int i2) {
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
        return ((Long) p1.k(obj, j)).longValue();
    }

    private final iw9 h(int i) {
        int i2 = i / 3;
        return (iw9) this.b[i2 + i2 + 1];
    }

    private final d1 i(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        d1 d1Var = (d1) this.b[i3];
        if (d1Var != null) {
            return d1Var;
        }
        d1 b = z0.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b;
        return b;
    }

    private final Object j(Object obj, int i, Object obj2, i1 i1Var) {
        int i2 = this.a[i];
        Object k = p1.k(obj, f(i) & 1048575);
        if (k == null || h(i) == null) {
            return obj2;
        }
        lh4.a(k(i));
        throw null;
    }

    private final Object k(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    private static Field l(Class cls, String str) {
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

    private final void m(Object obj, Object obj2, int i) {
        long f = f(i) & 1048575;
        if (v(obj2, i)) {
            Object k = p1.k(obj, f);
            Object k2 = p1.k(obj2, f);
            if (k != null && k2 != null) {
                p1.x(obj, f, f0.g(k, k2));
                p(obj, i);
            } else if (k2 != null) {
                p1.x(obj, f, k2);
                p(obj, i);
            }
        }
    }

    private final void n(Object obj, Object obj2, int i) {
        int f = f(i);
        int i2 = this.a[i];
        long j = f & 1048575;
        if (y(obj2, i2, i)) {
            Object k = y(obj, i2, i) ? p1.k(obj, j) : null;
            Object k2 = p1.k(obj2, j);
            if (k != null && k2 != null) {
                p1.x(obj, j, f0.g(k, k2));
                q(obj, i2, i);
            } else if (k2 != null) {
                p1.x(obj, j, k2);
                q(obj, i2, i);
            }
        }
    }

    private final void o(Object obj, int i, c1 c1Var) {
        if (u(i)) {
            p1.x(obj, i & 1048575, c1Var.c());
        } else if (this.g) {
            p1.x(obj, i & 1048575, c1Var.g());
        } else {
            p1.x(obj, i & 1048575, c1Var.zzp());
        }
    }

    private final void p(Object obj, int i) {
        int Q = Q(i);
        long j = 1048575 & Q;
        if (j == 1048575) {
            return;
        }
        p1.v(obj, j, (1 << (Q >>> 20)) | p1.h(obj, j));
    }

    private final void q(Object obj, int i, int i2) {
        p1.v(obj, Q(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void r(Object obj, v1 v1Var) {
        int i;
        boolean z;
        if (this.f) {
            this.n.a(obj);
            throw null;
        }
        int length = this.a.length;
        Unsafe unsafe = r;
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
                        v1Var.zzf(i6, p1.f(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzo(i6, p1.g(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzb(i6, p1.B(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        A(i6, unsafe.getObject(obj, j), v1Var);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.a(i6, unsafe.getObject(obj, j), i(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.c(i6, (zzaby) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        v1Var.b(i6, unsafe.getObject(obj, j), i(i4));
                        break;
                    }
                case 18:
                    f1.j(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 19:
                    f1.n(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 20:
                    f1.q(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 21:
                    f1.y(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 22:
                    f1.p(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 23:
                    f1.m(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 24:
                    f1.l(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case EventType.SUBS /* 25 */:
                    f1.h(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case EventType.CDN /* 26 */:
                    f1.w(this.a[i4], (List) unsafe.getObject(obj, j), v1Var);
                    break;
                case 27:
                    f1.r(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, i(i4));
                    break;
                case 28:
                    f1.i(this.a[i4], (List) unsafe.getObject(obj, j), v1Var);
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    z = false;
                    f1.x(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 30:
                    z = false;
                    f1.k(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 31:
                    z = false;
                    f1.s(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 32:
                    z = false;
                    f1.t(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 33:
                    z = false;
                    f1.u(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 34:
                    z = false;
                    f1.v(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, false);
                    break;
                case 35:
                    f1.j(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 36:
                    f1.n(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 37:
                    f1.q(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 38:
                    f1.y(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 39:
                    f1.p(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 40:
                    f1.m(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 41:
                    f1.l(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 42:
                    f1.h(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 43:
                    f1.x(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 44:
                    f1.k(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 45:
                    f1.s(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 46:
                    f1.t(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 47:
                    f1.u(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 48:
                    f1.v(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, true);
                    break;
                case 49:
                    f1.o(this.a[i4], (List) unsafe.getObject(obj, j), v1Var, i(i4));
                    break;
                case 50:
                    s(v1Var, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (y(obj, i6, i4)) {
                        v1Var.zzf(i6, F(obj, j));
                    }
                    break;
                case 52:
                    if (y(obj, i6, i4)) {
                        v1Var.zzo(i6, G(obj, j));
                    }
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (y(obj, i6, i4)) {
                        v1Var.zzt(i6, g(obj, j));
                    }
                    break;
                case 54:
                    if (y(obj, i6, i4)) {
                        v1Var.zzJ(i6, g(obj, j));
                    }
                    break;
                case 55:
                    if (y(obj, i6, i4)) {
                        v1Var.zzr(i6, J(obj, j));
                    }
                    break;
                case 56:
                    if (y(obj, i6, i4)) {
                        v1Var.zzm(i6, g(obj, j));
                    }
                    break;
                case 57:
                    if (y(obj, i6, i4)) {
                        v1Var.zzk(i6, J(obj, j));
                    }
                    break;
                case 58:
                    if (y(obj, i6, i4)) {
                        v1Var.zzb(i6, z(obj, j));
                    }
                    break;
                case 59:
                    if (y(obj, i6, i4)) {
                        A(i6, unsafe.getObject(obj, j), v1Var);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (y(obj, i6, i4)) {
                        v1Var.a(i6, unsafe.getObject(obj, j), i(i4));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (y(obj, i6, i4)) {
                        v1Var.c(i6, (zzaby) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (y(obj, i6, i4)) {
                        v1Var.zzH(i6, J(obj, j));
                    }
                    break;
                case 63:
                    if (y(obj, i6, i4)) {
                        v1Var.zzi(i6, J(obj, j));
                    }
                    break;
                case 64:
                    if (y(obj, i6, i4)) {
                        v1Var.zzw(i6, J(obj, j));
                    }
                    break;
                case 65:
                    if (y(obj, i6, i4)) {
                        v1Var.zzy(i6, g(obj, j));
                    }
                    break;
                case 66:
                    if (y(obj, i6, i4)) {
                        v1Var.zzA(i6, J(obj, j));
                    }
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (y(obj, i6, i4)) {
                        v1Var.zzC(i6, g(obj, j));
                    }
                    break;
                case 68:
                    if (y(obj, i6, i4)) {
                        v1Var.b(i6, unsafe.getObject(obj, j), i(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        i1 i1Var = this.m;
        i1Var.p(i1Var.d(obj), v1Var);
    }

    private final void s(v1 v1Var, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        lh4.a(k(i2));
        throw null;
    }

    private final boolean t(Object obj, Object obj2, int i) {
        return v(obj, i) == v(obj2, i);
    }

    private static boolean u(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean v(Object obj, int i) {
        int Q = Q(i);
        long j = Q & 1048575;
        if (j != 1048575) {
            return (p1.h(obj, j) & (1 << (Q >>> 20))) != 0;
        }
        int f = f(i);
        long j2 = f & 1048575;
        switch (e(f)) {
            case 0:
                return Double.doubleToRawLongBits(p1.f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(p1.g(obj, j2)) != 0;
            case 2:
                return p1.i(obj, j2) != 0;
            case 3:
                return p1.i(obj, j2) != 0;
            case 4:
                return p1.h(obj, j2) != 0;
            case 5:
                return p1.i(obj, j2) != 0;
            case 6:
                return p1.h(obj, j2) != 0;
            case 7:
                return p1.B(obj, j2);
            case 8:
                Object k = p1.k(obj, j2);
                if (k instanceof String) {
                    return !((String) k).isEmpty();
                }
                if (k instanceof zzaby) {
                    return !zzaby.a.equals(k);
                }
                throw new IllegalArgumentException();
            case 9:
                return p1.k(obj, j2) != null;
            case 10:
                return !zzaby.a.equals(p1.k(obj, j2));
            case 11:
                return p1.h(obj, j2) != 0;
            case 12:
                return p1.h(obj, j2) != 0;
            case 13:
                return p1.h(obj, j2) != 0;
            case 14:
                return p1.i(obj, j2) != 0;
            case 15:
                return p1.h(obj, j2) != 0;
            case 16:
                return p1.i(obj, j2) != 0;
            case 17:
                return p1.k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean w(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? v(obj, i) : (i3 & i4) != 0;
    }

    private static boolean x(Object obj, int i, d1 d1Var) {
        return d1Var.zzl(p1.k(obj, i & 1048575));
    }

    private final boolean y(Object obj, int i, int i2) {
        return p1.h(obj, (long) (Q(i2) & 1048575)) == i;
    }

    private static boolean z(Object obj, long j) {
        return ((Boolean) p1.k(obj, j)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x03a9, code lost:
    
        if (r0 != r19) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03ab, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03c5, code lost:
    
        r2 = r0;
        r7 = r20;
        r6 = r22;
        r0 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03ee, code lost:
    
        if (r0 != r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0414, code lost:
    
        if (r0 != r15) goto L124;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int B(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.pal.g r35) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.u0.B(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.pal.g):int");
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final void a(Object obj, byte[] bArr, int i, int i2, g gVar) {
        if (this.h) {
            M(obj, bArr, i, i2, gVar);
        } else {
            B(obj, bArr, i, i2, 0, gVar);
        }
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final void b(Object obj, c1 c1Var, ev9 ev9Var) {
        ev9Var.getClass();
        i1 i1Var = this.m;
        v vVar = this.n;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = c1Var.zzc();
                int O = O(zzc);
                if (O >= 0) {
                    int f = f(O);
                    try {
                        switch (e(f)) {
                            case 0:
                                p1.t(obj, f & 1048575, c1Var.zza());
                                p(obj, O);
                                break;
                            case 1:
                                p1.u(obj, f & 1048575, c1Var.zzb());
                                p(obj, O);
                                break;
                            case 2:
                                p1.w(obj, f & 1048575, c1Var.zzl());
                                p(obj, O);
                                break;
                            case 3:
                                p1.w(obj, f & 1048575, c1Var.zzo());
                                p(obj, O);
                                break;
                            case 4:
                                p1.v(obj, f & 1048575, c1Var.zzg());
                                p(obj, O);
                                break;
                            case 5:
                                p1.w(obj, f & 1048575, c1Var.zzk());
                                p(obj, O);
                                break;
                            case 6:
                                p1.v(obj, f & 1048575, c1Var.zzf());
                                p(obj, O);
                                break;
                            case 7:
                                p1.r(obj, f & 1048575, c1Var.zzN());
                                p(obj, O);
                                break;
                            case 8:
                                o(obj, f, c1Var);
                                p(obj, O);
                                break;
                            case 9:
                                if (v(obj, O)) {
                                    long j = f & 1048575;
                                    p1.x(obj, j, f0.g(p1.k(obj, j), c1Var.h(i(O), ev9Var)));
                                    break;
                                } else {
                                    p1.x(obj, f & 1048575, c1Var.h(i(O), ev9Var));
                                    p(obj, O);
                                    break;
                                }
                            case 10:
                                p1.x(obj, f & 1048575, c1Var.zzp());
                                p(obj, O);
                                break;
                            case 11:
                                p1.v(obj, f & 1048575, c1Var.zzj());
                                p(obj, O);
                                break;
                            case 12:
                                int zze = c1Var.zze();
                                iw9 h = h(O);
                                if (h != null && !h.zza(zze)) {
                                    obj2 = f1.d(zzc, zze, obj2, i1Var);
                                    break;
                                }
                                p1.v(obj, f & 1048575, zze);
                                p(obj, O);
                                break;
                            case 13:
                                p1.v(obj, f & 1048575, c1Var.zzh());
                                p(obj, O);
                                break;
                            case 14:
                                p1.w(obj, f & 1048575, c1Var.zzm());
                                p(obj, O);
                                break;
                            case 15:
                                p1.v(obj, f & 1048575, c1Var.zzi());
                                p(obj, O);
                                break;
                            case 16:
                                p1.w(obj, f & 1048575, c1Var.zzn());
                                p(obj, O);
                                break;
                            case 17:
                                if (v(obj, O)) {
                                    long j2 = f & 1048575;
                                    p1.x(obj, j2, f0.g(p1.k(obj, j2), c1Var.i(i(O), ev9Var)));
                                    break;
                                } else {
                                    p1.x(obj, f & 1048575, c1Var.i(i(O), ev9Var));
                                    p(obj, O);
                                    break;
                                }
                            case 18:
                                c1Var.zzx(this.l.a(obj, f & 1048575));
                                break;
                            case 19:
                                c1Var.zzB(this.l.a(obj, f & 1048575));
                                break;
                            case 20:
                                c1Var.zzE(this.l.a(obj, f & 1048575));
                                break;
                            case 21:
                                c1Var.zzM(this.l.a(obj, f & 1048575));
                                break;
                            case 22:
                                c1Var.zzD(this.l.a(obj, f & 1048575));
                                break;
                            case 23:
                                c1Var.zzA(this.l.a(obj, f & 1048575));
                                break;
                            case 24:
                                c1Var.zzz(this.l.a(obj, f & 1048575));
                                break;
                            case EventType.SUBS /* 25 */:
                                c1Var.zzv(this.l.a(obj, f & 1048575));
                                break;
                            case EventType.CDN /* 26 */:
                                if (u(f)) {
                                    ((q) c1Var).a(this.l.a(obj, f & 1048575), true);
                                    break;
                                } else {
                                    ((q) c1Var).a(this.l.a(obj, f & 1048575), false);
                                    break;
                                }
                            case 27:
                                c1Var.j(this.l.a(obj, f & 1048575), i(O), ev9Var);
                                break;
                            case 28:
                                c1Var.zzw(this.l.a(obj, f & 1048575));
                                break;
                            case BuildConfig.VERSION_CODE /* 29 */:
                                c1Var.zzL(this.l.a(obj, f & 1048575));
                                break;
                            case 30:
                                List a = this.l.a(obj, f & 1048575);
                                c1Var.zzy(a);
                                obj2 = f1.c(zzc, a, h(O), obj2, i1Var);
                                break;
                            case 31:
                                c1Var.zzG(this.l.a(obj, f & 1048575));
                                break;
                            case 32:
                                c1Var.zzH(this.l.a(obj, f & 1048575));
                                break;
                            case 33:
                                c1Var.zzI(this.l.a(obj, f & 1048575));
                                break;
                            case 34:
                                c1Var.zzJ(this.l.a(obj, f & 1048575));
                                break;
                            case 35:
                                c1Var.zzx(this.l.a(obj, f & 1048575));
                                break;
                            case 36:
                                c1Var.zzB(this.l.a(obj, f & 1048575));
                                break;
                            case 37:
                                c1Var.zzE(this.l.a(obj, f & 1048575));
                                break;
                            case 38:
                                c1Var.zzM(this.l.a(obj, f & 1048575));
                                break;
                            case 39:
                                c1Var.zzD(this.l.a(obj, f & 1048575));
                                break;
                            case 40:
                                c1Var.zzA(this.l.a(obj, f & 1048575));
                                break;
                            case 41:
                                c1Var.zzz(this.l.a(obj, f & 1048575));
                                break;
                            case 42:
                                c1Var.zzv(this.l.a(obj, f & 1048575));
                                break;
                            case 43:
                                c1Var.zzL(this.l.a(obj, f & 1048575));
                                break;
                            case 44:
                                List a2 = this.l.a(obj, f & 1048575);
                                c1Var.zzy(a2);
                                obj2 = f1.c(zzc, a2, h(O), obj2, i1Var);
                                break;
                            case 45:
                                c1Var.zzG(this.l.a(obj, f & 1048575));
                                break;
                            case 46:
                                c1Var.zzH(this.l.a(obj, f & 1048575));
                                break;
                            case 47:
                                c1Var.zzI(this.l.a(obj, f & 1048575));
                                break;
                            case 48:
                                c1Var.zzJ(this.l.a(obj, f & 1048575));
                                break;
                            case 49:
                                c1Var.k(this.l.a(obj, f & 1048575), i(O), ev9Var);
                                break;
                            case 50:
                                Object k = k(O);
                                long f2 = f(O) & 1048575;
                                Object k2 = p1.k(obj, f2);
                                if (k2 == null) {
                                    k2 = zzadz.a().c();
                                    p1.x(obj, f2, k2);
                                } else if (p0.b(k2)) {
                                    Object c = zzadz.a().c();
                                    p0.c(c, k2);
                                    p1.x(obj, f2, c);
                                    k2 = c;
                                }
                                lh4.a(k);
                                throw null;
                                break;
                            case 51:
                                p1.x(obj, f & 1048575, Double.valueOf(c1Var.zza()));
                                q(obj, zzc, O);
                                break;
                            case 52:
                                p1.x(obj, f & 1048575, Float.valueOf(c1Var.zzb()));
                                q(obj, zzc, O);
                                break;
                            case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                                p1.x(obj, f & 1048575, Long.valueOf(c1Var.zzl()));
                                q(obj, zzc, O);
                                break;
                            case 54:
                                p1.x(obj, f & 1048575, Long.valueOf(c1Var.zzo()));
                                q(obj, zzc, O);
                                break;
                            case 55:
                                p1.x(obj, f & 1048575, Integer.valueOf(c1Var.zzg()));
                                q(obj, zzc, O);
                                break;
                            case 56:
                                p1.x(obj, f & 1048575, Long.valueOf(c1Var.zzk()));
                                q(obj, zzc, O);
                                break;
                            case 57:
                                p1.x(obj, f & 1048575, Integer.valueOf(c1Var.zzf()));
                                q(obj, zzc, O);
                                break;
                            case 58:
                                p1.x(obj, f & 1048575, Boolean.valueOf(c1Var.zzN()));
                                q(obj, zzc, O);
                                break;
                            case 59:
                                o(obj, f, c1Var);
                                q(obj, zzc, O);
                                break;
                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                if (y(obj, zzc, O)) {
                                    long j3 = f & 1048575;
                                    p1.x(obj, j3, f0.g(p1.k(obj, j3), c1Var.h(i(O), ev9Var)));
                                } else {
                                    p1.x(obj, f & 1048575, c1Var.h(i(O), ev9Var));
                                    p(obj, O);
                                }
                                q(obj, zzc, O);
                                break;
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                p1.x(obj, f & 1048575, c1Var.zzp());
                                q(obj, zzc, O);
                                break;
                            case 62:
                                p1.x(obj, f & 1048575, Integer.valueOf(c1Var.zzj()));
                                q(obj, zzc, O);
                                break;
                            case 63:
                                int zze2 = c1Var.zze();
                                iw9 h2 = h(O);
                                if (h2 != null && !h2.zza(zze2)) {
                                    obj2 = f1.d(zzc, zze2, obj2, i1Var);
                                    break;
                                }
                                p1.x(obj, f & 1048575, Integer.valueOf(zze2));
                                q(obj, zzc, O);
                                break;
                            case 64:
                                p1.x(obj, f & 1048575, Integer.valueOf(c1Var.zzh()));
                                q(obj, zzc, O);
                                break;
                            case 65:
                                p1.x(obj, f & 1048575, Long.valueOf(c1Var.zzm()));
                                q(obj, zzc, O);
                                break;
                            case 66:
                                p1.x(obj, f & 1048575, Integer.valueOf(c1Var.zzi()));
                                q(obj, zzc, O);
                                break;
                            case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                                p1.x(obj, f & 1048575, Long.valueOf(c1Var.zzn()));
                                q(obj, zzc, O);
                                break;
                            case 68:
                                p1.x(obj, f & 1048575, c1Var.i(i(O), ev9Var));
                                q(obj, zzc, O);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = i1Var.f();
                                }
                                if (!i1Var.q(obj2, c1Var)) {
                                    for (int i = this.j; i < this.k; i++) {
                                        obj2 = j(obj, this.i[i], obj2, i1Var);
                                    }
                                    if (obj2 != null) {
                                        i1Var.n(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzadh unused) {
                        i1Var.r(c1Var);
                        if (obj2 == null) {
                            obj2 = i1Var.c(obj);
                        }
                        if (!i1Var.q(obj2, c1Var)) {
                            for (int i2 = this.j; i2 < this.k; i2++) {
                                obj2 = j(obj, this.i[i2], obj2, i1Var);
                            }
                            if (obj2 != null) {
                                i1Var.n(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i3 = this.j; i3 < this.k; i3++) {
                            obj2 = j(obj, this.i[i3], obj2, i1Var);
                        }
                        if (obj2 != null) {
                            i1Var.n(obj, obj2);
                            return;
                        }
                        return;
                    }
                    Object c2 = !this.f ? null : vVar.c(ev9Var, this.e, zzc);
                    if (c2 != null) {
                        vVar.b(obj);
                        obj2 = vVar.d(c1Var, c2, ev9Var, null, obj2, i1Var);
                    } else {
                        i1Var.r(c1Var);
                        if (obj2 == null) {
                            obj2 = i1Var.c(obj);
                        }
                        if (!i1Var.q(obj2, c1Var)) {
                            for (int i4 = this.j; i4 < this.k; i4++) {
                                obj2 = j(obj, this.i[i4], obj2, i1Var);
                            }
                            if (obj2 != null) {
                                i1Var.n(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.j; i5 < this.k; i5++) {
                    obj2 = j(obj, this.i[i5], obj2, i1Var);
                }
                if (obj2 != null) {
                    i1Var.n(obj, obj2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final void c(Object obj, v1 v1Var) {
        if (!this.h) {
            r(obj, v1Var);
            return;
        }
        if (this.f) {
            this.n.a(obj);
            throw null;
        }
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int f = f(i);
            int i2 = this.a[i];
            switch (e(f)) {
                case 0:
                    if (v(obj, i)) {
                        v1Var.zzf(i2, p1.f(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(obj, i)) {
                        v1Var.zzo(i2, p1.g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(obj, i)) {
                        v1Var.zzt(i2, p1.i(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(obj, i)) {
                        v1Var.zzJ(i2, p1.i(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(obj, i)) {
                        v1Var.zzr(i2, p1.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(obj, i)) {
                        v1Var.zzm(i2, p1.i(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(obj, i)) {
                        v1Var.zzk(i2, p1.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(obj, i)) {
                        v1Var.zzb(i2, p1.B(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v(obj, i)) {
                        A(i2, p1.k(obj, f & 1048575), v1Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (v(obj, i)) {
                        v1Var.a(i2, p1.k(obj, f & 1048575), i(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (v(obj, i)) {
                        v1Var.c(i2, (zzaby) p1.k(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(obj, i)) {
                        v1Var.zzH(i2, p1.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(obj, i)) {
                        v1Var.zzi(i2, p1.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(obj, i)) {
                        v1Var.zzw(i2, p1.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(obj, i)) {
                        v1Var.zzy(i2, p1.i(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(obj, i)) {
                        v1Var.zzA(i2, p1.h(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(obj, i)) {
                        v1Var.zzC(i2, p1.i(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (v(obj, i)) {
                        v1Var.b(i2, p1.k(obj, f & 1048575), i(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    f1.j(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 19:
                    f1.n(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 20:
                    f1.q(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 21:
                    f1.y(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 22:
                    f1.p(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 23:
                    f1.m(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 24:
                    f1.l(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case EventType.SUBS /* 25 */:
                    f1.h(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case EventType.CDN /* 26 */:
                    f1.w(i2, (List) p1.k(obj, f & 1048575), v1Var);
                    break;
                case 27:
                    f1.r(i2, (List) p1.k(obj, f & 1048575), v1Var, i(i));
                    break;
                case 28:
                    f1.i(i2, (List) p1.k(obj, f & 1048575), v1Var);
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    f1.x(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 30:
                    f1.k(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 31:
                    f1.s(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 32:
                    f1.t(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 33:
                    f1.u(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 34:
                    f1.v(i2, (List) p1.k(obj, f & 1048575), v1Var, false);
                    break;
                case 35:
                    f1.j(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 36:
                    f1.n(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 37:
                    f1.q(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 38:
                    f1.y(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 39:
                    f1.p(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 40:
                    f1.m(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 41:
                    f1.l(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 42:
                    f1.h(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 43:
                    f1.x(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 44:
                    f1.k(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 45:
                    f1.s(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 46:
                    f1.t(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 47:
                    f1.u(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 48:
                    f1.v(i2, (List) p1.k(obj, f & 1048575), v1Var, true);
                    break;
                case 49:
                    f1.o(i2, (List) p1.k(obj, f & 1048575), v1Var, i(i));
                    break;
                case 50:
                    s(v1Var, i2, p1.k(obj, f & 1048575), i);
                    break;
                case 51:
                    if (y(obj, i2, i)) {
                        v1Var.zzf(i2, F(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(obj, i2, i)) {
                        v1Var.zzo(i2, G(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (y(obj, i2, i)) {
                        v1Var.zzt(i2, g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(obj, i2, i)) {
                        v1Var.zzJ(i2, g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(obj, i2, i)) {
                        v1Var.zzr(i2, J(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(obj, i2, i)) {
                        v1Var.zzm(i2, g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(obj, i2, i)) {
                        v1Var.zzk(i2, J(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(obj, i2, i)) {
                        v1Var.zzb(i2, z(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (y(obj, i2, i)) {
                        A(i2, p1.k(obj, f & 1048575), v1Var);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (y(obj, i2, i)) {
                        v1Var.a(i2, p1.k(obj, f & 1048575), i(i));
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (y(obj, i2, i)) {
                        v1Var.c(i2, (zzaby) p1.k(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(obj, i2, i)) {
                        v1Var.zzH(i2, J(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(obj, i2, i)) {
                        v1Var.zzi(i2, J(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(obj, i2, i)) {
                        v1Var.zzw(i2, J(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(obj, i2, i)) {
                        v1Var.zzy(i2, g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(obj, i2, i)) {
                        v1Var.zzA(i2, J(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (y(obj, i2, i)) {
                        v1Var.zzC(i2, g(obj, f & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(obj, i2, i)) {
                        v1Var.b(i2, p1.k(obj, f & 1048575), i(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        i1 i1Var = this.m;
        i1Var.p(i1Var.d(obj), v1Var);
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final int zza(Object obj) {
        return this.h ? I(obj) : H(obj);
    }

    @Override // com.google.android.gms.internal.pal.d1
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
                    c = f0.c(Double.doubleToLongBits(p1.f(obj, j)));
                    i2 = i + c;
                    break;
                case 1:
                    i = i2 * 53;
                    c = Float.floatToIntBits(p1.g(obj, j));
                    i2 = i + c;
                    break;
                case 2:
                    i = i2 * 53;
                    c = f0.c(p1.i(obj, j));
                    i2 = i + c;
                    break;
                case 3:
                    i = i2 * 53;
                    c = f0.c(p1.i(obj, j));
                    i2 = i + c;
                    break;
                case 4:
                    i = i2 * 53;
                    c = p1.h(obj, j);
                    i2 = i + c;
                    break;
                case 5:
                    i = i2 * 53;
                    c = f0.c(p1.i(obj, j));
                    i2 = i + c;
                    break;
                case 6:
                    i = i2 * 53;
                    c = p1.h(obj, j);
                    i2 = i + c;
                    break;
                case 7:
                    i = i2 * 53;
                    c = f0.a(p1.B(obj, j));
                    i2 = i + c;
                    break;
                case 8:
                    i = i2 * 53;
                    c = ((String) p1.k(obj, j)).hashCode();
                    i2 = i + c;
                    break;
                case 9:
                    Object k = p1.k(obj, j);
                    if (k != null) {
                        i5 = k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    c = p1.k(obj, j).hashCode();
                    i2 = i + c;
                    break;
                case 11:
                    i = i2 * 53;
                    c = p1.h(obj, j);
                    i2 = i + c;
                    break;
                case 12:
                    i = i2 * 53;
                    c = p1.h(obj, j);
                    i2 = i + c;
                    break;
                case 13:
                    i = i2 * 53;
                    c = p1.h(obj, j);
                    i2 = i + c;
                    break;
                case 14:
                    i = i2 * 53;
                    c = f0.c(p1.i(obj, j));
                    i2 = i + c;
                    break;
                case 15:
                    i = i2 * 53;
                    c = p1.h(obj, j);
                    i2 = i + c;
                    break;
                case 16:
                    i = i2 * 53;
                    c = f0.c(p1.i(obj, j));
                    i2 = i + c;
                    break;
                case 17:
                    Object k2 = p1.k(obj, j);
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
                    c = p1.k(obj, j).hashCode();
                    i2 = i + c;
                    break;
                case 50:
                    i = i2 * 53;
                    c = p1.k(obj, j).hashCode();
                    i2 = i + c;
                    break;
                case 51:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = f0.c(Double.doubleToLongBits(F(obj, j)));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = Float.floatToIntBits(G(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = f0.c(g(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = f0.c(g(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = J(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = f0.c(g(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = J(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = f0.a(z(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = ((String) p1.k(obj, j)).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = p1.k(obj, j).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = p1.k(obj, j).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = J(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = J(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = J(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = f0.c(g(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = J(obj, j);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = f0.c(g(obj, j));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(obj, i4, i3)) {
                        i = i2 * 53;
                        c = p1.k(obj, j).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.m.d(obj).hashCode();
        if (!this.f) {
            return hashCode;
        }
        this.n.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final Object zze() {
        return ((c0) this.e).q(4, null, null);
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final void zzf(Object obj) {
        int i;
        int i2 = this.j;
        while (true) {
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long f = f(this.i[i2]) & 1048575;
            Object k = p1.k(obj, f);
            if (k != null) {
                ((zzadz) k).d();
                p1.x(obj, f, k);
            }
            i2++;
        }
        int length = this.i.length;
        while (i < length) {
            this.l.b(obj, this.i[i]);
            i++;
        }
        this.m.m(obj);
        if (this.f) {
            this.n.e(obj);
        }
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int f = f(i);
            long j = 1048575 & f;
            int i2 = this.a[i];
            switch (e(f)) {
                case 0:
                    if (v(obj2, i)) {
                        p1.t(obj, j, p1.f(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(obj2, i)) {
                        p1.u(obj, j, p1.g(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(obj2, i)) {
                        p1.w(obj, j, p1.i(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(obj2, i)) {
                        p1.w(obj, j, p1.i(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(obj2, i)) {
                        p1.v(obj, j, p1.h(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(obj2, i)) {
                        p1.w(obj, j, p1.i(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(obj2, i)) {
                        p1.v(obj, j, p1.h(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(obj2, i)) {
                        p1.r(obj, j, p1.B(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v(obj2, i)) {
                        p1.x(obj, j, p1.k(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m(obj, obj2, i);
                    break;
                case 10:
                    if (v(obj2, i)) {
                        p1.x(obj, j, p1.k(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(obj2, i)) {
                        p1.v(obj, j, p1.h(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(obj2, i)) {
                        p1.v(obj, j, p1.h(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(obj2, i)) {
                        p1.v(obj, j, p1.h(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(obj2, i)) {
                        p1.w(obj, j, p1.i(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(obj2, i)) {
                        p1.v(obj, j, p1.h(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(obj2, i)) {
                        p1.w(obj, j, p1.i(obj2, j));
                        p(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m(obj, obj2, i);
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
                    this.l.c(obj, obj2, j);
                    break;
                case 50:
                    f1.B(this.p, obj, obj2, j);
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
                    if (y(obj2, i2, i)) {
                        p1.x(obj, j, p1.k(obj2, j));
                        q(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    n(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (y(obj2, i2, i)) {
                        p1.x(obj, j, p1.k(obj2, j));
                        q(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    n(obj, obj2, i);
                    break;
            }
        }
        f1.f(this.m, obj, obj2);
        if (this.f) {
            f1.e(this.n, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final boolean zzk(Object obj, Object obj2) {
        boolean z;
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int f = f(i);
            long j = f & 1048575;
            switch (e(f)) {
                case 0:
                    if (t(obj, obj2, i) && Double.doubleToLongBits(p1.f(obj, j)) == Double.doubleToLongBits(p1.f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (t(obj, obj2, i) && Float.floatToIntBits(p1.g(obj, j)) == Float.floatToIntBits(p1.g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (t(obj, obj2, i) && p1.i(obj, j) == p1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (t(obj, obj2, i) && p1.i(obj, j) == p1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (t(obj, obj2, i) && p1.h(obj, j) == p1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (t(obj, obj2, i) && p1.i(obj, j) == p1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (t(obj, obj2, i) && p1.h(obj, j) == p1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (t(obj, obj2, i) && p1.B(obj, j) == p1.B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (t(obj, obj2, i) && f1.z(p1.k(obj, j), p1.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (t(obj, obj2, i) && f1.z(p1.k(obj, j), p1.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (t(obj, obj2, i) && f1.z(p1.k(obj, j), p1.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (t(obj, obj2, i) && p1.h(obj, j) == p1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (t(obj, obj2, i) && p1.h(obj, j) == p1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (t(obj, obj2, i) && p1.h(obj, j) == p1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (t(obj, obj2, i) && p1.i(obj, j) == p1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (t(obj, obj2, i) && p1.h(obj, j) == p1.h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (t(obj, obj2, i) && p1.i(obj, j) == p1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (t(obj, obj2, i) && f1.z(p1.k(obj, j), p1.k(obj2, j))) {
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
                    z = f1.z(p1.k(obj, j), p1.k(obj2, j));
                    break;
                case 50:
                    z = f1.z(p1.k(obj, j), p1.k(obj2, j));
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
                    long Q = Q(i) & 1048575;
                    if (p1.h(obj, Q) == p1.h(obj2, Q) && f1.z(p1.k(obj, j), p1.k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!this.m.d(obj).equals(this.m.d(obj2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.n.a(obj);
        this.n.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.j) {
            int i6 = this.i[i5];
            int i7 = this.a[i6];
            int f = f(i6);
            int i8 = this.a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = r.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & f) != 0 && !w(obj, i6, i, i2, i10)) {
                return false;
            }
            int e = e(f);
            if (e != 9 && e != 17) {
                if (e != 27) {
                    if (e == 60 || e == 68) {
                        if (y(obj, i7, i6) && !x(obj, f, i(i6))) {
                            return false;
                        }
                    } else if (e != 49) {
                        if (e == 50 && !((zzadz) p1.k(obj, f & 1048575)).isEmpty()) {
                            lh4.a(k(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) p1.k(obj, f & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    d1 i11 = i(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!i11.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (w(obj, i6, i, i2, i10) && !x(obj, f, i(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.f) {
            return true;
        }
        this.n.a(obj);
        throw null;
    }
}
