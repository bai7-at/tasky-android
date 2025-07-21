package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import defpackage.co6;
import defpackage.ic6;
import defpackage.rf6;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    private final View.OnKeyListener A0;
    int p0;
    int q0;
    private int r0;
    private int s0;
    boolean t0;
    SeekBar u0;
    private TextView v0;
    boolean w0;
    private boolean x0;
    boolean y0;
    private final SeekBar.OnSeekBarChangeListener z0;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.y0 || !seekBarPreference.t0) {
                    seekBarPreference.P0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.Q0(i + seekBarPreference2.q0);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.t0 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.t0 = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.q0 != seekBarPreference.p0) {
                seekBarPreference.P0(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.w0 && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.u0;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.z0 = new a();
        this.A0 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co6.SeekBarPreference, i, i2);
        this.q0 = obtainStyledAttributes.getInt(co6.SeekBarPreference_min, 0);
        L0(obtainStyledAttributes.getInt(co6.SeekBarPreference_android_max, 100));
        M0(obtainStyledAttributes.getInt(co6.SeekBarPreference_seekBarIncrement, 0));
        this.w0 = obtainStyledAttributes.getBoolean(co6.SeekBarPreference_adjustable, true);
        this.x0 = obtainStyledAttributes.getBoolean(co6.SeekBarPreference_showSeekBarValue, false);
        this.y0 = obtainStyledAttributes.getBoolean(co6.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    private void O0(int i, boolean z) {
        int i2 = this.q0;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.r0;
        if (i > i3) {
            i = i3;
        }
        if (i != this.p0) {
            this.p0 = i;
            Q0(i);
            h0(i);
            if (z) {
                M();
            }
        }
    }

    public final void L0(int i) {
        int i2 = this.q0;
        if (i < i2) {
            i = i2;
        }
        if (i != this.r0) {
            this.r0 = i;
            M();
        }
    }

    public final void M0(int i) {
        if (i != this.s0) {
            this.s0 = Math.min(this.r0 - this.q0, Math.abs(i));
            M();
        }
    }

    public void N0(int i) {
        O0(i, true);
    }

    void P0(SeekBar seekBar) {
        int progress = this.q0 + seekBar.getProgress();
        if (progress != this.p0) {
            if (b(Integer.valueOf(progress))) {
                O0(progress, false);
            } else {
                seekBar.setProgress(this.p0 - this.q0);
                Q0(this.p0);
            }
        }
    }

    void Q0(int i) {
        TextView textView = this.v0;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        super.S(hVar);
        hVar.a.setOnKeyListener(this.A0);
        this.u0 = (SeekBar) hVar.W(rf6.seekbar);
        TextView textView = (TextView) hVar.W(rf6.seekbar_value);
        this.v0 = textView;
        if (this.x0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.v0 = null;
        }
        SeekBar seekBar = this.u0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.z0);
        this.u0.setMax(this.r0 - this.q0);
        int i = this.s0;
        if (i != 0) {
            this.u0.setKeyProgressIncrement(i);
        } else {
            this.s0 = this.u0.getKeyProgressIncrement();
        }
        this.u0.setProgress(this.p0 - this.q0);
        Q0(this.p0);
        this.u0.setEnabled(I());
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    protected void a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a0(savedState.getSuperState());
        this.p0 = savedState.mSeekBarValue;
        this.q0 = savedState.mMin;
        this.r0 = savedState.mMax;
        M();
    }

    @Override // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable b0 = super.b0();
        if (J()) {
            return b0;
        }
        SavedState savedState = new SavedState(b0);
        savedState.mSeekBarValue = this.p0;
        savedState.mMin = this.q0;
        savedState.mMax = this.r0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void c0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        N0(w(((Integer) obj).intValue()));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int mMax;
        int mMin;
        int mSeekBarValue;

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
            this.mSeekBarValue = parcel.readInt();
            this.mMin = parcel.readInt();
            this.mMax = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mSeekBarValue);
            parcel.writeInt(this.mMin);
            parcel.writeInt(this.mMax);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic6.seekBarPreferenceStyle);
    }
}
