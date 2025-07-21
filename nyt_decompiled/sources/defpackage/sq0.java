package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import defpackage.tv3;

/* loaded from: classes.dex */
public abstract class sq0 extends Activity implements d44, tv3.a {
    private final hs7 extraDataMap = new hs7();
    private final h lifecycleRegistry = new h(this);

    public static class a {
    }

    private final boolean q(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture");
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        zq3.h(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        zq3.g(decorView, "window.decorView");
        if (tv3.a(decorView, keyEvent)) {
            return true;
        }
        return tv3.b(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        zq3.h(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        zq3.g(decorView, "window.decorView");
        if (tv3.a(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends a> T getExtraData(Class<T> cls) {
        zq3.h(cls, "extraDataClass");
        lh4.a(this.extraDataMap.get(cls));
        return null;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m.b.b(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        zq3.h(bundle, "outState");
        this.lifecycleRegistry.n(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(a aVar) {
        zq3.h(aVar, "extraData");
        throw null;
    }

    protected final boolean shouldDumpInternalState(String[] strArr) {
        return !q(strArr);
    }

    @Override // tv3.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        zq3.h(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
