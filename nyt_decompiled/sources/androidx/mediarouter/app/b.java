package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import defpackage.fi6;
import defpackage.hc6;
import defpackage.qf6;
import defpackage.vk;
import defpackage.ym4;
import defpackage.zm4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class b extends vk {
    private final zm4 f;
    private final C0091b g;
    private TextView h;
    private ym4 i;
    private ArrayList j;
    private c k;
    private ListView l;
    private boolean m;
    private long n;
    private final Handler r;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            b.this.n((List) message.obj);
        }
    }

    /* renamed from: androidx.mediarouter.app.b$b, reason: collision with other inner class name */
    private final class C0091b extends zm4.b {
        C0091b() {
        }

        @Override // zm4.b
        public void d(zm4 zm4Var, zm4.h hVar) {
            b.this.k();
        }

        @Override // zm4.b
        public void e(zm4 zm4Var, zm4.h hVar) {
            b.this.k();
        }

        @Override // zm4.b
        public void g(zm4 zm4Var, zm4.h hVar) {
            b.this.k();
        }

        @Override // zm4.b
        public void h(zm4 zm4Var, zm4.h hVar) {
            b.this.dismiss();
        }
    }

    private static final class c extends ArrayAdapter implements AdapterView.OnItemClickListener {
        private final LayoutInflater a;
        private final Drawable b;
        private final Drawable c;
        private final Drawable d;
        private final Drawable e;

        public c(Context context, List list) {
            super(context, 0, list);
            this.a = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{hc6.mediaRouteDefaultIconDrawable, hc6.mediaRouteTvIconDrawable, hc6.mediaRouteSpeakerIconDrawable, hc6.mediaRouteSpeakerGroupIconDrawable});
            this.b = obtainStyledAttributes.getDrawable(0);
            this.c = obtainStyledAttributes.getDrawable(1);
            this.d = obtainStyledAttributes.getDrawable(2);
            this.e = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        private Drawable a(zm4.h hVar) {
            int f = hVar.f();
            return f != 1 ? f != 2 ? hVar.x() ? this.e : this.b : this.d : this.c;
        }

        private Drawable b(zm4.h hVar) {
            Uri i = hVar.i();
            if (i != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(i), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e) {
                    Log.w("MediaRouteChooserDialog", "Failed to load " + i, e);
                }
            }
            return a(hVar);
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.a.inflate(fi6.mr_chooser_list_item, viewGroup, false);
            }
            zm4.h hVar = (zm4.h) getItem(i);
            TextView textView = (TextView) view.findViewById(qf6.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(qf6.mr_chooser_route_desc);
            textView.setText(hVar.l());
            String d = hVar.d();
            if ((hVar.c() == 2 || hVar.c() == 1) && !TextUtils.isEmpty(d)) {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(d);
            } else {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            }
            view.setEnabled(hVar.w());
            ImageView imageView = (ImageView) view.findViewById(qf6.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(b(hVar));
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return ((zm4.h) getItem(i)).w();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            zm4.h hVar = (zm4.h) getItem(i);
            if (hVar.w()) {
                ImageView imageView = (ImageView) view.findViewById(qf6.mr_chooser_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(qf6.mr_chooser_route_progress_bar);
                if (imageView != null && progressBar != null) {
                    imageView.setVisibility(8);
                    progressBar.setVisibility(0);
                }
                hVar.H();
            }
        }
    }

    static final class d implements Comparator {
        public static final d a = new d();

        d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(zm4.h hVar, zm4.h hVar2) {
            return hVar.l().compareToIgnoreCase(hVar2.l());
        }
    }

    public b(Context context) {
        this(context, 0);
    }

    public boolean i(zm4.h hVar) {
        return !hVar.v() && hVar.w() && hVar.D(this.i);
    }

    public void j(List list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            if (!i((zm4.h) list.get(i))) {
                list.remove(i);
            }
            size = i;
        }
    }

    public void k() {
        if (this.m) {
            ArrayList arrayList = new ArrayList(this.f.j());
            j(arrayList);
            Collections.sort(arrayList, d.a);
            if (SystemClock.uptimeMillis() - this.n >= 300) {
                n(arrayList);
                return;
            }
            this.r.removeMessages(1);
            Handler handler = this.r;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.n + 300);
        }
    }

    public void l(ym4 ym4Var) {
        if (ym4Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.i.equals(ym4Var)) {
            return;
        }
        this.i = ym4Var;
        if (this.m) {
            this.f.o(this.g);
            this.f.b(ym4Var, this.g, 1);
        }
        k();
    }

    void m() {
        getWindow().setLayout(f.b(getContext()), -2);
    }

    void n(List list) {
        this.n = SystemClock.uptimeMillis();
        this.j.clear();
        this.j.addAll(list);
        this.k.notifyDataSetChanged();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
        this.f.b(this.i, this.g, 1);
        k();
    }

    @Override // defpackage.vk, defpackage.xq0, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(fi6.mr_chooser_dialog);
        this.j = new ArrayList();
        this.k = new c(getContext(), this.j);
        ListView listView = (ListView) findViewById(qf6.mr_chooser_list);
        this.l = listView;
        listView.setAdapter((ListAdapter) this.k);
        this.l.setOnItemClickListener(this.k);
        this.l.setEmptyView(findViewById(R.id.empty));
        this.h = (TextView) findViewById(qf6.mr_chooser_title);
        m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.m = false;
        this.f.o(this.g);
        this.r.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.vk, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.h.setText(charSequence);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.i.b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.i.c(r2)
            r1.<init>(r2, r3)
            ym4 r2 = defpackage.ym4.c
            r1.i = r2
            androidx.mediarouter.app.b$a r2 = new androidx.mediarouter.app.b$a
            r2.<init>()
            r1.r = r2
            android.content.Context r2 = r1.getContext()
            zm4 r2 = defpackage.zm4.g(r2)
            r1.f = r2
            androidx.mediarouter.app.b$b r2 = new androidx.mediarouter.app.b$b
            r2.<init>()
            r1.g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.b.<init>(android.content.Context, int):void");
    }

    @Override // defpackage.vk, android.app.Dialog
    public void setTitle(int i) {
        this.h.setText(i);
    }
}
