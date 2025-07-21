package defpackage;

import android.view.ViewStructure;

/* loaded from: classes.dex */
public class kb9 {
    private final Object a;

    private static class a {
        static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void e(ViewStructure viewStructure, float f, int i, int i2, int i3) {
            viewStructure.setTextStyle(f, i, i2, i3);
        }
    }

    private kb9(ViewStructure viewStructure) {
        this.a = viewStructure;
    }

    public static kb9 g(ViewStructure viewStructure) {
        return new kb9(viewStructure);
    }

    public void a(String str) {
        a.a((ViewStructure) this.a, str);
    }

    public void b(CharSequence charSequence) {
        a.b((ViewStructure) this.a, charSequence);
    }

    public void c(int i, int i2, int i3, int i4, int i5, int i6) {
        a.c((ViewStructure) this.a, i, i2, i3, i4, i5, i6);
    }

    public void d(CharSequence charSequence) {
        a.d((ViewStructure) this.a, charSequence);
    }

    public void e(float f, int i, int i2, int i3) {
        a.e((ViewStructure) this.a, f, i, i2, i3);
    }

    public ViewStructure f() {
        return (ViewStructure) this.a;
    }
}
