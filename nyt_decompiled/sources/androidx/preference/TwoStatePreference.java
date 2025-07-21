package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean p0;
    private CharSequence q0;
    private CharSequence r0;
    private boolean s0;
    private boolean t0;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public boolean G0() {
        return (this.t0 ? this.p0 : !this.p0) || super.G0();
    }

    public boolean L0() {
        return this.p0;
    }

    public void M0(boolean z) {
        boolean z2 = this.p0 != z;
        if (z2 || !this.s0) {
            this.p0 = z;
            this.s0 = true;
            g0(z);
            if (z2) {
                N(G0());
                M();
            }
        }
    }

    public void N0(boolean z) {
        this.t0 = z;
    }

    public void O0(CharSequence charSequence) {
        this.r0 = charSequence;
        if (L0()) {
            return;
        }
        M();
    }

    public void P0(CharSequence charSequence) {
        this.q0 = charSequence;
        if (L0()) {
            M();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void Q0(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.p0
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r3.q0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r3.q0
            r4.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r3.p0
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.r0
            r4.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r3 = r3.C()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L3e
            r4.setText(r3)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r3 = r4.getVisibility()
            if (r1 == r3) goto L4c
            r4.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.Q0(android.view.View):void");
    }

    protected void R0(h hVar) {
        Q0(hVar.W(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void T() {
        super.T();
        boolean z = !L0();
        if (b(Boolean.valueOf(z))) {
            M0(z);
        }
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a0(savedState.getSuperState());
        M0(savedState.mChecked);
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable b0 = super.b0();
        if (J()) {
            return b0;
        }
        SavedState savedState = new SavedState(b0);
        savedState.mChecked = L0();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void c0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        M0(v(((Boolean) obj).booleanValue()));
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean mChecked;

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
            this.mChecked = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mChecked ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
