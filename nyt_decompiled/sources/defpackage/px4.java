package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.c;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class px4 extends c {
    Set i = new HashSet();
    boolean j;
    CharSequence[] k;
    CharSequence[] l;

    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (z) {
                px4 px4Var = px4.this;
                px4Var.j |= px4Var.i.add(px4Var.l[i].toString());
            } else {
                px4 px4Var2 = px4.this;
                px4Var2.j |= px4Var2.i.remove(px4Var2.l[i].toString());
            }
        }
    }

    private MultiSelectListPreference l1() {
        return (MultiSelectListPreference) d1();
    }

    public static px4 m1(String str) {
        px4 px4Var = new px4();
        Bundle bundle = new Bundle(1);
        bundle.putString(TransferTable.COLUMN_KEY, str);
        px4Var.setArguments(bundle);
        return px4Var;
    }

    @Override // androidx.preference.c
    public void h1(boolean z) {
        if (z && this.j) {
            MultiSelectListPreference l1 = l1();
            if (l1.b(this.i)) {
                l1.X0(this.i);
            }
        }
        this.j = false;
    }

    @Override // androidx.preference.c
    protected void i1(a.C0012a c0012a) {
        super.i1(c0012a);
        int length = this.l.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.i.contains(this.l[i].toString());
        }
        c0012a.g(this.k, zArr, new a());
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.i.clear();
            this.i.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.j = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.k = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference l1 = l1();
        if (l1.U0() == null || l1.V0() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.i.clear();
        this.i.addAll(l1.W0());
        this.j = false;
        this.k = l1.U0();
        this.l = l1.V0();
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.i));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.j);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.l);
    }
}
