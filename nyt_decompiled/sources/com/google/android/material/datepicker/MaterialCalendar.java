package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.bg6;
import defpackage.h3;
import defpackage.k99;
import defpackage.kh6;
import defpackage.lf5;
import defpackage.lh4;
import defpackage.vj6;
import defpackage.w2;
import defpackage.xi6;
import defpackage.zd6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class MaterialCalendar<S> extends com.google.android.material.datepicker.i {
    static final Object m = "MONTHS_VIEW_GROUP_TAG";
    static final Object n = "NAVIGATION_PREV_TAG";
    static final Object r = "NAVIGATION_NEXT_TAG";
    static final Object s = "SELECTOR_TOGGLE_TAG";
    private int b;
    private CalendarConstraints c;
    private Month d;
    private CalendarSelector e;
    private com.google.android.material.datepicker.b f;
    private RecyclerView g;
    private RecyclerView h;
    private View i;
    private View j;
    private View k;
    private View l;

    enum CalendarSelector {
        DAY,
        YEAR
    }

    class a implements View.OnClickListener {
        final /* synthetic */ com.google.android.material.datepicker.h a;

        a(com.google.android.material.datepicker.h hVar) {
            this.a = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            int g2 = MaterialCalendar.this.q1().g2() - 1;
            if (g2 >= 0) {
                MaterialCalendar.this.t1(this.a.L(g2));
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ int a;

        b(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.h.smoothScrollToPosition(this.a);
        }
    }

    class c extends w2 {
        c() {
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            super.g(view, h3Var);
            h3Var.g0(null);
        }
    }

    class d extends com.google.android.material.datepicker.j {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void S1(RecyclerView.z zVar, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = MaterialCalendar.this.h.getWidth();
                iArr[1] = MaterialCalendar.this.h.getWidth();
            } else {
                iArr[0] = MaterialCalendar.this.h.getHeight();
                iArr[1] = MaterialCalendar.this.h.getHeight();
            }
        }
    }

    class e implements l {
        e() {
        }

        @Override // com.google.android.material.datepicker.MaterialCalendar.l
        public void a(long j) {
            if (MaterialCalendar.this.c.f().C(j)) {
                MaterialCalendar.f1(MaterialCalendar.this);
                throw null;
            }
        }
    }

    class f extends w2 {
        f() {
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            super.g(view, h3Var);
            h3Var.G0(false);
        }
    }

    class g extends RecyclerView.n {
        private final Calendar a = com.google.android.material.datepicker.l.i();
        private final Calendar b = com.google.android.material.datepicker.l.i();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof m) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                MaterialCalendar.f1(MaterialCalendar.this);
                throw null;
            }
        }
    }

    class h extends w2 {
        h() {
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            super.g(view, h3Var);
            h3Var.r0(MaterialCalendar.this.l.getVisibility() == 0 ? MaterialCalendar.this.getString(vj6.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(vj6.mtrl_picker_toggle_to_day_selection));
        }
    }

    class i extends RecyclerView.t {
        final /* synthetic */ com.google.android.material.datepicker.h a;
        final /* synthetic */ MaterialButton b;

        i(com.google.android.material.datepicker.h hVar, MaterialButton materialButton) {
            this.a = hVar;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            int e2 = i < 0 ? MaterialCalendar.this.q1().e2() : MaterialCalendar.this.q1().g2();
            MaterialCalendar.this.d = this.a.L(e2);
            this.b.setText(this.a.M(e2));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            MaterialCalendar.this.w1();
        }
    }

    class k implements View.OnClickListener {
        final /* synthetic */ com.google.android.material.datepicker.h a;

        k(com.google.android.material.datepicker.h hVar) {
            this.a = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            int e2 = MaterialCalendar.this.q1().e2() + 1;
            if (e2 < MaterialCalendar.this.h.getAdapter().m()) {
                MaterialCalendar.this.t1(this.a.L(e2));
            }
        }
    }

    interface l {
        void a(long j);
    }

    static /* synthetic */ DateSelector f1(MaterialCalendar materialCalendar) {
        materialCalendar.getClass();
        return null;
    }

    private void i1(View view, com.google.android.material.datepicker.h hVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(bg6.month_navigation_fragment_toggle);
        materialButton.setTag(s);
        k99.l0(materialButton, new h());
        View findViewById = view.findViewById(bg6.month_navigation_previous);
        this.i = findViewById;
        findViewById.setTag(n);
        View findViewById2 = view.findViewById(bg6.month_navigation_next);
        this.j = findViewById2;
        findViewById2.setTag(r);
        this.k = view.findViewById(bg6.mtrl_calendar_year_selector_frame);
        this.l = view.findViewById(bg6.mtrl_calendar_day_selector_frame);
        u1(CalendarSelector.DAY);
        materialButton.setText(this.d.i());
        this.h.addOnScrollListener(new i(hVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.j.setOnClickListener(new k(hVar));
        this.i.setOnClickListener(new a(hVar));
    }

    private RecyclerView.n j1() {
        return new g();
    }

    static int o1(Context context) {
        return context.getResources().getDimensionPixelSize(zd6.mtrl_calendar_day_height);
    }

    private static int p1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(zd6.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(zd6.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(zd6.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(zd6.mtrl_calendar_days_of_week_height);
        int i2 = com.google.android.material.datepicker.g.e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(zd6.mtrl_calendar_day_height) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(zd6.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(zd6.mtrl_calendar_bottom_padding);
    }

    public static MaterialCalendar r1(DateSelector dateSelector, int i2, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.k());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void s1(int i2) {
        this.h.post(new b(i2));
    }

    private void v1() {
        k99.l0(this.h, new f());
    }

    @Override // com.google.android.material.datepicker.i
    public boolean b1(lf5 lf5Var) {
        return super.b1(lf5Var);
    }

    CalendarConstraints k1() {
        return this.c;
    }

    com.google.android.material.datepicker.b l1() {
        return this.f;
    }

    Month m1() {
        return this.d;
    }

    public DateSelector n1() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        lh4.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.c = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        lh4.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.d = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.b);
        this.f = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month l2 = this.c.l();
        if (com.google.android.material.datepicker.e.n1(contextThemeWrapper)) {
            i2 = xi6.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = xi6.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(p1(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(bg6.mtrl_calendar_days_of_week);
        k99.l0(gridView, new c());
        int h2 = this.c.h();
        gridView.setAdapter((ListAdapter) (h2 > 0 ? new com.google.android.material.datepicker.d(h2) : new com.google.android.material.datepicker.d()));
        gridView.setNumColumns(l2.daysInWeek);
        gridView.setEnabled(false);
        this.h = (RecyclerView) inflate.findViewById(bg6.mtrl_calendar_months);
        this.h.setLayoutManager(new d(getContext(), i3, false, i3));
        this.h.setTag(m);
        com.google.android.material.datepicker.h hVar = new com.google.android.material.datepicker.h(contextThemeWrapper, null, this.c, null, new e());
        this.h.setAdapter(hVar);
        int integer = contextThemeWrapper.getResources().getInteger(kh6.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(bg6.mtrl_calendar_year_selector_frame);
        this.g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.g.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.g.setAdapter(new m(this));
            this.g.addItemDecoration(j1());
        }
        if (inflate.findViewById(bg6.month_navigation_fragment_toggle) != null) {
            i1(inflate, hVar);
        }
        if (!com.google.android.material.datepicker.e.n1(contextThemeWrapper)) {
            new androidx.recyclerview.widget.m().b(this.h);
        }
        this.h.scrollToPosition(hVar.N(this.d));
        v1();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.d);
    }

    LinearLayoutManager q1() {
        return (LinearLayoutManager) this.h.getLayoutManager();
    }

    void t1(Month month) {
        com.google.android.material.datepicker.h hVar = (com.google.android.material.datepicker.h) this.h.getAdapter();
        int N = hVar.N(month);
        int N2 = N - hVar.N(this.d);
        boolean z = Math.abs(N2) > 3;
        boolean z2 = N2 > 0;
        this.d = month;
        if (z && z2) {
            this.h.scrollToPosition(N - 3);
            s1(N);
        } else if (!z) {
            s1(N);
        } else {
            this.h.scrollToPosition(N + 3);
            s1(N);
        }
    }

    void u1(CalendarSelector calendarSelector) {
        this.e = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.g.getLayoutManager().C1(((m) this.g.getAdapter()).K(this.d.year));
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            this.i.setVisibility(0);
            this.j.setVisibility(0);
            t1(this.d);
        }
    }

    void w1() {
        CalendarSelector calendarSelector = this.e;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            u1(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            u1(calendarSelector2);
        }
    }
}
