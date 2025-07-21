package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.nytimes.android.eventtracker.context.PageContextDelegate;
import com.nytimes.xwords.hybrid.utils.ErrorType;
import com.nytimes.xwords.hybrid.view.ErrorPageEventReporter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class s22 extends Fragment {
    public static final a b = new a(null);
    public static final int c = 8;
    private ErrorPageEventReporter a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s22 a(ErrorType errorType, Class cls) {
            zq3.h(errorType, "errorType");
            zq3.h(cls, "errorPage");
            Bundle bundle = new Bundle();
            bundle.putString("ERROR_TYPE_KEY", errorType.name());
            s22 s22Var = (s22) cls.newInstance();
            s22Var.setArguments(bundle);
            zq3.e(s22Var);
            return s22Var;
        }

        private a() {
        }
    }

    protected final ErrorType b1() {
        String string;
        ErrorType valueOf;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("ERROR_TYPE_KEY")) == null || (valueOf = ErrorType.valueOf(string)) == null) {
            throw new IllegalArgumentException("Error type argument not provided");
        }
        return valueOf;
    }

    public abstract String c1();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new ErrorPageEventReporter(PageContextDelegate.a.b(this), c1(), "offline", b1());
        Lifecycle lifecycle = getLifecycle();
        ErrorPageEventReporter errorPageEventReporter = this.a;
        if (errorPageEventReporter == null) {
            zq3.z("errorPageEventReporter");
            errorPageEventReporter = null;
        }
        lifecycle.a(errorPageEventReporter);
    }
}
