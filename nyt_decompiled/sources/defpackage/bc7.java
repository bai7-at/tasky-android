package defpackage;

/* loaded from: classes.dex */
public final class bc7 {
    private final oy4 a = ta7.b();

    public final void a(Object obj, Object obj2) {
        oy4 oy4Var = this.a;
        int j = oy4Var.j(obj);
        boolean z = j < 0;
        Object obj3 = z ? null : oy4Var.c[j];
        if (obj3 != null) {
            if (obj3 instanceof py4) {
                zq3.f(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((py4) obj3).g(obj2);
            } else if (obj3 != obj2) {
                py4 py4Var = new py4(0, 1, null);
                zq3.f(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                py4Var.g(obj3);
                py4Var.g(obj2);
                obj2 = py4Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            oy4Var.c[j] = obj2;
            return;
        }
        int i = ~j;
        oy4Var.b[i] = obj;
        oy4Var.c[i] = obj2;
    }

    public final void b() {
        this.a.h();
    }

    public final boolean c(Object obj) {
        return this.a.a(obj);
    }

    public final oy4 d() {
        return this.a;
    }

    public final boolean e(Object obj, Object obj2) {
        Object b = this.a.b(obj);
        if (b == null) {
            return false;
        }
        if (!(b instanceof py4)) {
            if (!zq3.c(b, obj2)) {
                return false;
            }
            this.a.n(obj);
            return true;
        }
        py4 py4Var = (py4) b;
        boolean p = py4Var.p(obj2);
        if (p && py4Var.d()) {
            this.a.n(obj);
        }
        return p;
    }

    public final void f(Object obj) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        boolean z;
        int i6;
        oy4 d = d();
        long[] jArr3 = d.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j2 = jArr3[i7];
            char c = 7;
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j2 & 255) < 128) {
                        int i11 = (i7 << 3) + i10;
                        Object obj2 = d.b[i11];
                        Object obj3 = d.c[i11];
                        if (obj3 instanceof py4) {
                            zq3.f(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                            py4 py4Var = (py4) obj3;
                            Object[] objArr = py4Var.b;
                            long[] jArr4 = py4Var.a;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            i2 = length;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j4 = jArr4[i12];
                                    i4 = i9;
                                    long[] jArr5 = jArr4;
                                    j = -9187201950435737472L;
                                    if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j4 & 255) < 128) {
                                                int i15 = (i12 << 3) + i14;
                                                i6 = i7;
                                                if (objArr[i15] == obj) {
                                                    py4Var.q(i15);
                                                }
                                            } else {
                                                i6 = i7;
                                            }
                                            j4 >>= 8;
                                            i14++;
                                            i7 = i6;
                                        }
                                        i3 = i7;
                                        if (i13 != 8) {
                                            break;
                                        }
                                    } else {
                                        i3 = i7;
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    i9 = i4;
                                    jArr4 = jArr5;
                                    i7 = i3;
                                    c = 7;
                                }
                            } else {
                                i3 = i7;
                                i4 = i9;
                                j = -9187201950435737472L;
                            }
                            z = py4Var.d();
                        } else {
                            jArr2 = jArr3;
                            i2 = length;
                            i3 = i7;
                            i4 = i9;
                            j = j3;
                            zq3.f(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                            z = obj3 == obj;
                        }
                        if (z) {
                            d.o(i11);
                        }
                        i5 = 8;
                    } else {
                        jArr2 = jArr3;
                        i2 = length;
                        i3 = i7;
                        i4 = i9;
                        j = j3;
                        i5 = i8;
                    }
                    j2 >>= i5;
                    i10++;
                    i8 = i5;
                    j3 = j;
                    jArr3 = jArr2;
                    length = i2;
                    i9 = i4;
                    i7 = i3;
                    c = 7;
                }
                jArr = jArr3;
                int i16 = length;
                int i17 = i7;
                if (i9 != i8) {
                    return;
                }
                length = i16;
                i = i17;
            } else {
                jArr = jArr3;
                i = i7;
            }
            if (i == length) {
                return;
            }
            i7 = i + 1;
            jArr3 = jArr;
        }
    }
}
