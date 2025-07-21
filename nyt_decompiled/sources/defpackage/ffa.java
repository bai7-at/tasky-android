package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.n0;
import com.google.android.gms.internal.ads.u0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ffa extends efa {
    protected ffa(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static ffa u(String str, Context context, boolean z) {
        efa.q(context, false);
        return new ffa(context, str, false);
    }

    public static ffa v(String str, Context context, boolean z, int i) {
        efa.q(context, z);
        return new ffa(context, str, z);
    }

    @Override // defpackage.efa
    protected final List o(jga jgaVar, Context context, u0 u0Var, n0 n0Var) {
        if (jgaVar.k() == null || !this.B) {
            return super.o(jgaVar, context, u0Var, null);
        }
        int a = jgaVar.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.o(jgaVar, context, u0Var, null));
        arrayList.add(new gha(jgaVar, "8UEA9TmdE+sqV3zcsNgnFI5Sf8uIsQHU61W37Ddl8zaNqY23x/FpuoK+mm9MWruA", "qlbJd0rViXaFpU2SvrkcezPlE/VtgXulMFWFUXmIBBg=", u0Var, a, 24));
        return arrayList;
    }
}
