package kotlin.text;

import defpackage.ak7;
import defpackage.an3;
import defpackage.gt2;
import defpackage.uo6;
import defpackage.yu3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class d implements ak7 {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final gt2 d;

    public static final class a implements Iterator, yu3 {
        private int a = -1;
        private int b;
        private int c;
        private an3 d;
        private int e;

        a() {
            int m = uo6.m(d.this.b, 0, d.this.a.length());
            this.b = m;
            this.c = m;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f.c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void c() {
            /*
                r6 = this;
                int r0 = r6.c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.a = r1
                r0 = 0
                r6.d = r0
                goto L9e
            Lc:
                kotlin.text.d r0 = kotlin.text.d.this
                int r0 = kotlin.text.d.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.e
                int r0 = r0 + r3
                r6.e = r0
                kotlin.text.d r4 = kotlin.text.d.this
                int r4 = kotlin.text.d.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.c
                kotlin.text.d r4 = kotlin.text.d.this
                java.lang.CharSequence r4 = kotlin.text.d.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                an3 r0 = new an3
                int r1 = r6.b
                kotlin.text.d r4 = kotlin.text.d.this
                java.lang.CharSequence r4 = kotlin.text.d.c(r4)
                int r4 = kotlin.text.h.V(r4)
                r0.<init>(r1, r4)
                r6.d = r0
                r6.c = r2
                goto L9c
            L47:
                kotlin.text.d r0 = kotlin.text.d.this
                gt2 r0 = kotlin.text.d.b(r0)
                kotlin.text.d r4 = kotlin.text.d.this
                java.lang.CharSequence r4 = kotlin.text.d.c(r4)
                int r5 = r6.c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L77
                an3 r0 = new an3
                int r1 = r6.b
                kotlin.text.d r4 = kotlin.text.d.this
                java.lang.CharSequence r4 = kotlin.text.d.c(r4)
                int r4 = kotlin.text.h.V(r4)
                r0.<init>(r1, r4)
                r6.d = r0
                r6.c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.b
                an3 r4 = defpackage.uo6.u(r4, r2)
                r6.d = r4
                int r2 = r2 + r0
                r6.b = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.c = r2
            L9c:
                r6.a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.d.a.c():void");
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public an3 next() {
            if (this.a == -1) {
                c();
            }
            if (this.a == 0) {
                throw new NoSuchElementException();
            }
            an3 an3Var = this.d;
            zq3.f(an3Var, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.d = null;
            this.a = -1;
            return an3Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == -1) {
                c();
            }
            return this.a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(CharSequence charSequence, int i, int i2, gt2 gt2Var) {
        zq3.h(charSequence, "input");
        zq3.h(gt2Var, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = gt2Var;
    }

    @Override // defpackage.ak7
    public Iterator iterator() {
        return new a();
    }
}
