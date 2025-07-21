package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.nytimes.android.api.config.model.Entitlement;
import com.nytimes.android.api.config.model.MessageTargets;
import com.nytimes.android.api.config.model.TextChunk;
import com.nytimes.android.designsystem.uicompose.ui.NytTextStyle;
import com.nytimes.android.libs.messagingarchitecture.model.MessageEntitlement;
import com.nytimes.android.libs.messagingarchitecture.model.MessageTarget;
import com.nytimes.android.libs.messagingarchitecture.model.Relationship;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;

/* loaded from: classes4.dex */
public abstract class s29 {
    public static final String a(LocalDateTime localDateTime, Context context) {
        zq3.h(localDateTime, "<this>");
        zq3.h(context, "context");
        return DateUtils.formatDateTime(context, localDateTime.toInstant(ZoneOffset.ofTotalSeconds(0)).toEpochMilli(), 524305);
    }

    public static final String b(LocalDateTime localDateTime, Composer composer, int i) {
        zq3.h(localDateTime, "<this>");
        composer.z(462699240);
        if (b.G()) {
            b.S(462699240, i, -1, "com.nytimes.android.libs.messagingarchitecture.utils.formatDateTime (UtilsKtx.kt:52)");
        }
        String a = a(localDateTime, (Context) composer.m(AndroidCompositionLocals_androidKt.g()));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a;
    }

    public static final MessageTarget c(MessageTargets messageTargets) {
        Relationship relationship;
        zq3.h(messageTargets, "<this>");
        Relationship[] values = Relationship.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                relationship = null;
                break;
            }
            relationship = values[i];
            if (zq3.c(relationship.getString(), messageTargets.getRelationship())) {
                break;
            }
            i++;
        }
        if (relationship == null) {
            relationship = Relationship.AND;
        }
        List<Entitlement> entitlements = messageTargets.getEntitlements();
        ArrayList arrayList = new ArrayList(i.w(entitlements, 10));
        for (Entitlement entitlement : entitlements) {
            arrayList.add(new MessageEntitlement(entitlement.getName(), entitlement.getSubscribed()));
        }
        return new MessageTarget(relationship, arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final StyledText d(TextChunk textChunk) {
        zq3.h(textChunk, "<this>");
        String style = textChunk.getStyle();
        switch (style.hashCode()) {
            case -1377687758:
                if (style.equals("button")) {
                    return new StyledText(textChunk.getText(), NytTextStyle.MESSAGE_BUTTON, false, 4, (DefaultConstructorMarker) null);
                }
                break;
            case -1131623053:
                if (style.equals("kicker")) {
                    return new StyledText(textChunk.getText(), NytTextStyle.MESSAGE_KICKER, false, 4, (DefaultConstructorMarker) null);
                }
                break;
            case -1039745817:
                if (style.equals("normal")) {
                    return new StyledText(textChunk.getText(), NytTextStyle.MESSAGE_NORMAL, false, 4, (DefaultConstructorMarker) null);
                }
                break;
            case 3029637:
                if (style.equals("bold")) {
                    return new StyledText(textChunk.getText(), NytTextStyle.MESSAGE_BOLD, false, 4, (DefaultConstructorMarker) null);
                }
                break;
            case 110371416:
                if (style.equals("title")) {
                    return new StyledText(textChunk.getText(), NytTextStyle.MESSAGE_TITLE, false, 4, (DefaultConstructorMarker) null);
                }
                break;
        }
        return new StyledText(textChunk.getText(), NytTextStyle.MESSAGE_ITALIC, false, 4, (DefaultConstructorMarker) null);
    }

    public static final List e(List list) {
        zq3.h(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(d((TextChunk) it2.next()));
        }
        return i.X0(arrayList);
    }
}
