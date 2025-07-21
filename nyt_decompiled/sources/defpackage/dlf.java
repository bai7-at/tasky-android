package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import defpackage.h51;

/* loaded from: classes2.dex */
final class dlf implements rqa {
    final /* synthetic */ tqa a;
    final /* synthetic */ Context b;
    final /* synthetic */ Uri c;

    dlf(wxf wxfVar, tqa tqaVar, Context context, Uri uri) {
        this.a = tqaVar;
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.rqa
    public final void zza() {
        h51 a = new h51.b(this.a.a()).a();
        a.a.setPackage(m4f.a(this.b));
        a.a(this.b, this.c);
        this.a.f((Activity) this.b);
    }
}
