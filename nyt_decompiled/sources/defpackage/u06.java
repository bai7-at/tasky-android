package defpackage;

import com.nytimes.android.messaging.postloginregioffers.model.PostAuthScheduledSku;
import com.nytimes.android.messaging.postloginregioffers.model.PostAuthUrgencyMessage;
import com.nytimes.android.messaging.postloginregioffers.model.PostRegiLoginOfferConfig;
import java.util.Iterator;
import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public abstract class u06 {
    public static final String a(PostRegiLoginOfferConfig postRegiLoginOfferConfig) {
        Object obj;
        String sku;
        zq3.h(postRegiLoginOfferConfig, "<this>");
        List<PostAuthScheduledSku> scheduledSkus = postRegiLoginOfferConfig.getScheduledSkus();
        if (scheduledSkus != null) {
            Iterator<T> it2 = scheduledSkus.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (d((PostAuthScheduledSku) next, 0L, 1, null)) {
                    obj = next;
                    break;
                }
            }
            PostAuthScheduledSku postAuthScheduledSku = (PostAuthScheduledSku) obj;
            if (postAuthScheduledSku != null && (sku = postAuthScheduledSku.getSku()) != null) {
                return sku;
            }
        }
        return postRegiLoginOfferConfig.getSku();
    }

    public static final String b(PostRegiLoginOfferConfig postRegiLoginOfferConfig) {
        Object obj;
        String headline;
        zq3.h(postRegiLoginOfferConfig, "<this>");
        List<PostAuthUrgencyMessage> urgencyMessaging = postRegiLoginOfferConfig.getUrgencyMessaging();
        if (urgencyMessaging != null) {
            Iterator<T> it2 = urgencyMessaging.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (d((PostAuthUrgencyMessage) next, 0L, 1, null) && postRegiLoginOfferConfig.getHasIntroPrice()) {
                    obj = next;
                    break;
                }
            }
            PostAuthUrgencyMessage postAuthUrgencyMessage = (PostAuthUrgencyMessage) obj;
            if (postAuthUrgencyMessage != null && (headline = postAuthUrgencyMessage.getHeadline()) != null) {
                return headline;
            }
        }
        return postRegiLoginOfferConfig.getHeader();
    }

    public static final boolean c(p06 p06Var, long j) {
        zq3.h(p06Var, "<this>");
        return j <= ((long) p06Var.getEndTimeInterval()) && ((long) p06Var.getStartTimeInterval()) <= j;
    }

    public static /* synthetic */ boolean d(p06 p06Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Instant.now().getEpochSecond();
        }
        return c(p06Var, j);
    }
}
