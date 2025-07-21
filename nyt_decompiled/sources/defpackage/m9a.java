package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class m9a {
    private final String a;
    private final int b;
    private final int c;
    private int d;
    private String e;

    public m9a(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = RecyclerView.UNDEFINED_DURATION;
        this.e = "";
    }

    private final void d() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.d;
    }

    public final String b() {
        d();
        return this.e;
    }

    public final void c() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.d = i2;
        this.e = this.a + i2;
    }
}
