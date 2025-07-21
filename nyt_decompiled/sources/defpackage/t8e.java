package defpackage;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class t8e implements w8e {
    private static final t8e f = new t8e(new x8e());
    protected final u9e a = new u9e();
    private Date b;
    private boolean c;
    private final x8e d;
    private boolean e;

    private t8e(x8e x8eVar) {
        this.d = x8eVar;
    }

    public static t8e b() {
        return f;
    }

    @Override // defpackage.w8e
    public final void a(boolean z) {
        if (!this.e && z) {
            Date date = new Date();
            Date date2 = this.b;
            if (date2 == null || date.after(date2)) {
                this.b = date;
                if (this.c) {
                    Iterator it2 = v8e.a().b().iterator();
                    while (it2.hasNext()) {
                        ((n8e) it2.next()).g().e(c());
                    }
                }
            }
        }
        this.e = z;
    }

    public final Date c() {
        Date date = this.b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void d(Context context) {
        if (this.c) {
            return;
        }
        this.d.f(context);
        this.d.g(this);
        this.d.h();
        this.e = this.d.b;
        this.c = true;
    }
}
