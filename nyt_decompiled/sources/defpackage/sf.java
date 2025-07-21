package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.text.MultiParagraph;
import java.util.List;

/* loaded from: classes.dex */
public abstract class sf {
    public static final void a(MultiParagraph multiParagraph, ph0 ph0Var, yc0 yc0Var, float f, jo7 jo7Var, ph8 ph8Var, gv1 gv1Var, int i) {
        ph0Var.t();
        if (multiParagraph.w().size() <= 1) {
            b(multiParagraph, ph0Var, yc0Var, f, jo7Var, ph8Var, gv1Var, i);
        } else if (yc0Var instanceof ox7) {
            b(multiParagraph, ph0Var, yc0Var, f, jo7Var, ph8Var, gv1Var, i);
        } else if (yc0Var instanceof ho7) {
            List w = multiParagraph.w();
            int size = w.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                jo5 jo5Var = (jo5) w.get(i2);
                f3 += jo5Var.e().getHeight();
                f2 = Math.max(f2, jo5Var.e().getWidth());
            }
            Shader b = ((ho7) yc0Var).b(du7.a(f2, f3));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            List w2 = multiParagraph.w();
            int size2 = w2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                jo5 jo5Var2 = (jo5) w2.get(i3);
                jo5Var2.e().r(ph0Var, zc0.a(b), f, jo7Var, ph8Var, gv1Var, i);
                ph0Var.c(0.0f, jo5Var2.e().getHeight());
                matrix.setTranslate(0.0f, -jo5Var2.e().getHeight());
                b.setLocalMatrix(matrix);
            }
        }
        ph0Var.k();
    }

    private static final void b(MultiParagraph multiParagraph, ph0 ph0Var, yc0 yc0Var, float f, jo7 jo7Var, ph8 ph8Var, gv1 gv1Var, int i) {
        List w = multiParagraph.w();
        int size = w.size();
        for (int i2 = 0; i2 < size; i2++) {
            jo5 jo5Var = (jo5) w.get(i2);
            jo5Var.e().r(ph0Var, yc0Var, f, jo7Var, ph8Var, gv1Var, i);
            ph0Var.c(0.0f, jo5Var.e().getHeight());
        }
    }
}
