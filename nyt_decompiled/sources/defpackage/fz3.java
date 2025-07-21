package defpackage;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes.dex */
public final class fz3 {
    private final Layout a;
    private final List b;
    private final List c;
    private final boolean[] d;
    private char[] e;
    private final int f;

    private static final class a {
        private final int a;
        private final int b;
        private final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
        }
    }

    public fz3(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int a0 = h.a0(this.a.getText(), '\n', i, false, 4, null);
            i = a0 < 0 ? this.a.getText().length() : a0 + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.f = this.b.size();
    }

    private final float b(int i, boolean z) {
        int i2 = uo6.i(i, this.a.getLineEnd(this.a.getLineForOffset(i)));
        return z ? this.a.getPrimaryHorizontal(i2) : this.a.getSecondaryHorizontal(i2);
    }

    private final int i(int i, int i2) {
        while (i > i2 && g(this.a.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r0.getRunCount() == 1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.d
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List r11 = r11.c
            java.lang.Object r11 = r11.get(r12)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List r1 = r11.b
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List r2 = r11.b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.e
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r10 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r11.a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            boolean r9 = r11.h(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L63
        L62:
            r0 = r1
        L63:
            java.util.List r3 = r11.c
            r3.set(r12, r0)
            boolean[] r3 = r11.d
            r3[r12] = r2
            if (r0 == 0) goto L75
            char[] r12 = r11.e
            if (r10 != r12) goto L74
            r10 = r1
            goto L75
        L74:
            r10 = r12
        L75:
            r11.e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz3.a(int):java.text.Bidi");
    }

    public final float c(int i, boolean z, boolean z2) {
        int i2 = i;
        if (!z2) {
            return b(i, z);
        }
        int a2 = bz3.a(this.a, i2, z2);
        int lineStart = this.a.getLineStart(a2);
        int lineEnd = this.a.getLineEnd(a2);
        if (i2 != lineStart && i2 != lineEnd) {
            return b(i, z);
        }
        if (i2 == 0 || i2 == this.a.getText().length()) {
            return b(i, z);
        }
        int e = e(i2, z2);
        boolean h = h(e);
        int i3 = i(lineEnd, lineStart);
        int f = f(e);
        int i4 = lineStart - f;
        int i5 = i3 - f;
        Bidi a3 = a(e);
        Bidi createLineBidi = a3 != null ? a3.createLineBidi(i4, i5) : null;
        boolean z3 = false;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.a.isRtlCharAt(lineStart);
            if (z || h == isRtlCharAt) {
                h = !h;
            }
            if (i2 == lineStart) {
                z3 = h;
            } else if (!h) {
                z3 = true;
            }
            Layout layout = this.a;
            return z3 ? layout.getLineLeft(a2) : layout.getLineRight(a2);
        }
        int runCount = createLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            aVarArr[i6] = new a(createLineBidi.getRunStart(i6) + lineStart, createLineBidi.getRunLimit(i6) + lineStart, createLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) createLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i8 = -1;
        if (i2 == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    break;
                }
                if (aVarArr[i9].b() == i2) {
                    i8 = i9;
                    break;
                }
                i9++;
            }
            a aVar = aVarArr[i8];
            if (z || h == aVar.c()) {
                h = !h;
            }
            return (i8 == 0 && h) ? this.a.getLineLeft(a2) : (i8 != d.e0(aVarArr) || h) ? h ? this.a.getPrimaryHorizontal(aVarArr[i8 - 1].b()) : this.a.getPrimaryHorizontal(aVarArr[i8 + 1].b()) : this.a.getLineRight(a2);
        }
        if (i2 > i3) {
            i2 = i(i2, lineStart);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= runCount) {
                break;
            }
            if (aVarArr[i10].a() == i2) {
                i8 = i10;
                break;
            }
            i10++;
        }
        a aVar2 = aVarArr[i8];
        if (!z && h != aVar2.c()) {
            h = !h;
        }
        return (i8 == 0 && h) ? this.a.getLineLeft(a2) : (i8 != d.e0(aVarArr) || h) ? h ? this.a.getPrimaryHorizontal(aVarArr[i8 - 1].a()) : this.a.getPrimaryHorizontal(aVarArr[i8 + 1].a()) : this.a.getLineRight(a2);
    }

    public final int d(int i) {
        return i(this.a.getLineEnd(i), this.a.getLineStart(i));
    }

    public final int e(int i, boolean z) {
        int k = i.k(this.b, Integer.valueOf(i), 0, 0, 6, null);
        int i2 = k < 0 ? -(k + 1) : k + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) this.b.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int f(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.b.get(i - 1)).intValue();
    }

    public final boolean g(char c) {
        return c == ' ' || c == '\n' || c == 5760 || (zq3.j(c, 8192) >= 0 && zq3.j(c, 8202) <= 0 && c != 8199) || c == 8287 || c == 12288;
    }

    public final boolean h(int i) {
        return this.a.getParagraphDirection(this.a.getLineForOffset(f(i))) == -1;
    }
}
