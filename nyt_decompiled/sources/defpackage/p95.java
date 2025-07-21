package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.l95;

/* loaded from: classes.dex */
abstract class p95 {
    private static final Object a = new Object();
    private static final Object b = new Object();

    static Bundle a(l95.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d = aVar.d();
        bundle.putInt("icon", d != null ? d.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(cw6 cw6Var) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(cw6[] cw6VarArr) {
        if (cw6VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[cw6VarArr.length];
        for (int i = 0; i < cw6VarArr.length; i++) {
            cw6 cw6Var = cw6VarArr[i];
            bundleArr[i] = b(null);
        }
        return bundleArr;
    }
}
