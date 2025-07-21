package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import defpackage.vj6;
import defpackage.xi6;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
class d extends BaseAdapter {
    private static final int d = 4;
    private final Calendar a;
    private final int b;
    private final int c;

    public d() {
        Calendar i = l.i();
        this.a = i;
        this.b = i.getMaximum(7);
        this.c = i.getFirstDayOfWeek();
    }

    private int b(int i) {
        int i2 = i + this.c;
        int i3 = this.b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.b) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(xi6.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.a.set(7, b(i));
        textView.setText(this.a.getDisplayName(7, d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(vj6.mtrl_picker_day_of_week_column_header), this.a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public d(int i) {
        Calendar i2 = l.i();
        this.a = i2;
        this.b = i2.getMaximum(7);
        this.c = i;
    }
}
