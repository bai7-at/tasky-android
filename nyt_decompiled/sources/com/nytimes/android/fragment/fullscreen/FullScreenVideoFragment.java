package com.nytimes.android.fragment.fullscreen;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.fragment.app.f;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.util.VideoUtil;
import com.nytimes.android.media.video.presenter.FullscreenVideoFetcher;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.video.FullscreenToolsController;
import com.nytimes.android.video.views.ExoPlayerView;
import com.nytimes.android.video.views.VideoControlView;
import defpackage.b22;
import defpackage.bj6;
import defpackage.bo4;
import defpackage.c04;
import defpackage.e44;
import defpackage.ei6;
import defpackage.gp2;
import defpackage.hb5;
import defpackage.j69;
import defpackage.jk;
import defpackage.ng6;
import defpackage.nk6;
import defpackage.o83;
import defpackage.oz4;
import defpackage.qo4;
import defpackage.qs2;
import defpackage.sm6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x3;
import defpackage.x89;
import defpackage.z4;
import defpackage.zg6;
import defpackage.zh4;
import defpackage.zm8;
import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class FullScreenVideoFragment extends o83 {
    public static final a Companion = new a(null);
    public static final int s = 8;
    public z4 activityMediaManager;
    public AudioManager audioManager;
    private NYTMediaItem g;
    private j69 i;
    private LoadVideoOrigin j;
    private ExoPlayerView k;
    private VideoControlView l;
    private boolean m;
    public hb5 mediaControl;
    public zh4 mediaEvents;
    public bo4 mediaServiceConnection;
    private boolean n;
    public NetworkStatus networkStatus;
    public FullscreenToolsController toolsController;
    public x89 videoEventReporter;
    public FullscreenVideoFetcher videoFetcher;
    public VideoUtil videoUtil;
    private final c04 f = kotlin.c.a(new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment$styleValue$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final String mo865invoke() {
            String stringExtra = FullScreenVideoFragment.this.requireActivity().getIntent().getStringExtra("com.nytimes.android.fullscreen.extra_style");
            return stringExtra == null ? "Inline" : stringExtra;
        }
    });
    private Params h = Params.Companion.a();
    private final CompositeDisposable r = new CompositeDisposable();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LoadVideoOrigin {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ LoadVideoOrigin[] $VALUES;
        public static final LoadVideoOrigin INITIAL = new LoadVideoOrigin("INITIAL", 0);
        public static final LoadVideoOrigin RESOLUTION_CHANGE = new LoadVideoOrigin("RESOLUTION_CHANGE", 1);
        public static final LoadVideoOrigin MENU_REFRESH = new LoadVideoOrigin("MENU_REFRESH", 2);
        public static final LoadVideoOrigin DIALOG_REFRESH = new LoadVideoOrigin("DIALOG_REFRESH", 3);

        private static final /* synthetic */ LoadVideoOrigin[] $values() {
            return new LoadVideoOrigin[]{INITIAL, RESOLUTION_CHANGE, MENU_REFRESH, DIALOG_REFRESH};
        }

        static {
            LoadVideoOrigin[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private LoadVideoOrigin(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static LoadVideoOrigin valueOf(String str) {
            return (LoadVideoOrigin) Enum.valueOf(LoadVideoOrigin.class, str);
        }

        public static LoadVideoOrigin[] values() {
            return (LoadVideoOrigin[]) $VALUES.clone();
        }
    }

    public static final class Params implements Serializable {
        public static final a Companion = new a(null);
        private final VideoUtil.VideoRes curVideoResolution;
        private final long playPosition;
        private final boolean shouldPlayOnStart;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Params a() {
                return new Params(0L, false, VideoUtil.VideoRes.HIGH);
            }

            private a() {
            }
        }

        public Params(long j, boolean z, VideoUtil.VideoRes videoRes) {
            zq3.h(videoRes, "curVideoResolution");
            this.playPosition = j;
            this.shouldPlayOnStart = z;
            this.curVideoResolution = videoRes;
        }

        public static /* synthetic */ Params b(Params params, long j, boolean z, VideoUtil.VideoRes videoRes, int i, Object obj) {
            if ((i & 1) != 0) {
                j = params.playPosition;
            }
            if ((i & 2) != 0) {
                z = params.shouldPlayOnStart;
            }
            if ((i & 4) != 0) {
                videoRes = params.curVideoResolution;
            }
            return params.a(j, z, videoRes);
        }

        public final Params a(long j, boolean z, VideoUtil.VideoRes videoRes) {
            zq3.h(videoRes, "curVideoResolution");
            return new Params(j, z, videoRes);
        }

        public final VideoUtil.VideoRes c() {
            return this.curVideoResolution;
        }

        public final long d() {
            return this.playPosition;
        }

        public final boolean e() {
            return this.shouldPlayOnStart;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.playPosition == params.playPosition && this.shouldPlayOnStart == params.shouldPlayOnStart && this.curVideoResolution == params.curVideoResolution;
        }

        public int hashCode() {
            return (((Long.hashCode(this.playPosition) * 31) + Boolean.hashCode(this.shouldPlayOnStart)) * 31) + this.curVideoResolution.hashCode();
        }

        public String toString() {
            return "Params(playPosition=" + this.playPosition + ", shouldPlayOnStart=" + this.shouldPlayOnStart + ", curVideoResolution=" + this.curVideoResolution + ")";
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E1(final NYTMediaItem nYTMediaItem) {
        this.g = nYTMediaItem;
        this.j = LoadVideoOrigin.INITIAL;
        s1().j(new oz4() { // from class: tr2
            @Override // defpackage.oz4
            public final void call() {
                FullScreenVideoFragment.F1(FullScreenVideoFragment.this, nYTMediaItem);
            }
        });
        M1();
        q1(nYTMediaItem);
        setHasOptionsMenu(true);
        ET2CoroutineScopeKt.d(this, new FullScreenVideoFragment$handleInitialVideoLoad$2(nYTMediaItem, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(FullScreenVideoFragment fullScreenVideoFragment, NYTMediaItem nYTMediaItem) {
        zq3.h(fullScreenVideoFragment, "this$0");
        zq3.h(nYTMediaItem, "$videoItem");
        fullScreenVideoFragment.r1(nYTMediaItem, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(NYTMediaItem nYTMediaItem) {
        if (!L1(nYTMediaItem) || this.n) {
            return;
        }
        this.n = true;
        NYTMediaItem nYTMediaItem2 = this.g;
        if (nYTMediaItem2 == null || !this.h.e()) {
            return;
        }
        B1().e(nYTMediaItem2, z1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(PlaybackStateCompat playbackStateCompat) {
        ExoPlayerView exoPlayerView;
        NYTMediaItem nYTMediaItem = this.g;
        int h = playbackStateCompat.h();
        if (h != 1) {
            if (h == 2 || h == 3) {
                if (nYTMediaItem != null) {
                    if (playbackStateCompat.h() == 3) {
                        B1().b(nYTMediaItem, z1());
                    } else {
                        B1().f(nYTMediaItem);
                    }
                }
                this.m = true;
                ExoPlayerView exoPlayerView2 = this.k;
                if (exoPlayerView2 != null) {
                    exoPlayerView2.setOnControlClickAction(new oz4() { // from class: ur2
                        @Override // defpackage.oz4
                        public final void call() {
                            FullScreenVideoFragment.I1(FullScreenVideoFragment.this);
                        }
                    });
                }
            } else if (h == 7) {
                if (this.j == LoadVideoOrigin.DIALOG_REFRESH) {
                    R1(2, false);
                } else {
                    R1(1, true);
                }
            }
        } else if (this.m) {
            if (!v1().m() && (exoPlayerView = this.k) != null) {
                exoPlayerView.setOnControlClickAction(new oz4() { // from class: vr2
                    @Override // defpackage.oz4
                    public final void call() {
                        FullScreenVideoFragment.J1();
                    }
                });
            }
            f activity = getActivity();
            if (activity != null && !activity.isFinishing() && nYTMediaItem != null) {
                B1().m(nYTMediaItem, z1());
            }
            b1();
        }
        W1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(FullScreenVideoFragment fullScreenVideoFragment) {
        zq3.h(fullScreenVideoFragment, "this$0");
        if (fullScreenVideoFragment.v1().m()) {
            return;
        }
        fullScreenVideoFragment.A1().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1() {
    }

    private final void K1() {
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new FullScreenVideoFragment$initialVideoLoad$1(this, null), 3, null);
    }

    private final boolean L1(NYTMediaItem nYTMediaItem) {
        NYTMediaItem nYTMediaItem2 = this.g;
        return zq3.c(nYTMediaItem2 != null ? nYTMediaItem2.a() : null, nYTMediaItem.a()) && nYTMediaItem.d() != null;
    }

    private final void M1() {
        DisposableKt.plusAssign(this.r, SubscribersKt.subscribeBy$default(w1().q(), new ss2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment$listenToExoEvents$1
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.h(th, "it");
                NYTLogger.i(th, "Error listening to exo events.", new Object[0]);
            }
        }, (qs2) null, new ss2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment$listenToExoEvents$2
            {
                super(1);
            }

            public final void b(PlaybackStateCompat playbackStateCompat) {
                zq3.h(playbackStateCompat, "it");
                FullScreenVideoFragment.this.H1(playbackStateCompat);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((PlaybackStateCompat) obj);
                return ww8.a;
            }
        }, 2, (Object) null));
        DisposableKt.plusAssign(this.r, SubscribersKt.subscribeBy$default(w1().p(), new ss2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment$listenToExoEvents$3
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.h(th, "it");
                NYTLogger.i(th, "Error listening to meta changes.", new Object[0]);
            }
        }, (qs2) null, new ss2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment$listenToExoEvents$4
            {
                super(1);
            }

            public final void b(NYTMediaItem nYTMediaItem) {
                zq3.h(nYTMediaItem, "it");
                FullScreenVideoFragment.this.G1(nYTMediaItem);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((NYTMediaItem) obj);
                return ww8.a;
            }
        }, 2, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(FullScreenVideoFragment fullScreenVideoFragment) {
        zq3.h(fullScreenVideoFragment, "this$0");
        fullScreenVideoFragment.K1();
    }

    private final void O1(LoadVideoOrigin loadVideoOrigin, boolean z) {
        this.j = loadVideoOrigin;
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new FullScreenVideoFragment$reloadVideo$1(this, z, null), 3, null);
    }

    private final void Q1(Bundle bundle) {
        Params params;
        if (bundle == null) {
            params = new Params(0L, true, u1());
        } else {
            params = (Params) bundle.getSerializable("si_video_fragment_params");
            if (params == null) {
                params = Params.Companion.a();
            }
        }
        this.h = params;
    }

    private final void R1(int i, final boolean z) {
        if (i == 1) {
            new a.C0012a(requireActivity(), sm6.AlertDialogCustom).e(nk6.dialog_msg_video_init_load_fail).b(false).setPositiveButton(nk6.dialog_btn_refresh, new DialogInterface.OnClickListener() { // from class: wr2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    FullScreenVideoFragment.U1(FullScreenVideoFragment.this, z, dialogInterface, i2);
                }
            }).setNegativeButton(nk6.dialog_btn_no_thanks, new DialogInterface.OnClickListener() { // from class: xr2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    FullScreenVideoFragment.V1(FullScreenVideoFragment.this, dialogInterface, i2);
                }
            }).p();
        } else {
            if (i != 2) {
                return;
            }
            new a.C0012a(requireActivity(), sm6.AlertDialogCustom).e(nk6.dialog_msg_video_init_load_fail).b(true).setPositiveButton(nk6.dialog_btn_ok, new DialogInterface.OnClickListener() { // from class: yr2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    FullScreenVideoFragment.S1(FullScreenVideoFragment.this, dialogInterface, i2);
                }
            }).i(new DialogInterface.OnCancelListener() { // from class: zr2
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    FullScreenVideoFragment.T1(FullScreenVideoFragment.this, dialogInterface);
                }
            }).p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(FullScreenVideoFragment fullScreenVideoFragment, DialogInterface dialogInterface, int i) {
        zq3.h(fullScreenVideoFragment, "this$0");
        fullScreenVideoFragment.b1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(FullScreenVideoFragment fullScreenVideoFragment, DialogInterface dialogInterface) {
        zq3.h(fullScreenVideoFragment, "this$0");
        fullScreenVideoFragment.b1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(FullScreenVideoFragment fullScreenVideoFragment, boolean z, DialogInterface dialogInterface, int i) {
        zq3.h(fullScreenVideoFragment, "this$0");
        fullScreenVideoFragment.O1(LoadVideoOrigin.DIALOG_REFRESH, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V1(FullScreenVideoFragment fullScreenVideoFragment, DialogInterface dialogInterface, int i) {
        zq3.h(fullScreenVideoFragment, "this$0");
        fullScreenVideoFragment.b1();
    }

    private final void W1() {
        MediaControllerCompat b = MediaControllerCompat.b(requireActivity());
        if (b == null) {
            return;
        }
        int h = b.d().h();
        if (h == 2 || h == 3) {
            this.h = Params.b(this.h, b.d().g(), b.d().h() == 3, null, 4, null);
        }
    }

    private final void X1() {
        if (requireActivity().getIntent().hasExtra("com.nytimes.android.extra.EXTRA_VIDEO_CONTROLS_VISIBLE")) {
            A1().a(FullscreenToolsController.SyncAction.SHOW);
        }
    }

    private final void q1(NYTMediaItem nYTMediaItem) {
        if (getParentFragment() != null) {
            return;
        }
        f requireActivity = requireActivity();
        zq3.f(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        jk jkVar = (jk) requireActivity;
        x3 supportActionBar = jkVar.getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        View inflate = jkVar.getLayoutInflater().inflate(ei6.action_bar_video_view, (ViewGroup) null);
        supportActionBar.setCustomView(inflate, new x3.a(-2, -2, 17));
        TextView textView = (TextView) inflate.findViewById(ng6.action_bar_title);
        String p = nYTMediaItem.p();
        textView.setVisibility(p.length() == 0 ? 8 : 0);
        textView.setText(p);
        TextView textView2 = (TextView) inflate.findViewById(ng6.action_bar_by_line);
        String k0 = nYTMediaItem.k0();
        textView2.setVisibility(k0.length() == 0 ? 8 : 0);
        textView2.setText(gp2.a(getActivity(), nk6.fullscreen_video_byline, k0));
        requireActivity().invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(NYTMediaItem nYTMediaItem, boolean z) {
        NYTMediaItem nYTMediaItem2 = this.g;
        String Y = nYTMediaItem2 != null ? nYTMediaItem2.Y() : null;
        if (Y == null || Y.length() == 0) {
            zm8.e(getActivity(), nk6.video_not_found);
            b1();
            return;
        }
        VideoControlView videoControlView = this.l;
        if (videoControlView != null) {
            videoControlView.z(nYTMediaItem2.a());
        }
        Intent intent = requireActivity().getIntent();
        if (!intent.hasExtra("com.nytimes.android.extra.VIDEO_FROM_INLINE") || this.h.d() != 0) {
            bo4 x1 = x1();
            NYTMediaItem n = nYTMediaItem.n(NYTMediaItem.ActiveView.FULL_SCREEN);
            qo4 a2 = qo4.Companion.a(z, this.h.e());
            ExoPlayerView exoPlayerView = this.k;
            x1.h(n, a2, exoPlayerView != null ? exoPlayerView.getPresenter() : null);
            if (!isAdded() || nYTMediaItem.R()) {
                return;
            }
            v1().y(this.h.d());
            return;
        }
        bo4 x12 = x1();
        ExoPlayerView exoPlayerView2 = this.k;
        x12.b(exoPlayerView2 != null ? exoPlayerView2.getPresenter() : null);
        X1();
        if (intent.hasExtra("com.nytimes.android.extra.EXTRA_VIDEO_PLAYBACK_STATE")) {
            if (intent.getIntExtra("com.nytimes.android.extra.EXTRA_VIDEO_PLAYBACK_STATE", -1) == 3) {
                v1().w();
            } else {
                v1().v();
            }
        }
    }

    private final VideoUtil.VideoRes u1() {
        return D1().getDefaultResolution(getNetworkStatus().i());
    }

    private final String z1() {
        return (String) this.f.getValue();
    }

    public final FullscreenToolsController A1() {
        FullscreenToolsController fullscreenToolsController = this.toolsController;
        if (fullscreenToolsController != null) {
            return fullscreenToolsController;
        }
        zq3.z("toolsController");
        return null;
    }

    public final x89 B1() {
        x89 x89Var = this.videoEventReporter;
        if (x89Var != null) {
            return x89Var;
        }
        zq3.z("videoEventReporter");
        return null;
    }

    public final FullscreenVideoFetcher C1() {
        FullscreenVideoFetcher fullscreenVideoFetcher = this.videoFetcher;
        if (fullscreenVideoFetcher != null) {
            return fullscreenVideoFetcher;
        }
        zq3.z("videoFetcher");
        return null;
    }

    public final VideoUtil D1() {
        VideoUtil videoUtil = this.videoUtil;
        if (videoUtil != null) {
            return videoUtil;
        }
        zq3.z("videoUtil");
        return null;
    }

    public final void P1(Params params) {
        zq3.h(params, "<set-?>");
        this.h = params;
    }

    public final NetworkStatus getNetworkStatus() {
        NetworkStatus networkStatus = this.networkStatus;
        if (networkStatus != null) {
            return networkStatus;
        }
        zq3.z("networkStatus");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        t1().j();
        Q1(bundle);
        MediaControllerCompat b = MediaControllerCompat.b(requireActivity());
        this.i = b != null ? new j69(this, b, getNetworkStatus()) : null;
        x1().a(new oz4() { // from class: sr2
            @Override // defpackage.oz4
            public final void call() {
                FullScreenVideoFragment.N1(FullScreenVideoFragment.this);
            }
        });
        x1().c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        zq3.h(menu, "menu");
        zq3.h(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(bj6.fullscreen_video, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(ei6.fragment_full_screen_video, viewGroup, false);
        zq3.f(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.l = (VideoControlView) viewGroup2.findViewById(zg6.control_view);
        ExoPlayerView exoPlayerView = (ExoPlayerView) viewGroup2.findViewById(ng6.fullscreen_exo_player_view);
        VideoControlView videoControlView = this.l;
        zq3.e(videoControlView);
        exoPlayerView.setCaptions(videoControlView.getCaptionsView());
        this.k = exoPlayerView;
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.r.clear();
        if (!requireActivity().getIntent().hasExtra("com.nytimes.android.extra.VIDEO_FROM_INLINE")) {
            v1().A();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        zq3.h(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == ng6.disable_hq_video) {
            W1();
            this.h = Params.b(this.h, 0L, false, VideoUtil.VideoRes.LOW, 3, null);
            O1(LoadVideoOrigin.RESOLUTION_CHANGE, false);
            return true;
        }
        if (itemId == ng6.enable_hq_video) {
            W1();
            this.h = Params.b(this.h, 0L, false, VideoUtil.VideoRes.HIGH, 3, null);
            O1(LoadVideoOrigin.RESOLUTION_CHANGE, false);
            return true;
        }
        if (itemId != ng6.refresh_video) {
            return super.onOptionsItemSelected(menuItem);
        }
        W1();
        O1(LoadVideoOrigin.MENU_REFRESH, false);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        W1();
        if (this.i != null) {
            requireActivity().unregisterReceiver(this.i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        zq3.h(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        NYTMediaItem nYTMediaItem = this.g;
        if (!(nYTMediaItem != null ? nYTMediaItem.R() : false)) {
            boolean z = this.h.c() == VideoUtil.VideoRes.HIGH;
            menu.findItem(ng6.disable_hq_video).setVisible(z);
            menu.findItem(ng6.enable_hq_video).setVisible(!z);
        }
        menu.findItem(ng6.action_share).setVisible(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getNetworkStatus().g() && this.h.e()) {
            s1().k();
        } else {
            v1().v();
            this.h = Params.b(this.h, 0L, false, null, 5, null);
        }
        if (this.i != null) {
            requireActivity().registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        zq3.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        W1();
        bundle.putSerializable("si_video_fragment_params", this.h);
    }

    public final z4 s1() {
        z4 z4Var = this.activityMediaManager;
        if (z4Var != null) {
            return z4Var;
        }
        zq3.z("activityMediaManager");
        return null;
    }

    public final AudioManager t1() {
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            return audioManager;
        }
        zq3.z("audioManager");
        return null;
    }

    public final hb5 v1() {
        hb5 hb5Var = this.mediaControl;
        if (hb5Var != null) {
            return hb5Var;
        }
        zq3.z("mediaControl");
        return null;
    }

    public final zh4 w1() {
        zh4 zh4Var = this.mediaEvents;
        if (zh4Var != null) {
            return zh4Var;
        }
        zq3.z("mediaEvents");
        return null;
    }

    public final bo4 x1() {
        bo4 bo4Var = this.mediaServiceConnection;
        if (bo4Var != null) {
            return bo4Var;
        }
        zq3.z("mediaServiceConnection");
        return null;
    }

    public final Params y1() {
        return this.h;
    }
}
