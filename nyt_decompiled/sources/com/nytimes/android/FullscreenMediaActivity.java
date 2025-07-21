package com.nytimes.android;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.nytimes.android.FullscreenMediaActivity;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.video.FullscreenToolsController;
import defpackage.a18;
import defpackage.b04;
import defpackage.bj6;
import defpackage.c28;
import defpackage.cr5;
import defpackage.ei6;
import defpackage.fe6;
import defpackage.gr2;
import defpackage.gt7;
import defpackage.ht7;
import defpackage.jc;
import defpackage.ng6;
import defpackage.nr;
import defpackage.ph6;
import defpackage.r57;
import defpackage.x3;
import defpackage.z27;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes2.dex */
public class FullscreenMediaActivity extends b implements ht7, z27, nr {
    protected b04 analyticsClient;
    private Toolbar e;
    private a18 f;
    private TextView g;
    private int h;
    cr5 performanceTrackerClient;
    RecentlyViewedManager recentlyViewedManager;
    r57 sectionFrontStore;
    protected b04 sharingManager;
    gt7 singleFullMediaPresenter;
    SnackbarUtil snackbarUtil;
    FullscreenToolsController toolsController;

    private boolean S(int i) {
        return i == 6 || i == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(FullscreenToolsController.SyncAction syncAction) {
        a0(syncAction == FullscreenToolsController.SyncAction.SHOW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(Throwable th) {
        NYTLogger.i(th, "Error listening to sync events", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(int i) {
        FullscreenToolsController fullscreenToolsController;
        if ((i & 1) == 0 && (fullscreenToolsController = this.toolsController) != null) {
            fullscreenToolsController.a(FullscreenToolsController.SyncAction.HIDE);
        }
        if (S(i)) {
            return;
        }
        Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(ValueAnimator valueAnimator) {
        b0(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    private void X() {
        this.compositeDisposable.add(this.toolsController.c().observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: fs2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FullscreenMediaActivity.this.T((FullscreenToolsController.SyncAction) obj);
            }
        }, new Consumer() { // from class: gs2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FullscreenMediaActivity.U((Throwable) obj);
            }
        }));
    }

    private void Y() {
        this.singleFullMediaPresenter.i(getIntent().getExtras());
    }

    private void Z() {
        if (getWindow() == null || getWindow().getDecorView() == null) {
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    private void c0(com.nytimes.android.fragment.fullscreen.a aVar) {
        if (isFinishing()) {
            return;
        }
        try {
            getSupportFragmentManager().p().r(ng6.container, aVar, "CONTENT_FRAGMENT_TAG").h();
        } catch (IllegalStateException e) {
            NYTLogger.C(e, "we could not attach fragment", new Object[0]);
            finish();
        }
    }

    @Override // defpackage.ht7
    public void a(Asset asset) {
        throw new IllegalStateException("Article asset " + asset.getSafeUri() + " managed using FullScreenMediaActivity");
    }

    void a0(boolean z) {
        a18 a18Var = this.f;
        if (a18Var != null) {
            a18Var.cancel();
        }
        a18 a = a18.a(!z ? 1 : 0, ((RelativeLayout.LayoutParams) this.e.getLayoutParams()).topMargin, z ? 0 : this.h);
        this.f = a;
        a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hs2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FullscreenMediaActivity.this.W(valueAnimator);
            }
        });
        this.f.setDuration(getResources().getInteger(ph6.fullscreen_media_animation_duration));
        this.f.start();
    }

    @Override // defpackage.ht7
    public void b(String str, String str2) {
        throw new IllegalStateException("Web asset " + str + " managed using FullScreenMediaActivity");
    }

    void b0(int i) {
        ((RelativeLayout.LayoutParams) this.e.getLayoutParams()).topMargin = i;
        this.e.requestLayout();
    }

    @Override // defpackage.ht7
    public void c(AudioAsset audioAsset) {
        throw new IllegalStateException("Audio asset " + audioAsset.getSafeUri() + " managed using FullScreenMediaActivity");
    }

    @Override // defpackage.ht7
    public void d() {
    }

    @Override // defpackage.ht7
    public void g() {
    }

    @Override // defpackage.ht7
    public void h(int i) {
        this.snackbarUtil.v(getString(i));
    }

    @Override // defpackage.ht7
    public void l(Asset asset) {
        com.nytimes.android.fragment.fullscreen.a b = gr2.b(asset);
        if (!(asset instanceof ImageAsset)) {
            this.recentlyViewedManager.a(c28.c(asset), OffsetDateTime.now());
        }
        c0(b);
    }

    @Override // com.nytimes.android.b, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        FullscreenToolsController.SyncAction syncAction;
        super.onCreate(bundle);
        setContentView(ei6.activity_full_screen_media);
        Toolbar toolbar = (Toolbar) findViewById(ng6.toolbar);
        this.e = toolbar;
        setSupportActionBar(toolbar);
        int dimensionPixelSize = getResources().getDimensionPixelSize(fe6.abc_action_bar_default_height_material) * (-2);
        this.h = dimensionPixelSize;
        b0(dimensionPixelSize);
        x3 supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayOptions(22);
        supportActionBar.setCustomView(getLayoutInflater().inflate(ei6.action_bar_center_title, (ViewGroup) null), new x3.a(-2, -2, 17));
        TextView textView = (TextView) supportActionBar.getCustomView().findViewById(ng6.action_bar_title);
        this.g = textView;
        textView.setText(getTitle());
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: es2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i) {
                FullscreenMediaActivity.this.V(i);
            }
        });
        X();
        if (bundle == null) {
            this.singleFullMediaPresenter.g(this);
            Y();
        } else {
            if (!bundle.containsKey("FullscreenMediaActivity.SI_PARAMS") || (syncAction = (FullscreenToolsController.SyncAction) bundle.getSerializable("FullscreenMediaActivity.SI_PARAMS")) == null) {
                return;
            }
            this.toolsController.a(syncAction);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(bj6.fullscreen_media, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.nytimes.android.b, com.nytimes.android.BaseAppCompatActivity, defpackage.jk, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        a18 a18Var = this.f;
        if (a18Var != null) {
            a18Var.removeAllUpdateListeners();
        }
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((jc) this.analyticsClient.get()).B(-1);
        Z();
    }

    @Override // androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("FullscreenMediaActivity.SI_PARAMS", this.toolsController.b());
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
