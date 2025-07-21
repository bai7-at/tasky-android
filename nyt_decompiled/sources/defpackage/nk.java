package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.k0;
import androidx.lifecycle.Lifecycle;
import com.amazonaws.event.ProgressEvent;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.f4;
import defpackage.ic8;
import defpackage.m07;
import defpackage.tv3;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class nk extends mk implements e.a, LayoutInflater.Factory2 {
    private static final hs7 I0 = new hs7();
    private static final boolean J0 = false;
    private static final int[] K0 = {R.attr.windowBackground};
    private static final boolean L0 = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean M0 = true;
    private final Runnable A0;
    ActionBarContextView B;
    private boolean B0;
    private Rect C0;
    private Rect D0;
    private dl E0;
    private iz3 F0;
    private OnBackInvokedDispatcher G0;
    PopupWindow H;
    private OnBackInvokedCallback H0;
    Runnable L;
    ab9 M;
    private boolean N;
    private boolean Q;
    ViewGroup S;
    private TextView X;
    private View Y;
    private boolean Z;
    private boolean e0;
    boolean f0;
    boolean g0;
    boolean h0;
    boolean i0;
    final Object j;
    boolean j0;
    final Context k;
    private boolean k0;
    Window l;
    private u[] l0;
    private o m;
    private u m0;
    final kk n;
    private boolean n0;
    private boolean o0;
    private boolean p0;
    boolean q0;
    x3 r;
    private Configuration r0;
    MenuInflater s;
    private int s0;
    private CharSequence t;
    private int t0;
    private zc1 u;
    private int u0;
    private boolean v0;
    private h w;
    private q w0;
    private v x;
    private q x0;
    f4 y;
    boolean y0;
    int z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            nk nkVar = nk.this;
            if ((nkVar.z0 & 1) != 0) {
                nkVar.k0(0);
            }
            nk nkVar2 = nk.this;
            if ((nkVar2.z0 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0) {
                nkVar2.k0(108);
            }
            nk nkVar3 = nk.this;
            nkVar3.y0 = false;
            nkVar3.z0 = 0;
        }
    }

    class b implements be5 {
        b() {
        }

        @Override // defpackage.be5
        public ch9 a(View view, ch9 ch9Var) {
            int l = ch9Var.l();
            int g1 = nk.this.g1(ch9Var, null);
            if (l != g1) {
                ch9Var = ch9Var.q(ch9Var.j(), g1, ch9Var.k(), ch9Var.i());
            }
            return k99.X(view, ch9Var);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            nk.this.i0();
        }
    }

    class d implements Runnable {

        class a extends db9 {
            a() {
            }

            @Override // defpackage.cb9
            public void b(View view) {
                nk.this.B.setAlpha(1.0f);
                nk.this.M.h(null);
                nk.this.M = null;
            }

            @Override // defpackage.db9, defpackage.cb9
            public void c(View view) {
                nk.this.B.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            nk nkVar = nk.this;
            nkVar.H.showAtLocation(nkVar.B, 55, 0, 0);
            nk.this.l0();
            if (!nk.this.W0()) {
                nk.this.B.setAlpha(1.0f);
                nk.this.B.setVisibility(0);
            } else {
                nk.this.B.setAlpha(0.0f);
                nk nkVar2 = nk.this;
                nkVar2.M = k99.e(nkVar2.B).b(1.0f);
                nk.this.M.h(new a());
            }
        }
    }

    class e extends db9 {
        e() {
        }

        @Override // defpackage.cb9
        public void b(View view) {
            nk.this.B.setAlpha(1.0f);
            nk.this.M.h(null);
            nk.this.M = null;
        }

        @Override // defpackage.db9, defpackage.cb9
        public void c(View view) {
            nk.this.B.setVisibility(0);
            if (nk.this.B.getParent() instanceof View) {
                k99.i0((View) nk.this.B.getParent());
            }
        }
    }

    private class f implements y3 {
        f() {
        }
    }

    interface g {
        boolean a(int i);

        View onCreatePanelView(int i);
    }

    private final class h implements j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z) {
            nk.this.b0(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback x0 = nk.this.x0();
            if (x0 == null) {
                return true;
            }
            x0.onMenuOpened(108, eVar);
            return true;
        }
    }

    class i implements f4.a {
        private f4.a a;

        class a extends db9 {
            a() {
            }

            @Override // defpackage.cb9
            public void b(View view) {
                nk.this.B.setVisibility(8);
                nk nkVar = nk.this;
                PopupWindow popupWindow = nkVar.H;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (nkVar.B.getParent() instanceof View) {
                    k99.i0((View) nk.this.B.getParent());
                }
                nk.this.B.k();
                nk.this.M.h(null);
                nk nkVar2 = nk.this;
                nkVar2.M = null;
                k99.i0(nkVar2.S);
            }
        }

        public i(f4.a aVar) {
            this.a = aVar;
        }

        @Override // f4.a
        public boolean a(f4 f4Var, MenuItem menuItem) {
            return this.a.a(f4Var, menuItem);
        }

        @Override // f4.a
        public void b(f4 f4Var) {
            this.a.b(f4Var);
            nk nkVar = nk.this;
            if (nkVar.H != null) {
                nkVar.l.getDecorView().removeCallbacks(nk.this.L);
            }
            nk nkVar2 = nk.this;
            if (nkVar2.B != null) {
                nkVar2.l0();
                nk nkVar3 = nk.this;
                nkVar3.M = k99.e(nkVar3.B).b(0.0f);
                nk.this.M.h(new a());
            }
            nk nkVar4 = nk.this;
            kk kkVar = nkVar4.n;
            if (kkVar != null) {
                kkVar.onSupportActionModeFinished(nkVar4.y);
            }
            nk nkVar5 = nk.this;
            nkVar5.y = null;
            k99.i0(nkVar5.S);
            nk.this.e1();
        }

        @Override // f4.a
        public boolean c(f4 f4Var, Menu menu) {
            return this.a.c(f4Var, menu);
        }

        @Override // f4.a
        public boolean d(f4 f4Var, Menu menu) {
            k99.i0(nk.this.S);
            return this.a.d(f4Var, menu);
        }
    }

    static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static m74 b(Configuration configuration) {
            return m74.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(m74 m74Var) {
            LocaleList.setDefault(LocaleList.forLanguageTags(m74Var.g()));
        }

        static void d(Configuration configuration, m74 m74Var) {
            configuration.setLocales(LocaleList.forLanguageTags(m74Var.g()));
        }
    }

    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    static class n {
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        static OnBackInvokedCallback b(Object obj, final nk nkVar) {
            Objects.requireNonNull(nkVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: tk
                public final void onBackInvoked() {
                    nk.this.F0();
                }
            };
            pk.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            pk.a(obj).unregisterOnBackInvokedCallback(ok.a(obj2));
        }
    }

    class o extends jg9 {
        private g b;
        private boolean c;
        private boolean d;
        private boolean e;

        o(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.c = true;
                callback.onContentChanged();
            } finally {
                this.c = false;
            }
        }

        public void d(Window.Callback callback, int i, Menu menu) {
            try {
                this.e = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.e = false;
            }
        }

        @Override // defpackage.jg9, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.d ? a().dispatchKeyEvent(keyEvent) : nk.this.j0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // defpackage.jg9, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || nk.this.I0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.b = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            ic8.a aVar = new ic8.a(nk.this.k, callback);
            f4 S = nk.this.S(aVar);
            if (S != null) {
                return aVar.e(S);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.c) {
                a().onContentChanged();
            }
        }

        @Override // defpackage.jg9, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // defpackage.jg9, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            g gVar = this.b;
            return (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : onCreatePanelView;
        }

        @Override // defpackage.jg9, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            nk.this.L0(i);
            return true;
        }

        @Override // defpackage.jg9, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.e) {
                a().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                nk.this.M0(i);
            }
        }

        @Override // defpackage.jg9, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            g gVar = this.b;
            boolean z = gVar != null && gVar.a(i);
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.a0(false);
            }
            return z;
        }

        @Override // defpackage.jg9, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
            androidx.appcompat.view.menu.e eVar;
            u v0 = nk.this.v0(0, true);
            if (v0 == null || (eVar = v0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // defpackage.jg9, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (nk.this.D0() && i == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    private class p extends q {
        private final PowerManager c;

        p(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // nk.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // nk.q
        public int c() {
            return k.a(this.c) ? 2 : 1;
        }

        @Override // nk.q
        public void d() {
            nk.this.f();
        }
    }

    abstract class q {
        private BroadcastReceiver a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    nk.this.k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b = b();
            if (b == null || b.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            nk.this.k.registerReceiver(this.a, b);
        }
    }

    private class r extends q {
        private final gu8 c;

        r(gu8 gu8Var) {
            super();
            this.c = gu8Var;
        }

        @Override // nk.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // nk.q
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // nk.q
        public void d() {
            nk.this.f();
        }
    }

    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return nk.this.j0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            nk.this.d0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(al.b(getContext(), i));
        }
    }

    protected static final class u {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.e j;
        androidx.appcompat.view.menu.c k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        u(int i) {
            this.a = i;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.l, zi6.abc_list_menu_item_layout);
                this.k = cVar;
                cVar.e(aVar);
                this.j.b(this.k);
            }
            return this.k.b(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.k);
            }
            this.j = eVar;
            if (eVar == null || (cVar = this.k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(nc6.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(nc6.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(in6.Theme_AppCompat_CompactMenu, true);
            }
            vx0 vx0Var = new vx0(context, 0);
            vx0Var.getTheme().setTo(newTheme);
            this.l = vx0Var;
            TypedArray obtainStyledAttributes = vx0Var.obtainStyledAttributes(fo6.AppCompatTheme);
            this.b = obtainStyledAttributes.getResourceId(fo6.AppCompatTheme_panelBackground, 0);
            this.f = obtainStyledAttributes.getResourceId(fo6.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private final class v implements j.a {
        v() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z2 = D != eVar;
            nk nkVar = nk.this;
            if (z2) {
                eVar = D;
            }
            u o0 = nkVar.o0(eVar);
            if (o0 != null) {
                if (!z2) {
                    nk.this.e0(o0, z);
                } else {
                    nk.this.a0(o0.a, o0, D);
                    nk.this.e0(o0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback x0;
            if (eVar != eVar.D()) {
                return true;
            }
            nk nkVar = nk.this;
            if (!nkVar.f0 || (x0 = nkVar.x0()) == null || nk.this.q0) {
                return true;
            }
            x0.onMenuOpened(108, eVar);
            return true;
        }
    }

    nk(Activity activity, kk kkVar) {
        this(activity, null, kkVar, activity);
    }

    private boolean A0(u uVar) {
        uVar.d(q0());
        uVar.g = new t(uVar.l);
        uVar.c = 81;
        return true;
    }

    private boolean B0(u uVar) {
        Resources.Theme theme;
        Context context = this.k;
        int i2 = uVar.a;
        if ((i2 == 0 || i2 == 108) && this.u != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(nc6.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(nc6.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(nc6.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                vx0 vx0Var = new vx0(context, 0);
                vx0Var.getTheme().setTo(theme);
                context = vx0Var;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        uVar.c(eVar);
        return true;
    }

    private void C0(int i2) {
        this.z0 = (1 << i2) | this.z0;
        if (this.y0) {
            return;
        }
        k99.d0(this.l.getDecorView(), this.A0);
        this.y0 = true;
    }

    private boolean H0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u v0 = v0(i2, true);
        if (v0.o) {
            return false;
        }
        return R0(v0, keyEvent);
    }

    private boolean K0(int i2, KeyEvent keyEvent) {
        boolean z;
        zc1 zc1Var;
        if (this.y != null) {
            return false;
        }
        boolean z2 = true;
        u v0 = v0(i2, true);
        if (i2 != 0 || (zc1Var = this.u) == null || !zc1Var.a() || ViewConfiguration.get(this.k).hasPermanentMenuKey()) {
            boolean z3 = v0.o;
            if (z3 || v0.n) {
                e0(v0, true);
                z2 = z3;
            } else {
                if (v0.m) {
                    if (v0.r) {
                        v0.m = false;
                        z = R0(v0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        O0(v0, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.u.e()) {
            z2 = this.u.b();
        } else {
            if (!this.q0 && R0(v0, keyEvent)) {
                z2 = this.u.c();
            }
            z2 = false;
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.k.getApplicationContext().getSystemService(AssetConstants.AUDIO_TYPE);
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void O0(nk.u r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk.O0(nk$u, android.view.KeyEvent):void");
    }

    private boolean Q0(u uVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.m || R0(uVar, keyEvent)) && (eVar = uVar.j) != null) {
            z = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.u == null) {
            e0(uVar, true);
        }
        return z;
    }

    private boolean R0(u uVar, KeyEvent keyEvent) {
        zc1 zc1Var;
        zc1 zc1Var2;
        zc1 zc1Var3;
        if (this.q0) {
            return false;
        }
        if (uVar.m) {
            return true;
        }
        u uVar2 = this.m0;
        if (uVar2 != null && uVar2 != uVar) {
            e0(uVar2, false);
        }
        Window.Callback x0 = x0();
        if (x0 != null) {
            uVar.i = x0.onCreatePanelView(uVar.a);
        }
        int i2 = uVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (zc1Var3 = this.u) != null) {
            zc1Var3.f();
        }
        if (uVar.i == null && (!z || !(P0() instanceof pn8))) {
            androidx.appcompat.view.menu.e eVar = uVar.j;
            if (eVar == null || uVar.r) {
                if (eVar == null && (!B0(uVar) || uVar.j == null)) {
                    return false;
                }
                if (z && this.u != null) {
                    if (this.w == null) {
                        this.w = new h();
                    }
                    this.u.d(uVar.j, this.w);
                }
                uVar.j.d0();
                if (!x0.onCreatePanelMenu(uVar.a, uVar.j)) {
                    uVar.c(null);
                    if (z && (zc1Var = this.u) != null) {
                        zc1Var.d(null, this.w);
                    }
                    return false;
                }
                uVar.r = false;
            }
            uVar.j.d0();
            Bundle bundle = uVar.s;
            if (bundle != null) {
                uVar.j.P(bundle);
                uVar.s = null;
            }
            if (!x0.onPreparePanel(0, uVar.i, uVar.j)) {
                if (z && (zc1Var2 = this.u) != null) {
                    zc1Var2.d(null, this.w);
                }
                uVar.j.c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.p = z2;
            uVar.j.setQwertyMode(z2);
            uVar.j.c0();
        }
        uVar.m = true;
        uVar.n = false;
        this.m0 = uVar;
        return true;
    }

    private void S0(boolean z) {
        zc1 zc1Var = this.u;
        if (zc1Var == null || !zc1Var.a() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.u.h())) {
            u v0 = v0(0, true);
            v0.q = true;
            e0(v0, false);
            O0(v0, null);
            return;
        }
        Window.Callback x0 = x0();
        if (this.u.e() && z) {
            this.u.b();
            if (this.q0) {
                return;
            }
            x0.onPanelClosed(108, v0(0, true).j);
            return;
        }
        if (x0 == null || this.q0) {
            return;
        }
        if (this.y0 && (this.z0 & 1) != 0) {
            this.l.getDecorView().removeCallbacks(this.A0);
            this.A0.run();
        }
        u v02 = v0(0, true);
        androidx.appcompat.view.menu.e eVar = v02.j;
        if (eVar == null || v02.r || !x0.onPreparePanel(0, v02.i, eVar)) {
            return;
        }
        x0.onMenuOpened(108, v02.j);
        this.u.c();
    }

    private int T0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean U(boolean z) {
        return V(z, true);
    }

    private boolean V(boolean z, boolean z2) {
        if (this.q0) {
            return false;
        }
        int Z = Z();
        int E0 = E0(this.k, Z);
        m74 Y = Build.VERSION.SDK_INT < 33 ? Y(this.k) : null;
        if (!z2 && Y != null) {
            Y = u0(this.k.getResources().getConfiguration());
        }
        boolean d1 = d1(E0, Y, z);
        if (Z == 0) {
            t0(this.k).e();
        } else {
            q qVar = this.w0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (Z == 3) {
            s0(this.k).e();
        } else {
            q qVar2 = this.x0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return d1;
    }

    private void W() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.S.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.k.obtainStyledAttributes(fo6.AppCompatTheme);
        obtainStyledAttributes.getValue(fo6.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(fo6.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(fo6.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(fo6.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(fo6.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(fo6.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(fo6.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(fo6.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(fo6.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(fo6.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void X(Window window) {
        if (this.l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o oVar = new o(callback);
        this.m = oVar;
        window.setCallback(oVar);
        h0 u2 = h0.u(this.k, null, K0);
        Drawable h2 = u2.h(0);
        if (h2 != null) {
            window.setBackgroundDrawable(h2);
        }
        u2.w();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || this.G0 != null) {
            return;
        }
        O(null);
    }

    private boolean X0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || k99.O((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int Z() {
        int i2 = this.s0;
        return i2 != -100 ? i2 : mk.o();
    }

    private void a1() {
        if (this.Q) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private jk b1() {
        for (Context context = this.k; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof jk) {
                return (jk) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void c0() {
        q qVar = this.w0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.x0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c1(Configuration configuration) {
        Activity activity = (Activity) this.j;
        if (activity instanceof d44) {
            if (((d44) activity).getLifecycle().b().isAtLeast(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.p0 || this.q0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean d1(int r9, defpackage.m74 r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.k
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.f0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.k
            int r1 = r8.r0(r1)
            android.content.res.Configuration r2 = r8.r0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            m74 r2 = r8.u0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            m74 r0 = r8.u0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = r6
        L3b:
            if (r0 == 0) goto L45
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L6f
            if (r11 == 0) goto L6f
            boolean r11 = r8.o0
            if (r11 == 0) goto L6f
            boolean r11 = defpackage.nk.L0
            if (r11 != 0) goto L58
            boolean r11 = r8.p0
            if (r11 == 0) goto L6f
        L58:
            java.lang.Object r11 = r8.j
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L6f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L6f
            java.lang.Object r11 = r8.j
            android.app.Activity r11 = (android.app.Activity) r11
            defpackage.j4.r(r11)
            r11 = r7
            goto L70
        L6f:
            r11 = r6
        L70:
            if (r11 != 0) goto L7d
            if (r3 == 0) goto L7d
            r11 = r3 & r1
            if (r11 != r3) goto L79
            r6 = r7
        L79:
            r8.f1(r4, r0, r6, r5)
            goto L7e
        L7d:
            r7 = r11
        L7e:
            if (r7 == 0) goto L9a
            java.lang.Object r11 = r8.j
            boolean r1 = r11 instanceof defpackage.jk
            if (r1 == 0) goto L9a
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L8f
            jk r11 = (defpackage.jk) r11
            r11.onNightModeChanged(r9)
        L8f:
            r9 = r3 & 4
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r8.j
            jk r9 = (defpackage.jk) r9
            r9.onLocalesChanged(r10)
        L9a:
            if (r7 == 0) goto Laf
            if (r0 == 0) goto Laf
            android.content.Context r9 = r8.k
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            m74 r9 = r8.u0(r9)
            r8.V0(r9)
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk.d1(int, m74, boolean):boolean");
    }

    private Configuration f0(Context context, int i2, m74 m74Var, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (m74Var != null) {
            U0(configuration2, m74Var);
        }
        return configuration2;
    }

    private void f1(int i2, m74 m74Var, boolean z, Configuration configuration) {
        Resources resources = this.k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        if (m74Var != null) {
            U0(configuration2, m74Var);
        }
        resources.updateConfiguration(configuration2, null);
        int i3 = this.t0;
        if (i3 != 0) {
            this.k.setTheme(i3);
            this.k.getTheme().applyStyle(this.t0, true);
        }
        if (z && (this.j instanceof Activity)) {
            c1(configuration2);
        }
    }

    private ViewGroup g0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.k.obtainStyledAttributes(fo6.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(fo6.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(fo6.AppCompatTheme_windowNoTitle, false)) {
            J(1);
        } else if (obtainStyledAttributes.getBoolean(fo6.AppCompatTheme_windowActionBar, false)) {
            J(108);
        }
        if (obtainStyledAttributes.getBoolean(fo6.AppCompatTheme_windowActionBarOverlay, false)) {
            J(109);
        }
        if (obtainStyledAttributes.getBoolean(fo6.AppCompatTheme_windowActionModeOverlay, false)) {
            J(10);
        }
        this.i0 = obtainStyledAttributes.getBoolean(fo6.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        n0();
        this.l.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.k);
        if (this.j0) {
            viewGroup = this.h0 ? (ViewGroup) from.inflate(zi6.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(zi6.abc_screen_simple, (ViewGroup) null);
        } else if (this.i0) {
            viewGroup = (ViewGroup) from.inflate(zi6.abc_dialog_title_material, (ViewGroup) null);
            this.g0 = false;
            this.f0 = false;
        } else if (this.f0) {
            TypedValue typedValue = new TypedValue();
            this.k.getTheme().resolveAttribute(nc6.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new vx0(this.k, typedValue.resourceId) : this.k).inflate(zi6.abc_screen_toolbar, (ViewGroup) null);
            zc1 zc1Var = (zc1) viewGroup.findViewById(zf6.decor_content_parent);
            this.u = zc1Var;
            zc1Var.setWindowCallback(x0());
            if (this.g0) {
                this.u.i(109);
            }
            if (this.Z) {
                this.u.i(2);
            }
            if (this.e0) {
                this.u.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f0 + ", windowActionBarOverlay: " + this.g0 + ", android:windowIsFloating: " + this.i0 + ", windowActionModeOverlay: " + this.h0 + ", windowNoTitle: " + this.j0 + " }");
        }
        k99.A0(viewGroup, new b());
        if (this.u == null) {
            this.X = (TextView) viewGroup.findViewById(zf6.title);
        }
        k0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(zf6.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void h1(View view) {
        view.setBackgroundColor((k99.I(view) & 8192) != 0 ? mx0.c(this.k, rd6.abc_decor_view_status_guard_light) : mx0.c(this.k, rd6.abc_decor_view_status_guard));
    }

    private void m0() {
        if (this.Q) {
            return;
        }
        this.S = g0();
        CharSequence w0 = w0();
        if (!TextUtils.isEmpty(w0)) {
            zc1 zc1Var = this.u;
            if (zc1Var != null) {
                zc1Var.setWindowTitle(w0);
            } else if (P0() != null) {
                P0().setWindowTitle(w0);
            } else {
                TextView textView = this.X;
                if (textView != null) {
                    textView.setText(w0);
                }
            }
        }
        W();
        N0(this.S);
        this.Q = true;
        u v0 = v0(0, false);
        if (this.q0) {
            return;
        }
        if (v0 == null || v0.j == null) {
            C0(108);
        }
    }

    private void n0() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                X(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration p0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            l.a(configuration, configuration2, configuration3);
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            m.a(configuration, configuration2, configuration3);
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int r0(Context context) {
        if (!this.v0 && (this.j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.j.getClass()), 269221888);
                if (activityInfo != null) {
                    this.u0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.u0 = 0;
            }
        }
        this.v0 = true;
        return this.u0;
    }

    private q s0(Context context) {
        if (this.x0 == null) {
            this.x0 = new p(context);
        }
        return this.x0;
    }

    private q t0(Context context) {
        if (this.w0 == null) {
            this.w0 = new r(gu8.a(context));
        }
        return this.w0;
    }

    private void y0() {
        m0();
        if (this.f0 && this.r == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.r = new lg9((Activity) this.j, this.g0);
            } else if (obj instanceof Dialog) {
                this.r = new lg9((Dialog) this.j);
            }
            x3 x3Var = this.r;
            if (x3Var != null) {
                x3Var.setDefaultDisplayHomeAsUpEnabled(this.B0);
            }
        }
    }

    private boolean z0(u uVar) {
        View view = uVar.i;
        if (view != null) {
            uVar.h = view;
            return true;
        }
        if (uVar.j == null) {
            return false;
        }
        if (this.x == null) {
            this.x = new v();
        }
        View view2 = (View) uVar.a(this.x);
        uVar.h = view2;
        return view2 != null;
    }

    @Override // defpackage.mk
    public void A(Bundle bundle) {
        String str;
        this.o0 = true;
        U(false);
        n0();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                str = q25.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                x3 P0 = P0();
                if (P0 == null) {
                    this.B0 = true;
                } else {
                    P0.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            mk.d(this);
        }
        this.r0 = new Configuration(this.k.getResources().getConfiguration());
        this.p0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // defpackage.mk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            defpackage.mk.H(r3)
        L9:
            boolean r0 = r3.y0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.A0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.q0 = r0
            int r0 = r3.s0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            hs7 r0 = defpackage.nk.I0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.s0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            hs7 r0 = defpackage.nk.I0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            x3 r0 = r3.r
            if (r0 == 0) goto L5b
            r0.onDestroy()
        L5b:
            r3.c0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk.B():void");
    }

    @Override // defpackage.mk
    public void C(Bundle bundle) {
        m0();
    }

    @Override // defpackage.mk
    public void D() {
        x3 u2 = u();
        if (u2 != null) {
            u2.setShowHideAnimationEnabled(true);
        }
    }

    public boolean D0() {
        return this.N;
    }

    @Override // defpackage.mk
    public void E(Bundle bundle) {
    }

    int E0(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return t0(context).c();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return s0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    @Override // defpackage.mk
    public void F() {
        V(true, false);
    }

    boolean F0() {
        boolean z = this.n0;
        this.n0 = false;
        u v0 = v0(0, false);
        if (v0 != null && v0.o) {
            if (!z) {
                e0(v0, true);
            }
            return true;
        }
        f4 f4Var = this.y;
        if (f4Var != null) {
            f4Var.c();
            return true;
        }
        x3 u2 = u();
        return u2 != null && u2.collapseActionView();
    }

    @Override // defpackage.mk
    public void G() {
        x3 u2 = u();
        if (u2 != null) {
            u2.setShowHideAnimationEnabled(false);
        }
    }

    boolean G0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.n0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            H0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean I0(int i2, KeyEvent keyEvent) {
        x3 u2 = u();
        if (u2 != null && u2.onKeyShortcut(i2, keyEvent)) {
            return true;
        }
        u uVar = this.m0;
        if (uVar != null && Q0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            u uVar2 = this.m0;
            if (uVar2 != null) {
                uVar2.n = true;
            }
            return true;
        }
        if (this.m0 == null) {
            u v0 = v0(0, true);
            R0(v0, keyEvent);
            boolean Q0 = Q0(v0, keyEvent.getKeyCode(), keyEvent, 1);
            v0.m = false;
            if (Q0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mk
    public boolean J(int i2) {
        int T0 = T0(i2);
        if (this.j0 && T0 == 108) {
            return false;
        }
        if (this.f0 && T0 == 1) {
            this.f0 = false;
        }
        if (T0 == 1) {
            a1();
            this.j0 = true;
            return true;
        }
        if (T0 == 2) {
            a1();
            this.Z = true;
            return true;
        }
        if (T0 == 5) {
            a1();
            this.e0 = true;
            return true;
        }
        if (T0 == 10) {
            a1();
            this.h0 = true;
            return true;
        }
        if (T0 == 108) {
            a1();
            this.f0 = true;
            return true;
        }
        if (T0 != 109) {
            return this.l.requestFeature(T0);
        }
        a1();
        this.g0 = true;
        return true;
    }

    boolean J0(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            if (i2 == 82) {
                K0(0, keyEvent);
                return true;
            }
        } else if (F0()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mk
    public void K(int i2) {
        m0();
        ViewGroup viewGroup = (ViewGroup) this.S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.m.c(this.l.getCallback());
    }

    @Override // defpackage.mk
    public void L(View view) {
        m0();
        ViewGroup viewGroup = (ViewGroup) this.S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.c(this.l.getCallback());
    }

    void L0(int i2) {
        x3 u2;
        if (i2 != 108 || (u2 = u()) == null) {
            return;
        }
        u2.dispatchMenuVisibilityChanged(true);
    }

    @Override // defpackage.mk
    public void M(View view, ViewGroup.LayoutParams layoutParams) {
        m0();
        ViewGroup viewGroup = (ViewGroup) this.S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.c(this.l.getCallback());
    }

    void M0(int i2) {
        if (i2 == 108) {
            x3 u2 = u();
            if (u2 != null) {
                u2.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            u v0 = v0(i2, true);
            if (v0.o) {
                e0(v0, false);
            }
        }
    }

    void N0(ViewGroup viewGroup) {
    }

    @Override // defpackage.mk
    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.O(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.G0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.H0) != null) {
            n.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.H0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.G0 = n.a((Activity) this.j);
                e1();
            }
        }
        this.G0 = onBackInvokedDispatcher;
        e1();
    }

    @Override // defpackage.mk
    public void P(Toolbar toolbar) {
        if (this.j instanceof Activity) {
            x3 u2 = u();
            if (u2 instanceof lg9) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.s = null;
            if (u2 != null) {
                u2.onDestroy();
            }
            this.r = null;
            if (toolbar != null) {
                pn8 pn8Var = new pn8(toolbar, w0(), this.m);
                this.r = pn8Var;
                this.m.e(pn8Var.c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.m.e(null);
            }
            w();
        }
    }

    final x3 P0() {
        return this.r;
    }

    @Override // defpackage.mk
    public void Q(int i2) {
        this.t0 = i2;
    }

    @Override // defpackage.mk
    public final void R(CharSequence charSequence) {
        this.t = charSequence;
        zc1 zc1Var = this.u;
        if (zc1Var != null) {
            zc1Var.setWindowTitle(charSequence);
            return;
        }
        if (P0() != null) {
            P0().setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.X;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.mk
    public f4 S(f4.a aVar) {
        kk kkVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        f4 f4Var = this.y;
        if (f4Var != null) {
            f4Var.c();
        }
        i iVar = new i(aVar);
        x3 u2 = u();
        if (u2 != null) {
            f4 startActionMode = u2.startActionMode(iVar);
            this.y = startActionMode;
            if (startActionMode != null && (kkVar = this.n) != null) {
                kkVar.onSupportActionModeStarted(startActionMode);
            }
        }
        if (this.y == null) {
            this.y = Z0(iVar);
        }
        e1();
        return this.y;
    }

    void U0(Configuration configuration, m74 m74Var) {
        l.d(configuration, m74Var);
    }

    void V0(m74 m74Var) {
        l.c(m74Var);
    }

    final boolean W0() {
        ViewGroup viewGroup;
        return this.Q && (viewGroup = this.S) != null && k99.P(viewGroup);
    }

    m74 Y(Context context) {
        m74 t2;
        if (Build.VERSION.SDK_INT >= 33 || (t2 = mk.t()) == null) {
            return null;
        }
        m74 u0 = u0(context.getApplicationContext().getResources().getConfiguration());
        m74 b2 = q74.b(t2, u0);
        return b2.e() ? u0 : b2;
    }

    boolean Y0() {
        if (this.G0 == null) {
            return false;
        }
        u v0 = v0(0, false);
        return (v0 != null && v0.o) || this.y != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    defpackage.f4 Z0(f4.a r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk.Z0(f4$a):f4");
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        u o0;
        Window.Callback x0 = x0();
        if (x0 == null || this.q0 || (o0 = o0(eVar.D())) == null) {
            return false;
        }
        return x0.onMenuItemSelected(o0.a, menuItem);
    }

    void a0(int i2, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i2 >= 0) {
                u[] uVarArr = this.l0;
                if (i2 < uVarArr.length) {
                    uVar = uVarArr[i2];
                }
            }
            if (uVar != null) {
                menu = uVar.j;
            }
        }
        if ((uVar == null || uVar.o) && !this.q0) {
            this.m.d(this.l.getCallback(), i2, menu);
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        S0(true);
    }

    void b0(androidx.appcompat.view.menu.e eVar) {
        if (this.k0) {
            return;
        }
        this.k0 = true;
        this.u.j();
        Window.Callback x0 = x0();
        if (x0 != null && !this.q0) {
            x0.onPanelClosed(108, eVar);
        }
        this.k0 = false;
    }

    void d0(int i2) {
        e0(v0(i2, true), true);
    }

    @Override // defpackage.mk
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        m0();
        ((ViewGroup) this.S.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.c(this.l.getCallback());
    }

    void e0(u uVar, boolean z) {
        ViewGroup viewGroup;
        zc1 zc1Var;
        if (z && uVar.a == 0 && (zc1Var = this.u) != null && zc1Var.e()) {
            b0(uVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && uVar.o && (viewGroup = uVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                a0(uVar.a, uVar, null);
            }
        }
        uVar.m = false;
        uVar.n = false;
        uVar.o = false;
        uVar.h = null;
        uVar.q = true;
        if (this.m0 == uVar) {
            this.m0 = null;
        }
        if (uVar.a == 0) {
            e1();
        }
    }

    void e1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean Y0 = Y0();
            if (Y0 && this.H0 == null) {
                this.H0 = n.b(this.G0, this);
            } else {
                if (Y0 || (onBackInvokedCallback = this.H0) == null) {
                    return;
                }
                n.c(this.G0, onBackInvokedCallback);
            }
        }
    }

    @Override // defpackage.mk
    public boolean f() {
        return U(true);
    }

    final int g1(ch9 ch9Var, Rect rect) {
        boolean z;
        boolean z2;
        int l2 = ch9Var != null ? ch9Var.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.B;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.B.getLayoutParams();
            if (this.B.isShown()) {
                if (this.C0 == null) {
                    this.C0 = new Rect();
                    this.D0 = new Rect();
                }
                Rect rect2 = this.C0;
                Rect rect3 = this.D0;
                if (ch9Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(ch9Var.j(), ch9Var.l(), ch9Var.k(), ch9Var.i());
                }
                k0.a(this.S, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                ch9 E = k99.E(this.S);
                int j2 = E == null ? 0 : E.j();
                int k2 = E == null ? 0 : E.k();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.Y != null) {
                    View view = this.Y;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != j2 || marginLayoutParams2.rightMargin != k2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = j2;
                            marginLayoutParams2.rightMargin = k2;
                            this.Y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.k);
                    this.Y = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = j2;
                    layoutParams.rightMargin = k2;
                    this.S.addView(this.Y, -1, layoutParams);
                }
                View view3 = this.Y;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    h1(this.Y);
                }
                if (!this.h0 && r5) {
                    l2 = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.B.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.Y;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View h0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.E0 == null) {
            String string = this.k.obtainStyledAttributes(fo6.AppCompatTheme).getString(fo6.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.E0 = new dl();
            } else {
                try {
                    this.E0 = (dl) this.k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.E0 = new dl();
                }
            }
        }
        boolean z2 = J0;
        boolean z3 = false;
        if (z2) {
            if (this.F0 == null) {
                this.F0 = new iz3();
            }
            if (this.F0.a(attributeSet)) {
                z = true;
                return this.E0.r(view, str, context, attributeSet, z, z2, true, j0.c());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z3 = X0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            }
        }
        z = z3;
        return this.E0.r(view, str, context, attributeSet, z, z2, true, j0.c());
    }

    @Override // defpackage.mk
    public Context i(Context context) {
        this.o0 = true;
        int E0 = E0(context, Z());
        if (mk.x(context)) {
            mk.T(context);
        }
        m74 Y = Y(context);
        if (M0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, f0(context, E0, Y, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof vx0) {
            try {
                ((vx0) context).a(f0(context, E0, Y, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!L0) {
            return super.i(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = j.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration f0 = f0(context, E0, Y, !configuration2.equals(configuration3) ? p0(configuration2, configuration3) : null, true);
        vx0 vx0Var = new vx0(context, in6.Theme_AppCompat_Empty);
        vx0Var.a(f0);
        try {
            if (context.getTheme() != null) {
                m07.f.a(vx0Var.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(vx0Var);
    }

    void i0() {
        androidx.appcompat.view.menu.e eVar;
        zc1 zc1Var = this.u;
        if (zc1Var != null) {
            zc1Var.j();
        }
        if (this.H != null) {
            this.l.getDecorView().removeCallbacks(this.L);
            if (this.H.isShowing()) {
                try {
                    this.H.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.H = null;
        }
        l0();
        u v0 = v0(0, false);
        if (v0 == null || (eVar = v0.j) == null) {
            return;
        }
        eVar.close();
    }

    boolean j0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.j;
        if (((obj instanceof tv3.a) || (obj instanceof vk)) && (decorView = this.l.getDecorView()) != null && tv3.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.m.b(this.l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? G0(keyCode, keyEvent) : J0(keyCode, keyEvent);
    }

    void k0(int i2) {
        u v0;
        u v02 = v0(i2, true);
        if (v02.j != null) {
            Bundle bundle = new Bundle();
            v02.j.Q(bundle);
            if (bundle.size() > 0) {
                v02.s = bundle;
            }
            v02.j.d0();
            v02.j.clear();
        }
        v02.r = true;
        v02.q = true;
        if ((i2 != 108 && i2 != 0) || this.u == null || (v0 = v0(0, false)) == null) {
            return;
        }
        v0.m = false;
        R0(v0, null);
    }

    @Override // defpackage.mk
    public View l(int i2) {
        m0();
        return this.l.findViewById(i2);
    }

    void l0() {
        ab9 ab9Var = this.M;
        if (ab9Var != null) {
            ab9Var.c();
        }
    }

    @Override // defpackage.mk
    public Context n() {
        return this.k;
    }

    u o0(Menu menu) {
        u[] uVarArr = this.l0;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            u uVar = uVarArr[i2];
            if (uVar != null && uVar.j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return h0(view, str, context, attributeSet);
    }

    @Override // defpackage.mk
    public final y3 p() {
        return new f();
    }

    @Override // defpackage.mk
    public int q() {
        return this.s0;
    }

    final Context q0() {
        x3 u2 = u();
        Context themedContext = u2 != null ? u2.getThemedContext() : null;
        return themedContext == null ? this.k : themedContext;
    }

    @Override // defpackage.mk
    public MenuInflater s() {
        if (this.s == null) {
            y0();
            x3 x3Var = this.r;
            this.s = new kc8(x3Var != null ? x3Var.getThemedContext() : this.k);
        }
        return this.s;
    }

    @Override // defpackage.mk
    public x3 u() {
        y0();
        return this.r;
    }

    m74 u0(Configuration configuration) {
        return l.b(configuration);
    }

    @Override // defpackage.mk
    public void v() {
        LayoutInflater from = LayoutInflater.from(this.k);
        if (from.getFactory() == null) {
            jz3.a(from, this);
        } else {
            if (from.getFactory2() instanceof nk) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    protected u v0(int i2, boolean z) {
        u[] uVarArr = this.l0;
        if (uVarArr == null || uVarArr.length <= i2) {
            u[] uVarArr2 = new u[i2 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.l0 = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i2];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(i2);
        uVarArr[i2] = uVar2;
        return uVar2;
    }

    @Override // defpackage.mk
    public void w() {
        if (P0() == null || u().invalidateOptionsMenu()) {
            return;
        }
        C0(0);
    }

    final CharSequence w0() {
        Object obj = this.j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.t;
    }

    final Window.Callback x0() {
        return this.l.getCallback();
    }

    @Override // defpackage.mk
    public void z(Configuration configuration) {
        x3 u2;
        if (this.f0 && this.Q && (u2 = u()) != null) {
            u2.onConfigurationChanged(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.k);
        this.r0 = new Configuration(this.k.getResources().getConfiguration());
        V(false, false);
    }

    nk(Dialog dialog, kk kkVar) {
        this(dialog.getContext(), dialog.getWindow(), kkVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private nk(Context context, Window window, kk kkVar, Object obj) {
        jk b1;
        this.M = null;
        this.N = true;
        this.s0 = -100;
        this.A0 = new a();
        this.k = context;
        this.n = kkVar;
        this.j = obj;
        if (this.s0 == -100 && (obj instanceof Dialog) && (b1 = b1()) != null) {
            this.s0 = b1.getDelegate().q();
        }
        if (this.s0 == -100) {
            hs7 hs7Var = I0;
            Integer num = (Integer) hs7Var.get(obj.getClass().getName());
            if (num != null) {
                this.s0 = num.intValue();
                hs7Var.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            X(window);
        }
        androidx.appcompat.widget.j.h();
    }
}
