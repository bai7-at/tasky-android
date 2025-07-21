package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class p41 extends Filter {
    a a;

    interface a {
        void a(Cursor cursor);

        CharSequence b(Cursor cursor);

        Cursor c(CharSequence charSequence);

        Cursor d();
    }

    p41(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.a.b((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c = this.a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c != null) {
            filterResults.count = c.getCount();
            filterResults.values = c;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor d = this.a.d();
        Object obj = filterResults.values;
        if (obj == null || obj == d) {
            return;
        }
        this.a.a((Cursor) obj);
    }
}
