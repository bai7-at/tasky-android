package defpackage;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.Map;
import kotlin.NotImplementedError;

/* loaded from: classes.dex */
public abstract class td {
    public static final void a(sd sdVar, SparseArray sparseArray) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
            n20 n20Var = n20.a;
            if (n20Var.d(autofillValue)) {
                sdVar.b().b(keyAt, n20Var.i(autofillValue).toString());
            } else {
                if (n20Var.b(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (n20Var.c(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (n20Var.e(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(sd sdVar, ViewStructure viewStructure) {
        int a = m20.a.a(viewStructure, sdVar.b().a().size());
        for (Map.Entry entry : sdVar.b().a().entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            lh4.a(entry.getValue());
            m20 m20Var = m20.a;
            ViewStructure b = m20Var.b(viewStructure, a);
            if (b != null) {
                n20 n20Var = n20.a;
                AutofillId a2 = n20Var.a(viewStructure);
                zq3.e(a2);
                n20Var.g(b, a2, intValue);
                m20Var.d(b, intValue, sdVar.c().getContext().getPackageName(), null, null);
                n20Var.h(b, 1);
                throw null;
            }
            a++;
        }
    }
}
