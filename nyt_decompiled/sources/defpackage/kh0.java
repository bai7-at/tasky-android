package defpackage;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class kh0 extends oh8 {
    private final Typeface a;
    private final a b;
    private boolean c;

    public interface a {
        void a(Typeface typeface);
    }

    public kh0(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    private void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    @Override // defpackage.oh8
    public void a(int i) {
        d(this.a);
    }

    @Override // defpackage.oh8
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }
}
