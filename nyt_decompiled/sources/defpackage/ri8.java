package defpackage;

import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.b;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ri8 {
    private final yu5 a;
    private final AtomicReference b = new AtomicReference(null);

    public ri8(yu5 yu5Var) {
        this.a = yu5Var;
    }

    public final vi8 a() {
        return (vi8) this.b.get();
    }

    public final void b() {
        this.a.b();
    }

    public final void c() {
        if (a() != null) {
            this.a.f();
        }
    }

    public vi8 d(TextFieldValue textFieldValue, b bVar, ss2 ss2Var, ss2 ss2Var2) {
        this.a.g(textFieldValue, bVar, ss2Var, ss2Var2);
        vi8 vi8Var = new vi8(this, this.a);
        this.b.set(vi8Var);
        return vi8Var;
    }

    public void e(vi8 vi8Var) {
        if (kz4.a(this.b, vi8Var, null)) {
            this.a.a();
        }
    }
}
