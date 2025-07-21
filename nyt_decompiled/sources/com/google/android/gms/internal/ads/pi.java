package com.google.android.gms.internal.ads;

import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.lh4;
import defpackage.o0f;
import defpackage.o1f;
import defpackage.w1f;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class pi implements bj {
    private static final int[] p = new int[0];
    private static final Unsafe q = mj.q();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final w1f e;
    private final boolean f;
    private final boolean g;
    private final int[] h;
    private final int i;
    private final int j;
    private final fi k;
    private final fj l;
    private final qh m;
    private final ri n;
    private final ki o;

    private pi(int[] iArr, Object[] objArr, int i, int i2, w1f w1fVar, int i3, boolean z, int[] iArr2, int i4, int i5, ri riVar, fi fiVar, fj fjVar, qh qhVar, ki kiVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = w1fVar instanceof yh;
        boolean z2 = false;
        if (qhVar != null && qhVar.h(w1fVar)) {
            z2 = true;
        }
        this.f = z2;
        this.h = iArr2;
        this.i = i4;
        this.j = i5;
        this.n = riVar;
        this.k = fiVar;
        this.l = fjVar;
        this.m = qhVar;
        this.e = w1fVar;
        this.o = kiVar;
    }

    static gj A(Object obj) {
        yh yhVar = (yh) obj;
        gj gjVar = yhVar.zzc;
        if (gjVar != gj.c()) {
            return gjVar;
        }
        gj f = gj.f();
        yhVar.zzc = f;
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.ads.pi B(java.lang.Class r33, com.google.android.gms.internal.ads.mi r34, com.google.android.gms.internal.ads.ri r35, com.google.android.gms.internal.ads.fi r36, com.google.android.gms.internal.ads.fj r37, com.google.android.gms.internal.ads.qh r38, com.google.android.gms.internal.ads.ki r39) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pi.B(java.lang.Class, com.google.android.gms.internal.ads.mi, com.google.android.gms.internal.ads.ri, com.google.android.gms.internal.ads.fi, com.google.android.gms.internal.ads.fj, com.google.android.gms.internal.ads.qh, com.google.android.gms.internal.ads.ki):com.google.android.gms.internal.ads.pi");
    }

    private static double C(Object obj, long j) {
        return ((Double) mj.p(obj, j)).doubleValue();
    }

    private static float D(Object obj, long j) {
        return ((Float) mj.p(obj, j)).floatValue();
    }

    private static int E(Object obj, long j) {
        return ((Integer) mj.p(obj, j)).intValue();
    }

    private final int F(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return H(i, 0);
    }

    private final int G(int i) {
        return this.a[i + 2];
    }

    private final int H(int i, int i2) {
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

    private static int I(int i) {
        return (i >>> 20) & 255;
    }

    private final int J(int i) {
        return this.a[i + 1];
    }

    private static long K(Object obj, long j) {
        return ((Long) mj.p(obj, j)).longValue();
    }

    private final o0f L(int i) {
        int i2 = i / 3;
        return (o0f) this.b[i2 + i2 + 1];
    }

    private final bj M(int i) {
        Object[] objArr = this.b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        bj bjVar = (bj) objArr[i3];
        if (bjVar != null) {
            return bjVar;
        }
        bj b = ui.a().b((Class) objArr[i3 + 1]);
        this.b[i3] = b;
        return b;
    }

    private final Object N(Object obj, int i, Object obj2, fj fjVar, Object obj3) {
        int i2 = this.a[i];
        Object p2 = mj.p(obj, J(i) & 1048575);
        if (p2 == null || L(i) == null) {
            return obj2;
        }
        lh4.a(O(i));
        throw null;
    }

    private final Object O(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    private final Object f(Object obj, int i) {
        bj M = M(i);
        int J = J(i) & 1048575;
        if (!s(obj, i)) {
            return M.zze();
        }
        Object object = q.getObject(obj, J);
        if (v(object)) {
            return object;
        }
        Object zze = M.zze();
        if (object != null) {
            M.zzg(zze, object);
        }
        return zze;
    }

    private final Object g(Object obj, int i, int i2) {
        bj M = M(i2);
        if (!w(obj, i, i2)) {
            return M.zze();
        }
        Object object = q.getObject(obj, J(i2) & 1048575);
        if (v(object)) {
            return object;
        }
        Object zze = M.zze();
        if (object != null) {
            M.zzg(zze, object);
        }
        return zze;
    }

    private static Field h(Class cls, String str) {
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

    private static void i(Object obj) {
        if (!v(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void j(Object obj, Object obj2, int i) {
        if (s(obj2, i)) {
            int J = J(i) & 1048575;
            Unsafe unsafe = q;
            long j = J;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            bj M = M(i);
            if (!s(obj, i)) {
                if (v(object)) {
                    Object zze = M.zze();
                    M.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!v(object2)) {
                Object zze2 = M.zze();
                M.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            M.zzg(object2, object);
        }
    }

    private final void k(Object obj, Object obj2, int i) {
        int i2 = this.a[i];
        if (w(obj2, i2, i)) {
            int J = J(i) & 1048575;
            Unsafe unsafe = q;
            long j = J;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            bj M = M(i);
            if (!w(obj, i2, i)) {
                if (v(object)) {
                    Object zze = M.zze();
                    M.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                n(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!v(object2)) {
                Object zze2 = M.zze();
                M.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            M.zzg(object2, object);
        }
    }

    private final void l(Object obj, int i, xi xiVar) {
        long j = i & 1048575;
        if (r(i)) {
            mj.D(obj, j, xiVar.zzs());
        } else if (this.g) {
            mj.D(obj, j, xiVar.zzr());
        } else {
            mj.D(obj, j, xiVar.zzp());
        }
    }

    private final void m(Object obj, int i) {
        int G = G(i);
        long j = 1048575 & G;
        if (j == 1048575) {
            return;
        }
        mj.B(obj, j, (1 << (G >>> 20)) | mj.l(obj, j));
    }

    private final void n(Object obj, int i, int i2) {
        mj.B(obj, G(i2) & 1048575, i);
    }

    private final void o(Object obj, int i, Object obj2) {
        q.putObject(obj, J(i) & 1048575, obj2);
        m(obj, i);
    }

    private final void p(Object obj, int i, int i2, Object obj2) {
        q.putObject(obj, J(i2) & 1048575, obj2);
        n(obj, i, i2);
    }

    private final boolean q(Object obj, Object obj2, int i) {
        return s(obj, i) == s(obj2, i);
    }

    private static boolean r(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean s(Object obj, int i) {
        int G = G(i);
        long j = G & 1048575;
        if (j != 1048575) {
            return ((1 << (G >>> 20)) & mj.l(obj, j)) != 0;
        }
        int J = J(i);
        long j2 = J & 1048575;
        switch (I(J)) {
            case 0:
                return Double.doubleToRawLongBits(mj.j(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(mj.k(obj, j2)) != 0;
            case 2:
                return mj.n(obj, j2) != 0;
            case 3:
                return mj.n(obj, j2) != 0;
            case 4:
                return mj.l(obj, j2) != 0;
            case 5:
                return mj.n(obj, j2) != 0;
            case 6:
                return mj.l(obj, j2) != 0;
            case 7:
                return mj.H(obj, j2);
            case 8:
                Object p2 = mj.p(obj, j2);
                if (p2 instanceof String) {
                    return !((String) p2).isEmpty();
                }
                if (p2 instanceof zzgyl) {
                    return !zzgyl.a.equals(p2);
                }
                throw new IllegalArgumentException();
            case 9:
                return mj.p(obj, j2) != null;
            case 10:
                return !zzgyl.a.equals(mj.p(obj, j2));
            case 11:
                return mj.l(obj, j2) != 0;
            case 12:
                return mj.l(obj, j2) != 0;
            case 13:
                return mj.l(obj, j2) != 0;
            case 14:
                return mj.n(obj, j2) != 0;
            case 15:
                return mj.l(obj, j2) != 0;
            case 16:
                return mj.n(obj, j2) != 0;
            case 17:
                return mj.p(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean t(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? s(obj, i) : (i3 & i4) != 0;
    }

    private static boolean u(Object obj, int i, bj bjVar) {
        return bjVar.b(mj.p(obj, i & 1048575));
    }

    private static boolean v(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof yh) {
            return ((yh) obj).G();
        }
        return true;
    }

    private final boolean w(Object obj, int i, int i2) {
        return mj.l(obj, (long) (G(i2) & 1048575)) == i;
    }

    private static boolean x(Object obj, long j) {
        return ((Boolean) mj.p(obj, j)).booleanValue();
    }

    private static final void y(int i, Object obj, mh mhVar) {
        if (obj instanceof String) {
            mhVar.f(i, (String) obj);
        } else {
            mhVar.o(i, (zzgyl) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final boolean a(Object obj, Object obj2) {
        boolean z;
        for (int i = 0; i < this.a.length; i += 3) {
            int J = J(i);
            long j = J & 1048575;
            switch (I(J)) {
                case 0:
                    if (q(obj, obj2, i) && Double.doubleToLongBits(mj.j(obj, j)) == Double.doubleToLongBits(mj.j(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (q(obj, obj2, i) && Float.floatToIntBits(mj.k(obj, j)) == Float.floatToIntBits(mj.k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (q(obj, obj2, i) && mj.n(obj, j) == mj.n(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (q(obj, obj2, i) && mj.n(obj, j) == mj.n(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (q(obj, obj2, i) && mj.l(obj, j) == mj.l(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (q(obj, obj2, i) && mj.n(obj, j) == mj.n(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (q(obj, obj2, i) && mj.l(obj, j) == mj.l(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (q(obj, obj2, i) && mj.H(obj, j) == mj.H(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (q(obj, obj2, i) && dj.z(mj.p(obj, j), mj.p(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (q(obj, obj2, i) && dj.z(mj.p(obj, j), mj.p(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (q(obj, obj2, i) && dj.z(mj.p(obj, j), mj.p(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (q(obj, obj2, i) && mj.l(obj, j) == mj.l(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (q(obj, obj2, i) && mj.l(obj, j) == mj.l(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (q(obj, obj2, i) && mj.l(obj, j) == mj.l(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (q(obj, obj2, i) && mj.n(obj, j) == mj.n(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (q(obj, obj2, i) && mj.l(obj, j) == mj.l(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (q(obj, obj2, i) && mj.n(obj, j) == mj.n(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (q(obj, obj2, i) && dj.z(mj.p(obj, j), mj.p(obj2, j))) {
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
                    z = dj.z(mj.p(obj, j), mj.p(obj2, j));
                    break;
                case 50:
                    z = dj.z(mj.p(obj, j), mj.p(obj2, j));
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
                    long G = G(i) & 1048575;
                    if (mj.l(obj, G) == mj.l(obj2, G) && dj.z(mj.p(obj, j), mj.p(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!this.l.d(obj).equals(this.l.d(obj2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.m.a(obj);
        this.m.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.i) {
            int[] iArr = this.h;
            int[] iArr2 = this.a;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int J = J(i6);
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
            if ((268435456 & J) != 0 && !t(obj, i6, i, i2, i10)) {
                return false;
            }
            int I = I(J);
            if (I != 9 && I != 17) {
                if (I != 27) {
                    if (I == 60 || I == 68) {
                        if (w(obj, i7, i6) && !u(obj, J, M(i6))) {
                            return false;
                        }
                    } else if (I != 49) {
                        if (I == 50 && !((zzhay) mj.p(obj, J & 1048575)).isEmpty()) {
                            lh4.a(O(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) mj.p(obj, J & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    bj M = M(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!M.b(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (t(obj, i6, i, i2, i10) && !u(obj, J, M(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (!this.f) {
            return true;
        }
        this.m.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void c(Object obj, byte[] bArr, int i, int i2, vg vgVar) {
        z(obj, bArr, i, i2, 0, vgVar);
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void d(Object obj, xi xiVar, ph phVar) {
        Object obj2;
        phVar.getClass();
        i(obj);
        fj fjVar = this.l;
        qh qhVar = this.m;
        Object obj3 = null;
        while (true) {
            try {
                int zzc = xiVar.zzc();
                int F = F(zzc);
                if (F >= 0) {
                    int J = J(F);
                    try {
                    } catch (zzhaf unused) {
                        fjVar.q(xiVar);
                        if (obj3 == null) {
                            obj3 = fjVar.c(obj);
                        }
                        if (!fjVar.p(obj3, xiVar)) {
                            obj2 = obj3;
                            for (int i = this.i; i < this.j; i++) {
                                obj2 = N(obj, this.h[i], obj2, fjVar, obj);
                            }
                        }
                    }
                    switch (I(J)) {
                        case 0:
                            mj.z(obj, J & 1048575, xiVar.zza());
                            m(obj, F);
                        case 1:
                            mj.A(obj, J & 1048575, xiVar.zzb());
                            m(obj, F);
                        case 2:
                            mj.C(obj, J & 1048575, xiVar.zzl());
                            m(obj, F);
                        case 3:
                            mj.C(obj, J & 1048575, xiVar.zzo());
                            m(obj, F);
                        case 4:
                            mj.B(obj, J & 1048575, xiVar.zzg());
                            m(obj, F);
                        case 5:
                            mj.C(obj, J & 1048575, xiVar.zzk());
                            m(obj, F);
                        case 6:
                            mj.B(obj, J & 1048575, xiVar.zzf());
                            m(obj, F);
                        case 7:
                            mj.x(obj, J & 1048575, xiVar.zzN());
                            m(obj, F);
                        case 8:
                            l(obj, J, xiVar);
                            m(obj, F);
                        case 9:
                            w1f w1fVar = (w1f) f(obj, F);
                            xiVar.a(w1fVar, M(F), phVar);
                            o(obj, F, w1fVar);
                        case 10:
                            mj.D(obj, J & 1048575, xiVar.zzp());
                            m(obj, F);
                        case 11:
                            mj.B(obj, J & 1048575, xiVar.zzj());
                            m(obj, F);
                        case 12:
                            int zze = xiVar.zze();
                            o0f L = L(F);
                            if (L != null && !L.zza(zze)) {
                                obj3 = dj.w(obj, zzc, zze, obj3, fjVar);
                            }
                            mj.B(obj, J & 1048575, zze);
                            m(obj, F);
                            break;
                        case 13:
                            mj.B(obj, J & 1048575, xiVar.zzh());
                            m(obj, F);
                        case 14:
                            mj.C(obj, J & 1048575, xiVar.zzm());
                            m(obj, F);
                        case 15:
                            mj.B(obj, J & 1048575, xiVar.zzi());
                            m(obj, F);
                        case 16:
                            mj.C(obj, J & 1048575, xiVar.zzn());
                            m(obj, F);
                        case 17:
                            w1f w1fVar2 = (w1f) f(obj, F);
                            xiVar.d(w1fVar2, M(F), phVar);
                            o(obj, F, w1fVar2);
                        case 18:
                            xiVar.zzx(this.k.a(obj, J & 1048575));
                        case 19:
                            xiVar.zzB(this.k.a(obj, J & 1048575));
                        case 20:
                            xiVar.zzE(this.k.a(obj, J & 1048575));
                        case 21:
                            xiVar.zzM(this.k.a(obj, J & 1048575));
                        case 22:
                            xiVar.zzD(this.k.a(obj, J & 1048575));
                        case 23:
                            xiVar.zzA(this.k.a(obj, J & 1048575));
                        case 24:
                            xiVar.zzz(this.k.a(obj, J & 1048575));
                        case EventType.SUBS /* 25 */:
                            xiVar.zzv(this.k.a(obj, J & 1048575));
                        case EventType.CDN /* 26 */:
                            if (r(J)) {
                                ((hh) xiVar).e(this.k.a(obj, J & 1048575), true);
                            } else {
                                ((hh) xiVar).e(this.k.a(obj, J & 1048575), false);
                            }
                        case 27:
                            xiVar.b(this.k.a(obj, J & 1048575), M(F), phVar);
                        case 28:
                            xiVar.zzw(this.k.a(obj, J & 1048575));
                        case BuildConfig.VERSION_CODE /* 29 */:
                            xiVar.zzL(this.k.a(obj, J & 1048575));
                        case 30:
                            List a = this.k.a(obj, J & 1048575);
                            xiVar.zzy(a);
                            obj3 = dj.v(obj, zzc, a, L(F), obj3, fjVar);
                        case 31:
                            xiVar.zzG(this.k.a(obj, J & 1048575));
                        case 32:
                            xiVar.zzH(this.k.a(obj, J & 1048575));
                        case 33:
                            xiVar.zzI(this.k.a(obj, J & 1048575));
                        case 34:
                            xiVar.zzJ(this.k.a(obj, J & 1048575));
                        case 35:
                            xiVar.zzx(this.k.a(obj, J & 1048575));
                        case 36:
                            xiVar.zzB(this.k.a(obj, J & 1048575));
                        case 37:
                            xiVar.zzE(this.k.a(obj, J & 1048575));
                        case 38:
                            xiVar.zzM(this.k.a(obj, J & 1048575));
                        case 39:
                            xiVar.zzD(this.k.a(obj, J & 1048575));
                        case 40:
                            xiVar.zzA(this.k.a(obj, J & 1048575));
                        case 41:
                            xiVar.zzz(this.k.a(obj, J & 1048575));
                        case 42:
                            xiVar.zzv(this.k.a(obj, J & 1048575));
                        case 43:
                            xiVar.zzL(this.k.a(obj, J & 1048575));
                        case 44:
                            List a2 = this.k.a(obj, J & 1048575);
                            xiVar.zzy(a2);
                            obj3 = dj.v(obj, zzc, a2, L(F), obj3, fjVar);
                        case 45:
                            xiVar.zzG(this.k.a(obj, J & 1048575));
                        case 46:
                            xiVar.zzH(this.k.a(obj, J & 1048575));
                        case 47:
                            xiVar.zzI(this.k.a(obj, J & 1048575));
                        case 48:
                            xiVar.zzJ(this.k.a(obj, J & 1048575));
                        case 49:
                            xiVar.c(this.k.a(obj, J & 1048575), M(F), phVar);
                        case 50:
                            Object O = O(F);
                            long J2 = J(F) & 1048575;
                            Object p2 = mj.p(obj, J2);
                            if (p2 == null) {
                                p2 = zzhay.a().c();
                                mj.D(obj, J2, p2);
                            } else if (ki.a(p2)) {
                                Object c = zzhay.a().c();
                                ki.b(c, p2);
                                mj.D(obj, J2, c);
                                p2 = c;
                            }
                            lh4.a(O);
                            throw null;
                            break;
                        case 51:
                            mj.D(obj, J & 1048575, Double.valueOf(xiVar.zza()));
                            n(obj, zzc, F);
                        case 52:
                            mj.D(obj, J & 1048575, Float.valueOf(xiVar.zzb()));
                            n(obj, zzc, F);
                        case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                            mj.D(obj, J & 1048575, Long.valueOf(xiVar.zzl()));
                            n(obj, zzc, F);
                        case 54:
                            mj.D(obj, J & 1048575, Long.valueOf(xiVar.zzo()));
                            n(obj, zzc, F);
                        case 55:
                            mj.D(obj, J & 1048575, Integer.valueOf(xiVar.zzg()));
                            n(obj, zzc, F);
                        case 56:
                            mj.D(obj, J & 1048575, Long.valueOf(xiVar.zzk()));
                            n(obj, zzc, F);
                        case 57:
                            mj.D(obj, J & 1048575, Integer.valueOf(xiVar.zzf()));
                            n(obj, zzc, F);
                        case 58:
                            mj.D(obj, J & 1048575, Boolean.valueOf(xiVar.zzN()));
                            n(obj, zzc, F);
                        case 59:
                            l(obj, J, xiVar);
                            n(obj, zzc, F);
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            w1f w1fVar3 = (w1f) g(obj, zzc, F);
                            xiVar.a(w1fVar3, M(F), phVar);
                            p(obj, zzc, F, w1fVar3);
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            mj.D(obj, J & 1048575, xiVar.zzp());
                            n(obj, zzc, F);
                        case 62:
                            mj.D(obj, J & 1048575, Integer.valueOf(xiVar.zzj()));
                            n(obj, zzc, F);
                        case 63:
                            int zze2 = xiVar.zze();
                            o0f L2 = L(F);
                            if (L2 != null && !L2.zza(zze2)) {
                                obj3 = dj.w(obj, zzc, zze2, obj3, fjVar);
                            }
                            mj.D(obj, J & 1048575, Integer.valueOf(zze2));
                            n(obj, zzc, F);
                            break;
                        case 64:
                            mj.D(obj, J & 1048575, Integer.valueOf(xiVar.zzh()));
                            n(obj, zzc, F);
                        case 65:
                            mj.D(obj, J & 1048575, Long.valueOf(xiVar.zzm()));
                            n(obj, zzc, F);
                        case 66:
                            mj.D(obj, J & 1048575, Integer.valueOf(xiVar.zzi()));
                            n(obj, zzc, F);
                        case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                            mj.D(obj, J & 1048575, Long.valueOf(xiVar.zzn()));
                            n(obj, zzc, F);
                        case 68:
                            w1f w1fVar4 = (w1f) g(obj, zzc, F);
                            xiVar.d(w1fVar4, M(F), phVar);
                            p(obj, zzc, F, w1fVar4);
                        default:
                            if (obj3 == null) {
                                obj3 = fjVar.c(obj);
                            }
                            if (!fjVar.p(obj3, xiVar)) {
                                obj2 = obj3;
                                for (int i2 = this.i; i2 < this.j; i2++) {
                                    obj2 = N(obj, this.h[i2], obj2, fjVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    obj2 = obj3;
                    for (int i3 = this.i; i3 < this.j; i3++) {
                        obj2 = N(obj, this.h[i3], obj2, fjVar, obj);
                    }
                } else {
                    Object c2 = !this.f ? null : qhVar.c(phVar, this.e, zzc);
                    if (c2 != null) {
                        qhVar.b(obj);
                        obj3 = qhVar.d(obj, xiVar, c2, phVar, null, obj3, fjVar);
                    } else {
                        fjVar.q(xiVar);
                        if (obj3 == null) {
                            obj3 = fjVar.c(obj);
                        }
                        if (!fjVar.p(obj3, xiVar)) {
                            obj2 = obj3;
                            for (int i4 = this.i; i4 < this.j; i4++) {
                                obj2 = N(obj, this.h[i4], obj2, fjVar, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Object obj4 = obj3;
                for (int i5 = this.i; i5 < this.j; i5++) {
                    obj4 = N(obj, this.h[i5], obj4, fjVar, obj);
                }
                if (obj4 != null) {
                    fjVar.n(obj, obj4);
                }
                throw th;
            }
        }
        if (obj2 != null) {
            fjVar.n(obj, obj2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.ads.bj
    public final void e(Object obj, mh mhVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        ?? r9 = 1;
        Throwable th = null;
        if (this.f) {
            this.m.a(obj);
            throw null;
        }
        int[] iArr = this.a;
        Unsafe unsafe = q;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < iArr.length) {
            int J = J(i7);
            int[] iArr2 = this.a;
            int I = I(J);
            int i8 = iArr2[i7];
            if (I <= 17) {
                int i9 = iArr2[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = r9 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = J & i4;
            switch (I) {
                case 0:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.q(i8, mj.j(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 1:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.z(i8, mj.k(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 2:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.E(i8, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 3:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.j(i8, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 4:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.C(i8, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 5:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.x(i8, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 6:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.v(i8, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 7:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.m(i8, mj.H(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 8:
                    if (t(obj, i7, i, i2, i3)) {
                        y(i8, unsafe.getObject(obj, j), mhVar);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 9:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.G(i8, unsafe.getObject(obj, j), M(i7));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 10:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.o(i8, (zzgyl) unsafe.getObject(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 11:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.h(i8, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 12:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.t(i8, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 13:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.H(i8, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 14:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.J(i8, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 15:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.a(i8, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 16:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.c(i8, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 17:
                    if (t(obj, i7, i, i2, i3)) {
                        mhVar.B(i8, unsafe.getObject(obj, j), M(i7));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 18:
                    z = false;
                    dj.B(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 19:
                    z = false;
                    dj.F(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 20:
                    z = false;
                    dj.a(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 21:
                    z = false;
                    dj.g(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 22:
                    z = false;
                    dj.G(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 23:
                    z = false;
                    dj.E(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 24:
                    z = false;
                    dj.D(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case EventType.SUBS /* 25 */:
                    z = false;
                    dj.A(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case EventType.CDN /* 26 */:
                    int i11 = this.a[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = dj.d;
                    if (list != null && !list.isEmpty()) {
                        mhVar.g(i11, list);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                    break;
                case 27:
                    int i13 = this.a[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    bj M = M(i7);
                    int i14 = dj.d;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15 += r9) {
                            mhVar.G(i13, list2.get(i15), M);
                        }
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                    break;
                case 28:
                    int i16 = this.a[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = dj.d;
                    if (list3 != null && !list3.isEmpty()) {
                        mhVar.p(i16, list3);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    z = false;
                    dj.f(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 30:
                    z = false;
                    dj.C(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 31:
                    z = false;
                    dj.b(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 32:
                    z = false;
                    dj.c(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 33:
                    z = false;
                    dj.d(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 34:
                    z = false;
                    dj.e(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, false);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 35:
                    dj.B(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 36:
                    dj.F(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 37:
                    dj.a(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 38:
                    dj.g(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 39:
                    dj.G(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 40:
                    dj.E(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 41:
                    dj.D(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 42:
                    dj.A(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 43:
                    dj.f(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 44:
                    dj.C(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 45:
                    dj.b(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 46:
                    dj.c(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 47:
                    dj.d(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 48:
                    dj.e(this.a[i7], (List) unsafe.getObject(obj, j), mhVar, r9);
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 49:
                    int i18 = this.a[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    bj M2 = M(i7);
                    int i19 = dj.d;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20 += r9) {
                            mhVar.B(i18, list4.get(i20), M2);
                        }
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        lh4.a(O(i7));
                        throw th;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 51:
                    if (w(obj, i8, i7)) {
                        mhVar.q(i8, C(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 52:
                    if (w(obj, i8, i7)) {
                        mhVar.z(i8, D(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (w(obj, i8, i7)) {
                        mhVar.E(i8, K(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 54:
                    if (w(obj, i8, i7)) {
                        mhVar.j(i8, K(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 55:
                    if (w(obj, i8, i7)) {
                        mhVar.C(i8, E(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 56:
                    if (w(obj, i8, i7)) {
                        mhVar.x(i8, K(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 57:
                    if (w(obj, i8, i7)) {
                        mhVar.v(i8, E(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 58:
                    if (w(obj, i8, i7)) {
                        mhVar.m(i8, x(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 59:
                    if (w(obj, i8, i7)) {
                        y(i8, unsafe.getObject(obj, j), mhVar);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (w(obj, i8, i7)) {
                        mhVar.G(i8, unsafe.getObject(obj, j), M(i7));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (w(obj, i8, i7)) {
                        mhVar.o(i8, (zzgyl) unsafe.getObject(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 62:
                    if (w(obj, i8, i7)) {
                        mhVar.h(i8, E(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 63:
                    if (w(obj, i8, i7)) {
                        mhVar.t(i8, E(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 64:
                    if (w(obj, i8, i7)) {
                        mhVar.H(i8, E(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 65:
                    if (w(obj, i8, i7)) {
                        mhVar.J(i8, K(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 66:
                    if (w(obj, i8, i7)) {
                        mhVar.a(i8, E(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (w(obj, i8, i7)) {
                        mhVar.c(i8, K(obj, j));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 68:
                    if (w(obj, i8, i7)) {
                        mhVar.B(i8, unsafe.getObject(obj, j), M(i7));
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                default:
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
            }
        }
        fj fjVar = this.l;
        fjVar.r(fjVar.d(obj), mhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:383:0x0bc0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0bd1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x08dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x08f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int z(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.ads.vg r38) {
        /*
            Method dump skipped, instructions count: 3322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pi.z(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.vg):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.bj
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int B;
        int B2;
        int B3;
        int b;
        int i5;
        int i6;
        int B4;
        int B5;
        int B6;
        boolean z;
        int k;
        int n;
        int size;
        int s;
        int B7;
        int k2;
        boolean z2;
        int i7;
        int B8;
        int B9;
        int size2;
        int r;
        int B10;
        int i8;
        int l;
        int B11;
        int B12;
        int B13;
        int B14;
        int B15;
        int g;
        int B16;
        Unsafe unsafe = q;
        int i9 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.a.length) {
            int J = J(i12);
            int I = I(J);
            int[] iArr = this.a;
            int i14 = iArr[i12];
            int i15 = iArr[i12 + 2];
            int i16 = i15 & i9;
            if (I <= 17) {
                if (i16 != i10) {
                    i11 = i16 == i9 ? 0 : unsafe.getInt(obj, i16);
                    i10 = i16;
                }
                i3 = 1 << (i15 >>> 20);
                i = i10;
                i2 = i11;
            } else {
                i = i10;
                i2 = i11;
                i3 = 0;
            }
            int i17 = J & i9;
            if (I >= zzgzl.zzJ.zza()) {
                zzgzl.zzW.zza();
            }
            long j = i17;
            switch (I) {
                case 0:
                    i4 = i12;
                    if (t(obj, i4, i, i2, i3)) {
                        B = lh.B(i14 << 3);
                        i5 = B + 8;
                        i13 += i5;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    } else {
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                case 1:
                    i4 = i12;
                    if (t(obj, i4, i, i2, i3)) {
                        B2 = lh.B(i14 << 3);
                        i5 = B2 + 4;
                        i13 += i5;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    } else {
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                case 2:
                    i4 = i12;
                    if (t(obj, i4, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        B3 = lh.B(i14 << 3);
                        b = lh.b(j2);
                        i5 = B3 + b;
                        i13 += i5;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    } else {
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                case 3:
                    i4 = i12;
                    if (t(obj, i4, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        B3 = lh.B(i14 << 3);
                        b = lh.b(j3);
                        i5 = B3 + b;
                        i13 += i5;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    } else {
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                case 4:
                    i4 = i12;
                    if (t(obj, i4, i, i2, i3)) {
                        long j4 = unsafe.getInt(obj, j);
                        B3 = lh.B(i14 << 3);
                        b = lh.b(j4);
                        i5 = B3 + b;
                        i13 += i5;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    } else {
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                case 5:
                    i4 = i12;
                    if (t(obj, i4, i, i2, i3)) {
                        B = lh.B(i14 << 3);
                        i5 = B + 8;
                        i13 += i5;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    } else {
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                case 6:
                    i4 = i12;
                    if (t(obj, i4, i, i2, i3)) {
                        B2 = lh.B(i14 << 3);
                        i5 = B2 + 4;
                        i13 += i5;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    } else {
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                case 7:
                    i4 = i12;
                    if (t(obj, i4, i, i2, i3)) {
                        i5 = lh.B(i14 << 3) + 1;
                        i13 += i5;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    } else {
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                case 8:
                    int i18 = i12;
                    i4 = i18;
                    if (t(obj, i18, i, i2, i3)) {
                        int i19 = i14 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgyl) {
                            int B17 = lh.B(i19);
                            int g2 = ((zzgyl) object).g();
                            i5 = B17 + lh.B(g2) + g2;
                            i13 += i5;
                            i12 = i4 + 3;
                            i10 = i;
                            i11 = i2;
                            i9 = 1048575;
                        } else {
                            B3 = lh.B(i19);
                            b = lh.A((String) object);
                            i5 = B3 + b;
                            i13 += i5;
                            i12 = i4 + 3;
                            i10 = i;
                            i11 = i2;
                            i9 = 1048575;
                        }
                    } else {
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                case 9:
                    i6 = i12;
                    if (t(obj, i6, i, i2, i3)) {
                        i13 += dj.o(i14, unsafe.getObject(obj, j), M(i6));
                        i4 = i6;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    i4 = i6;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 10:
                    i6 = i12;
                    if (t(obj, i6, i, i2, i3)) {
                        zzgyl zzgylVar = (zzgyl) unsafe.getObject(obj, j);
                        int B18 = lh.B(i14 << 3);
                        int g3 = zzgylVar.g();
                        B4 = B18 + lh.B(g3) + g3;
                        i13 += B4;
                    }
                    i4 = i6;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 11:
                    i6 = i12;
                    if (t(obj, i6, i, i2, i3)) {
                        int i20 = unsafe.getInt(obj, j);
                        B5 = lh.B(i14 << 3);
                        B6 = lh.B(i20);
                        B4 = B5 + B6;
                        i13 += B4;
                    }
                    i4 = i6;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 12:
                    i6 = i12;
                    if (t(obj, i6, i, i2, i3)) {
                        long j5 = unsafe.getInt(obj, j);
                        B5 = lh.B(i14 << 3);
                        B6 = lh.b(j5);
                        B4 = B5 + B6;
                        i13 += B4;
                    }
                    i4 = i6;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 13:
                    i6 = i12;
                    if (t(obj, i6, i, i2, i3)) {
                        B4 = lh.B(i14 << 3) + 4;
                        i13 += B4;
                    }
                    i4 = i6;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 14:
                    i6 = i12;
                    if (t(obj, i6, i, i2, i3)) {
                        B4 = lh.B(i14 << 3) + 8;
                        i13 += B4;
                    }
                    i4 = i6;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 15:
                    i6 = i12;
                    if (t(obj, i6, i, i2, i3)) {
                        int i21 = unsafe.getInt(obj, j);
                        B5 = lh.B(i14 << 3);
                        B6 = lh.B((i21 >> 31) ^ (i21 + i21));
                        B4 = B5 + B6;
                        i13 += B4;
                    }
                    i4 = i6;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 16:
                    i6 = i12;
                    if (t(obj, i12, i, i2, i3)) {
                        long j6 = unsafe.getLong(obj, j);
                        B5 = lh.B(i14 << 3);
                        B6 = lh.b((j6 >> 63) ^ (j6 + j6));
                        B4 = B5 + B6;
                        i13 += B4;
                    }
                    i4 = i6;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 17:
                    if (t(obj, i12, i, i2, i3)) {
                        i13 += lh.y(i14, (w1f) unsafe.getObject(obj, j), M(i12));
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 18:
                    z = false;
                    k = dj.k(i14, (List) unsafe.getObject(obj, j), false);
                    i13 += k;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 19:
                    z = false;
                    k = dj.i(i14, (List) unsafe.getObject(obj, j), false);
                    i13 += k;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i22 = dj.d;
                    if (list.size() != 0) {
                        n = dj.n(list) + (list.size() * lh.B(i14 << 3));
                        i13 += n;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    n = 0;
                    i13 += n;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i23 = dj.d;
                    size = list2.size();
                    if (size != 0) {
                        s = dj.s(list2);
                        B7 = lh.B(i14 << 3);
                        n = s + (size * B7);
                        i13 += n;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    n = 0;
                    i13 += n;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i24 = dj.d;
                    size = list3.size();
                    if (size != 0) {
                        s = dj.m(list3);
                        B7 = lh.B(i14 << 3);
                        n = s + (size * B7);
                        i13 += n;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    n = 0;
                    i13 += n;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 23:
                    k2 = dj.k(i14, (List) unsafe.getObject(obj, j), false);
                    i13 += k2;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 24:
                    z2 = false;
                    i7 = dj.i(i14, (List) unsafe.getObject(obj, j), false);
                    i13 += i7;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case EventType.SUBS /* 25 */:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i25 = dj.d;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        k2 = size3 * (lh.B(i14 << 3) + 1);
                        i13 += k2;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    k2 = 0;
                    i13 += k2;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case EventType.CDN /* 26 */:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i26 = dj.d;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        int B19 = lh.B(i14 << 3) * size4;
                        if (list5 instanceof o1f) {
                            o1f o1fVar = (o1f) list5;
                            n = B19;
                            for (int i27 = 0; i27 < size4; i27++) {
                                Object zzf = o1fVar.zzf(i27);
                                if (zzf instanceof zzgyl) {
                                    int g4 = ((zzgyl) zzf).g();
                                    n += lh.B(g4) + g4;
                                } else {
                                    n += lh.A((String) zzf);
                                }
                            }
                        } else {
                            n = B19;
                            for (int i28 = 0; i28 < size4; i28++) {
                                Object obj2 = list5.get(i28);
                                if (obj2 instanceof zzgyl) {
                                    int g5 = ((zzgyl) obj2).g();
                                    n += lh.B(g5) + g5;
                                } else {
                                    n += lh.A((String) obj2);
                                }
                            }
                        }
                        i13 += n;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    n = 0;
                    i13 += n;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    bj M = M(i12);
                    int i29 = dj.d;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        B8 = lh.B(i14 << 3) * size5;
                        for (int i30 = 0; i30 < size5; i30++) {
                            B8 += lh.z((w1f) list6.get(i30), M);
                        }
                        i13 += B8;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    B8 = 0;
                    i13 += B8;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i31 = dj.d;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        B9 = 0;
                    } else {
                        B9 = size6 * lh.B(i14 << 3);
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int g6 = ((zzgyl) list7.get(i32)).g();
                            B9 += lh.B(g6) + g6;
                        }
                    }
                    i13 += B9;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case BuildConfig.VERSION_CODE /* 29 */:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i33 = dj.d;
                    size2 = list8.size();
                    if (size2 != 0) {
                        r = dj.r(list8);
                        B10 = lh.B(i14 << 3);
                        i8 = size2 * B10;
                        k2 = r + i8;
                        i13 += k2;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    k2 = 0;
                    i13 += k2;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i34 = dj.d;
                    size2 = list9.size();
                    if (size2 != 0) {
                        r = dj.h(list9);
                        B10 = lh.B(i14 << 3);
                        i8 = size2 * B10;
                        k2 = r + i8;
                        i13 += k2;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    k2 = 0;
                    i13 += k2;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 31:
                    k2 = dj.i(i14, (List) unsafe.getObject(obj, j), false);
                    i13 += k2;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 32:
                    z2 = false;
                    i7 = dj.k(i14, (List) unsafe.getObject(obj, j), false);
                    i13 += i7;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i35 = dj.d;
                    size2 = list10.size();
                    if (size2 != 0) {
                        r = dj.p(list10);
                        B10 = lh.B(i14 << 3);
                        i8 = size2 * B10;
                        k2 = r + i8;
                        i13 += k2;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    k2 = 0;
                    i13 += k2;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i36 = dj.d;
                    size2 = list11.size();
                    if (size2 != 0) {
                        r = dj.q(list11);
                        B10 = lh.B(i14 << 3);
                        i8 = size2 * B10;
                        k2 = r + i8;
                        i13 += k2;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    k2 = 0;
                    i13 += k2;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 35:
                    l = dj.l((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 36:
                    l = dj.j((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 37:
                    l = dj.n((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 38:
                    l = dj.s((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 39:
                    l = dj.m((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 40:
                    l = dj.l((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 41:
                    l = dj.j((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i37 = dj.d;
                    l = list12.size();
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 43:
                    l = dj.r((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 44:
                    l = dj.h((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 45:
                    l = dj.j((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 46:
                    l = dj.l((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 47:
                    l = dj.p((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 48:
                    l = dj.q((List) unsafe.getObject(obj, j));
                    if (l > 0) {
                        B11 = lh.B(i14 << 3);
                        B12 = lh.B(l);
                        i13 += B11 + B12 + l;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    bj M2 = M(i12);
                    int i38 = dj.d;
                    int size7 = list13.size();
                    if (size7 != 0) {
                        B8 = 0;
                        for (int i39 = 0; i39 < size7; i39++) {
                            B8 += lh.y(i14, (w1f) list13.get(i39), M2);
                        }
                        i13 += B8;
                        i4 = i12;
                        i12 = i4 + 3;
                        i10 = i;
                        i11 = i2;
                        i9 = 1048575;
                    }
                    B8 = 0;
                    i13 += B8;
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 50:
                    zzhay zzhayVar = (zzhay) unsafe.getObject(obj, j);
                    lh4.a(O(i12));
                    if (!zzhayVar.isEmpty()) {
                        Iterator it2 = zzhayVar.entrySet().iterator();
                        if (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 51:
                    if (w(obj, i14, i12)) {
                        B13 = lh.B(i14 << 3);
                        k2 = B13 + 8;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 52:
                    if (w(obj, i14, i12)) {
                        B14 = lh.B(i14 << 3);
                        k2 = B14 + 4;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (w(obj, i14, i12)) {
                        long K = K(obj, j);
                        r = lh.B(i14 << 3);
                        i8 = lh.b(K);
                        k2 = r + i8;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 54:
                    if (w(obj, i14, i12)) {
                        long K2 = K(obj, j);
                        r = lh.B(i14 << 3);
                        i8 = lh.b(K2);
                        k2 = r + i8;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 55:
                    if (w(obj, i14, i12)) {
                        long E = E(obj, j);
                        r = lh.B(i14 << 3);
                        i8 = lh.b(E);
                        k2 = r + i8;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 56:
                    if (w(obj, i14, i12)) {
                        B13 = lh.B(i14 << 3);
                        k2 = B13 + 8;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 57:
                    if (w(obj, i14, i12)) {
                        B14 = lh.B(i14 << 3);
                        k2 = B14 + 4;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 58:
                    if (w(obj, i14, i12)) {
                        k2 = lh.B(i14 << 3) + 1;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 59:
                    if (w(obj, i14, i12)) {
                        int i40 = i14 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgyl) {
                            B15 = lh.B(i40);
                            g = ((zzgyl) object2).g();
                            B16 = lh.B(g);
                            k2 = B15 + B16 + g;
                            i13 += k2;
                        } else {
                            r = lh.B(i40);
                            i8 = lh.A((String) object2);
                            k2 = r + i8;
                            i13 += k2;
                        }
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (w(obj, i14, i12)) {
                        k2 = dj.o(i14, unsafe.getObject(obj, j), M(i12));
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (w(obj, i14, i12)) {
                        zzgyl zzgylVar2 = (zzgyl) unsafe.getObject(obj, j);
                        B15 = lh.B(i14 << 3);
                        g = zzgylVar2.g();
                        B16 = lh.B(g);
                        k2 = B15 + B16 + g;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 62:
                    if (w(obj, i14, i12)) {
                        int E2 = E(obj, j);
                        r = lh.B(i14 << 3);
                        i8 = lh.B(E2);
                        k2 = r + i8;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 63:
                    if (w(obj, i14, i12)) {
                        long E3 = E(obj, j);
                        r = lh.B(i14 << 3);
                        i8 = lh.b(E3);
                        k2 = r + i8;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 64:
                    if (w(obj, i14, i12)) {
                        B14 = lh.B(i14 << 3);
                        k2 = B14 + 4;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 65:
                    if (w(obj, i14, i12)) {
                        B13 = lh.B(i14 << 3);
                        k2 = B13 + 8;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 66:
                    if (w(obj, i14, i12)) {
                        int E4 = E(obj, j);
                        r = lh.B(i14 << 3);
                        i8 = lh.B((E4 >> 31) ^ (E4 + E4));
                        k2 = r + i8;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (w(obj, i14, i12)) {
                        long K3 = K(obj, j);
                        r = lh.B(i14 << 3);
                        i8 = lh.b((K3 >> 63) ^ (K3 + K3));
                        k2 = r + i8;
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                case 68:
                    if (w(obj, i14, i12)) {
                        k2 = lh.y(i14, (w1f) unsafe.getObject(obj, j), M(i12));
                        i13 += k2;
                    }
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
                default:
                    i4 = i12;
                    i12 = i4 + 3;
                    i10 = i;
                    i11 = i2;
                    i9 = 1048575;
            }
        }
        fj fjVar = this.l;
        int a = i13 + fjVar.a(fjVar.d(obj));
        if (!this.f) {
            return a;
        }
        this.m.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a.length; i4 += 3) {
            int J = J(i4);
            int[] iArr = this.a;
            int i5 = 1048575 & J;
            int I = I(J);
            int i6 = iArr[i4];
            long j = i5;
            int i7 = 37;
            switch (I) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(mj.j(obj, j));
                    byte[] bArr = ai.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(mj.k(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = mj.n(obj, j);
                    byte[] bArr2 = ai.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = mj.n(obj, j);
                    byte[] bArr3 = ai.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    floatToIntBits = mj.l(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = mj.n(obj, j);
                    byte[] bArr4 = ai.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    floatToIntBits = mj.l(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    floatToIntBits = ai.a(mj.H(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) mj.p(obj, j)).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object p2 = mj.p(obj, j);
                    if (p2 != null) {
                        i7 = p2.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    floatToIntBits = mj.p(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    floatToIntBits = mj.l(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    floatToIntBits = mj.l(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    floatToIntBits = mj.l(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = mj.n(obj, j);
                    byte[] bArr5 = ai.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    floatToIntBits = mj.l(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = mj.n(obj, j);
                    byte[] bArr6 = ai.d;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object p3 = mj.p(obj, j);
                    if (p3 != null) {
                        i7 = p3.hashCode();
                    }
                    i3 = i2 + i7;
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
                    i = i3 * 53;
                    floatToIntBits = mj.p(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    floatToIntBits = mj.p(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 51:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(C(obj, j));
                        byte[] bArr7 = ai.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(D(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = K(obj, j);
                        byte[] bArr8 = ai.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = K(obj, j);
                        byte[] bArr9 = ai.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = E(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = K(obj, j);
                        byte[] bArr10 = ai.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = E(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = ai.a(x(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = ((String) mj.p(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = mj.p(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = mj.p(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = E(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = E(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = E(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = K(obj, j);
                        byte[] bArr11 = ai.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = E(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = K(obj, j);
                        byte[] bArr12 = ai.d;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (w(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = mj.p(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.l.d(obj).hashCode();
        if (!this.f) {
            return hashCode;
        }
        this.m.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final Object zze() {
        return ((yh) this.e).n();
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void zzf(Object obj) {
        if (v(obj)) {
            if (obj instanceof yh) {
                yh yhVar = (yh) obj;
                yhVar.E(Integer.MAX_VALUE);
                yhVar.zza = 0;
                yhVar.C();
            }
            int[] iArr = this.a;
            for (int i = 0; i < iArr.length; i += 3) {
                int J = J(i);
                int i2 = 1048575 & J;
                int I = I(J);
                long j = i2;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
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
                                this.k.b(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = q;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzhay) object).d();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (w(obj, this.a[i], i)) {
                        M(i).zzf(q.getObject(obj, j));
                    }
                }
                if (s(obj, i)) {
                    M(i).zzf(q.getObject(obj, j));
                }
            }
            this.l.m(obj);
            if (this.f) {
                this.m.e(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void zzg(Object obj, Object obj2) {
        i(obj);
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int J = J(i);
            int i2 = 1048575 & J;
            int[] iArr = this.a;
            int I = I(J);
            int i3 = iArr[i];
            long j = i2;
            switch (I) {
                case 0:
                    if (s(obj2, i)) {
                        mj.z(obj, j, mj.j(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(obj2, i)) {
                        mj.A(obj, j, mj.k(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (s(obj2, i)) {
                        mj.C(obj, j, mj.n(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (s(obj2, i)) {
                        mj.C(obj, j, mj.n(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (s(obj2, i)) {
                        mj.B(obj, j, mj.l(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (s(obj2, i)) {
                        mj.C(obj, j, mj.n(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (s(obj2, i)) {
                        mj.B(obj, j, mj.l(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (s(obj2, i)) {
                        mj.x(obj, j, mj.H(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (s(obj2, i)) {
                        mj.D(obj, j, mj.p(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    j(obj, obj2, i);
                    break;
                case 10:
                    if (s(obj2, i)) {
                        mj.D(obj, j, mj.p(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (s(obj2, i)) {
                        mj.B(obj, j, mj.l(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (s(obj2, i)) {
                        mj.B(obj, j, mj.l(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (s(obj2, i)) {
                        mj.B(obj, j, mj.l(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (s(obj2, i)) {
                        mj.C(obj, j, mj.n(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (s(obj2, i)) {
                        mj.B(obj, j, mj.l(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (s(obj2, i)) {
                        mj.C(obj, j, mj.n(obj2, j));
                        m(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    j(obj, obj2, i);
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
                    this.k.c(obj, obj2, j);
                    break;
                case 50:
                    int i4 = dj.d;
                    mj.D(obj, j, ki.b(mj.p(obj, j), mj.p(obj2, j)));
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
                    if (w(obj2, i3, i)) {
                        mj.D(obj, j, mj.p(obj2, j));
                        n(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    k(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (w(obj2, i3, i)) {
                        mj.D(obj, j, mj.p(obj2, j));
                        n(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    k(obj, obj2, i);
                    break;
            }
        }
        dj.x(this.l, obj, obj2);
        if (this.f) {
            this.m.a(obj2);
            throw null;
        }
    }
}
