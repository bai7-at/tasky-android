package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import defpackage.d44;
import defpackage.kg6;
import defpackage.o63;
import defpackage.ww8;
import defpackage.zv4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public abstract class WindowRecomposer_androidKt {
    private static final Map a = new LinkedHashMap();

    public static final class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ View a;
        final /* synthetic */ Recomposer b;

        a(View view, Recomposer recomposer) {
            this.a = view;
            this.b = recomposer;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            this.b.W();
        }
    }

    public static final class b extends ContentObserver {
        final /* synthetic */ Channel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Channel channel, Handler handler) {
            super(handler);
            this.a = channel;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            this.a.mo129trySendJP2dKIU(ww8.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.ui.platform.r] */
    public static final Recomposer b(final View view, CoroutineContext coroutineContext, Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (coroutineContext.get(kotlin.coroutines.c.P) == null || coroutineContext.get(androidx.compose.runtime.l.E) == null) {
            coroutineContext = AndroidUiDispatcher.k.a().plus(coroutineContext);
        }
        androidx.compose.runtime.l lVar = (androidx.compose.runtime.l) coroutineContext.get(androidx.compose.runtime.l.E);
        if (lVar != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(lVar);
            pausableMonotonicFrameClock2.a();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        zv4 zv4Var = (zv4) coroutineContext.get(zv4.A);
        zv4 zv4Var2 = zv4Var;
        if (zv4Var == null) {
            ?? rVar = new r();
            ref$ObjectRef.element = rVar;
            zv4Var2 = rVar;
        }
        CoroutineContext plus = coroutineContext.plus(pausableMonotonicFrameClock != null ? pausableMonotonicFrameClock : EmptyCoroutineContext.a).plus(zv4Var2);
        final Recomposer recomposer = new Recomposer(plus);
        recomposer.j0();
        final CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(plus);
        if (lifecycle == null) {
            d44 a2 = ViewTreeLifecycleOwner.a(view);
            lifecycle = a2 != null ? a2.getLifecycle() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new a(view, recomposer));
            lifecycle.a(new androidx.lifecycle.g() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

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
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        a = iArr;
                    }
                }

                @Override // androidx.lifecycle.g
                public void h(d44 d44Var, Lifecycle.Event event) {
                    int i = a.a[event.ordinal()];
                    if (i == 1) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, CoroutineStart.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(ref$ObjectRef, recomposer, d44Var, this, view, null), 1, null);
                        return;
                    }
                    if (i == 2) {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock3 != null) {
                            pausableMonotonicFrameClock3.c();
                        }
                        recomposer.v0();
                        return;
                    }
                    if (i == 3) {
                        recomposer.j0();
                    } else {
                        if (i != 4) {
                            return;
                        }
                        recomposer.W();
                    }
                }
            });
            return recomposer;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ Recomposer c(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return b(view, coroutineContext, lifecycle);
    }

    public static final androidx.compose.runtime.c d(View view) {
        androidx.compose.runtime.c f = f(view);
        if (f != null) {
            return f;
        }
        for (ViewParent parent = view.getParent(); f == null && (parent instanceof View); parent = parent.getParent()) {
            f = f((View) parent);
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow e(Context context) {
        StateFlow stateFlow;
        Map map = a;
        synchronized (map) {
            try {
                Object obj = map.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Channel Channel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                    obj = FlowKt.stateIn(FlowKt.flow(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new b(Channel$default, o63.a(Looper.getMainLooper())), Channel$default, context, null)), CoroutineScopeKt.MainScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, obj);
                }
                stateFlow = (StateFlow) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stateFlow;
    }

    public static final androidx.compose.runtime.c f(View view) {
        Object tag = view.getTag(kg6.androidx_compose_ui_view_composition_context);
        if (tag instanceof androidx.compose.runtime.c) {
            return (androidx.compose.runtime.c) tag;
        }
        return null;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final Recomposer h(View view) {
        if (!view.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
        }
        View g = g(view);
        androidx.compose.runtime.c f = f(g);
        if (f == null) {
            return WindowRecomposerPolicy.a.a(g);
        }
        if (f instanceof Recomposer) {
            return (Recomposer) f;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, androidx.compose.runtime.c cVar) {
        view.setTag(kg6.androidx_compose_ui_view_composition_context, cVar);
    }
}
