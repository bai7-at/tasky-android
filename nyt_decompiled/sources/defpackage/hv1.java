package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import defpackage.v48;
import defpackage.x48;

/* loaded from: classes.dex */
public final class hv1 extends CharacterStyle implements UpdateAppearance {
    private final gv1 a;

    public hv1(gv1 gv1Var) {
        this.a = gv1Var;
    }

    private final Paint.Cap a(int i) {
        v48.a aVar = v48.a;
        return v48.e(i, aVar.a()) ? Paint.Cap.BUTT : v48.e(i, aVar.b()) ? Paint.Cap.ROUND : v48.e(i, aVar.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    private final Paint.Join b(int i) {
        x48.a aVar = x48.a;
        return x48.e(i, aVar.b()) ? Paint.Join.MITER : x48.e(i, aVar.c()) ? Paint.Join.ROUND : x48.e(i, aVar.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            gv1 gv1Var = this.a;
            if (zq3.c(gv1Var, qf2.a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (gv1Var instanceof u48) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((u48) this.a).f());
                textPaint.setStrokeMiter(((u48) this.a).d());
                textPaint.setStrokeJoin(b(((u48) this.a).c()));
                textPaint.setStrokeCap(a(((u48) this.a).b()));
                ((u48) this.a).e();
                textPaint.setPathEffect(null);
            }
        }
    }
}
