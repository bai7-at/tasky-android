package defpackage;

/* loaded from: classes3.dex */
abstract class bhe extends xfe {
    final CharSequence c;
    final dge d;
    int e = 0;
    int f;

    protected bhe(dhe dheVar, CharSequence charSequence) {
        dge dgeVar;
        dgeVar = dheVar.a;
        this.d = dgeVar;
        this.f = Integer.MAX_VALUE;
        this.c = charSequence;
    }

    @Override // defpackage.xfe
    protected final /* bridge */ /* synthetic */ Object b() {
        int d;
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 == -1) {
                c();
                return null;
            }
            int e = e(i2);
            if (e == -1) {
                e = this.c.length();
                this.e = -1;
                d = -1;
            } else {
                d = d(e);
                this.e = d;
            }
            if (d != i) {
                if (i < e) {
                    this.c.charAt(i);
                }
                if (i < e) {
                    this.c.charAt(e - 1);
                }
                int i3 = this.f;
                if (i3 == 1) {
                    e = this.c.length();
                    this.e = -1;
                    if (e > i) {
                        this.c.charAt(e - 1);
                    }
                } else {
                    this.f = i3 - 1;
                }
                return this.c.subSequence(i, e).toString();
            }
            int i4 = d + 1;
            this.e = i4;
            if (i4 > this.c.length()) {
                this.e = -1;
            }
        }
    }

    abstract int d(int i);

    abstract int e(int i);
}
