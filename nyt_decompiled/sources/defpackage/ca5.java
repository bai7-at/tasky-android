package defpackage;

import com.nytimes.android.api.config.model.Channel;
import com.nytimes.android.push.BreakingNewsAlertManager;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class ca5 {
    private static final List a;
    private static final List b;
    private static final List c;

    static {
        List o = i.o(new NotificationsChannel("tag", BreakingNewsAlertManager.SECTION_TITLE, "Urgent and important stories.", false, (Channel) null, (String) null, 56, (DefaultConstructorMarker) null), new NotificationsChannel("tag2", "Morning Briefing", "What you need to know", false, (Channel) null, (String) null, 56, (DefaultConstructorMarker) null));
        a = o;
        List o2 = i.o(new NotificationsChannel("tag", BreakingNewsAlertManager.SECTION_TITLE, "Urgent and important stories.", false, (Channel) null, (String) null, 56, (DefaultConstructorMarker) null), new NotificationsChannel("tag2", "Morning Briefing", "What you need to know", false, (Channel) null, (String) null, 56, (DefaultConstructorMarker) null));
        b = o2;
        c = i.o(new NotificationsGroupItems("get caught up", o), new NotificationsGroupItems("editors' picks", o2));
    }

    public static final List a() {
        return c;
    }
}
