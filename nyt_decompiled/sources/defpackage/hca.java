package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
final class hca implements pba {
    private File a = null;
    final /* synthetic */ Context b;

    hca(Context context) {
        this.b = context;
    }

    @Override // defpackage.pba
    public final File zza() {
        if (this.a == null) {
            this.a = new File(this.b.getCacheDir(), "volley");
        }
        return this.a;
    }
}
