package com.nytimes.android.eventtracker;

import com.nytimes.android.eventtracker.reporting.AppLaunchObserver;
import defpackage.wt6;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AppLifecycleObserver extends AppLaunchObserver {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AppLaunchObserver.LaunchType.values().length];
            try {
                iArr[AppLaunchObserver.LaunchType.FRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppLaunchObserver.LaunchType.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public final wt6 b() {
        AppLaunchObserver.LaunchType a2 = a();
        int i = a2 == null ? -1 : b.a[a2.ordinal()];
        if (i == 1) {
            return new wt6("fresh launch", null, new Pair[0], 2, null);
        }
        if (i != 2) {
            return null;
        }
        return new wt6("background launch", null, new Pair[0], 2, null);
    }
}
