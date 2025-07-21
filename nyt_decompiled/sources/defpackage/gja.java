package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.x5;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class gja extends jba {
    private final Context d;

    private gja(Context context, iba ibaVar) {
        super(ibaVar);
        this.d = context;
    }

    public static aba b(Context context) {
        aba abaVar = new aba(new qba(new File(context.getCacheDir(), "admob_volley"), 20971520), new gja(context, new cca()), 4);
        abaVar.d();
        return abaVar;
    }

    @Override // defpackage.jba, defpackage.oaa
    public final qaa a(zaa zaaVar) {
        if (zaaVar.zza() == 0) {
            if (Pattern.matches((String) pla.c().a(mpa.s4), zaaVar.k())) {
                Context context = this.d;
                kia.b();
                if (tfb.u(context, 13400000)) {
                    qaa a = new x5(this.d).a(zaaVar);
                    if (a != null) {
                        pzc.k("Got gmscore asset response: ".concat(String.valueOf(zaaVar.k())));
                        return a;
                    }
                    pzc.k("Failed to get gmscore asset response: ".concat(String.valueOf(zaaVar.k())));
                }
            }
        }
        return super.a(zaaVar);
    }
}
