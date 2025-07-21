package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import defpackage.bg6;
import defpackage.k99;
import defpackage.xi6;

/* loaded from: classes3.dex */
class h extends RecyclerView.Adapter {
    private final CalendarConstraints d;
    private final MaterialCalendar.l e;
    private final int f;

    class a implements AdapterView.OnItemClickListener {
        final /* synthetic */ MaterialCalendarGridView a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (this.a.getAdapter().p(i)) {
                h.this.e.a(this.a.getAdapter().getItem(i).longValue());
            }
        }
    }

    public static class b extends RecyclerView.d0 {
        final MaterialCalendarGridView B;
        final TextView y;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(bg6.month_title);
            this.y = textView;
            k99.m0(textView, true);
            this.B = (MaterialCalendarGridView) linearLayout.findViewById(bg6.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    h(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.l lVar) {
        Month l = calendarConstraints.l();
        Month g = calendarConstraints.g();
        Month k = calendarConstraints.k();
        if (l.compareTo(k) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (k.compareTo(g) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f = (g.e * MaterialCalendar.o1(context)) + (e.n1(context) ? MaterialCalendar.o1(context) : 0);
        this.d = calendarConstraints;
        this.e = lVar;
        I(true);
    }

    Month L(int i) {
        return this.d.l().l(i);
    }

    CharSequence M(int i) {
        return L(i).i();
    }

    int N(Month month) {
        return this.d.l().n(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void z(b bVar, int i) {
        Month l = this.d.l().l(i);
        bVar.y.setText(l.i());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.B.findViewById(bg6.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !l.equals(materialCalendarGridView.getAdapter().a)) {
            g gVar = new g(l, null, this.d, null);
            materialCalendarGridView.setNumColumns(l.daysInWeek);
            materialCalendarGridView.setAdapter((ListAdapter) gVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public b B(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(xi6.mtrl_calendar_month_labeled, viewGroup, false);
        if (!e.n1(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int m() {
        return this.d.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long n(int i) {
        return this.d.l().l(i).k();
    }
}
