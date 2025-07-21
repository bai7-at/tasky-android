package defpackage;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
final class m6b implements DialogInterface.OnClickListener {
    final /* synthetic */ n6b a;

    m6b(n6b n6bVar) {
        this.a = n6bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c("User canceled the download.");
    }
}
