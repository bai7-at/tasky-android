package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import defpackage.co6;
import defpackage.ic6;
import defpackage.nu8;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] v0;
    private CharSequence[] w0;
    private Set x0;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.x0 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co6.MultiSelectListPreference, i, i2);
        this.v0 = nu8.o(obtainStyledAttributes, co6.MultiSelectListPreference_entries, co6.MultiSelectListPreference_android_entries);
        this.w0 = nu8.o(obtainStyledAttributes, co6.MultiSelectListPreference_entryValues, co6.MultiSelectListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
    }

    public CharSequence[] U0() {
        return this.v0;
    }

    public CharSequence[] V0() {
        return this.w0;
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public Set W0() {
        return this.x0;
    }

    public void X0(Set set) {
        this.x0.clear();
        this.x0.addAll(set);
        j0(set);
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
        X0(savedState.mValues);
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable b0 = super.b0();
        if (J()) {
            return b0;
        }
        SavedState savedState = new SavedState(b0);
        savedState.mValues = W0();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void c0(Object obj) {
        X0(y((Set) obj));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        Set<String> mValues;

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
            int readInt = parcel.readInt();
            this.mValues = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.mValues, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mValues.size());
            Set<String> set = this.mValues;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nu8.a(context, ic6.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
