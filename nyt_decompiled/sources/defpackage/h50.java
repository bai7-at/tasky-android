package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.context.PageContextDelegate;
import com.nytimes.xwords.hybrid.utils.ErrorType;
import com.nytimes.xwords.hybrid.view.ErrorPageEventReporter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class h50 extends Fragment {
    public static final a b = new a(null);
    public static final int c = 8;
    private ErrorPageEventReporter a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h50 a(ErrorType errorType, Class cls) {
            zq3.h(errorType, "errorType");
            zq3.h(cls, "errorPage");
            Bundle bundle = new Bundle();
            bundle.putString("ERROR_TYPE_KEY", errorType.name());
            h50 h50Var = (h50) cls.newInstance();
            h50Var.setArguments(bundle);
            zq3.e(h50Var);
            return h50Var;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ErrorType.values().length];
            try {
                iArr[ErrorType.OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorType.GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    private final String e1(ErrorType errorType) {
        String string;
        int i = b.a[errorType.ordinal()];
        if (i == 1) {
            string = getString(nm6.user_offline_notice);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = getString(nm6.generic_webview_error_msg, g1());
        }
        zq3.e(string);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(final h50 h50Var, View view) {
        zq3.h(h50Var, "this$0");
        h50Var.d1().setOnClickListener(new View.OnClickListener() { // from class: g50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h50.j1(h50.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(h50 h50Var, View view) {
        zq3.h(h50Var, "this$0");
        h50Var.requireActivity().getOnBackPressedDispatcher().l();
    }

    public abstract AppCompatButton d1();

    public abstract AppCompatTextView f1();

    public abstract String g1();

    public abstract String h1();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        PageContext b2 = PageContextDelegate.a.b(this);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("ERROR_TYPE_KEY")) == null) {
            return;
        }
        this.a = new ErrorPageEventReporter(b2, h1(), "offline", ErrorType.valueOf(string));
        Lifecycle lifecycle = getLifecycle();
        ErrorPageEventReporter errorPageEventReporter = this.a;
        if (errorPageEventReporter == null) {
            zq3.z("errorPageEventReporter");
            errorPageEventReporter = null;
        }
        lifecycle.a(errorPageEventReporter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        f1().setText(e1(i50.a(this)));
        d1().setOnClickListener(new View.OnClickListener() { // from class: f50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h50.i1(h50.this, view2);
            }
        });
    }
}
