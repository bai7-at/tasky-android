package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.utils.DeviceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class wp7 extends e {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final j5 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(Asset asset, String str) {
            zq3.h(asset, "asset");
            zq3.h(str, "sharedText");
            Bundle bundle = new Bundle();
            bundle.putString("argsSharedTextHeadline", asset.getTitle());
            bundle.putString("argsSharedTextSectionName", asset.getSectionDisplayName());
            bundle.putString("argsSharedText", str);
            bundle.putString("argsSharedTextAuthor", asset.getByline());
            bundle.putString("argsSharedUrl", asset.getUrl());
            return bundle;
        }

        public final wp7 b(Bundle bundle) {
            zq3.h(bundle, "args");
            wp7 wp7Var = new wp7();
            wp7Var.setArguments(bundle);
            return wp7Var;
        }

        private a() {
        }
    }

    public wp7() {
        j5 registerForActivityResult = registerForActivityResult(new i5(), new d5() { // from class: vp7
            @Override // defpackage.d5
            public final void a(Object obj) {
                wp7.g1(wp7.this, (ActivityResult) obj);
            }
        });
        zq3.g(registerForActivityResult, "registerForActivityResult(...)");
        this.a = registerForActivityResult;
    }

    private final String e1(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        String obj = str != null ? h.c1(str).toString() : null;
        if (obj != null) {
            String lineSeparator = System.lineSeparator();
            zq3.g(lineSeparator, "lineSeparator(...)");
            str3 = h.F(obj, "\\n", lineSeparator, false, 4, null);
        } else {
            str3 = null;
        }
        if (h.x(str2, "Opinion", false, 2, null)) {
            sb.append("Opinion: ");
        }
        sb.append("\"");
        sb.append(str3);
        sb.append("\"");
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    private final String f1(String str, String str2) {
        return str + "\n\n" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(wp7 wp7Var, ActivityResult activityResult) {
        zq3.h(wp7Var, "this$0");
        wp7Var.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        ConstraintLayout root = xp7.c(layoutInflater, viewGroup, false).getRoot();
        zq3.g(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        int i = DeviceUtils.G(requireContext) ? -2 : -1;
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(i, -2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setGravity(49);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        xp7 a2 = xp7.a(view);
        zq3.g(a2, "bind(...)");
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("argsSharedText") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("argsSharedTextSectionName") : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("argsSharedUrl") : null;
        String e1 = e1(string, string2);
        a2.e.setText(e1);
        Bundle arguments4 = getArguments();
        a2.b.setText(arguments4 != null ? arguments4.getString("argsSharedTextHeadline") : null);
        Bundle arguments5 = getArguments();
        String string4 = arguments5 != null ? arguments5.getString("argsSharedTextAuthor") : null;
        if (string4 == null || string4.length() == 0) {
            a2.d.setText(getString(nk6.share_byline_default));
        } else {
            a2.d.setText(string4);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", f1(e1, string3));
        intent.setType("text/plain");
        this.a.a(Intent.createChooser(intent, getString(wl6.action_share)));
    }
}
