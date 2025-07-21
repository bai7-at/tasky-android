package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.fi6;
import defpackage.qf6;
import defpackage.vk;
import defpackage.ym4;
import defpackage.zk6;
import defpackage.zm4;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class g extends vk {
    final zm4 f;
    private final c g;
    Context h;
    private ym4 i;
    List j;
    private ImageButton k;
    private d l;
    private RecyclerView m;
    private boolean n;
    zm4.h r;
    private long s;
    private long t;
    private final Handler u;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            g.this.n((List) message.obj);
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            g.this.dismiss();
        }
    }

    private final class c extends zm4.b {
        c() {
        }

        @Override // zm4.b
        public void d(zm4 zm4Var, zm4.h hVar) {
            g.this.k();
        }

        @Override // zm4.b
        public void e(zm4 zm4Var, zm4.h hVar) {
            g.this.k();
        }

        @Override // zm4.b
        public void g(zm4 zm4Var, zm4.h hVar) {
            g.this.k();
        }

        @Override // zm4.b
        public void h(zm4 zm4Var, zm4.h hVar) {
            g.this.dismiss();
        }
    }

    private final class d extends RecyclerView.Adapter {
        private final ArrayList d = new ArrayList();
        private final LayoutInflater e;
        private final Drawable f;
        private final Drawable g;
        private final Drawable h;
        private final Drawable i;

        private class a extends RecyclerView.d0 {
            TextView y;

            a(View view) {
                super(view);
                this.y = (TextView) view.findViewById(qf6.mr_picker_header_name);
            }

            public void W(b bVar) {
                this.y.setText(bVar.a().toString());
            }
        }

        private class b {
            private final Object a;
            private final int b;

            b(Object obj) {
                this.a = obj;
                if (obj instanceof String) {
                    this.b = 1;
                } else if (obj instanceof zm4.h) {
                    this.b = 2;
                } else {
                    this.b = 0;
                    Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
                }
            }

            public Object a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }
        }

        private class c extends RecyclerView.d0 {
            final ImageView B;
            final ProgressBar H;
            final TextView L;
            final View y;

            class a implements View.OnClickListener {
                final /* synthetic */ zm4.h a;

                a(zm4.h hVar) {
                    this.a = hVar;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
                    g gVar = g.this;
                    zm4.h hVar = this.a;
                    gVar.r = hVar;
                    hVar.H();
                    c.this.B.setVisibility(4);
                    c.this.H.setVisibility(0);
                }
            }

            c(View view) {
                super(view);
                this.y = view;
                this.B = (ImageView) view.findViewById(qf6.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(qf6.mr_picker_route_progress_bar);
                this.H = progressBar;
                this.L = (TextView) view.findViewById(qf6.mr_picker_route_name);
                i.t(g.this.h, progressBar);
            }

            public void W(b bVar) {
                zm4.h hVar = (zm4.h) bVar.a();
                this.y.setVisibility(0);
                this.H.setVisibility(4);
                this.y.setOnClickListener(new a(hVar));
                this.L.setText(hVar.l());
                this.B.setImageDrawable(d.this.L(hVar));
            }
        }

        d() {
            this.e = LayoutInflater.from(g.this.h);
            this.f = i.g(g.this.h);
            this.g = i.q(g.this.h);
            this.h = i.m(g.this.h);
            this.i = i.n(g.this.h);
            N();
        }

        private Drawable K(zm4.h hVar) {
            int f = hVar.f();
            return f != 1 ? f != 2 ? hVar.x() ? this.i : this.f : this.h : this.g;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.d0 B(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new a(this.e.inflate(fi6.mr_picker_header_item, viewGroup, false));
            }
            if (i == 2) {
                return new c(this.e.inflate(fi6.mr_picker_route_item, viewGroup, false));
            }
            Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        Drawable L(zm4.h hVar) {
            Uri i = hVar.i();
            if (i != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(g.this.h.getContentResolver().openInputStream(i), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e) {
                    Log.w("RecyclerAdapter", "Failed to load " + i, e);
                }
            }
            return K(hVar);
        }

        public b M(int i) {
            return (b) this.d.get(i);
        }

        void N() {
            this.d.clear();
            this.d.add(new b(g.this.h.getString(zk6.mr_chooser_title)));
            Iterator it2 = g.this.j.iterator();
            while (it2.hasNext()) {
                this.d.add(new b((zm4.h) it2.next()));
            }
            r();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int m() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int o(int i) {
            return ((b) this.d.get(i)).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void z(RecyclerView.d0 d0Var, int i) {
            int o = o(i);
            b M = M(i);
            if (o == 1) {
                ((a) d0Var).W(M);
            } else if (o != 2) {
                Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((c) d0Var).W(M);
            }
        }
    }

    static final class e implements Comparator {
        public static final e a = new e();

        e() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(zm4.h hVar, zm4.h hVar2) {
            return hVar.l().compareToIgnoreCase(hVar2.l());
        }
    }

    public g(Context context) {
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
        if (this.r == null && this.n) {
            ArrayList arrayList = new ArrayList(this.f.j());
            j(arrayList);
            Collections.sort(arrayList, e.a);
            if (SystemClock.uptimeMillis() - this.t >= this.s) {
                n(arrayList);
                return;
            }
            this.u.removeMessages(1);
            Handler handler = this.u;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.t + this.s);
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
        if (this.n) {
            this.f.o(this.g);
            this.f.b(ym4Var, this.g, 1);
        }
        k();
    }

    void m() {
        getWindow().setLayout(f.c(this.h), f.a(this.h));
    }

    void n(List list) {
        this.t = SystemClock.uptimeMillis();
        this.j.clear();
        this.j.addAll(list);
        this.l.N();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        this.f.b(this.i, this.g, 1);
        k();
    }

    @Override // defpackage.vk, defpackage.xq0, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(fi6.mr_picker_dialog);
        i.s(this.h, this);
        this.j = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(qf6.mr_picker_close_button);
        this.k = imageButton;
        imageButton.setOnClickListener(new b());
        this.l = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(qf6.mr_picker_list);
        this.m = recyclerView;
        recyclerView.setAdapter(this.l);
        this.m.setLayoutManager(new LinearLayoutManager(this.h));
        m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        this.f.o(this.g);
        this.u.removeMessages(1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.i.b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.i.c(r2)
            r1.<init>(r2, r3)
            ym4 r2 = defpackage.ym4.c
            r1.i = r2
            androidx.mediarouter.app.g$a r2 = new androidx.mediarouter.app.g$a
            r2.<init>()
            r1.u = r2
            android.content.Context r2 = r1.getContext()
            zm4 r3 = defpackage.zm4.g(r2)
            r1.f = r3
            androidx.mediarouter.app.g$c r3 = new androidx.mediarouter.app.g$c
            r3.<init>()
            r1.g = r3
            r1.h = r2
            android.content.res.Resources r2 = r2.getResources()
            int r3 = defpackage.th6.mr_update_routes_delay_ms
            int r2 = r2.getInteger(r3)
            long r2 = (long) r2
            r1.s = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.g.<init>(android.content.Context, int):void");
    }
}
