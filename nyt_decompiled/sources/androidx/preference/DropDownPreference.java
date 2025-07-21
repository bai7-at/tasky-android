package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import defpackage.ic6;
import defpackage.rf6;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context A0;
    private final ArrayAdapter B0;
    private Spinner C0;
    private final AdapterView.OnItemSelectedListener D0;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.X0()[i].toString();
                if (charSequence.equals(DropDownPreference.this.Y0()) || !DropDownPreference.this.b(charSequence)) {
                    return;
                }
                DropDownPreference.this.c1(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic6.dropdownPreferenceStyle);
    }

    private int e1(String str) {
        CharSequence[] X0 = X0();
        if (str == null || X0 == null) {
            return -1;
        }
        for (int length = X0.length - 1; length >= 0; length--) {
            if (TextUtils.equals(X0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    private void f1() {
        this.B0.clear();
        if (V0() != null) {
            for (CharSequence charSequence : V0()) {
                this.B0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    protected void M() {
        super.M();
        ArrayAdapter arrayAdapter = this.B0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        Spinner spinner = (Spinner) hVar.a.findViewById(rf6.spinner);
        this.C0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.B0);
        this.C0.setOnItemSelectedListener(this.D0);
        this.C0.setSelection(e1(Y0()));
        super.S(hVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void T() {
        this.C0.performClick();
    }

    protected ArrayAdapter d1() {
        return new ArrayAdapter(this.A0, R.layout.simple_spinner_dropdown_item);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.D0 = new a();
        this.A0 = context;
        this.B0 = d1();
        f1();
    }
}
