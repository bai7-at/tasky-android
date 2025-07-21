package com.nytimes.android.widget;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.a;
import com.nytimes.android.widget.BrazilDisclaimer;
import defpackage.ml6;
import defpackage.tm;
import java.util.Locale;

/* loaded from: classes4.dex */
public class BrazilDisclaimer {
    private static final String PORTUEGUESE = "portugu";
    public static final int REQUEST_EXIT = 1;
    private final Activity activity;
    private a alertDialog;
    private final tm appPreferencesManager;

    public BrazilDisclaimer(Activity activity, tm tmVar) {
        this.activity = activity;
        this.appPreferencesManager = tmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$displayBrazilDisclaimer$0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.activity.setResult(1, null);
        this.activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$displayBrazilDisclaimer$1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.appPreferencesManager.e();
    }

    public void dismiss() {
        a aVar = this.alertDialog;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public void displayBrazilDisclaimer() {
        if (!Locale.getDefault().getDisplayLanguage().startsWith(PORTUEGUESE) || this.appPreferencesManager.d()) {
            return;
        }
        a create = new a.C0012a(this.activity).o(ml6.brazil_disclaimer_title).e(ml6.brazil_disclaimer_msg).b(false).setNegativeButton(ml6.brazil_disclaimer_no, new DialogInterface.OnClickListener() { // from class: dc0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BrazilDisclaimer.this.lambda$displayBrazilDisclaimer$0(dialogInterface, i);
            }
        }).setPositiveButton(ml6.brazil_disclaimer_yes, new DialogInterface.OnClickListener() { // from class: ec0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BrazilDisclaimer.this.lambda$displayBrazilDisclaimer$1(dialogInterface, i);
            }
        }).create();
        this.alertDialog = create;
        create.show();
    }
}
