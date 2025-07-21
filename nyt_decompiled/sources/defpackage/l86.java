package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.a;

/* loaded from: classes4.dex */
public final class l86 {
    public static final l86 a = new l86();

    private l86() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public final void b(Context context) {
        zq3.h(context, "context");
        a.C0012a c0012a = new a.C0012a(new vx0(context, sm6.AppTheme));
        c0012a.e(ul6.purchase_error_dialog_message);
        c0012a.setPositiveButton(ul6.purchase_error_dialog_button_text, new DialogInterface.OnClickListener() { // from class: k86
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                l86.c(dialogInterface, i);
            }
        });
        c0012a.p();
    }
}
