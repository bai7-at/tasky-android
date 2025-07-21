package defpackage;

import com.iteratehq.iterate.model.EmbedContext;
import com.iteratehq.iterate.model.Survey;

/* loaded from: classes3.dex */
public interface vr3 {

    public static final class a {
        public static /* synthetic */ void a(vr3 vr3Var, Survey survey, qj qjVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissed");
            }
            if ((i & 2) != 0) {
                qjVar = null;
            }
            vr3Var.k(survey, qjVar);
        }

        public static /* synthetic */ void b(vr3 vr3Var, Survey survey, qj qjVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displayed");
            }
            if ((i & 2) != 0) {
                qjVar = null;
            }
            vr3Var.j(survey, qjVar);
        }
    }

    void i(EmbedContext embedContext, qj qjVar);

    void j(Survey survey, qj qjVar);

    void k(Survey survey, qj qjVar);
}
