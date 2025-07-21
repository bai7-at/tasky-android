package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes2.dex */
final class aha implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;

    aha(fia fiaVar, Context context, String str, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyf.r();
        AlertDialog.Builder j = wxf.j(this.a);
        j.setMessage(this.b);
        if (this.c) {
            j.setTitle("Error");
        } else {
            j.setTitle("Info");
        }
        if (this.d) {
            j.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            j.setPositiveButton("Learn More", new zfa(this));
            j.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        j.create().show();
    }
}
