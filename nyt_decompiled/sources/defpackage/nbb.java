package defpackage;

/* loaded from: classes3.dex */
final class nbb {
    public final int a;

    public nbb(int i, int i2) {
        this.a = i2;
    }

    public final int a() {
        int i = this.a;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
