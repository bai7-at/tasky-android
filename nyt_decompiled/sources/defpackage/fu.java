package defpackage;

import com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider;

/* loaded from: classes4.dex */
public interface fu {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final fu a(ss2 ss2Var) {
            zq3.h(ss2Var, "deviceTokenAsync");
            return new DefaultAsyncDataProvider(ss2Var);
        }
    }

    Object a(by0 by0Var);
}
