package defpackage;

import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public class q20 {
    private final Object a;

    private q20(AutofillId autofillId) {
        this.a = autofillId;
    }

    public static q20 b(AutofillId autofillId) {
        return new q20(autofillId);
    }

    public AutofillId a() {
        return (AutofillId) this.a;
    }
}
