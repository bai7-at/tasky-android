package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import defpackage.co6;
import defpackage.hs7;
import defpackage.nu8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    final hs7 p0;
    private final Handler q0;
    private final List r0;
    private boolean s0;
    private int t0;
    private boolean u0;
    private int v0;
    private final Runnable w0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.p0.clear();
            }
        }
    }

    public interface b {
    }

    public interface c {
        int b(Preference preference);

        int h(String str);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.p0 = new hs7();
        this.q0 = new Handler(Looper.getMainLooper());
        this.s0 = true;
        this.t0 = 0;
        this.u0 = false;
        this.v0 = Integer.MAX_VALUE;
        this.w0 = new a();
        this.r0 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co6.PreferenceGroup, i, i2);
        int i3 = co6.PreferenceGroup_orderingFromXml;
        this.s0 = nu8.b(obtainStyledAttributes, i3, i3, true);
        if (obtainStyledAttributes.hasValue(co6.PreferenceGroup_initialExpandedChildrenCount)) {
            int i4 = co6.PreferenceGroup_initialExpandedChildrenCount;
            W0(nu8.d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    private boolean V0(Preference preference) {
        boolean remove;
        synchronized (this) {
            try {
                preference.Z();
                if (preference.u() == this) {
                    preference.a(null);
                }
                remove = this.r0.remove(preference);
                if (remove) {
                    String q = preference.q();
                    if (q != null) {
                        this.p0.put(q, Long.valueOf(preference.o()));
                        this.q0.removeCallbacks(this.w0);
                        this.q0.post(this.w0);
                    }
                    if (this.u0) {
                        preference.V();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    public void L0(Preference preference) {
        M0(preference);
    }

    public boolean M0(Preference preference) {
        long f;
        if (this.r0.contains(preference)) {
            return true;
        }
        if (preference.q() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.u() != null) {
                preferenceGroup = preferenceGroup.u();
            }
            String q = preference.q();
            if (preferenceGroup.N0(q) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + q + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.t() == Integer.MAX_VALUE) {
            if (this.s0) {
                int i = this.t0;
                this.t0 = i + 1;
                preference.z0(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).X0(this.s0);
            }
        }
        int binarySearch = Collections.binarySearch(this.r0, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (!T0(preference)) {
            return false;
        }
        synchronized (this) {
            this.r0.add(binarySearch, preference);
        }
        g A = A();
        String q2 = preference.q();
        if (q2 == null || !this.p0.containsKey(q2)) {
            f = A.f();
        } else {
            f = ((Long) this.p0.get(q2)).longValue();
            this.p0.remove(q2);
        }
        preference.R(A, f);
        preference.a(this);
        if (this.u0) {
            preference.P();
        }
        O();
        return true;
    }

    @Override // androidx.preference.Preference
    public void N(boolean z) {
        super.N(z);
        int R0 = R0();
        for (int i = 0; i < R0; i++) {
            Q0(i).Y(this, z);
        }
    }

    public Preference N0(CharSequence charSequence) {
        Preference N0;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(q(), charSequence)) {
            return this;
        }
        int R0 = R0();
        for (int i = 0; i < R0; i++) {
            Preference Q0 = Q0(i);
            if (TextUtils.equals(Q0.q(), charSequence)) {
                return Q0;
            }
            if ((Q0 instanceof PreferenceGroup) && (N0 = ((PreferenceGroup) Q0).N0(charSequence)) != null) {
                return N0;
            }
        }
        return null;
    }

    public int O0() {
        return this.v0;
    }

    @Override // androidx.preference.Preference
    public void P() {
        super.P();
        this.u0 = true;
        int R0 = R0();
        for (int i = 0; i < R0; i++) {
            Q0(i).P();
        }
    }

    public b P0() {
        return null;
    }

    public Preference Q0(int i) {
        return (Preference) this.r0.get(i);
    }

    public int R0() {
        return this.r0.size();
    }

    protected boolean S0() {
        return true;
    }

    protected boolean T0(Preference preference) {
        preference.Y(this, G0());
        return true;
    }

    public boolean U0(Preference preference) {
        boolean V0 = V0(preference);
        O();
        return V0;
    }

    @Override // androidx.preference.Preference
    public void V() {
        super.V();
        this.u0 = false;
        int R0 = R0();
        for (int i = 0; i < R0; i++) {
            Q0(i).V();
        }
    }

    public void W0(int i) {
        if (i != Integer.MAX_VALUE && !G()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.v0 = i;
    }

    public void X0(boolean z) {
        this.s0 = z;
    }

    void Y0() {
        synchronized (this) {
            Collections.sort(this.r0);
        }
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.v0 = savedState.mInitialExpandedChildrenCount;
        super.a0(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        return new SavedState(super.b0(), this.v0);
    }

    @Override // androidx.preference.Preference
    protected void e(Bundle bundle) {
        super.e(bundle);
        int R0 = R0();
        for (int i = 0; i < R0; i++) {
            Q0(i).e(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void f(Bundle bundle) {
        super.f(bundle);
        int R0 = R0();
        for (int i = 0; i < R0; i++) {
            Q0(i).f(bundle);
        }
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int mInitialExpandedChildrenCount;

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
            this.mInitialExpandedChildrenCount = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mInitialExpandedChildrenCount);
        }

        SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.mInitialExpandedChildrenCount = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
