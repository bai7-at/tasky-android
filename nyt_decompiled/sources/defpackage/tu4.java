package defpackage;

import com.nytimes.android.designsystem.uicompose.ui.NytTextStyle;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import com.nytimes.android.libs.messagingarchitecture.model.MessageProperties;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class tu4 {
    private static final Message a;
    private static final Message b;
    private static final Message c;
    private static final Message d;
    private static final Message e;
    private static final Message f;
    private static final Message g;

    static {
        MessageProperties messageProperties = new MessageProperties("", (Map) null, 2, (DefaultConstructorMarker) null);
        MessageProperties messageProperties2 = new MessageProperties("playTab", (Map) null, 2, (DefaultConstructorMarker) null);
        MessageProperties messageProperties3 = new MessageProperties("", (Map) null, 2, (DefaultConstructorMarker) null);
        NytTextStyle nytTextStyle = NytTextStyle.MESSAGE_BOLD;
        StyledText styledText = new StyledText("Add some play to your day.", nytTextStyle, false, 4, (DefaultConstructorMarker) null);
        NytTextStyle nytTextStyle2 = NytTextStyle.MESSAGE_NORMAL;
        a = new Message((String) null, "playTab1_03_2022_high", "playTab1_03_2022", 1, "home", messageProperties2, messageProperties, 0, messageProperties3, false, i.o(styledText, new StyledText(" Tap here to discover our expertly-crafted games in the Play tab.", nytTextStyle2, false, 4, (DefaultConstructorMarker) null)), "New", (MessageProperties) null, "playTab1_03_2022", "", 1, (DefaultConstructorMarker) null);
        b = new Message((String) null, "sectionsTab", "sectionsTab", 2, "home", new MessageProperties("sectionsTab", (Map) null, 2, (DefaultConstructorMarker) null), new MessageProperties("", (Map) null, 2, (DefaultConstructorMarker) null), 0, new MessageProperties("", (Map) null, 2, (DefaultConstructorMarker) null), false, i.e(new StyledText("Tap here to browse sections, play games, and see the Times' most popular articles.", nytTextStyle2, false, 4, (DefaultConstructorMarker) null)), "New", (MessageProperties) null, "sectionsTab", "", 1, (DefaultConstructorMarker) null);
        c = new Message((String) null, "sectionsTab_savedForLater", "sectionsTab", 3, "home", new MessageProperties("sectionsTab", (Map) null, 2, (DefaultConstructorMarker) null), new MessageProperties("", (Map) null, 2, (DefaultConstructorMarker) null), 96, new MessageProperties("", (Map) null, 2, (DefaultConstructorMarker) null), false, i.o(new StyledText("View your saved articles", nytTextStyle, false, 4, (DefaultConstructorMarker) null), new StyledText(" in the sections tab.", nytTextStyle2, false, 4, (DefaultConstructorMarker) null)), "New", (MessageProperties) null, "sectionsTab", "", 1, (DefaultConstructorMarker) null);
        d = new Message((String) null, "sectionsTab_savedForLater", "savedForLater", 4, "home", new MessageProperties("sectionsTab", (Map) null, 2, (DefaultConstructorMarker) null), new MessageProperties("", (Map) null, 2, (DefaultConstructorMarker) null), 96, new MessageProperties("", (Map) null, 2, (DefaultConstructorMarker) null), false, i.o(new StyledText("View your saved articles", nytTextStyle2, false, 4, (DefaultConstructorMarker) null), new StyledText(" somewhere.", NytTextStyle.MESSAGE_ITALIC, false, 4, (DefaultConstructorMarker) null)), "New", (MessageProperties) null, "sectionsTab", "", 1, (DefaultConstructorMarker) null);
        MessageProperties messageProperties4 = new MessageProperties("centerModal", (Map) null, 2, (DefaultConstructorMarker) null);
        NytTextStyle nytTextStyle3 = NytTextStyle.MESSAGE_TITLE;
        StyledText styledText2 = new StyledText("Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum ", nytTextStyle3, false, 4, (DefaultConstructorMarker) null);
        StyledText styledText3 = new StyledText("Dolor sit amet, consectetur adipiscing elit, sed do eiusmod", nytTextStyle2, false, 4, (DefaultConstructorMarker) null);
        NytTextStyle nytTextStyle4 = NytTextStyle.MESSAGE_BUTTON;
        e = new Message((String) null, "button", "centerModal", 1, "home", messageProperties4, (MessageProperties) null, 96, (MessageProperties) null, false, i.o(styledText2, styledText3, new StyledText("Take An Action", nytTextStyle4, false, 4, (DefaultConstructorMarker) null)), "NEW", (MessageProperties) null, "centerModal", "", 1, (DefaultConstructorMarker) null);
        f = new Message((String) null, "button", "centerModal", 1, "home", new MessageProperties("centerModal", (Map) null, 2, (DefaultConstructorMarker) null), (MessageProperties) null, 96, new MessageProperties("giftShare", t.f(du8.a("title", "Take An Action Button"))), false, i.o(new StyledText("Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum ", nytTextStyle3, false, 4, (DefaultConstructorMarker) null), new StyledText("Dolor sit amet, consectetur adipiscing elit, sed do eiusmod", nytTextStyle2, false, 4, (DefaultConstructorMarker) null), new StyledText("Take An Action", nytTextStyle4, false, 4, (DefaultConstructorMarker) null)), "NEW", (MessageProperties) null, "centerModal", "", 1, (DefaultConstructorMarker) null);
        g = new Message((String) null, "noButton", "centerModal", 1, "home", new MessageProperties("centerModal", (Map) null, 2, (DefaultConstructorMarker) null), (MessageProperties) null, 96, (MessageProperties) null, false, i.o(new StyledText("Lorem Ipsum", nytTextStyle3, false, 4, (DefaultConstructorMarker) null), new StyledText("Dolor sit amet, consectetur adipiscing elit, sed do eiusmod", nytTextStyle2, false, 4, (DefaultConstructorMarker) null)), "NEW", (MessageProperties) null, "centerModal", "", 1, (DefaultConstructorMarker) null);
    }

    public static final Message a() {
        return a;
    }
}
