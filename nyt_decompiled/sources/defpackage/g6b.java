package defpackage;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
final class g6b implements DialogInterface.OnClickListener {
    final /* synthetic */ h6b a;

    g6b(h6b h6bVar) {
        this.a = h6bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c("Operation denied by user.");
    }
}
