package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import defpackage.ho7;
import defpackage.ng;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.x08;
import defpackage.zt7;

/* loaded from: classes.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    private final ho7 a;
    private final float b;
    private final sy4 c = b0.e(zt7.c(zt7.b.a()), null, 2, null);
    private final x08 d = y.d(new qs2() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$shaderState$1
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Shader mo865invoke() {
            if (ShaderBrushSpan.this.b() == zt7.b.a() || zt7.k(ShaderBrushSpan.this.b())) {
                return null;
            }
            return ShaderBrushSpan.this.a().b(ShaderBrushSpan.this.b());
        }
    });

    public ShaderBrushSpan(ho7 ho7Var, float f) {
        this.a = ho7Var;
        this.b = f;
    }

    public final ho7 a() {
        return this.a;
    }

    public final long b() {
        return ((zt7) this.c.getValue()).m();
    }

    public final void c(long j) {
        this.c.setValue(zt7.c(j));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        ng.a(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
