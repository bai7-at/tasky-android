package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import defpackage.co6;
import defpackage.ic6;
import defpackage.kl6;
import defpackage.nu8;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private CharSequence[] v0;
    private CharSequence[] w0;
    private String x0;
    private String y0;
    private boolean z0;

    public static final class a implements Preference.f {
        private static a a;

        private a() {
        }

        public static a b() {
            if (a == null) {
                a = new a();
            }
            return a;
        }

        @Override // androidx.preference.Preference.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.W0()) ? listPreference.j().getString(kl6.not_set) : listPreference.W0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co6.ListPreference, i, i2);
        this.v0 = nu8.o(obtainStyledAttributes, co6.ListPreference_entries, co6.ListPreference_android_entries);
        this.w0 = nu8.o(obtainStyledAttributes, co6.ListPreference_entryValues, co6.ListPreference_android_entryValues);
        int i3 = co6.ListPreference_useSimpleSummaryProvider;
        if (nu8.b(obtainStyledAttributes, i3, i3, false)) {
            D0(a.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, co6.Preference, i, i2);
        this.y0 = nu8.m(obtainStyledAttributes2, co6.Preference_summary, co6.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    private int Z0() {
        return U0(this.x0);
    }

    @Override // androidx.preference.Preference
    public CharSequence C() {
        if (D() != null) {
            return D().a(this);
        }
        CharSequence W0 = W0();
        CharSequence C = super.C();
        String str = this.y0;
        if (str == null) {
            return C;
        }
        if (W0 == null) {
            W0 = "";
        }
        String format = String.format(str, W0);
        if (TextUtils.equals(format, C)) {
            return C;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public void C0(CharSequence charSequence) {
        super.C0(charSequence);
        if (charSequence == null) {
            this.y0 = null;
        } else {
            this.y0 = charSequence.toString();
        }
    }

    public int U0(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.w0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.w0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] V0() {
        return this.v0;
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public CharSequence W0() {
        CharSequence[] charSequenceArr;
        int Z0 = Z0();
        if (Z0 < 0 || (charSequenceArr = this.v0) == null) {
            return null;
        }
        return charSequenceArr[Z0];
    }

    public CharSequence[] X0() {
        return this.w0;
    }

    public String Y0() {
        return this.x0;
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a0(savedState.getSuperState());
        c1(savedState.mValue);
    }

    public void a1(CharSequence[] charSequenceArr) {
        this.v0 = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable b0 = super.b0();
        if (J()) {
            return b0;
        }
        SavedState savedState = new SavedState(b0);
        savedState.mValue = Y0();
        return savedState;
    }

    public void b1(CharSequence[] charSequenceArr) {
        this.w0 = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    protected void c0(Object obj) {
        c1(x((String) obj));
    }

    public void c1(String str) {
        boolean equals = TextUtils.equals(this.x0, str);
        if (equals && this.z0) {
            return;
        }
        this.x0 = str;
        this.z0 = true;
        i0(str);
        if (equals) {
            return;
        }
        M();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String mValue;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.mValue = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.mValue);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nu8.a(context, ic6.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context) {
        this(context, null);
    }
}
