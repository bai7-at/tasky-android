package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.r42;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class qx1 extends RecyclerView.Adapter {
    private final ArrayList d;
    private final LayoutInflater e;
    private final int f;
    private final int g;
    private final int h;

    public static final class a extends RecyclerView.d0 {
        private final TextView B;
        private final ImageView H;
        private final TextView L;
        private final TextView M;
        private final TextView N;
        private final TextView y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            zq3.h(view, "view");
            View findViewById = view.findViewById(mg6.label);
            zq3.g(findViewById, "findViewById(...)");
            this.y = (TextView) findViewById;
            View findViewById2 = view.findViewById(mg6.timestamp);
            zq3.g(findViewById2, "findViewById(...)");
            this.B = (TextView) findViewById2;
            View findViewById3 = view.findViewById(mg6.indicator);
            zq3.g(findViewById3, "findViewById(...)");
            this.H = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(mg6.sublabel);
            zq3.g(findViewById4, "findViewById(...)");
            this.L = (TextView) findViewById4;
            View findViewById5 = view.findViewById(mg6.keys);
            zq3.g(findViewById5, "findViewById(...)");
            this.M = (TextView) findViewById5;
            View findViewById6 = view.findViewById(mg6.values);
            zq3.g(findViewById6, "findViewById(...)");
            this.N = (TextView) findViewById6;
        }

        public final ImageView W() {
            return this.H;
        }

        public final TextView X() {
            return this.M;
        }

        public final TextView Y() {
            return this.y;
        }

        public final TextView Z() {
            return this.L;
        }

        public final TextView a0() {
            return this.B;
        }

        public final TextView b0() {
            return this.N;
        }
    }

    public qx1(Context context) {
        zq3.h(context, "context");
        this.d = new ArrayList();
        this.e = LayoutInflater.from(context);
        this.f = mx0.c(context, ad6.status_green);
        this.g = mx0.c(context, ad6.status_red);
        this.h = mx0.c(context, R.color.transparent);
    }

    private final String K(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(entry.getKey() + " = " + entry.getValue());
        }
        return i.u0(arrayList, "\n", null, null, 0, null, null, 62, null);
    }

    private final void O(ImageView imageView, Boolean bool) {
        Drawable e = mx0.e(imageView.getContext(), je6.indicator);
        zq3.e(e);
        Drawable mutate = e.mutate();
        zq3.f(mutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) mutate;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(mg6.indicatorColor);
        zq3.f(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.RotateDrawable");
        RotateDrawable rotateDrawable = (RotateDrawable) findDrawableByLayerId;
        if (bool == null) {
            rotateDrawable.setTint(this.h);
        } else if (bool.booleanValue()) {
            rotateDrawable.setTint(this.f);
        } else {
            rotateDrawable.setTint(this.g);
        }
        imageView.setImageDrawable(layerDrawable);
    }

    private final String P(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss.SSSS\ndd/MM/yyyy", Locale.US);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return simpleDateFormat.format(calendar.getTime());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void z(a aVar, int i) {
        zq3.h(aVar, "holder");
        Object obj = this.d.get(i);
        zq3.g(obj, "get(...)");
        r42.b bVar = (r42.b) obj;
        aVar.a0().setText(P(bVar.a().a()));
        if (bVar instanceof r42.b.c) {
            aVar.Y().setText("Event");
            r42.b.c cVar = (r42.b.c) bVar;
            aVar.Z().setText(cVar.b().g());
            aVar.X().setText("Subject\nData");
            aVar.b0().setText(cVar.b().p() + "\n" + K(cVar.b().e()));
            O(aVar.W(), null);
            return;
        }
        if (bVar instanceof r42.b.f) {
            aVar.Y().setText("Validate");
            r42.b.f fVar = (r42.b.f) bVar;
            aVar.Z().setText(fVar.b().g());
            aVar.X().setText("Valid\nFlush\nVersion\nMessages");
            aVar.b0().setText(fVar.c().c() + "\n" + fVar.c().a() + "\n" + fVar.c().d() + "\n" + i.u0(fVar.c().b(), "\n", null, null, 0, null, null, 62, null));
            O(aVar.W(), fVar.c().c());
            return;
        }
        if (bVar instanceof r42.b.a) {
            aVar.Y().setText("Buffer");
            aVar.Z().setText(((r42.b.a) bVar).b().e().g());
            aVar.X().setText((CharSequence) null);
            aVar.b0().setText((CharSequence) null);
            O(aVar.W(), null);
            return;
        }
        if (bVar instanceof r42.b.e) {
            aVar.Y().setText("Upload");
            r42.b.e eVar = (r42.b.e) bVar;
            aVar.Z().setText(eVar.c().size() + " event(s)");
            aVar.X().setText("Response");
            aVar.b0().setText(eVar.b() ? "Success" : "Failure");
            O(aVar.W(), Boolean.valueOf(eVar.b()));
            return;
        }
        if (bVar instanceof r42.b.C0519b) {
            aVar.Y().setText("Flush");
            aVar.Z().setText(((r42.b.C0519b) bVar).b() + " event(s)");
            aVar.X().setText((CharSequence) null);
            aVar.b0().setText((CharSequence) null);
            O(aVar.W(), null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public a B(ViewGroup viewGroup, int i) {
        zq3.h(viewGroup, "parent");
        View inflate = this.e.inflate(di6.item_event, viewGroup, false);
        zq3.e(inflate);
        return new a(inflate);
    }

    public final void N(r42.b bVar) {
        zq3.h(bVar, "milestone");
        this.d.add(bVar);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int m() {
        return this.d.size();
    }
}
