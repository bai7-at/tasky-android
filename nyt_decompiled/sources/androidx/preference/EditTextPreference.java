package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import defpackage.co6;
import defpackage.ic6;
import defpackage.kl6;
import defpackage.nu8;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    private String v0;

    public interface a {
    }

    public static final class b implements Preference.f {
        private static b a;

        private b() {
        }

        public static b b() {
            if (a == null) {
                a = new b();
            }
            return a;
        }

        @Override // androidx.preference.Preference.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.V0()) ? editTextPreference.j().getString(kl6.not_set) : editTextPreference.V0();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co6.EditTextPreference, i, i2);
        int i3 = co6.EditTextPreference_useSimpleSummaryProvider;
        if (nu8.b(obtainStyledAttributes, i3, i3, false)) {
            D0(b.b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean G0() {
        return TextUtils.isEmpty(this.v0) || super.G0();
    }

    a U0() {
        return null;
    }

    public String V0() {
        return this.v0;
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public void W0(String str) {
        boolean G0 = G0();
        this.v0 = str;
        i0(str);
        boolean G02 = G0();
        if (G02 != G0) {
            N(G02);
        }
        M();
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a0(savedState.getSuperState());
        W0(savedState.mText);
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable b0 = super.b0();
        if (J()) {
            return b0;
        }
        SavedState savedState = new SavedState(b0);
        savedState.mText = V0();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void c0(Object obj) {
        W0(x((String) obj));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String mText;

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
            this.mText = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.mText);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nu8.a(context, ic6.editTextPreferenceStyle, R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(Context context) {
        this(context, null);
    }
}
