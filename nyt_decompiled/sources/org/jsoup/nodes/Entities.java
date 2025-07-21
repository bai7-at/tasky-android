package org.jsoup.nodes;

import defpackage.o48;
import defpackage.u29;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
public abstract class Entities {
    private static final char[] a = {',', ';'};
    private static final HashMap b = new HashMap();
    private static final Document.OutputSettings c = new Document.OutputSettings();

    enum CoreCharset {
        ascii,
        utf,
        fallback;

        static CoreCharset byName(String str) {
            return str.equals("US-ASCII") ? ascii : str.startsWith("UTF-") ? utf : fallback;
        }
    }

    public enum EscapeMode {
        xhtml(g.a, 4),
        base(g.b, 106),
        extended(g.c, 2125);

        private int[] codeKeys;
        private int[] codeVals;
        private String[] nameKeys;
        private String[] nameVals;

        EscapeMode(String str, int i) {
            Entities.h(this, str, i);
        }

        private int size() {
            return this.nameKeys.length;
        }

        int codepointForName(String str) {
            int binarySearch = Arrays.binarySearch(this.nameKeys, str);
            if (binarySearch >= 0) {
                return this.codeVals[binarySearch];
            }
            return -1;
        }

        String nameForCodepoint(int i) {
            int binarySearch = Arrays.binarySearch(this.codeKeys, i);
            if (binarySearch < 0) {
                return "";
            }
            String[] strArr = this.nameVals;
            if (binarySearch < strArr.length - 1) {
                int i2 = binarySearch + 1;
                if (this.codeKeys[i2] == i) {
                    return strArr[i2];
                }
            }
            return strArr[binarySearch];
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CoreCharset.values().length];
            a = iArr;
            try {
                iArr[CoreCharset.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CoreCharset.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static void b(Appendable appendable, EscapeMode escapeMode, int i) {
        String nameForCodepoint = escapeMode.nameForCodepoint(i);
        if ("".equals(nameForCodepoint)) {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        } else {
            appendable.append('&').append(nameForCodepoint).append(';');
        }
    }

    private static boolean c(CoreCharset coreCharset, char c2, CharsetEncoder charsetEncoder) {
        int i = a.a[coreCharset.ordinal()];
        if (i == 1) {
            return c2 < 128;
        }
        if (i != 2) {
            return charsetEncoder.canEncode(c2);
        }
        return true;
    }

    public static int d(String str, int[] iArr) {
        String str2 = (String) b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int codepointForName = EscapeMode.extended.codepointForName(str);
        if (codepointForName == -1) {
            return 0;
        }
        iArr[0] = codepointForName;
        return 1;
    }

    static void e(Appendable appendable, String str, Document.OutputSettings outputSettings, boolean z, boolean z2, boolean z3) {
        EscapeMode e = outputSettings.e();
        CharsetEncoder d = outputSettings.d();
        CoreCharset coreCharset = outputSettings.d;
        int length = str.length();
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (z2) {
                if (o48.i(codePointAt)) {
                    if ((!z3 || z4) && !z5) {
                        appendable.append(' ');
                        z5 = true;
                    }
                    i += Character.charCount(codePointAt);
                } else {
                    z5 = false;
                    z4 = true;
                }
            }
            if (codePointAt < 65536) {
                char c2 = (char) codePointAt;
                if (c2 != '\"') {
                    if (c2 == '&') {
                        appendable.append("&amp;");
                    } else if (c2 != '<') {
                        if (c2 != '>') {
                            if (c2 != 160) {
                                if (c(coreCharset, c2, d)) {
                                    appendable.append(c2);
                                } else {
                                    b(appendable, e, codePointAt);
                                }
                            } else if (e != EscapeMode.xhtml) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (z) {
                            appendable.append(c2);
                        } else {
                            appendable.append("&gt;");
                        }
                    } else if (!z || e == EscapeMode.xhtml) {
                        appendable.append("&lt;");
                    } else {
                        appendable.append(c2);
                    }
                } else if (z) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c2);
                }
            } else {
                String str2 = new String(Character.toChars(codePointAt));
                if (d.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    b(appendable, e, codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static boolean f(String str) {
        return EscapeMode.base.codepointForName(str) != -1;
    }

    public static boolean g(String str) {
        return EscapeMode.extended.codepointForName(str) != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(EscapeMode escapeMode, String str, int i) {
        int i2;
        escapeMode.nameKeys = new String[i];
        escapeMode.codeVals = new int[i];
        escapeMode.codeKeys = new int[i];
        escapeMode.nameVals = new String[i];
        org.jsoup.parser.a aVar = new org.jsoup.parser.a(str);
        int i3 = 0;
        while (!aVar.t()) {
            String m = aVar.m('=');
            aVar.a();
            int parseInt = Integer.parseInt(aVar.o(a), 36);
            char s = aVar.s();
            aVar.a();
            if (s == ',') {
                i2 = Integer.parseInt(aVar.m(';'), 36);
                aVar.a();
            } else {
                i2 = -1;
            }
            int parseInt2 = Integer.parseInt(aVar.m('&'), 36);
            aVar.a();
            escapeMode.nameKeys[i3] = m;
            escapeMode.codeVals[i3] = parseInt;
            escapeMode.codeKeys[parseInt2] = parseInt;
            escapeMode.nameVals[parseInt2] = m;
            if (i2 != -1) {
                b.put(m, new String(new int[]{parseInt, i2}, 0, 2));
            }
            i3++;
        }
        u29.d(i3 == i, "Unexpected count of entities loaded");
    }
}
