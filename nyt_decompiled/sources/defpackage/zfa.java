package defpackage;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes2.dex */
final class zfa implements DialogInterface.OnClickListener {
    final /* synthetic */ aha a;

    zfa(aha ahaVar) {
        this.a = ahaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dyf.r();
        wxf.t(this.a.a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
