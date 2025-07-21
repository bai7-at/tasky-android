package com.nytimes.android.libs.messagingarchitecture.core;

import com.nytimes.android.libs.messagingarchitecture.model.Message;
import com.nytimes.android.logging.NYTLogger;
import defpackage.b22;
import defpackage.vy8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class MessageActionHandler {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MessageNavigationActions {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ MessageNavigationActions[] $VALUES;
        public static final a Companion;
        private final String uri;
        public static final MessageNavigationActions YOU = new MessageNavigationActions("YOU", 0, "nytimes://reader/you");
        public static final MessageNavigationActions PLAY = new MessageNavigationActions("PLAY", 1, "nytimes://reader/play");
        public static final MessageNavigationActions SECTIONS = new MessageNavigationActions("SECTIONS", 2, "nytimes://reader/sections");

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final MessageNavigationActions a(String str) {
                for (MessageNavigationActions messageNavigationActions : MessageNavigationActions.values()) {
                    if (h.w(messageNavigationActions.name(), str, true)) {
                        return messageNavigationActions;
                    }
                }
                return null;
            }

            private a() {
            }
        }

        private static final /* synthetic */ MessageNavigationActions[] $values() {
            return new MessageNavigationActions[]{YOU, PLAY, SECTIONS};
        }

        static {
            MessageNavigationActions[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
        }

        private MessageNavigationActions(String str, int i, String str2) {
            this.uri = str2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static MessageNavigationActions valueOf(String str) {
            return (MessageNavigationActions) Enum.valueOf(MessageNavigationActions.class, str);
        }

        public static MessageNavigationActions[] values() {
            return (MessageNavigationActions[]) $VALUES.clone();
        }

        public final String getUri() {
            return this.uri;
        }
    }

    private final void b(vy8 vy8Var, String str) {
        MessageNavigationActions a = MessageNavigationActions.Companion.a(str);
        if (a != null) {
            vy8Var.a(a.getUri());
        } else {
            NYTLogger.s(new Exception("Configuration error: navigation action specified but no valid destination provided in message json"));
        }
    }

    private final void c(vy8 vy8Var, String str) {
        if (str != null) {
            vy8Var.a(str);
        } else {
            NYTLogger.s(new Exception("Configuration error: openURL action specified but no URL provided in message json"));
        }
    }

    public final void a(vy8 vy8Var, Message message) {
        String str;
        zq3.h(vy8Var, "uriHandler");
        zq3.h(message, "message");
        if (message.g() != null) {
            String b = message.g().b();
            switch (b.hashCode()) {
                case -1263204667:
                    if (b.equals("openURL")) {
                        c(vy8Var, (String) message.g().c().get("destination"));
                        return;
                    }
                    return;
                case 3522941:
                    str = "save";
                    break;
                case 109400031:
                    str = "share";
                    break;
                case 341203229:
                    str = "subscription";
                    break;
                case 559166607:
                    str = "giftShare";
                    break;
                case 1862666772:
                    if (b.equals("navigation")) {
                        b(vy8Var, (String) message.g().c().get("destination"));
                        return;
                    }
                    return;
                default:
                    return;
            }
            b.equals(str);
        }
    }
}
