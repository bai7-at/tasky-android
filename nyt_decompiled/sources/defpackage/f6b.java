package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* loaded from: classes3.dex */
final class f6b implements DialogInterface.OnClickListener {
    final /* synthetic */ h6b a;

    f6b(h6b h6bVar) {
        this.a = h6bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        h6b h6bVar = this.a;
        Intent i2 = h6bVar.i();
        dyf.r();
        context = h6bVar.d;
        wxf.s(context, i2);
    }
}
