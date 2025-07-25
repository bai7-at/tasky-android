package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* loaded from: classes.dex */
class k {
    final a a;

    interface a {
        a.b a(int i, int i2, int i3, Object obj);

        void b(a.b bVar);
    }

    k(a aVar) {
        this.a = aVar;
    }

    private int a(List list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i, a.b bVar, int i2, a.b bVar2) {
        int i3 = bVar.d;
        int i4 = bVar2.b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.b = i6 + bVar2.d;
        }
        int i7 = bVar2.b;
        if (i7 <= i3) {
            bVar.d = i3 + bVar2.d;
        }
        bVar2.b = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    private void d(List list, int i, int i2) {
        a.b bVar = (a.b) list.get(i);
        a.b bVar2 = (a.b) list.get(i2);
        int i3 = bVar2.a;
        if (i3 == 1) {
            c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            e(list, i, bVar, i2, bVar2);
        } else {
            if (i3 != 4) {
                return;
            }
            f(list, i, bVar, i2, bVar2);
        }
    }

    void b(List list) {
        while (true) {
            int a2 = a(list);
            if (a2 == -1) {
                return;
            } else {
                d(list, a2, a2 + 1);
            }
        }
    }

    void e(List list, int i, a.b bVar, int i2, a.b bVar2) {
        boolean z;
        int i3 = bVar.b;
        int i4 = bVar.d;
        boolean z2 = false;
        if (i3 < i4) {
            if (bVar2.b == i3 && bVar2.d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.b == i4 + 1 && bVar2.d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = bVar2.b;
        if (i4 < i5) {
            bVar2.b = i5 - 1;
        } else {
            int i6 = bVar2.d;
            if (i4 < i5 + i6) {
                bVar2.d = i6 - 1;
                bVar.a = 2;
                bVar.d = 1;
                if (bVar2.d == 0) {
                    list.remove(i2);
                    this.a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i7 = bVar.b;
        int i8 = bVar2.b;
        a.b bVar3 = null;
        if (i7 <= i8) {
            bVar2.b = i8 + 1;
        } else {
            int i9 = bVar2.d;
            if (i7 < i8 + i9) {
                bVar3 = this.a.a(2, i7 + 1, (i8 + i9) - i7, null);
                bVar2.d = bVar.b - bVar2.b;
            }
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.a.b(bVar);
            return;
        }
        if (z) {
            if (bVar3 != null) {
                int i10 = bVar.b;
                if (i10 > bVar3.b) {
                    bVar.b = i10 - bVar3.d;
                }
                int i11 = bVar.d;
                if (i11 > bVar3.b) {
                    bVar.d = i11 - bVar3.d;
                }
            }
            int i12 = bVar.b;
            if (i12 > bVar2.b) {
                bVar.b = i12 - bVar2.d;
            }
            int i13 = bVar.d;
            if (i13 > bVar2.b) {
                bVar.d = i13 - bVar2.d;
            }
        } else {
            if (bVar3 != null) {
                int i14 = bVar.b;
                if (i14 >= bVar3.b) {
                    bVar.b = i14 - bVar3.d;
                }
                int i15 = bVar.d;
                if (i15 >= bVar3.b) {
                    bVar.d = i15 - bVar3.d;
                }
            }
            int i16 = bVar.b;
            if (i16 >= bVar2.b) {
                bVar.b = i16 - bVar2.d;
            }
            int i17 = bVar.d;
            if (i17 >= bVar2.b) {
                bVar.d = i17 - bVar2.d;
            }
        }
        list.set(i, bVar2);
        if (bVar.b != bVar.d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.d
            int r1 = r13.b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.b = r1
            goto L20
        Ld:
            int r5 = r13.d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.d = r5
            androidx.recyclerview.widget.k$a r0 = r8.a
            int r1 = r11.b
            java.lang.Object r5 = r13.c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.b
            int r5 = r13.b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.b = r5
            goto L41
        L2b:
            int r6 = r13.d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.k$a r4 = r8.a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.c
            androidx.recyclerview.widget.a$b r4 = r4.a(r2, r1, r5, r3)
            int r1 = r13.d
            int r1 = r1 - r5
            r13.d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.k$a r8 = r8.a
            r8.b(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
