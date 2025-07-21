package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class m35 {
    private int a;
    private int b;

    public m35(ViewGroup viewGroup) {
    }

    public int a() {
        return this.b | this.a;
    }

    public void b(View view, View view2, int i) {
        c(view, view2, i, 0);
    }

    public void c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }
}
