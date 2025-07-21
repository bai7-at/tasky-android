package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.a;

/* loaded from: classes4.dex */
public final class g87 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(qs2 qs2Var, DialogInterface dialogInterface, int i) {
        zq3.h(qs2Var, "$onPositiveButton");
        qs2Var.mo865invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DialogInterface dialogInterface, int i) {
    }

    public final void c(Context context, final qs2 qs2Var) {
        zq3.h(context, "activity");
        zq3.h(qs2Var, "onPositiveButton");
        new a.C0012a(new vx0(context, sm6.AppTheme)).e(cm6.loginToSave).setPositiveButton(lk6.login, new DialogInterface.OnClickListener() { // from class: e87
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                g87.d(qs2.this, dialogInterface, i);
            }
        }).setNegativeButton(lk6.cancel, new DialogInterface.OnClickListener() { // from class: f87
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                g87.e(dialogInterface, i);
            }
        }).p();
    }
}
