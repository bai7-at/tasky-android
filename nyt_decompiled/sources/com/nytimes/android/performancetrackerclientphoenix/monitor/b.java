package com.nytimes.android.performancetrackerclientphoenix.monitor;

import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import java.util.Map;

/* loaded from: classes4.dex */
public interface b {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    /* renamed from: com.nytimes.android.performancetrackerclientphoenix.monitor.b$b, reason: collision with other inner class name */
    public static final class C0374b {
        public static float a(b bVar, long j) {
            return j / 1048576.0f;
        }

        public static AppEvent b(b bVar) {
            return null;
        }

        public static AppEvent c(b bVar) {
            return null;
        }
    }

    AppEvent a();

    AppEvent b();

    Map c();
}
