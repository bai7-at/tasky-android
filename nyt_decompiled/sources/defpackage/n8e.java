package defpackage;

import android.view.View;
import com.google.android.gms.internal.ads.zzfog;
import com.google.android.gms.internal.ads.zzfok;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class n8e extends k8e {
    private static final Pattern i = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final m8e a;
    private final l8e b;
    private mae d;
    private k9e e;
    private final List c = new ArrayList();
    private boolean f = false;
    private boolean g = false;
    private final String h = UUID.randomUUID().toString();

    n8e(l8e l8eVar, m8e m8eVar) {
        this.b = l8eVar;
        this.a = m8eVar;
        k(null);
        if (m8eVar.d() == zzfog.HTML || m8eVar.d() == zzfog.JAVASCRIPT) {
            this.e = new l9e(m8eVar.a());
        } else {
            this.e = new o9e(m8eVar.i(), null);
        }
        this.e.k();
        v8e.a().d(this);
        d9e.a().d(this.e.a(), l8eVar.b());
    }

    private final void k(View view) {
        this.d = new mae(view);
    }

    @Override // defpackage.k8e
    public final void b(View view, zzfok zzfokVar, String str) {
        y8e y8eVar;
        if (this.g) {
            return;
        }
        if (!i.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it2 = this.c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                y8eVar = null;
                break;
            } else {
                y8eVar = (y8e) it2.next();
                if (y8eVar.b().get() == view) {
                    break;
                }
            }
        }
        if (y8eVar == null) {
            this.c.add(new y8e(view, zzfokVar, "Ad overlay"));
        }
    }

    @Override // defpackage.k8e
    public final void c() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.clear();
        }
        this.g = true;
        d9e.a().c(this.e.a());
        v8e.a().e(this);
        this.e.c();
        this.e = null;
    }

    @Override // defpackage.k8e
    public final void d(View view) {
        if (this.g || f() == view) {
            return;
        }
        k(view);
        this.e.b();
        Collection<n8e> c = v8e.a().c();
        if (c == null || c.isEmpty()) {
            return;
        }
        for (n8e n8eVar : c) {
            if (n8eVar != this && n8eVar.f() == view) {
                n8eVar.d.clear();
            }
        }
    }

    @Override // defpackage.k8e
    public final void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        v8e.a().f(this);
        this.e.i(e9e.c().b());
        this.e.e(t8e.b().c());
        this.e.g(this, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f() {
        return (View) this.d.get();
    }

    public final k9e g() {
        return this.e;
    }

    public final String h() {
        return this.h;
    }

    public final List i() {
        return this.c;
    }

    public final boolean j() {
        return this.f && !this.g;
    }
}
