package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class zh8 {
    private float c;
    private float d;
    private mh8 g;
    private final TextPaint a = new TextPaint(1);
    private final oh8 b = new a();
    private boolean e = true;
    private WeakReference f = new WeakReference(null);

    class a extends oh8 {
        a() {
        }

        @Override // defpackage.oh8
        public void a(int i) {
            zh8.this.e = true;
            b bVar = (b) zh8.this.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.oh8
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            zh8.this.e = true;
            b bVar = (b) zh8.this.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public zh8(b bVar) {
        i(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    private void h(String str) {
        this.c = d(str);
        this.d = c(str);
        this.e = false;
    }

    public mh8 e() {
        return this.g;
    }

    public TextPaint f() {
        return this.a;
    }

    public float g(String str) {
        if (!this.e) {
            return this.c;
        }
        h(str);
        return this.c;
    }

    public void i(b bVar) {
        this.f = new WeakReference(bVar);
    }

    public void j(mh8 mh8Var, Context context) {
        if (this.g != mh8Var) {
            this.g = mh8Var;
            if (mh8Var != null) {
                mh8Var.o(context, this.a, this.b);
                b bVar = (b) this.f.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                mh8Var.n(context, this.a, this.b);
                this.e = true;
            }
            b bVar2 = (b) this.f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z) {
        this.e = z;
    }

    public void l(Context context) {
        this.g.n(context, this.a, this.b);
    }
}
