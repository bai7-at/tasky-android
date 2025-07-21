package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import androidx.datastore.preferences.protobuf.t;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.lh4;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class h0 implements r0 {
    private static final int[] r = new int[0];
    private static final Unsafe s = a1.B();
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
    private final x0 o;
    private final m p;
    private final a0 q;

    private h0(int[] iArr, Object[] objArr, int i, int i2, f0 f0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, j0 j0Var, w wVar, x0 x0Var, m mVar, a0 a0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = f0Var instanceof GeneratedMessageLite;
        this.h = z;
        this.f = mVar != null && mVar.e(f0Var);
        this.i = z2;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = j0Var;
        this.n = wVar;
        this.o = x0Var;
        this.p = mVar;
        this.e = f0Var;
        this.q = a0Var;
    }

    private boolean A(Object obj, int i, int i2) {
        List list = (List) a1.A(obj, Q(i));
        if (list.isEmpty()) {
            return true;
        }
        r0 r2 = r(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!r2.c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    private boolean B(Object obj, int i, int i2) {
        Map e = this.q.e(a1.A(obj, Q(i)));
        if (e.isEmpty()) {
            return true;
        }
        if (this.q.b(q(i2)).c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        r0 r0Var = null;
        for (Object obj2 : e.values()) {
            if (r0Var == null) {
                r0Var = n0.a().c(obj2.getClass());
            }
            if (!r0Var.c(obj2)) {
                return false;
            }
        }
        return true;
    }

    private boolean C(Object obj, Object obj2, int i) {
        long X = X(i) & 1048575;
        return a1.x(obj, X) == a1.x(obj2, X);
    }

    private boolean D(Object obj, int i, int i2) {
        return a1.x(obj, (long) (X(i2) & 1048575)) == i;
    }

    private static boolean E(int i) {
        return (i & 268435456) != 0;
    }

    private static List F(Object obj, long j) {
        return (List) a1.A(obj, j);
    }

    private static long G(Object obj, long j) {
        return a1.y(obj, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:302:0x007b, code lost:
    
        r0 = r16.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x007f, code lost:
    
        if (r0 >= r16.l) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0081, code lost:
    
        r13 = n(r19, r16.j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x008c, code lost:
    
        if (r13 == null) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x008e, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H(androidx.datastore.preferences.protobuf.x0 r17, androidx.datastore.preferences.protobuf.m r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.q0 r20, androidx.datastore.preferences.protobuf.l r21) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h0.H(androidx.datastore.preferences.protobuf.x0, androidx.datastore.preferences.protobuf.m, java.lang.Object, androidx.datastore.preferences.protobuf.q0, androidx.datastore.preferences.protobuf.l):void");
    }

    private final void I(Object obj, int i, Object obj2, l lVar, q0 q0Var) {
        long Q = Q(h0(i));
        Object A = a1.A(obj, Q);
        if (A == null) {
            A = this.q.d(obj2);
            a1.O(obj, Q, A);
        } else if (this.q.h(A)) {
            Object d = this.q.d(obj2);
            this.q.a(d, A);
            a1.O(obj, Q, d);
            A = d;
        }
        q0Var.M(this.q.c(A), this.q.b(obj2), lVar);
    }

    private void J(Object obj, Object obj2, int i) {
        long Q = Q(h0(i));
        if (x(obj2, i)) {
            Object A = a1.A(obj, Q);
            Object A2 = a1.A(obj2, Q);
            if (A != null && A2 != null) {
                a1.O(obj, Q, t.h(A, A2));
                d0(obj, i);
            } else if (A2 != null) {
                a1.O(obj, Q, A2);
                d0(obj, i);
            }
        }
    }

    private void K(Object obj, Object obj2, int i) {
        int h0 = h0(i);
        int P = P(i);
        long Q = Q(h0);
        if (D(obj2, P, i)) {
            Object A = a1.A(obj, Q);
            Object A2 = a1.A(obj2, Q);
            if (A != null && A2 != null) {
                a1.O(obj, Q, t.h(A, A2));
                e0(obj, P, i);
            } else if (A2 != null) {
                a1.O(obj, Q, A2);
                e0(obj, P, i);
            }
        }
    }

    private void L(Object obj, Object obj2, int i) {
        int h0 = h0(i);
        long Q = Q(h0);
        int P = P(i);
        switch (g0(h0)) {
            case 0:
                if (x(obj2, i)) {
                    a1.K(obj, Q, a1.v(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 1:
                if (x(obj2, i)) {
                    a1.L(obj, Q, a1.w(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 2:
                if (x(obj2, i)) {
                    a1.N(obj, Q, a1.y(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 3:
                if (x(obj2, i)) {
                    a1.N(obj, Q, a1.y(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 4:
                if (x(obj2, i)) {
                    a1.M(obj, Q, a1.x(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 5:
                if (x(obj2, i)) {
                    a1.N(obj, Q, a1.y(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 6:
                if (x(obj2, i)) {
                    a1.M(obj, Q, a1.x(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 7:
                if (x(obj2, i)) {
                    a1.E(obj, Q, a1.p(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 8:
                if (x(obj2, i)) {
                    a1.O(obj, Q, a1.A(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 9:
                J(obj, obj2, i);
                break;
            case 10:
                if (x(obj2, i)) {
                    a1.O(obj, Q, a1.A(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 11:
                if (x(obj2, i)) {
                    a1.M(obj, Q, a1.x(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 12:
                if (x(obj2, i)) {
                    a1.M(obj, Q, a1.x(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 13:
                if (x(obj2, i)) {
                    a1.M(obj, Q, a1.x(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 14:
                if (x(obj2, i)) {
                    a1.N(obj, Q, a1.y(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 15:
                if (x(obj2, i)) {
                    a1.M(obj, Q, a1.x(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 16:
                if (x(obj2, i)) {
                    a1.N(obj, Q, a1.y(obj2, Q));
                    d0(obj, i);
                    break;
                }
                break;
            case 17:
                J(obj, obj2, i);
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
                this.n.d(obj, obj2, Q);
                break;
            case 50:
                t0.E(this.q, obj, obj2, Q);
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
                if (D(obj2, P, i)) {
                    a1.O(obj, Q, a1.A(obj2, Q));
                    e0(obj, P, i);
                    break;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                K(obj, obj2, i);
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                if (D(obj2, P, i)) {
                    a1.O(obj, Q, a1.A(obj2, Q));
                    e0(obj, P, i);
                    break;
                }
                break;
            case 68:
                K(obj, obj2, i);
                break;
        }
    }

    static h0 M(Class cls, d0 d0Var, j0 j0Var, w wVar, x0 x0Var, m mVar, a0 a0Var) {
        if (d0Var instanceof p0) {
            return O((p0) d0Var, j0Var, wVar, x0Var, mVar, a0Var);
        }
        lh4.a(d0Var);
        return N(null, j0Var, wVar, x0Var, mVar, a0Var);
    }

    static h0 N(v0 v0Var, j0 j0Var, w wVar, x0 x0Var, m mVar, a0 a0Var) {
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
    static androidx.datastore.preferences.protobuf.h0 O(androidx.datastore.preferences.protobuf.p0 r35, androidx.datastore.preferences.protobuf.j0 r36, androidx.datastore.preferences.protobuf.w r37, androidx.datastore.preferences.protobuf.x0 r38, androidx.datastore.preferences.protobuf.m r39, androidx.datastore.preferences.protobuf.a0 r40) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h0.O(androidx.datastore.preferences.protobuf.p0, androidx.datastore.preferences.protobuf.j0, androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.x0, androidx.datastore.preferences.protobuf.m, androidx.datastore.preferences.protobuf.a0):androidx.datastore.preferences.protobuf.h0");
    }

    private int P(int i) {
        return this.a[i];
    }

    private static long Q(int i) {
        return i & 1048575;
    }

    private static boolean R(Object obj, long j) {
        return ((Boolean) a1.A(obj, j)).booleanValue();
    }

    private static double S(Object obj, long j) {
        return ((Double) a1.A(obj, j)).doubleValue();
    }

    private static float T(Object obj, long j) {
        return ((Float) a1.A(obj, j)).floatValue();
    }

    private static int U(Object obj, long j) {
        return ((Integer) a1.A(obj, j)).intValue();
    }

    private static long V(Object obj, long j) {
        return ((Long) a1.A(obj, j)).longValue();
    }

    private int W(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return f0(i, 0);
    }

    private int X(int i) {
        return this.a[i + 2];
    }

    private void Y(Object obj, long j, q0 q0Var, r0 r0Var, l lVar) {
        q0Var.N(this.n.e(obj, j), r0Var, lVar);
    }

    private void Z(Object obj, int i, q0 q0Var, r0 r0Var, l lVar) {
        q0Var.K(this.n.e(obj, Q(i)), r0Var, lVar);
    }

    private void a0(Object obj, int i, q0 q0Var) {
        if (w(i)) {
            a1.O(obj, Q(i), q0Var.I());
        } else if (this.g) {
            a1.O(obj, Q(i), q0Var.z());
        } else {
            a1.O(obj, Q(i), q0Var.n());
        }
    }

    private void b0(Object obj, int i, q0 q0Var) {
        if (w(i)) {
            q0Var.m(this.n.e(obj, Q(i)));
        } else {
            q0Var.B(this.n.e(obj, Q(i)));
        }
    }

    private static Field c0(Class cls, String str) {
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

    private void d0(Object obj, int i) {
        if (this.h) {
            return;
        }
        int X = X(i);
        long j = X & 1048575;
        a1.M(obj, j, a1.x(obj, j) | (1 << (X >>> 20)));
    }

    private void e0(Object obj, int i, int i2) {
        a1.M(obj, X(i2) & 1048575, i);
    }

    private int f0(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int P = P(i4);
            if (i == P) {
                return i4;
            }
            if (i < P) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int g0(int i) {
        return (i & 267386880) >>> 20;
    }

    private int h0(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i0(java.lang.Object r18, androidx.datastore.preferences.protobuf.Writer r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h0.i0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private boolean j(Object obj, Object obj2, int i) {
        return x(obj, i) == x(obj2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j0(java.lang.Object r13, androidx.datastore.preferences.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h0.j0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private static boolean k(Object obj, long j) {
        return a1.p(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(java.lang.Object r11, androidx.datastore.preferences.protobuf.Writer r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h0.k0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private static double l(Object obj, long j) {
        return a1.v(obj, j);
    }

    private void l0(Writer writer, int i, Object obj, int i2) {
        if (obj != null) {
            writer.M(i, this.q.b(q(i2)), this.q.e(obj));
        }
    }

    private boolean m(Object obj, Object obj2, int i) {
        int h0 = h0(i);
        long Q = Q(h0);
        switch (g0(h0)) {
            case 0:
                if (j(obj, obj2, i) && Double.doubleToLongBits(a1.v(obj, Q)) == Double.doubleToLongBits(a1.v(obj2, Q))) {
                    break;
                }
                break;
            case 1:
                if (j(obj, obj2, i) && Float.floatToIntBits(a1.w(obj, Q)) == Float.floatToIntBits(a1.w(obj2, Q))) {
                    break;
                }
                break;
            case 2:
                if (j(obj, obj2, i) && a1.y(obj, Q) == a1.y(obj2, Q)) {
                    break;
                }
                break;
            case 3:
                if (j(obj, obj2, i) && a1.y(obj, Q) == a1.y(obj2, Q)) {
                    break;
                }
                break;
            case 4:
                if (j(obj, obj2, i) && a1.x(obj, Q) == a1.x(obj2, Q)) {
                    break;
                }
                break;
            case 5:
                if (j(obj, obj2, i) && a1.y(obj, Q) == a1.y(obj2, Q)) {
                    break;
                }
                break;
            case 6:
                if (j(obj, obj2, i) && a1.x(obj, Q) == a1.x(obj2, Q)) {
                    break;
                }
                break;
            case 7:
                if (j(obj, obj2, i) && a1.p(obj, Q) == a1.p(obj2, Q)) {
                    break;
                }
                break;
            case 8:
                if (j(obj, obj2, i) && t0.J(a1.A(obj, Q), a1.A(obj2, Q))) {
                    break;
                }
                break;
            case 9:
                if (j(obj, obj2, i) && t0.J(a1.A(obj, Q), a1.A(obj2, Q))) {
                    break;
                }
                break;
            case 10:
                if (j(obj, obj2, i) && t0.J(a1.A(obj, Q), a1.A(obj2, Q))) {
                    break;
                }
                break;
            case 11:
                if (j(obj, obj2, i) && a1.x(obj, Q) == a1.x(obj2, Q)) {
                    break;
                }
                break;
            case 12:
                if (j(obj, obj2, i) && a1.x(obj, Q) == a1.x(obj2, Q)) {
                    break;
                }
                break;
            case 13:
                if (j(obj, obj2, i) && a1.x(obj, Q) == a1.x(obj2, Q)) {
                    break;
                }
                break;
            case 14:
                if (j(obj, obj2, i) && a1.y(obj, Q) == a1.y(obj2, Q)) {
                    break;
                }
                break;
            case 15:
                if (j(obj, obj2, i) && a1.x(obj, Q) == a1.x(obj2, Q)) {
                    break;
                }
                break;
            case 16:
                if (j(obj, obj2, i) && a1.y(obj, Q) == a1.y(obj2, Q)) {
                    break;
                }
                break;
            case 17:
                if (j(obj, obj2, i) && t0.J(a1.A(obj, Q), a1.A(obj2, Q))) {
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
                if (C(obj, obj2, i) && t0.J(a1.A(obj, Q), a1.A(obj2, Q))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void m0(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.e(i, (String) obj);
        } else {
            writer.K(i, (ByteString) obj);
        }
    }

    private final Object n(Object obj, int i, Object obj2, x0 x0Var) {
        P(i);
        if (a1.A(obj, Q(h0(i))) == null) {
            return obj2;
        }
        p(i);
        return obj2;
    }

    private void n0(x0 x0Var, Object obj, Writer writer) {
        x0Var.t(x0Var.g(obj), writer);
    }

    private static float o(Object obj, long j) {
        return a1.w(obj, j);
    }

    private t.a p(int i) {
        lh4.a(this.b[((i / 3) * 2) + 1]);
        return null;
    }

    private Object q(int i) {
        return this.b[(i / 3) * 2];
    }

    private r0 r(int i) {
        int i2 = (i / 3) * 2;
        r0 r0Var = (r0) this.b[i2];
        if (r0Var != null) {
            return r0Var;
        }
        r0 c = n0.a().c((Class) this.b[i2 + 1]);
        this.b[i2] = c;
        return c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int s(Object obj) {
        int i;
        int i2;
        int h;
        int c;
        int F;
        boolean z;
        int f;
        int i3;
        int P;
        int R;
        Unsafe unsafe = s;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.a.length) {
            int h0 = h0(i5);
            int P2 = P(i5);
            int g0 = g0(h0);
            if (g0 <= 17) {
                i = this.a[i5 + 2];
                int i8 = 1048575 & i;
                int i9 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i2 = i9;
            } else {
                i = (!this.i || g0 < FieldType.DOUBLE_LIST_PACKED.id() || g0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.a[i5 + 2] & 1048575;
                i2 = 0;
            }
            long Q = Q(h0);
            int i10 = i4;
            switch (g0) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.h(P2, 0.0d);
                        i6 += h;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.p(P2, 0.0f);
                        i6 += h;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.w(P2, unsafe.getLong(obj, Q));
                        i6 += h;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.S(P2, unsafe.getLong(obj, Q));
                        i6 += h;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.u(P2, unsafe.getInt(obj, Q));
                        i6 += h;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        h = CodedOutputStream.n(P2, 0L);
                        i6 += h;
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        h = CodedOutputStream.l(P2, 0);
                        i6 += h;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        c = CodedOutputStream.c(P2, true);
                        i6 += c;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(obj, Q);
                        c = object instanceof ByteString ? CodedOutputStream.f(P2, (ByteString) object) : CodedOutputStream.N(P2, (String) object);
                        i6 += c;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        c = t0.o(P2, unsafe.getObject(obj, Q), r(i5));
                        i6 += c;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        c = CodedOutputStream.f(P2, (ByteString) unsafe.getObject(obj, Q));
                        i6 += c;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        c = CodedOutputStream.Q(P2, unsafe.getInt(obj, Q));
                        i6 += c;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        c = CodedOutputStream.j(P2, unsafe.getInt(obj, Q));
                        i6 += c;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        F = CodedOutputStream.F(P2, 0);
                        i6 += F;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        c = CodedOutputStream.H(P2, 0L);
                        i6 += c;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        c = CodedOutputStream.J(P2, unsafe.getInt(obj, Q));
                        i6 += c;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        c = CodedOutputStream.L(P2, unsafe.getLong(obj, Q));
                        i6 += c;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        c = CodedOutputStream.r(P2, (f0) unsafe.getObject(obj, Q), r(i5));
                        i6 += c;
                    }
                    break;
                case 18:
                    c = t0.h(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += c;
                    break;
                case 19:
                    z = false;
                    f = t0.f(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case 20:
                    z = false;
                    f = t0.m(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case 21:
                    z = false;
                    f = t0.x(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case 22:
                    z = false;
                    f = t0.k(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case 23:
                    z = false;
                    f = t0.h(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case 24:
                    z = false;
                    f = t0.f(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case EventType.SUBS /* 25 */:
                    z = false;
                    f = t0.a(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case EventType.CDN /* 26 */:
                    c = t0.u(P2, (List) unsafe.getObject(obj, Q));
                    i6 += c;
                    break;
                case 27:
                    c = t0.p(P2, (List) unsafe.getObject(obj, Q), r(i5));
                    i6 += c;
                    break;
                case 28:
                    c = t0.c(P2, (List) unsafe.getObject(obj, Q));
                    i6 += c;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    c = t0.v(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += c;
                    break;
                case 30:
                    z = false;
                    f = t0.d(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case 31:
                    z = false;
                    f = t0.f(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case 32:
                    z = false;
                    f = t0.h(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case 33:
                    z = false;
                    f = t0.q(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case 34:
                    z = false;
                    f = t0.s(P2, (List) unsafe.getObject(obj, Q), false);
                    i6 += f;
                    break;
                case 35:
                    i3 = t0.i((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 36:
                    i3 = t0.g((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 37:
                    i3 = t0.n((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 38:
                    i3 = t0.y((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 39:
                    i3 = t0.l((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 40:
                    i3 = t0.i((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 41:
                    i3 = t0.g((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 42:
                    i3 = t0.b((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 43:
                    i3 = t0.w((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 44:
                    i3 = t0.e((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 45:
                    i3 = t0.g((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 46:
                    i3 = t0.i((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 47:
                    i3 = t0.r((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 48:
                    i3 = t0.t((List) unsafe.getObject(obj, Q));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(obj, i, i3);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i3);
                        F = P + R + i3;
                        i6 += F;
                    }
                    break;
                case 49:
                    c = t0.j(P2, (List) unsafe.getObject(obj, Q), r(i5));
                    i6 += c;
                    break;
                case 50:
                    c = this.q.g(P2, unsafe.getObject(obj, Q), q(i5));
                    i6 += c;
                    break;
                case 51:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.h(P2, 0.0d);
                        i6 += c;
                    }
                    break;
                case 52:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.p(P2, 0.0f);
                        i6 += c;
                    }
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.w(P2, V(obj, Q));
                        i6 += c;
                    }
                    break;
                case 54:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.S(P2, V(obj, Q));
                        i6 += c;
                    }
                    break;
                case 55:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.u(P2, U(obj, Q));
                        i6 += c;
                    }
                    break;
                case 56:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.n(P2, 0L);
                        i6 += c;
                    }
                    break;
                case 57:
                    if (D(obj, P2, i5)) {
                        F = CodedOutputStream.l(P2, 0);
                        i6 += F;
                    }
                    break;
                case 58:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.c(P2, true);
                        i6 += c;
                    }
                    break;
                case 59:
                    if (D(obj, P2, i5)) {
                        Object object2 = unsafe.getObject(obj, Q);
                        c = object2 instanceof ByteString ? CodedOutputStream.f(P2, (ByteString) object2) : CodedOutputStream.N(P2, (String) object2);
                        i6 += c;
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (D(obj, P2, i5)) {
                        c = t0.o(P2, unsafe.getObject(obj, Q), r(i5));
                        i6 += c;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.f(P2, (ByteString) unsafe.getObject(obj, Q));
                        i6 += c;
                    }
                    break;
                case 62:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.Q(P2, U(obj, Q));
                        i6 += c;
                    }
                    break;
                case 63:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.j(P2, U(obj, Q));
                        i6 += c;
                    }
                    break;
                case 64:
                    if (D(obj, P2, i5)) {
                        F = CodedOutputStream.F(P2, 0);
                        i6 += F;
                    }
                    break;
                case 65:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.H(P2, 0L);
                        i6 += c;
                    }
                    break;
                case 66:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.J(P2, U(obj, Q));
                        i6 += c;
                    }
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.L(P2, V(obj, Q));
                        i6 += c;
                    }
                    break;
                case 68:
                    if (D(obj, P2, i5)) {
                        c = CodedOutputStream.r(P2, (f0) unsafe.getObject(obj, Q), r(i5));
                        i6 += c;
                    }
                    break;
            }
            i5 += 3;
            i4 = i10;
        }
        int u = i6 + u(this.o, obj);
        return this.f ? u + this.p.c(obj).h() : u;
    }

    private int t(Object obj) {
        int h;
        int i;
        int P;
        int R;
        Unsafe unsafe = s;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.length; i3 += 3) {
            int h0 = h0(i3);
            int g0 = g0(h0);
            int P2 = P(i3);
            long Q = Q(h0);
            int i4 = (g0 < FieldType.DOUBLE_LIST_PACKED.id() || g0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.a[i3 + 2] & 1048575;
            switch (g0) {
                case 0:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.h(P2, 0.0d);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.p(P2, 0.0f);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.w(P2, a1.y(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.S(P2, a1.y(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.u(P2, a1.x(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.n(P2, 0L);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.l(P2, 0);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.c(P2, true);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (x(obj, i3)) {
                        Object A = a1.A(obj, Q);
                        h = A instanceof ByteString ? CodedOutputStream.f(P2, (ByteString) A) : CodedOutputStream.N(P2, (String) A);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (x(obj, i3)) {
                        h = t0.o(P2, a1.A(obj, Q), r(i3));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.f(P2, (ByteString) a1.A(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.Q(P2, a1.x(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.j(P2, a1.x(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.F(P2, 0);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.H(P2, 0L);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.J(P2, a1.x(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.L(P2, a1.y(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (x(obj, i3)) {
                        h = CodedOutputStream.r(P2, (f0) a1.A(obj, Q), r(i3));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h = t0.h(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 19:
                    h = t0.f(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 20:
                    h = t0.m(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 21:
                    h = t0.x(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 22:
                    h = t0.k(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 23:
                    h = t0.h(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 24:
                    h = t0.f(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case EventType.SUBS /* 25 */:
                    h = t0.a(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case EventType.CDN /* 26 */:
                    h = t0.u(P2, F(obj, Q));
                    i2 += h;
                    break;
                case 27:
                    h = t0.p(P2, F(obj, Q), r(i3));
                    i2 += h;
                    break;
                case 28:
                    h = t0.c(P2, F(obj, Q));
                    i2 += h;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    h = t0.v(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 30:
                    h = t0.d(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 31:
                    h = t0.f(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 32:
                    h = t0.h(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 33:
                    h = t0.q(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 34:
                    h = t0.s(P2, F(obj, Q), false);
                    i2 += h;
                    break;
                case 35:
                    i = t0.i((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 36:
                    i = t0.g((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 37:
                    i = t0.n((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 38:
                    i = t0.y((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 39:
                    i = t0.l((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 40:
                    i = t0.i((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 41:
                    i = t0.g((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 42:
                    i = t0.b((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 43:
                    i = t0.w((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 44:
                    i = t0.e((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 45:
                    i = t0.g((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 46:
                    i = t0.i((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 47:
                    i = t0.r((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 48:
                    i = t0.t((List) unsafe.getObject(obj, Q));
                    if (i <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(obj, i4, i);
                        }
                        P = CodedOutputStream.P(P2);
                        R = CodedOutputStream.R(i);
                        h = P + R + i;
                        i2 += h;
                        break;
                    }
                case 49:
                    h = t0.j(P2, F(obj, Q), r(i3));
                    i2 += h;
                    break;
                case 50:
                    h = this.q.g(P2, a1.A(obj, Q), q(i3));
                    i2 += h;
                    break;
                case 51:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.h(P2, 0.0d);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.p(P2, 0.0f);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.w(P2, V(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.S(P2, V(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.u(P2, U(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.n(P2, 0L);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.l(P2, 0);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.c(P2, true);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (D(obj, P2, i3)) {
                        Object A2 = a1.A(obj, Q);
                        h = A2 instanceof ByteString ? CodedOutputStream.f(P2, (ByteString) A2) : CodedOutputStream.N(P2, (String) A2);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (D(obj, P2, i3)) {
                        h = t0.o(P2, a1.A(obj, Q), r(i3));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.f(P2, (ByteString) a1.A(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.Q(P2, U(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.j(P2, U(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.F(P2, 0);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.H(P2, 0L);
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.J(P2, U(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.L(P2, V(obj, Q));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (D(obj, P2, i3)) {
                        h = CodedOutputStream.r(P2, (f0) a1.A(obj, Q), r(i3));
                        i2 += h;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i2 + u(this.o, obj);
    }

    private int u(x0 x0Var, Object obj) {
        return x0Var.h(x0Var.g(obj));
    }

    private static int v(Object obj, long j) {
        return a1.x(obj, j);
    }

    private static boolean w(int i) {
        return (i & 536870912) != 0;
    }

    private boolean x(Object obj, int i) {
        if (!this.h) {
            int X = X(i);
            return (a1.x(obj, (long) (X & 1048575)) & (1 << (X >>> 20))) != 0;
        }
        int h0 = h0(i);
        long Q = Q(h0);
        switch (g0(h0)) {
            case 0:
                return a1.v(obj, Q) != 0.0d;
            case 1:
                return a1.w(obj, Q) != 0.0f;
            case 2:
                return a1.y(obj, Q) != 0;
            case 3:
                return a1.y(obj, Q) != 0;
            case 4:
                return a1.x(obj, Q) != 0;
            case 5:
                return a1.y(obj, Q) != 0;
            case 6:
                return a1.x(obj, Q) != 0;
            case 7:
                return a1.p(obj, Q);
            case 8:
                Object A = a1.A(obj, Q);
                if (A instanceof String) {
                    return !((String) A).isEmpty();
                }
                if (A instanceof ByteString) {
                    return !ByteString.a.equals(A);
                }
                throw new IllegalArgumentException();
            case 9:
                return a1.A(obj, Q) != null;
            case 10:
                return !ByteString.a.equals(a1.A(obj, Q));
            case 11:
                return a1.x(obj, Q) != 0;
            case 12:
                return a1.x(obj, Q) != 0;
            case 13:
                return a1.x(obj, Q) != 0;
            case 14:
                return a1.y(obj, Q) != 0;
            case 15:
                return a1.x(obj, Q) != 0;
            case 16:
                return a1.y(obj, Q) != 0;
            case 17:
                return a1.A(obj, Q) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean y(Object obj, int i, int i2, int i3) {
        return this.h ? x(obj, i) : (i2 & i3) != 0;
    }

    private static boolean z(Object obj, int i, r0 r0Var) {
        return r0Var.c(a1.A(obj, Q(i)));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            L(obj, obj2, i);
        }
        if (this.h) {
            return;
        }
        t0.F(this.o, obj, obj2);
        if (this.f) {
            t0.D(this.p, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void b(Object obj) {
        int i;
        int i2 = this.k;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long Q = Q(h0(this.j[i2]));
            Object A = a1.A(obj, Q);
            if (A != null) {
                a1.O(obj, Q, this.q.f(A));
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

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(Object obj) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.k; i4++) {
            int i5 = this.j[i4];
            int P = P(i5);
            int h0 = h0(i5);
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
            if (E(h0) && !y(obj, i5, i3, i)) {
                return false;
            }
            int g0 = g0(h0);
            if (g0 != 9 && g0 != 17) {
                if (g0 != 27) {
                    if (g0 == 60 || g0 == 68) {
                        if (D(obj, P, i5) && !z(obj, h0, r(i5))) {
                            return false;
                        }
                    } else if (g0 != 49) {
                        if (g0 == 50 && !B(obj, h0, i5)) {
                            return false;
                        }
                    }
                }
                if (!A(obj, h0, i5)) {
                    return false;
                }
            } else if (y(obj, i5, i3, i) && !z(obj, h0, r(i5))) {
                return false;
            }
        }
        return !this.f || this.p.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public int d(Object obj) {
        return this.h ? t(obj) : s(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public Object e() {
        return this.m.a(this.e);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public int f(Object obj) {
        int i;
        int f;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int h0 = h0(i3);
            int P = P(i3);
            long Q = Q(h0);
            int i4 = 37;
            switch (g0(h0)) {
                case 0:
                    i = i2 * 53;
                    f = t.f(Double.doubleToLongBits(a1.v(obj, Q)));
                    i2 = i + f;
                    break;
                case 1:
                    i = i2 * 53;
                    f = Float.floatToIntBits(a1.w(obj, Q));
                    i2 = i + f;
                    break;
                case 2:
                    i = i2 * 53;
                    f = t.f(a1.y(obj, Q));
                    i2 = i + f;
                    break;
                case 3:
                    i = i2 * 53;
                    f = t.f(a1.y(obj, Q));
                    i2 = i + f;
                    break;
                case 4:
                    i = i2 * 53;
                    f = a1.x(obj, Q);
                    i2 = i + f;
                    break;
                case 5:
                    i = i2 * 53;
                    f = t.f(a1.y(obj, Q));
                    i2 = i + f;
                    break;
                case 6:
                    i = i2 * 53;
                    f = a1.x(obj, Q);
                    i2 = i + f;
                    break;
                case 7:
                    i = i2 * 53;
                    f = t.c(a1.p(obj, Q));
                    i2 = i + f;
                    break;
                case 8:
                    i = i2 * 53;
                    f = ((String) a1.A(obj, Q)).hashCode();
                    i2 = i + f;
                    break;
                case 9:
                    Object A = a1.A(obj, Q);
                    if (A != null) {
                        i4 = A.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    f = a1.A(obj, Q).hashCode();
                    i2 = i + f;
                    break;
                case 11:
                    i = i2 * 53;
                    f = a1.x(obj, Q);
                    i2 = i + f;
                    break;
                case 12:
                    i = i2 * 53;
                    f = a1.x(obj, Q);
                    i2 = i + f;
                    break;
                case 13:
                    i = i2 * 53;
                    f = a1.x(obj, Q);
                    i2 = i + f;
                    break;
                case 14:
                    i = i2 * 53;
                    f = t.f(a1.y(obj, Q));
                    i2 = i + f;
                    break;
                case 15:
                    i = i2 * 53;
                    f = a1.x(obj, Q);
                    i2 = i + f;
                    break;
                case 16:
                    i = i2 * 53;
                    f = t.f(a1.y(obj, Q));
                    i2 = i + f;
                    break;
                case 17:
                    Object A2 = a1.A(obj, Q);
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
                    f = a1.A(obj, Q).hashCode();
                    i2 = i + f;
                    break;
                case 50:
                    i = i2 * 53;
                    f = a1.A(obj, Q).hashCode();
                    i2 = i + f;
                    break;
                case 51:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = t.f(Double.doubleToLongBits(S(obj, Q)));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = Float.floatToIntBits(T(obj, Q));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = t.f(V(obj, Q));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = t.f(V(obj, Q));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = U(obj, Q);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = t.f(V(obj, Q));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = U(obj, Q);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = t.c(R(obj, Q));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = ((String) a1.A(obj, Q)).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = a1.A(obj, Q).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = a1.A(obj, Q).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = U(obj, Q);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = U(obj, Q);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = U(obj, Q);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = t.f(V(obj, Q));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = U(obj, Q);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = t.f(V(obj, Q));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (D(obj, P, i3)) {
                        i = i2 * 53;
                        f = a1.A(obj, Q).hashCode();
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

    @Override // androidx.datastore.preferences.protobuf.r0
    public boolean g(Object obj, Object obj2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m(obj, obj2, i)) {
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

    @Override // androidx.datastore.preferences.protobuf.r0
    public void h(Object obj, q0 q0Var, l lVar) {
        lVar.getClass();
        H(this.o, this.p, obj, q0Var, lVar);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void i(Object obj, Writer writer) {
        if (writer.t() == Writer.FieldOrder.DESCENDING) {
            k0(obj, writer);
        } else if (this.h) {
            j0(obj, writer);
        } else {
            i0(obj, writer);
        }
    }
}
