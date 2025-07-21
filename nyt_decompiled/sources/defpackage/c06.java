package defpackage;

import android.app.Activity;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nytimes.android.logging.NYTLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class c06 {
    public static final a Companion = new a(null);
    private final cb2 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c06(cb2 cb2Var) {
        zq3.h(cb2Var, "flagUtil");
        this.a = cb2Var;
    }

    public final void a(Activity activity, boolean z) {
        zq3.h(activity, "activity");
        if (z || (activity instanceof z27) || !h.P(activity.toString(), "nytimes", false, 2, null) || this.a.g() || activity.getRequestedOrientation() == 1) {
            return;
        }
        try {
            activity.setRequestedOrientation(1);
        } catch (IllegalStateException e) {
            NYTLogger.i(e, "Cannot rotate this Activity: " + activity + InstructionFileId.DOT, new Object[0]);
        }
    }
}
