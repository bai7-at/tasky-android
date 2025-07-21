package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e9e implements w8e {
    private static e9e f;
    private float a = 0.0f;
    private final s8e b;
    private final q8e c;
    private r8e d;
    private v8e e;

    public e9e(s8e s8eVar, q8e q8eVar) {
        this.b = s8eVar;
        this.c = q8eVar;
    }

    public static e9e c() {
        if (f == null) {
            f = new e9e(new s8e(), new q8e());
        }
        return f;
    }

    @Override // defpackage.w8e
    public final void a(boolean z) {
        if (z) {
            fae.d().i();
        } else {
            fae.d().h();
        }
    }

    public final float b() {
        return this.a;
    }

    public final void d(Context context) {
        this.d = new r8e(new Handler(), context, new p8e(), this);
    }

    public final void e(float f2) {
        this.a = f2;
        if (this.e == null) {
            this.e = v8e.a();
        }
        Iterator it2 = this.e.b().iterator();
        while (it2.hasNext()) {
            ((n8e) it2.next()).g().i(f2);
        }
    }

    public final void f() {
        u8e.k().g(this);
        u8e.k().h();
        fae.d().i();
        this.d.a();
    }

    public final void g() {
        fae.d().j();
        u8e.k().i();
        this.d.b();
    }
}
