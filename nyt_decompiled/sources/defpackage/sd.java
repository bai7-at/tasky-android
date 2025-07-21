package defpackage;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class sd implements l20 {
    private final View a;
    private final r20 b;
    private final AutofillManager c;

    public sd(View view, r20 r20Var) {
        this.a = view;
        this.b = r20Var;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = autofillManager;
        view.setImportantForAutofill(1);
    }

    public final AutofillManager a() {
        return this.c;
    }

    public final r20 b() {
        return this.b;
    }

    public final View c() {
        return this.a;
    }
}
