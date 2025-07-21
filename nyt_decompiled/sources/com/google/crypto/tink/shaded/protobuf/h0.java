package com.google.crypto.tink.shaded.protobuf;

import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.Writer;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.z;
import defpackage.lh4;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class h0 implements r0 {
    private static final int[] r = new int[0];
    private static final Unsafe s = z0.B();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final f0 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final j0 m;
    private final w n;
    private final w0 o;
    private final n p;
    private final a0 q;

    private h0(int[] iArr, Object[] objArr, int i, int i2, f0 f0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, j0 j0Var, w wVar, w0 w0Var, n nVar, a0 a0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = f0Var instanceof GeneratedMessageLite;
        this.h = z;
        this.f = nVar != null && nVar.e(f0Var);
        this.i = z2;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = j0Var;
        this.n = wVar;
        this.o = w0Var;
        this.p = nVar;
        this.e = f0Var;
        this.q = a0Var;
    }

    private static boolean A(int i) {
        return (i & 536870912) != 0;
    }

    private boolean B(Object obj, int i) {
        if (!this.h) {
            int h0 = h0(i);
            return (z0.x(obj, (long) (h0 & 1048575)) & (1 << (h0 >>> 20))) != 0;
        }
        int r0 = r0(i);
        long U = U(r0);
        switch (q0(r0)) {
            case 0:
                return z0.v(obj, U) != 0.0d;
            case 1:
                return z0.w(obj, U) != 0.0f;
            case 2:
                return z0.y(obj, U) != 0;
            case 3:
                return z0.y(obj, U) != 0;
            case 4:
                return z0.x(obj, U) != 0;
            case 5:
                return z0.y(obj, U) != 0;
            case 6:
                return z0.x(obj, U) != 0;
            case 7:
                return z0.p(obj, U);
            case 8:
                Object A = z0.A(obj, U);
                if (A instanceof String) {
                    return !((String) A).isEmpty();
                }
                if (A instanceof ByteString) {
                    return !ByteString.a.equals(A);
                }
                throw new IllegalArgumentException();
            case 9:
                return z0.A(obj, U) != null;
            case 10:
                return !ByteString.a.equals(z0.A(obj, U));
            case 11:
                return z0.x(obj, U) != 0;
            case 12:
                return z0.x(obj, U) != 0;
            case 13:
                return z0.x(obj, U) != 0;
            case 14:
                return z0.y(obj, U) != 0;
            case 15:
                return z0.x(obj, U) != 0;
            case 16:
                return z0.y(obj, U) != 0;
            case 17:
                return z0.A(obj, U) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean C(Object obj, int i, int i2, int i3) {
        return this.h ? B(obj, i) : (i2 & i3) != 0;
    }

    private static boolean D(Object obj, int i, r0 r0Var) {
        return r0Var.c(z0.A(obj, U(i)));
    }

    private boolean E(Object obj, int i, int i2) {
        List list = (List) z0.A(obj, U(i));
        if (list.isEmpty()) {
            return true;
        }
        r0 u = u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!u.c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    private boolean F(Object obj, int i, int i2) {
        if (this.q.e(z0.A(obj, U(i))).isEmpty()) {
            return true;
        }
        this.q.b(t(i2));
        throw null;
    }

    private boolean G(Object obj, Object obj2, int i) {
        long h0 = h0(i) & 1048575;
        return z0.x(obj, h0) == z0.x(obj2, h0);
    }

    private boolean H(Object obj, int i, int i2) {
        return z0.x(obj, (long) (h0(i2) & 1048575)) == i;
    }

    private static boolean I(int i) {
        return (i & 268435456) != 0;
    }

    private static List J(Object obj, long j) {
        return (List) z0.A(obj, j);
    }

    private static long K(Object obj, long j) {
        return z0.y(obj, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x0063, code lost:
    
        r11 = r9.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0067, code lost:
    
        if (r11 >= r9.l) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0069, code lost:
    
        r8 = p(r12, r9.j[r11], r8, r10);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0074, code lost:
    
        if (r8 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0076, code lost:
    
        r10.o(r12, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void L(com.google.crypto.tink.shaded.protobuf.w0 r10, com.google.crypto.tink.shaded.protobuf.n r11, java.lang.Object r12, com.google.crypto.tink.shaded.protobuf.q0 r13, com.google.crypto.tink.shaded.protobuf.m r14) {
        /*
            Method dump skipped, instructions count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.h0.L(com.google.crypto.tink.shaded.protobuf.w0, com.google.crypto.tink.shaded.protobuf.n, java.lang.Object, com.google.crypto.tink.shaded.protobuf.q0, com.google.crypto.tink.shaded.protobuf.m):void");
    }

    private final void M(Object obj, int i, Object obj2, m mVar, q0 q0Var) {
        long U = U(r0(i));
        Object A = z0.A(obj, U);
        if (A == null) {
            A = this.q.d(obj2);
            z0.O(obj, U, A);
        } else if (this.q.h(A)) {
            Object d = this.q.d(obj2);
            this.q.a(d, A);
            z0.O(obj, U, d);
            A = d;
        }
        Map c = this.q.c(A);
        this.q.b(obj2);
        q0Var.K(c, null, mVar);
    }

    private void N(Object obj, Object obj2, int i) {
        long U = U(r0(i));
        if (B(obj2, i)) {
            Object A = z0.A(obj, U);
            Object A2 = z0.A(obj2, U);
            if (A != null && A2 != null) {
                z0.O(obj, U, u.h(A, A2));
                n0(obj, i);
            } else if (A2 != null) {
                z0.O(obj, U, A2);
                n0(obj, i);
            }
        }
    }

    private void O(Object obj, Object obj2, int i) {
        int r0 = r0(i);
        int T = T(i);
        long U = U(r0);
        if (H(obj2, T, i)) {
            Object A = z0.A(obj, U);
            Object A2 = z0.A(obj2, U);
            if (A != null && A2 != null) {
                z0.O(obj, U, u.h(A, A2));
                o0(obj, T, i);
            } else if (A2 != null) {
                z0.O(obj, U, A2);
                o0(obj, T, i);
            }
        }
    }

    private void P(Object obj, Object obj2, int i) {
        int r0 = r0(i);
        long U = U(r0);
        int T = T(i);
        switch (q0(r0)) {
            case 0:
                if (B(obj2, i)) {
                    z0.K(obj, U, z0.v(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 1:
                if (B(obj2, i)) {
                    z0.L(obj, U, z0.w(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 2:
                if (B(obj2, i)) {
                    z0.N(obj, U, z0.y(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 3:
                if (B(obj2, i)) {
                    z0.N(obj, U, z0.y(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 4:
                if (B(obj2, i)) {
                    z0.M(obj, U, z0.x(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 5:
                if (B(obj2, i)) {
                    z0.N(obj, U, z0.y(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 6:
                if (B(obj2, i)) {
                    z0.M(obj, U, z0.x(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 7:
                if (B(obj2, i)) {
                    z0.E(obj, U, z0.p(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 8:
                if (B(obj2, i)) {
                    z0.O(obj, U, z0.A(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 9:
                N(obj, obj2, i);
                break;
            case 10:
                if (B(obj2, i)) {
                    z0.O(obj, U, z0.A(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 11:
                if (B(obj2, i)) {
                    z0.M(obj, U, z0.x(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 12:
                if (B(obj2, i)) {
                    z0.M(obj, U, z0.x(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 13:
                if (B(obj2, i)) {
                    z0.M(obj, U, z0.x(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 14:
                if (B(obj2, i)) {
                    z0.N(obj, U, z0.y(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 15:
                if (B(obj2, i)) {
                    z0.M(obj, U, z0.x(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 16:
                if (B(obj2, i)) {
                    z0.N(obj, U, z0.y(obj2, U));
                    n0(obj, i);
                    break;
                }
                break;
            case 17:
                N(obj, obj2, i);
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
                this.n.d(obj, obj2, U);
                break;
            case 50:
                t0.E(this.q, obj, obj2, U);
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
                if (H(obj2, T, i)) {
                    z0.O(obj, U, z0.A(obj2, U));
                    o0(obj, T, i);
                    break;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                O(obj, obj2, i);
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                if (H(obj2, T, i)) {
                    z0.O(obj, U, z0.A(obj2, U));
                    o0(obj, T, i);
                    break;
                }
                break;
            case 68:
                O(obj, obj2, i);
                break;
        }
    }

    static h0 Q(Class cls, d0 d0Var, j0 j0Var, w wVar, w0 w0Var, n nVar, a0 a0Var) {
        if (d0Var instanceof p0) {
            return S((p0) d0Var, j0Var, wVar, w0Var, nVar, a0Var);
        }
        lh4.a(d0Var);
        return R(null, j0Var, wVar, w0Var, nVar, a0Var);
    }

    static h0 R(u0 u0Var, j0 j0Var, w wVar, w0 w0Var, n nVar, a0 a0Var) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.crypto.tink.shaded.protobuf.h0 S(com.google.crypto.tink.shaded.protobuf.p0 r35, com.google.crypto.tink.shaded.protobuf.j0 r36, com.google.crypto.tink.shaded.protobuf.w r37, com.google.crypto.tink.shaded.protobuf.w0 r38, com.google.crypto.tink.shaded.protobuf.n r39, com.google.crypto.tink.shaded.protobuf.a0 r40) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.h0.S(com.google.crypto.tink.shaded.protobuf.p0, com.google.crypto.tink.shaded.protobuf.j0, com.google.crypto.tink.shaded.protobuf.w, com.google.crypto.tink.shaded.protobuf.w0, com.google.crypto.tink.shaded.protobuf.n, com.google.crypto.tink.shaded.protobuf.a0):com.google.crypto.tink.shaded.protobuf.h0");
    }

    private int T(int i) {
        return this.a[i];
    }

    private static long U(int i) {
        return i & 1048575;
    }

    private static boolean V(Object obj, long j) {
        return ((Boolean) z0.A(obj, j)).booleanValue();
    }

    private static double W(Object obj, long j) {
        return ((Double) z0.A(obj, j)).doubleValue();
    }

    private static float X(Object obj, long j) {
        return ((Float) z0.A(obj, j)).floatValue();
    }

    private static int Y(Object obj, long j) {
        return ((Integer) z0.A(obj, j)).intValue();
    }

    private static long Z(Object obj, long j) {
        return ((Long) z0.A(obj, j)).longValue();
    }

    private int a0(Object obj, byte[] bArr, int i, int i2, int i3, long j, e.a aVar) {
        Unsafe unsafe = s;
        Object t = t(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.q.h(object)) {
            Object d = this.q.d(t);
            this.q.a(d, object);
            unsafe.putObject(obj, j, d);
            object = d;
        }
        this.q.b(t);
        return m(bArr, i, i2, null, this.q.c(object), aVar);
    }

    private int b0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, e.a aVar) {
        Unsafe unsafe = s;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(e.d(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(e.k(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
            case 54:
                if (i5 == 0) {
                    int K = e.K(bArr, i, aVar);
                    unsafe.putObject(obj, j, Long.valueOf(aVar.b));
                    unsafe.putInt(obj, j2, i4);
                    return K;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int H = e.H(bArr, i, aVar);
                    unsafe.putObject(obj, j, Integer.valueOf(aVar.a));
                    unsafe.putInt(obj, j2, i4);
                    return H;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(e.i(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(e.g(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int K2 = e.K(bArr, i, aVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(aVar.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return K2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int H2 = e.H(bArr, i, aVar);
                    int i13 = aVar.a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !Utf8.n(bArr, H2, H2 + i13)) {
                            throw InvalidProtocolBufferException.c();
                        }
                        unsafe.putObject(obj, j, new String(bArr, H2, i13, u.a));
                        H2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return H2;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 == 2) {
                    int o = e.o(u(i8), bArr, i, i2, aVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, aVar.c);
                    } else {
                        unsafe.putObject(obj, j, u.h(object, aVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return o;
                }
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 == 2) {
                    int b = e.b(bArr, i, aVar);
                    unsafe.putObject(obj, j, aVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return b;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int H3 = e.H(bArr, i, aVar);
                    int i14 = aVar.a;
                    u.c s2 = s(i8);
                    if (s2 == null || s2.a(i14)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        v(obj).n(i3, Long.valueOf(i14));
                    }
                    return H3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int H4 = e.H(bArr, i, aVar);
                    unsafe.putObject(obj, j, Integer.valueOf(g.b(aVar.a)));
                    unsafe.putInt(obj, j2, i4);
                    return H4;
                }
                break;
            case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                if (i5 == 0) {
                    int K3 = e.K(bArr, i, aVar);
                    unsafe.putObject(obj, j, Long.valueOf(g.c(aVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return K3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int m = e.m(u(i8), bArr, i, i2, (i3 & (-8)) | 4, aVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, aVar.c);
                    } else {
                        unsafe.putObject(obj, j, u.h(object2, aVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01dd, code lost:
    
        if (r0 != r15) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f3, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021f, code lost:
    
        if (r0 != r15) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023e, code lost:
    
        if (r0 != r15) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x005d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int d0(java.lang.Object r28, byte[] r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.e.a r32) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.h0.d0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    private int e0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, e.a aVar) {
        int I;
        Unsafe unsafe = s;
        u.d dVar = (u.d) unsafe.getObject(obj, j2);
        if (!dVar.l()) {
            int size = dVar.size();
            dVar = dVar.m(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, dVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return e.r(bArr, i, dVar, aVar);
                }
                if (i5 == 1) {
                    return e.e(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return e.u(bArr, i, dVar, aVar);
                }
                if (i5 == 5) {
                    return e.l(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return e.y(bArr, i, dVar, aVar);
                }
                if (i5 == 0) {
                    return e.L(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 22:
            case BuildConfig.VERSION_CODE /* 29 */:
            case 39:
            case 43:
                if (i5 == 2) {
                    return e.x(bArr, i, dVar, aVar);
                }
                if (i5 == 0) {
                    return e.I(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return e.t(bArr, i, dVar, aVar);
                }
                if (i5 == 1) {
                    return e.j(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return e.s(bArr, i, dVar, aVar);
                }
                if (i5 == 5) {
                    return e.h(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case EventType.SUBS /* 25 */:
            case 42:
                if (i5 == 2) {
                    return e.q(bArr, i, dVar, aVar);
                }
                if (i5 == 0) {
                    return e.a(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case EventType.CDN /* 26 */:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? e.C(i3, bArr, i, i2, dVar, aVar) : e.D(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return e.p(u(i6), i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return e.c(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    I = e.x(bArr, i, dVar, aVar);
                } else if (i5 == 0) {
                    I = e.I(i3, bArr, i, i2, dVar, aVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                x0 x0Var = generatedMessageLite.unknownFields;
                if (x0Var == x0.e()) {
                    x0Var = null;
                }
                x0 x0Var2 = (x0) t0.z(i4, dVar, s(i6), x0Var, this.o);
                if (x0Var2 != null) {
                    generatedMessageLite.unknownFields = x0Var2;
                }
                return I;
            case 33:
            case 47:
                if (i5 == 2) {
                    return e.v(bArr, i, dVar, aVar);
                }
                if (i5 == 0) {
                    return e.z(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return e.w(bArr, i, dVar, aVar);
                }
                if (i5 == 0) {
                    return e.A(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return e.n(u(i6), i3, bArr, i, i2, dVar, aVar);
                }
                break;
        }
        return i;
    }

    private int f0(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return p0(i, 0);
    }

    private int g0(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return p0(i, i2);
    }

    private int h0(int i) {
        return this.a[i + 2];
    }

    private void i0(Object obj, long j, q0 q0Var, r0 r0Var, m mVar) {
        q0Var.N(this.n.e(obj, j), r0Var, mVar);
    }

    private void j0(Object obj, int i, q0 q0Var, r0 r0Var, m mVar) {
        q0Var.L(this.n.e(obj, U(i)), r0Var, mVar);
    }

    private boolean k(Object obj, Object obj2, int i) {
        return B(obj, i) == B(obj2, i);
    }

    private void k0(Object obj, int i, q0 q0Var) {
        if (A(i)) {
            z0.O(obj, U(i), q0Var.I());
        } else if (this.g) {
            z0.O(obj, U(i), q0Var.z());
        } else {
            z0.O(obj, U(i), q0Var.n());
        }
    }

    private static boolean l(Object obj, long j) {
        return z0.p(obj, j);
    }

    private void l0(Object obj, int i, q0 q0Var) {
        if (A(i)) {
            q0Var.m(this.n.e(obj, U(i)));
        } else {
            q0Var.B(this.n.e(obj, U(i)));
        }
    }

    private int m(byte[] bArr, int i, int i2, z.a aVar, Map map, e.a aVar2) {
        int H = e.H(bArr, i, aVar2);
        int i3 = aVar2.a;
        if (i3 < 0 || i3 > i2 - H) {
            throw InvalidProtocolBufferException.j();
        }
        throw null;
    }

    private static Field m0(Class cls, String str) {
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

    private static double n(Object obj, long j) {
        return z0.v(obj, j);
    }

    private void n0(Object obj, int i) {
        if (this.h) {
            return;
        }
        int h0 = h0(i);
        long j = h0 & 1048575;
        z0.M(obj, j, z0.x(obj, j) | (1 << (h0 >>> 20)));
    }

    private boolean o(Object obj, Object obj2, int i) {
        int r0 = r0(i);
        long U = U(r0);
        switch (q0(r0)) {
            case 0:
                if (k(obj, obj2, i) && Double.doubleToLongBits(z0.v(obj, U)) == Double.doubleToLongBits(z0.v(obj2, U))) {
                    break;
                }
                break;
            case 1:
                if (k(obj, obj2, i) && Float.floatToIntBits(z0.w(obj, U)) == Float.floatToIntBits(z0.w(obj2, U))) {
                    break;
                }
                break;
            case 2:
                if (k(obj, obj2, i) && z0.y(obj, U) == z0.y(obj2, U)) {
                    break;
                }
                break;
            case 3:
                if (k(obj, obj2, i) && z0.y(obj, U) == z0.y(obj2, U)) {
                    break;
                }
                break;
            case 4:
                if (k(obj, obj2, i) && z0.x(obj, U) == z0.x(obj2, U)) {
                    break;
                }
                break;
            case 5:
                if (k(obj, obj2, i) && z0.y(obj, U) == z0.y(obj2, U)) {
                    break;
                }
                break;
            case 6:
                if (k(obj, obj2, i) && z0.x(obj, U) == z0.x(obj2, U)) {
                    break;
                }
                break;
            case 7:
                if (k(obj, obj2, i) && z0.p(obj, U) == z0.p(obj2, U)) {
                    break;
                }
                break;
            case 8:
                if (k(obj, obj2, i) && t0.J(z0.A(obj, U), z0.A(obj2, U))) {
                    break;
                }
                break;
            case 9:
                if (k(obj, obj2, i) && t0.J(z0.A(obj, U), z0.A(obj2, U))) {
                    break;
                }
                break;
            case 10:
                if (k(obj, obj2, i) && t0.J(z0.A(obj, U), z0.A(obj2, U))) {
                    break;
                }
                break;
            case 11:
                if (k(obj, obj2, i) && z0.x(obj, U) == z0.x(obj2, U)) {
                    break;
                }
                break;
            case 12:
                if (k(obj, obj2, i) && z0.x(obj, U) == z0.x(obj2, U)) {
                    break;
                }
                break;
            case 13:
                if (k(obj, obj2, i) && z0.x(obj, U) == z0.x(obj2, U)) {
                    break;
                }
                break;
            case 14:
                if (k(obj, obj2, i) && z0.y(obj, U) == z0.y(obj2, U)) {
                    break;
                }
                break;
            case 15:
                if (k(obj, obj2, i) && z0.x(obj, U) == z0.x(obj2, U)) {
                    break;
                }
                break;
            case 16:
                if (k(obj, obj2, i) && z0.y(obj, U) == z0.y(obj2, U)) {
                    break;
                }
                break;
            case 17:
                if (k(obj, obj2, i) && t0.J(z0.A(obj, U), z0.A(obj2, U))) {
                    break;
                }
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
                if (G(obj, obj2, i) && t0.J(z0.A(obj, U), z0.A(obj2, U))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void o0(Object obj, int i, int i2) {
        z0.M(obj, h0(i2) & 1048575, i);
    }

    private final Object p(Object obj, int i, Object obj2, w0 w0Var) {
        u.c s2;
        int T = T(i);
        Object A = z0.A(obj, U(r0(i)));
        return (A == null || (s2 = s(i)) == null) ? obj2 : q(i, T, this.q.c(A), s2, obj2, w0Var);
    }

    private int p0(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int T = T(i4);
            if (i == T) {
                return i4;
            }
            if (i < T) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final Object q(int i, int i2, Map map, u.c cVar, Object obj, w0 w0Var) {
        this.q.b(t(i));
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!cVar.a(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = w0Var.n();
                }
                ByteString.g t = ByteString.t(z.a(null, entry.getKey(), entry.getValue()));
                try {
                    z.b(t.b(), null, entry.getKey(), entry.getValue());
                    w0Var.d(obj, i2, t.a());
                    it2.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    private static int q0(int i) {
        return (i & 267386880) >>> 20;
    }

    private static float r(Object obj, long j) {
        return z0.w(obj, j);
    }

    private int r0(int i) {
        return this.a[i + 1];
    }

    private u.c s(int i) {
        return (u.c) this.b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void s0(java.lang.Object r18, com.google.crypto.tink.shaded.protobuf.Writer r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.h0.s0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    private Object t(int i) {
        return this.b[(i / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t0(java.lang.Object r13, com.google.crypto.tink.shaded.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.h0.t0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    private r0 u(int i) {
        int i2 = (i / 3) * 2;
        r0 r0Var = (r0) this.b[i2];
        if (r0Var != null) {
            return r0Var;
        }
        r0 c = n0.a().c((Class) this.b[i2 + 1]);
        this.b[i2] = c;
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u0(java.lang.Object r11, com.google.crypto.tink.shaded.protobuf.Writer r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.h0.u0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    static x0 v(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        x0 x0Var = generatedMessageLite.unknownFields;
        if (x0Var != x0.e()) {
            return x0Var;
        }
        x0 l = x0.l();
        generatedMessageLite.unknownFields = l;
        return l;
    }

    private void v0(Writer writer, int i, Object obj, int i2) {
        if (obj != null) {
            this.q.b(t(i2));
            writer.J(i, null, this.q.e(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int w(Object obj) {
        int i;
        int i2;
        int h;
        int d;
        int B;
        boolean z;
        int f;
        int i3;
        int L;
        int N;
        Unsafe unsafe = s;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.a.length) {
            int r0 = r0(i5);
            int T = T(i5);
            int q0 = q0(r0);
            if (q0 <= 17) {
                i = this.a[i5 + 2];
                int i8 = 1048575 & i;
                int i9 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i2 = i9;
            } else {
                i = (!this.i || q0 < FieldType.DOUBLE_LIST_PACKED.id() || q0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.a[i5 + 2] & 1048575;
                i2 = 0;
            }
            long U = U(r0);
            int i10 = i4;
            switch (q0) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.h(T, 0.0d);
                        i6 += h;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.p(T, 0.0f);
                        i6 += h;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.v(T, unsafe.getLong(obj, U));
                        i6 += h;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.O(T, unsafe.getLong(obj, U));
                        i6 += h;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.t(T, unsafe.getInt(obj, U));
                        i6 += h;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.n(T, 0L);
                        i6 += h;
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        h = CodedOutputStream.l(T, 0);
                        i6 += h;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        d = CodedOutputStream.d(T, true);
                        i6 += d;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(obj, U);
                        d = object instanceof ByteString ? CodedOutputStream.f(T, (ByteString) object) : CodedOutputStream.J(T, (String) object);
                        i6 += d;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        d = t0.o(T, unsafe.getObject(obj, U), u(i5));
                        i6 += d;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        d = CodedOutputStream.f(T, (ByteString) unsafe.getObject(obj, U));
                        i6 += d;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        d = CodedOutputStream.M(T, unsafe.getInt(obj, U));
                        i6 += d;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        d = CodedOutputStream.j(T, unsafe.getInt(obj, U));
                        i6 += d;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        B = CodedOutputStream.B(T, 0);
                        i6 += B;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        d = CodedOutputStream.D(T, 0L);
                        i6 += d;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        d = CodedOutputStream.F(T, unsafe.getInt(obj, U));
                        i6 += d;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        d = CodedOutputStream.H(T, unsafe.getLong(obj, U));
                        i6 += d;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        d = CodedOutputStream.r(T, (f0) unsafe.getObject(obj, U), u(i5));
                        i6 += d;
                    }
                    break;
                case 18:
                    d = t0.h(T, (List) unsafe.getObject(obj, U), false);
                    i6 += d;
                    break;
                case 19:
                    z = false;
                    f = t0.f(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case 20:
                    z = false;
                    f = t0.m(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case 21:
                    z = false;
                    f = t0.x(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case 22:
                    z = false;
                    f = t0.k(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case 23:
                    z = false;
                    f = t0.h(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case 24:
                    z = false;
                    f = t0.f(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case EventType.SUBS /* 25 */:
                    z = false;
                    f = t0.a(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case EventType.CDN /* 26 */:
                    d = t0.u(T, (List) unsafe.getObject(obj, U));
                    i6 += d;
                    break;
                case 27:
                    d = t0.p(T, (List) unsafe.getObject(obj, U), u(i5));
                    i6 += d;
                    break;
                case 28:
                    d = t0.c(T, (List) unsafe.getObject(obj, U));
                    i6 += d;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    d = t0.v(T, (List) unsafe.getObject(obj, U), false);
                    i6 += d;
                    break;
                case 30:
                    z = false;
                    f = t0.d(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case 31:
                    z = false;
                    f = t0.f(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case 32:
                    z = false;
                    f = t0.h(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case 33:
                    z = false;
                    f = t0.q(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case 34:
                    z = false;
                    f = t0.s(T, (List) unsafe.getObject(obj, U), false);
                    i6 += f;
                    break;
                case 35:
                    i3 = t0.i((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 36:
                    i3 = t0.g((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 37:
                    i3 = t0.n((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 38:
                    i3 = t0.y((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 39:
                    i3 = t0.l((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 40:
                    i3 = t0.i((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 41:
                    i3 = t0.g((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 42:
                    i3 = t0.b((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 43:
                    i3 = t0.w((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 44:
                    i3 = t0.e((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 45:
                    i3 = t0.g((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 46:
                    i3 = t0.i((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 47:
                    i3 = t0.r((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 48:
                    i3 = t0.t((List) unsafe.getObject(obj, U));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i3);
                        B = L + N + i3;
                        i6 += B;
                    }
                    break;
                case 49:
                    d = t0.j(T, (List) unsafe.getObject(obj, U), u(i5));
                    i6 += d;
                    break;
                case 50:
                    d = this.q.g(T, unsafe.getObject(obj, U), t(i5));
                    i6 += d;
                    break;
                case 51:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.h(T, 0.0d);
                        i6 += d;
                    }
                    break;
                case 52:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.p(T, 0.0f);
                        i6 += d;
                    }
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.v(T, Z(obj, U));
                        i6 += d;
                    }
                    break;
                case 54:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.O(T, Z(obj, U));
                        i6 += d;
                    }
                    break;
                case 55:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.t(T, Y(obj, U));
                        i6 += d;
                    }
                    break;
                case 56:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.n(T, 0L);
                        i6 += d;
                    }
                    break;
                case 57:
                    if (H(obj, T, i5)) {
                        B = CodedOutputStream.l(T, 0);
                        i6 += B;
                    }
                    break;
                case 58:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.d(T, true);
                        i6 += d;
                    }
                    break;
                case 59:
                    if (H(obj, T, i5)) {
                        Object object2 = unsafe.getObject(obj, U);
                        d = object2 instanceof ByteString ? CodedOutputStream.f(T, (ByteString) object2) : CodedOutputStream.J(T, (String) object2);
                        i6 += d;
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (H(obj, T, i5)) {
                        d = t0.o(T, unsafe.getObject(obj, U), u(i5));
                        i6 += d;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.f(T, (ByteString) unsafe.getObject(obj, U));
                        i6 += d;
                    }
                    break;
                case 62:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.M(T, Y(obj, U));
                        i6 += d;
                    }
                    break;
                case 63:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.j(T, Y(obj, U));
                        i6 += d;
                    }
                    break;
                case 64:
                    if (H(obj, T, i5)) {
                        B = CodedOutputStream.B(T, 0);
                        i6 += B;
                    }
                    break;
                case 65:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.D(T, 0L);
                        i6 += d;
                    }
                    break;
                case 66:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.F(T, Y(obj, U));
                        i6 += d;
                    }
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.H(T, Z(obj, U));
                        i6 += d;
                    }
                    break;
                case 68:
                    if (H(obj, T, i5)) {
                        d = CodedOutputStream.r(T, (f0) unsafe.getObject(obj, U), u(i5));
                        i6 += d;
                    }
                    break;
            }
            i5 += 3;
            i4 = i10;
        }
        int y = i6 + y(this.o, obj);
        return this.f ? y + this.p.c(obj).c() : y;
    }

    private void w0(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.e(i, (String) obj);
        } else {
            writer.M(i, (ByteString) obj);
        }
    }

    private int x(Object obj) {
        int h;
        int i;
        int L;
        int N;
        Unsafe unsafe = s;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.length; i3 += 3) {
            int r0 = r0(i3);
            int q0 = q0(r0);
            int T = T(i3);
            long U = U(r0);
            int i4 = (q0 < FieldType.DOUBLE_LIST_PACKED.id() || q0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.a[i3 + 2] & 1048575;
            switch (q0) {
                case 0:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.h(T, 0.0d);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.p(T, 0.0f);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.v(T, z0.y(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.O(T, z0.y(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.t(T, z0.x(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.n(T, 0L);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.l(T, 0);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.d(T, true);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (B(obj, i3)) {
                        Object A = z0.A(obj, U);
                        h = A instanceof ByteString ? CodedOutputStream.f(T, (ByteString) A) : CodedOutputStream.J(T, (String) A);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (B(obj, i3)) {
                        h = t0.o(T, z0.A(obj, U), u(i3));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.f(T, (ByteString) z0.A(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.M(T, z0.x(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.j(T, z0.x(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.B(T, 0);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.D(T, 0L);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.F(T, z0.x(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.H(T, z0.y(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (B(obj, i3)) {
                        h = CodedOutputStream.r(T, (f0) z0.A(obj, U), u(i3));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h = t0.h(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 19:
                    h = t0.f(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 20:
                    h = t0.m(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 21:
                    h = t0.x(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 22:
                    h = t0.k(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 23:
                    h = t0.h(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 24:
                    h = t0.f(T, J(obj, U), false);
                    i2 += h;
                    break;
                case EventType.SUBS /* 25 */:
                    h = t0.a(T, J(obj, U), false);
                    i2 += h;
                    break;
                case EventType.CDN /* 26 */:
                    h = t0.u(T, J(obj, U));
                    i2 += h;
                    break;
                case 27:
                    h = t0.p(T, J(obj, U), u(i3));
                    i2 += h;
                    break;
                case 28:
                    h = t0.c(T, J(obj, U));
                    i2 += h;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    h = t0.v(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 30:
                    h = t0.d(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 31:
                    h = t0.f(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 32:
                    h = t0.h(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 33:
                    h = t0.q(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 34:
                    h = t0.s(T, J(obj, U), false);
                    i2 += h;
                    break;
                case 35:
                    i = t0.i((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 36:
                    i = t0.g((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 37:
                    i = t0.n((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 38:
                    i = t0.y((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 39:
                    i = t0.l((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 40:
                    i = t0.i((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 41:
                    i = t0.g((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 42:
                    i = t0.b((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 43:
                    i = t0.w((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 44:
                    i = t0.e((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 45:
                    i = t0.g((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 46:
                    i = t0.i((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 47:
                    i = t0.r((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 48:
                    i = t0.t((List) unsafe.getObject(obj, U));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        L = CodedOutputStream.L(T);
                        N = CodedOutputStream.N(i);
                        h = L + N + i;
                        i2 += h;
                        break;
                    }
                case 49:
                    h = t0.j(T, J(obj, U), u(i3));
                    i2 += h;
                    break;
                case 50:
                    h = this.q.g(T, z0.A(obj, U), t(i3));
                    i2 += h;
                    break;
                case 51:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.h(T, 0.0d);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.p(T, 0.0f);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.v(T, Z(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.O(T, Z(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.t(T, Y(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.n(T, 0L);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.l(T, 0);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.d(T, true);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (H(obj, T, i3)) {
                        Object A2 = z0.A(obj, U);
                        h = A2 instanceof ByteString ? CodedOutputStream.f(T, (ByteString) A2) : CodedOutputStream.J(T, (String) A2);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (H(obj, T, i3)) {
                        h = t0.o(T, z0.A(obj, U), u(i3));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.f(T, (ByteString) z0.A(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.M(T, Y(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.j(T, Y(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.B(T, 0);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.D(T, 0L);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.F(T, Y(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.H(T, Z(obj, U));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (H(obj, T, i3)) {
                        h = CodedOutputStream.r(T, (f0) z0.A(obj, U), u(i3));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i2 + y(this.o, obj);
    }

    private void x0(w0 w0Var, Object obj, Writer writer) {
        w0Var.t(w0Var.g(obj), writer);
    }

    private int y(w0 w0Var, Object obj) {
        return w0Var.h(w0Var.g(obj));
    }

    private static int z(Object obj, long j) {
        return z0.x(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            P(obj, obj2, i);
        }
        t0.F(this.o, obj, obj2);
        if (this.f) {
            t0.D(this.p, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void b(Object obj) {
        int i;
        int i2 = this.k;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long U = U(r0(this.j[i2]));
            Object A = z0.A(obj, U);
            if (A != null) {
                z0.O(obj, U, this.q.f(A));
            }
            i2++;
        }
        int length = this.j.length;
        while (i < length) {
            this.n.c(obj, this.j[i]);
            i++;
        }
        this.o.j(obj);
        if (this.f) {
            this.p.f(obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final boolean c(Object obj) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.k; i4++) {
            int i5 = this.j[i4];
            int T = T(i5);
            int r0 = r0(i5);
            if (this.h) {
                i = 0;
            } else {
                int i6 = this.a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = s.getInt(obj, i7);
                    i2 = i7;
                }
            }
            if (I(r0) && !C(obj, i5, i3, i)) {
                return false;
            }
            int q0 = q0(r0);
            if (q0 != 9 && q0 != 17) {
                if (q0 != 27) {
                    if (q0 == 60 || q0 == 68) {
                        if (H(obj, T, i5) && !D(obj, r0, u(i5))) {
                            return false;
                        }
                    } else if (q0 != 49) {
                        if (q0 == 50 && !F(obj, r0, i5)) {
                            return false;
                        }
                    }
                }
                if (!E(obj, r0, i5)) {
                    return false;
                }
            } else if (C(obj, i5, i3, i) && !D(obj, r0, u(i5))) {
                return false;
            }
        }
        return !this.f || this.p.c(obj).e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0351, code lost:
    
        if (r0 != r11) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0353, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r17;
        r7 = r19;
        r2 = r20;
        r6 = r22;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x036d, code lost:
    
        r2 = r0;
        r8 = r25;
        r0 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03a1, code lost:
    
        if (r0 != r15) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03c4, code lost:
    
        if (r0 != r15) goto L120;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int c0(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.crypto.tink.shaded.protobuf.e.a r35) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.h0.c0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public int d(Object obj) {
        return this.h ? x(obj) : w(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public Object e() {
        return this.m.a(this.e);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public int f(Object obj) {
        int i;
        int f;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int r0 = r0(i3);
            int T = T(i3);
            long U = U(r0);
            int i4 = 37;
            switch (q0(r0)) {
                case 0:
                    i = i2 * 53;
                    f = u.f(Double.doubleToLongBits(z0.v(obj, U)));
                    i2 = i + f;
                    break;
                case 1:
                    i = i2 * 53;
                    f = Float.floatToIntBits(z0.w(obj, U));
                    i2 = i + f;
                    break;
                case 2:
                    i = i2 * 53;
                    f = u.f(z0.y(obj, U));
                    i2 = i + f;
                    break;
                case 3:
                    i = i2 * 53;
                    f = u.f(z0.y(obj, U));
                    i2 = i + f;
                    break;
                case 4:
                    i = i2 * 53;
                    f = z0.x(obj, U);
                    i2 = i + f;
                    break;
                case 5:
                    i = i2 * 53;
                    f = u.f(z0.y(obj, U));
                    i2 = i + f;
                    break;
                case 6:
                    i = i2 * 53;
                    f = z0.x(obj, U);
                    i2 = i + f;
                    break;
                case 7:
                    i = i2 * 53;
                    f = u.c(z0.p(obj, U));
                    i2 = i + f;
                    break;
                case 8:
                    i = i2 * 53;
                    f = ((String) z0.A(obj, U)).hashCode();
                    i2 = i + f;
                    break;
                case 9:
                    Object A = z0.A(obj, U);
                    if (A != null) {
                        i4 = A.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    f = z0.A(obj, U).hashCode();
                    i2 = i + f;
                    break;
                case 11:
                    i = i2 * 53;
                    f = z0.x(obj, U);
                    i2 = i + f;
                    break;
                case 12:
                    i = i2 * 53;
                    f = z0.x(obj, U);
                    i2 = i + f;
                    break;
                case 13:
                    i = i2 * 53;
                    f = z0.x(obj, U);
                    i2 = i + f;
                    break;
                case 14:
                    i = i2 * 53;
                    f = u.f(z0.y(obj, U));
                    i2 = i + f;
                    break;
                case 15:
                    i = i2 * 53;
                    f = z0.x(obj, U);
                    i2 = i + f;
                    break;
                case 16:
                    i = i2 * 53;
                    f = u.f(z0.y(obj, U));
                    i2 = i + f;
                    break;
                case 17:
                    Object A2 = z0.A(obj, U);
                    if (A2 != null) {
                        i4 = A2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
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
                    f = z0.A(obj, U).hashCode();
                    i2 = i + f;
                    break;
                case 50:
                    i = i2 * 53;
                    f = z0.A(obj, U).hashCode();
                    i2 = i + f;
                    break;
                case 51:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = u.f(Double.doubleToLongBits(W(obj, U)));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = Float.floatToIntBits(X(obj, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = u.f(Z(obj, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = u.f(Z(obj, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = Y(obj, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = u.f(Z(obj, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = Y(obj, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = u.c(V(obj, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = ((String) z0.A(obj, U)).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = z0.A(obj, U).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = z0.A(obj, U).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = Y(obj, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = Y(obj, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = Y(obj, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = u.f(Z(obj, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = Y(obj, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = u.f(Z(obj, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (H(obj, T, i3)) {
                        i = i2 * 53;
                        f = z0.A(obj, U).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.o.g(obj).hashCode();
        return this.f ? (hashCode * 53) + this.p.c(obj).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public boolean g(Object obj, Object obj2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            if (!o(obj, obj2, i)) {
                return false;
            }
        }
        if (!this.o.g(obj).equals(this.o.g(obj2))) {
            return false;
        }
        if (this.f) {
            return this.p.c(obj).equals(this.p.c(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void h(Object obj, byte[] bArr, int i, int i2, e.a aVar) {
        if (this.h) {
            d0(obj, bArr, i, i2, aVar);
        } else {
            c0(obj, bArr, i, i2, 0, aVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void i(Object obj, q0 q0Var, m mVar) {
        mVar.getClass();
        L(this.o, this.p, obj, q0Var, mVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void j(Object obj, Writer writer) {
        if (writer.t() == Writer.FieldOrder.DESCENDING) {
            u0(obj, writer);
        } else if (this.h) {
            t0(obj, writer);
        } else {
            s0(obj, writer);
        }
    }
}
