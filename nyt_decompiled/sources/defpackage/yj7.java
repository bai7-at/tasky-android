package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.text.Regex;
import kotlin.text.a;

/* loaded from: classes2.dex */
public final class yj7 {
    public static final yj7 a = new yj7();

    private yj7() {
    }

    private final boolean a(TextView textView) {
        int i;
        if (c11.d(this)) {
            return false;
        }
        try {
            String e = new Regex("\\s").e(ba9.k(textView), "");
            int length = e.length();
            if (length >= 12 && length <= 19) {
                int i2 = length - 1;
                if (i2 >= 0) {
                    boolean z = false;
                    i = 0;
                    while (true) {
                        int i3 = i2 - 1;
                        char charAt = e.charAt(i2);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        int f = a.f(charAt);
                        if (z && (f = f * 2) > 9) {
                            f = (f % 10) + 1;
                        }
                        i += f;
                        z = !z;
                        if (i3 < 0) {
                            break;
                        }
                        i2 = i3;
                    }
                } else {
                    i = 0;
                }
                return i % 10 == 0;
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    private final boolean b(TextView textView) {
        if (c11.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String k = ba9.k(textView);
            if (k != null && k.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(k).matches();
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    private final boolean c(TextView textView) {
        if (c11.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    private final boolean d(TextView textView) {
        if (c11.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    private final boolean e(TextView textView) {
        if (c11.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    private final boolean f(TextView textView) {
        if (c11.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    public static final boolean g(View view) {
        if (c11.d(yj7.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            yj7 yj7Var = a;
            if (!yj7Var.c((TextView) view) && !yj7Var.a((TextView) view) && !yj7Var.d((TextView) view) && !yj7Var.f((TextView) view) && !yj7Var.e((TextView) view)) {
                if (!yj7Var.b((TextView) view)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            c11.b(th, yj7.class);
            return false;
        }
    }
}
