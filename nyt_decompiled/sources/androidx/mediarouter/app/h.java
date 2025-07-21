package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.util.log.LogLevel;
import defpackage.fi6;
import defpackage.ic5;
import defpackage.qf6;
import defpackage.th6;
import defpackage.vk;
import defpackage.vm4;
import defpackage.xd6;
import defpackage.ym4;
import defpackage.zk6;
import defpackage.zm4;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends vk {
    static final boolean s0 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    Map B;
    zm4.h H;
    Map L;
    boolean M;
    boolean N;
    private boolean Q;
    private boolean S;
    private ImageButton X;
    private Button Y;
    private ImageView Z;
    private View e0;
    final zm4 f;
    ImageView f0;
    private final g g;
    private TextView g0;
    private ym4 h;
    private TextView h0;
    zm4.h i;
    private String i0;
    final List j;
    MediaControllerCompat j0;
    final List k;
    e k0;
    final List l;
    MediaDescriptionCompat l0;
    final List m;
    d m0;
    Context n;
    Bitmap n0;
    Uri o0;
    boolean p0;
    Bitmap q0;
    private boolean r;
    int r0;
    private boolean s;
    private long t;
    final Handler u;
    RecyclerView w;
    C0093h x;
    j y;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                h.this.w();
                return;
            }
            if (i != 2) {
                return;
            }
            h hVar = h.this;
            if (hVar.H != null) {
                hVar.H = null;
                hVar.x();
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            h.this.dismiss();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            if (h.this.i.B()) {
                h.this.f.r(2);
            }
            h.this.dismiss();
        }
    }

    private class d extends AsyncTask {
        private final Bitmap a;
        private final Uri b;
        private int c;

        d() {
            MediaDescriptionCompat mediaDescriptionCompat = h.this.l0;
            Bitmap b = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
            if (h.l(b)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                b = null;
            }
            this.a = b;
            MediaDescriptionCompat mediaDescriptionCompat2 = h.this.l0;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c() : null;
        }

        private InputStream e(Uri uri) {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || TransferTable.COLUMN_FILE.equals(lowerCase)) {
                openInputStream = h.this.n.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(LogLevel.NONE);
                openConnection.setReadTimeout(LogLevel.NONE);
                openInputStream = openConnection.getInputStream();
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r9) {
            /*
                Method dump skipped, instructions count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.h.d.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        Bitmap b() {
            return this.a;
        }

        Uri c() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            h hVar = h.this;
            hVar.m0 = null;
            if (ic5.a(hVar.n0, this.a) && ic5.a(h.this.o0, this.b)) {
                return;
            }
            h hVar2 = h.this;
            hVar2.n0 = this.a;
            hVar2.q0 = bitmap;
            hVar2.o0 = this.b;
            hVar2.r0 = this.c;
            hVar2.p0 = true;
            hVar2.u();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            h.this.j();
        }
    }

    private final class e extends MediaControllerCompat.a {
        e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            h.this.l0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.d();
            h.this.o();
            h.this.u();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void i() {
            h hVar = h.this;
            MediaControllerCompat mediaControllerCompat = hVar.j0;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.l(hVar.k0);
                h.this.j0 = null;
            }
        }
    }

    private abstract class f extends RecyclerView.d0 {
        final ImageButton B;
        final MediaRouteVolumeSlider H;
        zm4.h y;

        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
                h hVar = h.this;
                if (hVar.H != null) {
                    hVar.u.removeMessages(2);
                }
                f fVar = f.this;
                h.this.H = fVar.y;
                boolean isActivated = view.isActivated();
                boolean z = !isActivated;
                int X = !isActivated ? 0 : f.this.X();
                f.this.Y(z);
                f.this.H.setProgress(X);
                f.this.y.F(X);
                h.this.u.sendEmptyMessageDelayed(2, 500L);
            }
        }

        f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            this.B = imageButton;
            this.H = mediaRouteVolumeSlider;
            imageButton.setImageDrawable(androidx.mediarouter.app.i.k(h.this.n));
            androidx.mediarouter.app.i.v(h.this.n, mediaRouteVolumeSlider);
        }

        void W(zm4.h hVar) {
            this.y = hVar;
            int r = hVar.r();
            this.B.setActivated(r == 0);
            this.B.setOnClickListener(new a());
            this.H.setTag(this.y);
            this.H.setMax(hVar.t());
            this.H.setProgress(r);
            this.H.setOnSeekBarChangeListener(h.this.y);
        }

        int X() {
            Integer num = (Integer) h.this.L.get(this.y.j());
            if (num == null) {
                return 1;
            }
            return Math.max(1, num.intValue());
        }

        void Y(boolean z) {
            if (this.B.isActivated() == z) {
                return;
            }
            this.B.setActivated(z);
            if (z) {
                h.this.L.put(this.y.j(), Integer.valueOf(this.H.getProgress()));
            } else {
                h.this.L.remove(this.y.j());
            }
        }

        void Z() {
            int r = this.y.r();
            Y(r == 0);
            this.H.setProgress(r);
        }
    }

    private final class g extends zm4.b {
        g() {
        }

        @Override // zm4.b
        public void d(zm4 zm4Var, zm4.h hVar) {
            h.this.w();
        }

        @Override // zm4.b
        public void e(zm4 zm4Var, zm4.h hVar) {
            zm4.h.a h;
            if (hVar == h.this.i && hVar.g() != null) {
                for (zm4.h hVar2 : hVar.p().f()) {
                    if (!h.this.i.k().contains(hVar2) && (h = h.this.i.h(hVar2)) != null && h.b() && !h.this.k.contains(hVar2)) {
                        h.this.x();
                        h.this.v();
                        return;
                    }
                }
            }
            h.this.w();
        }

        @Override // zm4.b
        public void g(zm4 zm4Var, zm4.h hVar) {
            h.this.w();
        }

        @Override // zm4.b
        public void h(zm4 zm4Var, zm4.h hVar) {
            h hVar2 = h.this;
            hVar2.i = hVar;
            hVar2.M = false;
            hVar2.x();
            h.this.v();
        }

        @Override // zm4.b
        public void k(zm4 zm4Var, zm4.h hVar) {
            h.this.w();
        }

        @Override // zm4.b
        public void m(zm4 zm4Var, zm4.h hVar) {
            f fVar;
            int r = hVar.r();
            if (h.s0) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + r);
            }
            h hVar2 = h.this;
            if (hVar2.H == hVar || (fVar = (f) hVar2.B.get(hVar.j())) == null) {
                return;
            }
            fVar.Z();
        }
    }

    /* renamed from: androidx.mediarouter.app.h$h, reason: collision with other inner class name */
    private final class C0093h extends RecyclerView.Adapter {
        private final LayoutInflater e;
        private final Drawable f;
        private final Drawable g;
        private final Drawable h;
        private final Drawable i;
        private f j;
        private final int k;
        private final ArrayList d = new ArrayList();
        private final Interpolator l = new AccelerateDecelerateInterpolator();

        /* renamed from: androidx.mediarouter.app.h$h$a */
        class a extends Animation {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ View c;

            a(int i, int i2, View view) {
                this.a = i;
                this.b = i2;
                this.c = view;
            }

            @Override // android.view.animation.Animation
            protected void applyTransformation(float f, Transformation transformation) {
                int i = this.a;
                h.p(this.c, this.b + ((int) ((i - r0) * f)));
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$b */
        class b implements Animation.AnimationListener {
            b() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                h hVar = h.this;
                hVar.N = false;
                hVar.x();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                h.this.N = true;
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$c */
        private class c extends RecyclerView.d0 {
            final ImageView B;
            final ProgressBar H;
            final TextView L;
            final float M;
            zm4.h N;
            final View y;

            /* renamed from: androidx.mediarouter.app.h$h$c$a */
            class a implements View.OnClickListener {
                a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
                    c cVar = c.this;
                    h.this.f.q(cVar.N);
                    c.this.B.setVisibility(4);
                    c.this.H.setVisibility(0);
                }
            }

            c(View view) {
                super(view);
                this.y = view;
                this.B = (ImageView) view.findViewById(qf6.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(qf6.mr_cast_group_progress_bar);
                this.H = progressBar;
                this.L = (TextView) view.findViewById(qf6.mr_cast_group_name);
                this.M = androidx.mediarouter.app.i.h(h.this.n);
                androidx.mediarouter.app.i.t(h.this.n, progressBar);
            }

            private boolean X(zm4.h hVar) {
                List k = h.this.i.k();
                return (k.size() == 1 && k.get(0) == hVar) ? false : true;
            }

            void W(f fVar) {
                zm4.h hVar = (zm4.h) fVar.a();
                this.N = hVar;
                this.B.setVisibility(0);
                this.H.setVisibility(4);
                this.y.setAlpha(X(hVar) ? 1.0f : this.M);
                this.y.setOnClickListener(new a());
                this.B.setImageDrawable(C0093h.this.M(hVar));
                this.L.setText(hVar.l());
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$d */
        private class d extends f {
            private final TextView M;
            private final int N;

            d(View view) {
                super(view, (ImageButton) view.findViewById(qf6.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(qf6.mr_cast_volume_slider));
                this.M = (TextView) view.findViewById(qf6.mr_group_volume_route_name);
                Resources resources = h.this.n.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(xd6.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.N = (int) typedValue.getDimension(displayMetrics);
            }

            void a0(f fVar) {
                h.p(this.a, C0093h.this.O() ? this.N : 0);
                zm4.h hVar = (zm4.h) fVar.a();
                super.W(hVar);
                this.M.setText(hVar.l());
            }

            int b0() {
                return this.N;
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$e */
        private class e extends RecyclerView.d0 {
            private final TextView y;

            e(View view) {
                super(view);
                this.y = (TextView) view.findViewById(qf6.mr_cast_header_name);
            }

            void W(f fVar) {
                this.y.setText(fVar.a().toString());
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$f */
        private class f {
            private final Object a;
            private final int b;

            f(Object obj, int i) {
                this.a = obj;
                this.b = i;
            }

            public Object a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$g */
        private class g extends f {
            final View M;
            final ImageView N;
            final ProgressBar Q;
            final TextView S;
            final RelativeLayout X;
            final CheckBox Y;
            final float Z;
            final int e0;
            final int f0;
            final View.OnClickListener g0;

            /* renamed from: androidx.mediarouter.app.h$h$g$a */
            class a implements View.OnClickListener {
                a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
                    g gVar = g.this;
                    boolean c0 = gVar.c0(gVar.y);
                    boolean z = !c0;
                    boolean x = g.this.y.x();
                    if (c0) {
                        g gVar2 = g.this;
                        h.this.f.p(gVar2.y);
                    } else {
                        g gVar3 = g.this;
                        h.this.f.c(gVar3.y);
                    }
                    g.this.d0(z, !x);
                    if (x) {
                        List k = h.this.i.k();
                        for (zm4.h hVar : g.this.y.k()) {
                            if (k.contains(hVar) != z) {
                                f fVar = (f) h.this.B.get(hVar.j());
                                if (fVar instanceof g) {
                                    ((g) fVar).d0(z, true);
                                }
                            }
                        }
                    }
                    g gVar4 = g.this;
                    C0093h.this.P(gVar4.y, z);
                }
            }

            g(View view) {
                super(view, (ImageButton) view.findViewById(qf6.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(qf6.mr_cast_volume_slider));
                this.g0 = new a();
                this.M = view;
                this.N = (ImageView) view.findViewById(qf6.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(qf6.mr_cast_route_progress_bar);
                this.Q = progressBar;
                this.S = (TextView) view.findViewById(qf6.mr_cast_route_name);
                this.X = (RelativeLayout) view.findViewById(qf6.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(qf6.mr_cast_checkbox);
                this.Y = checkBox;
                checkBox.setButtonDrawable(androidx.mediarouter.app.i.e(h.this.n));
                androidx.mediarouter.app.i.t(h.this.n, progressBar);
                this.Z = androidx.mediarouter.app.i.h(h.this.n);
                Resources resources = h.this.n.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(xd6.mr_dynamic_dialog_row_height, typedValue, true);
                this.e0 = (int) typedValue.getDimension(displayMetrics);
                this.f0 = 0;
            }

            private boolean b0(zm4.h hVar) {
                if (h.this.m.contains(hVar)) {
                    return false;
                }
                if (c0(hVar) && h.this.i.k().size() < 2) {
                    return false;
                }
                if (!c0(hVar)) {
                    return true;
                }
                zm4.h.a h = h.this.i.h(hVar);
                return h != null && h.d();
            }

            void a0(f fVar) {
                zm4.h hVar = (zm4.h) fVar.a();
                if (hVar == h.this.i && hVar.k().size() > 0) {
                    Iterator it2 = hVar.k().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        zm4.h hVar2 = (zm4.h) it2.next();
                        if (!h.this.k.contains(hVar2)) {
                            hVar = hVar2;
                            break;
                        }
                    }
                }
                W(hVar);
                this.N.setImageDrawable(C0093h.this.M(hVar));
                this.S.setText(hVar.l());
                this.Y.setVisibility(0);
                boolean c0 = c0(hVar);
                boolean b0 = b0(hVar);
                this.Y.setChecked(c0);
                this.Q.setVisibility(4);
                this.N.setVisibility(0);
                this.M.setEnabled(b0);
                this.Y.setEnabled(b0);
                this.B.setEnabled(b0 || c0);
                this.H.setEnabled(b0 || c0);
                this.M.setOnClickListener(this.g0);
                this.Y.setOnClickListener(this.g0);
                h.p(this.X, (!c0 || this.y.x()) ? this.f0 : this.e0);
                float f = 1.0f;
                this.M.setAlpha((b0 || c0) ? 1.0f : this.Z);
                CheckBox checkBox = this.Y;
                if (!b0 && c0) {
                    f = this.Z;
                }
                checkBox.setAlpha(f);
            }

            boolean c0(zm4.h hVar) {
                if (hVar.B()) {
                    return true;
                }
                zm4.h.a h = h.this.i.h(hVar);
                return h != null && h.a() == 3;
            }

            void d0(boolean z, boolean z2) {
                this.Y.setEnabled(false);
                this.M.setEnabled(false);
                this.Y.setChecked(z);
                if (z) {
                    this.N.setVisibility(4);
                    this.Q.setVisibility(0);
                }
                if (z2) {
                    C0093h.this.K(this.X, z ? this.e0 : this.f0);
                }
            }
        }

        C0093h() {
            this.e = LayoutInflater.from(h.this.n);
            this.f = androidx.mediarouter.app.i.g(h.this.n);
            this.g = androidx.mediarouter.app.i.q(h.this.n);
            this.h = androidx.mediarouter.app.i.m(h.this.n);
            this.i = androidx.mediarouter.app.i.n(h.this.n);
            this.k = h.this.n.getResources().getInteger(th6.mr_cast_volume_slider_layout_animation_duration_ms);
            R();
        }

        private Drawable L(zm4.h hVar) {
            int f2 = hVar.f();
            return f2 != 1 ? f2 != 2 ? hVar.x() ? this.i : this.f : this.h : this.g;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.d0 B(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new d(this.e.inflate(fi6.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i == 2) {
                return new e(this.e.inflate(fi6.mr_cast_header_item, viewGroup, false));
            }
            if (i == 3) {
                return new g(this.e.inflate(fi6.mr_cast_route_item, viewGroup, false));
            }
            if (i == 4) {
                return new c(this.e.inflate(fi6.mr_cast_group_item, viewGroup, false));
            }
            Log.w("MediaRouteCtrlDialog", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void G(RecyclerView.d0 d0Var) {
            super.G(d0Var);
            h.this.B.values().remove(d0Var);
        }

        void K(View view, int i) {
            a aVar = new a(i, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new b());
            aVar.setDuration(this.k);
            aVar.setInterpolator(this.l);
            view.startAnimation(aVar);
        }

        Drawable M(zm4.h hVar) {
            Uri i = hVar.i();
            if (i != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(h.this.n.getContentResolver().openInputStream(i), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e2) {
                    Log.w("MediaRouteCtrlDialog", "Failed to load " + i, e2);
                }
            }
            return L(hVar);
        }

        public f N(int i) {
            return i == 0 ? this.j : (f) this.d.get(i - 1);
        }

        boolean O() {
            return h.this.i.k().size() > 1;
        }

        void P(zm4.h hVar, boolean z) {
            List k = h.this.i.k();
            int max = Math.max(1, k.size());
            if (hVar.x()) {
                Iterator it2 = hVar.k().iterator();
                while (it2.hasNext()) {
                    if (k.contains((zm4.h) it2.next()) != z) {
                        max += z ? 1 : -1;
                    }
                }
            } else {
                max += z ? 1 : -1;
            }
            boolean O = O();
            boolean z2 = max >= 2;
            if (O != z2) {
                RecyclerView.d0 findViewHolderForAdapterPosition = h.this.w.findViewHolderForAdapterPosition(0);
                if (findViewHolderForAdapterPosition instanceof d) {
                    d dVar = (d) findViewHolderForAdapterPosition;
                    K(dVar.a, z2 ? dVar.b0() : 0);
                }
            }
        }

        void Q() {
            h.this.m.clear();
            h hVar = h.this;
            hVar.m.addAll(androidx.mediarouter.app.f.g(hVar.k, hVar.k()));
            r();
        }

        void R() {
            this.d.clear();
            this.j = new f(h.this.i, 1);
            if (h.this.j.isEmpty()) {
                this.d.add(new f(h.this.i, 3));
            } else {
                Iterator it2 = h.this.j.iterator();
                while (it2.hasNext()) {
                    this.d.add(new f((zm4.h) it2.next(), 3));
                }
            }
            boolean z = false;
            if (!h.this.k.isEmpty()) {
                boolean z2 = false;
                for (zm4.h hVar : h.this.k) {
                    if (!h.this.j.contains(hVar)) {
                        if (!z2) {
                            vm4.b g2 = h.this.i.g();
                            String j = g2 != null ? g2.j() : null;
                            if (TextUtils.isEmpty(j)) {
                                j = h.this.n.getString(zk6.mr_dialog_groupable_header);
                            }
                            this.d.add(new f(j, 2));
                            z2 = true;
                        }
                        this.d.add(new f(hVar, 3));
                    }
                }
            }
            if (!h.this.l.isEmpty()) {
                for (zm4.h hVar2 : h.this.l) {
                    zm4.h hVar3 = h.this.i;
                    if (hVar3 != hVar2) {
                        if (!z) {
                            vm4.b g3 = hVar3.g();
                            String k = g3 != null ? g3.k() : null;
                            if (TextUtils.isEmpty(k)) {
                                k = h.this.n.getString(zk6.mr_dialog_transferable_header);
                            }
                            this.d.add(new f(k, 2));
                            z = true;
                        }
                        this.d.add(new f(hVar2, 4));
                    }
                }
            }
            Q();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int m() {
            return this.d.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int o(int i) {
            return N(i).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void z(RecyclerView.d0 d0Var, int i) {
            int o = o(i);
            f N = N(i);
            if (o == 1) {
                h.this.B.put(((zm4.h) N.a()).j(), (f) d0Var);
                ((d) d0Var).a0(N);
            } else {
                if (o == 2) {
                    ((e) d0Var).W(N);
                    return;
                }
                if (o == 3) {
                    h.this.B.put(((zm4.h) N.a()).j(), (f) d0Var);
                    ((g) d0Var).a0(N);
                } else if (o != 4) {
                    Log.w("MediaRouteCtrlDialog", "Cannot bind item to ViewHolder because of wrong view type");
                } else {
                    ((c) d0Var).W(N);
                }
            }
        }
    }

    static final class i implements Comparator {
        static final i a = new i();

        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(zm4.h hVar, zm4.h hVar2) {
            return hVar.l().compareToIgnoreCase(hVar2.l());
        }
    }

    private class j implements SeekBar.OnSeekBarChangeListener {
        j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                zm4.h hVar = (zm4.h) seekBar.getTag();
                f fVar = (f) h.this.B.get(hVar.j());
                if (fVar != null) {
                    fVar.Y(i == 0);
                }
                hVar.F(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            h hVar = h.this;
            if (hVar.H != null) {
                hVar.u.removeMessages(2);
            }
            h.this.H = (zm4.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            h.this.u.sendEmptyMessageDelayed(2, 500L);
        }
    }

    public h(Context context) {
        this(context, 0);
    }

    private static Bitmap i(Bitmap bitmap, float f2, Context context) {
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(f2);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        createTyped.copyTo(copy);
        createFromBitmap.destroy();
        createTyped.destroy();
        create2.destroy();
        create.destroy();
        return copy;
    }

    static boolean l(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    static void p(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    private void q(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.j0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.l(this.k0);
            this.j0 = null;
        }
        if (token != null && this.s) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.n, token);
            this.j0 = mediaControllerCompat2;
            mediaControllerCompat2.i(this.k0);
            MediaMetadataCompat c2 = this.j0.c();
            this.l0 = c2 != null ? c2.d() : null;
            o();
            u();
        }
    }

    private boolean s() {
        if (this.H != null || this.M || this.N) {
            return true;
        }
        return !this.r;
    }

    void j() {
        this.p0 = false;
        this.q0 = null;
        this.r0 = 0;
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (zm4.h hVar : this.i.p().f()) {
            zm4.h.a h = this.i.h(hVar);
            if (h != null && h.b()) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public boolean m(zm4.h hVar) {
        return !hVar.v() && hVar.w() && hVar.D(this.h) && this.i != hVar;
    }

    public void n(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!m((zm4.h) list.get(size))) {
                list.remove(size);
            }
        }
    }

    void o() {
        MediaDescriptionCompat mediaDescriptionCompat = this.l0;
        Bitmap b2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.l0;
        Uri c2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c() : null;
        d dVar = this.m0;
        Bitmap b3 = dVar == null ? this.n0 : dVar.b();
        d dVar2 = this.m0;
        Uri c3 = dVar2 == null ? this.o0 : dVar2.c();
        if (b3 != b2 || (b3 == null && !ic5.a(c3, c2))) {
            d dVar3 = this.m0;
            if (dVar3 != null) {
                dVar3.cancel(true);
            }
            d dVar4 = new d();
            this.m0 = dVar4;
            dVar4.execute(new Void[0]);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
        this.f.b(this.h, this.g, 1);
        v();
        q(this.f.h());
    }

    @Override // defpackage.vk, defpackage.xq0, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(fi6.mr_cast_dialog);
        androidx.mediarouter.app.i.s(this.n, this);
        ImageButton imageButton = (ImageButton) findViewById(qf6.mr_cast_close_button);
        this.X = imageButton;
        imageButton.setColorFilter(-1);
        this.X.setOnClickListener(new b());
        Button button = (Button) findViewById(qf6.mr_cast_stop_button);
        this.Y = button;
        button.setTextColor(-1);
        this.Y.setOnClickListener(new c());
        this.x = new C0093h();
        RecyclerView recyclerView = (RecyclerView) findViewById(qf6.mr_cast_list);
        this.w = recyclerView;
        recyclerView.setAdapter(this.x);
        this.w.setLayoutManager(new LinearLayoutManager(this.n));
        this.y = new j();
        this.B = new HashMap();
        this.L = new HashMap();
        this.Z = (ImageView) findViewById(qf6.mr_cast_meta_background);
        this.e0 = findViewById(qf6.mr_cast_meta_black_scrim);
        this.f0 = (ImageView) findViewById(qf6.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(qf6.mr_cast_meta_title);
        this.g0 = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(qf6.mr_cast_meta_subtitle);
        this.h0 = textView2;
        textView2.setTextColor(-1);
        this.i0 = this.n.getResources().getString(zk6.mr_cast_dialog_title_view_placeholder);
        this.r = true;
        t();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s = false;
        this.f.o(this.g);
        this.u.removeCallbacksAndMessages(null);
        q(null);
    }

    public void r(ym4 ym4Var) {
        if (ym4Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.h.equals(ym4Var)) {
            return;
        }
        this.h = ym4Var;
        if (this.s) {
            this.f.o(this.g);
            this.f.b(ym4Var, this.g, 1);
            v();
        }
    }

    void t() {
        getWindow().setLayout(androidx.mediarouter.app.f.c(this.n), androidx.mediarouter.app.f.a(this.n));
        this.n0 = null;
        this.o0 = null;
        o();
        u();
        w();
    }

    void u() {
        if (s()) {
            this.S = true;
            return;
        }
        this.S = false;
        if (!this.i.B() || this.i.v()) {
            dismiss();
        }
        if (!this.p0 || l(this.q0) || this.q0 == null) {
            if (l(this.q0)) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.q0);
            }
            this.f0.setVisibility(8);
            this.e0.setVisibility(8);
            this.Z.setImageBitmap(null);
        } else {
            this.f0.setVisibility(0);
            this.f0.setImageBitmap(this.q0);
            this.f0.setBackgroundColor(this.r0);
            this.e0.setVisibility(0);
            this.Z.setImageBitmap(i(this.q0, 10.0f, this.n));
        }
        j();
        MediaDescriptionCompat mediaDescriptionCompat = this.l0;
        CharSequence g2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.g();
        boolean isEmpty = TextUtils.isEmpty(g2);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.l0;
        CharSequence f2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f() : null;
        boolean isEmpty2 = TextUtils.isEmpty(f2);
        if (isEmpty) {
            this.g0.setText(this.i0);
        } else {
            this.g0.setText(g2);
        }
        if (isEmpty2) {
            this.h0.setVisibility(8);
        } else {
            this.h0.setText(f2);
            this.h0.setVisibility(0);
        }
    }

    void v() {
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.j.addAll(this.i.k());
        for (zm4.h hVar : this.i.p().f()) {
            zm4.h.a h = this.i.h(hVar);
            if (h != null) {
                if (h.b()) {
                    this.k.add(hVar);
                }
                if (h.c()) {
                    this.l.add(hVar);
                }
            }
        }
        n(this.k);
        n(this.l);
        List list = this.j;
        i iVar = i.a;
        Collections.sort(list, iVar);
        Collections.sort(this.k, iVar);
        Collections.sort(this.l, iVar);
        this.x.R();
    }

    void w() {
        if (this.s) {
            if (SystemClock.uptimeMillis() - this.t < 300) {
                this.u.removeMessages(1);
                this.u.sendEmptyMessageAtTime(1, this.t + 300);
            } else {
                if (s()) {
                    this.Q = true;
                    return;
                }
                this.Q = false;
                if (!this.i.B() || this.i.v()) {
                    dismiss();
                }
                this.t = SystemClock.uptimeMillis();
                this.x.Q();
            }
        }
    }

    void x() {
        if (this.Q) {
            w();
        }
        if (this.S) {
            u();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.i.b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.i.c(r2)
            r1.<init>(r2, r3)
            ym4 r2 = defpackage.ym4.c
            r1.h = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.j = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.k = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.m = r2
            androidx.mediarouter.app.h$a r2 = new androidx.mediarouter.app.h$a
            r2.<init>()
            r1.u = r2
            android.content.Context r2 = r1.getContext()
            r1.n = r2
            zm4 r2 = defpackage.zm4.g(r2)
            r1.f = r2
            androidx.mediarouter.app.h$g r3 = new androidx.mediarouter.app.h$g
            r3.<init>()
            r1.g = r3
            zm4$h r3 = r2.k()
            r1.i = r3
            androidx.mediarouter.app.h$e r3 = new androidx.mediarouter.app.h$e
            r3.<init>()
            r1.k0 = r3
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.h()
            r1.q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.h.<init>(android.content.Context, int):void");
    }
}
