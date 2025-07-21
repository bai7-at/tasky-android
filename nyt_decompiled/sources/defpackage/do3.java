package defpackage;

import com.iteratehq.iterate.model.InteractionEventDismissData;
import com.iteratehq.iterate.model.InteractionEventDisplayedData;
import com.iteratehq.iterate.model.InteractionEventResponseData;
import com.iteratehq.iterate.model.InteractionEventSource;
import com.iteratehq.iterate.model.InteractionEventSurveyCompleteData;
import com.iteratehq.iterate.model.InteractionEventTypes;
import com.iteratehq.iterate.model.ProgressEventMessageData;
import com.iteratehq.iterate.model.Question;
import com.iteratehq.iterate.model.Response;
import com.iteratehq.iterate.model.Survey;

/* loaded from: classes3.dex */
public final class do3 {
    public static final do3 a = new do3();

    private do3() {
    }

    public final void a(InteractionEventSource interactionEventSource, Survey survey, ProgressEventMessageData progressEventMessageData) {
        zq3.h(interactionEventSource, "source");
        zq3.h(survey, "survey");
        gt2 a2 = co3.a.a();
        if (a2 != null) {
            a2.invoke(InteractionEventTypes.DISMISS, new InteractionEventDismissData(progressEventMessageData, interactionEventSource, survey));
        }
    }

    public final void b(Survey survey) {
        zq3.h(survey, "survey");
        gt2 a2 = co3.a.a();
        if (a2 != null) {
            a2.invoke(InteractionEventTypes.DISPLAYED, new InteractionEventDisplayedData(InteractionEventSource.PROMPT, survey));
        }
    }

    public final void c(Survey survey, Response response, Question question) {
        zq3.h(survey, "survey");
        if (response == null || question == null) {
            return;
        }
        co3 co3Var = co3.a;
        it2 b = co3Var.b();
        if (b != null) {
            b.invoke(response, question, survey);
        }
        gt2 a2 = co3Var.a();
        if (a2 != null) {
            a2.invoke(InteractionEventTypes.RESPONSE, new InteractionEventResponseData(response, question, survey));
        }
    }

    public final void d(Survey survey) {
        zq3.h(survey, "survey");
        gt2 a2 = co3.a.a();
        if (a2 != null) {
            a2.invoke(InteractionEventTypes.SURVEY_COMPLETE, new InteractionEventSurveyCompleteData(survey));
        }
    }

    public final void e(Survey survey) {
        zq3.h(survey, "survey");
        gt2 a2 = co3.a.a();
        if (a2 != null) {
            a2.invoke(InteractionEventTypes.DISPLAYED, new InteractionEventDisplayedData(InteractionEventSource.SURVEY, survey));
        }
    }
}
