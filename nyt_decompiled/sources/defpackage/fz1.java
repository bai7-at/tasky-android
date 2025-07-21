package defpackage;

import com.nytimes.android.designsystem.text.NytFontSize;
import com.nytimes.android.sectionfront.SectionFrontFragment;

/* loaded from: classes4.dex */
public class fz1 extends SectionFrontFragment {
    @Override // com.nytimes.android.sectionfront.SectionFrontFragment
    protected void p1(qf7 qf7Var) {
        qf7Var.b(getActivity(), um6.SectionFront_LayoutConfig_Email);
        float f = getResources().getConfiguration().fontScale;
        if (qf7Var.a == 3 && (f == NytFontSize.EXTRA_LARGE.getScale() || f == NytFontSize.JUMBO.getScale())) {
            qf7Var.b(getActivity(), um6.SectionFront_LayoutConfig_TwoColumnLayout);
            qf7Var.g = true;
        } else if (qf7Var.a == 2) {
            if (f == NytFontSize.EXTRA_LARGE.getScale() || f == NytFontSize.JUMBO.getScale()) {
                qf7Var.b(getActivity(), um6.SectionFront_LayoutConfig_OneColumnLayout);
                qf7Var.g = true;
            }
        }
    }
}
