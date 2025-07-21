package com.nytimes.android.media.audio.views;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.nytimes.android.analytics.event.audio.AudioReferralSource;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.audio.views.AudioDrawerDialogFragment;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.ax;
import defpackage.be6;
import defpackage.bg6;
import defpackage.fg6;
import defpackage.hb5;
import defpackage.sm6;
import defpackage.vx0;
import defpackage.yh6;
import defpackage.zh4;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public class AudioDrawerDialogFragment extends i {
    AudioManager audioManager;
    ax eventReporter;
    private CoordinatorLayout.c g;
    private LinearLayout h;
    private ImageView i;
    private boolean k;
    hb5 mediaController;
    zh4 mediaEvents;
    private boolean j = false;
    private final CompositeDisposable l = new CompositeDisposable();
    private final BottomSheetBehavior.g m = new a();

    class a extends BottomSheetBehavior.g {
        a() {
        }

        private void d(float f) {
            if (AudioDrawerDialogFragment.this.j) {
                AudioDrawerDialogFragment.this.i.setAlpha(1.0f - f);
            } else {
                AudioDrawerDialogFragment.this.i.setAlpha(0.0f);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f) {
            AudioDrawerDialogFragment.this.h.setAlpha(f);
            d(f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i) {
            if (i == 4 || i == 5) {
                AudioDrawerDialogFragment.this.audioManager.h();
                AudioDrawerDialogFragment.this.dismiss();
            } else if (i == 3) {
                AudioDrawerDialogFragment.this.j = true;
            }
        }
    }

    private void r1() {
        if (getDialog().isShowing()) {
            CoordinatorLayout.c cVar = this.g;
            if (cVar instanceof BottomSheetBehavior) {
                ((BottomSheetBehavior) cVar).t0(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s1(Throwable th) {
        NYTLogger.i(th, "Error listening to state changes.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean t1(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            r1();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u1(View view) {
        r1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1(BottomSheetBehavior bottomSheetBehavior, DialogInterface dialogInterface) {
        if (this.k) {
            bottomSheetBehavior.t0(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1(PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat.h() == 7) {
            r1();
        }
    }

    public static void x1(FragmentManager fragmentManager, AudioReferralSource audioReferralSource) {
        if (fragmentManager.k0("AUDIO_DRAWER") == null) {
            AudioDrawerDialogFragment audioDrawerDialogFragment = new AudioDrawerDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("REFERRAL_SOURCE", audioReferralSource.getTitle());
            audioDrawerDialogFragment.setArguments(bundle);
            audioDrawerDialogFragment.show(fragmentManager, "AUDIO_DRAWER");
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setDimAmount(0.2f);
            window.setWindowAnimations(0);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = bundle == null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.l.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.l.add(this.mediaEvents.q().subscribe(new Consumer() { // from class: ow
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioDrawerDialogFragment.this.w1((PlaybackStateCompat) obj);
            }
        }, new Consumer() { // from class: pw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioDrawerDialogFragment.s1((Throwable) obj);
            }
        }));
        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: qw
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                boolean t1;
                t1 = AudioDrawerDialogFragment.this.t1(dialogInterface, i, keyEvent);
                return t1;
            }
        });
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.k) {
            return;
        }
        this.i.setAlpha(0.0f);
        ((BottomSheetBehavior) this.g).t0(3);
    }

    @Override // androidx.fragment.app.e
    public void setCancelable(boolean z) {
        Dialog dialog = getDialog();
        int i = bg6.touch_outside;
        if (dialog == null || dialog.getWindow() == null || dialog.getWindow().getDecorView().findViewById(i) == null) {
            super.setCancelable(z);
            return;
        }
        View findViewById = dialog.getWindow().getDecorView().findViewById(i);
        if (z) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: nw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AudioDrawerDialogFragment.this.u1(view);
                }
            });
        } else {
            findViewById.setOnClickListener(null);
        }
    }

    @Override // defpackage.wk, androidx.fragment.app.e
    public void setupDialog(Dialog dialog, int i) {
        super.setupDialog(dialog, i);
        View inflate = View.inflate(new vx0(getContext(), sm6.AppTheme), yh6.audio_drawer_dialog_fragment, null);
        dialog.setContentView(inflate);
        setCancelable(true);
        AudioDrawer audioDrawer = (AudioDrawer) inflate.findViewById(fg6.audio_drawer);
        this.h = (LinearLayout) audioDrawer.findViewById(fg6.container_contents);
        this.i = (ImageView) audioDrawer.findViewById(fg6.tint);
        View view = (View) inflate.getParent();
        view.setBackgroundColor(0);
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        if (DeviceUtils.G(getActivity())) {
            view.setOutlineProvider(null);
            fVar.setMarginStart(DeviceUtils.p(getActivity()) - (getResources().getDimensionPixelSize(be6.audio_indicator_drawer_size) + (getResources().getDimensionPixelSize(be6.audio_indicator_full_size_padding_start_end) * 2)));
        }
        CoordinatorLayout.c e = fVar.e();
        this.g = e;
        if (e instanceof BottomSheetBehavior) {
            final BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) e;
            bottomSheetBehavior.f0(this.m);
            bottomSheetBehavior.o0(0);
            bottomSheetBehavior.l0(false);
            bottomSheetBehavior.s0(false);
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: rw
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    AudioDrawerDialogFragment.this.v1(bottomSheetBehavior, dialogInterface);
                }
            });
        }
    }
}
