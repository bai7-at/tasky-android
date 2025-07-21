package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.r;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.e;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.al;
import defpackage.be5;
import defpackage.bg6;
import defpackage.ch9;
import defpackage.cy1;
import defpackage.fn6;
import defpackage.hf6;
import defpackage.if4;
import defpackage.il3;
import defpackage.k99;
import defpackage.lc6;
import defpackage.lf5;
import defpackage.lh4;
import defpackage.nn6;
import defpackage.pb9;
import defpackage.uf4;
import defpackage.vj6;
import defpackage.xi6;
import defpackage.zd6;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class e<S> extends androidx.fragment.app.e {
    static final Object X = "CONFIRM_BUTTON_TAG";
    static final Object Y = "CANCEL_BUTTON_TAG";
    static final Object Z = "TOGGLE_BUTTON_TAG";
    private TextView B;
    private CheckableImageButton H;
    private uf4 L;
    private Button M;
    private boolean N;
    private CharSequence Q;
    private CharSequence S;
    private final LinkedHashSet a = new LinkedHashSet();
    private final LinkedHashSet b = new LinkedHashSet();
    private final LinkedHashSet c = new LinkedHashSet();
    private final LinkedHashSet d = new LinkedHashSet();
    private int e;
    private i f;
    private CalendarConstraints g;
    private MaterialCalendar h;
    private int i;
    private CharSequence j;
    private boolean k;
    private int l;
    private int m;
    private CharSequence n;
    private int r;
    private CharSequence s;
    private int t;
    private CharSequence u;
    private int w;
    private CharSequence x;
    private TextView y;

    class a implements be5 {
        final /* synthetic */ int a;
        final /* synthetic */ View b;
        final /* synthetic */ int c;

        a(int i, View view, int i2) {
            this.a = i;
            this.b = view;
            this.c = i2;
        }

        @Override // defpackage.be5
        public ch9 a(View view, ch9 ch9Var) {
            int i = ch9Var.f(ch9.l.h()).b;
            if (this.a >= 0) {
                this.b.getLayoutParams().height = this.a + i;
                View view2 = this.b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.b;
            view3.setPadding(view3.getPaddingLeft(), this.c + i, this.b.getPaddingRight(), this.b.getPaddingBottom());
            return ch9Var;
        }
    }

    class b extends lf5 {
        b() {
        }
    }

    private static Drawable e1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, al.b(context, hf6.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], al.b(context, hf6.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private void f1(Window window) {
        if (this.N) {
            return;
        }
        View findViewById = requireView().findViewById(bg6.fullscreen_header);
        cy1.a(window, true, pb9.f(findViewById), null);
        k99.A0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.N = true;
    }

    private DateSelector g1() {
        lh4.a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence h1(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    private String i1() {
        g1();
        requireContext();
        throw null;
    }

    private static int k1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(zd6.mtrl_calendar_content_padding);
        int i = Month.d().daysInWeek;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(zd6.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(zd6.mtrl_calendar_month_horizontal_padding));
    }

    private int l1(Context context) {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        g1();
        throw null;
    }

    private void m1(Context context) {
        this.H.setTag(Z);
        this.H.setImageDrawable(e1(context));
        this.H.setChecked(this.l != 0);
        k99.l0(this.H, null);
        v1(this.H);
        this.H.setOnClickListener(new View.OnClickListener() { // from class: rf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.this.q1(view);
            }
        });
    }

    static boolean n1(Context context) {
        return r1(context, R.attr.windowFullscreen);
    }

    private boolean o1() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean p1(Context context) {
        return r1(context, lc6.nestedScrollable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q1(View view) {
        g1();
        throw null;
    }

    static boolean r1(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(if4.d(context, lc6.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    private void s1() {
        int l1 = l1(requireContext());
        g1();
        MaterialCalendar r1 = MaterialCalendar.r1(null, l1, this.g, null);
        this.h = r1;
        i iVar = r1;
        if (this.l == 1) {
            g1();
            iVar = f.d1(null, l1, this.g);
        }
        this.f = iVar;
        u1();
        t1(j1());
        r p = getChildFragmentManager().p();
        p.q(bg6.mtrl_calendar_frame, this.f);
        p.j();
        this.f.b1(new b());
    }

    private void u1() {
        this.y.setText((this.l == 1 && o1()) ? this.S : this.Q);
    }

    private void v1(CheckableImageButton checkableImageButton) {
        this.H.setContentDescription(this.l == 1 ? checkableImageButton.getContext().getString(vj6.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(vj6.mtrl_picker_toggle_to_text_input_mode));
    }

    public String j1() {
        g1();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((DialogInterface.OnCancelListener) it2.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        lh4.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.g = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        lh4.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.i = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.j = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.l = bundle.getInt("INPUT_MODE_KEY");
        this.m = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.n = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.r = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.s = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.t = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.u = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.w = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.x = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.j;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.i);
        }
        this.Q = charSequence;
        this.S = h1(charSequence);
    }

    @Override // androidx.fragment.app.e
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), l1(requireContext()));
        Context context = dialog.getContext();
        this.k = n1(context);
        this.L = new uf4(context, null, lc6.materialCalendarStyle, fn6.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, nn6.MaterialCalendar, lc6.materialCalendarStyle, fn6.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(nn6.MaterialCalendar_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        this.L.M(context);
        this.L.W(ColorStateList.valueOf(color));
        this.L.V(k99.s(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.k ? xi6.mtrl_picker_fullscreen : xi6.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.k) {
            inflate.findViewById(bg6.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(k1(context), -2));
        } else {
            inflate.findViewById(bg6.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(k1(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(bg6.mtrl_picker_header_selection_text);
        this.B = textView;
        k99.n0(textView, 1);
        this.H = (CheckableImageButton) inflate.findViewById(bg6.mtrl_picker_header_toggle);
        this.y = (TextView) inflate.findViewById(bg6.mtrl_picker_title_text);
        m1(context);
        this.M = (Button) inflate.findViewById(bg6.confirm_button);
        g1();
        throw null;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((DialogInterface.OnDismissListener) it2.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.e);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.g);
        MaterialCalendar materialCalendar = this.h;
        Month m1 = materialCalendar == null ? null : materialCalendar.m1();
        if (m1 != null) {
            bVar.b(m1.timeInMillis);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.i);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.j);
        bundle.putInt("INPUT_MODE_KEY", this.l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.m);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.n);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.r);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.s);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.t);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.u);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.w);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.x);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.k) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.L);
            f1(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(zd6.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.L, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new il3(requireDialog(), rect));
        }
        s1();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStop() {
        this.f.c1();
        super.onStop();
    }

    void t1(String str) {
        this.B.setContentDescription(i1());
        this.B.setText(str);
    }
}
