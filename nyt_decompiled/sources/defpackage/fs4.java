package defpackage;

import com.nytimes.android.libs.messagingarchitecture.model.MessageProperties;
import com.nytimes.android.libs.messagingarchitecture.model.MessageTarget;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import defpackage.at3;
import java.util.List;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalQuery;

/* loaded from: classes4.dex */
public final class fs4 {
    private final DateTimeFormatter a = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    public final String a(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return localDateTime.format(this.a);
        }
        return null;
    }

    public final String b(MessageProperties messageProperties) {
        if (messageProperties == null) {
            return null;
        }
        at3.a aVar = at3.d;
        aVar.a();
        return aVar.b(MessageProperties.Companion.serializer(), messageProperties);
    }

    public final String c(MessageTarget messageTarget) {
        if (messageTarget == null) {
            return null;
        }
        at3.a aVar = at3.d;
        aVar.a();
        return aVar.b(MessageTarget.Companion.serializer(), messageTarget);
    }

    public final String d(List list) {
        if (list != null) {
            return at3.d.b(he0.h(StyledText.Companion.serializer()), list);
        }
        return null;
    }

    public final LocalDateTime e(String str) {
        if (str != null) {
            return (LocalDateTime) this.a.parse(str, new TemporalQuery() { // from class: es4
                @Override // org.threeten.bp.temporal.TemporalQuery
                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                    return LocalDateTime.from(temporalAccessor);
                }
            });
        }
        return null;
    }

    public final MessageProperties f(String str) {
        if (str == null) {
            return null;
        }
        at3.a aVar = at3.d;
        aVar.a();
        return (MessageProperties) aVar.c(he0.u(MessageProperties.Companion.serializer()), str);
    }

    public final MessageTarget g(String str) {
        if (str == null) {
            return null;
        }
        at3.a aVar = at3.d;
        aVar.a();
        return (MessageTarget) aVar.c(he0.u(MessageTarget.Companion.serializer()), str);
    }

    public final List h(String str) {
        if (str != null) {
            return (List) at3.d.c(he0.h(StyledText.Companion.serializer()), str);
        }
        return null;
    }
}
