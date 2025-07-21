package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.preference.ListPreference;
import androidx.preference.c;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes.dex */
public class c64 extends c {
    int i;
    private CharSequence[] j;
    private CharSequence[] k;

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            c64 c64Var = c64.this;
            c64Var.i = i;
            c64Var.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference l1() {
        return (ListPreference) d1();
    }

    public static c64 m1(String str) {
        c64 c64Var = new c64();
        Bundle bundle = new Bundle(1);
        bundle.putString(TransferTable.COLUMN_KEY, str);
        c64Var.setArguments(bundle);
        return c64Var;
    }

    @Override // androidx.preference.c
    public void h1(boolean z) {
        int i;
        if (!z || (i = this.i) < 0) {
            return;
        }
        String charSequence = this.k[i].toString();
        ListPreference l1 = l1();
        if (l1.b(charSequence)) {
            l1.c1(charSequence);
        }
    }

    @Override // androidx.preference.c
    protected void i1(a.C0012a c0012a) {
        super.i1(c0012a);
        c0012a.n(this.j, this.i, new a());
        c0012a.l(null, null);
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.i = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.j = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference l1 = l1();
        if (l1.V0() == null || l1.X0() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.i = l1.U0(l1.Y0());
        this.j = l1.V0();
        this.k = l1.X0();
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.i);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.k);
    }
}
