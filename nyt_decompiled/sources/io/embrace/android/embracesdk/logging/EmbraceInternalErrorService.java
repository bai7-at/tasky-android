package io.embrace.android.embracesdk.logging;

import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.config.behavior.DataCaptureEventBehavior;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.payload.LegacyExceptionError;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.c;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public final class EmbraceInternalErrorService implements InternalErrorService {
    private static final String APPLICATION_STATE_BACKGROUND = "background";
    private static final String APPLICATION_STATE_FOREGROUND = "foreground";
    public static final Companion Companion = new Companion(null);
    private final Clock clock;
    private ConfigService configService;
    private LegacyExceptionError err;
    private final c04 ignoredExceptionClasses$delegate;
    private final c04 ignoredExceptionStrings$delegate;
    private final boolean logStrictMode;
    private final ProcessStateService processStateService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceInternalErrorService(ProcessStateService processStateService, Clock clock, boolean z) {
        zq3.h(processStateService, "processStateService");
        zq3.h(clock, "clock");
        this.processStateService = processStateService;
        this.clock = clock;
        this.logStrictMode = z;
        this.ignoredExceptionClasses$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.logging.EmbraceInternalErrorService$ignoredExceptionClasses$2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Set<Class<?>> mo865invoke() {
                return b0.j(BindException.class, ConnectException.class, HttpRetryException.class, NoRouteToHostException.class, PortUnreachableException.class, ProtocolException.class, SocketException.class, SocketTimeoutException.class, UnknownHostException.class, UnknownServiceException.class);
            }
        });
        this.ignoredExceptionStrings$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.logging.EmbraceInternalErrorService$ignoredExceptionStrings$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<String> mo865invoke() {
                Set ignoredExceptionClasses;
                ignoredExceptionClasses = EmbraceInternalErrorService.this.getIgnoredExceptionClasses();
                Set set = ignoredExceptionClasses;
                ArrayList arrayList = new ArrayList(i.w(set, 10));
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Class) it2.next()).getName());
                }
                return arrayList;
            }
        });
    }

    private final String getApplicationState() {
        return this.processStateService.isInBackground() ? "background" : "foreground";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Class<?>> getIgnoredExceptionClasses() {
        return (Set) this.ignoredExceptionClasses$delegate.getValue();
    }

    private final List<String> getIgnoredExceptionStrings() {
        return (List) this.ignoredExceptionStrings$delegate.getValue();
    }

    private final boolean ignoreThrowableCause(Throwable th, HashSet<Throwable> hashSet) {
        if (th != null) {
            return getIgnoredExceptionClasses().contains(th.getClass()) || (hashSet.add(th) && ignoreThrowableCause(th.getCause(), hashSet));
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.logging.InternalErrorService
    public LegacyExceptionError getCurrentExceptionError() {
        return this.err;
    }

    @Override // io.embrace.android.embracesdk.logging.InternalErrorService
    public synchronized void handleInternalError(Throwable th) {
        LegacyExceptionError legacyExceptionError;
        DataCaptureEventBehavior dataCaptureEventBehavior;
        List l;
        try {
            zq3.h(th, "throwable");
            if (getIgnoredExceptionClasses().contains(th.getClass())) {
                return;
            }
            if (ignoreThrowableCause(th.getCause(), new HashSet<>())) {
                return;
            }
            String message = th.getMessage();
            if (message != null) {
                List<String> ignoredExceptionStrings = getIgnoredExceptionStrings();
                List g = new Regex(":").g(message, 0);
                if (!g.isEmpty()) {
                    ListIterator listIterator = g.listIterator(g.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            l = i.P0(g, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                l = i.l();
                Object[] array = l.toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                if (ignoredExceptionStrings.contains(((String[]) array)[0])) {
                    return;
                }
            }
            if (this.err == null) {
                this.err = new LegacyExceptionError(this.logStrictMode);
            }
            ConfigService configService = this.configService;
            if ((configService == null || (configService != null && (dataCaptureEventBehavior = configService.getDataCaptureEventBehavior()) != null && dataCaptureEventBehavior.isInternalExceptionCaptureEnabled())) && (legacyExceptionError = this.err) != null) {
                legacyExceptionError.addException(th, getApplicationState(), this.clock);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.embrace.android.embracesdk.logging.InternalErrorService
    public synchronized void resetExceptionErrorObject() {
        this.err = null;
    }

    @Override // io.embrace.android.embracesdk.logging.InternalErrorService
    public void setConfigService(ConfigService configService) {
        this.configService = configService;
    }
}
