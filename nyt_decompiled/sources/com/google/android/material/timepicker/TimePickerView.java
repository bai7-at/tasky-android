package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import defpackage.bg6;
import defpackage.xi6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {
    private final Chip a;
    private final Chip b;
    private final ClockHandView c;
    private final ClockFaceView d;
    private final MaterialButtonToggleGroup e;
    private final View.OnClickListener f;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            TimePickerView.F(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.N(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {
        final /* synthetic */ GestureDetector a;

        c(GestureDetector gestureDetector) {
            this.a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e F(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d N(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
    }

    private void R() {
        this.a.setTag(bg6.selection_type, 12);
        this.b.setTag(bg6.selection_type, 10);
        this.a.setOnClickListener(this.f);
        this.b.setOnClickListener(this.f);
        this.a.setAccessibilityClassName("android.view.View");
        this.b.setAccessibilityClassName("android.view.View");
    }

    private void U() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.a.setOnTouchListener(cVar);
        this.b.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.b.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new a();
        LayoutInflater.from(context).inflate(xi6.material_timepicker, this);
        this.d = (ClockFaceView) findViewById(bg6.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(bg6.material_clock_period_toggle);
        this.e = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i2, boolean z) {
                TimePickerView.this.O(materialButtonToggleGroup2, i2, z);
            }
        });
        this.a = (Chip) findViewById(bg6.material_minute_tv);
        this.b = (Chip) findViewById(bg6.material_hour_tv);
        this.c = (ClockHandView) findViewById(bg6.material_clock_hand);
        U();
        R();
    }
}
