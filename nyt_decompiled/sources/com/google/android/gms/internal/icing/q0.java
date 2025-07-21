package com.google.android.gms.internal.icing;

import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.i4d;
import defpackage.lh4;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class q0 implements y0 {
    private static final int[] n = new int[0];
    private static final Unsafe o = k1.v();
    private final int[] a;
    private final Object[] b;
    private final i4d c;
    private final boolean d;
    private final boolean e;
    private final int[] f;
    private final int g;
    private final int h;
    private final g0 i;
    private final d1 j;
    private final t k;
    private final s0 l;
    private final l0 m;

    private q0(int[] iArr, Object[] objArr, int i, int i2, i4d i4dVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, s0 s0Var, g0 g0Var, d1 d1Var, t tVar, l0 l0Var, byte[] bArr) {
        this.a = iArr;
        this.b = objArr;
        this.e = z;
        boolean z3 = false;
        if (tVar != null && tVar.a(i4dVar)) {
            z3 = true;
        }
        this.d = z3;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.l = s0Var;
        this.i = g0Var;
        this.j = d1Var;
        this.k = tVar;
        this.c = i4dVar;
        this.m = l0Var;
    }

    private static double A(Object obj, long j) {
        return ((Double) k1.s(obj, j)).doubleValue();
    }

    private static float B(Object obj, long j) {
        return ((Float) k1.s(obj, j)).floatValue();
    }

    private static int C(Object obj, long j) {
        return ((Integer) k1.s(obj, j)).intValue();
    }

    private static long D(Object obj, long j) {
        return ((Long) k1.s(obj, j)).longValue();
    }

    private static boolean E(Object obj, long j) {
        return ((Boolean) k1.s(obj, j)).booleanValue();
    }

    private final boolean F(Object obj, Object obj2, int i) {
        return g(obj, i) == g(obj2, i);
    }

    private final boolean f(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? g(obj, i) : (i3 & i4) != 0;
    }

    private final boolean g(Object obj, int i) {
        int y = y(i);
        long j = y & 1048575;
        if (j != 1048575) {
            return (k1.i(obj, j) & (1 << (y >>> 20))) != 0;
        }
        int x = x(i);
        long j2 = x & 1048575;
        switch (z(x)) {
            case 0:
                return k1.q(obj, j2) != 0.0d;
            case 1:
                return k1.o(obj, j2) != 0.0f;
            case 2:
                return k1.k(obj, j2) != 0;
            case 3:
                return k1.k(obj, j2) != 0;
            case 4:
                return k1.i(obj, j2) != 0;
            case 5:
                return k1.k(obj, j2) != 0;
            case 6:
                return k1.i(obj, j2) != 0;
            case 7:
                return k1.m(obj, j2);
            case 8:
                Object s = k1.s(obj, j2);
                if (s instanceof String) {
                    return !((String) s).isEmpty();
                }
                if (s instanceof zzcf) {
                    return !zzcf.a.equals(s);
                }
                throw new IllegalArgumentException();
            case 9:
                return k1.s(obj, j2) != null;
            case 10:
                return !zzcf.a.equals(k1.s(obj, j2));
            case 11:
                return k1.i(obj, j2) != 0;
            case 12:
                return k1.i(obj, j2) != 0;
            case 13:
                return k1.i(obj, j2) != 0;
            case 14:
                return k1.k(obj, j2) != 0;
            case 15:
                return k1.i(obj, j2) != 0;
            case 16:
                return k1.k(obj, j2) != 0;
            case 17:
                return k1.s(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void h(Object obj, int i) {
        int y = y(i);
        long j = 1048575 & y;
        if (j == 1048575) {
            return;
        }
        k1.j(obj, j, (1 << (y >>> 20)) | k1.i(obj, j));
    }

    private final boolean i(Object obj, int i, int i2) {
        return k1.i(obj, (long) (y(i2) & 1048575)) == i;
    }

    private final void j(Object obj, int i, int i2) {
        k1.j(obj, y(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void k(Object obj, s sVar) {
        int i;
        boolean z;
        if (this.d) {
            this.k.b(obj);
            throw null;
        }
        int length = this.a.length;
        Unsafe unsafe = o;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int x = x(i4);
            int i6 = this.a[i4];
            int z2 = z(x);
            if (z2 <= 17) {
                int i7 = this.a[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = x & i2;
            switch (z2) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.o(i6, k1.q(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.n(i6, k1.o(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.l(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.q(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.r(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.s(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.t(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.u(i6, k1.m(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        m(i6, unsafe.getObject(obj, j), sVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.A(i6, unsafe.getObject(obj, j), u(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.w(i6, (zzcf) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.x(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.p(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.k(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.m(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.y(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.z(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        sVar.B(i6, unsafe.getObject(obj, j), u(i4));
                        break;
                    }
                case 18:
                    a1.h(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 19:
                    a1.i(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 20:
                    a1.j(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 21:
                    a1.k(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 22:
                    a1.o(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 23:
                    a1.m(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 24:
                    a1.r(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case EventType.SUBS /* 25 */:
                    a1.u(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case EventType.CDN /* 26 */:
                    a1.v(this.a[i4], (List) unsafe.getObject(obj, j), sVar);
                    break;
                case 27:
                    a1.x(this.a[i4], (List) unsafe.getObject(obj, j), sVar, u(i4));
                    break;
                case 28:
                    a1.w(this.a[i4], (List) unsafe.getObject(obj, j), sVar);
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    z = false;
                    a1.p(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 30:
                    z = false;
                    a1.t(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 31:
                    z = false;
                    a1.s(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 32:
                    z = false;
                    a1.n(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 33:
                    z = false;
                    a1.q(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 34:
                    z = false;
                    a1.l(this.a[i4], (List) unsafe.getObject(obj, j), sVar, false);
                    break;
                case 35:
                    a1.h(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 36:
                    a1.i(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 37:
                    a1.j(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 38:
                    a1.k(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 39:
                    a1.o(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 40:
                    a1.m(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 41:
                    a1.r(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 42:
                    a1.u(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 43:
                    a1.p(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 44:
                    a1.t(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 45:
                    a1.s(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 46:
                    a1.n(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 47:
                    a1.q(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 48:
                    a1.l(this.a[i4], (List) unsafe.getObject(obj, j), sVar, true);
                    break;
                case 49:
                    a1.y(this.a[i4], (List) unsafe.getObject(obj, j), sVar, u(i4));
                    break;
                case 50:
                    l(sVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (i(obj, i6, i4)) {
                        sVar.o(i6, A(obj, j));
                    }
                    break;
                case 52:
                    if (i(obj, i6, i4)) {
                        sVar.n(i6, B(obj, j));
                    }
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (i(obj, i6, i4)) {
                        sVar.l(i6, D(obj, j));
                    }
                    break;
                case 54:
                    if (i(obj, i6, i4)) {
                        sVar.q(i6, D(obj, j));
                    }
                    break;
                case 55:
                    if (i(obj, i6, i4)) {
                        sVar.r(i6, C(obj, j));
                    }
                    break;
                case 56:
                    if (i(obj, i6, i4)) {
                        sVar.s(i6, D(obj, j));
                    }
                    break;
                case 57:
                    if (i(obj, i6, i4)) {
                        sVar.t(i6, C(obj, j));
                    }
                    break;
                case 58:
                    if (i(obj, i6, i4)) {
                        sVar.u(i6, E(obj, j));
                    }
                    break;
                case 59:
                    if (i(obj, i6, i4)) {
                        m(i6, unsafe.getObject(obj, j), sVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (i(obj, i6, i4)) {
                        sVar.A(i6, unsafe.getObject(obj, j), u(i4));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (i(obj, i6, i4)) {
                        sVar.w(i6, (zzcf) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (i(obj, i6, i4)) {
                        sVar.x(i6, C(obj, j));
                    }
                    break;
                case 63:
                    if (i(obj, i6, i4)) {
                        sVar.p(i6, C(obj, j));
                    }
                    break;
                case 64:
                    if (i(obj, i6, i4)) {
                        sVar.k(i6, C(obj, j));
                    }
                    break;
                case 65:
                    if (i(obj, i6, i4)) {
                        sVar.m(i6, D(obj, j));
                    }
                    break;
                case 66:
                    if (i(obj, i6, i4)) {
                        sVar.y(i6, C(obj, j));
                    }
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (i(obj, i6, i4)) {
                        sVar.z(i6, D(obj, j));
                    }
                    break;
                case 68:
                    if (i(obj, i6, i4)) {
                        sVar.B(i6, unsafe.getObject(obj, j), u(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        d1 d1Var = this.j;
        d1Var.g(d1Var.b(obj), sVar);
    }

    private final void l(s sVar, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        lh4.a(v(i2));
        throw null;
    }

    private static final void m(int i, Object obj, s sVar) {
        if (obj instanceof String) {
            sVar.v(i, (String) obj);
        } else {
            sVar.w(i, (zzcf) obj);
        }
    }

    static q0 n(Class cls, n0 n0Var, s0 s0Var, g0 g0Var, d1 d1Var, t tVar, l0 l0Var) {
        if (n0Var instanceof x0) {
            return o((x0) n0Var, s0Var, g0Var, d1Var, tVar, l0Var);
        }
        lh4.a(n0Var);
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
    static com.google.android.gms.internal.icing.q0 o(com.google.android.gms.internal.icing.x0 r34, com.google.android.gms.internal.icing.s0 r35, com.google.android.gms.internal.icing.g0 r36, com.google.android.gms.internal.icing.d1 r37, com.google.android.gms.internal.icing.t r38, com.google.android.gms.internal.icing.l0 r39) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.q0.o(com.google.android.gms.internal.icing.x0, com.google.android.gms.internal.icing.s0, com.google.android.gms.internal.icing.g0, com.google.android.gms.internal.icing.d1, com.google.android.gms.internal.icing.t, com.google.android.gms.internal.icing.l0):com.google.android.gms.internal.icing.q0");
    }

    private static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void q(Object obj, Object obj2, int i) {
        long x = x(i) & 1048575;
        if (g(obj2, i)) {
            Object s = k1.s(obj, x);
            Object s2 = k1.s(obj2, x);
            if (s != null && s2 != null) {
                k1.t(obj, x, b0.h(s, s2));
                h(obj, i);
            } else if (s2 != null) {
                k1.t(obj, x, s2);
                h(obj, i);
            }
        }
    }

    private final void r(Object obj, Object obj2, int i) {
        int x = x(i);
        int i2 = this.a[i];
        long j = x & 1048575;
        if (i(obj2, i2, i)) {
            Object s = i(obj, i2, i) ? k1.s(obj, j) : null;
            Object s2 = k1.s(obj2, j);
            if (s != null && s2 != null) {
                k1.t(obj, j, b0.h(s, s2));
                j(obj, i2, i);
            } else if (s2 != null) {
                k1.t(obj, j, s2);
                j(obj, i2, i);
            }
        }
    }

    private final int s(Object obj) {
        int i;
        int A;
        int A2;
        int A3;
        int B;
        int A4;
        int z;
        int A5;
        int A6;
        int e;
        int A7;
        int W;
        int y;
        int A8;
        int i2;
        Unsafe unsafe = o;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.a.length; i6 += 3) {
            int x = x(i6);
            int i7 = this.a[i6];
            int z2 = z(x);
            if (z2 <= 17) {
                int i8 = this.a[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i5) {
                    i4 = unsafe.getInt(obj, i9);
                    i5 = i9;
                }
            } else {
                i = 0;
            }
            long j = x & 1048575;
            switch (z2) {
                case 0:
                    if ((i4 & i) != 0) {
                        A = r.A(i7 << 3);
                        W = A + 8;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i4 & i) != 0) {
                        A2 = r.A(i7 << 3);
                        W = A2 + 4;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        A3 = r.A(i7 << 3);
                        B = r.B(j2);
                        W = A3 + B;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        A3 = r.A(i7 << 3);
                        B = r.B(j3);
                        W = A3 + B;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(obj, j);
                        A4 = r.A(i7 << 3);
                        z = r.z(i10);
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        A = r.A(i7 << 3);
                        W = A + 8;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        A2 = r.A(i7 << 3);
                        W = A2 + 4;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        A5 = r.A(i7 << 3);
                        W = A5 + 1;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzcf) {
                            A6 = r.A(i7 << 3);
                            e = ((zzcf) object).e();
                            A7 = r.A(e);
                            i2 = A6 + A7 + e;
                            i3 += i2;
                            break;
                        } else {
                            A4 = r.A(i7 << 3);
                            z = r.C((String) object);
                            i2 = A4 + z;
                            i3 += i2;
                        }
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        W = a1.W(i7, unsafe.getObject(obj, j), u(i6));
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        zzcf zzcfVar = (zzcf) unsafe.getObject(obj, j);
                        A6 = r.A(i7 << 3);
                        e = zzcfVar.e();
                        A7 = r.A(e);
                        i2 = A6 + A7 + e;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        A4 = r.A(i7 << 3);
                        z = r.A(i11);
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        A4 = r.A(i7 << 3);
                        z = r.z(i12);
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i4 & i) != 0) {
                        A2 = r.A(i7 << 3);
                        W = A2 + 4;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        A = r.A(i7 << 3);
                        W = A + 8;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        A4 = r.A(i7 << 3);
                        z = r.A((i13 >> 31) ^ (i13 + i13));
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i4 & i) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        A4 = r.A(i7 << 3);
                        z = r.B((j4 >> 63) ^ (j4 + j4));
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        W = r.e(i7, (i4d) unsafe.getObject(obj, j), u(i6));
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    W = a1.S(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 19:
                    W = a1.Q(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 20:
                    W = a1.C(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 21:
                    W = a1.E(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 22:
                    W = a1.K(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 23:
                    W = a1.S(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 24:
                    W = a1.Q(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case EventType.SUBS /* 25 */:
                    W = a1.U(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case EventType.CDN /* 26 */:
                    W = a1.V(i7, (List) unsafe.getObject(obj, j));
                    i3 += W;
                    break;
                case 27:
                    W = a1.X(i7, (List) unsafe.getObject(obj, j), u(i6));
                    i3 += W;
                    break;
                case 28:
                    W = a1.Y(i7, (List) unsafe.getObject(obj, j));
                    i3 += W;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    W = a1.M(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 30:
                    W = a1.I(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 31:
                    W = a1.Q(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 32:
                    W = a1.S(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 33:
                    W = a1.O(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 34:
                    W = a1.G(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += W;
                    break;
                case 35:
                    z = a1.R((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    z = a1.P((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    z = a1.B((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    z = a1.D((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    z = a1.J((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    z = a1.R((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    z = a1.P((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    z = a1.T((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    z = a1.L((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    z = a1.H((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    z = a1.P((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    z = a1.R((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    z = a1.N((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    z = a1.F((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i7);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    W = a1.Z(i7, (List) unsafe.getObject(obj, j), u(i6));
                    i3 += W;
                    break;
                case 50:
                    l0.a(i7, unsafe.getObject(obj, j), v(i6));
                    break;
                case 51:
                    if (i(obj, i7, i6)) {
                        A = r.A(i7 << 3);
                        W = A + 8;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (i(obj, i7, i6)) {
                        A2 = r.A(i7 << 3);
                        W = A2 + 4;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (i(obj, i7, i6)) {
                        long D = D(obj, j);
                        A3 = r.A(i7 << 3);
                        B = r.B(D);
                        W = A3 + B;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (i(obj, i7, i6)) {
                        long D2 = D(obj, j);
                        A3 = r.A(i7 << 3);
                        B = r.B(D2);
                        W = A3 + B;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (i(obj, i7, i6)) {
                        int C = C(obj, j);
                        A4 = r.A(i7 << 3);
                        z = r.z(C);
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (i(obj, i7, i6)) {
                        A = r.A(i7 << 3);
                        W = A + 8;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (i(obj, i7, i6)) {
                        A2 = r.A(i7 << 3);
                        W = A2 + 4;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (i(obj, i7, i6)) {
                        A5 = r.A(i7 << 3);
                        W = A5 + 1;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!i(obj, i7, i6)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzcf) {
                            A6 = r.A(i7 << 3);
                            e = ((zzcf) object2).e();
                            A7 = r.A(e);
                            i2 = A6 + A7 + e;
                            i3 += i2;
                            break;
                        } else {
                            A4 = r.A(i7 << 3);
                            z = r.C((String) object2);
                            i2 = A4 + z;
                            i3 += i2;
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (i(obj, i7, i6)) {
                        W = a1.W(i7, unsafe.getObject(obj, j), u(i6));
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (i(obj, i7, i6)) {
                        zzcf zzcfVar2 = (zzcf) unsafe.getObject(obj, j);
                        A6 = r.A(i7 << 3);
                        e = zzcfVar2.e();
                        A7 = r.A(e);
                        i2 = A6 + A7 + e;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (i(obj, i7, i6)) {
                        int C2 = C(obj, j);
                        A4 = r.A(i7 << 3);
                        z = r.A(C2);
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (i(obj, i7, i6)) {
                        int C3 = C(obj, j);
                        A4 = r.A(i7 << 3);
                        z = r.z(C3);
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (i(obj, i7, i6)) {
                        A2 = r.A(i7 << 3);
                        W = A2 + 4;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (i(obj, i7, i6)) {
                        A = r.A(i7 << 3);
                        W = A + 8;
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (i(obj, i7, i6)) {
                        int C4 = C(obj, j);
                        A4 = r.A(i7 << 3);
                        z = r.A((C4 >> 31) ^ (C4 + C4));
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (i(obj, i7, i6)) {
                        long D3 = D(obj, j);
                        A4 = r.A(i7 << 3);
                        z = r.B((D3 >> 63) ^ (D3 + D3));
                        i2 = A4 + z;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (i(obj, i7, i6)) {
                        W = r.e(i7, (i4d) unsafe.getObject(obj, j), u(i6));
                        i3 += W;
                        break;
                    } else {
                        break;
                    }
            }
        }
        d1 d1Var = this.j;
        int f = i3 + d1Var.f(d1Var.b(obj));
        if (!this.d) {
            return f;
        }
        this.k.b(obj);
        throw null;
    }

    private final int t(Object obj) {
        int A;
        int A2;
        int A3;
        int B;
        int A4;
        int z;
        int A5;
        int A6;
        int e;
        int A7;
        int W;
        int y;
        int A8;
        int i;
        Unsafe unsafe = o;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.length; i3 += 3) {
            int x = x(i3);
            int z2 = z(x);
            int i4 = this.a[i3];
            long j = x & 1048575;
            if (z2 >= zzcv.zzJ.zza() && z2 <= zzcv.zzW.zza()) {
                int i5 = this.a[i3 + 2];
            }
            switch (z2) {
                case 0:
                    if (g(obj, i3)) {
                        A = r.A(i4 << 3);
                        W = A + 8;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (g(obj, i3)) {
                        A2 = r.A(i4 << 3);
                        W = A2 + 4;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (g(obj, i3)) {
                        long k = k1.k(obj, j);
                        A3 = r.A(i4 << 3);
                        B = r.B(k);
                        i2 += A3 + B;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (g(obj, i3)) {
                        long k2 = k1.k(obj, j);
                        A3 = r.A(i4 << 3);
                        B = r.B(k2);
                        i2 += A3 + B;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (g(obj, i3)) {
                        int i6 = k1.i(obj, j);
                        A4 = r.A(i4 << 3);
                        z = r.z(i6);
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (g(obj, i3)) {
                        A = r.A(i4 << 3);
                        W = A + 8;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (g(obj, i3)) {
                        A2 = r.A(i4 << 3);
                        W = A2 + 4;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (g(obj, i3)) {
                        A5 = r.A(i4 << 3);
                        W = A5 + 1;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!g(obj, i3)) {
                        break;
                    } else {
                        Object s = k1.s(obj, j);
                        if (s instanceof zzcf) {
                            A6 = r.A(i4 << 3);
                            e = ((zzcf) s).e();
                            A7 = r.A(e);
                            i = A6 + A7 + e;
                            i2 += i;
                            break;
                        } else {
                            A4 = r.A(i4 << 3);
                            z = r.C((String) s);
                            i = A4 + z;
                            i2 += i;
                        }
                    }
                case 9:
                    if (g(obj, i3)) {
                        W = a1.W(i4, k1.s(obj, j), u(i3));
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (g(obj, i3)) {
                        zzcf zzcfVar = (zzcf) k1.s(obj, j);
                        A6 = r.A(i4 << 3);
                        e = zzcfVar.e();
                        A7 = r.A(e);
                        i = A6 + A7 + e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (g(obj, i3)) {
                        int i7 = k1.i(obj, j);
                        A4 = r.A(i4 << 3);
                        z = r.A(i7);
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (g(obj, i3)) {
                        int i8 = k1.i(obj, j);
                        A4 = r.A(i4 << 3);
                        z = r.z(i8);
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (g(obj, i3)) {
                        A2 = r.A(i4 << 3);
                        W = A2 + 4;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (g(obj, i3)) {
                        A = r.A(i4 << 3);
                        W = A + 8;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (g(obj, i3)) {
                        int i9 = k1.i(obj, j);
                        A4 = r.A(i4 << 3);
                        z = r.A((i9 >> 31) ^ (i9 + i9));
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (g(obj, i3)) {
                        long k3 = k1.k(obj, j);
                        A4 = r.A(i4 << 3);
                        z = r.B((k3 >> 63) ^ (k3 + k3));
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (g(obj, i3)) {
                        W = r.e(i4, (i4d) k1.s(obj, j), u(i3));
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    W = a1.S(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 19:
                    W = a1.Q(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 20:
                    W = a1.C(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 21:
                    W = a1.E(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 22:
                    W = a1.K(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 23:
                    W = a1.S(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 24:
                    W = a1.Q(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case EventType.SUBS /* 25 */:
                    W = a1.U(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case EventType.CDN /* 26 */:
                    W = a1.V(i4, (List) k1.s(obj, j));
                    i2 += W;
                    break;
                case 27:
                    W = a1.X(i4, (List) k1.s(obj, j), u(i3));
                    i2 += W;
                    break;
                case 28:
                    W = a1.Y(i4, (List) k1.s(obj, j));
                    i2 += W;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    W = a1.M(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 30:
                    W = a1.I(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 31:
                    W = a1.Q(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 32:
                    W = a1.S(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 33:
                    W = a1.O(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 34:
                    W = a1.G(i4, (List) k1.s(obj, j), false);
                    i2 += W;
                    break;
                case 35:
                    z = a1.R((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    z = a1.P((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    z = a1.B((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    z = a1.D((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    z = a1.J((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    z = a1.R((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    z = a1.P((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    z = a1.T((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    z = a1.L((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    z = a1.H((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    z = a1.P((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    z = a1.R((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    z = a1.N((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    z = a1.F((List) unsafe.getObject(obj, j));
                    if (z > 0) {
                        y = r.y(i4);
                        A8 = r.A(z);
                        A4 = y + A8;
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    W = a1.Z(i4, (List) k1.s(obj, j), u(i3));
                    i2 += W;
                    break;
                case 50:
                    l0.a(i4, k1.s(obj, j), v(i3));
                    break;
                case 51:
                    if (i(obj, i4, i3)) {
                        A = r.A(i4 << 3);
                        W = A + 8;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (i(obj, i4, i3)) {
                        A2 = r.A(i4 << 3);
                        W = A2 + 4;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (i(obj, i4, i3)) {
                        long D = D(obj, j);
                        A3 = r.A(i4 << 3);
                        B = r.B(D);
                        i2 += A3 + B;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (i(obj, i4, i3)) {
                        long D2 = D(obj, j);
                        A3 = r.A(i4 << 3);
                        B = r.B(D2);
                        i2 += A3 + B;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (i(obj, i4, i3)) {
                        int C = C(obj, j);
                        A4 = r.A(i4 << 3);
                        z = r.z(C);
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (i(obj, i4, i3)) {
                        A = r.A(i4 << 3);
                        W = A + 8;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (i(obj, i4, i3)) {
                        A2 = r.A(i4 << 3);
                        W = A2 + 4;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (i(obj, i4, i3)) {
                        A5 = r.A(i4 << 3);
                        W = A5 + 1;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!i(obj, i4, i3)) {
                        break;
                    } else {
                        Object s2 = k1.s(obj, j);
                        if (s2 instanceof zzcf) {
                            A6 = r.A(i4 << 3);
                            e = ((zzcf) s2).e();
                            A7 = r.A(e);
                            i = A6 + A7 + e;
                            i2 += i;
                            break;
                        } else {
                            A4 = r.A(i4 << 3);
                            z = r.C((String) s2);
                            i = A4 + z;
                            i2 += i;
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (i(obj, i4, i3)) {
                        W = a1.W(i4, k1.s(obj, j), u(i3));
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (i(obj, i4, i3)) {
                        zzcf zzcfVar2 = (zzcf) k1.s(obj, j);
                        A6 = r.A(i4 << 3);
                        e = zzcfVar2.e();
                        A7 = r.A(e);
                        i = A6 + A7 + e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (i(obj, i4, i3)) {
                        int C2 = C(obj, j);
                        A4 = r.A(i4 << 3);
                        z = r.A(C2);
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (i(obj, i4, i3)) {
                        int C3 = C(obj, j);
                        A4 = r.A(i4 << 3);
                        z = r.z(C3);
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (i(obj, i4, i3)) {
                        A2 = r.A(i4 << 3);
                        W = A2 + 4;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (i(obj, i4, i3)) {
                        A = r.A(i4 << 3);
                        W = A + 8;
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (i(obj, i4, i3)) {
                        int C4 = C(obj, j);
                        A4 = r.A(i4 << 3);
                        z = r.A((C4 >> 31) ^ (C4 + C4));
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (i(obj, i4, i3)) {
                        long D3 = D(obj, j);
                        A4 = r.A(i4 << 3);
                        z = r.B((D3 >> 63) ^ (D3 + D3));
                        i = A4 + z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (i(obj, i4, i3)) {
                        W = r.e(i4, (i4d) k1.s(obj, j), u(i3));
                        i2 += W;
                        break;
                    } else {
                        break;
                    }
            }
        }
        d1 d1Var = this.j;
        return i2 + d1Var.f(d1Var.b(obj));
    }

    private final y0 u(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        y0 y0Var = (y0) this.b[i3];
        if (y0Var != null) {
            return y0Var;
        }
        y0 b = v0.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b;
        return b;
    }

    private final Object v(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    private static boolean w(Object obj, int i, y0 y0Var) {
        return y0Var.zzf(k1.s(obj, i & 1048575));
    }

    private final int x(int i) {
        return this.a[i + 1];
    }

    private final int y(int i) {
        return this.a[i + 2];
    }

    private static int z(int i) {
        return (i >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final void a(Object obj) {
        int i = this.g;
        while (true) {
            int i2 = this.h;
            if (i >= i2) {
                int length = this.f.length;
                while (i2 < length) {
                    this.i.a(obj, this.f[i2]);
                    i2++;
                }
                this.j.c(obj);
                if (this.d) {
                    this.k.c(obj);
                    return;
                }
                return;
            }
            Object s = k1.s(obj, x(this.f[i]) & 1048575);
            if (s != null) {
                lh4.a(s);
                throw null;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final int b(Object obj) {
        return this.e ? t(obj) : s(obj);
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final void c(Object obj, s sVar) {
        if (!this.e) {
            k(obj, sVar);
            return;
        }
        if (this.d) {
            this.k.b(obj);
            throw null;
        }
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int x = x(i);
            int i2 = this.a[i];
            switch (z(x)) {
                case 0:
                    if (g(obj, i)) {
                        sVar.o(i2, k1.q(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (g(obj, i)) {
                        sVar.n(i2, k1.o(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (g(obj, i)) {
                        sVar.l(i2, k1.k(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (g(obj, i)) {
                        sVar.q(i2, k1.k(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (g(obj, i)) {
                        sVar.r(i2, k1.i(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (g(obj, i)) {
                        sVar.s(i2, k1.k(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (g(obj, i)) {
                        sVar.t(i2, k1.i(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (g(obj, i)) {
                        sVar.u(i2, k1.m(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (g(obj, i)) {
                        m(i2, k1.s(obj, x & 1048575), sVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (g(obj, i)) {
                        sVar.A(i2, k1.s(obj, x & 1048575), u(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (g(obj, i)) {
                        sVar.w(i2, (zzcf) k1.s(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (g(obj, i)) {
                        sVar.x(i2, k1.i(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (g(obj, i)) {
                        sVar.p(i2, k1.i(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (g(obj, i)) {
                        sVar.k(i2, k1.i(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (g(obj, i)) {
                        sVar.m(i2, k1.k(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (g(obj, i)) {
                        sVar.y(i2, k1.i(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (g(obj, i)) {
                        sVar.z(i2, k1.k(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (g(obj, i)) {
                        sVar.B(i2, k1.s(obj, x & 1048575), u(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    a1.h(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 19:
                    a1.i(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 20:
                    a1.j(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 21:
                    a1.k(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 22:
                    a1.o(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 23:
                    a1.m(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 24:
                    a1.r(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case EventType.SUBS /* 25 */:
                    a1.u(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case EventType.CDN /* 26 */:
                    a1.v(this.a[i], (List) k1.s(obj, x & 1048575), sVar);
                    break;
                case 27:
                    a1.x(this.a[i], (List) k1.s(obj, x & 1048575), sVar, u(i));
                    break;
                case 28:
                    a1.w(this.a[i], (List) k1.s(obj, x & 1048575), sVar);
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    a1.p(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 30:
                    a1.t(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 31:
                    a1.s(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 32:
                    a1.n(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 33:
                    a1.q(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 34:
                    a1.l(this.a[i], (List) k1.s(obj, x & 1048575), sVar, false);
                    break;
                case 35:
                    a1.h(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 36:
                    a1.i(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 37:
                    a1.j(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 38:
                    a1.k(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 39:
                    a1.o(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 40:
                    a1.m(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 41:
                    a1.r(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 42:
                    a1.u(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 43:
                    a1.p(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 44:
                    a1.t(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 45:
                    a1.s(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 46:
                    a1.n(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 47:
                    a1.q(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 48:
                    a1.l(this.a[i], (List) k1.s(obj, x & 1048575), sVar, true);
                    break;
                case 49:
                    a1.y(this.a[i], (List) k1.s(obj, x & 1048575), sVar, u(i));
                    break;
                case 50:
                    l(sVar, i2, k1.s(obj, x & 1048575), i);
                    break;
                case 51:
                    if (i(obj, i2, i)) {
                        sVar.o(i2, A(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (i(obj, i2, i)) {
                        sVar.n(i2, B(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (i(obj, i2, i)) {
                        sVar.l(i2, D(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (i(obj, i2, i)) {
                        sVar.q(i2, D(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (i(obj, i2, i)) {
                        sVar.r(i2, C(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (i(obj, i2, i)) {
                        sVar.s(i2, D(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (i(obj, i2, i)) {
                        sVar.t(i2, C(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (i(obj, i2, i)) {
                        sVar.u(i2, E(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (i(obj, i2, i)) {
                        m(i2, k1.s(obj, x & 1048575), sVar);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (i(obj, i2, i)) {
                        sVar.A(i2, k1.s(obj, x & 1048575), u(i));
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (i(obj, i2, i)) {
                        sVar.w(i2, (zzcf) k1.s(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (i(obj, i2, i)) {
                        sVar.x(i2, C(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (i(obj, i2, i)) {
                        sVar.p(i2, C(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (i(obj, i2, i)) {
                        sVar.k(i2, C(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (i(obj, i2, i)) {
                        sVar.m(i2, D(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (i(obj, i2, i)) {
                        sVar.y(i2, C(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (i(obj, i2, i)) {
                        sVar.z(i2, D(obj, x & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (i(obj, i2, i)) {
                        sVar.B(i2, k1.s(obj, x & 1048575), u(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        d1 d1Var = this.j;
        d1Var.g(d1Var.b(obj), sVar);
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final void d(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int x = x(i);
            long j = 1048575 & x;
            int i2 = this.a[i];
            switch (z(x)) {
                case 0:
                    if (g(obj2, i)) {
                        k1.r(obj, j, k1.q(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (g(obj2, i)) {
                        k1.p(obj, j, k1.o(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (g(obj2, i)) {
                        k1.l(obj, j, k1.k(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (g(obj2, i)) {
                        k1.l(obj, j, k1.k(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (g(obj2, i)) {
                        k1.j(obj, j, k1.i(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (g(obj2, i)) {
                        k1.l(obj, j, k1.k(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (g(obj2, i)) {
                        k1.j(obj, j, k1.i(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (g(obj2, i)) {
                        k1.n(obj, j, k1.m(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (g(obj2, i)) {
                        k1.t(obj, j, k1.s(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    q(obj, obj2, i);
                    break;
                case 10:
                    if (g(obj2, i)) {
                        k1.t(obj, j, k1.s(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (g(obj2, i)) {
                        k1.j(obj, j, k1.i(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (g(obj2, i)) {
                        k1.j(obj, j, k1.i(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (g(obj2, i)) {
                        k1.j(obj, j, k1.i(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (g(obj2, i)) {
                        k1.l(obj, j, k1.k(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (g(obj2, i)) {
                        k1.j(obj, j, k1.i(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (g(obj2, i)) {
                        k1.l(obj, j, k1.k(obj2, j));
                        h(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    q(obj, obj2, i);
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
                    this.i.b(obj, obj2, j);
                    break;
                case 50:
                    a1.g(this.m, obj, obj2, j);
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
                    if (i(obj2, i2, i)) {
                        k1.t(obj, j, k1.s(obj2, j));
                        j(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    r(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (i(obj2, i2, i)) {
                        k1.t(obj, j, k1.s(obj2, j));
                        j(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    r(obj, obj2, i);
                    break;
            }
        }
        a1.f(this.j, obj, obj2);
        if (this.d) {
            a1.e(this.k, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final boolean e(Object obj, Object obj2) {
        boolean d;
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int x = x(i);
            long j = x & 1048575;
            switch (z(x)) {
                case 0:
                    if (F(obj, obj2, i) && Double.doubleToLongBits(k1.q(obj, j)) == Double.doubleToLongBits(k1.q(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (F(obj, obj2, i) && Float.floatToIntBits(k1.o(obj, j)) == Float.floatToIntBits(k1.o(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (F(obj, obj2, i) && k1.k(obj, j) == k1.k(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (F(obj, obj2, i) && k1.k(obj, j) == k1.k(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (F(obj, obj2, i) && k1.i(obj, j) == k1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (F(obj, obj2, i) && k1.k(obj, j) == k1.k(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (F(obj, obj2, i) && k1.i(obj, j) == k1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (F(obj, obj2, i) && k1.m(obj, j) == k1.m(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (F(obj, obj2, i) && a1.d(k1.s(obj, j), k1.s(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (F(obj, obj2, i) && a1.d(k1.s(obj, j), k1.s(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (F(obj, obj2, i) && a1.d(k1.s(obj, j), k1.s(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (F(obj, obj2, i) && k1.i(obj, j) == k1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (F(obj, obj2, i) && k1.i(obj, j) == k1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (F(obj, obj2, i) && k1.i(obj, j) == k1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (F(obj, obj2, i) && k1.k(obj, j) == k1.k(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (F(obj, obj2, i) && k1.i(obj, j) == k1.i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (F(obj, obj2, i) && k1.k(obj, j) == k1.k(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (F(obj, obj2, i) && a1.d(k1.s(obj, j), k1.s(obj2, j))) {
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
                    d = a1.d(k1.s(obj, j), k1.s(obj2, j));
                    break;
                case 50:
                    d = a1.d(k1.s(obj, j), k1.s(obj2, j));
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
                    long y = y(i) & 1048575;
                    if (k1.i(obj, y) == k1.i(obj2, y) && a1.d(k1.s(obj, j), k1.s(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!d) {
                return false;
            }
        }
        if (!this.j.b(obj).equals(this.j.b(obj2))) {
            return false;
        }
        if (!this.d) {
            return true;
        }
        this.k.b(obj);
        this.k.b(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final int zzb(Object obj) {
        int i;
        int e;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int x = x(i3);
            int i4 = this.a[i3];
            long j = 1048575 & x;
            int i5 = 37;
            switch (z(x)) {
                case 0:
                    i = i2 * 53;
                    e = b0.e(Double.doubleToLongBits(k1.q(obj, j)));
                    i2 = i + e;
                    break;
                case 1:
                    i = i2 * 53;
                    e = Float.floatToIntBits(k1.o(obj, j));
                    i2 = i + e;
                    break;
                case 2:
                    i = i2 * 53;
                    e = b0.e(k1.k(obj, j));
                    i2 = i + e;
                    break;
                case 3:
                    i = i2 * 53;
                    e = b0.e(k1.k(obj, j));
                    i2 = i + e;
                    break;
                case 4:
                    i = i2 * 53;
                    e = k1.i(obj, j);
                    i2 = i + e;
                    break;
                case 5:
                    i = i2 * 53;
                    e = b0.e(k1.k(obj, j));
                    i2 = i + e;
                    break;
                case 6:
                    i = i2 * 53;
                    e = k1.i(obj, j);
                    i2 = i + e;
                    break;
                case 7:
                    i = i2 * 53;
                    e = b0.f(k1.m(obj, j));
                    i2 = i + e;
                    break;
                case 8:
                    i = i2 * 53;
                    e = ((String) k1.s(obj, j)).hashCode();
                    i2 = i + e;
                    break;
                case 9:
                    Object s = k1.s(obj, j);
                    if (s != null) {
                        i5 = s.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    e = k1.s(obj, j).hashCode();
                    i2 = i + e;
                    break;
                case 11:
                    i = i2 * 53;
                    e = k1.i(obj, j);
                    i2 = i + e;
                    break;
                case 12:
                    i = i2 * 53;
                    e = k1.i(obj, j);
                    i2 = i + e;
                    break;
                case 13:
                    i = i2 * 53;
                    e = k1.i(obj, j);
                    i2 = i + e;
                    break;
                case 14:
                    i = i2 * 53;
                    e = b0.e(k1.k(obj, j));
                    i2 = i + e;
                    break;
                case 15:
                    i = i2 * 53;
                    e = k1.i(obj, j);
                    i2 = i + e;
                    break;
                case 16:
                    i = i2 * 53;
                    e = b0.e(k1.k(obj, j));
                    i2 = i + e;
                    break;
                case 17:
                    Object s2 = k1.s(obj, j);
                    if (s2 != null) {
                        i5 = s2.hashCode();
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
                    e = k1.s(obj, j).hashCode();
                    i2 = i + e;
                    break;
                case 50:
                    i = i2 * 53;
                    e = k1.s(obj, j).hashCode();
                    i2 = i + e;
                    break;
                case 51:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = b0.e(Double.doubleToLongBits(A(obj, j)));
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = Float.floatToIntBits(B(obj, j));
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = b0.e(D(obj, j));
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = b0.e(D(obj, j));
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = C(obj, j);
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = b0.e(D(obj, j));
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = C(obj, j);
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = b0.f(E(obj, j));
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = ((String) k1.s(obj, j)).hashCode();
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = k1.s(obj, j).hashCode();
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = k1.s(obj, j).hashCode();
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = C(obj, j);
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = C(obj, j);
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = C(obj, j);
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = b0.e(D(obj, j));
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = C(obj, j);
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = b0.e(D(obj, j));
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (i(obj, i4, i3)) {
                        i = i2 * 53;
                        e = k1.s(obj, j).hashCode();
                        i2 = i + e;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.j.b(obj).hashCode();
        if (!this.d) {
            return hashCode;
        }
        this.k.b(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final boolean zzf(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.g) {
            int i6 = this.f[i5];
            int i7 = this.a[i6];
            int x = x(i6);
            int i8 = this.a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & x) != 0 && !f(obj, i6, i, i2, i10)) {
                return false;
            }
            int z = z(x);
            if (z != 9 && z != 17) {
                if (z != 27) {
                    if (z == 60 || z == 68) {
                        if (i(obj, i7, i6) && !w(obj, x, u(i6))) {
                            return false;
                        }
                    } else if (z != 49) {
                        if (z == 50) {
                            lh4.a(k1.s(obj, x & 1048575));
                            throw null;
                        }
                    }
                }
                List list = (List) k1.s(obj, x & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    y0 u = u(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!u.zzf(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (f(obj, i6, i, i2, i10) && !w(obj, x, u(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.d) {
            return true;
        }
        this.k.b(obj);
        throw null;
    }
}
