package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.d44;
import defpackage.ei1;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements g {
    private final ei1 a;
    private final g b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(ei1 ei1Var, g gVar) {
        zq3.h(ei1Var, "defaultLifecycleObserver");
        this.a = ei1Var;
        this.b = gVar;
    }

    @Override // androidx.lifecycle.g
    public void h(d44 d44Var, Lifecycle.Event event) {
        zq3.h(d44Var, "source");
        zq3.h(event, "event");
        switch (a.a[event.ordinal()]) {
            case 1:
                this.a.onCreate(d44Var);
                break;
            case 2:
                this.a.onStart(d44Var);
                break;
            case 3:
                this.a.onResume(d44Var);
                break;
            case 4:
                this.a.onPause(d44Var);
                break;
            case 5:
                this.a.onStop(d44Var);
                break;
            case 6:
                this.a.onDestroy(d44Var);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.b;
        if (gVar != null) {
            gVar.h(d44Var, event);
        }
    }
}
