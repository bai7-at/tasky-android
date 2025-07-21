package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
class g extends BaseAdapter {
    static final int e = l.i().getMaximum(4);
    private static final int f = (l.i().getMaximum(5) + l.i().getMaximum(7)) - 1;
    final Month a;
    private Collection b;
    b c;
    final CalendarConstraints d;

    g(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.a = month;
        this.d = calendarConstraints;
        this.b = dateSelector.f0();
    }

    private String c(Context context, long j) {
        return c.a(context, j, j(j), i(j), g(j));
    }

    private void f(Context context) {
        if (this.c == null) {
            this.c = new b(context);
        }
    }

    private boolean h(long j) {
        throw null;
    }

    private boolean j(long j) {
        return l.g().getTimeInMillis() == j;
    }

    private void m(TextView textView, long j, int i) {
        a aVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j));
        if (this.d.f().C(j)) {
            textView.setEnabled(true);
            boolean h = h(j);
            textView.setSelected(h);
            aVar = h ? this.c.b : j(j) ? this.c.c : this.c.a;
        } else {
            textView.setEnabled(false);
            aVar = this.c.g;
        }
        aVar.b(textView);
    }

    private void n(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.c(j).equals(this.a)) {
            int g = this.a.g(j);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(g) - materialCalendarGridView.getFirstVisiblePosition()), j, g);
        }
    }

    int a(int i) {
        return b() + (i - 1);
    }

    int b() {
        return this.a.e(this.d.h());
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < b() || i > k()) {
            return null;
        }
        return Long.valueOf(this.a.f(l(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = defpackage.xi6.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.a
            int r2 = r8.daysInMonth
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.m(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean g(long j) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.a.daysInWeek;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(long j) {
        throw null;
    }

    int k() {
        return (b() + this.a.daysInMonth) - 1;
    }

    int l(int i) {
        return (i - b()) + 1;
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            n(materialCalendarGridView, ((Long) it2.next()).longValue());
        }
    }

    boolean p(int i) {
        return i >= b() && i <= k();
    }
}
