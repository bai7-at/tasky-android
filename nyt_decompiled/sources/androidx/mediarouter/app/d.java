package androidx.mediarouter.app;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.OverlayListView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.fi6;
import defpackage.ic5;
import defpackage.qf6;
import defpackage.th6;
import defpackage.xd6;
import defpackage.ym4;
import defpackage.zk6;
import defpackage.zm4;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public class d extends androidx.appcompat.app.a {
    static final boolean R0 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    static final int S0 = (int) TimeUnit.SECONDS.toMillis(30);
    boolean A0;
    FrameLayout B;
    Bitmap B0;
    int C0;
    boolean D0;
    boolean E0;
    boolean F0;
    boolean G0;
    private FrameLayout H;
    boolean H0;
    int I0;
    private int J0;
    private int K0;
    private ImageView L;
    private Interpolator L0;
    private TextView M;
    private Interpolator M0;
    private TextView N;
    private Interpolator N0;
    private Interpolator O0;
    final AccessibilityManager P0;
    private TextView Q;
    Runnable Q0;
    private boolean S;
    private LinearLayout X;
    private RelativeLayout Y;
    private LinearLayout Z;
    private View e0;
    OverlayListView f0;
    final zm4 g;
    r g0;
    private final p h;
    private List h0;
    final zm4.h i;
    Set i0;
    Context j;
    private Set j0;
    private boolean k;
    Set k0;
    private boolean l;
    SeekBar l0;
    private int m;
    q m0;
    private View n;
    zm4.h n0;
    private int o0;
    private int p0;
    private int q0;
    private Button r;
    private final int r0;
    private Button s;
    Map s0;
    private ImageButton t;
    MediaControllerCompat t0;
    private ImageButton u;
    o u0;
    PlaybackStateCompat v0;
    private MediaRouteExpandCollapseButton w;
    MediaDescriptionCompat w0;
    private FrameLayout x;
    n x0;
    private LinearLayout y;
    Bitmap y0;
    Uri z0;

    class a implements OverlayListView.a.InterfaceC0089a {
        final /* synthetic */ zm4.h a;

        a(zm4.h hVar) {
            this.a = hVar;
        }

        @Override // androidx.mediarouter.app.OverlayListView.a.InterfaceC0089a
        public void a() {
            d.this.k0.remove(this.a);
            d.this.g0.notifyDataSetChanged();
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d.this.f0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            d.this.H();
        }
    }

    class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d.this.r(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.mediarouter.app.d$d, reason: collision with other inner class name */
    class RunnableC0092d implements Runnable {
        RunnableC0092d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.G();
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            d.this.dismiss();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PendingIntent e;
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            MediaControllerCompat mediaControllerCompat = d.this.t0;
            if (mediaControllerCompat == null || (e = mediaControllerCompat.e()) == null) {
                return;
            }
            try {
                e.send();
                d.this.dismiss();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("MediaRouteCtrlDialog", e + " was not sent, it had been canceled.");
            }
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            d dVar = d.this;
            boolean z = dVar.F0;
            dVar.F0 = !z;
            if (!z) {
                dVar.f0.setVisibility(0);
            }
            d.this.B();
            d.this.L(true);
        }
    }

    class i implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ boolean a;

        i(boolean z) {
            this.a = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d.this.B.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            d dVar = d.this;
            if (dVar.G0) {
                dVar.H0 = true;
            } else {
                dVar.M(this.a);
            }
        }
    }

    class j extends Animation {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ View c;

        j(int i, int i2, View view) {
            this.a = i;
            this.b = i2;
            this.c = view;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f, Transformation transformation) {
            d.E(this.c, this.a - ((int) ((r3 - this.b) * f)));
        }
    }

    class k implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ Map a;
        final /* synthetic */ Map b;

        k(Map map, Map map2) {
            this.a = map;
            this.b = map2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d.this.f0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            d.this.l(this.a, this.b);
        }
    }

    class l implements Animation.AnimationListener {
        l() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            d.this.f0.b();
            d dVar = d.this;
            dVar.f0.postDelayed(dVar.Q0, dVar.I0);
        }
    }

    private final class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            int id = view.getId();
            if (id == 16908313 || id == 16908314) {
                if (d.this.i.B()) {
                    d.this.g.r(id == 16908313 ? 2 : 1);
                }
                d.this.dismiss();
                return;
            }
            if (id != qf6.mr_control_playback_ctrl) {
                if (id == qf6.mr_close) {
                    d.this.dismiss();
                    return;
                }
                return;
            }
            d dVar = d.this;
            if (dVar.t0 == null || (playbackStateCompat = dVar.v0) == null) {
                return;
            }
            int i = 0;
            int i2 = playbackStateCompat.h() != 3 ? 0 : 1;
            if (i2 != 0 && d.this.x()) {
                d.this.t0.g().b();
                i = zk6.mr_controller_pause;
            } else if (i2 != 0 && d.this.z()) {
                d.this.t0.g().g();
                i = zk6.mr_controller_stop;
            } else if (i2 == 0 && d.this.y()) {
                d.this.t0.g().c();
                i = zk6.mr_controller_play;
            }
            AccessibilityManager accessibilityManager = d.this.P0;
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || i == 0) {
                return;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain(Http2.INITIAL_MAX_FRAME_SIZE);
            obtain.setPackageName(d.this.j.getPackageName());
            obtain.setClassName(m.class.getName());
            obtain.getText().add(d.this.j.getString(i));
            d.this.P0.sendAccessibilityEvent(obtain);
        }
    }

    private class n extends AsyncTask {
        private final Bitmap a;
        private final Uri b;
        private int c;
        private long d;

        n() {
            MediaDescriptionCompat mediaDescriptionCompat = d.this.w0;
            Bitmap b = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
            if (d.v(b)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                b = null;
            }
            this.a = b;
            MediaDescriptionCompat mediaDescriptionCompat2 = d.this.w0;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c() : null;
        }

        private InputStream e(Uri uri) {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || TransferTable.COLUMN_FILE.equals(lowerCase)) {
                openInputStream = d.this.j.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                int i = d.S0;
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
                openInputStream = openConnection.getInputStream();
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r10) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.n.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        public Bitmap b() {
            return this.a;
        }

        public Uri c() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            d dVar = d.this;
            dVar.x0 = null;
            if (ic5.a(dVar.y0, this.a) && ic5.a(d.this.z0, this.b)) {
                return;
            }
            d dVar2 = d.this;
            dVar2.y0 = this.a;
            dVar2.B0 = bitmap;
            dVar2.z0 = this.b;
            dVar2.C0 = this.c;
            dVar2.A0 = true;
            d.this.I(SystemClock.uptimeMillis() - this.d > 120);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            this.d = SystemClock.uptimeMillis();
            d.this.p();
        }
    }

    private final class o extends MediaControllerCompat.a {
        o() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            d.this.w0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.d();
            d.this.J();
            d.this.I(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void e(PlaybackStateCompat playbackStateCompat) {
            d dVar = d.this;
            dVar.v0 = playbackStateCompat;
            dVar.I(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void i() {
            d dVar = d.this;
            MediaControllerCompat mediaControllerCompat = dVar.t0;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.l(dVar.u0);
                d.this.t0 = null;
            }
        }
    }

    private final class p extends zm4.b {
        p() {
        }

        @Override // zm4.b
        public void e(zm4 zm4Var, zm4.h hVar) {
            d.this.I(true);
        }

        @Override // zm4.b
        public void k(zm4 zm4Var, zm4.h hVar) {
            d.this.I(false);
        }

        @Override // zm4.b
        public void m(zm4 zm4Var, zm4.h hVar) {
            SeekBar seekBar = (SeekBar) d.this.s0.get(hVar);
            int r = hVar.r();
            if (d.R0) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + r);
            }
            if (seekBar == null || d.this.n0 == hVar) {
                return;
            }
            seekBar.setProgress(r);
        }
    }

    private class q implements SeekBar.OnSeekBarChangeListener {
        private final Runnable a = new a();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                if (dVar.n0 != null) {
                    dVar.n0 = null;
                    if (dVar.D0) {
                        dVar.I(dVar.E0);
                    }
                }
            }
        }

        q() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                zm4.h hVar = (zm4.h) seekBar.getTag();
                if (d.R0) {
                    Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i + ")");
                }
                hVar.F(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            d dVar = d.this;
            if (dVar.n0 != null) {
                dVar.l0.removeCallbacks(this.a);
            }
            d.this.n0 = (zm4.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            d.this.l0.postDelayed(this.a, 500L);
        }
    }

    private class r extends ArrayAdapter {
        final float a;

        public r(Context context, List list) {
            super(context, 0, list);
            this.a = androidx.mediarouter.app.i.h(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(fi6.mr_controller_volume_item, viewGroup, false);
            } else {
                d.this.Q(view);
            }
            zm4.h hVar = (zm4.h) getItem(i);
            if (hVar != null) {
                boolean w = hVar.w();
                TextView textView = (TextView) view.findViewById(qf6.mr_name);
                textView.setEnabled(w);
                textView.setText(hVar.l());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(qf6.mr_volume_slider);
                androidx.mediarouter.app.i.w(viewGroup.getContext(), mediaRouteVolumeSlider, d.this.f0);
                mediaRouteVolumeSlider.setTag(hVar);
                d.this.s0.put(hVar, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.n(!w);
                mediaRouteVolumeSlider.setEnabled(w);
                if (w) {
                    if (d.this.A(hVar)) {
                        mediaRouteVolumeSlider.setMax(hVar.t());
                        mediaRouteVolumeSlider.setProgress(hVar.r());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(d.this.m0);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(qf6.mr_volume_item_icon)).setAlpha(w ? 255 : (int) (this.a * 255.0f));
                ((LinearLayout) view.findViewById(qf6.volume_item_container)).setVisibility(d.this.k0.contains(hVar) ? 4 : 0);
                Set set = d.this.i0;
                if (set != null && set.contains(hVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return false;
        }
    }

    public d(Context context) {
        this(context, 0);
    }

    private void D(boolean z) {
        List k2 = this.i.k();
        if (k2.isEmpty()) {
            this.h0.clear();
            this.g0.notifyDataSetChanged();
            return;
        }
        if (androidx.mediarouter.app.f.i(this.h0, k2)) {
            this.g0.notifyDataSetChanged();
            return;
        }
        HashMap e2 = z ? androidx.mediarouter.app.f.e(this.f0, this.g0) : null;
        HashMap d = z ? androidx.mediarouter.app.f.d(this.j, this.f0, this.g0) : null;
        this.i0 = androidx.mediarouter.app.f.f(this.h0, k2);
        this.j0 = androidx.mediarouter.app.f.g(this.h0, k2);
        this.h0.addAll(0, this.i0);
        this.h0.removeAll(this.j0);
        this.g0.notifyDataSetChanged();
        if (z && this.F0 && this.i0.size() + this.j0.size() > 0) {
            k(e2, d);
        } else {
            this.i0 = null;
            this.j0 = null;
        }
    }

    static void E(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    private void F(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.t0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.l(this.u0);
            this.t0 = null;
        }
        if (token != null && this.l) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.j, token);
            this.t0 = mediaControllerCompat2;
            mediaControllerCompat2.i(this.u0);
            MediaMetadataCompat c2 = this.t0.c();
            this.w0 = c2 != null ? c2.d() : null;
            this.v0 = this.t0.d();
            J();
            I(false);
        }
    }

    private void N(boolean z) {
        int i2 = 0;
        this.e0.setVisibility((this.Z.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.X;
        if (this.Z.getVisibility() == 8 && !z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void O() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.O():void");
    }

    private void P() {
        if (!A(this.i)) {
            this.Z.setVisibility(8);
        } else if (this.Z.getVisibility() == 8) {
            this.Z.setVisibility(0);
            this.l0.setMax(this.i.t());
            this.l0.setProgress(this.i.r());
            this.w.setVisibility(this.i.x() ? 0 : 8);
        }
    }

    private static boolean R(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    private void k(Map map, Map map2) {
        this.f0.setEnabled(false);
        this.f0.requestLayout();
        this.G0 = true;
        this.f0.getViewTreeObserver().addOnGlobalLayoutListener(new k(map, map2));
    }

    private void m(View view, int i2) {
        j jVar = new j(t(view), i2, view);
        jVar.setDuration(this.I0);
        jVar.setInterpolator(this.L0);
        view.startAnimation(jVar);
    }

    private boolean n() {
        return this.n == null && !(this.w0 == null && this.v0 == null);
    }

    private void q() {
        c cVar = new c();
        int firstVisiblePosition = this.f0.getFirstVisiblePosition();
        boolean z = false;
        for (int i2 = 0; i2 < this.f0.getChildCount(); i2++) {
            View childAt = this.f0.getChildAt(i2);
            if (this.i0.contains((zm4.h) this.g0.getItem(firstVisiblePosition + i2))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(this.J0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(cVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    private static int t(View view) {
        return view.getLayoutParams().height;
    }

    private int u(boolean z) {
        if (!z && this.Z.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = this.X.getPaddingTop() + this.X.getPaddingBottom();
        if (z) {
            paddingTop += this.Y.getMeasuredHeight();
        }
        if (this.Z.getVisibility() == 0) {
            paddingTop += this.Z.getMeasuredHeight();
        }
        return (z && this.Z.getVisibility() == 0) ? this.e0.getMeasuredHeight() + paddingTop : paddingTop;
    }

    static boolean v(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    private boolean w() {
        MediaDescriptionCompat mediaDescriptionCompat = this.w0;
        Bitmap b2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.w0;
        Uri c2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c() : null;
        n nVar = this.x0;
        Bitmap b3 = nVar == null ? this.y0 : nVar.b();
        n nVar2 = this.x0;
        Uri c3 = nVar2 == null ? this.z0 : nVar2.c();
        if (b3 != b2) {
            return true;
        }
        return b3 == null && !R(c3, c2);
    }

    boolean A(zm4.h hVar) {
        return this.S && hVar.s() == 1;
    }

    void B() {
        this.L0 = this.F0 ? this.M0 : this.N0;
    }

    public View C(Bundle bundle) {
        return null;
    }

    void G() {
        o(true);
        this.f0.requestLayout();
        this.f0.getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    void H() {
        Set set = this.i0;
        if (set == null || set.size() == 0) {
            r(true);
        } else {
            q();
        }
    }

    void I(boolean z) {
        if (this.n0 != null) {
            this.D0 = true;
            this.E0 = z | this.E0;
            return;
        }
        this.D0 = false;
        this.E0 = false;
        if (!this.i.B() || this.i.v()) {
            dismiss();
            return;
        }
        if (this.k) {
            this.Q.setText(this.i.l());
            this.r.setVisibility(this.i.a() ? 0 : 8);
            if (this.n == null && this.A0) {
                if (v(this.B0)) {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.B0);
                } else {
                    this.L.setImageBitmap(this.B0);
                    this.L.setBackgroundColor(this.C0);
                }
                p();
            }
            P();
            O();
            L(z);
        }
    }

    void J() {
        if (this.n == null && w()) {
            n nVar = this.x0;
            if (nVar != null) {
                nVar.cancel(true);
            }
            n nVar2 = new n();
            this.x0 = nVar2;
            nVar2.execute(new Void[0]);
        }
    }

    void K() {
        int b2 = androidx.mediarouter.app.f.b(this.j);
        getWindow().setLayout(b2, -2);
        View decorView = getWindow().getDecorView();
        this.m = (b2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.j.getResources();
        this.o0 = resources.getDimensionPixelSize(xd6.mr_controller_volume_group_list_item_icon_size);
        this.p0 = resources.getDimensionPixelSize(xd6.mr_controller_volume_group_list_item_height);
        this.q0 = resources.getDimensionPixelSize(xd6.mr_controller_volume_group_list_max_height);
        this.y0 = null;
        this.z0 = null;
        J();
        I(false);
    }

    void L(boolean z) {
        this.B.requestLayout();
        this.B.getViewTreeObserver().addOnGlobalLayoutListener(new i(z));
    }

    void M(boolean z) {
        int i2;
        Bitmap bitmap;
        int t = t(this.X);
        E(this.X, -1);
        N(n());
        View decorView = getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        E(this.X, t);
        if (this.n == null && (this.L.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) this.L.getDrawable()).getBitmap()) != null) {
            i2 = s(bitmap.getWidth(), bitmap.getHeight());
            this.L.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        } else {
            i2 = 0;
        }
        int u = u(n());
        int size = this.h0.size();
        int size2 = this.i.x() ? this.p0 * this.i.k().size() : 0;
        if (size > 0) {
            size2 += this.r0;
        }
        int min = Math.min(size2, this.q0);
        if (!this.F0) {
            min = 0;
        }
        int max = Math.max(i2, min) + u;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (this.y.getMeasuredHeight() - this.B.getMeasuredHeight());
        if (this.n != null || i2 <= 0 || max > height) {
            if (t(this.f0) + this.X.getMeasuredHeight() >= this.B.getMeasuredHeight()) {
                this.L.setVisibility(8);
            }
            max = min + u;
            i2 = 0;
        } else {
            this.L.setVisibility(0);
            E(this.L, i2);
        }
        if (!n() || max > height) {
            this.Y.setVisibility(8);
        } else {
            this.Y.setVisibility(0);
        }
        N(this.Y.getVisibility() == 0);
        int u2 = u(this.Y.getVisibility() == 0);
        int max2 = Math.max(i2, min) + u2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        this.X.clearAnimation();
        this.f0.clearAnimation();
        this.B.clearAnimation();
        if (z) {
            m(this.X, u2);
            m(this.f0, min);
            m(this.B, height);
        } else {
            E(this.X, u2);
            E(this.f0, min);
            E(this.B, height);
        }
        E(this.x, rect.height());
        D(z);
    }

    void Q(View view) {
        E((LinearLayout) view.findViewById(qf6.volume_item_container), this.p0);
        View findViewById = view.findViewById(qf6.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int i2 = this.o0;
        layoutParams.width = i2;
        layoutParams.height = i2;
        findViewById.setLayoutParams(layoutParams);
    }

    void l(Map map, Map map2) {
        OverlayListView.a d;
        Set set = this.i0;
        if (set == null || this.j0 == null) {
            return;
        }
        int size = set.size() - this.j0.size();
        l lVar = new l();
        int firstVisiblePosition = this.f0.getFirstVisiblePosition();
        boolean z = false;
        for (int i2 = 0; i2 < this.f0.getChildCount(); i2++) {
            View childAt = this.f0.getChildAt(i2);
            Object obj = (zm4.h) this.g0.getItem(firstVisiblePosition + i2);
            Rect rect = (Rect) map.get(obj);
            int top = childAt.getTop();
            int i3 = rect != null ? rect.top : (this.p0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            Set set2 = this.i0;
            if (set2 != null && set2.contains(obj)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(this.J0);
                animationSet.addAnimation(alphaAnimation);
                i3 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i3 - top, 0.0f);
            translateAnimation.setDuration(this.I0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(this.L0);
            if (!z) {
                animationSet.setAnimationListener(lVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(obj);
            map2.remove(obj);
        }
        for (Map.Entry entry : map2.entrySet()) {
            zm4.h hVar = (zm4.h) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(hVar);
            if (this.j0.contains(hVar)) {
                d = new OverlayListView.a(bitmapDrawable, rect2).c(1.0f, 0.0f).e(this.K0).f(this.L0);
            } else {
                d = new OverlayListView.a(bitmapDrawable, rect2).g(this.p0 * size).e(this.I0).f(this.L0).d(new a(hVar));
                this.k0.add(hVar);
            }
            this.f0.a(d);
        }
    }

    void o(boolean z) {
        Set set;
        int firstVisiblePosition = this.f0.getFirstVisiblePosition();
        for (int i2 = 0; i2 < this.f0.getChildCount(); i2++) {
            View childAt = this.f0.getChildAt(i2);
            zm4.h hVar = (zm4.h) this.g0.getItem(firstVisiblePosition + i2);
            if (!z || (set = this.i0) == null || !set.contains(hVar)) {
                ((LinearLayout) childAt.findViewById(qf6.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.f0.c();
        if (z) {
            return;
        }
        r(false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = true;
        this.g.b(ym4.c, this.h, 2);
        F(this.g.h());
    }

    @Override // androidx.appcompat.app.a, defpackage.vk, defpackage.xq0, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(fi6.mr_controller_material_dialog_b);
        findViewById(R.id.button3).setVisibility(8);
        m mVar = new m();
        FrameLayout frameLayout = (FrameLayout) findViewById(qf6.mr_expandable_area);
        this.x = frameLayout;
        frameLayout.setOnClickListener(new e());
        LinearLayout linearLayout = (LinearLayout) findViewById(qf6.mr_dialog_area);
        this.y = linearLayout;
        linearLayout.setOnClickListener(new f());
        int d = androidx.mediarouter.app.i.d(this.j);
        Button button = (Button) findViewById(R.id.button2);
        this.r = button;
        button.setText(zk6.mr_controller_disconnect);
        this.r.setTextColor(d);
        this.r.setOnClickListener(mVar);
        Button button2 = (Button) findViewById(R.id.button1);
        this.s = button2;
        button2.setText(zk6.mr_controller_stop_casting);
        this.s.setTextColor(d);
        this.s.setOnClickListener(mVar);
        this.Q = (TextView) findViewById(qf6.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(qf6.mr_close);
        this.u = imageButton;
        imageButton.setOnClickListener(mVar);
        this.H = (FrameLayout) findViewById(qf6.mr_custom_control);
        this.B = (FrameLayout) findViewById(qf6.mr_default_control);
        g gVar = new g();
        ImageView imageView = (ImageView) findViewById(qf6.mr_art);
        this.L = imageView;
        imageView.setOnClickListener(gVar);
        findViewById(qf6.mr_control_title_container).setOnClickListener(gVar);
        this.X = (LinearLayout) findViewById(qf6.mr_media_main_control);
        this.e0 = findViewById(qf6.mr_control_divider);
        this.Y = (RelativeLayout) findViewById(qf6.mr_playback_control);
        this.M = (TextView) findViewById(qf6.mr_control_title);
        this.N = (TextView) findViewById(qf6.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(qf6.mr_control_playback_ctrl);
        this.t = imageButton2;
        imageButton2.setOnClickListener(mVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(qf6.mr_volume_control);
        this.Z = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(qf6.mr_volume_slider);
        this.l0 = seekBar;
        seekBar.setTag(this.i);
        q qVar = new q();
        this.m0 = qVar;
        this.l0.setOnSeekBarChangeListener(qVar);
        this.f0 = (OverlayListView) findViewById(qf6.mr_volume_group_list);
        this.h0 = new ArrayList();
        r rVar = new r(this.f0.getContext(), this.h0);
        this.g0 = rVar;
        this.f0.setAdapter((ListAdapter) rVar);
        this.k0 = new HashSet();
        androidx.mediarouter.app.i.u(this.j, this.X, this.f0, this.i.x());
        androidx.mediarouter.app.i.w(this.j, (MediaRouteVolumeSlider) this.l0, this.X);
        HashMap hashMap = new HashMap();
        this.s0 = hashMap;
        hashMap.put(this.i, this.l0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(qf6.mr_group_expand_collapse);
        this.w = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new h());
        B();
        this.I0 = this.j.getResources().getInteger(th6.mr_controller_volume_group_list_animation_duration_ms);
        this.J0 = this.j.getResources().getInteger(th6.mr_controller_volume_group_list_fade_in_duration_ms);
        this.K0 = this.j.getResources().getInteger(th6.mr_controller_volume_group_list_fade_out_duration_ms);
        View C = C(bundle);
        this.n = C;
        if (C != null) {
            this.H.addView(C);
            this.H.setVisibility(0);
        }
        this.k = true;
        K();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.g.o(this.h);
        F(null);
        this.l = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.a, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.i.G(i2 == 25 ? -1 : 1);
        return true;
    }

    @Override // androidx.appcompat.app.a, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 25 || i2 == 24) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    void p() {
        this.A0 = false;
        this.B0 = null;
        this.C0 = 0;
    }

    void r(boolean z) {
        this.i0 = null;
        this.j0 = null;
        this.G0 = false;
        if (this.H0) {
            this.H0 = false;
            L(z);
        }
        this.f0.setEnabled(true);
    }

    int s(int i2, int i3) {
        float f2;
        float f3;
        if (i2 >= i3) {
            f2 = this.m * i3;
            f3 = i2;
        } else {
            f2 = this.m * 9.0f;
            f3 = 16.0f;
        }
        return (int) ((f2 / f3) + 0.5f);
    }

    boolean x() {
        return (this.v0.b() & 514) != 0;
    }

    boolean y() {
        return (this.v0.b() & 516) != 0;
    }

    boolean z() {
        return (this.v0.b() & 1) != 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 1
            android.content.Context r2 = androidx.mediarouter.app.i.b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.i.c(r2)
            r1.<init>(r2, r3)
            r1.S = r0
            androidx.mediarouter.app.d$d r3 = new androidx.mediarouter.app.d$d
            r3.<init>()
            r1.Q0 = r3
            android.content.Context r3 = r1.getContext()
            r1.j = r3
            androidx.mediarouter.app.d$o r3 = new androidx.mediarouter.app.d$o
            r3.<init>()
            r1.u0 = r3
            android.content.Context r3 = r1.j
            zm4 r3 = defpackage.zm4.g(r3)
            r1.g = r3
            androidx.mediarouter.app.d$p r0 = new androidx.mediarouter.app.d$p
            r0.<init>()
            r1.h = r0
            zm4$h r0 = r3.k()
            r1.i = r0
            android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.h()
            r1.F(r3)
            android.content.Context r3 = r1.j
            android.content.res.Resources r3 = r3.getResources()
            int r0 = defpackage.xd6.mr_controller_volume_group_list_padding_top
            int r3 = r3.getDimensionPixelSize(r0)
            r1.r0 = r3
            android.content.Context r3 = r1.j
            java.lang.String r0 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.P0 = r3
            int r3 = defpackage.uh6.mr_linear_out_slow_in
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.M0 = r3
            int r3 = defpackage.uh6.mr_fast_out_slow_in
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.N0 = r2
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.O0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.<init>(android.content.Context, int):void");
    }
}
