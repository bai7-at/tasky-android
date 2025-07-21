package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.l;
import defpackage.a02;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class h {
    private final e.j a;
    private final l b;
    private e.InterfaceC0080e c;
    private final boolean d;
    private final int[] e;

    private static final class a {
        static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    private static class b implements c {
        public n a;
        private final e.j b;

        b(n nVar, e.j jVar) {
            this.a = nVar;
            this.b = jVar;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i, int i2, m mVar) {
            if (mVar.k()) {
                return true;
            }
            if (this.a == null) {
                this.a = new n(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.a.setSpan(this.b.a(mVar), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.h.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public n a() {
            return this.a;
        }
    }

    private interface c {
        Object a();

        boolean b(CharSequence charSequence, int i, int i2, m mVar);
    }

    private static class d implements c {
        private final int a;
        public int b = -1;
        public int c = -1;

        d(int i) {
            this.a = i;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i, int i2, m mVar) {
            int i3 = this.a;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.b = i;
            this.c = i2;
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    private static class e implements c {
        private final String a;

        e(String str) {
            this.a = str;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i, int i2, m mVar) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
                return true;
            }
            mVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a() {
            return this;
        }
    }

    static final class f {
        private int a = 1;
        private final l.a b;
        private l.a c;
        private l.a d;
        private int e;
        private int f;
        private final boolean g;
        private final int[] h;

        f(l.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        private static boolean d(int i) {
            return i == 65039;
        }

        private static boolean f(int i) {
            return i == 65038;
        }

        private int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        private boolean h() {
            if (this.c.b().j() || d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i) {
            l.a a = this.c.a(i);
            int i2 = 2;
            if (this.a != 2) {
                if (a == null) {
                    i2 = g();
                } else {
                    this.a = 2;
                    this.c = a;
                    this.f = 1;
                }
            } else if (a != null) {
                this.c = a;
                this.f++;
            } else if (f(i)) {
                i2 = g();
            } else if (!d(i)) {
                if (this.c.b() != null) {
                    i2 = 3;
                    if (this.f != 1) {
                        this.d = this.c;
                        g();
                    } else if (h()) {
                        this.d = this.c;
                        g();
                    } else {
                        i2 = g();
                    }
                } else {
                    i2 = g();
                }
            }
            this.e = i;
            return i2;
        }

        m b() {
            return this.c.b();
        }

        m c() {
            return this.d.b();
        }

        boolean e() {
            return this.a == 2 && this.c.b() != null && (this.f > 1 || h());
        }
    }

    h(l lVar, e.j jVar, e.InterfaceC0080e interfaceC0080e, boolean z, int[] iArr, Set set) {
        this.a = jVar;
        this.b = lVar;
        this.c = interfaceC0080e;
        this.d = z;
        this.e = iArr;
        i(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        a02[] a02VarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (a02VarArr = (a02[]) editable.getSpans(selectionStart, selectionEnd, a02.class)) != null && a02VarArr.length > 0) {
            for (a02 a02Var : a02VarArr) {
                int spanStart = editable.getSpanStart(a02Var);
                int spanEnd = editable.getSpanEnd(a02Var);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean d(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = a.a(editable, selectionStart, Math.max(i, 0));
                min = a.b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            a02[] a02VarArr = (a02[]) editable.getSpans(max, min, a02.class);
            if (a02VarArr != null && a02VarArr.length > 0) {
                for (a02 a02Var : a02VarArr) {
                    int spanStart = editable.getSpanStart(a02Var);
                    int spanEnd = editable.getSpanEnd(a02Var);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean e(Editable editable, int i, KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean f(CharSequence charSequence, int i, int i2, m mVar) {
        if (mVar.d() == 0) {
            mVar.m(this.c.a(charSequence, i, i2, mVar.h()));
        }
        return mVar.d() == 2;
    }

    private static boolean g(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    private static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void i(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            int[] iArr = (int[]) it2.next();
            String str = new String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new e(str));
        }
    }

    private Object k(CharSequence charSequence, int i, int i2, int i3, boolean z, c cVar) {
        int i4;
        f fVar = new f(this.b.f(), this.d, this.e);
        int i5 = 0;
        boolean z2 = true;
        int codePointAt = Character.codePointAt(charSequence, i);
        loop0: while (true) {
            i4 = i;
            while (i < i2 && i5 < i3 && z2) {
                int a2 = fVar.a(codePointAt);
                if (a2 == 1) {
                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                    }
                    i = i4;
                } else if (a2 == 2) {
                    i += Character.charCount(codePointAt);
                    if (i < i2) {
                        codePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (a2 == 3) {
                    if (z || !f(charSequence, i4, i, fVar.c())) {
                        z2 = cVar.b(charSequence, i4, i, fVar.c());
                        i5++;
                    }
                }
            }
        }
        if (fVar.e() && i5 < i3 && z2 && (z || !f(charSequence, i4, i, fVar.b()))) {
            cVar.b(charSequence, i4, i, fVar.b());
        }
        return cVar.a();
    }

    int b(CharSequence charSequence, int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            a02[] a02VarArr = (a02[]) spanned.getSpans(i, i + 1, a02.class);
            if (a02VarArr.length > 0) {
                return spanned.getSpanEnd(a02VarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new d(i))).c;
    }

    int c(CharSequence charSequence, int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            a02[] a02VarArr = (a02[]) spanned.getSpans(i, i + 1, a02.class);
            if (a02VarArr.length > 0) {
                return spanned.getSpanStart(a02VarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new d(i))).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:51:0x000e, B:54:0x0013, B:56:0x0017, B:58:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:24:0x0066, B:30:0x0074, B:31:0x0080, B:33:0x0094, B:6:0x002f), top: B:50:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:51:0x000e, B:54:0x0013, B:56:0x0017, B:58:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:24:0x0066, B:30:0x0074, B:31:0x0080, B:33:0x0094, B:6:0x002f), top: B:50:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.CharSequence j(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.ly7
            if (r0 == 0) goto La
            r1 = r11
            ly7 r1 = (defpackage.ly7) r1
            r1.a()
        La:
            java.lang.Class<a02> r1 = defpackage.a02.class
            if (r0 != 0) goto L2f
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L2f
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2d
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2d
            androidx.emoji2.text.n r2 = new androidx.emoji2.text.n     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L37
        L2a:
            r10 = move-exception
            goto Lb2
        L2d:
            r2 = 0
            goto L37
        L2f:
            androidx.emoji2.text.n r2 = new androidx.emoji2.text.n     // Catch: java.lang.Throwable -> L2a
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
        L37:
            r3 = 0
            if (r2 == 0) goto L63
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch: java.lang.Throwable -> L2a
            a02[] r4 = (defpackage.a02[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = r3
        L47:
            if (r6 >= r5) goto L63
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L58
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L58:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L47
        L63:
            r4 = r13
            if (r12 == r4) goto La9
            int r13 = r11.length()     // Catch: java.lang.Throwable -> L2a
            if (r12 < r13) goto L6d
            goto La9
        L6d:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r13) goto L80
            if (r2 == 0) goto L80
            int r13 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r13 = r2.getSpans(r3, r13, r1)     // Catch: java.lang.Throwable -> L2a
            a02[] r13 = (defpackage.a02[]) r13     // Catch: java.lang.Throwable -> L2a
            int r13 = r13.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r13
        L80:
            r5 = r14
            androidx.emoji2.text.h$b r7 = new androidx.emoji2.text.h$b     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.e$j r13 = r10.a     // Catch: java.lang.Throwable -> L2a
            r7.<init>(r2, r13)     // Catch: java.lang.Throwable -> L2a
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            java.lang.Object r10 = r1.k(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.n r10 = (androidx.emoji2.text.n) r10     // Catch: java.lang.Throwable -> L2a
            if (r10 == 0) goto La0
            android.text.Spannable r10 = r10.b()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L9f
            ly7 r11 = (defpackage.ly7) r11
            r11.d()
        L9f:
            return r10
        La0:
            if (r0 == 0) goto La8
            r10 = r11
            ly7 r10 = (defpackage.ly7) r10
            r10.d()
        La8:
            return r11
        La9:
            if (r0 == 0) goto Lb1
            r10 = r11
            ly7 r10 = (defpackage.ly7) r10
            r10.d()
        Lb1:
            return r11
        Lb2:
            if (r0 == 0) goto Lb9
            ly7 r11 = (defpackage.ly7) r11
            r11.d()
        Lb9:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.j(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
