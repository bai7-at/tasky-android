package defpackage;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.iteratehq.iterate.model.InteractionEventSource;
import com.iteratehq.iterate.model.ProgressEventMessageData;
import com.iteratehq.iterate.model.Prompt;
import com.iteratehq.iterate.model.Survey;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class e76 extends com.google.android.material.bottomsheet.b {
    public static final a e = new a(null);
    private f76 b;
    private b c;
    private boolean d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e76 a(Survey survey, String str, String str2) {
            zq3.h(survey, "survey");
            Bundle bundle = new Bundle();
            bundle.putParcelable("survey", survey);
            bundle.putString("survey_text_font", str);
            bundle.putString("button_font", str2);
            e76 e76Var = new e76();
            e76Var.setArguments(bundle);
            return e76Var;
        }

        private a() {
        }
    }

    public interface b {
        void a(InteractionEventSource interactionEventSource, ProgressEventMessageData progressEventMessageData);

        void b(Survey survey);
    }

    private final boolean j1() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    private final void l1() {
        String str;
        Prompt prompt;
        Prompt prompt2;
        Bundle arguments = getArguments();
        String str2 = null;
        final Survey survey = arguments != null ? (Survey) arguments.getParcelable("survey") : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("survey_text_font") : null;
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("button_font") : null;
        f76 f76Var = this.b;
        if (f76Var == null) {
            zq3.z("binding");
            f76Var = null;
        }
        f76Var.b.setOnClickListener(new View.OnClickListener() { // from class: c76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e76.m1(e76.this, view);
            }
        });
        f76Var.d.setText((survey == null || (prompt2 = survey.getPrompt()) == null) ? null : prompt2.getMessage());
        if (string != null) {
            f76Var.d.setTypeface(Typeface.createFromAsset(requireContext().getAssets(), string));
        }
        if (survey == null || (str = survey.getColor()) == null) {
            str = "#7457be";
        }
        if (j1()) {
            if ((survey != null ? survey.getColorDark() : null) != null) {
                str = survey.getColorDark();
            }
        }
        Button button = f76Var.c;
        if (survey != null && (prompt = survey.getPrompt()) != null) {
            str2 = prompt.getButtonText();
        }
        button.setText(str2);
        if (string2 != null) {
            f76Var.c.setTypeface(Typeface.createFromAsset(requireContext().getAssets(), string2));
        }
        f76Var.c.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str)));
        f76Var.c.setOnClickListener(new View.OnClickListener() { // from class: d76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e76.n1(e76.this, survey, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(e76 e76Var, View view) {
        zq3.h(e76Var, "this$0");
        e76Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(e76 e76Var, Survey survey, View view) {
        b bVar;
        zq3.h(e76Var, "this$0");
        e76Var.d = true;
        if (survey != null && (bVar = e76Var.c) != null) {
            bVar.b(survey);
        }
        e76Var.dismiss();
    }

    public final void k1(b bVar) {
        zq3.h(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.c = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        f76 c = f76.c(layoutInflater.cloneInContext(new vx0(requireContext(), gn6.Theme_IterateLibrary)));
        zq3.g(c, "inflate(clonedInflater)");
        this.b = c;
        if (c == null) {
            zq3.z("binding");
            c = null;
        }
        ConstraintLayout root = c.getRoot();
        zq3.g(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        b bVar;
        zq3.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (this.d || (bVar = this.c) == null) {
            return;
        }
        bVar.a(InteractionEventSource.PROMPT, null);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Object parent = requireView().getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        BottomSheetBehavior M = BottomSheetBehavior.M((View) parent);
        zq3.g(M, "from(requireView().parent as View)");
        M.t0(3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        l1();
    }
}
